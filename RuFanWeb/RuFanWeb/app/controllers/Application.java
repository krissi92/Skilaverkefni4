package controllers;

import is.rufan.user.domain.User;
import play.*;
import play.mvc.*;
import views.html.*;

/**
 *  @(#) Application 23 Oct 2015 Kristján Harðarsson and Þórdís Jóna Jónsdóttir
 *
 *  Extends from controller and renders the index.
 *  This controller was given.
 */
public class Application extends Controller {
    public Result index() {
        return ok(index.render("RuFan"));
    }
}
