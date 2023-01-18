package com.data.nats

import com.data.model.Message
import io.micronaut.nats.annotation.NatsClient
import io.micronaut.nats.annotation.Subject

@NatsClient
interface NatsService {

    @Subject("message")
    fun sendMessage(message: Message)
}