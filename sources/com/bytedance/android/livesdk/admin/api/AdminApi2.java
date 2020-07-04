package com.bytedance.android.livesdk.admin.api;

import com.bytedance.android.live.network.response.C3474a;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.admin.p184b.C3888a;
import com.bytedance.android.livesdk.admin.p184b.C3889b;
import com.bytedance.retrofit2.p264b.C6454e;
import com.bytedance.retrofit2.p264b.C6456g;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6468s;
import com.bytedance.retrofit2.p264b.C6474y;
import p346io.reactivex.C7492s;

public interface AdminApi2 {
    @C6457h(mo15740a = "/webcast/user/admin/list/")
    C7492s<C3474a<C3889b, C3888a>> fetchAdministrators(@C6474y(mo15757a = "anchor_id") long j, @C6474y(mo15757a = "sec_anchor_id") String str, @C6474y(mo15757a = "sec_user_id") String str2);

    @C6456g
    @C6468s(mo15750a = "/webcast/user/admin/update/")
    C7492s<C3479d<Object>> updateAdmin(@C6454e(mo15737a = "update_type") int i, @C6454e(mo15737a = "to_user_id") long j, @C6454e(mo15737a = "anchor_id") long j2, @C6454e(mo15737a = "current_room_id") long j3);
}
