package br.com.cam.rabbitmq.producer

import br.com.cam.rabbitmq.producer.producer.FixedRateProducer
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

@EnableScheduling
@SpringBootApplication
class Application : CommandLineRunner {
	override fun run(vararg args: String?) {

	}
}

fun main(args: Array<String>) {
	runApplication<Application>(*args)
}
