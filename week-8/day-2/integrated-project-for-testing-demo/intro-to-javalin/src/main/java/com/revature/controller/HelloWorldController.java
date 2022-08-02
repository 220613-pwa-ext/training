package com.revature.controller;

import com.revature.model.User;
import io.javalin.Javalin;
import io.javalin.http.Context;

public class HelloWorldController implements Controller {
    @Override
    public void mapEndpoints(Javalin app) {
        // Mapping GET endpoint to the Javalin object
        // Takes 2 arguments: URI, Handler object
        // Handler is a functional interface (an interface with a single abstract method)
        // We can utilize lambdas to implement that functional interface
        // The lambda represents the code that we will execute whenever an HTTP request is received
        app.get("/hello", (Context ctx) -> {
            // The Handler lambda has a parameter of the type "Context"
            // This provides the ability to extract information from the HTTP request
            // AND to provide appropriate data (headers, body) and status codes in the response
            User user = new User(1, "test", "testing123", "test@email.com");
            ctx.json(user);
            ctx.status(200);
        });
    }
}
