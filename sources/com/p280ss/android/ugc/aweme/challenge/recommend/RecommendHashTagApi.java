package com.p280ss.android.ugc.aweme.challenge.recommend;

import android.arch.lifecycle.C0052o;
import bolts.C1591g;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.challenge.recommend.p1085a.C23698a;
import com.p280ss.android.ugc.aweme.challenge.recommend.p1085a.C23700b;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25293bu;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.port.p1479in.C35584s.C35589e;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.challenge.recommend.RecommendHashTagApi */
public final class RecommendHashTagApi {

    /* renamed from: a */
    public static final RecommendHashTagApi f62451a = new RecommendHashTagApi();

    /* renamed from: b */
    private static final HashTagApi f62452b = ((HashTagApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(HashTagApi.class));

    /* renamed from: com.ss.android.ugc.aweme.challenge.recommend.RecommendHashTagApi$HashTagApi */
    public interface HashTagApi {

        /* renamed from: a */
        public static final C23695a f62453a = C23695a.f62454a;

        /* renamed from: com.ss.android.ugc.aweme.challenge.recommend.RecommendHashTagApi$HashTagApi$a */
        public static final class C23695a {

            /* renamed from: a */
            static final /* synthetic */ C23695a f62454a = new C23695a();

            private C23695a() {
            }
        }

        @C7730f(mo20420a = "/aweme/v1/challenge/history/intervene/")
        C1592h<C23700b> fetchRecommendHashTags(@C7744t(mo20436a = "debug") String str, @C7744t(mo20436a = "zip_uri") String str2, @C7744t(mo20436a = "effect_ids") String str3, @C7744t(mo20436a = "music_id") String str4, @C7744t(mo20436a = "video_id") String str5, @C7744t(mo20436a = "mac_address") String str6);
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.recommend.RecommendHashTagApi$a */
    static final class C23696a<TTaskResult, TContinuationResult> implements C1591g<C23700b, Void> {

        /* renamed from: a */
        final /* synthetic */ C0052o f62455a;

        C23696a(C0052o oVar) {
            this.f62455a = oVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void then(C1592h<C23700b> hVar) {
            C7573i.m23582a((Object) hVar, "task");
            if (hVar.mo6882b()) {
                List<C23698a> list = ((C23700b) hVar.mo6890e()).f62466a;
                C7573i.m23582a((Object) list, "task.result.data");
                C7525m.m23474a(list, C236971.f62456a);
                this.f62455a.setValue(hVar.mo6890e());
            }
            return null;
        }
    }

    private RecommendHashTagApi() {
    }

    /* renamed from: a */
    public static void m77667a(C0052o<C23700b> oVar, C35589e eVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        C7573i.m23587b(oVar, "data");
        HashTagApi hashTagApi = f62452b;
        if (hashTagApi == null) {
            C7573i.m23580a();
        }
        if (eVar != null) {
            str = eVar.f93288e;
        } else {
            str = null;
        }
        if (eVar != null) {
            str2 = eVar.f93287d;
        } else {
            str2 = null;
        }
        if (eVar != null) {
            str3 = eVar.f93285b;
        } else {
            str3 = null;
        }
        if (eVar != null) {
            str4 = eVar.f93284a;
        } else {
            str4 = null;
        }
        if (eVar != null) {
            str5 = eVar.f93286c;
        } else {
            str5 = null;
        }
        hashTagApi.fetchRecommendHashTags(str, str2, str3, str4, str5, C25293bu.m83101a()).mo6876a((C1591g<TResult, TContinuationResult>) new C23696a<TResult,TContinuationResult>(oVar), C1592h.f5958b);
    }
}
