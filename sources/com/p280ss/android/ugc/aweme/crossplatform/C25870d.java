package com.p280ss.android.ugc.aweme.crossplatform;

import android.net.Uri;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.ies.NullValueException;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.p066a.p067a.p070b.p072b.C2077a;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.CatalystInstanceImpl;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.TimingEventListener;
import com.p280ss.android.ugc.aweme.app.C22912d;
import com.p280ss.android.ugc.aweme.app.C23016o.C23017a;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.application.C22863b;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.header.C23764b;
import com.p280ss.android.ugc.aweme.commercialize.feed.preload.C24736b;
import com.p280ss.android.ugc.aweme.crossplatform.params.C25884b;
import com.p280ss.android.ugc.aweme.crossplatform.params.C25896d;
import com.p280ss.android.ugc.aweme.crossplatform.params.base.C25886b;
import com.p280ss.android.ugc.aweme.crossplatform.platform.webview.WebViewCacheExperiment.C25960a;
import com.p280ss.android.ugc.aweme.experiment.RnPerfMonitorExperiment;
import com.p280ss.android.ugc.aweme.experiment.WebViewMonitorExperiment;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.HybridMonitorConfig;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.hybrid.monitor.C30369aa;
import com.p280ss.android.ugc.aweme.hybrid.monitor.C30388i;
import com.p280ss.android.ugc.aweme.hybrid.monitor.C30395o;
import com.p280ss.android.ugc.aweme.hybrid.monitor.C30398q;
import com.p280ss.android.ugc.aweme.hybrid.monitor.C30419y;
import com.p280ss.android.ugc.aweme.ttwebview.C42652a;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.LazyThreadSafetyMode;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import kotlin.text.C7631j;
import kotlin.text.Regex;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.d */
public final class C25870d {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f68404a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C25870d.class), "monitorRegexList", "getMonitorRegexList()Ljava/util/List;"))};

    /* renamed from: h */
    public static final C7541d f68405h = C7546e.m23569a(C25872b.f68417a);

    /* renamed from: i */
    public static final C25871a f68406i = new C25871a(null);

    /* renamed from: b */
    public UncaughtExceptionHandler f68407b;

    /* renamed from: c */
    public String f68408c;

    /* renamed from: d */
    public final Map<String, C30388i> f68409d;

    /* renamed from: e */
    public final ConcurrentHashMap<String, Long> f68410e;

    /* renamed from: f */
    public final C30419y f68411f;

    /* renamed from: g */
    public final C30369aa f68412g;

    /* renamed from: j */
    private final UncaughtExceptionHandler f68413j;

    /* renamed from: k */
    private final Regex f68414k;

    /* renamed from: l */
    private final C7541d f68415l;

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.d$a */
    public static final class C25871a {

        /* renamed from: a */
        static final /* synthetic */ C7595j[] f68416a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C25871a.class), "instance", "getInstance()Lcom/ss/android/ugc/aweme/crossplatform/MonitorSessionManager;"))};

        private C25871a() {
        }

        /* renamed from: a */
        public static C25870d m85133a() {
            return (C25870d) C25870d.f68405h.getValue();
        }

        public /* synthetic */ C25871a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.d$b */
    static final class C25872b extends Lambda implements C7561a<C25870d> {

        /* renamed from: a */
        public static final C25872b f68417a = new C25872b();

        C25872b() {
            super(0);
        }

        /* renamed from: a */
        private static C25870d m85134a() {
            return new C25870d(null);
        }

        public final /* synthetic */ Object invoke() {
            return m85134a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.d$c */
    static final class C25873c extends Lambda implements C7561a<List<String>> {

        /* renamed from: a */
        final /* synthetic */ C25870d f68418a;

        C25873c(C25870d dVar) {
            this.f68418a = dVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public List<String> invoke() {
            HybridMonitorConfig a = C25870d.m85109a();
            if (a != null) {
                List<String> perfMonitorRegexList = a.getPerfMonitorRegexList();
                if (perfMonitorRegexList != null) {
                    return perfMonitorRegexList;
                }
            }
            return new ArrayList<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.d$d */
    public static final class C25874d implements C30419y {
        C25874d() {
        }

        /* renamed from: a */
        private final JSONObject m85136a(JSONObject jSONObject) {
            JSONObject jSONObject2 = new JSONObject();
            m85137a(jSONObject, "tag", (Object) "ttlive_sdk");
            String str = C22863b.f60589a;
            C7573i.m23582a((Object) str, "ApplicationConstants.SDK_APP_ID");
            m85137a(jSONObject2, "aid", (Object) str);
            m85137a(jSONObject2, "extra", (Object) jSONObject);
            return jSONObject2;
        }

        /* renamed from: a */
        public final void mo67255a(String str, JSONObject jSONObject) {
            C7573i.m23587b(str, "service");
            C7573i.m23587b(jSONObject, "data");
            C6893q.m21452b("service_monitor", str, jSONObject);
        }

        /* renamed from: a */
        private static void m85137a(JSONObject jSONObject, String str, Object obj) {
            try {
                jSONObject.put(str, obj);
            } catch (Exception unused) {
            }
        }

        /* renamed from: a */
        public final void mo67252a(Exception exc, String str, Map<String, String> map) {
            C7573i.m23587b(exc, "e");
            C7573i.m23587b(str, "message");
            C7573i.m23587b(map, "data");
            C2077a.m9162a(exc, str, map);
        }

        /* renamed from: a */
        public final void mo67253a(String str, Integer num, JSONObject jSONObject, JSONObject jSONObject2) {
            JSONObject jSONObject3;
            int i;
            if (jSONObject2 != null) {
                jSONObject3 = m85136a(jSONObject2);
            } else {
                jSONObject3 = null;
            }
            if (num != null) {
                i = num.intValue();
            } else {
                i = 1;
            }
            C6877n.m21445a(str, i, jSONObject, jSONObject3);
        }

        /* renamed from: a */
        public final void mo67254a(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
            C7573i.m23587b(str, "logType");
            C7573i.m23587b(str2, "service");
            C7573i.m23587b(jSONObject, "category");
            C7573i.m23587b(jSONObject2, "metrics");
            C7573i.m23587b(jSONObject3, "value");
            C23017a.m75671a(str, str2, jSONObject, jSONObject2, jSONObject3, jSONObject4);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.d$e */
    static final class C25875e implements TimingEventListener {

        /* renamed from: a */
        final /* synthetic */ C25870d f68419a;

        /* renamed from: b */
        final /* synthetic */ C30388i f68420b;

        C25875e(C25870d dVar, C30388i iVar) {
            this.f68419a = dVar;
            this.f68420b = iVar;
        }

        public final void onTimingEvent(String str, long j) {
            Map map = this.f68419a.f68410e;
            C7573i.m23582a((Object) str, "eventName");
            map.put(str, Long.valueOf(j));
            C30388i iVar = this.f68420b;
            if (iVar != null) {
                C30395o oVar = (C30395o) iVar.mo80008a(C30395o.class);
                if (oVar != null) {
                    oVar.mo80019a(str, j, this.f68419a.f68410e);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.d$f */
    public static final class C25876f implements C30369aa {

        /* renamed from: a */
        final /* synthetic */ C25870d f68421a;

        /* renamed from: b */
        private String f68422b = "";

        /* renamed from: c */
        private String f68423c = "";

        /* renamed from: d */
        private String f68424d = "";

        /* renamed from: e */
        private Boolean f68425e;

        /* renamed from: d */
        public final List<String> mo67259d() {
            List<String> a = C25960a.m85279a();
            C7573i.m23582a((Object) a, "WebViewCacheExperiment.E…WebViewCacheModelCompat()");
            return a;
        }

        /* renamed from: a */
        public final String mo67256a() {
            boolean z;
            if (this.f68424d.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                String a = C42652a.m135463a();
                C7573i.m23582a((Object) a, "TTWebViewTask.getWebviewType()");
                this.f68424d = a;
            }
            return this.f68424d;
        }

        /* renamed from: b */
        public final boolean mo67257b() {
            if (this.f68425e == null) {
                this.f68425e = Boolean.valueOf(false);
            }
            Boolean bool = this.f68425e;
            if (bool != null) {
                return bool.booleanValue();
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Boolean");
        }

        /* renamed from: c */
        public final boolean mo67258c() {
            return C6384b.m19835a().mo15292a(WebViewMonitorExperiment.class, true, "webview_monitor_enable", C6384b.m19835a().mo15295d().webview_monitor_enable, false);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
            if (r0 != null) goto L_0x0027;
         */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String mo67260e() {
            /*
                r1 = this;
                java.lang.String r0 = r1.f68422b
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                int r0 = r0.length()
                if (r0 <= 0) goto L_0x000c
                r0 = 1
                goto L_0x000d
            L_0x000c:
                r0 = 0
            L_0x000d:
                if (r0 == 0) goto L_0x0012
                java.lang.String r0 = r1.f68422b
                return r0
            L_0x0012:
                com.ss.android.ugc.aweme.global.config.settings.pojo.HybridMonitorConfig r0 = com.p280ss.android.ugc.aweme.crossplatform.C25870d.m85109a()
                if (r0 == 0) goto L_0x0023
                java.lang.String r0 = r0.getSlardarSdkConfig()     // Catch:{ NullValueException -> 0x001d }
                goto L_0x0021
            L_0x001d:
                java.lang.String r0 = m85142f()
            L_0x0021:
                if (r0 != 0) goto L_0x0027
            L_0x0023:
                java.lang.String r0 = m85142f()
            L_0x0027:
                r1.f68422b = r0
                java.lang.String r0 = r1.f68422b
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.crossplatform.C25870d.C25876f.mo67260e():java.lang.String");
        }

        /* renamed from: f */
        private static String m85142f() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("webview_is_need_monitor", true);
            jSONObject.put("webview_classes", new JSONArray());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("bid", "ies");
            jSONObject.put("commonReportConfig", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("interval", 8000);
            jSONObject3.put("FPSMonitor", jSONObject4);
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("interval", 8000);
            jSONObject3.put("MemoryMonitor", jSONObject5);
            jSONObject.put("apmReportConfig", jSONObject3);
            JSONObject jSONObject6 = new JSONObject();
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("interval", 10);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put("DOMContentLoaded");
            jSONObject7.put("checkPoint", jSONArray);
            jSONObject6.put("PerformanceMonitor", jSONObject7);
            jSONObject.put("performanceReportConfig", jSONObject6);
            JSONObject jSONObject8 = new JSONObject();
            JSONObject jSONObject9 = new JSONObject();
            jSONObject9.put("ignore", new JSONArray());
            jSONObject8.put("StaticErrorMonitor", jSONObject9);
            jSONObject.put("errorMsgReportConfig", jSONObject8);
            JSONObject jSONObject10 = new JSONObject();
            JSONObject jSONObject11 = new JSONObject();
            jSONObject11.put("slowSession", 8000);
            jSONObject11.put("sampleRate", 0.1d);
            jSONObject10.put("StaticPerformanceMonitor", jSONObject11);
            jSONObject.put("resourceTimingReportConfig", jSONObject10);
            String jSONObject12 = jSONObject.toString();
            C7573i.m23582a((Object) jSONObject12, "JSONObject().apply {\n   …\n            }.toString()");
            return jSONObject12;
        }

        C25876f(C25870d dVar) {
            this.f68421a = dVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.d$g */
    static final class C25877g implements UncaughtExceptionHandler {

        /* renamed from: a */
        final /* synthetic */ C25870d f68426a;

        C25877g(C25870d dVar) {
            this.f68426a = dVar;
        }

        public final void uncaughtException(Thread thread, Throwable th) {
            C7573i.m23587b(thread, "thread");
            C7573i.m23587b(th, "throwable");
            this.f68426a.mo67246a(th);
            this.f68426a.mo67246a(th.getCause());
            UncaughtExceptionHandler uncaughtExceptionHandler = this.f68426a.f68407b;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        }
    }

    /* renamed from: c */
    private final List<String> m85117c() {
        return (List) this.f68415l.getValue();
    }

    /* renamed from: a */
    public final void mo67244a(C30398q qVar, String str, String str2, JSONObject jSONObject) {
        m85112a(this, qVar, str, str2, jSONObject, null, null, 48, null);
    }

    /* renamed from: a */
    public final String mo67240a(WebView webView) {
        C7573i.m23587b(webView, C22912d.f60641a);
        WebSettings settings = webView.getSettings();
        C7573i.m23582a((Object) settings, "webview.settings");
        String userAgentString = settings.getUserAgentString();
        Regex regex = this.f68414k;
        C7573i.m23582a((Object) userAgentString, "userAgent");
        boolean z = false;
        String str = null;
        C7631j find$default = Regex.find$default(regex, userAgentString, 0, 2, null);
        if (find$default != null) {
            if (find$default.mo19513d().size() >= 2) {
                z = true;
            }
            if (!z) {
                find$default = null;
            }
            if (find$default != null) {
                str = (String) find$default.mo19513d().get(1);
            }
        }
        return str == null ? "not_found" : str;
    }

    /* renamed from: a */
    public final JSONObject mo67242a(C25884b bVar) {
        return m85111a(bVar != null ? bVar.f68446a : 0, bVar != null ? bVar.f68467v : ((Number) new C25880g(C24736b.f65176b).get()).intValue());
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0011 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0012  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo67241a(com.p280ss.android.ugc.aweme.crossplatform.params.base.C25886b r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L_0x000a
            com.ss.android.ugc.aweme.crossplatform.params.d r1 = r4.f68475c
            if (r1 == 0) goto L_0x000a
            java.lang.String r1 = r1.f68504o
            goto L_0x000b
        L_0x000a:
            r1 = r0
        L_0x000b:
            boolean r2 = com.p280ss.android.ugc.aweme.challenge.p1086ui.header.C23764b.m77913a(r1)
            if (r2 == 0) goto L_0x0012
            return r1
        L_0x0012:
            if (r4 == 0) goto L_0x0016
            com.ss.android.ugc.aweme.crossplatform.params.b r0 = r4.f68474b
        L_0x0016:
            java.lang.String r4 = r3.mo67249b(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.crossplatform.C25870d.mo67241a(com.ss.android.ugc.aweme.crossplatform.params.base.b):java.lang.String");
    }

    /* renamed from: a */
    public final boolean mo67247a(String str) {
        C7573i.m23587b(str, "url");
        try {
            Uri parse = Uri.parse(str);
            C7573i.m23582a((Object) parse, "Uri.parse(url)");
            return m85116a(parse);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final void mo67243a(ReactInstanceManager reactInstanceManager, C30388i iVar) {
        if (reactInstanceManager != null) {
            ReactContext currentReactContext = reactInstanceManager.getCurrentReactContext();
            if (currentReactContext != null) {
                CatalystInstance catalystInstance = currentReactContext.getCatalystInstance();
                if (catalystInstance != null) {
                    if (!((catalystInstance instanceof CatalystInstanceImpl) && iVar != null && iVar.f79799b)) {
                        catalystInstance = null;
                    }
                    if (catalystInstance != null) {
                        if (catalystInstance != null) {
                            CatalystInstanceImpl catalystInstanceImpl = (CatalystInstanceImpl) catalystInstance;
                            if (catalystInstanceImpl != null) {
                                catalystInstanceImpl.setTimingEventsListener(new C25875e(this, iVar));
                            }
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type com.facebook.react.bridge.CatalystInstanceImpl");
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo67246a(Throwable th) {
        if (th != null) {
            if (!(th instanceof JSApplicationCausedNativeException)) {
                th = null;
            }
            if (th == null) {
                return;
            }
            if (th != null) {
                mo67245a((Exception) th, "js");
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Exception /* = java.lang.Exception */");
            }
        }
    }

    /* renamed from: a */
    public final void mo67245a(Exception exc, String str) {
        C7573i.m23587b(exc, "e");
        C30388i b = mo67248b();
        if (b != null) {
            C30395o oVar = (C30395o) b.mo80008a(C30395o.class);
            if (oVar != null) {
                oVar.mo80018a(exc, str);
            }
        }
    }

    /* renamed from: a */
    public final C30388i mo67239a(boolean z) {
        C30388i iVar = new C30388i(this.f68411f, this.f68412g);
        String uuid = UUID.randomUUID().toString();
        C7573i.m23582a((Object) uuid, "UUID.randomUUID().toString()");
        iVar.mo79939a(uuid, z);
        this.f68409d.put(iVar.mo79938a(), iVar);
        return iVar;
    }

    /* renamed from: a */
    public static HybridMonitorConfig m85109a() {
        try {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            return a.getHybridMonitorConfig();
        } catch (NullValueException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final C30388i mo67248b() {
        String str = this.f68408c;
        if (str != null) {
            return m85119d(str);
        }
        return null;
    }

    private C25870d() {
        this.f68413j = new C25877g(this);
        this.f68407b = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this.f68413j);
        this.f68409d = new LinkedHashMap();
        ConcurrentHashMap<String, Long> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("PageStartTime", Long.valueOf(0));
        concurrentHashMap.put("StartLoadTime", Long.valueOf(0));
        concurrentHashMap.put("FirstDrawTime", Long.valueOf(0));
        concurrentHashMap.put("FirstScreenTime", Long.valueOf(0));
        concurrentHashMap.put("PageFinishTime", Long.valueOf(0));
        this.f68410e = concurrentHashMap;
        this.f68414k = new Regex("Chrome/(\\d+.\\d+.\\d+.\\d+)");
        this.f68415l = C7546e.m23568a(LazyThreadSafetyMode.NONE, new C25873c(this));
        this.f68411f = new C25874d();
        this.f68412g = new C25876f(this);
    }

    public /* synthetic */ C25870d(C7571f fVar) {
        this();
    }

    /* renamed from: d */
    private C30388i m85119d(String str) {
        C7573i.m23587b(str, "sessionId");
        return (C30388i) this.f68409d.get(str);
    }

    /* renamed from: b */
    public final boolean mo67251b(String str) {
        C7573i.m23587b(str, "sessionId");
        if (!this.f68409d.containsKey(str)) {
            return false;
        }
        C30388i iVar = (C30388i) this.f68409d.remove(str);
        if (iVar != null) {
            iVar.mo79940b();
        }
        return true;
    }

    /* renamed from: c */
    private final boolean m85118c(String str) {
        for (String regex : m85117c()) {
            if (new Regex(regex).containsMatchIn(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final String mo67249b(C25884b bVar) {
        long j;
        int i;
        String str;
        boolean z;
        if (bVar != null) {
            j = bVar.f68446a;
        } else {
            j = 0;
        }
        if (bVar != null) {
            i = bVar.f68467v;
        } else {
            i = ((Number) new C25878e(C24736b.f65176b).get()).intValue();
        }
        if (bVar != null) {
            str = bVar.f68444D;
        } else {
            str = null;
        }
        if (bVar != null) {
            z = bVar.f68460o;
        } else {
            z = false;
        }
        return m85110a(j, i, str, z);
    }

    /* renamed from: b */
    public final boolean mo67250b(C25886b bVar) {
        String str;
        C7573i.m23587b(bVar, "params");
        C25896d dVar = bVar.f68475c;
        if (dVar != null) {
            str = dVar.f68499j;
        } else {
            str = null;
        }
        if (str == null) {
            return false;
        }
        if (C6384b.m19835a().mo15292a(RnPerfMonitorExperiment.class, true, "rn_perf_monitor", C6384b.m19835a().mo15295d().rn_perf_monitor, false) || mo67247a(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private boolean m85116a(Uri uri) {
        C7573i.m23587b(uri, "uri");
        try {
            if (!uri.getBooleanQueryParameter("monitor_enabled", false)) {
                String uri2 = uri.toString();
                C7573i.m23582a((Object) uri2, "uri.toString()");
                if (!m85118c(uri2)) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    private static JSONObject m85111a(long j, int i) {
        boolean z;
        JSONObject jSONObject = new JSONObject();
        Long valueOf = Long.valueOf(j);
        if (valueOf.longValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            valueOf = null;
        }
        if (valueOf != null) {
            jSONObject.put("rule_cid", valueOf.longValue());
            jSONObject.put("rule_use_web_url", i);
        }
        return jSONObject;
    }

    /* renamed from: a */
    private static String m85110a(long j, int i, String str, boolean z) {
        if (j > 0) {
            if (i == ((Number) new C25879f(C24736b.f65176b).get()).intValue()) {
                return "ad_floor_page";
            }
            return "ad";
        } else if (!C23764b.m77913a(str) || !z) {
            return null;
        } else {
            StringBuilder sb = new StringBuilder("ad_");
            sb.append(str);
            return sb.toString();
        }
    }

    /* renamed from: a */
    private void m85115a(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        C7573i.m23587b(str, "serviceName");
        C7573i.m23587b(str2, "triggerFrom");
        C30419y yVar = this.f68411f;
        String str3 = "ies_hybrid_monitor";
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        JSONObject jSONObject4 = jSONObject;
        jSONObject4.put("trigger", str2);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        JSONObject jSONObject5 = jSONObject2;
        JSONObject jSONObject6 = new JSONObject();
        if (jSONObject3 == null) {
            jSONObject3 = new JSONObject();
        }
        yVar.mo67254a(str3, str, jSONObject4, jSONObject5, jSONObject6, jSONObject3);
    }

    /* renamed from: a */
    public static void m85114a(C30398q qVar, String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        C7573i.m23587b(str, "serviceName");
        C7573i.m23587b(str2, "triggerFrom");
        if (qVar != null) {
            qVar.mo79996a(str, str2, jSONObject, jSONObject2, jSONObject3);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m85113a(C25870d dVar, String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, int i, Object obj) {
        JSONObject jSONObject4;
        JSONObject jSONObject5;
        if ((i & 4) != 0) {
            jSONObject4 = null;
        } else {
            jSONObject4 = jSONObject;
        }
        if ((i & 8) != 0) {
            jSONObject5 = null;
        } else {
            jSONObject5 = jSONObject2;
        }
        dVar.m85115a(str, str2, jSONObject4, jSONObject5, null);
    }

    /* renamed from: a */
    public static /* synthetic */ void m85112a(C25870d dVar, C30398q qVar, String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, int i, Object obj) {
        JSONObject jSONObject4;
        JSONObject jSONObject5;
        if ((i & 8) != 0) {
            jSONObject4 = null;
        } else {
            jSONObject4 = jSONObject;
        }
        if ((i & 16) != 0) {
            jSONObject5 = null;
        } else {
            jSONObject5 = jSONObject2;
        }
        m85114a(qVar, str, str2, jSONObject4, jSONObject5, null);
    }
}
