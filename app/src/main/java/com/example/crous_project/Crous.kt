package com.example.crous_project

import java.io.Serializable

data class Crous(
    val id: String,
    val name: String,
    val type: String,
    val zone: String,
    val description: String,
    var favorite: Boolean,
    val linkPhoto: String? = null,
    val latitude: Double,
    val longitude: Double,
    val info: String,
    val adress: String
) : Serializable