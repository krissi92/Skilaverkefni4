package controllers;

import is.rufan.user.data.UserNotFoundException;
import is.rufan.user.domain.User;
import is.rufan.user.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import play.data.*;
import play.mvc.*;

import static play.data.Form.form;

import views.html.index;
import views.html.login;

/**
 *  @(#) Login Controller 23 Oct 2015 Kristján Harðarsson and Þórdís Jóna Jónsdóttir
 *
 *  Controller component which handles everything connected to logging in the user.
 *  Extends from Controller and uses Bean to access the Login Service.
 *  This code was given.
 */
public class LoginController extends UserController {
  protected ApplicationContext ctx = new FileSystemXmlApplicationContext("/conf/userapp.xml");
  final static Form<User> loginForm = form(User.class);

  /**
   *  Renders the login form to the user.
   *  @return the login form to the index
   */
  public Result blank() {
    return ok(login.render(loginForm));
  }

  /**
   *  A function with logs the user in if the information is valid,
   *  If the information is valid it renders the home page
   *  else it redirects the user back to the login.
   *
   *  @return if the user successfully signed in the function
   *  renders the home page. If there were errors on the form it
   *  returns Bad Request with the form without the changes if
   *  the user is not signed in it redirects the user to the front page.
   */
  public Result login() {
    Form<User> filledForm = loginForm.bindFromRequest();
    UserService service = (UserService) ctx.getBean("userService");

    User user = service.getUserByUsername(filledForm.field("username").value());
    if (user == null)  {
      filledForm.reject("password", "User not found or incorrect password entered.");
      return badRequest(login.render(filledForm));
    }
    if (!user.getPassword().equals(filledForm.field("password").value())) {
      filledForm.reject("password", "User not found or incorrect password entered.");
      return badRequest(login.render(filledForm));
    }

    session("username", user.getUsername());
    session("displayName", user.getName());

    if (session().get("username") != null) {
      return ok(index.render("Home"));
    }
    else {
      return redirect("/");
    }
  }

  /**
   *  Logs the user out by clearing the session and
   *  redirects the user to the index.
   *  @return redirects the user to the index
   */
  public Result logout() {
    session().clear();
    return redirect("/");
  }
}
