package com.p280ss.android.ugc.aweme.p313im.sdk.videofileplay;

import bolts.C1592h;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p313im.sdk.videofileplay.p1349a.C31941b;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.videofileplay.a */
public final class C31938a {

    /* renamed from: a */
    public static final C31938a f83434a = new C31938a();

    /* renamed from: b */
    private static EncryptedVideoApi f83435b;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.videofileplay.a$a */
    static final class C31939a<V> implements Callable<TResult> {

        /* renamed from: a */
        public static final C31939a f83436a = new C31939a();

        C31939a() {
        }

        public final /* bridge */ /* synthetic */ Object call() {
            return null;
        }
    }

    private C31938a() {
    }

    /* renamed from: a */
    private static EncryptedVideoApi m103747a() {
        if (f83435b == null) {
            IRetrofitService iRetrofitService = (IRetrofitService) ServiceManager.get().getService(IRetrofitService.class);
            if (iRetrofitService != null) {
                f83435b = (EncryptedVideoApi) iRetrofitService.createNewRetrofit("https://aweme.snssdk.com/").create(EncryptedVideoApi.class);
            }
        }
        return f83435b;
    }

    /* renamed from: a */
    public static C1592h<C31941b> m103746a(String str) {
        C7573i.m23587b(str, "tosKey");
        if (m103747a() != null) {
            EncryptedVideoApi a = m103747a();
            if (a == null) {
                C7573i.m23580a();
            }
            return a.getVideoPlayUrl(str);
        }
        C1592h<C31941b> a2 = C1592h.m7853a((Callable<TResult>) C31939a.f83436a);
        C7573i.m23582a((Object) a2, "Task.callInBackground { null }");
        return a2;
    }
}
