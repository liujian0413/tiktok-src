package com.p280ss.android.ugc.aweme.commerce.service.logs;

import bolts.C1592h;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.commerce.service.logs.RealApi */
public interface RealApi {

    /* renamed from: a */
    public static final C24455a f64505a = C24455a.f64506a;

    /* renamed from: com.ss.android.ugc.aweme.commerce.service.logs.RealApi$a */
    public static final class C24455a {

        /* renamed from: a */
        static final /* synthetic */ C24455a f64506a = new C24455a();

        private C24455a() {
        }
    }

    @C7730f(mo20420a = "/aweme/v2/shop/user/behavior")
    C1592h<Object> post(@C7744t(mo20436a = "data") String str);
}
