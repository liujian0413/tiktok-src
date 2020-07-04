package com.bytedance.jedi.arch;

/* renamed from: com.bytedance.jedi.arch.ab */
public final class C11493ab<A, B, C, D> {

    /* renamed from: a */
    public final A f31084a;

    /* renamed from: b */
    public final B f31085b;

    /* renamed from: c */
    public final C f31086c;

    /* renamed from: d */
    public final D f31087d;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f31087d, (java.lang.Object) r3.f31087d) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0033
            boolean r0 = r3 instanceof com.bytedance.jedi.arch.C11493ab
            if (r0 == 0) goto L_0x0031
            com.bytedance.jedi.arch.ab r3 = (com.bytedance.jedi.arch.C11493ab) r3
            A r0 = r2.f31084a
            A r1 = r3.f31084a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0031
            B r0 = r2.f31085b
            B r1 = r3.f31085b
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0031
            C r0 = r2.f31086c
            C r1 = r3.f31086c
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0031
            D r0 = r2.f31087d
            D r3 = r3.f31087d
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            return r3
        L_0x0033:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jedi.arch.C11493ab.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        A a = this.f31084a;
        int i = 0;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        B b = this.f31085b;
        int hashCode2 = (hashCode + (b != null ? b.hashCode() : 0)) * 31;
        C c = this.f31086c;
        int hashCode3 = (hashCode2 + (c != null ? c.hashCode() : 0)) * 31;
        D d = this.f31087d;
        if (d != null) {
            i = d.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Tuple4(a=");
        sb.append(this.f31084a);
        sb.append(", b=");
        sb.append(this.f31085b);
        sb.append(", c=");
        sb.append(this.f31086c);
        sb.append(", d=");
        sb.append(this.f31087d);
        sb.append(")");
        return sb.toString();
    }

    public C11493ab(A a, B b, C c, D d) {
        this.f31084a = a;
        this.f31085b = b;
        this.f31086c = c;
        this.f31087d = d;
    }
}
