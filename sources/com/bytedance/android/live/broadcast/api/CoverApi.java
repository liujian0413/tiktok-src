package com.bytedance.android.live.broadcast.api;

import com.bytedance.android.live.broadcast.model.C2749a;
import com.bytedance.android.live.broadcast.model.C2754d;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6474y;
import p346io.reactivex.C7492s;

public interface CoverApi {
    @C6457h(mo15740a = "/webcast/room/anchor_cover_status/")
    C7492s<C3479d<C2749a>> anchorCoverStatus();

    @C6457h(mo15740a = "/webcast/room/anchor_cover_quality/")
    C7492s<C3479d<C2754d>> getCoverQuality(@C6474y(mo15757a = "uri") String str);
}
