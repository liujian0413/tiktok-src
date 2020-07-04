package com.bytedance.android.live.broadcast.api;

import com.bytedance.android.live.broadcast.api.model.Game;
import com.bytedance.android.live.broadcast.model.C2755e;
import com.bytedance.android.live.broadcast.model.C2756f;
import com.bytedance.android.live.broadcast.model.WaitingReviewInfo;
import com.bytedance.android.live.network.response.C3478c;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.live.network.response.C3480e;
import com.bytedance.android.livesdk.chatroom.model.C4884aq;
import com.bytedance.android.livesdkapi.depend.model.live.C9386v;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p264b.C6451b;
import com.bytedance.retrofit2.p264b.C6454e;
import com.bytedance.retrofit2.p264b.C6455f;
import com.bytedance.retrofit2.p264b.C6456g;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6468s;
import com.bytedance.retrofit2.p264b.C6474y;
import java.util.HashMap;
import p346io.reactivex.C7492s;

public interface BroadcastRoomApi {
    @C6456g
    @C6468s(mo15750a = "/webcast/room/create/")
    C7492s<C3480e<Room>> createRoom(@C6455f HashMap<String, String> hashMap);

    @C6468s(mo15750a = "/webcast/room/get_latest_room/")
    C7492s<C3479d<Room>> getLatestRoom();

    @C6457h(mo15740a = "/webcast/room/game_list/")
    C7492s<C3478c<Game>> getLiveGameList(@C6474y(mo15757a = "game_icon") int i);

    @C6457h(mo15740a = "/webcast/room/create_info/")
    C7492s<C3479d<C2755e>> getPreviewRoomCreateInfo();

    @C6457h(mo15740a = "/webcast/room/auditing/info/")
    C7492s<C3479d<WaitingReviewInfo>> getReviewInfo(@C6474y(mo15757a = "room_id") long j);

    @C6457h(mo15740a = "/webcast/room/tag_list/")
    C7492s<C3478c<C4884aq>> getRoomTags();

    @C6457h(mo15740a = "/webcast/anchor/health_score/total/")
    C7492s<C3479d<C9386v>> getTotalHealthInfo();

    @C6457h(mo15740a = "/webcast/anchor/cover/neednotice/")
    C7492s<C3479d<Object>> shouldShowCoverNotice();

    @C6468s(mo15750a = "/webcast/room/video/capture/")
    C7492s<C3479d<Object>> updateCaptureVideo(@C6451b TypedOutput typedOutput);

    @C6456g
    @C6468s(mo15750a = "/webcast/room/update_room_info/")
    C7492s<C3479d<C2756f>> updateRoomInfo(@C6454e(mo15737a = "room_id") long j, @C6454e(mo15737a = "cover_uri") String str);

    @C6456g
    @C6468s(mo15750a = "/webcast/room/internal_ci_info/")
    C7492s<C3479d<Void>> uploadBeautyParams(@C6454e(mo15737a = "room_id") long j, @C6454e(mo15737a = "filter_name") String str, @C6454e(mo15737a = "whitening") int i, @C6454e(mo15737a = "beauty_skin") int i2, @C6454e(mo15737a = "big_eyes") int i3, @C6454e(mo15737a = "face_lift") int i4, @C6454e(mo15737a = "use_filter") boolean z);
}
