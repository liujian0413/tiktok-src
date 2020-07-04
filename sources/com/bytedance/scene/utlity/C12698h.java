package com.bytedance.scene.utlity;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* renamed from: com.bytedance.scene.utlity.h */
public final class C12698h {
    /* renamed from: a */
    public static boolean m36904a(View view) {
        if (view == null || !((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0)) {
            return false;
        }
        return true;
    }
}
