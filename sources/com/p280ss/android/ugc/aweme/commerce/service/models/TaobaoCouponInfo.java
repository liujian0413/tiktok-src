package com.p280ss.android.ugc.aweme.commerce.service.models;

import android.text.TextUtils;
import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.commerce.service.models.TaobaoCouponInfo */
public final class TaobaoCouponInfo implements Serializable {
    @C6593c(mo15949a = "coupon_amount")
    private String couponAmount;
    @C6593c(mo15949a = "coupon_open_url")
    private String couponOpenUrl;
    @C6593c(mo15949a = "coupon_web_url")
    private String couponWebUrl;

    public TaobaoCouponInfo() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ TaobaoCouponInfo copy$default(TaobaoCouponInfo taobaoCouponInfo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = taobaoCouponInfo.couponAmount;
        }
        if ((i & 2) != 0) {
            str2 = taobaoCouponInfo.couponWebUrl;
        }
        if ((i & 4) != 0) {
            str3 = taobaoCouponInfo.couponOpenUrl;
        }
        return taobaoCouponInfo.copy(str, str2, str3);
    }

    public final String component1() {
        return this.couponAmount;
    }

    public final String component2() {
        return this.couponWebUrl;
    }

    public final String component3() {
        return this.couponOpenUrl;
    }

    public final TaobaoCouponInfo copy(String str, String str2, String str3) {
        return new TaobaoCouponInfo(str, str2, str3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.couponOpenUrl, (java.lang.Object) r3.couponOpenUrl) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.commerce.service.models.TaobaoCouponInfo
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.commerce.service.models.TaobaoCouponInfo r3 = (com.p280ss.android.ugc.aweme.commerce.service.models.TaobaoCouponInfo) r3
            java.lang.String r0 = r2.couponAmount
            java.lang.String r1 = r3.couponAmount
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.couponWebUrl
            java.lang.String r1 = r3.couponWebUrl
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.couponOpenUrl
            java.lang.String r3 = r3.couponOpenUrl
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commerce.service.models.TaobaoCouponInfo.equals(java.lang.Object):boolean");
    }

    public final String getCouponAmount() {
        return this.couponAmount;
    }

    public final String getCouponOpenUrl() {
        return this.couponOpenUrl;
    }

    public final String getCouponWebUrl() {
        return this.couponWebUrl;
    }

    public final int hashCode() {
        String str = this.couponAmount;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.couponWebUrl;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.couponOpenUrl;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TaobaoCouponInfo(couponAmount=");
        sb.append(this.couponAmount);
        sb.append(", couponWebUrl=");
        sb.append(this.couponWebUrl);
        sb.append(", couponOpenUrl=");
        sb.append(this.couponOpenUrl);
        sb.append(")");
        return sb.toString();
    }

    public final boolean isValid() {
        if (TextUtils.isEmpty(this.couponAmount) || (TextUtils.isEmpty(this.couponWebUrl) && TextUtils.isEmpty(this.couponOpenUrl))) {
            return false;
        }
        return true;
    }

    public final void setCouponAmount(String str) {
        this.couponAmount = str;
    }

    public final void setCouponOpenUrl(String str) {
        this.couponOpenUrl = str;
    }

    public final void setCouponWebUrl(String str) {
        this.couponWebUrl = str;
    }

    public TaobaoCouponInfo(String str, String str2, String str3) {
        this.couponAmount = str;
        this.couponWebUrl = str2;
        this.couponOpenUrl = str3;
    }

    public /* synthetic */ TaobaoCouponInfo(String str, String str2, String str3, int i, C7571f fVar) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        this(str, str2, str3);
    }
}
