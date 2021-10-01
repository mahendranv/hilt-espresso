package com.ex2.hiltespresso.di

import com.ex2.hiltespresso.data.DataRepoImpl
import com.ex2.hiltespresso.data.DataRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@InstallIn(ViewModelComponent::class)
@Module
abstract class ProfileModule {

    @Binds
    abstract fun getProfileSource(repo: DataRepoImpl): DataRepository
}