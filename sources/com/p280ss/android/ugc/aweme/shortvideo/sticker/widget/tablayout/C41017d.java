package com.p280ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout;

import android.content.Context;
import android.content.res.TypedArray;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.d */
final class C41017d {

    /* renamed from: a */
    private static final int[] f106729a = {R.attr.g8};

    /* renamed from: a */
    static void m131067a(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f106729a);
        boolean z = !obtainStyledAttributes.hasValue(0);
        obtainStyledAttributes.recycle();
        if (z) {
            throw new IllegalArgumentException("You need to use a Theme.AppCompat theme (or descendant) with the design library.");
        }
    }
}
