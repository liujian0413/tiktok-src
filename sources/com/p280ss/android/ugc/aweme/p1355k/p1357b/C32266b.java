package com.p280ss.android.ugc.aweme.p1355k.p1357b;

import android.os.Build.VERSION;
import android.view.View;
import com.p280ss.android.ugc.aweme.notification.util.C34626j;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.k.b.b */
public final class C32266b {
    /* renamed from: a */
    public static void m104782a(View view) {
        m104783a(view, R.drawable.i3, R.color.a6c);
    }

    /* renamed from: a */
    public static void m104783a(View view, int i, int i2) {
        if (VERSION.SDK_INT < 21) {
            C34626j.m111876a(view);
            view.setBackgroundColor(view.getResources().getColor(i2));
            return;
        }
        view.setBackground(view.getResources().getDrawable(i));
    }
}
