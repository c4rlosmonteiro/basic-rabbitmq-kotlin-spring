package br.com.cam.rabbitmq.consumer.consumer

import br.com.cam.rabbitmq.consumer.entity.Employee
import com.fasterxml.jackson.databind.ObjectMapper
import org.slf4j.LoggerFactory
import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.stereotype.Service

/**
 * @author Carlos Monteiro
 */
@Service
class EmployeeConsumer(private val objectMapper: ObjectMapper) {
    private val logger = LoggerFactory.getLogger(EmployeeConsumer::class.java)

    @RabbitListener(queues = ["course.employee"])
    fun listen(message: String) {
        val employee = objectMapper.readValue(message, Employee::class.java)
        logger.info(employee.toString())
    }
}