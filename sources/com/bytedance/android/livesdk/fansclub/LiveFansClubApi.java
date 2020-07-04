package com.bytedance.android.livesdk.fansclub;

import com.bytedance.retrofit2.p264b.C6450ac;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6474y;
import p346io.reactivex.C7492s;

public interface LiveFansClubApi {
    @C6457h
    C7492s<C5904g> queryFansClubInfo(@C6450ac String str, @C6474y(mo15757a = "anchor_id") long j);

    @C6457h
    C7492s<Object> queryFansDouyinClubInfo(@C6450ac String str, @C6474y(mo15757a = "anchor_id") long j);
}
