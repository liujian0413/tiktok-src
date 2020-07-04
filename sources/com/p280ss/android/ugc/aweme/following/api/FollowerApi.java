package com.p280ss.android.ugc.aweme.following.api;

import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6474y;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.following.model.C29567c;

/* renamed from: com.ss.android.ugc.aweme.following.api.FollowerApi */
public interface FollowerApi {
    @C6457h(mo15740a = "/aweme/v1/user/follower/list/")
    C18253l<C29567c> fetchFollowingList(@C6474y(mo15757a = "user_id") String str, @C6474y(mo15757a = "sec_user_id") String str2, @C6474y(mo15757a = "max_time") long j, @C6474y(mo15757a = "count") int i, @C6474y(mo15757a = "offset") int i2, @C6474y(mo15757a = "source_type") int i3, @C6474y(mo15757a = "address_book_access") int i4, @C6474y(mo15757a = "gps_access") int i5);
}
