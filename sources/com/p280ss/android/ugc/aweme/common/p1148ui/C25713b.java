package com.p280ss.android.ugc.aweme.common.p1148ui;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* renamed from: com.ss.android.ugc.aweme.common.ui.b */
public final class C25713b {
    /* renamed from: a */
    public static int m84473a(Context context) {
        return context.getResources().getDimensionPixelSize(context.getResources().getIdentifier("status_bar_height", "dimen", "android"));
    }

    /* renamed from: a */
    public static void m84475a(View view) {
        if (view != null && VERSION.SDK_INT >= 19) {
            view.getLayoutParams().height = m84473a(view.getContext());
        }
    }

    /* renamed from: a */
    public static void m84474a(Activity activity, View view) {
        if (activity != null) {
            ((InputMethodManager) activity.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    /* renamed from: a */
    public static void m84476a(final View view, int i) {
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
