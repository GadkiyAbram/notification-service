package com.gyinv.users_service

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Main

fun main(args: Array<String>) {
    runApplication<Main>(*args)

    println("Users service is running...");
}
