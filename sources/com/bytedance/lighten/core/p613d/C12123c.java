package com.bytedance.lighten.core.p613d;

import android.content.Context;
import android.net.Uri;

/* renamed from: com.bytedance.lighten.core.d.c */
public final class C12123c {
    /* renamed from: a */
    public static Uri m35293a(String str) {
        return Uri.parse(str);
    }

    /* renamed from: a */
    public static float m35292a(Context context, float f) {
        return (f * context.getResources().getDisplayMetrics().density) + 0.5f;
    }
}
