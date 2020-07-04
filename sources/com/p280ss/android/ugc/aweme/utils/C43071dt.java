package com.p280ss.android.ugc.aweme.utils;

import android.os.Build.VERSION;
import android.widget.TextView;

/* renamed from: com.ss.android.ugc.aweme.utils.dt */
public final class C43071dt {
    /* renamed from: a */
    public static final void m136629a(TextView textView) {
        int i;
        if (textView != null && VERSION.SDK_INT >= 17) {
            boolean a = C43127fh.m136806a(textView.getContext());
            textView.setTextDirection(2);
            if (a) {
                i = 5;
            } else {
                i = 3;
            }
            textView.setGravity(i);
        }
    }
}
