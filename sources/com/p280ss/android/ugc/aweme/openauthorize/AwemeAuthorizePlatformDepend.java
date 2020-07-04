package com.p280ss.android.ugc.aweme.openauthorize;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.retrofit2.p264b.C6450ac;
import com.bytedance.retrofit2.p264b.C6455f;
import com.bytedance.retrofit2.p264b.C6456g;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6468s;
import com.bytedance.sdk.account.bdplatform.p655a.C12755b;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.p284b.C19223b;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizePlatformDepend */
public final class AwemeAuthorizePlatformDepend implements C12755b {

    /* renamed from: a */
    private AuthorizeApi f90422a = ((AuthorizeApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C19223b.f51890e).mo26430a().mo26435a(AuthorizeApi.class));

    /* renamed from: b */
    private ThreadPoolExecutor f90423b;

    /* renamed from: com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizePlatformDepend$AuthorizeApi */
    public interface AuthorizeApi {
        @C6457h
        C18253l<String> doGet(@C6450ac String str);

        @C6456g
        @C6468s
        C18253l<String> doPost(@C6450ac String str, @C6455f Map<String, String> map);
    }

    /* renamed from: c */
    public final String mo31275c() {
        return "api2.musical.ly";
    }

    /* renamed from: d */
    public final String mo31276d() {
        return "open-api.musical.ly";
    }

    /* renamed from: a */
    public final boolean mo31273a() {
        IAccountUserService a = C21115b.m71197a();
        C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
        return a.isLogin();
    }

    /* renamed from: b */
    public final boolean mo31274b() {
        return C34665c.m111959a(AwemeApplication.m21341a());
    }

    /* renamed from: a */
    public final void mo31272a(Runnable runnable) {
        this.f90423b.execute(runnable);
    }

    /* renamed from: a */
    public final String mo31270a(String str) {
        Object obj = this.f90422a.doGet(str).get();
        C7573i.m23582a(obj, "mAuthorizeApi.doGet(p0).get()");
        return (String) obj;
    }

    public AwemeAuthorizePlatformDepend(C34669e eVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 5, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
        this.f90423b = threadPoolExecutor;
    }

    /* renamed from: a */
    public final String mo31271a(String str, Map<String, String> map) {
        Object obj = this.f90422a.doPost(str, map).get();
        C7573i.m23582a(obj, "mAuthorizeApi.doPost(p0, p1).get()");
        return (String) obj;
    }
}
