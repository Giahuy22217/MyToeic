package com.haido.bigbabolbob.mytoeic.slide;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.haido.bigbabolbob.mytoeic.R;
import com.haido.bigbabolbob.mytoeic.question.Question;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ScreenSlidePageFragment extends Fragment {

    ArrayList<Question> arr_Ques;
    public static final String ARG_PAGE = "page";
    private int mPageNumber;  //vi tri trang hiện tại

    TextView tvNum, tvQuestion;
    RadioGroup radiogroup;
    RadioButton radA, radB, radC, radD;
    ImageView imgicon;


    public ScreenSlidePageFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.fragment_screen_slide_page, container, false);

        tvNum = (TextView)rootView.findViewById(R.id.tvNum);
        tvQuestion = (TextView)rootView.findViewById(R.id.tvQuestion);
        imgicon = (ImageView)rootView.findViewById(R.id.ivIcon);
        radA = (RadioButton)rootView.findViewById(R.id.radA);
        radB = (RadioButton)rootView.findViewById(R.id.radB);
        radC = (RadioButton)rootView.findViewById(R.id.radC);
        radD = (RadioButton)rootView.findViewById(R.id.radD);
        radiogroup = (RadioGroup)rootView.findViewById(R.id.radGroup);

        return rootView;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        arr_Ques = new ArrayList<Question>();
        ScreenSlideActivity slideActivity = (ScreenSlideActivity) getActivity();
        arr_Ques = slideActivity.getData();
        mPageNumber = getArguments().getInt(ARG_PAGE);
    }

    //Lay vi tri trang slideactivity
    public static ScreenSlidePageFragment create (int pagenumber){
        ScreenSlidePageFragment fragment = new ScreenSlidePageFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE,pagenumber);
        fragment.setArguments(args);
        return fragment;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        tvNum.setText("Exame "+ (arr_Ques.get(mPageNumber).getDethi()) +"- Part " + (arr_Ques.get(mPageNumber).getPhanthi()));
        tvQuestion.setText((mPageNumber+1) + ". " + arr_Ques.get(mPageNumber).getCauhoi());
        imgicon.setImageResource(getResources().getIdentifier(arr_Ques.get(mPageNumber).getImage()+"","drawable","com.haido.bigbabolbob.mytoeic"));
        radA.setText(arr_Ques.get(mPageNumber).getTraloi_a());
        radB.setText(arr_Ques.get(mPageNumber).getTraloi_b());
        radC.setText(arr_Ques.get(mPageNumber).getTraloi_c());
        radD.setText(arr_Ques.get(mPageNumber).getTraloi_d());

    }
}
