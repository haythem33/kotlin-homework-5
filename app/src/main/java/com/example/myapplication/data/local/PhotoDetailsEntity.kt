package com.example.myapplication.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "photo_details")
data class PhotoDetailsEntity(
    @PrimaryKey val id: String,
    val imageUrl: String,
    val location: String,
    val username: String,
    val userProfileImageUrl: String,
    val cameraModel: String,
    val aperture: String,
    val focalLength: String,
    val shutterSpeed: String,
    val iso: String,
    val dimensions: String,
    val views: String,
    val downloads: String,
    val likes: String,
    val tags: List<String>
)
