package com.sgy.kakaouiv3.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.sgy.kakaouiv3.R;
import com.sgy.kakaouiv3.activity.BaseActivity;
import com.sgy.kakaouiv3.adapter.item.ChatListItem;

import java.util.ArrayList;

public class ChatListAdapter extends BaseAdapter {

    private Context context = null;
    private BaseActivity activity = null;

    private ArrayList<ChatListItem> dataLst = new ArrayList<ChatListItem>();

    public ChatListAdapter(Context context, BaseActivity activity) {
        this.context = context;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return dataLst.size();
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
        View v = LayoutInflater.from(context).inflate(R.layout.list_item_chat, null);

        TextView tvName = v.findViewById(R.id.tv_name);

        tvName.setText(dataLst.get(position).getName());

        return v;
    }

    public void addItem(ChatListItem item) {
        dataLst.add(item);
    }
}
