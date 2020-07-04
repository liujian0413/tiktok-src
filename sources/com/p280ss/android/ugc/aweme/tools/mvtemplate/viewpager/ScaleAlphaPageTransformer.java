package com.p280ss.android.ugc.aweme.tools.mvtemplate.viewpager;

import android.os.Build.VERSION;
import android.support.p022v4.view.ViewPager.C0936f;
import android.view.View;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.viewpager.ScaleAlphaPageTransformer */
public class ScaleAlphaPageTransformer implements C0936f {

    /* renamed from: a */
    private float f110698a;

    public ScaleAlphaPageTransformer(float f) {
        this.f110698a = f;
    }

    /* renamed from: a */
    public final void mo3622a(View view, float f) {
        m135287b(view, f);
    }

    /* renamed from: b */
    private void m135287b(View view, float f) {
        float f2;
        float f3;
        if (f < -1.0f) {
            f = -1.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (f < 0.0f) {
            f2 = f + 1.0f;
        } else {
            f2 = 1.0f - f;
        }
        float f4 = (f2 * 0.100000024f) + 0.9f;
        view.setScaleX(f4);
        view.setScaleY(f4);
        if (f < 0.0f) {
            f3 = f + 1.0f;
        } else {
            f3 = 1.0f - f;
        }
        view.setAlpha(this.f110698a + (f3 * (1.0f - this.f110698a)));
        if (VERSION.SDK_INT < 19) {
            view.getParent().requestLayout();
        }
    }
}
