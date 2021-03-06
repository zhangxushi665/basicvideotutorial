package me.yangzhe.basicvideotutorial.utils;

import android.util.Log;

/**
 * Created by Jalen on 2018/8/18.
 */

public class LogUtil {
    public static final String TAG = LogUtil.class.getSimpleName();

    public static void e(String message) {
        Log.e(TAG, message);
    }

    public static void i(String message) {
        Log.i(TAG, message);
    }

    public static void d(String message) {
        Log.e(TAG, message);
    }

    public static void w(String message) {
        Log.w(TAG, message);
    }
}
