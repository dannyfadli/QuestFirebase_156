package com.example.firebase.repositori.container

import com.example.firebase.repositori.FirebaseRepositorySiswa
import com.example.firebase.repositori.RepositorySiswa

class DefaultContainerApp : ContainerApp {
    override val repositorySiswa: RepositorySiswa by lazy {
        FirebaseRepositorySiswa()
    }
}