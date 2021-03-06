package com.konifar.materialcat._di

import com.konifar.materialcat.MainApplication
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = arrayOf(
        ApplicationModule::class,
        InfraModule::class,
        RepositoryModule::class
))
interface ApplicationComponent {

    fun inject(application: MainApplication)

    fun plus(activityModule: ActivityModule, useCaseModule: UseCaseModule): ActivityComponent

    fun plus(fragmentModule: FragmentModule, useCaseModule: UseCaseModule): FragmentComponent

}