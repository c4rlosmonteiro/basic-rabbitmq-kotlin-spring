package br.com.cam.rabbitmq.producer

import br.com.cam.rabbitmq.producer.producer.HelloRabbitmqProducer
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Application(@Autowired val helloRabbitmqProducer: HelloRabbitmqProducer) : CommandLineRunner {
	override fun run(vararg args: String?) {
		(0 .. 3).forEach { _ ->
			helloRabbitmqProducer.sayHello("my message ${Math.random()}")
		}
	}
}

fun main(args: Array<String>) {
	runApplication<Application>(*args)
}
