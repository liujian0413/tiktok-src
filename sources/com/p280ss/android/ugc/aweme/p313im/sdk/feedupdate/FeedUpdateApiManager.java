package com.p280ss.android.ugc.aweme.p313im.sdk.feedupdate;

import bolts.C1592h;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7075h;
import java.util.concurrent.CancellationException;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.feedupdate.FeedUpdateApiManager */
public final class FeedUpdateApiManager {

    /* renamed from: a */
    private static UpdateTagApi f81841a = ((UpdateTagApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(C7075h.f19903b).create(UpdateTagApi.class));

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.feedupdate.FeedUpdateApiManager$UpdateTagApi */
    interface UpdateTagApi {
        @C7730f(mo20420a = "im/unreaditems/")
        C1592h<FeedUpdate> fetchFeedUpdate(@C7744t(mo20436a = "cursor") long j);
    }

    /* renamed from: a */
    public static FeedUpdate m101668a(long j) {
        try {
            C1592h fetchFeedUpdate = f81841a.fetchFeedUpdate(0);
            fetchFeedUpdate.mo6892g();
            if (fetchFeedUpdate.mo6889d()) {
                throw fetchFeedUpdate.mo6891f();
            } else if (!fetchFeedUpdate.mo6887c()) {
                return (FeedUpdate) fetchFeedUpdate.mo6890e();
            } else {
                throw new CancellationException();
            }
        } catch (Exception unused) {
            return null;
        }
    }
}
