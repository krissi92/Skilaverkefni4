package controllers;

import is.rufan.user.domain.User;
import is.rufan.user.domain.UserRegistration;
import is.rufan.user.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import static play.data.Form.*;
import play.data.*;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.summary;
import views.html.user;

/**
 * @(#)User Controller 25 Oct 2015 Kristján Harðarsson and Þórdís Jóna Jónsdóttir
 *
 * Controller component which handles everything connected to the user.
 * Extends from Controller and uses Bean to access the Team Service and
 * add the information to the database.
 *
 */
public class UserController extends Controller  {
  protected ApplicationContext ctx = new FileSystemXmlApplicationContext("/conf/userapp.xml");
  final UserService userService = (UserService)ctx.getBean("userService");
  final static Form<UserRegistration> accountForm = form(UserRegistration.class);

  /**
   * A function which returns a form to the user like the signup form.
   * Everything that the user has already filled in will be accessed from the
   * database through the User Service and shown on the form.
   *
   * @return the filled user form with information from the database
   */
  public Result getUserProfile() {
    String username = session("username");

    // User is logged in
    if(username != null) {
      User currentUser = userService.getUserByUsername(username);

      UserRegistration userAccount = new UserRegistration();
      userAccount.setId(currentUser.getId());
      userAccount.setUsername(currentUser.getUsername());
      userAccount.setName(currentUser.getName());
      userAccount.setEmail(currentUser.getEmail());
      userAccount.setPassword(currentUser.getPassword());
      userAccount.setFavoriteTeam(currentUser.getFavoriteTeam());
      userAccount.setCardType(currentUser.getCardType());
      userAccount.setCardNumber(currentUser.getCardNumber());
      userAccount.setCardExpirationDate(currentUser.getCardExpirationDate());

      Form<UserRegistration> filledForm = accountForm.fill(userAccount);
      return ok(user.render(filledForm));
    }
    // If the user is not logged he is redirected to the login page.
    else {
      return redirect("/login");
    }
  }

  /**
   * A function which updates the user profile if the information is valid.
   * It is not possible to change the username. Redirects the user to the
   * user page which now has an updated user form.
   *
   * @return redirect to the user page that is now updated if the form was valid.
   * Else returns Bad Request with the form without the changes.
   */
  public Result postUserProfile() {
    Form<User> userForm = form(User.class);
    Form<User> updatedForm = userForm.bindFromRequest();
    UserService userService = (UserService) ctx.getBean("userService");
    User oldUser = userService.getUserByUsername(session("username"));

    if (updatedForm.field("password").value().equals((updatedForm.field("repeatPassword").value()))) {
      updatedForm.reject("password", "Passwords must match");
    }
    if (updatedForm.field("password").value().length() < 6) {
      updatedForm.reject("password", "Passwords must be at least 6 letters");
    }
    if (updatedForm.hasErrors()) {
      return redirect("/user");
      //return badRequest(user.render(accountForm)); ?????
    }
    else {
      User currentUser = updatedForm.get();
      currentUser.setId(oldUser.getId());
      currentUser.setUsername((oldUser.getUsername()));
      // If password entered is less than 6 letters than do not change it, else change
      // Example if the user did not enter any password.
      currentUser.setPassword((currentUser.getPassword().length() < 6 ? oldUser.getPassword() : currentUser.getPassword()));
      userService.modifyUser(currentUser);
      return redirect("/user");
    }
  }
}
