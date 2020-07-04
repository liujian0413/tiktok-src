package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C15267r;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.z */
final class C16961z implements Runnable {

    /* renamed from: a */
    private final C16960y f47511a;

    /* renamed from: b */
    private final int f47512b;

    /* renamed from: c */
    private final Throwable f47513c;

    /* renamed from: d */
    private final byte[] f47514d;

    /* renamed from: e */
    private final String f47515e;

    /* renamed from: f */
    private final Map<String, List<String>> f47516f;

    private C16961z(String str, C16960y yVar, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        C15267r.m44384a(yVar);
        this.f47511a = yVar;
        this.f47512b = i;
        this.f47513c = th;
        this.f47514d = bArr;
        this.f47515e = str;
        this.f47516f = map;
    }

    public final void run() {
        this.f47511a.mo43878a(this.f47515e, this.f47512b, this.f47513c, this.f47514d, this.f47516f);
    }
}
