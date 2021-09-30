package com.ex2.hiltespresso.data

import com.ex2.hiltespresso.data.model.Profile

interface DataRepository {

    fun getProfile(): Profile
}