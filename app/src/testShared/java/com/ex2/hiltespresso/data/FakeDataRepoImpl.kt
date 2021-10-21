package com.ex2.hiltespresso.data

import com.ex2.hiltespresso.data.model.Profile

class FakeDataRepoImpl : DataRepository {

    override fun getProfile(): Profile =
        Profile(name = "Fake Name", age = 43)
}