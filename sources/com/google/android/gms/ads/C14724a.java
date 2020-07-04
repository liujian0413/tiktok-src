package com.google.android.gms.ads;

import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.p280ss.android.ugc.aweme.lancet.C32272a;

/* renamed from: com.google.android.gms.ads.a */
final class C14724a {
    /* renamed from: a */
    static void m42567a(AdActivity adActivity, int i) {
        if (VERSION.SDK_INT != 26) {
            adActivity.mo37361a(i);
            return;
        }
        TypedArray obtainStyledAttributes = adActivity.obtainStyledAttributes(new int[]{16842840});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        if (!z) {
            adActivity.mo37361a(i);
        }
    }

    /* renamed from: a */
    static void m42568a(AdActivity adActivity, Bundle bundle) {
        C32272a.m104795a(adActivity);
        adActivity.mo37362a(bundle);
    }
}
