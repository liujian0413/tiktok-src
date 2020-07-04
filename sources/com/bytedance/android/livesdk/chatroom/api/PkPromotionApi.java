package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.chatroom.model.C4874ai;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6474y;
import p346io.reactivex.C7492s;

public interface PkPromotionApi {
    @C6457h(mo15740a = "/hotsoon/linkmic/v3/battle/medal/")
    C7492s<C3479d<C4874ai>> getCurrentMedal(@C6474y(mo15757a = "uid") long j);
}
