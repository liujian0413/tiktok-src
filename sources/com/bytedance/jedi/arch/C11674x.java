package com.bytedance.jedi.arch;

/* renamed from: com.bytedance.jedi.arch.x */
public final class C11674x<T> extends C11491a<T> {

    /* renamed from: a */
    public final T f31360a;

    /* renamed from: a */
    public final T mo29046a() {
        return this.f31360a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r1.f31360a, (java.lang.Object) ((com.bytedance.jedi.arch.C11674x) r2).f31360a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.bytedance.jedi.arch.C11674x
            if (r0 == 0) goto L_0x0013
            com.bytedance.jedi.arch.x r2 = (com.bytedance.jedi.arch.C11674x) r2
            T r0 = r1.f31360a
            T r2 = r2.f31360a
            boolean r2 = kotlin.jvm.internal.C7573i.m23585a(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jedi.arch.C11674x.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        T t = this.f31360a;
        if (t != null) {
            return t.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(value=");
        sb.append(this.f31360a);
        sb.append(")");
        return sb.toString();
    }

    public C11674x(T t) {
        super(null);
        this.f31360a = t;
    }
}
