package com.p280ss.android.ugc.aweme.p313im.sdk.utils;

import android.os.Build.VERSION;
import android.view.View;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.ao */
public final class C31869ao {
    /* renamed from: a */
    public static void m103555a(View view) {
        m103556a(view, R.drawable.i3, R.color.t4);
    }

    /* renamed from: a */
    public static void m103556a(View view, int i, int i2) {
        if (VERSION.SDK_INT < 21) {
            C31878ax.m103576a(view);
            view.setBackground(view.getResources().getDrawable(i2));
            return;
        }
        view.setBackground(view.getResources().getDrawable(i));
    }
}
