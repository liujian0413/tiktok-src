package com.bytedance.jedi.arch;

/* renamed from: com.bytedance.jedi.arch.y */
public final class C11675y<A> {

    /* renamed from: a */
    public final A f31361a;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r1.f31361a, (java.lang.Object) ((com.bytedance.jedi.arch.C11675y) r2).f31361a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.bytedance.jedi.arch.C11675y
            if (r0 == 0) goto L_0x0013
            com.bytedance.jedi.arch.y r2 = (com.bytedance.jedi.arch.C11675y) r2
            A r0 = r1.f31361a
            A r2 = r2.f31361a
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jedi.arch.C11675y.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        A a = this.f31361a;
        if (a != null) {
            return a.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Tuple1(a=");
        sb.append(this.f31361a);
        sb.append(")");
        return sb.toString();
    }

    public C11675y(A a) {
        this.f31361a = a;
    }
}
