package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.chatroom.model.C4870ae;
import com.bytedance.retrofit2.p264b.C6454e;
import com.bytedance.retrofit2.p264b.C6456g;
import com.bytedance.retrofit2.p264b.C6468s;
import p346io.reactivex.C7492s;

public interface ProfileNotificationApi {
    @C6456g
    @C6468s(mo15750a = "/webcast/user/relation/live_push_status/update/")
    C7492s<C3479d<C4870ae>> sendNewSetting(@C6454e(mo15737a = "push_status") int i, @C6454e(mo15737a = "sec_to_user_id") String str);
}
