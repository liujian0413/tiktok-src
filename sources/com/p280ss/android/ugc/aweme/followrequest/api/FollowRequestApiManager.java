package com.p280ss.android.ugc.aweme.followrequest.api;

import android.os.Handler;
import com.bytedance.retrofit2.p264b.C6454e;
import com.bytedance.retrofit2.p264b.C6456g;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6468s;
import com.bytedance.retrofit2.p264b.C6474y;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.followrequest.model.ApproveResponse;
import com.p280ss.android.ugc.aweme.followrequest.model.FollowRequestResponse;
import com.p280ss.android.ugc.aweme.followrequest.model.RejectResponse;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* renamed from: com.ss.android.ugc.aweme.followrequest.api.FollowRequestApiManager */
public final class FollowRequestApiManager {

    /* renamed from: a */
    static final String f78448a = Api.f60502b;

    /* renamed from: b */
    static FollowRequestApi f78449b = ((FollowRequestApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(f78448a).create(FollowRequestApi.class));

    /* renamed from: com.ss.android.ugc.aweme.followrequest.api.FollowRequestApiManager$FollowRequestApi */
    interface FollowRequestApi {
        @C6456g
        @C6468s(mo15750a = "/aweme/v1/commit/follow/request/approve/")
        C18253l<ApproveResponse> approveRequest(@C6454e(mo15737a = "from_user_id") String str);

        @C6457h(mo15740a = "/aweme/v1/user/following/request/list/")
        C18253l<FollowRequestResponse> fetchFollowRequestList(@C6474y(mo15757a = "max_time") long j, @C6474y(mo15757a = "min_time") long j2, @C6474y(mo15757a = "count") int i);

        @C6456g
        @C6468s(mo15750a = "/aweme/v1/commit/follow/request/reject/")
        C18253l<RejectResponse> rejectRequest(@C6454e(mo15737a = "from_user_id") String str);
    }

    /* renamed from: a */
    public static void m97663a(Handler handler, final String str) {
        C23397p.m76735a().mo60807a(handler, new Callable() {
            public final Object call() throws Exception {
                try {
                    return FollowRequestApiManager.f78449b.approveRequest(str).get();
                } catch (ExecutionException e) {
                    throw ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).propagateCompatibleException(e);
                }
            }
        }, 1);
    }

    /* renamed from: b */
    public static void m97664b(Handler handler, final String str) {
        C23397p.m76735a().mo60807a(handler, new Callable() {
            public final Object call() throws Exception {
                try {
                    return FollowRequestApiManager.f78449b.rejectRequest(str).get();
                } catch (ExecutionException e) {
                    throw ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).propagateCompatibleException(e);
                }
            }
        }, 2);
    }

    /* renamed from: a */
    public static FollowRequestResponse m97662a(long j, long j2, int i) throws Exception {
        try {
            return (FollowRequestResponse) f78449b.fetchFollowRequestList(j, j2, i).get();
        } catch (ExecutionException e) {
            throw ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).propagateCompatibleException(e);
        }
    }
}
