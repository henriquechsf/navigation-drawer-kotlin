package com.example.listacontatos

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

// serializa a classe para passar pro Intent
@Parcelize
data class Contact(
    var name: String,
    var phone: String,
    var photograph: String
) : Parcelable
