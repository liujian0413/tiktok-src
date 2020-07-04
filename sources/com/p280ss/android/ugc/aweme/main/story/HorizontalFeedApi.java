package com.p280ss.android.ugc.aweme.main.story;

import bolts.C1592h;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.main.story.live.C33104d;
import com.p280ss.android.ugc.aweme.story.model.StoryResponse;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.main.story.HorizontalFeedApi */
public interface HorizontalFeedApi {
    @C7730f(mo20420a = "/aweme/v1/room/recommended/avatars/")
    C18253l<C33104d> fetchRecommendAvatars(@C7744t(mo20436a = "page_id") int i, @C7744t(mo20436a = "is_cold_start") String str, @C7744t(mo20436a = "is_hot_start") String str2);

    @C7730f(mo20420a = "/aweme/v1/story/")
    C18253l<StoryResponse> getStory(@C7744t(mo20436a = "cursor") long j, @C7744t(mo20436a = "count") int i, @C7744t(mo20436a = "page_id") int i2, @C7744t(mo20436a = "is_cold_start") String str, @C7744t(mo20436a = "is_hot_start") String str2);

    @C7730f(mo20420a = "/aweme/v1/skylight/open/report/")
    C1592h<BaseResponse> sendSkylightState(@C7744t(mo20436a = "status") int i);
}
