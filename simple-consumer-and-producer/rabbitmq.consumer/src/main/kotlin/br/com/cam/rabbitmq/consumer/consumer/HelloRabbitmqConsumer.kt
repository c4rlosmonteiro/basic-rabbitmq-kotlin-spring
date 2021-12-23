package br.com.cam.rabbitmq.consumer.consumer

import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.stereotype.Service

/**
 * @author Carlos Monteiro
 */
@Service
class HelloRabbitmqConsumer {
    @RabbitListener(queues = ["course.hello"])
    fun listen(message: String) {
        println("Consuming... '$message'")
    }
}