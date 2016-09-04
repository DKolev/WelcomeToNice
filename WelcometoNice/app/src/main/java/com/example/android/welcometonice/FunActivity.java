package com.example.android.welcometonice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FunActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the location_list.xml layout file
        setContentView(R.layout.location_list);

        //Create a list of locations
        ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.string.cinema_name, R.string.cinema_open_hours, R.string.cinema_address,
                R.string.cinema_phone, R.string.cinema_info, R.drawable.cinema));
        locations.add(new Location(R.string.bowling_name, R.string.bowling_open_hours, R.string.bowling_address,
                R.string.bowling_phone, R.string.bowling_info, R.drawable.bowling));
        locations.add(new Location(R.string.club_name, R.string.club_open_hours, R.string.club_address,
                R.string.club_phone, R.string.club_info, R.drawable.high));
        locations.add(new Location(R.string.water_sport_name, R.string.water_sport_open_hours, R.string.water_sport_address,
                R.string.water_sport_phone, R.string.water_sport_info, R.drawable.water));

        // Create an {@link LocationAdapter}, whose data source is a list of {@link Location}s. The
        // adapter knows how to create list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(this, locations);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // location_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link LocationAdapter} above, so that the
        // {@link ListView} will display list items for each {@link Location} in the list.
        listView.setAdapter(adapter);

    }
}
