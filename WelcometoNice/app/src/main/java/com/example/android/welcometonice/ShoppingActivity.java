package com.example.android.welcometonice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ShoppingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the location_list.xml layout file
        setContentView(R.layout.location_list);

        //Create a list of locations
        ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.string.fnac_name, R.string.fnac_open_hours, R.string.fnac_address,
                R.string.fnac_phone, R.string.fnac_info, R.drawable.fnac));
        locations.add(new Location(R.string.mall_name, R.string.mall_open_hours, R.string.mall_address,
                R.string.mall_phone, R.string.mall_info, R.drawable.mall));
        locations.add(new Location(R.string.game_shop_name, R.string.game_shop_open_hours, R.string.game_shop_address,
                R.string.game_shop_phone, R.string.game_shop_info, R.drawable.micromania));
        locations.add(new Location(R.string.hm_name, R.string.hm_open_hours, R.string.hm_address,
                R.string.hm_phone, R.string.hm_info, R.drawable.hm));

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
