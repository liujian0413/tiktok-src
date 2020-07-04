package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.base.model.feed.C2344a;
import com.bytedance.android.live.network.response.C3477b;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.chatroom.model.C4905g;
import com.bytedance.android.livesdk.chatroom.model.C4909h;
import com.bytedance.android.livesdk.chatroom.model.C4910i;
import com.bytedance.retrofit2.p264b.C6454e;
import com.bytedance.retrofit2.p264b.C6456g;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6468s;
import com.bytedance.retrofit2.p264b.C6472w;
import com.bytedance.retrofit2.p264b.C6474y;
import p346io.reactivex.C7492s;

public interface FansClubApi {
    @C6456g
    @C6468s(mo15750a = "/live/fansclub/auto_renewal/{anchor_id}/edit/")
    C7492s<C3479d<C4909h>> editAutoLight(@C6472w(mo15754a = "anchor_id") long j, @C6454e(mo15737a = "open") int i);

    @C6457h(mo15740a = "/live/fansclub/prefer/candidate_list/")
    C7492s<C3479d<C4910i>> get(@C6474y(mo15757a = "offset") int i, @C6474y(mo15757a = "count") int i2);

    @C6457h(mo15740a = "/live/fansclub/auto_renewal/list/")
    C7492s<C3477b<C4905g, C2344a>> getAutoLightList(@C6474y(mo15757a = "offset") int i, @C6474y(mo15757a = "count") int i2);

    @C6456g
    @C6468s(mo15750a = "/live/fansclub/prefer/set/")
    C7492s<C3479d<Object>> setPreferFansClub(@C6454e(mo15737a = "anchor_id") String str);
}
