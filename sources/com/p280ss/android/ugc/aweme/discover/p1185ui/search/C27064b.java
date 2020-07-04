package com.p280ss.android.ugc.aweme.discover.p1185ui.search;

import android.text.TextUtils;
import bolts.C1592h;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.geckoclient.C10873f;
import com.bytedance.ies.geckoclient.model.C10903d;
import com.bytedance.p066a.p067a.p070b.p072b.C2077a;
import com.p280ss.android.ugc.aweme.app.C22912d;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.crossplatform.C25870d;
import com.p280ss.android.ugc.aweme.crossplatform.C25870d.C25871a;
import com.p280ss.android.ugc.aweme.crossplatform.RNPreloadHelper;
import com.p280ss.android.ugc.aweme.crossplatform.params.base.C25886b;
import com.p280ss.android.ugc.aweme.crossplatform.platform.p1153rn.C25913b;
import com.p280ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.p280ss.android.ugc.aweme.discover.abtest.RNViewDestroyExperiment;
import com.p280ss.android.ugc.aweme.discover.abtest.RNViewPrerenderExperiment;
import com.p280ss.android.ugc.aweme.discover.helper.C26654b;
import com.p280ss.android.ugc.aweme.discover.presenter.SearchIntermediateDataPreload;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.hybrid.monitor.C30388i;
import com.p280ss.android.ugc.aweme.hybrid.monitor.C30395o;
import com.p280ss.android.ugc.aweme.search.C37379b;
import com.p280ss.android.ugc.aweme.search.model.SearchEnterParam;
import com.p280ss.android.ugc.aweme.utils.C42983bo;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.p355d.C7542d;
import kotlin.p356e.C7549c;
import kotlin.p356e.C7551d;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.search.b */
public final class C27064b implements C37379b {

    /* renamed from: a */
    public static final C27064b f71401a = new C27064b();

    /* renamed from: b */
    private static HashMap<String, Long> f71402b = null;

    /* renamed from: c */
    private static HashMap<String, Long> f71403c = null;

    /* renamed from: d */
    private static final String f71404d = f71404d;

    /* renamed from: e */
    private static final String f71405e = f71405e;

    /* renamed from: f */
    private static long f71406f = -1;

    /* renamed from: g */
    private static long f71407g = -1;

    /* renamed from: h */
    private static long f71408h = -1;

    /* renamed from: i */
    private static long f71409i = -1;

    /* renamed from: j */
    private static long f71410j = -1;

    /* renamed from: k */
    private static String f71411k;

    /* renamed from: l */
    private static boolean f71412l;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.b$a */
    static final class C27065a<V> implements Callable<Object> {

        /* renamed from: a */
        final /* synthetic */ long f71413a;

        /* renamed from: b */
        final /* synthetic */ long f71414b;

        /* renamed from: c */
        final /* synthetic */ long f71415c;

        /* renamed from: d */
        final /* synthetic */ String f71416d;

        /* renamed from: e */
        final /* synthetic */ String f71417e;

        C27065a(long j, long j2, long j3, String str, String str2) {
            this.f71413a = j;
            this.f71414b = j2;
            this.f71415c = j3;
            this.f71416d = str;
            this.f71417e = str2;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void call() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("pageLoadCostTime", this.f71413a);
                jSONObject.put("renderCostTime", this.f71414b);
                jSONObject.put("totalCostTime", this.f71415c);
                jSONObject.put("pageName", this.f71416d);
                jSONObject.put("feFlag", this.f71417e);
                C6877n.m21444a("rn_page_load_time_mills", 0, C6869c.m21382a(jSONObject).mo16888b());
            } catch (Exception unused) {
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.b$b */
    static final class C27066b<V> implements Callable<C7581n> {

        /* renamed from: a */
        final /* synthetic */ CrossPlatformWebView f71418a;

        C27066b(CrossPlatformWebView crossPlatformWebView) {
            this.f71418a = crossPlatformWebView;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C7581n call() {
            String a = C27064b.m88833a(C26654b.m87576d());
            if (a == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("experiment_type", a);
            jSONObject.put("is_cached_view", String.valueOf(RNPreloadHelper.m84815a(this.f71418a)));
            C25870d.m85113a(C25871a.m85133a(), "search_transfer_rn_preload", "preload_view_fetch", jSONObject, null, null, 24, null);
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.b$c */
    static final class C27067c<V> implements Callable<C7581n> {

        /* renamed from: a */
        public static final C27067c f71419a = new C27067c();

        C27067c() {
        }

        public final /* synthetic */ Object call() {
            return m88853a();
        }

        /* renamed from: a */
        private static C7581n m88853a() {
            String a = C27064b.m88833a(C26654b.m87576d());
            if (a == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("experiment_type", a);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("duration", C27064b.m88847f() - C27064b.m88844d());
            C25870d.m85113a(C25871a.m85133a(), "search_transfer_rn_search_transfer", "search_clicked", jSONObject, jSONObject2, null, 16, null);
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.b$d */
    static final class C27068d<V> implements Callable<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C30395o f71420a;

        /* renamed from: b */
        final /* synthetic */ CrossPlatformWebView f71421b;

        C27068d(C30395o oVar, CrossPlatformWebView crossPlatformWebView) {
            this.f71420a = oVar;
            this.f71421b = crossPlatformWebView;
        }

        public final /* synthetic */ Object call() {
            m88854a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m88854a() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", this.f71421b.getLoadRNViewCompleteTimestamp() - C27064b.m88844d());
                jSONObject.put("launch_time", C27064b.m88844d());
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("status_code", "0");
                C25870d.m85112a(C25871a.m85133a(), this.f71420a, "search_transfer_rn_create_monitor", "search_intermindate", jSONObject2, jSONObject, null, 32, null);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("duration", C27064b.m88846e() - this.f71421b.getLoadRNViewCompleteTimestamp());
                jSONObject3.put("launch_time", this.f71421b.getLoadRNViewCompleteTimestamp());
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("status_code", "0");
                C27064b.f71401a.mo69857a(jSONObject4);
                C25870d.m85112a(C25871a.m85133a(), this.f71420a, "search_transfer_rn_business_didmount", "search_intermindate", jSONObject4, jSONObject3, null, 32, null);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.b$e */
    static final class C27069e<V> implements Callable<C7581n> {

        /* renamed from: a */
        final /* synthetic */ boolean f71422a;

        C27069e(boolean z) {
            this.f71422a = z;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C7581n call() {
            String a = C27064b.m88833a(this.f71422a);
            if (a == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("experiment_type", a);
            C25870d.m85113a(C25871a.m85133a(), "search_transfer_rn_search_transfer", "open_search_square", jSONObject, null, null, 24, null);
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.b$f */
    static final class C27070f<V> implements Callable<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C30395o f71423a;

        /* renamed from: b */
        final /* synthetic */ CrossPlatformWebView f71424b;

        C27070f(C30395o oVar, CrossPlatformWebView crossPlatformWebView) {
            this.f71423a = oVar;
            this.f71424b = crossPlatformWebView;
        }

        public final /* synthetic */ Object call() {
            m88856a();
            return C7581n.f20898a;
        }

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x007b */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0054 A[Catch:{ Exception -> 0x007b }] */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x005b A[Catch:{ Exception -> 0x007b }] */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0063 A[Catch:{ Exception -> 0x007b }] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x006a A[Catch:{ Exception -> 0x007b }] */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x00a4 A[Catch:{ Exception -> 0x0104 }] */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x00a7 A[Catch:{ Exception -> 0x0104 }] */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00b2 A[Catch:{ Exception -> 0x0104 }] */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00ca A[Catch:{ Exception -> 0x0104 }] */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00db A[Catch:{ Exception -> 0x0104 }] */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x00e2 A[Catch:{ Exception -> 0x0104 }] */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x00ea A[Catch:{ Exception -> 0x0104 }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m88856a() {
            /*
                r20 = this;
                r0 = r20
                r1 = 0
                com.ss.android.ugc.aweme.crossplatform.d r2 = com.p280ss.android.ugc.aweme.crossplatform.C25870d.C25871a.m85133a()     // Catch:{ Exception -> 0x007b }
                com.ss.android.ugc.aweme.hybrid.monitor.o r3 = r0.f71423a     // Catch:{ Exception -> 0x007b }
                com.ss.android.ugc.aweme.hybrid.monitor.q r3 = (com.p280ss.android.ugc.aweme.hybrid.monitor.C30398q) r3     // Catch:{ Exception -> 0x007b }
                java.lang.String r4 = "search_transfer_rn_base_download"
                java.lang.String r5 = "search_intermindate"
                org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ Exception -> 0x007b }
                r6.<init>()     // Catch:{ Exception -> 0x007b }
                com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r7 = r0.f71424b     // Catch:{ Exception -> 0x007b }
                com.ss.android.ugc.aweme.crossplatform.params.base.b r7 = r7.getCrossPlatformParams()     // Catch:{ Exception -> 0x007b }
                boolean r7 = com.p280ss.android.ugc.aweme.discover.p1185ui.search.C27064b.m88841b(r7)     // Catch:{ Exception -> 0x007b }
                java.lang.String r8 = "is_gecko_base_package_ready"
                java.lang.String r9 = java.lang.String.valueOf(r7)     // Catch:{ Exception -> 0x007b }
                r6.put(r8, r9)     // Catch:{ Exception -> 0x007b }
                java.lang.String r8 = "status_code"
                if (r7 == 0) goto L_0x002e
                java.lang.String r7 = "0"
                goto L_0x0030
            L_0x002e:
                java.lang.String r7 = "1"
            L_0x0030:
                r6.put(r8, r7)     // Catch:{ Exception -> 0x007b }
                com.bytedance.ies.geckoclient.f r7 = com.p280ss.android.ugc.aweme.utils.C42983bo.m136460b()     // Catch:{ Exception -> 0x007b }
                if (r7 == 0) goto L_0x006e
                java.lang.String r8 = "rn_base_android"
                com.bytedance.ies.geckoclient.model.d r7 = r7.mo26209a(r8)     // Catch:{ Exception -> 0x007b }
                java.lang.String r8 = "channel"
                if (r7 == 0) goto L_0x004c
                java.lang.String r9 = r7.f29508c     // Catch:{ Exception -> 0x007b }
                if (r9 == 0) goto L_0x004c
                java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x007b }
                goto L_0x004d
            L_0x004c:
                r9 = r1
            L_0x004d:
                r6.put(r8, r9)     // Catch:{ Exception -> 0x007b }
                java.lang.String r8 = "gecko_version"
                if (r7 == 0) goto L_0x005b
                int r9 = r7.f29506a     // Catch:{ Exception -> 0x007b }
                java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x007b }
                goto L_0x005c
            L_0x005b:
                r9 = r1
            L_0x005c:
                r6.put(r8, r9)     // Catch:{ Exception -> 0x007b }
                java.lang.String r8 = "error_code"
                if (r7 == 0) goto L_0x006a
                int r7 = r7.f29517l     // Catch:{ Exception -> 0x007b }
                java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ Exception -> 0x007b }
                goto L_0x006b
            L_0x006a:
                r7 = r1
            L_0x006b:
                r6.put(r8, r7)     // Catch:{ Exception -> 0x007b }
            L_0x006e:
                com.ss.android.ugc.aweme.discover.ui.search.b r7 = com.p280ss.android.ugc.aweme.discover.p1185ui.search.C27064b.f71401a     // Catch:{ Exception -> 0x007b }
                r7.mo69857a(r6)     // Catch:{ Exception -> 0x007b }
                r7 = 0
                r8 = 0
                r9 = 48
                r10 = 0
                com.p280ss.android.ugc.aweme.crossplatform.C25870d.m85112a(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x007b }
            L_0x007b:
                com.ss.android.ugc.aweme.crossplatform.d r11 = com.p280ss.android.ugc.aweme.crossplatform.C25870d.C25871a.m85133a()     // Catch:{ Exception -> 0x0104 }
                com.ss.android.ugc.aweme.hybrid.monitor.o r2 = r0.f71423a     // Catch:{ Exception -> 0x0104 }
                r12 = r2
                com.ss.android.ugc.aweme.hybrid.monitor.q r12 = (com.p280ss.android.ugc.aweme.hybrid.monitor.C30398q) r12     // Catch:{ Exception -> 0x0104 }
                java.lang.String r13 = "search_transfer_rn_business_download"
                java.lang.String r14 = "search_intermindate"
                org.json.JSONObject r15 = new org.json.JSONObject     // Catch:{ Exception -> 0x0104 }
                r15.<init>()     // Catch:{ Exception -> 0x0104 }
                com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r2 = r0.f71424b     // Catch:{ Exception -> 0x0104 }
                com.ss.android.ugc.aweme.crossplatform.params.base.b r2 = r2.getCrossPlatformParams()     // Catch:{ Exception -> 0x0104 }
                boolean r2 = com.p280ss.android.ugc.aweme.discover.p1185ui.search.C27064b.m88838a(r2)     // Catch:{ Exception -> 0x0104 }
                java.lang.String r3 = "is_gecko_business_package_ready"
                java.lang.String r4 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x0104 }
                r15.put(r3, r4)     // Catch:{ Exception -> 0x0104 }
                java.lang.String r3 = "status_code"
                if (r2 == 0) goto L_0x00a7
                java.lang.String r2 = "0"
                goto L_0x00a9
            L_0x00a7:
                java.lang.String r2 = "1"
            L_0x00a9:
                r15.put(r3, r2)     // Catch:{ Exception -> 0x0104 }
                com.bytedance.ies.geckoclient.f r2 = com.p280ss.android.ugc.aweme.utils.C42983bo.m136460b()     // Catch:{ Exception -> 0x0104 }
                if (r2 == 0) goto L_0x00f3
                com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r3 = r0.f71424b     // Catch:{ Exception -> 0x0104 }
                com.ss.android.ugc.aweme.crossplatform.params.base.b r3 = r3.getCrossPlatformParams()     // Catch:{ Exception -> 0x0104 }
                if (r3 == 0) goto L_0x00c1
                com.ss.android.ugc.aweme.crossplatform.params.d r3 = r3.f68475c     // Catch:{ Exception -> 0x0104 }
                if (r3 == 0) goto L_0x00c1
                java.lang.String r3 = r3.f68491b     // Catch:{ Exception -> 0x0104 }
                goto L_0x00c2
            L_0x00c1:
                r3 = r1
            L_0x00c2:
                com.bytedance.ies.geckoclient.model.d r2 = r2.mo26209a(r3)     // Catch:{ Exception -> 0x0104 }
                java.lang.String r3 = "channel"
                if (r2 == 0) goto L_0x00d3
                java.lang.String r4 = r2.f29508c     // Catch:{ Exception -> 0x0104 }
                if (r4 == 0) goto L_0x00d3
                java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0104 }
                goto L_0x00d4
            L_0x00d3:
                r4 = r1
            L_0x00d4:
                r15.put(r3, r4)     // Catch:{ Exception -> 0x0104 }
                java.lang.String r3 = "gecko_version"
                if (r2 == 0) goto L_0x00e2
                int r4 = r2.f29506a     // Catch:{ Exception -> 0x0104 }
                java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x0104 }
                goto L_0x00e3
            L_0x00e2:
                r4 = r1
            L_0x00e3:
                r15.put(r3, r4)     // Catch:{ Exception -> 0x0104 }
                java.lang.String r3 = "error_code"
                if (r2 == 0) goto L_0x00f0
                int r1 = r2.f29517l     // Catch:{ Exception -> 0x0104 }
                java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x0104 }
            L_0x00f0:
                r15.put(r3, r1)     // Catch:{ Exception -> 0x0104 }
            L_0x00f3:
                com.ss.android.ugc.aweme.discover.ui.search.b r1 = com.p280ss.android.ugc.aweme.discover.p1185ui.search.C27064b.f71401a     // Catch:{ Exception -> 0x0104 }
                r1.mo69857a(r15)     // Catch:{ Exception -> 0x0104 }
                r16 = 0
                r17 = 0
                r18 = 48
                r19 = 0
                com.p280ss.android.ugc.aweme.crossplatform.C25870d.m85112a(r11, r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x0104 }
                return
            L_0x0104:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.p1185ui.search.C27064b.C27070f.m88856a():void");
        }
    }

    private C27064b() {
    }

    /* renamed from: a */
    public static String m88831a() {
        return f71404d;
    }

    /* renamed from: d */
    public static long m88844d() {
        return f71406f;
    }

    /* renamed from: e */
    public static long m88846e() {
        return f71409i;
    }

    /* renamed from: f */
    public static long m88847f() {
        return f71410j;
    }

    /* renamed from: b */
    public static HashMap<String, Long> m88839b() {
        if (f71403c == null) {
            f71403c = new HashMap<>();
        }
        HashMap<String, Long> hashMap = f71403c;
        if (hashMap == null) {
            C7573i.m23580a();
        }
        return hashMap;
    }

    /* renamed from: c */
    public static HashMap<String, Long> m88842c() {
        if (f71402b == null) {
            f71402b = new HashMap<>();
        }
        HashMap<String, Long> hashMap = f71402b;
        if (hashMap == null) {
            C7573i.m23580a();
        }
        return hashMap;
    }

    /* renamed from: g */
    public final void mo69859g() {
        f71410j = System.currentTimeMillis();
        C1592h.m7855a((Callable<TResult>) C27067c.f71419a, (Executor) C6907h.m21516a());
    }

    /* renamed from: a */
    public static void m88834a(long j) {
        f71407g = j;
    }

    /* renamed from: a */
    public static void m88835a(CrossPlatformWebView crossPlatformWebView) {
        C7573i.m23587b(crossPlatformWebView, "view");
        C1592h.m7855a((Callable<TResult>) new C27066b<TResult>(crossPlatformWebView), (Executor) C6907h.m21516a());
    }

    /* renamed from: b */
    public static void m88840b(boolean z) {
        f71406f = System.currentTimeMillis();
        C1592h.m7855a((Callable<TResult>) new C27069e<TResult>(z), (Executor) C6907h.m21516a());
    }

    /* renamed from: c */
    public static void m88843c(CrossPlatformWebView crossPlatformWebView) {
        C30395o oVar;
        C7573i.m23587b(crossPlatformWebView, C22912d.f60641a);
        f71409i = System.currentTimeMillis();
        C30388i monitorSession = crossPlatformWebView.getMonitorSession();
        if (monitorSession != null) {
            oVar = (C30395o) monitorSession.mo80008a(C30395o.class);
        } else {
            oVar = null;
        }
        C1592h.m7855a((Callable<TResult>) new C27068d<TResult>(oVar, crossPlatformWebView), (Executor) C6907h.m21516a());
    }

    /* renamed from: d */
    public static void m88845d(CrossPlatformWebView crossPlatformWebView) {
        C30395o oVar;
        C7573i.m23587b(crossPlatformWebView, C22912d.f60641a);
        C30388i monitorSession = crossPlatformWebView.getMonitorSession();
        if (monitorSession != null) {
            oVar = (C30395o) monitorSession.mo80008a(C30395o.class);
        } else {
            oVar = null;
        }
        C1592h.m7855a((Callable<TResult>) new C27070f<TResult>(oVar, crossPlatformWebView), (Executor) C6907h.m21516a());
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m88838a(com.p280ss.android.ugc.aweme.crossplatform.params.base.C25886b r6) {
        /*
            com.bytedance.ies.geckoclient.f r0 = com.p280ss.android.ugc.aweme.utils.C42983bo.m136460b()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            r2 = 0
            if (r6 == 0) goto L_0x0012
            com.ss.android.ugc.aweme.crossplatform.params.d r3 = r6.f68475c
            if (r3 == 0) goto L_0x0012
            java.lang.String r3 = r3.f68491b
            goto L_0x0013
        L_0x0012:
            r3 = r2
        L_0x0013:
            com.bytedance.ies.geckoclient.model.d r0 = r0.mo26209a(r3)
            r3 = 1
            if (r0 == 0) goto L_0x001f
            java.lang.String r4 = com.p280ss.android.ugc.aweme.crossplatform.platform.p1153rn.C25913b.m85205b(r0, null)
            goto L_0x0020
        L_0x001f:
            r4 = r2
        L_0x0020:
            r5 = r4
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x005b
            java.io.File r5 = new java.io.File
            if (r4 != 0) goto L_0x0030
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0030:
            r5.<init>(r4)
            boolean r4 = r5.exists()
            if (r4 != 0) goto L_0x003a
            goto L_0x005b
        L_0x003a:
            if (r0 == 0) goto L_0x0047
            com.ss.android.ugc.aweme.crossplatform.platform.rn.model.RNBundleInfo r0 = com.p280ss.android.ugc.aweme.crossplatform.platform.p1153rn.C25913b.m85204b(r0)
            if (r0 == 0) goto L_0x0047
            java.util.List r0 = r0.getModules()
            goto L_0x0048
        L_0x0047:
            r0 = r2
        L_0x0048:
            if (r0 == 0) goto L_0x005a
            if (r6 == 0) goto L_0x0052
            com.ss.android.ugc.aweme.crossplatform.params.d r6 = r6.f68475c
            if (r6 == 0) goto L_0x0052
            java.lang.String r2 = r6.f68494e
        L_0x0052:
            boolean r6 = r0.contains(r2)
            if (r6 != 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            return r3
        L_0x005a:
            return r1
        L_0x005b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.p1185ui.search.C27064b.m88838a(com.ss.android.ugc.aweme.crossplatform.params.base.b):boolean");
    }

    /* renamed from: b */
    public static boolean m88841b(C25886b bVar) {
        C10873f b = C42983bo.m136460b();
        if (b == null) {
            return false;
        }
        C10903d a = b.mo26209a("rn_base_android");
        String str = null;
        if (a != null) {
            str = C25913b.m85201a(a, null);
        }
        if (!TextUtils.isEmpty(str)) {
            if (str == null) {
                C7573i.m23580a();
            }
            if (!new File(str).exists()) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static String m88833a(boolean z) {
        String str;
        boolean z2;
        boolean z3 = true;
        if (z) {
            if (C6384b.m19835a().mo15287a(RNViewDestroyExperiment.class, true, "search_transfer_is_not_destroy", C6384b.m19835a().mo15295d().search_transfer_is_not_destroy, 0) == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (C6384b.m19835a().mo15287a(RNViewPrerenderExperiment.class, true, "search_transfer_is_prerender", C6384b.m19835a().mo15295d().search_transfer_is_prerender, 0) != 1) {
                z3 = false;
            }
            if (z2 && z3) {
                return "rn_preload_not_destroy";
            }
            if (z2) {
                return "rn_not_destroy";
            }
            if (z3) {
                return "rn_preload_view";
            }
            if (C6384b.m19835a().mo15292a(SearchIntermediateDataPreload.class, true, "rn_search_transfer_preload_data", C6384b.m19835a().mo15295d().rn_search_transfer_preload_data, true)) {
                return "rn_preload_data";
            }
            return "rn_common";
        } else if (f71412l) {
            return f71411k;
        } else {
            if (C7551d.m23561a(new C7549c(1, 90), (C7542d) C7542d.f20874c) <= 5) {
                str = "native_common";
            } else {
                str = null;
            }
            f71411k = str;
            f71412l = true;
            return f71411k;
        }
    }

    /* renamed from: b */
    public final void mo69858b(CrossPlatformWebView crossPlatformWebView) {
        boolean z;
        C7573i.m23587b(crossPlatformWebView, C22912d.f60641a);
        CharSequence reactId = crossPlatformWebView.getReactId();
        if (reactId == null || reactId.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            String str = null;
            String a = m88833a(C26654b.m87576d());
            if (a != null) {
                JSONObject jSONObject = new JSONObject();
                String str2 = "enter_from";
                SearchEnterParam searchEnterParam = crossPlatformWebView.getSearchEnterParam();
                if (searchEnterParam != null) {
                    str = searchEnterParam.getEnterSearchFrom();
                }
                jSONObject.put(str2, str);
                jSONObject.put("experiment_type", a);
                jSONObject.put("is_cached_view", RNPreloadHelper.m84815a(crossPlatformWebView));
                jSONObject.put("open_search_ts", f71406f);
                crossPlatformWebView.mo67473a("search_middle_init", jSONObject, crossPlatformWebView.getReactId());
                new StringBuilder("sendInitDataToFe with params:").append(jSONObject);
            }
        }
    }

    /* renamed from: a */
    public final void mo69857a(JSONObject jSONObject) {
        String a = m88833a(C26654b.m87576d());
        if (a != null) {
            jSONObject.put("experiment_type", a);
        }
    }

    /* renamed from: a */
    public static void m88836a(Exception exc, String str) {
        C7573i.m23587b(exc, "e");
        C7573i.m23587b(str, "bridgeType");
        Throwable th = exc;
        C2077a.m9161a(th, str);
        C6921a.m21559a(th);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("exception_message", exc.getMessage());
            jSONObject.put("bridge_type", str);
            C6877n.m21444a("get_search_history_exception", 0, C6869c.m21382a(jSONObject).mo16888b());
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m88837a(String str, long j, String str2) {
        String str3 = str;
        C7573i.m23587b(str, "pageName");
        C7573i.m23587b(str2, "feFlag");
        if (f71402b != null) {
            HashMap<String, Long> hashMap = f71402b;
            if (hashMap == null) {
                C7573i.m23580a();
            }
            if (hashMap.containsKey(str) && f71403c != null) {
                HashMap<String, Long> hashMap2 = f71403c;
                if (hashMap2 == null) {
                    C7573i.m23580a();
                }
                if (hashMap2.containsKey(str)) {
                    HashMap<String, Long> hashMap3 = f71403c;
                    if (hashMap3 == null) {
                        C7573i.m23580a();
                    }
                    Object remove = hashMap3.remove(str);
                    if (remove == null) {
                        C7573i.m23580a();
                    }
                    C7573i.m23582a(remove, "monitorStartMap!!.remove(pageName)!!");
                    long longValue = ((Number) remove).longValue();
                    HashMap<String, Long> hashMap4 = f71402b;
                    if (hashMap4 == null) {
                        C7573i.m23580a();
                    }
                    Object remove2 = hashMap4.remove(str);
                    if (remove2 == null) {
                        C7573i.m23580a();
                    }
                    C7573i.m23582a(remove2, "componentDidMountMap!!.remove(pageName)!!");
                    long longValue2 = ((Number) remove2).longValue();
                    if (longValue > 0 && longValue2 > 0 && j > 0) {
                        long j2 = longValue2 - longValue;
                        long j3 = j - longValue2;
                        long j4 = j - longValue;
                        if (j2 > 0 && j3 > 0 && j4 > 0) {
                            C27065a aVar = new C27065a(j2, j3, j4, str, str2);
                            C1592h.m7855a((Callable<TResult>) aVar, (Executor) C6907h.m21516a());
                        }
                    }
                }
            }
        }
    }
}
