package com.gyinv.notification_service.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/users")
class NotificationController {

    @GetMapping("/hello")
    fun hello(): String {
        return "Hello from Notification Service 👋"
    }
}