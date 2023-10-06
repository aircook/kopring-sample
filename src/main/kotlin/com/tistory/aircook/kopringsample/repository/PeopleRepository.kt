package com.tistory.aircook.kopringsample.repository

import com.tistory.aircook.kopringsample.domain.People
import org.springframework.data.repository.CrudRepository

//@Repository
interface PeopleRepository : CrudRepository<People, Long> {

    //return Nullable
    fun findByName(name: String): People?
}