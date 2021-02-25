package com.example.zvexample.room.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class UserEntity(
    @PrimaryKey
    var id: String,
    var name: String?,
    var surName: String?
)