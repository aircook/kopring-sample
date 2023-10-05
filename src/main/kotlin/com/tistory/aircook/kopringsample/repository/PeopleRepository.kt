package com.tistory.aircook.kopringsample.repository

import com.tistory.aircook.kopringsample.entity.People
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

//@Repository
interface PeopleRepository : CrudRepository<People, Long> {

    //return Nullable
    fun findByName(name: String): People?
}