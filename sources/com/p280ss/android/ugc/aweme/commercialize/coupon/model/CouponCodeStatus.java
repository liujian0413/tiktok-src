package com.p280ss.android.ugc.aweme.commercialize.coupon.model;

/* renamed from: com.ss.android.ugc.aweme.commercialize.coupon.model.CouponCodeStatus */
public enum CouponCodeStatus {
    StatusUnReceived(0),
    StatusValid(1),
    StatusRedeemed(2),
    StatusExpired(3),
    StatusRefunded(6);
    
    public final int value;

    public static CouponCodeStatus getStatus(int i) {
        CouponCodeStatus[] values;
        for (CouponCodeStatus couponCodeStatus : values()) {
            if (couponCodeStatus.value == i) {
                return couponCodeStatus;
            }
        }
        return StatusValid;
    }

    private CouponCodeStatus(int i) {
        this.value = i;
    }
}
