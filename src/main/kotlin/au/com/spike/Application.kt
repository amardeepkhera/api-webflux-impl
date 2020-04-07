package au.com.spike

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Application

fun main(arg: Array<String>) {
    runApplication<Application>(*arg)
}