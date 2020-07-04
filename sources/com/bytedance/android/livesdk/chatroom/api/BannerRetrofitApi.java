package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.chatroom.model.C4899c;
import com.bytedance.android.livesdk.chatroom.model.C4919p;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6474y;
import p346io.reactivex.C7492s;

public interface BannerRetrofitApi {
    @C6457h(mo15740a = "/webcast/room/live_end_page_banner/")
    C7492s<C3479d<C4919p>> queryLiveEndPageBanner();

    @C6457h(mo15740a = "/webcast/room/in_room_banner/")
    C7492s<C3479d<C4899c>> queryLiveRoomBanner(@C6474y(mo15757a = "room_id") long j, @C6474y(mo15757a = "user_type") int i);
}
