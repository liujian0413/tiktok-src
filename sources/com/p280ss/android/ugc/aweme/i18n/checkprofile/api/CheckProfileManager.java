package com.p280ss.android.ugc.aweme.i18n.checkprofile.api;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6474y;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: com.ss.android.ugc.aweme.i18n.checkprofile.api.CheckProfileManager */
public final class CheckProfileManager {

    /* renamed from: a */
    private static CheckProfileApi f79978a;

    /* renamed from: com.ss.android.ugc.aweme.i18n.checkprofile.api.CheckProfileManager$CheckProfileApi */
    interface CheckProfileApi {
        @C6457h(mo15740a = "/aweme/v1/profile/checked_userlist/")
        C18253l<Response> checkProfile(@C6474y(mo15757a = "cursor") int i, @C6474y(mo15757a = "count") int i2);
    }

    /* renamed from: com.ss.android.ugc.aweme.i18n.checkprofile.api.CheckProfileManager$Response */
    public static class Response {
        public int cursor;
        public boolean has_more;
        public int status_code;
        public List<User> users;
    }

    static {
        IRetrofitService iRetrofitService = (IRetrofitService) ServiceManager.get().getService(IRetrofitService.class);
        StringBuilder sb = new StringBuilder("https://");
        sb.append(C6399b.m19926b().f18690a);
        sb.append("/");
        f79978a = (CheckProfileApi) iRetrofitService.createNewRetrofit(sb.toString()).create(CheckProfileApi.class);
    }

    /* renamed from: a */
    public static Response m99445a(int i, int i2) throws Exception {
        try {
            return (Response) f79978a.checkProfile(i, i2).get();
        } catch (ExecutionException e) {
            throw ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).propagateCompatibleException(e);
        }
    }
}
