package com.p280ss.android.ugc.aweme.share;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p280ss.android.ugc.aweme.share.model.ShortenModel;
import p346io.reactivex.C7490k;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.share.ShortenUrlApi */
public final class ShortenUrlApi {

    /* renamed from: a */
    private static final RetrofitApi f98829a = ((RetrofitApi) new RetrofitFactory().create("https://api2.musical.ly/").mo26435a(RetrofitApi.class));

    /* renamed from: com.ss.android.ugc.aweme.share.ShortenUrlApi$RetrofitApi */
    interface RetrofitApi {
        @C7730f(mo20420a = "/shorten/")
        C7490k<ShortenModel> fetchShortenUrl(@C7744t(mo20436a = "target") String str, @C7744t(mo20436a = "belong") String str2, @C7744t(mo20436a = "persist") String str3);
    }

    /* renamed from: a */
    public static C7490k<ShortenModel> m121241a(String str, String str2) {
        return f98829a.fetchShortenUrl(str, str2, "1");
    }
}
