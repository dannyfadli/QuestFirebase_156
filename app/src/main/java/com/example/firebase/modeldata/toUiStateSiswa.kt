package com.example.firebase.modeldata

fun Siswa.toUiStateSiswa(
    isEntryValid: Boolean = false
): UIStateSiswa =
    UIStateSiswa(
        detailSiswa = this.toDetailSiswa(),
        isEntryValid = isEntryValid
    )