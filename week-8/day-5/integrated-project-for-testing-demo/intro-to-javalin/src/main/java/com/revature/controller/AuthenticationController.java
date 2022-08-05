package com.revature.controller;

import com.revature.exceptions.InvalidLoginException;
import com.revature.model.User;
import com.revature.service.AuthenticationService;
import io.javalin.Javalin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class AuthenticationController implements Controller {

    private AuthenticationService authService;

    public AuthenticationController() {
        this.authService = new AuthenticationService();
    }

    @Override
    public void mapEndpoints(Javalin app) {
        app.post("/login", ctx -> {
            User user = ctx.bodyAsClass(User.class); // takes JSON and places it into a newly instantiated User object

            String username = user.getUsername();
            String password = user.getPassword();

            try {
                User loggedInUser = authService.login(username, password);

                HttpServletRequest req = ctx.req;
                HttpSession session = req.getSession();
                session.setAttribute("logged_in_user", loggedInUser);

                ctx.json(loggedInUser);
            } catch (InvalidLoginException e) {
                ctx.result(e.getMessage());
                ctx.status(400);
            }

        });

        app.post("/logout", ctx -> {
            HttpServletRequest req = ctx.req;

            HttpSession session = req.getSession();
            session.invalidate();
        });

        app.get("/current-user", ctx -> {
            HttpServletRequest req = ctx.req;

            HttpSession session = req.getSession();
            User myUser = (User) session.getAttribute("logged_in_user"); // Downcast the Object return type to User
            // The underlying object is still a User object

            if (myUser == null) {
                ctx.result("You are not logged in!");
                ctx.status(404);
            } else {
                ctx.json(myUser);
                ctx.status(200);
            }
        });
    }

}
