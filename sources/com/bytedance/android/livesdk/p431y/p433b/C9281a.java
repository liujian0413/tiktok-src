package com.bytedance.android.livesdk.p431y.p433b;

import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.browser.C3142b;
import com.bytedance.android.live.core.p148d.C3171d;
import com.bytedance.android.live.core.p148d.C3172e;
import com.bytedance.android.livesdk.log.alog.C8427a;
import com.bytedance.android.livesdk.log.alog.TTLiveALogTag;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.y.b.a */
public final class C9281a {
    /* renamed from: a */
    public static C3142b m27616a(final String str) {
        return new C3142b() {
            /* renamed from: a */
            public final void mo9979a(HashMap<String, Object> hashMap) {
                C3172e.m12001a(C3171d.m11992a(str), 0, (Map<String, Object>) hashMap);
            }

            /* renamed from: a */
            public final void mo9978a(long j, HashMap<String, Object> hashMap) {
                C3172e.m11999a(C3171d.m11992a(str), 1, j, (Map<String, Object>) hashMap);
            }

            /* renamed from: c */
            public final void mo9981c(long j, HashMap<String, Object> hashMap) {
                C3172e.m11999a(C3171d.m11992a(str), 3, j, (Map<String, Object>) hashMap);
            }

            /* renamed from: b */
            public final void mo9980b(long j, HashMap<String, Object> hashMap) {
                C3172e.m11999a(C3171d.m11992a(str), 2, j, (Map<String, Object>) hashMap);
                C3172e.m11999a(C3171d.m11993b(str), 2, j, (Map<String, Object>) hashMap);
                C8427a.m25623a().mo21578a(TTLiveALogTag.Recharge.info, str, 1, (Map) hashMap);
            }
        };
    }

    /* renamed from: a */
    public static int m27615a(IUser iUser) {
        if (iUser.getUserHonor() == null || iUser.getUserHonor().mo8710n() != 0) {
            return 0;
        }
        return 1;
    }

    /* renamed from: c */
    public static void m27621c(int i, long j, Map<String, Object> map) {
        C3172e.m11999a(C3171d.m11992a("ttlive_charge_package_from_google"), i, j, map);
    }

    /* renamed from: d */
    public static void m27622d(int i, long j, Map<String, Object> map) {
        C3172e.m11999a(C3171d.m11993b("ttlive_charge_package_from_google"), i, j, map);
    }

    /* renamed from: e */
    public static void m27623e(int i, long j, Map<String, Object> map) {
        C3172e.m11999a(C3171d.m11992a("ttlive_charge_order"), i, j, map);
    }

    /* renamed from: f */
    public static void m27624f(int i, long j, Map<String, Object> map) {
        C3172e.m11999a(C3171d.m11993b("ttlive_charge_order"), i, j, map);
    }

    /* renamed from: g */
    public static void m27625g(int i, long j, Map<String, Object> map) {
        C3172e.m11999a(C3171d.m11992a("ttlive_charge_current_diamond_status"), i, j, map);
    }

    /* renamed from: h */
    public static void m27626h(int i, long j, Map<String, Object> map) {
        C3172e.m11999a(C3171d.m11993b("ttlive_charge_current_diamond_status"), 1, j, map);
    }

    /* renamed from: i */
    public static void m27627i(int i, long j, Map<String, Object> map) {
        C3172e.m11999a(C3171d.m11992a("ttlive_charge_pay_param_status"), i, j, map);
    }

    /* renamed from: b */
    public static void m27620b(int i, long j, Map<String, Object> map) {
        C3172e.m11999a(C3171d.m11993b("ttlive_charge_package_list_status"), i, j, map);
    }

    /* renamed from: a */
    public static void m27618a(int i, long j, Map<String, Object> map) {
        C3172e.m11999a(C3171d.m11992a("ttlive_charge_package_list_status"), i, j, map);
    }

    /* renamed from: a */
    public static void m27617a(int i, int i2, long j, Map<String, Object> map) {
        C3172e.m11999a(C3171d.m11992a("ttlive_charge_pay_sequence"), i2 + i, j, map);
    }

    /* renamed from: b */
    public static void m27619b(int i, int i2, long j, Map<String, Object> map) {
        C3172e.m11999a(C3171d.m11993b("ttlive_charge_pay_sequence"), i2 + i, 0, map);
    }
}
