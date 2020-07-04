package com.bytedance.android.livesdk.user;

import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.retrofit2.p264b.C6454e;
import com.bytedance.retrofit2.p264b.C6456g;
import com.bytedance.retrofit2.p264b.C6468s;
import p346io.reactivex.C7492s;

public interface FollowApi {
    @C6456g
    @C6468s(mo15750a = "/webcast/user/relation/update/")
    C7492s<C3479d<C8979c>> follow(@C6454e(mo15737a = "follow_type") int i, @C6454e(mo15737a = "to_user_id") long j, @C6454e(mo15737a = "current_room_id") long j2, @C6454e(mo15737a = "sec_user_id") String str, @C6454e(mo15737a = "sec_to_user_id") String str2);

    @C6456g
    @C6468s(mo15750a = "/webcast/user/relation/update/")
    C7492s<C3479d<C8979c>> unfollow(@C6454e(mo15737a = "follow_type") int i, @C6454e(mo15737a = "sec_user_id") String str, @C6454e(mo15737a = "to_user_id") long j, @C6454e(mo15737a = "sec_to_user_id") String str2, @C6454e(mo15737a = "current_room_id") long j2);
}
