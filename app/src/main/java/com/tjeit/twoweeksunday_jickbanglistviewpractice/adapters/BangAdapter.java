package com.tjeit.twoweeksunday_jickbanglistviewpractice.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.tjeit.twoweeksunday_jickbanglistviewpractice.R;
import com.tjeit.twoweeksunday_jickbanglistviewpractice.datas.Bang;

import java.util.List;

public class BangAdapter extends ArrayAdapter {

    Context mContext;
    List<Bang> mList;
    LayoutInflater inf;

    public BangAdapter(Context context, List<Bang> list) {
        super(context, R.layout.bang_list,list);

        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View row = convertView;
        if(row == null) {
            row = inf.inflate(R.layout.bang_list, null);
        }

        Bang bangData = mList.get(position);

        TextView bangPriceTxt = row.findViewById(R.id.bangPriceTxt);
        TextView monthPriceTxt = row.findViewById(R.id.monthPriceTxt);
        TextView addressTxt = row.findViewById(R.id.addressTxt);
        TextView optionTxt = row.findViewById(R.id.optionTxt);
        TextView descTxt =row.findViewById(R.id.descTxt);

        bangPriceTxt.setText(String.format("%d", bangData.bangPriceTxt));
        monthPriceTxt.setText(String.format("%d", bangData.monthPriceTxt));
        addressTxt.setText(bangData.addressTxt);
        optionTxt.setText(bangData.optionTxt);
        descTxt.setText(String.format("[%s]",bangData.descTxt));

        return row;
    }
}
