package com.p280ss.android.ugc.trill.share.helo.p1771d;

/* renamed from: com.ss.android.ugc.trill.share.helo.d.b */
public final class C45149b {

    /* renamed from: a */
    public final String f116004a;

    /* renamed from: b */
    public final String f116005b;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f116005b, (java.lang.Object) r3.f116005b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p280ss.android.ugc.trill.share.helo.p1771d.C45149b
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.trill.share.helo.d.b r3 = (com.p280ss.android.ugc.trill.share.helo.p1771d.C45149b) r3
            java.lang.String r0 = r2.f116004a
            java.lang.String r1 = r3.f116004a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.f116005b
            java.lang.String r3 = r3.f116005b
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.trill.share.helo.p1771d.C45149b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f116004a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f116005b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeloOpenApiParam(_hostAuthTicketDomain=");
        sb.append(this.f116004a);
        sb.append(", _hostAuthCodeDomain=");
        sb.append(this.f116005b);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public final String mo107706a() {
        String str = this.f116004a;
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: b */
    public final String mo107707b() {
        String str = this.f116005b;
        if (str == null) {
            return "";
        }
        return str;
    }

    public C45149b(String str, String str2) {
        this.f116004a = str;
        this.f116005b = str2;
    }
}
