package com.tistory.aircook.kopringsample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
//@EnableJpaRepositories("com.tistory.aircook.kopringsample.repository")
//@EntityScan("com.tistory.aircook.playground.entity")
//@ComponentScan("com.tistory.aircook.kopringsample")
class KopringSampleApplication

fun main(args: Array<String>) {
    runApplication<KopringSampleApplication>(*args)
}
