package com.bytedance.p073ad.symphony.util;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

/* renamed from: com.bytedance.ad.symphony.util.e */
public final class C2202e {
    /* renamed from: a */
    public static float m9512a(Context context, float f) {
        return (f * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    /* renamed from: a */
    public static void m9513a(View view, int i, int i2) {
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -1;
            layoutParams.height = -2;
        }
    }
}
