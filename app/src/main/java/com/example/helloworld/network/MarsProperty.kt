package com.example.helloworld.network

import com.squareup.moshi.Json


data class MarsProperty(
    val id: String,
    @Json(name = "img_src") val imgSrcUrl: String,
    val type: String,
    val price: Double) {
        val isRental
        get() = type == "rent"

}


