package com.example.activitycalendarapp.data;

import androidx.room.RoomDatabase;

import com.example.activitycalendarapp.Event;
import com.example.activitycalendarapp.EventDao;

@Database(entities = {Event.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract EventDao eventDao();
}
