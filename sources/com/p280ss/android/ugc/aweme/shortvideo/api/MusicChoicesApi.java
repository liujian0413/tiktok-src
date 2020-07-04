package com.p280ss.android.ugc.aweme.shortvideo.api;

import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofit;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicList;
import java.util.concurrent.ExecutionException;
import retrofit2.p363b.C7730f;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.api.MusicChoicesApi */
public final class MusicChoicesApi {

    /* renamed from: a */
    static IRetrofit f99974a = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b);

    /* renamed from: b */
    private static IRetrofitService f99975b = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class));

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.api.MusicChoicesApi$RealApi */
    interface RealApi {
        @C7730f(mo20420a = "/aweme/v1/music/choices/")
        C18253l<MusicList> getMusicList();
    }

    /* renamed from: a */
    public static MusicList m122937a() throws Exception {
        try {
            return (MusicList) ((RealApi) f99974a.create(RealApi.class)).getMusicList().get();
        } catch (ExecutionException e) {
            throw f99975b.propagateCompatibleException(e);
        }
    }
}
