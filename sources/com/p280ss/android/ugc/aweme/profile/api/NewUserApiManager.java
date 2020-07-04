package com.p280ss.android.ugc.aweme.profile.api;

import android.arch.lifecycle.C0052o;
import bolts.C1591g;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.profile.model.NewUserCount;
import com.p280ss.android.ugc.aweme.viewmodel.Resource;
import retrofit2.p363b.C7730f;

/* renamed from: com.ss.android.ugc.aweme.profile.api.NewUserApiManager */
public final class NewUserApiManager {

    /* renamed from: a */
    private static NewUserApi f93689a = ((NewUserApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(NewUserApi.class));

    /* renamed from: com.ss.android.ugc.aweme.profile.api.NewUserApiManager$NewUserApi */
    interface NewUserApi {
        @C7730f(mo20420a = "/aweme/v2/new/recommend/user/count/")
        C1592h<NewUserCount> getNewUserCount();
    }

    /* renamed from: a */
    public static void m115438a(C0052o<Resource<NewUserCount>> oVar) {
        f93689a.getNewUserCount().mo6876a((C1591g<TResult, TContinuationResult>) new C35730f<TResult,TContinuationResult>(oVar), C1592h.f5958b);
    }

    /* renamed from: a */
    static final /* synthetic */ Void m115437a(C0052o oVar, C1592h hVar) throws Exception {
        if (hVar.mo6889d()) {
            oVar.setValue(Resource.m137531a(hVar.mo6891f()));
        } else {
            oVar.setValue(Resource.m137532a(hVar.mo6890e()));
        }
        return null;
    }
}
