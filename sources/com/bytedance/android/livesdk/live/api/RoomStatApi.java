package com.bytedance.android.livesdk.live.api;

import com.bytedance.android.live.network.response.C3478c;
import com.bytedance.android.livesdk.live.model.C8398b;
import com.bytedance.retrofit2.p264b.C6454e;
import com.bytedance.retrofit2.p264b.C6456g;
import com.bytedance.retrofit2.p264b.C6468s;
import p346io.reactivex.C7492s;

public interface RoomStatApi {
    @C6456g
    @C6468s(mo15750a = "/webcast/room/check_alive/")
    C7492s<C3478c<C8398b>> checkRoom(@C6454e(mo15737a = "room_ids") String str);
}
