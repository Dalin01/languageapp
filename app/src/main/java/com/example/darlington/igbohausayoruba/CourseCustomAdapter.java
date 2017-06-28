package com.example.darlington.igbohausayoruba;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Darlington on 5/16/2017.
 */

public class CourseCustomAdapter extends BaseAdapter {
    Context context;
    String course_content[];
    String course_translation[];
    int image_icon[];
    int next_icon[];
    LayoutInflater inflater;

    public CourseCustomAdapter(Context applicationContext, String[] course_content, String[] course_translation, int[] image_icon, int[] next_icon) {
        this.context = applicationContext;
        this.course_content = course_content;
        this.image_icon = image_icon;
        this.course_translation = course_translation;
        this.next_icon = next_icon;
        inflater = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return course_content.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = view;
        if (v == null)
        {
            LayoutInflater oldView = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = oldView.inflate(R.layout.course_list, null);
        }
        else {
            v = inflater.inflate(R.layout.course_list, null);
            TextView courses = (TextView) v.findViewById(R.id.textView);
            ImageView icon = (ImageView) v.findViewById(R.id.icon);
            TextView translation = (TextView) v.findViewById(R.id.textView1);
            ImageView icon_next = (ImageView) v.findViewById(R.id.icon_next);
            courses.setText(course_content[i]);
            icon.setImageResource(image_icon[i]);
            translation.setText(course_translation[i]);
            icon_next.setImageResource(next_icon[i]);
        }
        return v;
    }

}
