package com.p280ss.android.ugc.aweme.commercialize.coupon.model;

import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.commercialize.coupon.model.CouponPayType */
public enum CouponPayType {
    FREE_COUPON(1),
    PAY_COUPON(2);
    
    public static final C24592a Companion = null;
    private final int value;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.coupon.model.CouponPayType$a */
    public static final class C24592a {
        private C24592a() {
        }

        public /* synthetic */ C24592a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static CouponPayType m80643a(int i) {
            CouponPayType[] values;
            for (CouponPayType couponPayType : CouponPayType.values()) {
                if (couponPayType.getValue() == i) {
                    return couponPayType;
                }
            }
            return CouponPayType.FREE_COUPON;
        }
    }

    public final int getValue() {
        return this.value;
    }

    static {
        Companion = new C24592a(null);
    }

    private CouponPayType(int i) {
        this.value = i;
    }
}
