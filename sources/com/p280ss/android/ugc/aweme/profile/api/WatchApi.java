package com.p280ss.android.ugc.aweme.profile.api;

import com.bytedance.retrofit2.C12466b;
import com.bytedance.retrofit2.p264b.C6455f;
import com.bytedance.retrofit2.p264b.C6456g;
import com.bytedance.retrofit2.p264b.C6468s;
import com.p280ss.android.ugc.aweme.profile.model.WatchStatus;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.profile.api.WatchApi */
public interface WatchApi {
    @C6456g
    @C6468s(mo15750a = "/aweme/v1/commit/watch/user/")
    C12466b<WatchStatus> turnPostNotification(@C6455f Map<String, String> map);
}
