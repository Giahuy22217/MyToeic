package com.haido.bigbabolbob.mytoeic.capdo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.haido.bigbabolbob.mytoeic.R;

import java.util.ArrayList;

/**
 * Created by Lenovo on 05/01/2018.
 */

public class ExamAdapter extends ArrayAdapter<Exam> {
    public ExamAdapter(Context context, ArrayList<Exam> exam) {
        super( context, 0, exam );
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate( R.layout.item_gridview, parent, false);
        }
        TextView tvName = (TextView) convertView.findViewById(R.id.tvNum);
        ImageView imgIcon = (ImageView)convertView.findViewById(R.id.imgIcon);

        Exam p = getItem(position);
        if(p!=null){
            tvName.setText("" + p.getName());
            imgIcon.setImageResource(R.drawable.h1);
        }

        return convertView;
    }
}
