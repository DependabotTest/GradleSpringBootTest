package com.example.gradle_spring_boot_test

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GradleSpringBootTestApplication

fun main(args: Array<String>) {
    runApplication<GradleSpringBootTestApplication>(*args)
}
