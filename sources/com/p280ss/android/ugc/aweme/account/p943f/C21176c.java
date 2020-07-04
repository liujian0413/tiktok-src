package com.p280ss.android.ugc.aweme.account.p943f;

/* renamed from: com.ss.android.ugc.aweme.account.f.c */
public final class C21176c {

    /* renamed from: a */
    public final String f56945a;

    /* renamed from: b */
    public final String f56946b;

    /* renamed from: c */
    public final Integer f56947c;

    /* renamed from: d */
    public final String f56948d;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f56948d, (java.lang.Object) r3.f56948d) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0033
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.account.p943f.C21176c
            if (r0 == 0) goto L_0x0031
            com.ss.android.ugc.aweme.account.f.c r3 = (com.p280ss.android.ugc.aweme.account.p943f.C21176c) r3
            java.lang.String r0 = r2.f56945a
            java.lang.String r1 = r3.f56945a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.f56946b
            java.lang.String r1 = r3.f56946b
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.Integer r0 = r2.f56947c
            java.lang.Integer r1 = r3.f56947c
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.f56948d
            java.lang.String r3 = r3.f56948d
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.account.p943f.C21176c.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f56945a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f56946b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.f56947c;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        String str3 = this.f56948d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TwoStepAuthResponse(successTicket=");
        sb.append(this.f56945a);
        sb.append(", profileKey=");
        sb.append(this.f56946b);
        sb.append(", errorCode=");
        sb.append(this.f56947c);
        sb.append(", errorMessage=");
        sb.append(this.f56948d);
        sb.append(")");
        return sb.toString();
    }

    public C21176c(String str, String str2, Integer num, String str3) {
        this.f56945a = str;
        this.f56946b = str2;
        this.f56947c = num;
        this.f56948d = str3;
    }
}
