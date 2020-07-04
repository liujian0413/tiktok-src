package com.p280ss.android.ugc.aweme.feed.api;

import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6474y;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.feed.model.PrivateUrlModel;

/* renamed from: com.ss.android.ugc.aweme.feed.api.FeedStatsApi */
public interface FeedStatsApi {
    @C6457h(mo15740a = "/aweme/v1/aweme/modify/visibility/")
    C18253l<PrivateUrlModel> feedStats(@C6474y(mo15757a = "aweme_id") String str, @C6474y(mo15757a = "type") int i);
}
