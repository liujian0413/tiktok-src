package com.bytedance.android.live.broadcast.api;

import com.bytedance.android.live.broadcast.model.C2752c;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.retrofit2.p264b.C6457h;
import p346io.reactivex.C7492s;

public interface BroadcastConfigRetrofitApi {
    @C6457h(mo15740a = "/webcast/room/live_scenario/")
    C7492s<C3479d<C2752c>> getBroadcastConfig();
}
