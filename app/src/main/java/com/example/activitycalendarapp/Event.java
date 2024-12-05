package com.example.activitycalendarapp;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "events")
public class Event {
    @PrimaryKey(autoGenerate = true)
    public int id;
    public String title;
    public String description;
    public long date;
}
