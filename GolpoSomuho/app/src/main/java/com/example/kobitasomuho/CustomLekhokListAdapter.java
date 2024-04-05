package com.example.kobitasomuho;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomLekhokListAdapter extends BaseAdapter {

    String[] lekhokName;

    String[] lekhokBirth;

    int[] lekhokPicture;

    Context lekhokContext;

    public CustomLekhokListAdapter(String[] lekhokName, String[] lekhokBirth, int[] lekhokPicture, Context lekhokContext) {
        this.lekhokName = lekhokName;
        this.lekhokBirth = lekhokBirth;
        this.lekhokPicture = lekhokPicture;
        this.lekhokContext = lekhokContext;
    }

    @Override
    public int getCount() {
        return lekhokName.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(lekhokContext).inflate(R.layout.item_lekhok_list, parent, false);
        }

        TextView txtLekhokName = convertView.findViewById(R.id.txt_lekhok);

        TextView txtLekhokBirth = convertView.findViewById(R.id.txt_dob);

        ImageView imgLekhok = convertView.findViewById(R.id.img_lekhok);


        txtLekhokName.setText(lekhokName[position]);

        txtLekhokBirth.setText(lekhokBirth[position]);

        imgLekhok.setImageResource(lekhokPicture[position]);

        return convertView;
    }
}
