package com.p280ss.android.ugc.aweme.poi.model;

import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;

/* renamed from: com.ss.android.ugc.aweme.poi.model.PoiCouponType */
public enum PoiCouponType {
    General(1),
    CouponRedPacket(2),
    PoiAd(BaseNotice.HASHTAG);
    
    public final int value;

    public static PoiCouponType getStatus(int i) {
        PoiCouponType[] values;
        for (PoiCouponType poiCouponType : values()) {
            if (poiCouponType.value == i) {
                return poiCouponType;
            }
        }
        return General;
    }

    private PoiCouponType(int i) {
        this.value = i;
    }
}
