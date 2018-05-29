package com.mittas.notes.data;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

import static android.arch.persistence.room.OnConflictStrategy.REPLACE;

@Dao
public interface NoteDao {

    @Query("SELECT * FROM notes")
    LiveData<List<Note>> getAllNotes();

    @Query("SELECT * FROM notes WHERE id = :id")
    LiveData<Note> getNoteById(int id);

    @Insert(onConflict = REPLACE)
    void insertNote(Note note);

    @Update
    void updateNotes(Note... notes);

    @Delete
    void deleteNotes(Note... notes);

}
