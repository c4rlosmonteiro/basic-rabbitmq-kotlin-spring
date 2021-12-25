package br.com.cam.rabbitmq.consumer

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Application : CommandLineRunner {
	override fun run(vararg args: String?) {
		println("Rabbitmq consumer service")
	}
}

fun main(args: Array<String>) {
	runApplication<Application>(*args)
}