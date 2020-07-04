package com.bytedance.android.live.core.utils;

import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;

/* renamed from: com.bytedance.android.live.core.utils.ae */
public final class C3360ae {
    /* renamed from: a */
    public static SpannableString m12531a(String str, float f, int i, int i2) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new RelativeSizeSpan(0.6777f), i, i2, 18);
        return spannableString;
    }
}
