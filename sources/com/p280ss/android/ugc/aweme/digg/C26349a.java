package com.p280ss.android.ugc.aweme.digg;

import bolts.C1592h;
import com.p280ss.android.p284b.C19223b;
import com.p280ss.android.ugc.aweme.digg.p1171a.C26350a;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofit;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.digg.a */
public final class C26349a {

    /* renamed from: a */
    public static final C26349a f69364a = new C26349a();

    /* renamed from: b */
    private static final LikeUsersApi f69365b;

    private C26349a() {
    }

    static {
        LikeUsersApi likeUsersApi;
        IRetrofitService iRetrofitService = (IRetrofitService) ServiceManager.get().getService(IRetrofitService.class);
        if (iRetrofitService != null) {
            IRetrofit createNewRetrofit = iRetrofitService.createNewRetrofit(C19223b.f51890e);
            if (createNewRetrofit != null) {
                likeUsersApi = (LikeUsersApi) createNewRetrofit.create(LikeUsersApi.class);
                f69365b = likeUsersApi;
            }
        }
        likeUsersApi = null;
        f69365b = likeUsersApi;
    }

    /* renamed from: a */
    public static C1592h<C26350a> m86678a(String str, int i, long j, long j2, int i2, String str2, int i3) {
        String str3 = str;
        C7573i.m23587b(str, "itemId");
        C7573i.m23587b(str2, "insertIds");
        LikeUsersApi likeUsersApi = f69365b;
        if (likeUsersApi != null) {
            return likeUsersApi.getFavoriteList(str, i, j, j2, i2, str2, i3);
        }
        return null;
    }
}
