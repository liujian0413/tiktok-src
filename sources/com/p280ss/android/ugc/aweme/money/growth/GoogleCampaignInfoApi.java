package com.p280ss.android.ugc.aweme.money.growth;

import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.android.gms.ads.p742b.C14733a;
import com.google.android.gms.ads.p742b.C14733a.C14734a;
import com.p280ss.android.p284b.C19223b;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.money.growth.GoogleCampaignInfoApi */
public final class GoogleCampaignInfoApi {

    /* renamed from: a */
    public static final GoogleCampaignApi f87749a = ((GoogleCampaignApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(C19223b.f51890e).create(GoogleCampaignApi.class));

    /* renamed from: b */
    public static final C33621a f87750b = new C33621a(null);

    /* renamed from: com.ss.android.ugc.aweme.money.growth.GoogleCampaignInfoApi$GoogleCampaignApi */
    public interface GoogleCampaignApi {
        @C7730f(mo20420a = "/aweme/v1/activity/campaign/")
        C1592h<C33630a> querySettings(@C7744t(mo20436a = "google_aid") String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.money.growth.GoogleCampaignInfoApi$a */
    public static final class C33621a {

        /* renamed from: com.ss.android.ugc.aweme.money.growth.GoogleCampaignInfoApi$a$a */
        static final class C33622a<V> implements Callable<TResult> {

            /* renamed from: a */
            public static final C33622a f87751a = new C33622a();

            C33622a() {
            }

            public final /* synthetic */ Object call() {
                return m108516a();
            }

            /* renamed from: a */
            private static C1592h<C1592h<C33630a>> m108516a() {
                C14734a a = C14733a.m42585a(C6399b.m19921a());
                GoogleCampaignApi a2 = C33621a.m108514a();
                C7573i.m23582a((Object) a, "info");
                String str = a.f38079a;
                C7573i.m23582a((Object) str, "info.id");
                return a2.querySettings(str).mo6876a((C1591g<TResult, TContinuationResult>) C336231.f87752a, (Executor) C1592h.f5957a);
            }
        }

        private C33621a() {
        }

        /* renamed from: a */
        public static GoogleCampaignApi m108514a() {
            return GoogleCampaignInfoApi.f87749a;
        }

        /* renamed from: b */
        public static void m108515b() {
            C1592h.m7853a((Callable<TResult>) C33622a.f87751a);
        }

        public /* synthetic */ C33621a(C7571f fVar) {
            this();
        }
    }
}
