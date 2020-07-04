package com.bytedance.android.livesdk.commerce;

import com.bytedance.android.live.base.model.feed.C2344a;
import com.bytedance.android.live.network.response.C3474a;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.retrofit2.p264b.C6450ac;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6474y;
import p346io.reactivex.C7492s;

public interface LiveCommerceApi {

    /* renamed from: a */
    public static final C5828a f17163a = C5828a.f17164a;

    /* renamed from: com.bytedance.android.livesdk.commerce.LiveCommerceApi$a */
    public static final class C5828a {

        /* renamed from: a */
        static final /* synthetic */ C5828a f17164a = new C5828a();

        private C5828a() {
        }
    }

    @C6457h
    C7492s<C3474a<C5851e, C2344a>> fetchLiveCommerce(@C6450ac String str, @C6474y(mo15757a = "user_id") long j, @C6474y(mo15757a = "offset") long j2, @C6474y(mo15757a = "count") long j3, @C6474y(mo15757a = "from") String str2);

    @C6457h
    C7492s<C3479d<C5853g>> fetchLiveGoodsUserStatus(@C6450ac String str, @C6474y(mo15757a = "user_id") long j);
}
