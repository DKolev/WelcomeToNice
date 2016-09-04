package com.example.android.welcometonice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the location_list.xml layout file
        setContentView(R.layout.location_list);

        //Create a list of locations
        ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.string.big_ben_name, R.string.big_ben_open_hours, R.string.big_ben_address,
                R.string.big_ben_phone, R.string.big_ben_info, R.drawable.bigben));
        locations.add(new Location(R.string.hard_rock_name, R.string.hard_rock_open_hours, R.string.hard_rock_address,
                R.string.hard_rock_phone, R.string.hard_rock_info, R.drawable.hardrock));
        locations.add(new Location(R.string.pinocchio_name, R.string.pinocchio_open_hours, R.string.pinocchio_address,
                R.string.pinocchio_phone, R.string.pinocchio_info, R.drawable.pinocchio));
        locations.add(new Location(R.string.buffalo_name, R.string.buffalo_open_hours, R.string.buffalo_address,
                R.string.buffalo_phone, R.string.buffalo_info, R.drawable.buffalo));


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
