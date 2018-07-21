package com.haido.bigbabolbob.mytoeic.slide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.haido.bigbabolbob.mytoeic.R;
import com.haido.bigbabolbob.mytoeic.question.Question;

import java.util.ArrayList;

/**
 * Created by Lenovo on 16/11/2017.
 */

public class CheckAnswerAdapter extends BaseAdapter {

    ArrayList lsData;
    LayoutInflater inflater;

    public CheckAnswerAdapter(ArrayList lsData, Context context){
        this.lsData = lsData;
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

    }


    @Override
    public int getCount() {
        return (lsData.size());
    }

    @Override
    public Object getItem(int position) {
        return lsData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Question data = (Question)getItem(position);
        ViewHolder holder;
        if(convertView == null){
            holder = new ViewHolder();
            convertView = inflater.inflate( R.layout.item_gridview_list_answer, null);
            holder.tvNumanswer = (TextView)convertView.findViewById(R.id.tvNumanswer);
            holder.tvAnswer = (TextView)convertView.findViewById(R.id.tvAnswer);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder)convertView.getTag();
        }

        int i = position + 1;
        holder.tvNumanswer.setText(+ i + ": ");
        holder.tvAnswer.setText(data.getTraloi());

        return convertView;

    }

    public static class ViewHolder{
        TextView tvNumanswer, tvAnswer;

    }
}
