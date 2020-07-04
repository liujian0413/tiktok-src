package com.p280ss.android.ugc.aweme.device;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.utils.C42941at;
import com.p280ss.android.ugc.aweme.utils.C42941at.C42943a;
import com.p280ss.android.ugc.aweme.utils.C42941at.C42944b;
import com.p280ss.android.ugc.aweme.utils.C42941at.C42945c;
import com.p280ss.android.ugc.aweme.utils.C42941at.C42946d;
import java.util.Map;
import java.util.concurrent.Callable;
import p346io.reactivex.C47557ad;
import p346io.reactivex.C7319aa;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.device.a */
public final class C26216a {

    /* renamed from: a */
    private static boolean f69110a;

    /* renamed from: com.ss.android.ugc.aweme.device.a$a */
    public static class C26218a {

        /* renamed from: a */
        public C42943a f69111a;

        /* renamed from: b */
        public C42945c f69112b;

        /* renamed from: c */
        public C42946d f69113c;

        /* renamed from: d */
        public C42944b f69114d;
    }

    /* renamed from: a */
    public static void m86189a() {
        if (!f69110a) {
            Context a = C6399b.m19921a();
            if (a != null) {
                m86190b(a);
                f69110a = true;
            }
        }
    }

    /* renamed from: a */
    static final /* synthetic */ C26218a m86188a(Context context) throws Exception {
        C26218a aVar = new C26218a();
        aVar.f69111a = C42941at.m136311b(context);
        aVar.f69112b = C42941at.m136307a(context);
        aVar.f69113c = C42941at.m136314c(context);
        aVar.f69114d = C42941at.m136317d(context);
        return aVar;
    }

    /* renamed from: b */
    private static void m86190b(Context context) {
        C7319aa.m22932a((Callable<? extends T>) new C26219b<Object>(context)).mo19135b(C7333a.m23044b()).mo19127a(C7333a.m23044b()).mo19137b((C47557ad<? super T>) new C47557ad<C26218a>() {
            public final void onError(Throwable th) {
            }

            public final void onSubscribe(C7321c cVar) {
            }

            public final /* synthetic */ void onSuccess(Object obj) {
                m86191a((C26218a) obj);
            }

            /* renamed from: a */
            private static void m86191a(C26218a aVar) {
                C42943a aVar2 = aVar.f69111a;
                C42945c cVar = aVar.f69112b;
                C42946d dVar = aVar.f69113c;
                C42944b bVar = aVar.f69114d;
                C6907h.m21524a("device_info", (Map) C22984d.m75611a().mo59973a("cpu_vendor", aVar2.f111475a).mo59970a("cpu_core_nums", aVar2.f111477c).mo59970a("cpu_freq", aVar2.f111476b).mo59970a("screen_dpi", cVar.f111480a).mo59970a("screen_width", cVar.f111481b).mo59970a("screen_height", cVar.f111482c).mo59971a("app_storage_size", dVar.f111487e).mo59971a("storage_total_external_size", dVar.f111484b).mo59971a("storage_available_external_size", dVar.f111483a).mo59971a("storage_total_internal_size", dVar.f111486d).mo59971a("storage_available_internal_size", dVar.f111485c).mo59971a("memory_total_size", bVar.f111478a).mo59971a("memory_available_size", bVar.f111479b).mo59973a("brand", Build.BRAND).mo59973a("os_version", VERSION.RELEASE).mo59970a("os_api_level", VERSION.SDK_INT).mo59973a("Board", Build.BOARD).mo59973a("brand", Build.BRAND).mo59973a("device", Build.DEVICE).mo59973a("hardware", Build.HARDWARE).mo59973a("manufacturer", Build.MANUFACTURER).mo59973a("model", Build.MODEL).mo59973a("product", Build.PRODUCT).mo59973a("abis", C42941at.m136312b()).mo59971a("build_time", Build.TIME).mo59970a("install_on_sdcard", dVar.f111488f).f60753a);
            }
        });
    }
}
