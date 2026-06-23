package com.example.myapplication.data.repository

import com.example.myapplication.data.local.PhotoDetailsDao
import com.example.myapplication.data.local.PhotoDetailsEntity

class PhotoRepository(private val photoDetailsDao: PhotoDetailsDao) {

    /**
     * This is an example of how you would save the data after fetching it from Unsplash.
     * You can verify the data in Android Studio via:
     * App Inspection -> Database Inspector -> photo_database
     */
    suspend fun savePhotoDetails(entity: PhotoDetailsEntity) {
        photoDetailsDao.insertPhotoDetails(entity)
    }

    suspend fun getPhotoDetails(id: String): PhotoDetailsEntity? {
        return photoDetailsDao.getPhotoDetailsById(id)
    }
}
