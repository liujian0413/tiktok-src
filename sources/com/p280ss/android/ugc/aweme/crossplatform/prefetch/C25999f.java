package com.p280ss.android.ugc.aweme.crossplatform.prefetch;

import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.ies.web.p583b.C11110e;
import com.bytedance.ies.web.p583b.C11110e.C11111a;
import com.bytedance.ies.web.p583b.C11110e.C11112b;
import com.bytedance.retrofit2.p637a.C12461b;
import com.p280ss.android.common.applog.NetUtil;
import com.p280ss.android.common.util.C19290j;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.app.api.C22838j;
import com.p280ss.android.ugc.aweme.net.CommonApi;
import com.p280ss.android.ugc.aweme.utils.C43023cr;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C48038d;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.prefetch.f */
public final class C25999f implements C11110e {

    /* renamed from: a */
    public static final C25999f f68725a = new C25999f();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final CommonApi f68726b = ((CommonApi) C22838j.m75274a(Api.f60502b).mo30492a(CommonApi.class));

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.prefetch.f$a */
    static final class C26000a<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ String f68727a;

        C26000a(String str) {
            this.f68727a = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public String call() {
            C19290j jVar = new C19290j(this.f68727a);
            C25999f.m85387a(jVar, "request_tag_from", "rn");
            String jVar2 = jVar.toString();
            C7573i.m23582a((Object) jVar2, "urlBuilder.toString()");
            return (String) C25999f.f68726b.doGet(jVar2, 0).execute().f33302b;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.prefetch.f$b */
    static final class C26001b<TTaskResult, TContinuationResult> implements C1591g<String, Void> {

        /* renamed from: a */
        final /* synthetic */ C11111a f68728a;

        C26001b(C11111a aVar) {
            this.f68728a = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void then(C1592h<String> hVar) {
            C7573i.m23582a((Object) hVar, "it");
            if (!hVar.mo6889d()) {
                C11111a aVar = this.f68728a;
                C11112b bVar = new C11112b();
                Object e = hVar.mo6890e();
                C7573i.m23582a(e, "it.result");
                String str = (String) e;
                Charset charset = C48038d.f122880a;
                if (str != null) {
                    byte[] bytes = str.getBytes(charset);
                    C7573i.m23582a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
                    bVar.mo27093a(bytes);
                    bVar.mo27092a((Map<String, String>) new HashMap<String,String>());
                    aVar.mo27089a(bVar);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.prefetch.f$c */
    static final class C26002c<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ String f68729a;

        /* renamed from: b */
        final /* synthetic */ String f68730b;

        /* renamed from: c */
        final /* synthetic */ JSONObject f68731c;

        /* renamed from: d */
        final /* synthetic */ Map f68732d;

        C26002c(String str, String str2, JSONObject jSONObject, Map map) {
            this.f68729a = str;
            this.f68730b = str2;
            this.f68731c = jSONObject;
            this.f68732d = map;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public String call() {
            List list;
            C19290j jVar = new C19290j(this.f68729a);
            C25999f.m85387a(jVar, "request_tag_from", "rn");
            if (this.f68730b != null) {
                String jVar2 = jVar.toString();
                C43023cr crVar = C43023cr.f111606a;
                JSONObject jSONObject = this.f68731c;
                String str = this.f68730b;
                Map map = this.f68732d;
                if (map != null) {
                    Collection arrayList = new ArrayList(map.size());
                    for (Entry entry : map.entrySet()) {
                        arrayList.add(new C12461b((String) entry.getKey(), (String) entry.getValue()));
                    }
                    list = (List) arrayList;
                } else {
                    list = null;
                }
                return crVar.mo104700b(jVar2, jSONObject, str, C7525m.m23509d((Collection<? extends T>) list));
            }
            HashMap hashMap = new HashMap();
            if (this.f68731c != null) {
                Iterator keys = this.f68731c.keys();
                while (keys.hasNext()) {
                    String str2 = (String) keys.next();
                    String optString = this.f68731c.optString(str2);
                    if (optString != null) {
                        Map map2 = hashMap;
                        C7573i.m23582a((Object) str2, "key");
                        map2.put(str2, optString);
                    }
                }
            }
            String jVar3 = jVar.toString();
            Map map3 = hashMap;
            NetUtil.putCommonParams(map3, true);
            return (String) C25999f.f68726b.doPost(jVar3, 0, map3).execute().f33302b;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.prefetch.f$d */
    static final class C26003d<TTaskResult, TContinuationResult> implements C1591g<String, Void> {

        /* renamed from: a */
        final /* synthetic */ C11111a f68733a;

        C26003d(C11111a aVar) {
            this.f68733a = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void then(C1592h<String> hVar) {
            C7573i.m23582a((Object) hVar, "it");
            if (!hVar.mo6889d()) {
                String str = (String) hVar.mo6890e();
                if (str != null) {
                    C11111a aVar = this.f68733a;
                    C11112b bVar = new C11112b();
                    Charset charset = C48038d.f122880a;
                    if (str != null) {
                        byte[] bytes = str.getBytes(charset);
                        C7573i.m23582a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
                        bVar.mo27093a(bytes);
                        bVar.mo27092a((Map<String, String>) new HashMap<String,String>());
                        aVar.mo27089a(bVar);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                }
            }
            return null;
        }
    }

    private C25999f() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m85387a(com.p280ss.android.common.util.C19290j r4, java.lang.String r5, java.lang.String r6) {
        /*
            java.util.List<com.ss.android.http.legacy.a.e> r0 = r4.f52191a
            r1 = 1
            if (r0 == 0) goto L_0x002f
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ r1
            if (r2 == 0) goto L_0x002f
            java.util.Iterator r0 = r0.iterator()
        L_0x0013:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x002f
            java.lang.Object r2 = r0.next()
            com.ss.android.http.legacy.a.e r2 = (com.p280ss.android.http.legacy.p296a.C19565e) r2
            java.lang.String r3 = "pair"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            java.lang.String r2 = r2.mo51722a()
            boolean r2 = kotlin.text.C7634n.m23717a(r5, r2, r1)
            if (r2 == 0) goto L_0x0013
            goto L_0x0030
        L_0x002f:
            r1 = 0
        L_0x0030:
            if (r1 != 0) goto L_0x0035
            r4.mo51188a(r5, r6)
        L_0x0035:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.crossplatform.prefetch.C25999f.m85387a(com.ss.android.common.util.j, java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo11522a(String str, Map<String, String> map, C11111a aVar) {
        C7573i.m23587b(str, "url");
        C7573i.m23587b(map, "headers");
        C7573i.m23587b(aVar, "callback");
        C1592h.m7853a((Callable<TResult>) new C26000a<TResult>(str)).mo6876a((C1591g<TResult, TContinuationResult>) new C26001b<TResult,TContinuationResult>(aVar), C1592h.f5958b);
    }

    /* renamed from: a */
    public final void mo11523a(String str, Map<String, String> map, String str2, JSONObject jSONObject, C11111a aVar) {
        C7573i.m23587b(str, "url");
        C7573i.m23587b(map, "headers");
        C7573i.m23587b(str2, "mimeType");
        C7573i.m23587b(jSONObject, "postBody");
        C7573i.m23587b(aVar, "callback");
        C1592h.m7853a((Callable<TResult>) new C26002c<TResult>(str, str2, jSONObject, map)).mo6876a((C1591g<TResult, TContinuationResult>) new C26003d<TResult,TContinuationResult>(aVar), C1592h.f5958b);
    }
}
