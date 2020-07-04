package com.p280ss.android.ugc.aweme.discover.p1185ui;

import com.bytedance.ies.web.p582a.C11087a;
import com.bytedance.keva.Keva;
import com.google.gson.C6709k;
import com.google.gson.C6711m;
import com.p280ss.android.ugc.aweme.discover.p1185ui.search.C27064b;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.GetABTest */
public final class GetABTest extends BaseCommonJavaMethod {

    /* renamed from: a */
    public static final C7541d f70974a = C7546e.m23568a(LazyThreadSafetyMode.NONE, C26897b.f70979a);

    /* renamed from: b */
    public static final List<String> f70975b = C7525m.m23464b((T[]) new String[]{"disable_hot_spot", "show_sort_and_filter"});

    /* renamed from: c */
    public static JSONObject f70976c;

    /* renamed from: d */
    public static final C26896a f70977d = new C26896a(null);

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.GetABTest$a */
    public static final class C26896a {

        /* renamed from: a */
        static final /* synthetic */ C7595j[] f70978a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C26896a.class), "KEVA_REPO", "getKEVA_REPO()Lcom/bytedance/keva/Keva;"))};

        private C26896a() {
        }

        /* renamed from: b */
        private static Keva m88320b() {
            return (Keva) GetABTest.f70974a.getValue();
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(4:15|16|17|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
            return new org.json.JSONObject();
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0026 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized org.json.JSONObject mo69584a() {
            /*
                r4 = this;
                monitor-enter(r4)
                org.json.JSONObject r0 = com.p280ss.android.ugc.aweme.discover.p1185ui.GetABTest.f70976c     // Catch:{ all -> 0x002d }
                if (r0 == 0) goto L_0x0013
                org.json.JSONObject r0 = com.p280ss.android.ugc.aweme.discover.p1185ui.GetABTest.f70976c     // Catch:{ all -> 0x002d }
                if (r0 == 0) goto L_0x000b
                monitor-exit(r4)
                return r0
            L_0x000b:
                kotlin.TypeCastException r0 = new kotlin.TypeCastException     // Catch:{ all -> 0x002d }
                java.lang.String r1 = "null cannot be cast to non-null type org.json.JSONObject"
                r0.<init>(r1)     // Catch:{ all -> 0x002d }
                throw r0     // Catch:{ all -> 0x002d }
            L_0x0013:
                org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x0026 }
                com.bytedance.keva.Keva r1 = m88320b()     // Catch:{ Exception -> 0x0026 }
                java.lang.String r2 = "hybrid_abtest"
                java.lang.String r3 = ""
                java.lang.String r1 = r1.getString(r2, r3)     // Catch:{ Exception -> 0x0026 }
                r0.<init>(r1)     // Catch:{ Exception -> 0x0026 }
                monitor-exit(r4)
                return r0
            L_0x0026:
                org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x002d }
                r0.<init>()     // Catch:{ all -> 0x002d }
                monitor-exit(r4)
                return r0
            L_0x002d:
                r0 = move-exception
                monitor-exit(r4)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.p1185ui.GetABTest.C26896a.mo69584a():org.json.JSONObject");
        }

        public /* synthetic */ C26896a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public final synchronized void mo69585a(C6711m mVar) {
            C7573i.m23587b(mVar, "rawJson");
            JSONObject jSONObject = null;
            C6709k b = mVar.mo16149b("data");
            if (b != null) {
                String kVar = b.toString();
                if (kVar != null) {
                    jSONObject = new JSONObject(kVar);
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            if (jSONObject != null) {
                for (String str : GetABTest.f70975b) {
                    Object opt = jSONObject.opt(str);
                    if (opt != null) {
                        jSONObject2.put(str, opt);
                    }
                }
            }
            GetABTest.f70976c = jSONObject2;
            m88320b().storeString("hybrid_abtest", jSONObject2.toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.GetABTest$b */
    static final class C26897b extends Lambda implements C7561a<Keva> {

        /* renamed from: a */
        public static final C26897b f70979a = new C26897b();

        C26897b() {
            super(0);
        }

        /* renamed from: a */
        private static Keva m88323a() {
            return Keva.getRepoSync("repo_hybrid_abtests", 0);
        }

        public final /* synthetic */ Object invoke() {
            return m88323a();
        }
    }

    public GetABTest() {
    }

    public GetABTest(C11087a aVar) {
        C7573i.m23587b(aVar, "bridge");
        super(aVar);
    }

    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) {
        JSONArray jSONArray;
        if (jSONObject != null) {
            try {
                jSONArray = jSONObject.optJSONArray("ab_test_names");
            } catch (Exception e) {
                C27064b.m88836a(e, "getABTestParams");
                aVar.mo71362a(0, e.getMessage());
                return;
            }
        } else {
            jSONArray = null;
        }
        JSONObject a = f70977d.mo69584a();
        if (jSONArray == null) {
            aVar.mo71363a((Object) a.toString());
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            String optString = jSONArray.optString(i);
            if (optString != null) {
                Object opt = a.opt(optString);
                if (opt != null) {
                    jSONObject2.put(optString, opt);
                }
            }
        }
        aVar.mo71363a((Object) jSONObject2.toString());
    }
}
