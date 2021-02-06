package com.example

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.context.annotation.Import
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication(exclude = [DataSourceAutoConfiguration::class])
@Import(PropertyPlaceholderAutoConfiguration::class)
@EnableScheduling
@EnableBatchProcessing
open class KotlinProblemApplication() {}

fun main(args: Array<String>) {
    SpringApplication.run(KotlinProblemApplication::class.java, *args)
}
