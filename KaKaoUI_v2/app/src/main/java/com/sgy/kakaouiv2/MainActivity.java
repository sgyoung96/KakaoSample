package com.sgy.kakaouiv2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.sgy.kakaouiv2.base.BaseActivity;
import com.sgy.kakaouiv2.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}