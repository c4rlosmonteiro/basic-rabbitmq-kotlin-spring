package br.com.cam.rabbitmq.producer.producer

import org.springframework.amqp.rabbit.core.RabbitTemplate
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Service

/**
 * @author Carlos Monteiro
 */
@Service
class HelloRabbitmqProducer(val rabbitTemplate: RabbitTemplate) {
    @Scheduled(fixedDelay = 500)
    fun sayHello(name: String) {
        //course.hello is the name of queue earlier created.
        rabbitTemplate.convertAndSend("course.hello","Hello $name!")
    }
}