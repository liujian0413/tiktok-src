package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.chatroom.model.C4924t;
import com.bytedance.android.livesdk.chatroom.model.C4925u;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6474y;
import p346io.reactivex.C7492s;

public interface LotteryApi {
    @C6457h(mo15740a = "/webcast/lottery/melon/check_user_right/")
    C7492s<C3479d<C4924t>> checkUserRight(@C6474y(mo15757a = "room_id") long j, @C6474y(mo15757a = "lottery_id") long j2);

    @C6457h(mo15740a = "/webcast/lottery/melon/check_user_right/")
    C7492s<C3479d<C4924t>> checkUserRightWithRoomId(@C6474y(mo15757a = "room_id") long j);

    @C6457h(mo15740a = "/webcast/lottery/melon/lottery_config/")
    C7492s<C3479d<C4925u>> getConfig(@C6474y(mo15757a = "room_id") long j, @C6474y(mo15757a = "anchor_id") long j2);
}
