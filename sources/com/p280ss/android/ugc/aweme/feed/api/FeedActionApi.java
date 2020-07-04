package com.p280ss.android.ugc.aweme.feed.api;

import android.support.p022v4.util.C0902i;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.p284b.C19223b;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.feed.api.FeedActionApi */
public final class FeedActionApi {

    /* renamed from: a */
    private static final RetrofitApi f74319a = ((RetrofitApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(C19223b.f51890e).create(RetrofitApi.class));

    /* renamed from: com.ss.android.ugc.aweme.feed.api.FeedActionApi$RetrofitApi */
    interface RetrofitApi {
        @C7730f(mo20420a = "/aweme/v1/aweme/delete/")
        C18253l<BaseResponse> deleteItem(@C7744t(mo20436a = "aweme_id") String str);

        @C7730f(mo20420a = "/aweme/v1/commit/item/digg/")
        C18253l<BaseResponse> diggItem(@C7744t(mo20436a = "aweme_id") String str, @C7744t(mo20436a = "type") int i, @C7744t(mo20436a = "channel_id") int i2);

        @C7730f(mo20420a = "/aweme/v1/commit/item/digg/")
        C18253l<BaseResponse> diggItem(@C7744t(mo20436a = "aweme_id") String str, @C7744t(mo20436a = "origin_aweme_id") String str2, @C7744t(mo20436a = "type") int i, @C7744t(mo20436a = "channel_id") int i2);
    }

    /* renamed from: a */
    public static String m92738a(String str) throws Exception {
        f74319a.deleteItem(str).get();
        return str;
    }

    /* renamed from: a */
    public static C0902i<String, Integer> m92736a(String str, int i, int i2) throws Exception {
        f74319a.diggItem(str, i, i2).get();
        return C0902i.m3837a(str, Integer.valueOf(i));
    }

    /* renamed from: a */
    public static C0902i<String, Integer> m92737a(String str, String str2, int i, int i2) throws Exception {
        f74319a.diggItem(str, str2, i, i2).get();
        return C0902i.m3837a(str, Integer.valueOf(i));
    }
}
