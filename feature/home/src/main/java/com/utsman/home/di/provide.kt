package com.utsman.home.di

import com.utsman.abstraction.di.Module
import com.utsman.data.repository.AppsRepository
import com.utsman.data.repository.CategoriesRepository
import com.utsman.home.domain.HomeUseCase
import com.utsman.home.viewmodel.HomeViewModel

fun provideHomeUseCase(appsRepository: AppsRepository, categoriesRepository: CategoriesRepository): Module<HomeUseCase> {
    val data = HomeUseCase(appsRepository, categoriesRepository)
    return Module(data)
}

fun provideHomeViewModel(homeUseCase: HomeUseCase): Module<HomeViewModel> {
    val data = HomeViewModel(homeUseCase)
    return Module(data)
}