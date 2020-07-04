package com.p280ss.android.newmedia.eplatform.api;

import bolts.C1592h;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.newmedia.eplatform.api.a */
public final class C19934a {

    /* renamed from: a */
    public static final C19934a f54018a = new C19934a();

    /* renamed from: b */
    private static final EPlatformApi f54019b;

    private C19934a() {
    }

    static {
        Object create = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com/").create(EPlatformApi.class);
        C7573i.m23582a(create, "ServiceManager.get().get…EPlatformApi::class.java)");
        f54019b = (EPlatformApi) create;
    }

    /* renamed from: a */
    public static final C1592h<C19935b> m65764a(String str) {
        C7573i.m23587b(str, "schema");
        return f54019b.hostVerify(str);
    }
}
