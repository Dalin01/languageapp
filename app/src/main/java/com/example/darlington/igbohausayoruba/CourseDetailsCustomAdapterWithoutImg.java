package com.example.darlington.igbohausayoruba;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Darlington on 5/17/2017.
 */

public class CourseDetailsCustomAdapterWithoutImg extends BaseAdapter {
    Context context;
    ArrayList<ContentDetails> courseDetailsWithoutImg;

    CourseDetailsCustomAdapterWithoutImg(Context context, ArrayList<ContentDetails> courseDetailsWithoutImg){
        this.context = context;
        this.courseDetailsWithoutImg = courseDetailsWithoutImg;
    }

    public int getCount(){
        return courseDetailsWithoutImg.size();
    }

    public Object getItem(int position) {
        return courseDetailsWithoutImg.get(position);
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View view, ViewGroup viewGroup){
        View v = view;
        if (v == null)
        {
            LayoutInflater oldView = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = oldView.inflate(R.layout.list_without_img, null);
        }

        TextView language_word = (TextView) v.findViewById(R.id.textView);
        TextView english_word = (TextView) v.findViewById(R.id.textView1);
        ImageView play = (ImageView) v.findViewById(R.id.icon_next);

        ContentDetails detailsWithoutImg = courseDetailsWithoutImg.get(position);
        language_word.setText(detailsWithoutImg.langTranslation);
        english_word.setText(detailsWithoutImg.englishWord);
        play.setImageResource(detailsWithoutImg.icon2);

        return v;
    }
}
