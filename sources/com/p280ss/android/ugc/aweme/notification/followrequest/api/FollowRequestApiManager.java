package com.p280ss.android.ugc.aweme.notification.followrequest.api;

import android.os.Handler;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.notice.repo.TutorialVideoApiManager;
import com.p280ss.android.ugc.aweme.notification.followrequest.model.ApproveResponse;
import com.p280ss.android.ugc.aweme.notification.followrequest.model.FollowRequestResponse;
import com.p280ss.android.ugc.aweme.notification.followrequest.model.RejectResponse;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import retrofit2.p363b.C7727c;
import retrofit2.p363b.C7729e;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7739o;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.notification.followrequest.api.FollowRequestApiManager */
public final class FollowRequestApiManager {

    /* renamed from: a */
    static FollowRequestApi f89887a = ((FollowRequestApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(TutorialVideoApiManager.f89507a).create(FollowRequestApi.class));

    /* renamed from: com.ss.android.ugc.aweme.notification.followrequest.api.FollowRequestApiManager$FollowRequestApi */
    interface FollowRequestApi {
        @C7729e
        @C7739o(mo20429a = "/aweme/v1/commit/follow/request/approve/")
        C18253l<ApproveResponse> approveRequest(@C7727c(mo20417a = "from_user_id") String str);

        @C7730f(mo20420a = "/aweme/v1/user/following/request/list/")
        C18253l<FollowRequestResponse> fetchFollowRequestList(@C7744t(mo20436a = "max_time") long j, @C7744t(mo20436a = "min_time") long j2, @C7744t(mo20436a = "count") int i);

        @C7729e
        @C7739o(mo20429a = "/aweme/v1/commit/follow/request/reject/")
        C18253l<RejectResponse> rejectRequest(@C7727c(mo20417a = "from_user_id") String str);
    }

    /* renamed from: a */
    public static void m111412a(Handler handler, final String str) {
        C23397p.m76735a().mo60807a(handler, new Callable() {
            public final Object call() throws Exception {
                try {
                    return FollowRequestApiManager.f89887a.approveRequest(str).get();
                } catch (ExecutionException e) {
                    throw ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).propagateCompatibleException(e);
                }
            }
        }, 1);
    }

    /* renamed from: b */
    public static void m111413b(Handler handler, final String str) {
        C23397p.m76735a().mo60807a(handler, new Callable() {
            public final Object call() throws Exception {
                try {
                    return FollowRequestApiManager.f89887a.rejectRequest(str).get();
                } catch (ExecutionException e) {
                    throw ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).propagateCompatibleException(e);
                }
            }
        }, 2);
    }

    /* renamed from: a */
    public static FollowRequestResponse m111411a(long j, long j2, int i) throws Exception {
        try {
            return (FollowRequestResponse) f89887a.fetchFollowRequestList(j, j2, i).get();
        } catch (ExecutionException e) {
            throw ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).propagateCompatibleException(e);
        }
    }
}
