package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6474y;
import p346io.reactivex.C7492s;

public interface BanTalkApi {
    @C6457h(mo15740a = "/webcast/room/silence/")
    C7492s<C3479d<Object>> silence(@C6474y(mo15757a = "room_id") long j, @C6474y(mo15757a = "user_id") long j2);

    @C6457h(mo15740a = "/webcast/room/unsilence/")
    C7492s<C3479d<Object>> unsilence(@C6474y(mo15757a = "room_id") long j, @C6474y(mo15757a = "user_id") long j2);
}
