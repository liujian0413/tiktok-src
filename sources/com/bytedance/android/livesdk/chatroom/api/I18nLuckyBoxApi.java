package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.network.response.C3478c;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.message.model.C8535by;
import com.bytedance.retrofit2.p264b.C6454e;
import com.bytedance.retrofit2.p264b.C6456g;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6468s;
import com.bytedance.retrofit2.p264b.C6472w;
import p346io.reactivex.C7492s;

public interface I18nLuckyBoxApi {
    @C6457h(mo15740a = "/hotsoon/luckymoney/{room_id}/_list/")
    C7492s<C3478c<C8535by>> fetchRedEnvelopeList(@C6472w(mo15754a = "room_id") long j);

    @C6457h(mo15740a = "/hotsoon/luckymoney/{red_packet_id}/_rushed_list/")
    C7492s<C3479d<Object>> fetchRedEnvelopeRushedList(@C6472w(mo15754a = "red_packet_id") long j);

    @C6456g
    @C6468s(mo15750a = "/hotsoon/luckymoney/{red_packet_id}/_rush/")
    C7492s<C3479d<Object>> rush(@C6472w(mo15754a = "red_packet_id") long j, @C6454e(mo15737a = "room_id") long j2, @C6454e(mo15737a = "send_time") int i, @C6454e(mo15737a = "delay_time") int i2, @C6454e(mo15737a = "common_label_list") String str);

    @C6456g
    @C6468s(mo15750a = "/hotsoon/luckymoney/{red_packet_id}/_send/")
    C7492s<C3479d<Object>> send(@C6472w(mo15754a = "red_packet_id") long j, @C6454e(mo15737a = "request_id") String str, @C6454e(mo15737a = "enter_source") String str2, @C6454e(mo15737a = "room_id") long j2, @C6454e(mo15737a = "delay_time") int i, @C6454e(mo15737a = "common_label_list") String str3);
}
