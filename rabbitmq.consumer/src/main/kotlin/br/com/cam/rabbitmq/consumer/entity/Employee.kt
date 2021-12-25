package br.com.cam.rabbitmq.consumer.entity

import com.fasterxml.jackson.annotation.JsonFormat
import java.time.LocalDate

/**
 * @author Carlos Monteiro
 */
data class Employee(val id: String, val name: String, @JsonFormat(pattern = "yyyy-MM-dd") val birth: LocalDate)