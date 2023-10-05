package com.tistory.aircook.kopringsample.service

import com.tistory.aircook.kopringsample.entity.People
import com.tistory.aircook.kopringsample.repository.PeopleRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class PeopleService(val peopleRepository: PeopleRepository) {

    fun findAll(): MutableIterable<People> {
        return peopleRepository.findAll()
    }

    fun findById(id: Long): People? {
        //Optional 을 사용하기 않기 위해 findByIdOrNull 사용
        //return peopleRepository.findById(id)
        return peopleRepository.findByIdOrNull(id)
    }

    fun findByName(name: String): People? {
        return peopleRepository.findByName(name)
    }
}