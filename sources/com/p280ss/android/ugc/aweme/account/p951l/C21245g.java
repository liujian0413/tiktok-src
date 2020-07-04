package com.p280ss.android.ugc.aweme.account.p951l;

import android.text.TextUtils;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.l.g */
public final class C21245g {

    /* renamed from: a */
    public static final C21245g f57054a = new C21245g();

    private C21245g() {
    }

    /* renamed from: a */
    public static final int m71503a(String str, int i) {
        int i2;
        CharSequence charSequence = str;
        if (TextUtils.isEmpty(charSequence) || !TextUtils.isDigitsOnly(charSequence)) {
            return 0;
        }
        if (str == null) {
            try {
                C7573i.m23580a();
            } catch (NumberFormatException unused) {
                i2 = 0;
            }
        }
        i2 = Integer.parseInt(str);
        return i2;
    }
}
