package com.p280ss.android.ugc.aweme.shortvideo.sticker;

import com.google.common.util.concurrent.C18245g;
import com.google.common.util.concurrent.C18246h;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.base.C23364n;
import com.p280ss.android.ugc.aweme.base.p1059d.p1060a.C23319b;
import com.p280ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25242ao;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.concurrent.Executor;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.ChallengeModule */
public final class ChallengeModule {

    /* renamed from: a */
    private final ChallengeDetailApi f104756a = ((ChallengeDetailApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(ChallengeDetailApi.class));

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.ChallengeModule$ChallengeDetailApi */
    interface ChallengeDetailApi {
        @C7730f(mo20420a = "/aweme/v1/challenge/detail/")
        C18253l<ChallengeDetail> fetchChallengeDetail(@C7744t(mo20436a = "ch_id") String str, @C7744t(mo20436a = "hashtag_name") String str2, @C7744t(mo20436a = "query_type") int i, @C7744t(mo20436a = "click_reason") int i2);

        @C7730f(mo20420a = "/aweme/v1/commerce/challenge/detail/")
        C18253l<ChallengeDetail> fetchCommerceChallengeDetail(@C7744t(mo20436a = "ch_id") String str, @C7744t(mo20436a = "hashtag_name") String str2, @C7744t(mo20436a = "query_type") int i, @C7744t(mo20436a = "click_reason") int i2);
    }

    /* renamed from: a */
    public final void mo100182a(String str, String str2, int i, int i2, final C23319b<ChallengeDetail> bVar) {
        C403351 r0 = new C18245g<ChallengeDetail>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onSuccess(ChallengeDetail challengeDetail) {
                bVar.accept(challengeDetail);
            }

            public final void onFailure(Throwable th) {
                bVar.accept(null);
            }
        };
        if (C25242ao.m82977b(str) || C25242ao.m82977b(str2)) {
            C18246h.m60214a(this.f104756a.fetchCommerceChallengeDetail(str, str2, i, i2), (C18245g<? super V>) r0, (Executor) C23364n.f61448a);
        } else {
            C18246h.m60214a(this.f104756a.fetchChallengeDetail(str, str2, i, i2), (C18245g<? super V>) r0, (Executor) C23364n.f61448a);
        }
    }
}
