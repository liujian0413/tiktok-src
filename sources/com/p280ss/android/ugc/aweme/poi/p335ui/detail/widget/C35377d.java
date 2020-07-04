package com.p280ss.android.ugc.aweme.poi.p335ui.detail.widget;

import android.content.Context;
import android.content.res.TypedArray;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.widget.d */
final class C35377d {

    /* renamed from: a */
    private static final int[] f92813a = {R.attr.g8};

    /* renamed from: a */
    static void m114263a(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f92813a);
        boolean z = !obtainStyledAttributes.hasValue(0);
        obtainStyledAttributes.recycle();
        if (z) {
            throw new IllegalArgumentException("You need to use a Theme.AppCompat theme (or descendant) with the design library.");
        }
    }
}
