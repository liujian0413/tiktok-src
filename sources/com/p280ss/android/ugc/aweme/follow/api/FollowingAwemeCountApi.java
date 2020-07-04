package com.p280ss.android.ugc.aweme.follow.api;

import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6474y;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.follow.presenter.C29460g;

/* renamed from: com.ss.android.ugc.aweme.follow.api.FollowingAwemeCountApi */
public interface FollowingAwemeCountApi {
    @C6457h(mo15740a = "/aweme/v1/rec/new/")
    C18253l<C29460g> getFollowingsLatestAwemePublishCount(@C6474y(mo15757a = "need_avatar") int i);
}
