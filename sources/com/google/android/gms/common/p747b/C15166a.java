package com.google.android.gms.common.p747b;

import android.util.Log;
import com.google.android.gms.common.internal.C15254k;

/* renamed from: com.google.android.gms.common.b.a */
public final class C15166a {

    /* renamed from: a */
    private final String f39242a;

    /* renamed from: b */
    private final String f39243b;

    /* renamed from: c */
    private final C15254k f39244c;

    /* renamed from: d */
    private final int f39245d;

    public C15166a(String str, String... strArr) {
        this(str, "");
    }

    private C15166a(String str, String str2) {
        this.f39243b = str2;
        this.f39242a = str;
        this.f39244c = new C15254k(str);
        int i = 2;
        while (7 >= i && !Log.isLoggable(this.f39242a, i)) {
            i++;
        }
        this.f39245d = i;
    }
}
