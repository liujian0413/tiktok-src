package com.p280ss.android.ugc.aweme.friendfeed.api;

import bolts.C1592h;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.friendfeed.api.FriendFeedUnreadApi */
public final class FriendFeedUnreadApi {

    /* renamed from: a */
    private static final FriendFeedUnreadRetrofitApi f78822a = ((FriendFeedUnreadRetrofitApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(FriendFeedUnreadRetrofitApi.class));

    /* renamed from: com.ss.android.ugc.aweme.friendfeed.api.FriendFeedUnreadApi$FriendFeedUnreadRetrofitApi */
    interface FriendFeedUnreadRetrofitApi {
        @C7730f(mo20420a = "/aweme/v1/friend/feed/unread/")
        C1592h<Object> getFriendFeedUnread(@C7744t(mo20436a = "cold_start") int i);

        @C7730f(mo20420a = "/aweme/v1/friend/feed/unread/")
        C1592h<Object> getFriendFeedUnread(@C7744t(mo20436a = "cold_start") int i, @C7744t(mo20436a = "notice_group_type") int i2);
    }
}
