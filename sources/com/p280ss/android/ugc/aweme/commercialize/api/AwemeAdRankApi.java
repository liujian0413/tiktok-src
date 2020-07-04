package com.p280ss.android.ugc.aweme.commercialize.api;

import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.retrofit2.p264b.C6474y;
import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.commercialize.model.AwemeAdRank;
import com.p280ss.android.ugc.aweme.commercialize.model.C24997g;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C7581n;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import org.json.JSONArray;
import retrofit2.p363b.C7730f;

/* renamed from: com.ss.android.ugc.aweme.commercialize.api.AwemeAdRankApi */
public final class AwemeAdRankApi {

    /* renamed from: a */
    public static final AwemeAdRankApi f64773a = new AwemeAdRankApi();

    /* renamed from: b */
    private static final RealApi f64774b;

    /* renamed from: c */
    private static final C6600e f64775c;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.api.AwemeAdRankApi$RealApi */
    public interface RealApi {
        @C7730f(mo20420a = "/aweme/v1/ad/rank/")
        C1592h<C24997g> requestAwemeAdRank(@C6474y(mo15757a = "cached_aweme_list") JSONArray jSONArray, @C6474y(mo15757a = "last_ad_show_interval") long j);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.api.AwemeAdRankApi$a */
    public interface C24538a {
        /* renamed from: a */
        void mo64341a(String str);

        /* renamed from: a */
        void mo64342a(String str, Exception exc);

        /* renamed from: a */
        void mo64343a(List<AwemeAdRank> list);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.api.AwemeAdRankApi$b */
    static final class C24539b<TTaskResult, TContinuationResult> implements C1591g<TResult, TContinuationResult> {

        /* renamed from: a */
        final /* synthetic */ C24538a f64776a;

        C24539b(C24538a aVar) {
            this.f64776a = aVar;
        }

        public final /* synthetic */ Object then(C1592h hVar) {
            m80549a(hVar);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m80549a(C1592h<C24997g> hVar) {
            List<AwemeAdRank> list;
            C7573i.m23582a((Object) hVar, "task");
            if (hVar.mo6887c()) {
                C24538a aVar = this.f64776a;
                if (aVar != null) {
                    aVar.mo64341a("request canceled");
                    return;
                }
                return;
            }
            if (hVar.mo6889d()) {
                C24538a aVar2 = this.f64776a;
                if (aVar2 != null) {
                    String message = hVar.mo6891f().getMessage();
                    if (message == null) {
                        message = "";
                    }
                    aVar2.mo64342a(message, hVar.mo6891f());
                }
            } else {
                C24997g gVar = (C24997g) hVar.mo6890e();
                if (gVar.f65908a == 204) {
                    C24538a aVar3 = this.f64776a;
                    if (aVar3 != null) {
                        String str = gVar.f65909b;
                        if (str == null) {
                            str = "204: no change";
                        }
                        aVar3.mo64341a(str);
                        return;
                    }
                    return;
                }
                List<AwemeAdRank> list2 = gVar.f65910c;
                if (list2 != null) {
                    list = C7525m.m23510e(list2);
                } else {
                    list = null;
                }
                if (list != null) {
                    C28199ae a = C28199ae.m92689a();
                    C7573i.m23582a((Object) gVar, "response");
                    a.mo71792a(gVar.getRequestId(), gVar.f65911d);
                    for (AwemeAdRank repackAweme : list) {
                        Aweme repackAweme2 = repackAweme.getRepackAweme();
                        if (repackAweme2 != null) {
                            repackAweme2.setRequestId(gVar.getRequestId());
                        }
                    }
                    C24538a aVar4 = this.f64776a;
                    if (aVar4 != null) {
                        aVar4.mo64343a(list);
                    }
                } else {
                    C24538a aVar5 = this.f64776a;
                    if (aVar5 != null) {
                        aVar5.mo64342a("empty rank list", new IllegalArgumentException("empty rank list"));
                    }
                }
            }
        }
    }

    private AwemeAdRankApi() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0032  */
    static {
        /*
            com.ss.android.ugc.aweme.commercialize.api.AwemeAdRankApi r0 = new com.ss.android.ugc.aweme.commercialize.api.AwemeAdRankApi
            r0.<init>()
            f64773a = r0
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            r1 = 0
            if (r0 == 0) goto L_0x0029
            java.lang.Class<com.bytedance.ies.ugc.aweme.network.IRetrofitFactory> r2 = com.bytedance.ies.ugc.aweme.network.IRetrofitFactory.class
            java.lang.Object r0 = r0.getService(r2)
            com.bytedance.ies.ugc.aweme.network.IRetrofitFactory r0 = (com.bytedance.ies.ugc.aweme.network.IRetrofitFactory) r0
            if (r0 == 0) goto L_0x0029
            java.lang.String r2 = com.p280ss.android.p284b.C19223b.f51890e
            com.bytedance.ies.ugc.aweme.network.d r0 = r0.create(r2)
            if (r0 == 0) goto L_0x0029
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.api.AwemeAdRankApi$RealApi> r2 = com.p280ss.android.ugc.aweme.commercialize.api.AwemeAdRankApi.RealApi.class
            java.lang.Object r0 = r0.mo26435a(r2)
            com.ss.android.ugc.aweme.commercialize.api.AwemeAdRankApi$RealApi r0 = (com.p280ss.android.ugc.aweme.commercialize.api.AwemeAdRankApi.RealApi) r0
            goto L_0x002a
        L_0x0029:
            r0 = r1
        L_0x002a:
            f64774b = r0
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            if (r0 == 0) goto L_0x0040
            java.lang.Class<com.ss.android.ugc.aweme.utils.GsonProvider> r2 = com.p280ss.android.ugc.aweme.utils.GsonProvider.class
            java.lang.Object r0 = r0.getService(r2)
            com.ss.android.ugc.aweme.utils.GsonProvider r0 = (com.p280ss.android.ugc.aweme.utils.GsonProvider) r0
            if (r0 == 0) goto L_0x0040
            com.google.gson.e r1 = r0.getGson()
        L_0x0040:
            f64775c = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.api.AwemeAdRankApi.<clinit>():void");
    }

    /* renamed from: a */
    private static void m80544a(JSONArray jSONArray, long j, C24538a aVar) {
        try {
            RealApi realApi = f64774b;
            if (realApi != null) {
                C1592h requestAwemeAdRank = realApi.requestAwemeAdRank(jSONArray, j);
                if (requestAwemeAdRank != null) {
                    requestAwemeAdRank.mo6875a((C1591g<TResult, TContinuationResult>) new C24539b<TResult,TContinuationResult>(aVar));
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo64339a(List<? extends Aweme> list, long j, C24538a aVar) {
        String str;
        C7573i.m23587b(list, "cachedAwemeList");
        Iterable<Aweme> iterable = list;
        Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
        for (Aweme aweme : iterable) {
            AwemeAdRank awemeAdRank = new AwemeAdRank(aweme.getAid(), aweme.isAd() ? 1 : 0, null, 4, null);
            arrayList.add(awemeAdRank);
        }
        List list2 = (List) arrayList;
        C6600e eVar = f64775c;
        if (eVar != null) {
            str = eVar.mo15979b((Object) list2);
        } else {
            str = null;
        }
        m80544a(new JSONArray(str), j, aVar);
    }
}
