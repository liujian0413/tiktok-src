package com.p280ss.android.ugc.aweme.shortvideo.videocategory.repository.p1623a.p1624a;

import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.repository.a.a.a */
public abstract class C41598a<T> implements C41599b<T> {
    /* renamed from: a */
    private static void m132445a(T t, Exception exc) {
        C7573i.m23587b(exc, "exception");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo102224b(T t);

    /* renamed from: e */
    private final int m132446e() {
        int a = mo102225a();
        if (a > 0) {
            return a;
        }
        StringBuilder sb = new StringBuilder("illegal capacity <= 0, capacity is ");
        sb.append(a);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public final boolean mo102223a(T t) {
        boolean z;
        try {
            z = mo102224b(t);
        } catch (Exception e) {
            m132445a(t, e);
            C6921a.m21559a((Throwable) e);
            z = false;
        }
        if (!z) {
            return z;
        }
        mo102226b();
        m132446e();
        return true;
    }
}
