package com.data.controller

import com.data.model.Message
import com.data.nats.NatsService
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post

@Controller
class MessageController (private val natsService: NatsService){

    @Post
     fun sendMessage(@Body message: Message){
         natsService.sendMessage(message)
     }
}