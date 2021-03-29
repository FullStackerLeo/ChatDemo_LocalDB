package com.maxi.chatdemo.room;

import android.content.Context;
import android.util.Log;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Transcript.class}, version = 1, exportSchema = false)
public abstract class RoomDB extends RoomDatabase {
    private static final String LOG_TAG = RoomDB.class.getSimpleName();
    private static final String DATABASE_NAME = "uRoomDB";

    private static RoomDB sInstance;
    public  static synchronized RoomDB getDatabase(Context context) {
        if (sInstance == null) {
            Log.d(LOG_TAG, "Creating new database instance");
            sInstance = Room.databaseBuilder(context.getApplicationContext(),
                    RoomDB.class, RoomDB.DATABASE_NAME)
                    .build();
        }
        Log.d(LOG_TAG, "Getting the database instance");
        return sInstance;
    }

    public abstract TranscriptDao transcriptDao();
}