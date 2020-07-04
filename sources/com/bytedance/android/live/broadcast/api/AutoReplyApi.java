package com.bytedance.android.live.broadcast.api;

import com.bytedance.retrofit2.p264b.C6454e;
import com.bytedance.retrofit2.p264b.C6456g;
import com.bytedance.retrofit2.p264b.C6468s;
import p346io.reactivex.C7492s;

public interface AutoReplyApi {
    @C6456g
    @C6468s(mo15750a = "/webcast/room/set_auto_gift_thanks/")
    C7492s<Object> enableAutoReply(@C6454e(mo15737a = "enabled") String str);
}
