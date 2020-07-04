package com.p280ss.android.http.legacy.p875b;

import org.apache.http.params.HttpParams;

/* renamed from: com.ss.android.http.legacy.b.a */
public final class C19569a {
    /* renamed from: a */
    public static void m64474a(HttpParams httpParams, String str) {
        if (httpParams != null) {
            httpParams.setParameter("http.useragent", str);
            return;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }
}
