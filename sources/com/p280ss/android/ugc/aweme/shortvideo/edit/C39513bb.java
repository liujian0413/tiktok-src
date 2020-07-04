package com.p280ss.android.ugc.aweme.shortvideo.edit;

import android.app.Activity;
import android.view.inputmethod.InputMethodManager;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.bb */
public final class C39513bb {
    /* renamed from: a */
    public static void m126207a(Activity activity) {
        if (activity != null && activity.getCurrentFocus() != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(), 0);
            }
        }
    }
}
