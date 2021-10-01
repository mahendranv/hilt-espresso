package com.ex2.hiltespresso.ui.profile

import androidx.lifecycle.ViewModel
import com.ex2.hiltespresso.data.DataRepository
import com.ex2.hiltespresso.data.model.Profile
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ProfileViewModel @Inject constructor(
    private val repo: DataRepository
) : ViewModel() {

    fun getProfile(): Profile = repo.getProfile()

}