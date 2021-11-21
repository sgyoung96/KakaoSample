package com.sgy.kakaouiv3.util;

import android.content.Context;
import android.util.Log;

import com.sgy.kakaouiv3.R;

public class SysUtil {

    public static void MY_LOG(Context context, String content) {
        // AUTO DEBUG
        Log.d(context.getString(R.string.debug_title), content);
    }
}
