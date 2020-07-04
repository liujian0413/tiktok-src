package com.p280ss.android.ugc.aweme.poi.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.poi.model.PoiQRDetailStruct */
public final class PoiQRDetailStruct extends BaseResponse implements Serializable {
    @C6593c(mo15949a = "coupon_activity")
    private final PoiCouponActivityStruct activity;
    @C6593c(mo15949a = "challenge")
    private final Challenge challenge;
    private Exception poiActivityException;

    public static /* synthetic */ PoiQRDetailStruct copy$default(PoiQRDetailStruct poiQRDetailStruct, PoiCouponActivityStruct poiCouponActivityStruct, Challenge challenge2, int i, Object obj) {
        if ((i & 1) != 0) {
            poiCouponActivityStruct = poiQRDetailStruct.activity;
        }
        if ((i & 2) != 0) {
            challenge2 = poiQRDetailStruct.challenge;
        }
        return poiQRDetailStruct.copy(poiCouponActivityStruct, challenge2);
    }

    public final PoiCouponActivityStruct component1() {
        return this.activity;
    }

    public final Challenge component2() {
        return this.challenge;
    }

    public final PoiQRDetailStruct copy(PoiCouponActivityStruct poiCouponActivityStruct, Challenge challenge2) {
        return new PoiQRDetailStruct(poiCouponActivityStruct, challenge2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.challenge, (java.lang.Object) r3.challenge) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.poi.model.PoiQRDetailStruct
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.poi.model.PoiQRDetailStruct r3 = (com.p280ss.android.ugc.aweme.poi.model.PoiQRDetailStruct) r3
            com.ss.android.ugc.aweme.poi.model.PoiCouponActivityStruct r0 = r2.activity
            com.ss.android.ugc.aweme.poi.model.PoiCouponActivityStruct r1 = r3.activity
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.discover.model.Challenge r0 = r2.challenge
            com.ss.android.ugc.aweme.discover.model.Challenge r3 = r3.challenge
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.poi.model.PoiQRDetailStruct.equals(java.lang.Object):boolean");
    }

    public final PoiCouponActivityStruct getActivity() {
        return this.activity;
    }

    public final Challenge getChallenge() {
        return this.challenge;
    }

    public final Exception getException() {
        return this.poiActivityException;
    }

    public final int hashCode() {
        PoiCouponActivityStruct poiCouponActivityStruct = this.activity;
        int i = 0;
        int hashCode = (poiCouponActivityStruct != null ? poiCouponActivityStruct.hashCode() : 0) * 31;
        Challenge challenge2 = this.challenge;
        if (challenge2 != null) {
            i = challenge2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PoiQRDetailStruct(activity=");
        sb.append(this.activity);
        sb.append(", challenge=");
        sb.append(this.challenge);
        sb.append(")");
        return sb.toString();
    }

    public final <T> T checkValid() throws Throwable {
        try {
            super.checkValid();
        } catch (Exception e) {
            this.poiActivityException = e;
        }
        return this;
    }

    public PoiQRDetailStruct(PoiCouponActivityStruct poiCouponActivityStruct, Challenge challenge2) {
        this.activity = poiCouponActivityStruct;
        this.challenge = challenge2;
    }
}
