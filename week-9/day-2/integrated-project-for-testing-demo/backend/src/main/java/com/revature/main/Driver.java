package com.revature.main;

import com.revature.controller.AuthenticationController;
import com.revature.controller.Controller;
import com.revature.controller.HelloWorldController;
import com.revature.dao.UserDao;
import com.revature.model.User;
import com.revature.utility.ConnectionUtility;
import io.javalin.Javalin;
import io.javalin.http.Context;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Driver {

    public static void main(String[] args) {
        Javalin app = Javalin.create(config -> {
            config.enableCorsForAllOrigins();
        });

        // Controller is an abstract datatype (interface)
        // Controller defines an abstract method "mapEndpoints"
        Controller[] controllers = { new HelloWorldController(), new AuthenticationController() };

        for (int i = 0; i < controllers.length; i++) {
            controllers[i].mapEndpoints(app); // Runtime polymorphism
        }

        app.start(8080);
    }

}
