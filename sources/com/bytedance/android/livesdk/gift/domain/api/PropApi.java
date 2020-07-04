package com.bytedance.android.livesdk.gift.domain.api;

import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.gift.model.C8157l;
import com.bytedance.android.livesdk.gift.model.C8158m;
import com.bytedance.retrofit2.p264b.C6454e;
import com.bytedance.retrofit2.p264b.C6456g;
import com.bytedance.retrofit2.p264b.C6468s;
import com.bytedance.retrofit2.p264b.C6474y;
import p346io.reactivex.C7492s;

public interface PropApi {
    @C6468s(mo15750a = "/webcast/props/mine/")
    C7492s<C3479d<C8157l>> getPropList(@C6474y(mo15757a = "room_id") long j);

    @C6456g
    @C6468s(mo15750a = "/webcast/props/consume/")
    C7492s<C3479d<C8158m>> sendProp(@C6454e(mo15737a = "prop_def_id") long j, @C6474y(mo15757a = "room_id") long j2, @C6454e(mo15737a = "count") int i, @C6454e(mo15737a = "to_user_id") long j3, @C6454e(mo15737a = "is_aweme_free_gift") int i2);
}
