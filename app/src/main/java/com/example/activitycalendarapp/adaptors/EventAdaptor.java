package com.example.activitycalendarapp.adaptors;

import static java.security.AccessController.getContext;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.activitycalendarapp.Event;
import com.example.activitycalendarapp.R;

import java.util.List;

public class EventAdapter extends ArrayAdapter<Event> {
    public EventAdapter(Context context, List<Event> events) {
        super(context, 0, events);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.event_item, parent, false);
        }
        Event event = getItem(position);
        TextView title = convertView.findViewById(R.id.event_title);
        title.setText(event.title);
        return convertView;
    }
}
