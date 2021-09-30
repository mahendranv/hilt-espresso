package com.ex2.hiltespresso.ui.profile

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.ex2.hiltespresso.data.DataRepository
import com.ex2.hiltespresso.data.model.Profile

class ProfileViewModel(private val repo: DataRepository) : ViewModel() {

    fun getProfile(): Profile = repo.getProfile()

    class Factory(private val repo: DataRepository) : ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return ProfileViewModel(repo) as T
        }
    }
}