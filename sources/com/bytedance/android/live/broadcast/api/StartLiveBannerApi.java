package com.bytedance.android.live.broadcast.api;

import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.chatroom.model.C4899c.C4900a;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6474y;
import p346io.reactivex.C7492s;

public interface StartLiveBannerApi {
    @C6457h(mo15740a = "/webcast/room/live_page_banner/")
    C7492s<C3479d<C4900a>> queryStartLiveBanner(@C6474y(mo15757a = "live_page_type") String str, @C6474y(mo15757a = "user_type") int i);
}
