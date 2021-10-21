package com.ex2.hiltespresso.di

import com.ex2.hiltespresso.data.DataRepository
import com.ex2.hiltespresso.data.FakeDataRepoImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.testing.TestInstallIn


@TestInstallIn(
    components = [ViewModelComponent::class],
    replaces = [ProfileModule::class]
)
@Module
class FakeProfileModule {

    @Provides
    fun getProfileSource(): DataRepository = FakeDataRepoImpl()

}