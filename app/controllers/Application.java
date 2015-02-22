package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import play.mvc.BodyParser;
import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }

    public static Result menu() {
            return ok(menu.render("Your new application is ready."));
        }

}
