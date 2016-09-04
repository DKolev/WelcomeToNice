package com.example.android.welcometonice;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {

    /**
     * Create a new {@link LocationAdapter} object.
     * @param context   is the current context (i.e. Activity) that the adapter is being created in.
     * @param locations is the list of {@link Location}s to be displayed.
     */
    public LocationAdapter(Activity context, ArrayList<Location> locations) {
        super(context, 0, locations);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Check if the existing view is being reused, otherwise inflate the view
        View listViewItem = convertView;
        if (listViewItem == null) {
            listViewItem = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_cards, parent, false);
        }

        //Get the {@link Location} object located at this position in the list
        Location currentLocation = getItem(position);

        //Find the TextView in the list_item_cards.xml layout with the location's name
        TextView locationName = (TextView) listViewItem.findViewById(R.id.location_name);

        //Get the location's name from the current Location object and
        // set this text on the location's name TextView
        locationName.setText(currentLocation.getName());

        //Find the TextView in the list_item_cards.xml layout with the location's open hours
        TextView locationOpenHours = (TextView) listViewItem.findViewById(R.id.location_open_hours);

        //Get location's open hours from the current Location object and
        //set this text on the location's open hours TextView
        locationOpenHours.setText(currentLocation.getWorkingHours());

        //Find the TextView in the list_item_cards.xml layout with the location's address
        TextView locationAddress = (TextView) listViewItem.findViewById(R.id.location_address);

        //Get the location's address from the current Location object and
        //set this text on the location's address TextView
        locationAddress.setText(currentLocation.getAddress());

        //Find the TextView in the list_item_cards.xml layout with the location's phone number
        TextView locationPhone = (TextView) listViewItem.findViewById(R.id.location_phone);

        //Get the location's phone number from the the current Location object and
        //set this text on the location's phone number TextView
        locationPhone.setText(currentLocation.getPhoneNumber());

        //Find the TextView in the list_item_cards.xml layout with the location's brief info
        TextView locationInfo = (TextView) listViewItem.findViewById(R.id.location_info);

        //Get the location's brief info from the current Location object and
        //set this text on the location's brief info TextView
        locationInfo.setText(currentLocation.getInfo());

        //Find the ImageView in the list_item_cards.xml layout with the location's photo
        ImageView locationPhoto = (ImageView) listViewItem.findViewById(R.id.location_photo);

        //Get the location's photo from the current Location object and
        //set this image on the location's photo ImageView
        locationPhoto.setImageResource(currentLocation.getPhotoId());

        //Return the whole list item layout (containing 1 ImageView and 5 TextViews
        //so that it can be shown in the ListView
        return listViewItem;
    }
}