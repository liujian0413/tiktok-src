package com.p280ss.android.ugc.aweme.p1216fe.method.feeds.api;

import com.p280ss.android.ugc.aweme.app.api.C22838j;
import com.p280ss.android.ugc.aweme.p1216fe.method.feeds.p1221b.C27989a;
import java.util.Map;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7745u;
import retrofit2.p363b.C7748x;

/* renamed from: com.ss.android.ugc.aweme.fe.method.feeds.api.IDynamicApi */
public interface IDynamicApi {

    /* renamed from: a */
    public static final C27985a f73712a = C27985a.f73713a;

    /* renamed from: com.ss.android.ugc.aweme.fe.method.feeds.api.IDynamicApi$a */
    public static final class C27985a {

        /* renamed from: a */
        static final /* synthetic */ C27985a f73713a = new C27985a();

        private C27985a() {
        }

        /* renamed from: a */
        public static IDynamicApi m91586a(String str) {
            C7573i.m23587b(str, "baseUrl");
            Object a = C22838j.m75274a(str).mo30492a(IDynamicApi.class);
            C7573i.m23582a(a, "RetrofitFactory.createTT…(IDynamicApi::class.java)");
            return (IDynamicApi) a;
        }
    }

    @C7730f
    C7492s<C27989a> loadVideos(@C7748x String str, @C7745u Map<String, String> map);
}
