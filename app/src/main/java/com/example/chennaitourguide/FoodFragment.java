package com.example.chennaitourguide;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class FoodFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ArrayList<Location> foodArray;
        foodArray = new ArrayList<>();
        foodArray.add(new Location(R.drawable.marina_mall, R.string.marina_mall, R.string.marina_mall_address));
        foodArray.add(new Location(R.drawable.vivira_mall, R.string.vivira_mall, R.string.vivira_mall_address));
        foodArray.add(new Location(R.drawable.express_avenue_mall, R.string.express_avenue_mall, R.string.express_avenue_mall_address));
        foodArray.add(new Location(R.drawable.pheonix, R.string.pheonix, R.string.pheonix_marketcity_address));
        foodArray.add(new Location(R.drawable.heritage, R.string.heritage, R.string.heritage_address));
        foodArray.add(new Location(R.drawable.mayajaal, R.string.mayajaal, R.string.mayajaal_address));
        foodArray.add(new Location(R.drawable.grand_square, R.string.grand_square, R.string.grand_square_address));
        foodArray.add(new Location(R.drawable.forum, R.string.forum, R.string.forum_address));
        foodArray.add(new Location(R.drawable.vr, R.string.vr_mall, R.string.vr_mall_address));
        foodArray.add(new Location(R.drawable.spencer, R.string.spemcer_mall, R.string.spencer_address));


        View rootView = inflater.inflate(R.layout.activity_list, container, false);
        LocationAdapter locationAdapter = new LocationAdapter(this, foodArray);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter((ListAdapter) locationAdapter);
        return rootView;

    }
}
