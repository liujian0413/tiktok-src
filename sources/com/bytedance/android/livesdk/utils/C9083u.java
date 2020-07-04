package com.bytedance.android.livesdk.utils;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* renamed from: com.bytedance.android.livesdk.utils.u */
public final class C9083u {
    /* renamed from: a */
    public static void m27120a(Context context, EditText editText) {
        ((InputMethodManager) context.getSystemService("input_method")).showSoftInput(editText, 1);
    }

    /* renamed from: b */
    public static void m27121b(Context context, EditText editText) {
        if (context != null) {
            ((InputMethodManager) context.getSystemService("input_method")).hideSoftInputFromWindow(editText.getWindowToken(), 0);
        }
    }
}
