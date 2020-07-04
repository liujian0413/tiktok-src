package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.network.response.C3477b;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.chatroom.interact.model.C4816a;
import com.bytedance.android.livesdk.chatroom.interact.model.C4817b;
import com.bytedance.android.livesdk.chatroom.interact.model.ChiJiPermissionData;
import com.bytedance.android.livesdk.chatroom.model.C4848a;
import com.bytedance.android.livesdk.chatroom.model.p219a.C4849a;
import com.bytedance.android.livesdk.chatroom.model.p219a.C4850b;
import com.bytedance.android.livesdk.chatroom.model.p219a.C4856g;
import com.bytedance.android.livesdk.chatroom.model.p219a.C4857h;
import com.bytedance.android.livesdk.chatroom.model.p219a.C4858i;
import com.bytedance.retrofit2.p264b.C6454e;
import com.bytedance.retrofit2.p264b.C6455f;
import com.bytedance.retrofit2.p264b.C6456g;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6468s;
import com.bytedance.retrofit2.p264b.C6474y;
import java.util.Map;
import p346io.reactivex.C7319aa;
import p346io.reactivex.C7492s;

public interface LinkApi {
    @C6456g
    @C6468s(mo15750a = "/webcast/linkmic_audience/apply/")
    C7319aa<C3479d<C4848a>> apply(@C6454e(mo15737a = "room_id") long j, @C6455f Map<String, String> map);

    @C6457h(mo15740a = "/webcast/linkmic/cancel/")
    C7492s<C3479d<Void>> cancel(@C6474y(mo15757a = "channel_id") long j, @C6474y(mo15757a = "room_id") long j2, @C6474y(mo15757a = "to_room_id") long j3, @C6474y(mo15757a = "to_user_id") long j4);

    @C6457h(mo15740a = "/webcast/linkmic_audience/check_permission/")
    C7319aa<C3477b<Void, C4849a>> checkPermissionV1(@C6474y(mo15757a = "room_id") long j, @C6474y(mo15757a = "linkmic_layout") int i);

    @C6457h(mo15740a = "/webcast/linkmic/check_permission/")
    C7492s<C3479d<ChiJiPermissionData>> checkPermissionV3(@C6474y(mo15757a = "room_id") long j);

    @C6457h(mo15740a = "/webcast/linkmic/check_permission/")
    C7492s<C3479d<ChiJiPermissionData>> checkPermissionV3(@C6474y(mo15757a = "room_id") long j, @C6474y(mo15757a = "type") int i);

    @C6457h(mo15740a = "/webcast/linkmic_audience/contributors/")
    C7319aa<C3479d<C4858i>> contributorRank(@C6474y(mo15757a = "room_id") long j, @C6474y(mo15757a = "user_id") long j2, @C6474y(mo15757a = "offset") int i);

    @C6457h(mo15740a = "/webcast/linkmic_audience/finish/")
    C7319aa<C3479d<Void>> finishV1(@C6474y(mo15757a = "room_id") long j);

    @C6457h(mo15740a = "/webcast/linkmic/finish/")
    C7492s<C3479d<Void>> finishV3(@C6474y(mo15757a = "channel_id") long j);

    @C6457h(mo15740a = "/webcast/linkmic_audience/list/")
    C7319aa<C3479d<C4857h>> getList(@C6474y(mo15757a = "room_id") long j, @C6474y(mo15757a = "link_status") int i);

    @C6457h(mo15740a = "/webcast/linkmic_audience/init/")
    C7319aa<C3479d<C4850b>> init(@C6474y(mo15757a = "room_id") long j, @C6474y(mo15757a = "linkmic_vendor") int i, @C6474y(mo15757a = "linkmic_layout") int i2);

    @C6457h(mo15740a = "/webcast/linkmic/invite/")
    C7492s<C3479d<C4816a>> invite(@C6474y(mo15757a = "vendor") int i, @C6474y(mo15757a = "to_room_id") long j, @C6474y(mo15757a = "to_user_id") long j2, @C6474y(mo15757a = "room_id") long j3, @C6474y(mo15757a = "invite_type") int i2, @C6474y(mo15757a = "match_type") int i3);

    @C6457h(mo15740a = "/webcast/linkmic/invite/")
    C7492s<C3479d<C4816a>> inviteWithBattleOn(@C6474y(mo15757a = "layout") int i, @C6474y(mo15757a = "vendor") int i2, @C6474y(mo15757a = "to_room_id") long j, @C6474y(mo15757a = "to_user_id") long j2, @C6474y(mo15757a = "room_id") long j3, @C6474y(mo15757a = "theme") String str, @C6474y(mo15757a = "duration") int i3, @C6474y(mo15757a = "match_type") int i4);

    @C6457h(mo15740a = "/webcast/linkmic/invite/")
    C7492s<C3479d<C4816a>> inviteWithBattleOn(@C6474y(mo15757a = "layout") int i, @C6474y(mo15757a = "vendor") int i2, @C6474y(mo15757a = "to_room_id") long j, @C6474y(mo15757a = "to_user_id") long j2, @C6474y(mo15757a = "room_id") long j3, @C6474y(mo15757a = "theme") String str, @C6474y(mo15757a = "duration") int i3, @C6474y(mo15757a = "match_type") int i4, @C6474y(mo15757a = "invite_type") int i5, @C6474y(mo15757a = "sub_type") int i6);

    @C6457h(mo15740a = "/webcast/linkmic_audience/join_channel/")
    C7319aa<C3479d<Void>> joinChannelV1(@C6474y(mo15757a = "room_id") long j);

    @C6457h(mo15740a = "/webcast/linkmic/join_channel/")
    C7492s<C3479d<Void>> joinChannelV3(@C6474y(mo15757a = "channel_id") long j);

    @C6457h(mo15740a = "/webcast/linkmic_audience/kick_out/")
    C7319aa<C3479d<Void>> kickOut(@C6474y(mo15757a = "room_id") long j, @C6474y(mo15757a = "to_user_id") long j2);

    @C6457h(mo15740a = "/webcast/linkmic_audience/leave/")
    C7319aa<C3479d<Void>> leave(@C6474y(mo15757a = "room_id") long j);

    @C6457h(mo15740a = "/webcast/linkmic/notify_join/")
    C7492s<C3479d<Void>> notifyJoin(@C6474y(mo15757a = "channel_id") long j, @C6474y(mo15757a = "to_user_id") long j2);

    @C6457h(mo15740a = "/webcast/linkmic_audience/permit/")
    C7319aa<C3479d<Void>> permit(@C6474y(mo15757a = "room_id") long j, @C6474y(mo15757a = "to_user_id") long j2);

    @C6457h(mo15740a = "/webcast/linkmic/reply/")
    C7492s<C3479d<C4856g>> reply(@C6474y(mo15757a = "channel_id") long j, @C6474y(mo15757a = "room_id") long j2, @C6474y(mo15757a = "reply_status") int i, @C6474y(mo15757a = "invite_user_id") long j3);

    @C6456g
    @C6468s(mo15750a = "/webcast/linkmic/monitor/vendor/")
    C7492s<C3479d<Void>> reportStartLinkStatus(@C6454e(mo15737a = "vendor") String str, @C6454e(mo15737a = "status") int i, @C6454e(mo15737a = "err_code") int i2);

    @C6457h(mo15740a = "/webcast/linkmic/rivals/")
    C7492s<C3479d<C4817b>> rivalsList(@C6474y(mo15757a = "rivals_type") int i);

    @C6456g
    @C6468s(mo15750a = "/webcast/linkmic_audience/send_signaling/")
    C7319aa<C3479d<Void>> sendSignalV1(@C6454e(mo15737a = "room_id") long j, @C6454e(mo15737a = "content") String str, @C6454e(mo15737a = "to_user_ids") long[] jArr);

    @C6457h(mo15740a = "/webcast/linkmic/send_signal/")
    C7492s<C3479d<Void>> sendSignalV3(@C6474y(mo15757a = "channel_id") long j, @C6474y(mo15757a = "content") String str, @C6474y(mo15757a = "to_user_ids") long[] jArr);

    @C6457h(mo15740a = "/webcast/linkmic/settings/")
    C7492s<C3479d<Void>> settings(@C6474y(mo15757a = "link_mic_stats") int i);

    @C6457h(mo15740a = "/webcast/linkmic_audience/silence/")
    C7319aa<C3479d<Void>> silence(@C6474y(mo15757a = "room_id") long j, @C6474y(mo15757a = "to_user_id") long j2);

    @C6457h(mo15740a = "/webcast/linkmic_audience/turn_on/")
    C7319aa<C3479d<Void>> turnOnV1(@C6474y(mo15757a = "room_id") long j, @C6474y(mo15757a = "linkmic_layout") int i);

    @C6457h(mo15740a = "/webcast/linkmic/turn_on/")
    C7492s<C3479d<Object>> turnOnV3(@C6474y(mo15757a = "channel_id") long j);

    @C6457h(mo15740a = "/webcast/linkmic_audience/unsilence/")
    C7319aa<C3479d<Void>> unSilence(@C6474y(mo15757a = "room_id") long j, @C6474y(mo15757a = "to_user_id") long j2);
}
