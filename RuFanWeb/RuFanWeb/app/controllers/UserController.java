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
import views.html.user;

public class UserController extends Controller  {
  protected ApplicationContext ctx = new FileSystemXmlApplicationContext("/conf/userapp.xml");
  final UserService userService = (UserService)ctx.getBean("userService");
  final static Form<UserRegistration> accountForm = form(UserRegistration.class);

  public Result getUserProfile() {
    String username = session("username");

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
    else {
      return null;
    }
  }
}
