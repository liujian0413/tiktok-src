package com.bytedance.p263im.sugar.input;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* renamed from: com.bytedance.im.sugar.input.d */
public final class C11481d {
    /* renamed from: a */
    public static void m33874a(Activity activity, View view) {
        if (activity != null && view != null) {
            ((InputMethodManager) activity.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    /* renamed from: a */
    public static void m33875a(final View view, int i) {
        final InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
        if (!inputMethodManager.showSoftInput(view, 0)) {
            view.postDelayed(new Runnable(0) {
                public final void run() {
                    inputMethodManager.showSoftInput(view, 0);
                }
            }, 100);
        }
    }
}
