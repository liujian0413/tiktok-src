package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.gift.model.C8159n;
import com.bytedance.retrofit2.p264b.C6454e;
import com.bytedance.retrofit2.p264b.C6456g;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6468s;
import com.bytedance.retrofit2.p264b.C6472w;
import com.bytedance.retrofit2.p264b.C6474y;
import com.google.gson.C6711m;
import p346io.reactivex.C7492s;

public interface TaskGiftApi {
    @C6457h(mo15740a = "/hotsoon/wallet/info/")
    C7492s<C3479d<Object>> getHotsoonTaskGift();

    @C6457h(mo15740a = "/hotsoon/taskgift/?type=7")
    C7492s<C6711m> getHotsoonTaskGiftEvent();

    @C6456g
    @C6468s(mo15750a = "/hotsoon/taskgift/{gift_id}/send/")
    C7492s<C3479d<C8159n>> sendHotsoonTaskGift(@C6472w(mo15754a = "gift_id") long j, @C6454e(mo15737a = "count") long j2, @C6474y(mo15757a = "room_id") long j3);

    @C6456g
    @C6468s(mo15750a = "/webcast/gift/send_task_gift/")
    C7492s<C3479d<C8159n>> sendTaskGift(@C6454e(mo15737a = "task_gift_id") long j, @C6454e(mo15737a = "count") long j2, @C6474y(mo15757a = "room_id") long j3);
}
