package com.tistory.aircook.kopringsample.service

import com.tistory.aircook.kopringsample.entity.People
import com.tistory.aircook.kopringsample.repository.PeopleRepository
import org.springframework.stereotype.Service

@Service
class PeopleService(val peopleRepository: PeopleRepository) {

    fun findAll(): MutableIterable<People> {
        return peopleRepository.findAll()
    }
}