package com.example.fourth;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomKobiAdapter  extends BaseAdapter {

    String[] kobiNam;

    String[] kobiBirth;

    int[] kobiChobi;
    Context mContext;

    public CustomKobiAdapter(Context context ,String[] kobiNam, String[] kobiBirth, int[] kobiChobi) {
        this.mContext = context;
        this.kobiNam = kobiNam;
        this.kobiBirth = kobiBirth;
        this.kobiChobi = kobiChobi;
    }

    @Override
    public int getCount() {
        return kobiNam.length;
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
        if(convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_kobi_list, parent, false);
        }

        TextView txtKobiNam = convertView.findViewById(R.id.txt_kobi);

        TextView txtKobiBirth = convertView.findViewById(R.id.txt_dob);

        ImageView imgKobi = convertView.findViewById(R.id.img_kobi);

        txtKobiNam.setText(kobiNam[position]);
        txtKobiBirth.setText(kobiBirth[position]);
        imgKobi.setImageResource(kobiChobi[position]);

        return convertView;
    }
}
