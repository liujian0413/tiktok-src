package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.base.model.feed.C2344a;
import com.bytedance.android.live.base.model.media.C2360f;
import com.bytedance.android.live.network.response.C3474a;
import com.bytedance.android.live.network.response.C3478c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6474y;
import p346io.reactivex.C7492s;

public interface EndPageRecommendRetrofitApi {
    @C6457h(mo15740a = "/webcast/room/recommend_live/")
    C7492s<C3474a<Room, C2344a>> getLive(@C6474y(mo15757a = "room_id") long j);

    @C6457h(mo15740a = "/webcast/room/recommend_item/")
    C7492s<C3478c<C2360f>> getVideos(@C6474y(mo15757a = "room_id") long j);
}
