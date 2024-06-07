package com.example.notes.presentation

import com.example.notes.data.Note

sealed interface NotesEvent {
    data class DeleteNote(val note:Note):NotesEvent

    data class SaveNote(
        val title:String,
        val disp:String
    ):NotesEvent
}