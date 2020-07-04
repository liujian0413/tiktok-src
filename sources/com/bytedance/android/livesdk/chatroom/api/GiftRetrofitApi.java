package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.gift.model.C8152g;
import com.bytedance.android.livesdk.gift.model.C8158m;
import com.bytedance.android.livesdk.gift.model.C8160o;
import com.bytedance.android.livesdk.gift.relay.p392a.C8270b;
import com.bytedance.retrofit2.p264b.C6454e;
import com.bytedance.retrofit2.p264b.C6456g;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6468s;
import com.bytedance.retrofit2.p264b.C6474y;
import p346io.reactivex.C7492s;

public interface GiftRetrofitApi {
    @C6457h(mo15740a = "/webcast/gift/free_cell_stats/")
    C7492s<C3479d<C8270b>> checkFreeCellStatus(@C6474y(mo15757a = "room_id") long j, @C6474y(mo15757a = "anchor_id") long j2, @C6474y(mo15757a = "gift_id") long j3);

    @C6456g
    @C6468s(mo15750a = "/webcast/gift/live_gift_guidance/")
    C7492s<C3479d<Object>> getGiftGuidance(@C6454e(mo15737a = "room_id") String str);

    @C6456g
    @C6468s(mo15750a = "/webcast/gift/game_gift/monkey/")
    C7492s<C3479d> reportMonkeyGiftResult(@C6454e(mo15737a = "room_id") long j, @C6454e(mo15737a = "anchor_id") long j2, @C6454e(mo15737a = "click_point") int i, @C6454e(mo15737a = "seed") long j3, @C6454e(mo15737a = "token") String str, @C6454e(mo15737a = "gift_id") long j4);

    @C6456g
    @C6468s(mo15750a = "/webcast/gift/send/")
    C7492s<C3479d<C8158m>> send(@C6454e(mo15737a = "gift_id") long j, @C6474y(mo15757a = "room_id") long j2, @C6454e(mo15737a = "to_user_id") long j3, @C6454e(mo15737a = "count") int i);

    @C6456g
    @C6468s(mo15750a = "/webcast/gift/send/")
    C7492s<C3479d<C8158m>> send(@C6454e(mo15737a = "gift_id") long j, @C6474y(mo15757a = "room_id") long j2, @C6454e(mo15737a = "to_user_id") long j3, @C6454e(mo15737a = "count") int i, @C6454e(mo15737a = "gift_source") int i2);

    @C6456g
    @C6468s(mo15750a = "/webcast/gift/golden_beans_send/")
    C7492s<C3479d<C8158m>> sendGoldenGift(@C6454e(mo15737a = "gift_id") long j, @C6474y(mo15757a = "room_id") long j2, @C6454e(mo15737a = "to_user_id") long j3, @C6454e(mo15737a = "count") int i);

    @C6457h(mo15740a = "/webcast/gift/list/")
    C7492s<C3479d<C8152g>> syncGiftList(@C6474y(mo15757a = "room_id") String str, @C6474y(mo15757a = "fetch_giftlist_from") int i);

    @C6457h(mo15740a = "/webcast/freegift/get_watermelon_seeds/")
    C7492s<C3479d<C8160o>> syncXgCoin();
}
