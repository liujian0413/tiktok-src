package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.network.response.C3478c;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.chatroom.model.C4865aa;
import com.bytedance.android.livesdk.chatroom.model.C4866ab;
import com.bytedance.android.livesdk.chatroom.model.C4930z;
import com.bytedance.android.livesdk.message.model.C8512bh;
import com.bytedance.retrofit2.p264b.C6454e;
import com.bytedance.retrofit2.p264b.C6456g;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6468s;
import com.bytedance.retrofit2.p264b.C6474y;
import p346io.reactivex.C7492s;

public interface LuckyBoxApi {
    @C6457h(mo15740a = "/webcast/luckybox/box/list/")
    C7492s<C3478c<C8512bh>> fetchCurrentList(@C6474y(mo15757a = "room_id") long j);

    @C6457h(mo15740a = "/webcast/luckybox/rushed/list/")
    C7492s<C3479d<C4930z>> fetchRushedList(@C6474y(mo15757a = "box_id") long j, @C6474y(mo15757a = "room_id") long j2, @C6474y(mo15757a = "box_type") int i);

    @C6457h(mo15740a = "/webcast/luckybox/box/meta/")
    C7492s<C3478c<C4866ab>> fetchTypeList(@C6474y(mo15757a = "room_id") long j);

    @C6456g
    @C6468s(mo15750a = "/webcast/luckybox/rush/")
    C7492s<C3479d<C4865aa>> rush(@C6454e(mo15737a = "box_id") long j, @C6454e(mo15737a = "room_id") long j2, @C6454e(mo15737a = "box_type") int i, @C6454e(mo15737a = "send_time") long j3, @C6454e(mo15737a = "delay_time") int i2, @C6454e(mo15737a = "common_label_list") String str);

    @C6456g
    @C6468s(mo15750a = "/webcast/luckybox/send/")
    C7492s<C3479d<Object>> send(@C6454e(mo15737a = "box_meta_id") long j, @C6454e(mo15737a = "room_id") long j2, @C6454e(mo15737a = "box_type") int i, @C6454e(mo15737a = "delay_time") int i2, @C6454e(mo15737a = "enter_source") String str, @C6454e(mo15737a = "request_id") String str2, @C6454e(mo15737a = "common_label_list") String str3);
}
