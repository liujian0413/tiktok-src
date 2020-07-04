package com.bytedance.jedi.arch;

/* renamed from: com.bytedance.jedi.arch.z */
public final class C11676z<A, B> {

    /* renamed from: a */
    public final A f31362a;

    /* renamed from: b */
    public final B f31363b;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f31363b, (java.lang.Object) r3.f31363b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.bytedance.jedi.arch.C11676z
            if (r0 == 0) goto L_0x001d
            com.bytedance.jedi.arch.z r3 = (com.bytedance.jedi.arch.C11676z) r3
            A r0 = r2.f31362a
            A r1 = r3.f31362a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x001d
            B r0 = r2.f31363b
            B r3 = r3.f31363b
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jedi.arch.C11676z.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        A a = this.f31362a;
        int i = 0;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        B b = this.f31363b;
        if (b != null) {
            i = b.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Tuple2(a=");
        sb.append(this.f31362a);
        sb.append(", b=");
        sb.append(this.f31363b);
        sb.append(")");
        return sb.toString();
    }

    public C11676z(A a, B b) {
        this.f31362a = a;
        this.f31363b = b;
    }
}
