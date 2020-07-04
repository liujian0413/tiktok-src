package com.p280ss.android.ugc.aweme.services.publish;

/* renamed from: com.ss.android.ugc.aweme.services.publish.MobParam */
public final class MobParam {
    private final String creationId;
    private final String enterFrom;
    private final String shootWay;

    public static /* synthetic */ MobParam copy$default(MobParam mobParam, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mobParam.enterFrom;
        }
        if ((i & 2) != 0) {
            str2 = mobParam.shootWay;
        }
        if ((i & 4) != 0) {
            str3 = mobParam.creationId;
        }
        return mobParam.copy(str, str2, str3);
    }

    public final String component1() {
        return this.enterFrom;
    }

    public final String component2() {
        return this.shootWay;
    }

    public final String component3() {
        return this.creationId;
    }

    public final MobParam copy(String str, String str2, String str3) {
        return new MobParam(str, str2, str3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.creationId, (java.lang.Object) r3.creationId) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.services.publish.MobParam
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.services.publish.MobParam r3 = (com.p280ss.android.ugc.aweme.services.publish.MobParam) r3
            java.lang.String r0 = r2.enterFrom
            java.lang.String r1 = r3.enterFrom
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.shootWay
            java.lang.String r1 = r3.shootWay
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.creationId
            java.lang.String r3 = r3.creationId
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.services.publish.MobParam.equals(java.lang.Object):boolean");
    }

    public final String getCreationId() {
        return this.creationId;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getShootWay() {
        return this.shootWay;
    }

    public final int hashCode() {
        String str = this.enterFrom;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.shootWay;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.creationId;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MobParam(enterFrom=");
        sb.append(this.enterFrom);
        sb.append(", shootWay=");
        sb.append(this.shootWay);
        sb.append(", creationId=");
        sb.append(this.creationId);
        sb.append(")");
        return sb.toString();
    }

    public MobParam(String str, String str2, String str3) {
        this.enterFrom = str;
        this.shootWay = str2;
        this.creationId = str3;
    }
}
