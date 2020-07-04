package com.bytedance.android.livesdk.p397k;

import android.util.SparseArray;
import java.util.Random;

/* renamed from: com.bytedance.android.livesdk.k.b */
public final class C8347b {

    /* renamed from: a */
    private static SparseArray<C8348a> f22893a;

    /* renamed from: com.bytedance.android.livesdk.k.b$a */
    public static final class C8348a {

        /* renamed from: a */
        public String f22894a;

        /* renamed from: b */
        public String f22895b;

        /* renamed from: c */
        public String f22896c;

        /* renamed from: d */
        private int f22897d;

        public C8348a(int i, String str, String str2, String str3) {
            this.f22897d = i;
            this.f22894a = str;
            this.f22895b = str2;
            this.f22896c = str3;
        }
    }

    /* renamed from: a */
    public static C8348a m25441a() {
        return m25442a(5);
    }

    static {
        SparseArray<C8348a> sparseArray = new SparseArray<>();
        f22893a = sparseArray;
        sparseArray.put(1, new C8348a(1, "livefreegift_v1.2", "https://lf1-xgcdn-tos.pstatp.com/obj/xigua-live/livefreegift_v1.2.zip", "live_freegift_resource"));
        f22893a.put(2, new C8348a(2, "livelottery_v1.1", "https://lf1-xgcdn-tos.pstatp.com/obj/xigua-live/livelottery_v1.1.zip", "live_lottery_resource"));
        f22893a.put(3, new C8348a(3, "fans_medal_v1.1", "https://sf1-ttcdn-tos.pstatp.com/obj/ttfe/xigua/live/fans_medal_v1.1.zip", "live_fans_medal_resouce"));
        f22893a.put(4, new C8348a(4, "liveredpacket_v1.2", "https://sf1-ttcdn-tos.pstatp.com/obj/ttfe/xigua/liveredpacket_v1.2.zip", "live_red_packet_resource"));
        String[] strArr = {"sf1-ttcdn-tos.pstatp.com", "sf3-ttcdn-tos.pstatp.com", "sf6-ttcdn-tos.pstatp.com"};
        new Random().nextInt(3);
        f22893a.put(5, new C8348a(5, "live_coupon_v1.2", "https://sf1-ttcdn-tos.pstatp.com/obj/ttfe/xigua/live/live_coupon_v1.2.zip", "live_coupon_resource"));
    }

    /* renamed from: a */
    public static C8348a m25442a(int i) {
        if (f22893a != null) {
            return (C8348a) f22893a.get(i);
        }
        return null;
    }
}
