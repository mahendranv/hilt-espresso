package com.ex2.hiltespresso.data

import com.ex2.hiltespresso.data.model.Profile

class DataRepoImpl : DataRepository {

    override fun getProfile(): Profile =
        Profile(name = "Bruce Wayne", age = 42)
}