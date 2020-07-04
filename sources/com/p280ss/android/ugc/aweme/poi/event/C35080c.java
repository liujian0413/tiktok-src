package com.p280ss.android.ugc.aweme.poi.event;

/* renamed from: com.ss.android.ugc.aweme.poi.event.c */
public final class C35080c {

    /* renamed from: a */
    public final Boolean f91740a;

    /* renamed from: b */
    public final String f91741b;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f91741b, (java.lang.Object) r3.f91741b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.poi.event.C35080c
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.poi.event.c r3 = (com.p280ss.android.ugc.aweme.poi.event.C35080c) r3
            java.lang.Boolean r0 = r2.f91740a
            java.lang.Boolean r1 = r3.f91740a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.f91741b
            java.lang.String r3 = r3.f91741b
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.poi.event.C35080c.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Boolean bool = this.f91740a;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        String str = this.f91741b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PoiPageStateEvent(visible=");
        sb.append(this.f91740a);
        sb.append(", poiId=");
        sb.append(this.f91741b);
        sb.append(")");
        return sb.toString();
    }

    public C35080c(Boolean bool, String str) {
        this.f91740a = bool;
        this.f91741b = str;
    }
}
