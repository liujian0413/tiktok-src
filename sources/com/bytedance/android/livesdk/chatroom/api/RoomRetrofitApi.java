package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.base.model.Extra;
import com.bytedance.android.live.network.response.C3477b;
import com.bytedance.android.live.network.response.C3478c;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.live.network.response.C3480e;
import com.bytedance.android.livesdk.chatroom.model.Barrage;
import com.bytedance.android.livesdk.chatroom.model.ChatGuidanceResult;
import com.bytedance.android.livesdk.chatroom.model.ChatResult;
import com.bytedance.android.livesdk.chatroom.model.CheckAnchorMemorialResult;
import com.bytedance.android.livesdk.chatroom.model.DecorationTextAuditResult;
import com.bytedance.android.livesdk.chatroom.model.EnterRoomExtra;
import com.bytedance.android.livesdk.chatroom.model.ShareReportResult;
import com.bytedance.android.livesdk.chatroom.model.UserRankExtra;
import com.bytedance.android.livesdk.rank.model.C8852a;
import com.bytedance.android.livesdk.rank.model.C8856e;
import com.bytedance.android.livesdk.rank.model.CurrentRankListResponse;
import com.bytedance.android.livesdk.rank.model.PeriodRankExtra;
import com.bytedance.android.livesdkapi.depend.model.live.C9386v;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.report.ReportCommitData;
import com.bytedance.android.livesdkapi.depend.model.report.ReportReason;
import com.bytedance.android.livesdkapi.ping.PingResult;
import com.bytedance.retrofit2.C12466b;
import com.bytedance.retrofit2.p264b.C6454e;
import com.bytedance.retrofit2.p264b.C6455f;
import com.bytedance.retrofit2.p264b.C6456g;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6468s;
import com.bytedance.retrofit2.p264b.C6472w;
import com.bytedance.retrofit2.p264b.C6474y;
import com.bytedance.retrofit2.p264b.C6475z;
import java.util.HashMap;
import java.util.Map;
import p346io.reactivex.C7492s;

public interface RoomRetrofitApi {
    @C6457h(mo15740a = "/webcast/anchor/memorial/check_memorial/")
    C7492s<C3479d<CheckAnchorMemorialResult>> checkAnchorMemorial(@C6474y(mo15757a = "anchor_id") long j);

    @C6457h(mo15740a = "/webcast/room/collect_unread/")
    C7492s<C3479d<Object>> collectUnreadRequest(@C6474y(mo15757a = "room_id") long j, @C6474y(mo15757a = "anchor_id") long j2, @C6474y(mo15757a = "unread_extra") String str, @C6474y(mo15757a = "room_ids") String str2);

    @C6456g
    @C6468s(mo15750a = "/webcast/room/create/")
    C7492s<C3480e<Room>> createRoom(@C6455f HashMap<String, String> hashMap);

    @C6457h(mo15740a = "/hotsoon/room/{roomId}/_deblock_mosaic/")
    C7492s<C3479d<Object>> deblockMosaic(@C6472w(mo15754a = "roomId") long j);

    @C6456g
    @C6468s(mo15750a = "/webcast/room/digg/")
    C7492s<C3479d<Object>> digg(@C6455f HashMap<String, String> hashMap);

    @C6456g
    @C6468s(mo15750a = "/webcast/room/enter/")
    C7492s<C3477b<Room, EnterRoomExtra>> enterRoom(@C6454e(mo15737a = "room_id") long j, @C6454e(mo15737a = "hold_living_room") long j2, @C6454e(mo15737a = "is_login") long j3, @C6455f HashMap<String, String> hashMap);

    @C6457h(mo15740a = "/webcast/room/info/")
    C7492s<C3479d<Room>> fetchRoom(@C6475z HashMap<String, String> hashMap);

    @C6457h(mo15740a = "/webcast/room/info_by_user/")
    C7492s<C3479d<Room>> fetchUserRoom(@C6474y(mo15757a = "user_id") long j, @C6474y(mo15757a = "sec_user_id") String str);

    @C6457h(mo15740a = "/webcast/room/finish_abnormal/")
    C7492s<C3479d<Object>> finishRoomAbnormal();

    @C6457h(mo15740a = "/webcast/ranklist/hour/")
    C7492s<C3477b<C8852a, Extra>> getDailyRankContent(@C6475z HashMap<String, String> hashMap);

    @C6457h(mo15740a = "/hotsoon/room/follow/ids/")
    C12466b<C3478c<Long>> getLivingRoomIds();

    @C6456g
    @C6468s(mo15750a = "/webcast/room/mget_info/")
    C7492s<C3479d<Map<String, Room>>> getMultipleRoomInfo(@C6454e(mo15737a = "room_ids") String str);

    @C6457h(mo15740a = "/webcast/ranklist/noble/")
    C7492s<C3479d<C8856e>> getNobleUserRank(@C6475z HashMap<String, String> hashMap);

    @C6457h(mo15740a = "/webcast/ranklist/contributor/")
    C7492s<C3477b<CurrentRankListResponse, PeriodRankExtra>> getPeriodUserRank(@C6475z HashMap<String, String> hashMap);

    @C6457h(mo15740a = "/webcast/user/report/reason/")
    C7492s<C3478c<ReportReason>> getReportReasons();

    @C6457h(mo15740a = "/webcast/room/chat/guidance/")
    C7492s<C3479d<ChatGuidanceResult>> getRoomChatGuidance(@C6475z HashMap<String, String> hashMap);

    @C6457h(mo15740a = "/webcast/room/info/")
    C12466b<C3479d<Room>> getRoomStats(@C6474y(mo15757a = "is_anchor") boolean z, @C6474y(mo15757a = "room_id") long j, @C6474y(mo15757a = "pack_level") int i);

    @C6457h(mo15740a = "/webcast/room/info/")
    C12466b<C3479d<Room>> getRoomStats(@C6474y(mo15757a = "is_anchor") boolean z, @C6474y(mo15757a = "room_id") long j, @C6474y(mo15757a = "pack_level") int i, @C6474y(mo15757a = "need_health_score_info") boolean z2, @C6474y(mo15757a = "from_type") int i2);

    @C6457h(mo15740a = "/webcast/anchor/health_score/total/")
    C7492s<C3479d<C9386v>> getTotalHealthInfo();

    @C6457h(mo15740a = "/webcast/ranklist/room/{room_id}/contributor/")
    C7492s<C3477b<CurrentRankListResponse, UserRankExtra>> getUserRankContent(@C6472w(mo15754a = "room_id") long j, @C6475z HashMap<String, String> hashMap);

    @C6456g
    @C6468s(mo15750a = "/webcast/room/leave/")
    C7492s<C3479d<Object>> leaveRoom(@C6454e(mo15737a = "room_id") long j);

    @C6456g
    @C6468s(mo15750a = "/webcast/user/report/commit/")
    C7492s<C3479d<ReportCommitData>> postReportReasons(@C6454e(mo15737a = "target_room_id") long j, @C6454e(mo15737a = "target_anchor_id") long j2, @C6454e(mo15737a = "reason") long j3, @C6454e(mo15737a = "report_record_extra") String str);

    @C6457h(mo15740a = "/webcast/room/background_img/delete/")
    C7492s<C3479d<Void>> removeRoomBackgroundImg(@C6474y(mo15757a = "room_id") long j, @C6474y(mo15757a = "user_id") long j2);

    @C6456g
    @C6468s(mo15750a = "/webcast/screen_chat/")
    C7492s<C3479d<Barrage>> sendBarrage(@C6455f HashMap<String, String> hashMap);

    @C6456g
    @C6468s(mo15750a = "/webcast/room/decoration/audit_text/")
    C7492s<C3479d<DecorationTextAuditResult>> sendDecorationText(@C6455f HashMap<String, String> hashMap);

    @C6457h(mo15740a = "/webcast/room/ping/audience/")
    C7492s<C3479d<PingResult>> sendPlayingPing(@C6474y(mo15757a = "room_id") long j, @C6474y(mo15757a = "only_status") int i);

    @C6456g
    @C6468s(mo15750a = "/webcast/room/share/")
    C7492s<C3479d<ShareReportResult>> sendShare(@C6454e(mo15737a = "room_id") long j, @C6455f HashMap<String, String> hashMap);

    @C6456g
    @C6468s(mo15750a = "/webcast/room/chat/")
    C7492s<C3479d<ChatResult>> sendTextMessage(@C6455f HashMap<String, String> hashMap);

    @C6456g
    @C6468s(mo15750a = "/webcast/room/decoration/set/")
    C7492s<C3479d<Object>> setDecoration(@C6454e(mo15737a = "room_id") long j, @C6455f HashMap<String, String> hashMap);

    @C6457h(mo15740a = "/webcast/room/auditing/apply/")
    C7492s<C3479d<Object>> unblockRoom(@C6474y(mo15757a = "room_id") long j);

    @C6457h(mo15740a = "/webcast/anchor/memorial/memorial_reported/")
    C7492s<C3479d<Void>> updateAnchorMemorial(@C6474y(mo15757a = "anchor_id") long j);

    @C6457h(mo15740a = "/hotsoon/room/{room_id}/_update_status/")
    C7492s<C3479d<Void>> updateRoomStatus(@C6472w(mo15754a = "room_id") long j, @C6475z Map<String, String> map);
}
