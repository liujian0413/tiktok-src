package com.p280ss.android.newmedia.eplatform.api;

import bolts.C1592h;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.newmedia.eplatform.api.EPlatformApi */
public interface EPlatformApi {

    /* renamed from: a */
    public static final C19933a f54016a = C19933a.f54017a;

    /* renamed from: com.ss.android.newmedia.eplatform.api.EPlatformApi$a */
    public static final class C19933a {

        /* renamed from: a */
        static final /* synthetic */ C19933a f54017a = new C19933a();

        private C19933a() {
        }
    }

    @C7730f(mo20420a = "https://aweme.snssdk.com/aweme/v1/commerce/seclink/verify/")
    C1592h<C19935b> hostVerify(@C7744t(mo20436a = "target") String str);
}
