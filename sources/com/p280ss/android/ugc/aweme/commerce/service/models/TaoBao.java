package com.p280ss.android.ugc.aweme.commerce.service.models;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.commerce.service.models.TaoBao */
public final class TaoBao implements Serializable {
    @C6593c(mo15949a = "coupon")
    private TaobaoCouponInfo coupon;

    public static /* synthetic */ TaoBao copy$default(TaoBao taoBao, TaobaoCouponInfo taobaoCouponInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            taobaoCouponInfo = taoBao.coupon;
        }
        return taoBao.copy(taobaoCouponInfo);
    }

    public final TaobaoCouponInfo component1() {
        return this.coupon;
    }

    public final TaoBao copy(TaobaoCouponInfo taobaoCouponInfo) {
        return new TaoBao(taobaoCouponInfo);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r1.coupon, (java.lang.Object) ((com.p280ss.android.ugc.aweme.commerce.service.models.TaoBao) r2).coupon) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p280ss.android.ugc.aweme.commerce.service.models.TaoBao
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.commerce.service.models.TaoBao r2 = (com.p280ss.android.ugc.aweme.commerce.service.models.TaoBao) r2
            com.ss.android.ugc.aweme.commerce.service.models.TaobaoCouponInfo r0 = r1.coupon
            com.ss.android.ugc.aweme.commerce.service.models.TaobaoCouponInfo r2 = r2.coupon
            boolean r2 = kotlin.jvm.internal.C7573i.m23585a(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commerce.service.models.TaoBao.equals(java.lang.Object):boolean");
    }

    public final TaobaoCouponInfo getCoupon() {
        return this.coupon;
    }

    public final int hashCode() {
        TaobaoCouponInfo taobaoCouponInfo = this.coupon;
        if (taobaoCouponInfo != null) {
            return taobaoCouponInfo.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TaoBao(coupon=");
        sb.append(this.coupon);
        sb.append(")");
        return sb.toString();
    }

    public final void setCoupon(TaobaoCouponInfo taobaoCouponInfo) {
        this.coupon = taobaoCouponInfo;
    }

    public TaoBao(TaobaoCouponInfo taobaoCouponInfo) {
        this.coupon = taobaoCouponInfo;
    }
}
