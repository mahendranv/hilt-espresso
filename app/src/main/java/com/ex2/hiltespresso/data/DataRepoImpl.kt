package com.ex2.hiltespresso.data

import com.ex2.hiltespresso.data.model.Profile
import javax.inject.Inject

class DataRepoImpl @Inject constructor() : DataRepository {

    override fun getProfile(): Profile =
        Profile(name = "Bruce Wayne", age = 42)
}