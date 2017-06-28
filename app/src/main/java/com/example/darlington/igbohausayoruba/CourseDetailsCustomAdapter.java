package com.example.darlington.igbohausayoruba;

import android.content.Context;
import android.media.Image;
import android.text.Layout;
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

public class CourseDetailsCustomAdapter extends BaseAdapter {
    Context context;
    ArrayList<ContentDetails> courseDetails;

    CourseDetailsCustomAdapter(Context context, ArrayList<ContentDetails> courseDetails){
        this.context = context;
        this.courseDetails = courseDetails;
    }

    public int getCount(){
        return courseDetails.size();
    }

    public Object getItem(int position) {
        return courseDetails.get(position);
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View view, ViewGroup viewGroup){
        View v = view;
        if (v == null)
        {
            LayoutInflater oldView = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = oldView.inflate(R.layout.course_list, null);
        }

        TextView language_word = (TextView) v.findViewById(R.id.textView);
        ImageView icon = (ImageView) v.findViewById(R.id.icon);
        TextView english_word = (TextView) v.findViewById(R.id.textView1);
        ImageView play = (ImageView) v.findViewById(R.id.icon_next);

        ContentDetails details = courseDetails.get(position);
        icon.setImageResource(details.icon1);
        language_word.setText(details.langTranslation);
        english_word.setText(details.englishWord);
        play.setImageResource(details.icon2);

        return v;
    }


}
