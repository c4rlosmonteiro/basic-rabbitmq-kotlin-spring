package br.com.cam.rabbitmq.consumer.config

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.json.JsonMapper
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 * @author Carlos Monteiro
 */
@Configuration
class RabbitmqConfig {
    @Bean
    fun getObjectMapper(): ObjectMapper {
        return JsonMapper.builder().findAndAddModules().build()
    }
}