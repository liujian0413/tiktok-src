package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.gift.model.C8158m;
import com.bytedance.retrofit2.p264b.C6454e;
import com.bytedance.retrofit2.p264b.C6456g;
import com.bytedance.retrofit2.p264b.C6468s;
import com.bytedance.retrofit2.p264b.C6474y;
import p346io.reactivex.C7492s;

public interface DoodleGiftApi {
    @C6456g
    @C6468s(mo15750a = "/webcast/gift/send/")
    C7492s<C3479d<C8158m>> sendDoodleGift(@C6454e(mo15737a = "gift_id") long j, @C6474y(mo15757a = "room_id") long j2, @C6454e(mo15737a = "compose") String str, @C6454e(mo15737a = "to_user_id") long j3);
}
