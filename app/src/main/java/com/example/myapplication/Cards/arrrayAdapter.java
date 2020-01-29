package com.example.myapplication.Cards;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.myapplication.R;

import java.util.List;

public class arrrayAdapter extends android.widget.ArrayAdapter<Cards> {

    Context context;

    public arrrayAdapter(Context context, int resourceid, List<Cards> items){
        super(context, resourceid,items);
        this.context = context;
    }

    public View getView(int position, View convertView, ViewGroup parnet){
        Cards card_item = getItem(position);
        if (convertView == null)
        {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item, parnet, false);
        }
        TextView name = (TextView) convertView.findViewById(R.id.name);
        ImageView image = (ImageView) convertView.findViewById(R.id.image);

        name.setText(card_item.getName());

        switch (card_item.getProfileImageUrl()){
            case "default":
                Glide.with(convertView.getContext()).load(R.mipmap.def).into(image);
                break;
                default:
                    Glide.clear(image);
                    Glide.with(convertView.getContext()).load(card_item.getProfileImageUrl()).into(image);
                    break;
        }
        return convertView;
    }
}
