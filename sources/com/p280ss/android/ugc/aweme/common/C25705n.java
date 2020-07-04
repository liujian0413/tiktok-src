package com.p280ss.android.ugc.aweme.common;

import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.common.n */
public final class C25705n implements InputFilter {
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        boolean z;
        C7573i.m23587b(charSequence, "source");
        String obj = charSequence.toString();
        if (obj != null) {
            if (TextUtils.isEmpty(C7634n.m23762b(obj).toString())) {
                if (charSequence.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && i3 == 0) {
                    return "";
                }
            }
            return null;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
    }
}
