package com.ex2.hiltespresso.ui.profile

import com.ex2.hiltespresso.data.FakeDataRepoImpl
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.core.Is.`is`
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class ProfileViewModelTest {

    lateinit var SUT: ProfileViewModel

    @Before
    fun init() {
        SUT = ProfileViewModel(FakeDataRepoImpl())
    }

    @Test
    fun `Profile fetched from repository`() {
        assertThat("Name consumed from data source", SUT.getProfile().name, `is`("Fake Name"))
    }
}