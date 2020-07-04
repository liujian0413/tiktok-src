package com.p280ss.android.ugc.aweme.poi.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.commercialize.coupon.model.CouponInfo;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.poi.model.PoiJoinActivityResponse */
public class PoiJoinActivityResponse extends BaseResponse implements Serializable {
    @C6593c(mo15949a = "coupon")
    private CouponInfo couponInfo;

    public CouponInfo getCouponInfo() {
        return this.couponInfo;
    }

    public void setCouponInfo(CouponInfo couponInfo2) {
        this.couponInfo = couponInfo2;
    }
}
