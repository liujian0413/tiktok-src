package com.bytedance.android.livesdk.coupon;

import com.bytedance.retrofit2.p264b.C6455f;
import com.bytedance.retrofit2.p264b.C6456g;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6468s;
import com.bytedance.retrofit2.p264b.C6474y;
import java.util.Map;
import p346io.reactivex.C7492s;

public interface LiveCouponApi {
    @C6457h(mo15740a = "https://lianmengapi.snssdk.com/live/coupon/getcurrent/")
    C7492s<C5872d> queryCurCouponInfo(@C6474y(mo15757a = "room_id") long j);

    @C6456g
    @C6468s(mo15750a = "https://lianmengapi.snssdk.com/live/coupon/apply/")
    C7492s<C5869a> tryApplyCurCouponInfo(@C6455f Map<String, String> map);
}
