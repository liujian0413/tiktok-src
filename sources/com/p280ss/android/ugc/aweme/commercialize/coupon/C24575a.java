package com.p280ss.android.ugc.aweme.commercialize.coupon;

import android.content.Context;
import com.p280ss.android.ugc.aweme.commercialize.coupon.model.CouponCodeStatus;
import com.p280ss.android.ugc.aweme.commercialize.coupon.model.CouponInfo;
import com.p280ss.android.ugc.aweme.commercialize.coupon.model.CouponPayType.C24592a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.commercialize.coupon.a */
public final class C24575a {
    /* renamed from: a */
    public static String m80616a(CouponInfo couponInfo) {
        String str = "";
        if (couponInfo.getCouponSource() == 0) {
            return "poi_offline";
        }
        if (couponInfo.getCouponSource() == 1 && couponInfo.getCouponType() == 1) {
            return "ad_online";
        }
        if (couponInfo.getCouponSource() == 1 && couponInfo.getCouponType() == 0) {
            return "ad_offline";
        }
        return str;
    }

    /* renamed from: a */
    public static String m80614a(Context context, int i) {
        String str = "";
        switch (C24592a.m80643a(i)) {
            case FREE_COUPON:
                return context.getResources().getString(R.string.ahs);
            case PAY_COUPON:
                return context.getResources().getString(R.string.ai4);
            default:
                return str;
        }
    }

    /* renamed from: a */
    public static String m80615a(Context context, int i, boolean z) {
        String str;
        String str2 = "";
        switch (CouponCodeStatus.getStatus(i)) {
            case StatusUnReceived:
                if (!z) {
                    str = "";
                    break;
                } else {
                    str = "unclaimed";
                    break;
                }
            case StatusValid:
                if (!z) {
                    str = context.getString(R.string.aig);
                    break;
                } else {
                    str = "valid";
                    break;
                }
            case StatusRedeemed:
                if (!z) {
                    str = context.getString(R.string.ahv);
                    break;
                } else {
                    str = "used";
                    break;
                }
            case StatusExpired:
                if (!z) {
                    str = context.getString(R.string.ai2);
                    break;
                } else {
                    str = "invalid";
                    break;
                }
            case StatusRefunded:
                return context.getString(R.string.ai9);
            default:
                return str2;
        }
        return str;
    }
}
