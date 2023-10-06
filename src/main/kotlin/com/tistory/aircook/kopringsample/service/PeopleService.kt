package com.tistory.aircook.kopringsample.service

import com.tistory.aircook.kopringsample.domain.People
import com.tistory.aircook.kopringsample.domain.PeopleDto
import com.tistory.aircook.kopringsample.repository.PeopleRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class PeopleService(val peopleRepository: PeopleRepository) {

    fun findAll(): MutableIterable<People> {
        return peopleRepository.findAll()
    }

    fun findById(id: Long): PeopleDto {
        //Optional 을 사용하기 않기 위해 findByIdOrNull 사용
        //return peopleRepository.findById(id)
        //return peopleRepository.findByIdOrNull(id)

        //DTO 리턴하기 위해 Entity --> DTO 변환인데 Nullable 처리가 이게 맞나?
        //var peopleDto = PeopleDto()
        //peopleRepository.findByIdOrNull(id)?.let { peopleDto = PeopleDto.fromEntity(it) }?: run{ peopleDto = PeopleDto()}
        //return peopleDto

        peopleRepository.findByIdOrNull(id)?.let { return PeopleDto.fromEntity(it) } ?: run { return PeopleDto() }
    }

    fun findByName(name: String): People? {
        return peopleRepository.findByName(name)
    }
}