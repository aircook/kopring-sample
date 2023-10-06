package com.tistory.aircook.kopringsample.controller

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.util.StringUtils
import org.springframework.web.bind.annotation.*
import java.nio.file.Paths
import java.util.*


@RestController
@RequestMapping("/user")
class UserController {

    val logger: Logger = LoggerFactory.getLogger(UserController::class.java)

    @GetMapping
    fun getUser(@RequestParam(required = false) name: Optional<String>): String {
        return "Hello ${name.orElse("World")}"
    }

    @GetMapping("/{idx}")
    fun getUserDetail(@PathVariable("idx") idx: Int): String {
        return "Hello User Detail $idx"
    }

    @GetMapping( "/path")
    fun getPath(): Map<String, String> {

        logger.debug("path is [{}]", Paths.get("").toAbsolutePath().toString())
        logger.debug("path is [{}]", Paths.get("./src").toAbsolutePath().toString())
        logger.debug("path is [{}]", StringUtils.cleanPath(Paths.get("./src").toAbsolutePath().toString()))
        logger.debug("path is [{}]", StringUtils.cleanPath(Paths.get("D:/project/test/kopring-sample/src/test/kotlin//com").toAbsolutePath().toString()))

        return mapOf(
            "" to Paths.get("").toAbsolutePath().toString(),
            "./src" to Paths.get("./src").toAbsolutePath().toString(),
            "./src (clean path)" to StringUtils.cleanPath(Paths.get("./src").toAbsolutePath().toString()),
            "D:/project/test/kopring-sample/src/test/kotlin//com" to StringUtils.cleanPath(Paths.get("D:/project/test/kopring-sample/src/test/kotlin//com").toAbsolutePath().toString())
            )

    }

}