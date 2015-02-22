package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import play.mvc.BodyParser;
import play.*;
import play.mvc.*;

import views.html.*;
import play.data.Form.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }

    public static Result menu() {
            return ok(menu.render("Menu"));
        }

    public static Result location(){

            return ok(location.render("Location"));

    }
    public static Result kitchen(){

                return ok(kitchen.render("Kitchen"));

        }

}

