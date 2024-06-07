package com.example.notes.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Note(
    val title: String,
    val disp: String,
    val dateAdded: Long,
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0
)
