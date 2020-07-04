package com.p280ss.android.ugc.aweme.challenge.p1083b;

import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.challenge.b.b */
public final class C23669b {

    /* renamed from: a */
    public final Integer f62420a;

    /* renamed from: b */
    public final Integer f62421b;

    /* renamed from: c */
    public final Integer f62422c;

    public C23669b() {
        this(null, null, null, 7, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f62422c, (java.lang.Object) r3.f62422c) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.challenge.p1083b.C23669b
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.challenge.b.b r3 = (com.p280ss.android.ugc.aweme.challenge.p1083b.C23669b) r3
            java.lang.Integer r0 = r2.f62420a
            java.lang.Integer r1 = r3.f62420a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.Integer r0 = r2.f62421b
            java.lang.Integer r1 = r3.f62421b
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.Integer r0 = r2.f62422c
            java.lang.Integer r3 = r3.f62422c
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.challenge.p1083b.C23669b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Integer num = this.f62420a;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.f62421b;
        int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.f62422c;
        if (num3 != null) {
            i = num3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextProperty(width=");
        sb.append(this.f62420a);
        sb.append(", height=");
        sb.append(this.f62421b);
        sb.append(", lineCount=");
        sb.append(this.f62422c);
        sb.append(")");
        return sb.toString();
    }

    public C23669b(Integer num, Integer num2, Integer num3) {
        this.f62420a = num;
        this.f62421b = num2;
        this.f62422c = num3;
    }

    public /* synthetic */ C23669b(Integer num, Integer num2, Integer num3, int i, C7571f fVar) {
        this(Integer.valueOf(-1), Integer.valueOf(-1), Integer.valueOf(-1));
    }
}
