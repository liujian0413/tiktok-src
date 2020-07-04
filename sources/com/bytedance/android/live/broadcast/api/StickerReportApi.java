package com.bytedance.android.live.broadcast.api;

import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.retrofit2.p264b.C6454e;
import com.bytedance.retrofit2.p264b.C6456g;
import com.bytedance.retrofit2.p264b.C6468s;
import p346io.reactivex.C7492s;

public interface StickerReportApi {
    @C6456g
    @C6468s(mo15750a = "/webcast/gift/set_room_supported/")
    C7492s<C3479d<Object>> reportFaceGift(@C6454e(mo15737a = "room_id") long j, @C6454e(mo15737a = "gift_ids") String str);
}
