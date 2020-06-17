package com.example.chennaitourguide;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class LocationAdapter {
    public LocationAdapter(MallsFragment context, ArrayList<Location> Location) {
        this.context = context;

        super(context, 0, location);
    }

    public LocationAdapter(HistoryFragment historyFragment, ArrayList<Location> historyArray) {
        this.context = context;
        super(context, 0, location);
    }

    public LocationAdapter(FoodFragment foodFragment, ArrayList<Location> foodArray) {
        this.context = context;
        super(context, 0, location);
    }

    public LocationAdapter(BeachFragment beachFragment, ArrayList<Location> beachArray) {

    }



    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.single_list_item_view, parent, false);
        }
        Location currentWord =
        ImageView mImageView = listItemView.findViewById((R.id.location_image));
        if(currentWord != null) {
            mImageView.setImageResource(currentWord.getImageResourceId());

            TextView mTextView = listItemView.findViewById(R.id.location_name);
            mTextView.setText(context.getString(currentWord.getNameStringId()));

            mTextView = listItemView.findViewById(R.id.location_address);
            mTextView.setText(context.getString(currentWord.getAddressStringId()));
        }
        return listItemView;
    }


}
