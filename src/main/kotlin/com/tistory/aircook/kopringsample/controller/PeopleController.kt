package com.tistory.aircook.kopringsample.controller

import com.tistory.aircook.kopringsample.service.PeopleService
import com.tistory.aircook.kopringsample.domain.People
import com.tistory.aircook.kopringsample.domain.PeopleDto
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/people")
class PeopleController(val peopleService: PeopleService) {

    val logger: Logger = LoggerFactory.getLogger(PeopleController::class.java)

    @GetMapping
    fun findAll(): Iterable<People> {
        logger.debug("findAll")
        return peopleService.findAll()
    }

    @GetMapping("/{id}")
    fun findById(@PathVariable("id") id: Long): PeopleDto {
        logger.debug("findById, id is [{}]", id)
        return peopleService.findById(id)
    }

    @GetMapping("/search")
    fun findByName(@RequestParam(required = false) name: String): People? {
        logger.debug("findByName, id name [{}]", name)
        return peopleService.findByName(name)
    }

}