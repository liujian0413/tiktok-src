package com.p280ss.android.ugc.aweme.similarvideo.api;

import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.p284b.C19223b;
import com.p280ss.android.ugc.aweme.app.api.C22838j;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofit;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.similarvideo.p1628a.C41714a;
import com.p280ss.android.ugc.aweme.similarvideo.p1628a.C41715b;
import java.util.concurrent.ExecutionException;
import retrofit2.p363b.C7739o;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.similarvideo.api.SimilarVideoSearchApi */
public final class SimilarVideoSearchApi {

    /* renamed from: a */
    static final IRetrofit f108589a = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(C19223b.f51890e);

    /* renamed from: com.ss.android.ugc.aweme.similarvideo.api.SimilarVideoSearchApi$RealApi */
    interface RealApi {
        @C7739o(mo20429a = "/aweme/v1/ug/similar/entry/")
        C18253l<C41714a> hasSimilarVideo(@C7744t(mo20436a = "aweme_id") String str);

        @C7739o(mo20429a = "/aweme/v1/ug/similar/feed/")
        C18253l<C41715b> searchSimilarVideoList(@C7744t(mo20436a = "aweme_id") String str, @C7744t(mo20436a = "offset") long j, @C7744t(mo20436a = "count") int i);
    }

    /* renamed from: a */
    public static C41714a m132829a(String str) throws Exception {
        try {
            return (C41714a) ((RealApi) f108589a.create(RealApi.class)).hasSimilarVideo(str).get();
        } catch (ExecutionException e) {
            throw C22838j.m75277a(e);
        }
    }

    /* renamed from: a */
    public static C41715b m132830a(String str, long j, int i) throws Exception {
        try {
            return (C41715b) ((RealApi) f108589a.create(RealApi.class)).searchSimilarVideoList(str, j, i).get();
        } catch (ExecutionException e) {
            throw C22838j.m75277a(e);
        }
    }
}
