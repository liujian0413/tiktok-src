package com.p280ss.android.ugc.aweme.discover.api.p1174a;

import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.api.a.a */
public final class C26568a<T> {

    /* renamed from: a */
    public boolean f70088a;

    /* renamed from: b */
    public T f70089b;

    /* renamed from: c */
    public Exception f70090c;

    public C26568a(Exception exc) {
        C7573i.m23587b(exc, "e");
        this.f70090c = exc;
        this.f70088a = false;
    }

    public C26568a(T t) {
        this.f70088a = true;
        this.f70089b = t;
    }

    public C26568a(boolean z, T t) {
        this.f70088a = z;
        this.f70089b = t;
    }
}
