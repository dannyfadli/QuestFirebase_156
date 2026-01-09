package com.example.firebase.repositori

import android.app.Application
import com.example.firebase.repositori.container.ContainerApp
import com.example.firebase.repositori.container.DefaultContainerApp


class AplikasiDataSiswa : Application() {
    lateinit var container: ContainerApp

    override fun onCreate() {
        super.onCreate()
        this.container = DefaultContainerApp()
    }
}