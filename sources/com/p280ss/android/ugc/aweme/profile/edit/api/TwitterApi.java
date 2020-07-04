package com.p280ss.android.ugc.aweme.profile.edit.api;

import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofit;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.concurrent.ExecutionException;
import retrofit2.p363b.C7727c;
import retrofit2.p363b.C7729e;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7739o;

/* renamed from: com.ss.android.ugc.aweme.profile.edit.api.TwitterApi */
public final class TwitterApi {

    /* renamed from: a */
    private static final IRetrofit f93716a = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b);

    /* renamed from: b */
    private static IRetrofitService f93717b = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class));

    /* renamed from: com.ss.android.ugc.aweme.profile.edit.api.TwitterApi$RealApi */
    interface RealApi {
        @C7729e
        @C7739o(mo20429a = "/aweme/v1/twitter/bind/")
        C18253l<String> bindTwitter(@C7727c(mo20417a = "twitter_id") String str, @C7727c(mo20417a = "twitter_name") String str2);

        @C7730f(mo20420a = "/aweme/v1/twitter/unbind/")
        C18253l<String> unbindYouTube();
    }

    /* renamed from: a */
    public static String m115485a() throws Exception {
        try {
            return (String) ((RealApi) f93716a.create(RealApi.class)).unbindYouTube().get();
        } catch (ExecutionException e) {
            throw f93717b.propagateCompatibleException(e);
        }
    }

    /* renamed from: a */
    public static String m115486a(String str, String str2) throws Exception {
        try {
            return (String) ((RealApi) f93716a.create(RealApi.class)).bindTwitter(str, str2).get();
        } catch (ExecutionException e) {
            throw f93717b.propagateCompatibleException(e);
        }
    }
}
