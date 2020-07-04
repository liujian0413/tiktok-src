package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* renamed from: com.google.android.gms.internal.measurement.fn */
public final class C16532fn {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Uri f46313a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f46314b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final String f46315c;

    public C16532fn(Uri uri) {
        this(null, uri, "", "", false, false, false);
    }

    private C16532fn(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3) {
        this.f46313a = uri;
        this.f46314b = str2;
        this.f46315c = str3;
    }

    /* renamed from: a */
    public final C16526fh<Long> mo42720a(String str, long j) {
        return C16526fh.m53858b(this, str, j);
    }

    /* renamed from: a */
    public final C16526fh<Boolean> mo42722a(String str, boolean z) {
        return C16526fh.m53860b(this, str, z);
    }

    /* renamed from: a */
    public final C16526fh<Integer> mo42719a(String str, int i) {
        return C16526fh.m53857b(this, str, i);
    }

    /* renamed from: a */
    public final C16526fh<Double> mo42718a(String str, double d) {
        return C16526fh.m53856b(this, str, d);
    }

    /* renamed from: a */
    public final C16526fh<String> mo42721a(String str, String str2) {
        return C16526fh.m53859b(this, str, str2);
    }
}
