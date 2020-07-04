package com.bytedance.android.live.broadcast.api;

import com.bytedance.android.live.broadcast.model.C2750b;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.retrofit2.p264b.C6457h;
import p346io.reactivex.C7492s;

public interface BanUserInfoApi {
    @C6457h(mo15740a = "/webcast/user/ban_detail/")
    C7492s<C3479d<C2750b>> getBanUserInfo();
}
