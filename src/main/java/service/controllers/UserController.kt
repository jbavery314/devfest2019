package service.controllers

import io.javalin.http.Context
import io.javalin.http.Handler
import service.model.User

object UserController {

    fun getAllUsers(ctx: Context) {
        ctx.json(users)
    }

    fun getUser(ctx: Context) {
        ctx.json(users.first { it.userid == ctx.pathParam("id").toIntOrNull() })
    }

    fun createUser(ctx: Context) {
        val user = ctx.body<User>()
        println(user)
        ctx.json(user)
    }


    private val users = listOf(
            User(1, "John", "Smith", "123 Sesame St.", 21, "867-5309"),
            User(2, "Apollo", "Creed", "54 Rocky Way", 80, "555-5555")
    )
}