package br.com.cam.rabbitmq.producer.producer

import org.slf4j.LoggerFactory
import org.springframework.amqp.rabbit.core.RabbitTemplate
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Service

/**
 * @author Carlos Monteiro
 */
@Service
class FixedRateProducer(val rabbitTemplate: RabbitTemplate) {
    private var index = 0
    private val logger = LoggerFactory.getLogger(FixedRateProducer::class.java)

    @Scheduled(fixedDelay = 500)
    fun sendMessage() {
        logger.info("index is {}", index)
        rabbitTemplate.convertAndSend("course.fixedrate","Message $index!")
        index += 1
    }
}