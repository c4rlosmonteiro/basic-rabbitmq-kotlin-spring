package br.com.cam.rabbitmq.consumer.consumer

import org.slf4j.LoggerFactory
import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.stereotype.Service

/**
 * @author Carlos Monteiro
 */
@Service
class FixedRateConsumer {
    private val logger = LoggerFactory.getLogger(FixedRateConsumer::class.java)

    @RabbitListener(queues = ["course.fixedrate"], concurrency = "3")
    fun listen(message: String) {
        Thread.sleep(2000);
        logger.info("{}: Consuming '{}'.", Thread.currentThread().name, message)
    }
}