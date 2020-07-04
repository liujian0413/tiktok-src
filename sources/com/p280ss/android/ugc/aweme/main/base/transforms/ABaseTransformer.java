package com.p280ss.android.ugc.aweme.main.base.transforms;

import android.support.p022v4.view.ViewPager.C0936f;
import android.view.View;

/* renamed from: com.ss.android.ugc.aweme.main.base.transforms.ABaseTransformer */
public abstract class ABaseTransformer implements C0936f {
    /* renamed from: a */
    private static float m106472a(float f) {
        if (f < -1.0f) {
            return -1.0f;
        }
        if (f > 1.0f) {
            return 1.0f;
        }
        return f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo84620a() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo84621b(View view, float f);

    /* renamed from: a */
    public final void mo3622a(View view, float f) {
        try {
            float a = m106472a(f);
            m106473c(view, a);
            mo84621b(view, a);
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    private void m106473c(View view, float f) {
        float f2;
        float width = (float) view.getWidth();
        float f3 = 0.0f;
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
        view.setRotation(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        view.setTranslationY(0.0f);
        if (mo84620a()) {
            f2 = 0.0f;
        } else {
            f2 = (-width) * f;
        }
        view.setTranslationX(f2);
        if (f > -1.0f && f < 1.0f) {
            f3 = 1.0f;
        }
        view.setAlpha(f3);
        view.setEnabled(false);
    }
}
