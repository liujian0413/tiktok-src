package com.facebook.react.views.common;

import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.View;

public class ViewHelper {
    public static void setBackground(View view, Drawable drawable) {
        if (VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }
}
