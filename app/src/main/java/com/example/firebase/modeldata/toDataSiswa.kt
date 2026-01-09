package com.example.firebase.modeldata

fun DetailSiswa.toDataSiswa(): Siswa =
    Siswa(id, nama, alamat, telpon)