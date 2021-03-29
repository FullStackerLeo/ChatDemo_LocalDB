package com.maxi.chatdemo.room;

import androidx.annotation.NonNull;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface TranscriptDao {
    @Insert
    void insert(Transcript transcript);

    @Update
    void update(Transcript transcript);

    @Delete
    void delete(Transcript transcript);

    @Query("DELETE FROM transcript")
    void deleteAll();

    @Query("SELECT * FROM TRANSCRIPT ORDER BY ID DESC")
    List<Transcript> getAll();

}