package com.p280ss.android.ugc.aweme.discover.api;

import bolts.C1592h;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.discover.model.suggest.SuggestChallengeResponse;
import com.p280ss.android.ugc.aweme.discover.model.suggest.SuggestMusicResponse;
import com.p280ss.android.ugc.aweme.discover.model.suggest.SuggestUserResponse;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofit;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import retrofit2.p363b.C7730f;

/* renamed from: com.ss.android.ugc.aweme.discover.api.SuggestApi */
public final class SuggestApi {

    /* renamed from: a */
    public static final SuggestApi f70080a = new SuggestApi();

    /* renamed from: b */
    private static final String f70081b = Api.f60502b;

    /* renamed from: c */
    private static final IRetrofit f70082c = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(f70081b);

    /* renamed from: com.ss.android.ugc.aweme.discover.api.SuggestApi$RealApi */
    public interface RealApi {
        @C7730f(mo20420a = "/aweme/v1/challenge/suggested/")
        C1592h<SuggestChallengeResponse> getSuggestChallenges();

        @C7730f(mo20420a = "/aweme/v1/music/suggested/")
        C1592h<SuggestMusicResponse> getSuggestMusics();

        @C7730f(mo20420a = "/aweme/v1/user/suggested/")
        C1592h<SuggestUserResponse> getSuggestUsers();
    }

    private SuggestApi() {
    }

    /* renamed from: a */
    public static C1592h<SuggestUserResponse> m87320a() {
        return ((RealApi) f70082c.create(RealApi.class)).getSuggestUsers();
    }

    /* renamed from: b */
    public static C1592h<SuggestMusicResponse> m87321b() {
        return ((RealApi) f70082c.create(RealApi.class)).getSuggestMusics();
    }

    /* renamed from: c */
    public static C1592h<SuggestChallengeResponse> m87322c() {
        return ((RealApi) f70082c.create(RealApi.class)).getSuggestChallenges();
    }
}
