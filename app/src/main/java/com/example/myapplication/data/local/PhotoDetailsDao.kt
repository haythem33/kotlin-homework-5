package com.example.myapplication.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface PhotoDetailsDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertPhotoDetails(photo: PhotoDetailsEntity)

    @Query("SELECT * FROM photo_details WHERE id = :photoId")
    suspend fun getPhotoDetailsById(photoId: String): PhotoDetailsEntity?
}
