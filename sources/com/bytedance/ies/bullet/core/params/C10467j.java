package com.bytedance.ies.bullet.core.params;

import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C48006q;

/* renamed from: com.bytedance.ies.bullet.core.params.j */
public class C10467j<T> implements C10463f<T> {

    /* renamed from: a */
    public final C10465h<T> f28179a;

    /* renamed from: b */
    public final T f28180b;

    /* renamed from: c */
    private T f28181c;

    /* renamed from: d */
    private boolean f28182d;

    /* renamed from: e */
    private final String f28183e;

    /* renamed from: c */
    private boolean m30829c() {
        return this.f28182d;
    }

    /* renamed from: a */
    public final String mo25248a() {
        return this.f28183e;
    }

    /* renamed from: b */
    public final T mo25251b() {
        T t = this.f28181c;
        if (t == null) {
            return this.f28180b;
        }
        return t;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Param(");
        sb.append(this.f28179a);
        sb.append("){key: ");
        sb.append(mo25248a());
        sb.append(", value: ");
        sb.append(mo25251b());
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    private void m30828a(boolean z) {
        this.f28182d = true;
    }

    /* renamed from: a */
    public final void mo25250a(T t) {
        this.f28181c = t;
    }

    /* renamed from: b */
    public final <R> R mo25252b(Class<R> cls, R r) {
        C7573i.m23587b(cls, "inputType");
        C48006q b = this.f28179a.mo25258b(cls);
        if (b == null) {
            return r;
        }
        T t = this.f28181c;
        if (t != null) {
            return b.invoke(r, mo25248a(), t);
        }
        return r;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (r2 == null) goto L_0x0017;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <R> void mo25249a(java.lang.Class<R> r2, R r3) {
        /*
            r1 = this;
            java.lang.String r0 = "inputType"
            kotlin.jvm.internal.C7573i.m23587b(r2, r0)
            com.bytedance.ies.bullet.core.params.h<T> r0 = r1.f28179a
            kotlin.jvm.a.m r2 = r0.mo25255a(r2)
            if (r2 == 0) goto L_0x0017
            java.lang.String r0 = r1.mo25248a()
            java.lang.Object r2 = r2.invoke(r3, r0)
            if (r2 != 0) goto L_0x0020
        L_0x0017:
            boolean r2 = r1.m30829c()
            if (r2 == 0) goto L_0x001e
            return
        L_0x001e:
            T r2 = r1.f28180b
        L_0x0020:
            r1.mo25250a((T) r2)
            r2 = 1
            r1.m30828a(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.core.params.C10467j.mo25249a(java.lang.Class, java.lang.Object):void");
    }

    public C10467j(String str, C10465h<T> hVar, T t) {
        C7573i.m23587b(str, "key");
        C7573i.m23587b(hVar, "type");
        this.f28183e = str;
        this.f28179a = hVar;
        this.f28180b = t;
    }

    public /* synthetic */ C10467j(String str, C10465h hVar, Object obj, int i, C7571f fVar) {
        this(str, hVar, null);
    }
}
