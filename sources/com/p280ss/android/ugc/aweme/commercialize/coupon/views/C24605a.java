package com.p280ss.android.ugc.aweme.commercialize.coupon.views;

import android.animation.ObjectAnimator;
import android.view.View;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.commercialize.coupon.views.a */
public final class C24605a {
    /* renamed from: a */
    public static void m80677a(final View view) {
        view.postDelayed(new Runnable() {
            public final void run() {
                ObjectAnimator.ofFloat(view, "alpha", new float[]{1.0f, 0.5f, 1.0f}).setDuration(600).start();
            }
        }, (long) view.getContext().getResources().getInteger(R.integer.i));
    }
}
