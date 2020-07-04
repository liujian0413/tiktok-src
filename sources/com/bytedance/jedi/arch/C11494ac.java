package com.bytedance.jedi.arch;

/* renamed from: com.bytedance.jedi.arch.ac */
public final class C11494ac<A, B, C, D, E> {

    /* renamed from: a */
    public final A f31088a;

    /* renamed from: b */
    public final B f31089b;

    /* renamed from: c */
    public final C f31090c;

    /* renamed from: d */
    public final D f31091d;

    /* renamed from: e */
    public final E f31092e;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f31092e, (java.lang.Object) r3.f31092e) != false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x003d
            boolean r0 = r3 instanceof com.bytedance.jedi.arch.C11494ac
            if (r0 == 0) goto L_0x003b
            com.bytedance.jedi.arch.ac r3 = (com.bytedance.jedi.arch.C11494ac) r3
            A r0 = r2.f31088a
            A r1 = r3.f31088a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x003b
            B r0 = r2.f31089b
            B r1 = r3.f31089b
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x003b
            C r0 = r2.f31090c
            C r1 = r3.f31090c
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x003b
            D r0 = r2.f31091d
            D r1 = r3.f31091d
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x003b
            E r0 = r2.f31092e
            E r3 = r3.f31092e
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r3 = 0
            return r3
        L_0x003d:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jedi.arch.C11494ac.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        A a = this.f31088a;
        int i = 0;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        B b = this.f31089b;
        int hashCode2 = (hashCode + (b != null ? b.hashCode() : 0)) * 31;
        C c = this.f31090c;
        int hashCode3 = (hashCode2 + (c != null ? c.hashCode() : 0)) * 31;
        D d = this.f31091d;
        int hashCode4 = (hashCode3 + (d != null ? d.hashCode() : 0)) * 31;
        E e = this.f31092e;
        if (e != null) {
            i = e.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Tuple5(a=");
        sb.append(this.f31088a);
        sb.append(", b=");
        sb.append(this.f31089b);
        sb.append(", c=");
        sb.append(this.f31090c);
        sb.append(", d=");
        sb.append(this.f31091d);
        sb.append(", e=");
        sb.append(this.f31092e);
        sb.append(")");
        return sb.toString();
    }
}
