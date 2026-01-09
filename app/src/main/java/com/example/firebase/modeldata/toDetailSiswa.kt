package com.example.firebase.modeldata

fun Siswa.toDetailSiswa(): DetailSiswa =
    DetailSiswa(id, nama, alamat, telpon)