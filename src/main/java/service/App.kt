package service

import io.javalin.Javalin
import io.javalin.apibuilder.ApiBuilder.*
import service.controllers.UserController

fun main() {
    val app = Javalin.create()

    app.routes {
        path("users") {
            get(UserController::getAllUsers)
            post(UserController::createUser)
            path(":id") {
                get(UserController::getUser)
            }
        }
    }

    app.start()
}

