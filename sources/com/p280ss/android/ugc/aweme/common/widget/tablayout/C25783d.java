package com.p280ss.android.ugc.aweme.common.widget.tablayout;

import android.content.Context;
import android.content.res.TypedArray;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.common.widget.tablayout.d */
final class C25783d {

    /* renamed from: a */
    private static final int[] f68189a = {R.attr.g8};

    /* renamed from: a */
    static void m84739a(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f68189a);
        boolean z = !obtainStyledAttributes.hasValue(0);
        obtainStyledAttributes.recycle();
        if (z) {
            throw new IllegalArgumentException("You need to use a Theme.AppCompat theme (or descendant) with the design library.");
        }
    }
}
