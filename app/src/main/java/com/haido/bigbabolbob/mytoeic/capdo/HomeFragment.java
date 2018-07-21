package com.haido.bigbabolbob.mytoeic.capdo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.haido.bigbabolbob.mytoeic.MainActivity;
import com.haido.bigbabolbob.mytoeic.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ((MainActivity) getActivity()).getSupportActionBar().setTitle("My Toeic");
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

}
