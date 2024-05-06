package org.bytx.todoapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ToAppApplication

fun main(args: Array<String>) {
    runApplication<ToAppApplication>(*args)
}
