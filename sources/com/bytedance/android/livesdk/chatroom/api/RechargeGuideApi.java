package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6472w;
import p346io.reactivex.C7492s;

public interface RechargeGuideApi {
    @C6457h(mo15740a = "/live/room/{room_id}/notify_first_charge/")
    C7492s<C3479d<Object>> notifyAnchor(@C6472w(mo15754a = "room_id") long j);
}
