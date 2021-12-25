package br.com.cam.rabbitmq.producer.producer

import br.com.cam.rabbitmq.producer.entity.Employee
import com.fasterxml.jackson.databind.ObjectMapper
import org.slf4j.LoggerFactory
import org.springframework.amqp.rabbit.core.RabbitTemplate
import org.springframework.stereotype.Service

/**
 * @author Carlos Monteiro
 */
@Service
class EmployeeJsonProducer(private val rabbitTemplate: RabbitTemplate,
                           private val objectMapper: ObjectMapper) {

    private val logger = LoggerFactory.getLogger(EmployeeJsonProducer::class.java)

    fun sendMessage(employee: Employee) {
        val json = objectMapper.writeValueAsString(employee)
        logger.info("Send json: $json")
        rabbitTemplate.convertAndSend("course.employee", json)
    }
}