package com.example.contactswithdatabase;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAllContactsAdapter extends BaseAdapter {

    Context mContext;

    ArrayList<ContactModel> allContacts;

    public CustomAllContactsAdapter(Context mContext, ArrayList<ContactModel> allContacts) {
        this.mContext = mContext;
        this.allContacts = allContacts;
    }

    @Override
    public int getCount() {
        return allContacts.size();
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
        if (convertView == null){
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_all_contact_list, parent, false);
        }
        TextView txtName = convertView.findViewById(R.id.txt_name);

        TextView txtEmail = convertView.findViewById(R.id.txt_email);

        TextView txtNumber = convertView.findViewById(R.id.txt_number);


        txtName.setText(allContacts.get(position).name);
        txtEmail.setText(allContacts.get(position).email);
        txtNumber.setText(allContacts.get(position).phoneNumber);


        return convertView;
    }
}
