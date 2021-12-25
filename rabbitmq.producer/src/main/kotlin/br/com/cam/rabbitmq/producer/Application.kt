package br.com.cam.rabbitmq.producer

import br.com.cam.rabbitmq.producer.entity.Employee
import br.com.cam.rabbitmq.producer.producer.EmployeeJsonProducer
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.time.LocalDate
import java.util.*

@SpringBootApplication
class Application(val employeeJsonProducer: EmployeeJsonProducer) : CommandLineRunner {
	override fun run(vararg args: String?) {
		(0 .. 5).forEach {
			employeeJsonProducer.sendMessage(Employee(Random().nextInt().toString(), "Bob $it", LocalDate.now()))
		}
	}
}

fun main(args: Array<String>) {
	runApplication<Application>(*args)
}
