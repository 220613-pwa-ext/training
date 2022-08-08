package com.revature.main;

import io.javalin.Javalin;

public class Driver {

    public static void main(String[] args) {
        Javalin app = Javalin.create((config) -> {
            config.enableCorsForAllOrigins();
        });

        app.get("/test", (ctx) -> {
           ctx.result("Hello world from Java backend application!");
        });

        app.start(8081);
    }

}
