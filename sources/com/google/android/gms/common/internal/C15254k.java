package com.google.android.gms.common.internal;

/* renamed from: com.google.android.gms.common.internal.k */
public final class C15254k {

    /* renamed from: a */
    private static final int f39457a = 15;

    /* renamed from: b */
    private final String f39458b;

    /* renamed from: c */
    private final String f39459c;

    private C15254k(String str, String str2) {
        C15267r.m44385a(str, (Object) "log tag cannot be null");
        C15267r.m44396b(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, Integer.valueOf(23));
        this.f39458b = str;
        this.f39459c = null;
    }

    public C15254k(String str) {
        this(str, null);
    }
}
