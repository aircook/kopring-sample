package com.tistory.aircook.kopringsample.controller

import com.tistory.aircook.kopringsample.service.PeopleService
import com.tistory.aircook.kopringsample.entity.People
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.*
import java.util.Optional

@RestController
@RequestMapping("/people")
class PeopleController(val peopleService: PeopleService) {

    val logger: Logger = LoggerFactory.getLogger(PeopleController::class.java)

    @GetMapping
    fun getUser(): Iterable<People> {
        logger.info("getUser mathod call!")
        return peopleService.findAll()
    }
}