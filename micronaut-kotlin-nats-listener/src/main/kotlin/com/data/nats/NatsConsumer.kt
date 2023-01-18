package com.data.nats

import com.data.model.Message
import io.micronaut.nats.annotation.NatsListener
import io.micronaut.nats.annotation.Subject

@NatsListener
class NatsConsumer {

    @Subject("message")
    fun receiveMessage(message: Message){
        println("Message: $message")
    }
}