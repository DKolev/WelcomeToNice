package com.example.android.welcometonice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class SightsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the location_list.xml layout file
        setContentView(R.layout.location_list);

        //Create a list of locations
        ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.string.garden_name, R.string.garden_open_hours, R.string.garden_address,
                R.string.garden_phone, R.string.garden_info, R.drawable.garden));
        locations.add(new Location(R.string.castle_name, R.string.castle_open_hours, R.string.castle_address,
                R.string.castle_phone, R.string.castle_info, R.drawable.castle));
        locations.add(new Location(R.string.marche_name, R.string.marche_open_hours, R.string.marche_address,
                R.string.marche_phone, R.string.marche_info, R.drawable.marche));
        locations.add(new Location(R.string.negresco_name, R.string.negresco_open_hours, R.string.negresco_address,
                R.string.negresco_phone, R.string.negresco_info, R.drawable.negresco));

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
