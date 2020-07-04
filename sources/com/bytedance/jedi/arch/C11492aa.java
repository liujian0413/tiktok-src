package com.bytedance.jedi.arch;

/* renamed from: com.bytedance.jedi.arch.aa */
public final class C11492aa<A, B, C> {

    /* renamed from: a */
    public final A f31081a;

    /* renamed from: b */
    public final B f31082b;

    /* renamed from: c */
    public final C f31083c;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f31083c, (java.lang.Object) r3.f31083c) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.bytedance.jedi.arch.C11492aa
            if (r0 == 0) goto L_0x0027
            com.bytedance.jedi.arch.aa r3 = (com.bytedance.jedi.arch.C11492aa) r3
            A r0 = r2.f31081a
            A r1 = r3.f31081a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0027
            B r0 = r2.f31082b
            B r1 = r3.f31082b
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0027
            C r0 = r2.f31083c
            C r3 = r3.f31083c
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r3 = 0
            return r3
        L_0x0029:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jedi.arch.C11492aa.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        A a = this.f31081a;
        int i = 0;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        B b = this.f31082b;
        int hashCode2 = (hashCode + (b != null ? b.hashCode() : 0)) * 31;
        C c = this.f31083c;
        if (c != null) {
            i = c.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Tuple3(a=");
        sb.append(this.f31081a);
        sb.append(", b=");
        sb.append(this.f31082b);
        sb.append(", c=");
        sb.append(this.f31083c);
        sb.append(")");
        return sb.toString();
    }
}
