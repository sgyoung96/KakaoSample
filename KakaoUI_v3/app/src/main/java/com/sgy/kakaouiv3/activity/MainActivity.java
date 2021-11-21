package com.sgy.kakaouiv3.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;

import com.sgy.kakaouiv3.R;
import com.sgy.kakaouiv3.adapter.ChatListAdapter;
import com.sgy.kakaouiv3.adapter.item.ChatListItem;
import com.sgy.kakaouiv3.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends BaseActivity {

    ActivityMainBinding binding = null;

    // **********************************************************************
    // BASE OVERRIDING
    // **********************************************************************
    @Override
    public void createActivity() {
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initUI();
    }

    @Override
    public void resumeActivity() {

    }

    @Override
    public void pauseActivity() {

    }

    @Override
    public void destroyActivity() {

    }

    // **********************************************************************
    // INIT UI
    // **********************************************************************
    private void initUI() {
        setupSampleChatList();
    }

    // **********************************************************************
    // EVENT
    // **********************************************************************
    @Override
    public void viewClick(View v) {

    }

    // **********************************************************************
    // SAMPLE DATA
    // **********************************************************************

    private void setupSampleChatList() {
        ChatListAdapter adapter = new ChatListAdapter(this, this);
        binding.lstChat.setAdapter(adapter);

        ChatListItem data1 = new ChatListItem("신촌사람One");
        ChatListItem data2 = new ChatListItem("신촌사람Two");
        ChatListItem data3 = new ChatListItem("신촌사람Three");
        ChatListItem data4 = new ChatListItem("신촌사람Four");
        ChatListItem data5 = new ChatListItem("신촌사람Five");

        ArrayList<ChatListItem> dataLst = new ArrayList<>();

        dataLst.add(data1);
        dataLst.add(data2);
        dataLst.add(data3);
        dataLst.add(data4);
        dataLst.add(data5);

        for(ChatListItem data : dataLst) {
            adapter.addItem(data);
        }

        // binding.lstChat.deferNotifyDataSetChanged();
        adapter.notifyDataSetChanged();
    }

}