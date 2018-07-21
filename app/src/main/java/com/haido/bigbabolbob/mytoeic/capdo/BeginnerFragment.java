package com.haido.bigbabolbob.mytoeic.capdo;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridView;

import com.haido.bigbabolbob.mytoeic.MainActivity;
import com.haido.bigbabolbob.mytoeic.R;
import com.haido.bigbabolbob.mytoeic.slide.ScreenSlideActivity;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class BeginnerFragment extends Fragment {

    ExamAdapter examAdapter;
    GridView gvExam;
    ArrayList<Exam> arr_exam = new ArrayList<Exam>();
    Button btn_Start;

    public BeginnerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Beginner");
        return inflater.inflate(R.layout.fragment_beginner, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        gvExam = (GridView)getActivity().findViewById(R.id.gvSubject);

        btn_Start = (Button)getActivity().findViewById(R.id.btn_Start);
        btn_Start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), ScreenSlideActivity.class);
                startActivity(i);
            }
        });
    }
}
