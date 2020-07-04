package com.p280ss.android.ugc.trill.share.helo.p1771d;

/* renamed from: com.ss.android.ugc.trill.share.helo.d.a */
public final class C45148a {

    /* renamed from: a */
    public final String f116002a;

    /* renamed from: b */
    public final String f116003b;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f116003b, (java.lang.Object) r3.f116003b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p280ss.android.ugc.trill.share.helo.p1771d.C45148a
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.trill.share.helo.d.a r3 = (com.p280ss.android.ugc.trill.share.helo.p1771d.C45148a) r3
            java.lang.String r0 = r2.f116002a
            java.lang.String r1 = r3.f116002a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.f116003b
            java.lang.String r3 = r3.f116003b
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.trill.share.helo.p1771d.C45148a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f116002a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f116003b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeloAuthParam(_userName=");
        sb.append(this.f116002a);
        sb.append(", _userAvatar=");
        sb.append(this.f116003b);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public final String mo107701a() {
        String str = this.f116002a;
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: b */
    public final String mo107702b() {
        String str = this.f116003b;
        if (str == null) {
            return "";
        }
        return str;
    }

    public C45148a(String str, String str2) {
        this.f116002a = str;
        this.f116003b = str2;
    }
}
