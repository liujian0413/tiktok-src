package com.p280ss.android.ugc.aweme.i18n.musically.follows.presenter;

import com.bytedance.retrofit2.p264b.C6455f;
import com.bytedance.retrofit2.p264b.C6456g;
import com.bytedance.retrofit2.p264b.C6468s;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.common.applog.NetUtil;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.i18n.musically.follows.presenter.FollowFollowerApi */
final class FollowFollowerApi {

    /* renamed from: a */
    private static final FollowFollowerService f80198a = ((FollowFollowerService) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(FollowFollowerService.class));

    /* renamed from: com.ss.android.ugc.aweme.i18n.musically.follows.presenter.FollowFollowerApi$FollowFollowerService */
    public interface FollowFollowerService {
        @C6456g
        @C6468s(mo15750a = "/aweme/v1/user/follower/list/")
        C18253l<C30520b> getFollower(@C6455f Map<String, String> map);

        @C6456g
        @C6468s(mo15750a = "/aweme/v1/user/following/list/")
        C18253l<C30520b> getFollowing(@C6455f Map<String, String> map);
    }

    /* renamed from: a */
    static C30520b m99657a(String str, long j, int i, int i2) throws Exception {
        HashMap hashMap = new HashMap();
        hashMap.put("user_id", str);
        hashMap.put("max_time", String.valueOf(j));
        hashMap.put("count", "20");
        hashMap.put("address_book_access", String.valueOf(i));
        hashMap.put("gps_access", String.valueOf(i2));
        NetUtil.putCommonParams(hashMap, true);
        return (C30520b) f80198a.getFollower(hashMap).get();
    }

    /* renamed from: b */
    static C30520b m99658b(String str, long j, int i, int i2) throws Exception {
        HashMap hashMap = new HashMap();
        hashMap.put("user_id", str);
        hashMap.put("max_time", String.valueOf(j));
        hashMap.put("count", "20");
        hashMap.put("address_book_access", String.valueOf(i));
        hashMap.put("gps_access", String.valueOf(i2));
        NetUtil.putCommonParams(hashMap, true);
        return (C30520b) f80198a.getFollowing(hashMap).get();
    }
}
