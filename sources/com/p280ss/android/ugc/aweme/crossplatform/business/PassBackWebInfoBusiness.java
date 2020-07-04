package com.p280ss.android.ugc.aweme.crossplatform.business;

import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import bolts.C1592h;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.retrofit2.C12466b;
import com.bytedance.retrofit2.C12474e;
import com.bytedance.retrofit2.C12534t;
import com.bytedance.sdk.account.p650b.p654d.C12748a;
import com.google.gson.C6609h;
import com.google.gson.C6709k;
import com.google.gson.C6711m;
import com.p280ss.android.common.util.NetworkUtils;
import com.p280ss.android.common.util.NetworkUtils.NetworkType;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.crossplatform.business.BusinessService.Business;
import com.p280ss.android.ugc.aweme.crossplatform.params.C25884b;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.AdLandingPageConfig;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.location.C32639p.C32640a;
import com.p280ss.android.ugc.aweme.location.LocationResult;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import kotlin.text.C7634n;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.business.PassBackWebInfoBusiness */
public final class PassBackWebInfoBusiness extends Business {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f68343a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(PassBackWebInfoBusiness.class), "handler", "getHandler()Landroid/os/Handler;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(PassBackWebInfoBusiness.class), "dataMap", "getDataMap()Ljava/util/Map;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(PassBackWebInfoBusiness.class), "headerMap", "getHeaderMap()Ljava/util/Map;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(PassBackWebInfoBusiness.class), "passBackApi", "getPassBackApi()Lcom/ss/android/ugc/aweme/crossplatform/business/PassBackApi;"))};

    /* renamed from: b */
    public C25884b f68344b;

    /* renamed from: c */
    private final C7541d f68345c = C7546e.m23569a(C25844c.f68355a);

    /* renamed from: d */
    private final C7541d f68346d = C7546e.m23569a(C25843b.f68354a);

    /* renamed from: e */
    private final C7541d f68347e = C7546e.m23569a(C25845d.f68356a);

    /* renamed from: f */
    private AdLandingPageConfig f68348f;

    /* renamed from: k */
    private boolean f68349k = true;

    /* renamed from: l */
    private int f68350l;

    /* renamed from: m */
    private int f68351m;

    /* renamed from: n */
    private final C7541d f68352n = C7546e.m23569a(C25849g.f68362a);

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.business.PassBackWebInfoBusiness$a */
    static final class C25842a<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ PassBackWebInfoBusiness f68353a;

        C25842a(PassBackWebInfoBusiness passBackWebInfoBusiness) {
            this.f68353a = passBackWebInfoBusiness;
        }

        /* renamed from: a */
        private void m85036a() {
            this.f68353a.mo67194c();
        }

        public final /* synthetic */ Object call() {
            m85036a();
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.business.PassBackWebInfoBusiness$b */
    static final class C25843b extends Lambda implements C7561a<ConcurrentHashMap<String, String>> {

        /* renamed from: a */
        public static final C25843b f68354a = new C25843b();

        C25843b() {
            super(0);
        }

        /* renamed from: a */
        private static ConcurrentHashMap<String, String> m85037a() {
            return new ConcurrentHashMap<>();
        }

        public final /* synthetic */ Object invoke() {
            return m85037a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.business.PassBackWebInfoBusiness$c */
    static final class C25844c extends Lambda implements C7561a<Handler> {

        /* renamed from: a */
        public static final C25844c f68355a = new C25844c();

        C25844c() {
            super(0);
        }

        /* renamed from: a */
        private static Handler m85038a() {
            return new Handler();
        }

        public final /* synthetic */ Object invoke() {
            return m85038a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.business.PassBackWebInfoBusiness$d */
    static final class C25845d extends Lambda implements C7561a<ConcurrentHashMap<String, Map<String, ? extends String>>> {

        /* renamed from: a */
        public static final C25845d f68356a = new C25845d();

        C25845d() {
            super(0);
        }

        /* renamed from: a */
        private static ConcurrentHashMap<String, Map<String, String>> m85039a() {
            return new ConcurrentHashMap<>();
        }

        public final /* synthetic */ Object invoke() {
            return m85039a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.business.PassBackWebInfoBusiness$e */
    static final class C25846e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ PassBackWebInfoBusiness f68357a;

        /* renamed from: b */
        final /* synthetic */ WeakReference f68358b;

        C25846e(PassBackWebInfoBusiness passBackWebInfoBusiness, WeakReference weakReference) {
            this.f68357a = passBackWebInfoBusiness;
            this.f68358b = weakReference;
        }

        public final void run() {
            WebView webView = (WebView) this.f68358b.get();
            if (webView != null) {
                C7573i.m23582a((Object) webView, "webViewRef.get() ?: return@postDelayed");
                final String url = webView.getUrl();
                if (TextUtils.isEmpty(url)) {
                    this.f68357a.mo67193b();
                } else if (VERSION.SDK_INT >= 19) {
                    webView.evaluateJavascript("encodeURIComponent(document.documentElement.outerHTML)", new ValueCallback<String>(this) {

                        /* renamed from: a */
                        final /* synthetic */ C25846e f68359a;

                        {
                            this.f68359a = r1;
                        }

                        /* access modifiers changed from: private */
                        /* renamed from: a */
                        public void onReceiveValue(String str) {
                            PassBackWebInfoBusiness passBackWebInfoBusiness = this.f68359a.f68357a;
                            String str2 = url;
                            C7573i.m23582a((Object) str2, "url");
                            passBackWebInfoBusiness.mo67191a(PassBackWebInfoBusiness.m85019b(str2), str);
                        }
                    });
                } else {
                    PassBackWebInfoBusiness passBackWebInfoBusiness = this.f68357a;
                    C7573i.m23582a((Object) url, "url");
                    C25867m.m85106a(webView, passBackWebInfoBusiness.mo67186a(url));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.business.PassBackWebInfoBusiness$f */
    static final class C25848f<V> implements Callable<C7581n> {

        /* renamed from: a */
        final /* synthetic */ PassBackWebInfoBusiness f68361a;

        C25848f(PassBackWebInfoBusiness passBackWebInfoBusiness) {
            this.f68361a = passBackWebInfoBusiness;
        }

        public final /* synthetic */ Object call() {
            m85041a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m85041a() {
            JSONObject jSONObject = new JSONObject();
            try {
                C25884b bVar = this.f68361a.f68344b;
                if (bVar != null) {
                    long j = 0;
                    try {
                        String str = bVar.f68458m;
                        if (str != null) {
                            j = Long.parseLong(str);
                        }
                    } catch (Exception unused) {
                    }
                    jSONObject.put("cid", j);
                }
                JSONArray jSONArray = new JSONArray();
                Set<String> keySet = this.f68361a.mo67187a().keySet();
                if (keySet != null) {
                    for (String c : keySet) {
                        jSONArray.put(PassBackWebInfoBusiness.m85020c(c));
                    }
                }
                jSONObject.put("url_array", jSONArray);
            } catch (Exception unused2) {
            }
            C6877n.m21447a("aweme_ad_pass_back_web_info_url_empty", jSONObject);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.business.PassBackWebInfoBusiness$g */
    static final class C25849g extends Lambda implements C7561a<PassBackApi> {

        /* renamed from: a */
        public static final C25849g f68362a = new C25849g();

        C25849g() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m85042a();
        }

        /* renamed from: a */
        private static PassBackApi m85042a() {
            return (PassBackApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder("https://i.snssdk.com").mo26430a().mo26435a(PassBackApi.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.business.PassBackWebInfoBusiness$h */
    public static final class C25850h implements C12474e<String> {
        C25850h() {
        }

        /* renamed from: a */
        public final void mo26463a(C12466b<String> bVar, C12534t<String> tVar) {
        }

        /* renamed from: a */
        public final void mo26464a(C12466b<String> bVar, Throwable th) {
        }
    }

    /* renamed from: e */
    private final Handler m85021e() {
        return (Handler) this.f68345c.getValue();
    }

    /* renamed from: f */
    private final Map<String, Map<String, String>> m85022f() {
        return (Map) this.f68347e.getValue();
    }

    /* renamed from: g */
    private final PassBackApi m85023g() {
        return (PassBackApi) this.f68352n.getValue();
    }

    /* renamed from: a */
    public final Map<String, String> mo67187a() {
        return (Map) this.f68346d.getValue();
    }

    /* renamed from: d */
    public final void mo67195d() {
        m85024h();
        m85021e().removeCallbacksAndMessages(null);
    }

    /* renamed from: h */
    private final void m85024h() {
        if (m85025i()) {
            C1592h.m7853a((Callable<TResult>) new C25842a<TResult>(this));
        }
    }

    /* renamed from: b */
    public final void mo67193b() {
        C1592h.m7855a((Callable<TResult>) new C25848f<TResult>(this), (Executor) C6907h.m21516a());
    }

    /* renamed from: i */
    private final boolean m85025i() {
        if (this.f68348f == null || this.f68344b == null) {
            return false;
        }
        C25884b bVar = this.f68344b;
        if (bVar == null) {
            C7573i.m23580a();
        }
        if (!bVar.f68441A) {
            return false;
        }
        if (this.f68349k && NetworkUtils.getNetworkType(C6399b.m19921a()) != NetworkType.WIFI) {
            return false;
        }
        if (this.f68351m <= 0 || C25866l.m85101a().get() < this.f68351m) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo67194c() {
        C25884b bVar = this.f68344b;
        if (bVar != null && !mo67187a().isEmpty()) {
            C6711m mVar = new C6711m();
            C6609h hVar = new C6609h();
            Iterator it = mo67187a().entrySet().iterator();
            while (true) {
                boolean z = true;
                if (!it.hasNext()) {
                    break;
                }
                Entry entry = (Entry) it.next();
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                C6711m mVar2 = new C6711m();
                String c = m85020c(str);
                mVar2.mo16147a("url", c);
                mVar2.mo16147a("html", m85020c(str2));
                Map map = (Map) m85022f().get(C12748a.m37035a(c));
                if (map != null && !map.isEmpty()) {
                    z = false;
                }
                if (!z) {
                    C6711m mVar3 = new C6711m();
                    for (Entry entry2 : map.entrySet()) {
                        mVar3.mo16147a((String) entry2.getKey(), (String) entry2.getValue());
                    }
                    mVar2.mo16144a("headers", (C6709k) mVar3);
                }
                hVar.mo15996a((C6709k) mVar2);
            }
            mVar.mo16144a("pages", (C6709k) hVar);
            mVar.mo16146a("ad_id", (Number) Long.valueOf(bVar.f68446a));
            long j = 0;
            try {
                String str3 = bVar.f68458m;
                if (str3 != null) {
                    j = Long.parseLong(str3);
                }
            } catch (Exception unused) {
            }
            mVar.mo16146a("cid", (Number) Long.valueOf(j));
            mVar.mo16147a("log_extra", bVar.f68454i);
            mVar.mo16146a("timestamp", (Number) Long.valueOf(new Date().getTime()));
            NetworkType networkType = NetworkUtils.getNetworkType(C6399b.m19921a());
            C7573i.m23582a((Object) networkType, "NetworkUtils.getNetworkT….getApplicationContext())");
            mVar.mo16146a("network_type", (Number) Integer.valueOf(networkType.getValue()));
            LocationResult a = C32640a.m105721a().mo84021a();
            if (a == null) {
                mVar.mo16144a("location", (C6709k) null);
            } else {
                C6711m mVar4 = new C6711m();
                mVar4.mo16146a("longitude", (Number) Double.valueOf(a.getLongitude()));
                mVar4.mo16146a("latitude", (Number) Double.valueOf(a.getLatitude()));
                mVar.mo16144a("location", (C6709k) mVar4);
            }
            String a2 = C25866l.f68402a.mo67238a(mVar);
            if (!TextUtils.isEmpty(a2)) {
                C6711m mVar5 = new C6711m();
                mVar5.mo16147a(C38347c.f99553h, a2);
                m85023g().executePost("/inspect/aegis/client/page/", mVar5).enqueue(new C25850h());
                mo67187a().clear();
                m85022f().clear();
                C25866l.m85101a().addAndGet(1);
            }
        }
    }

    /* renamed from: b */
    public static String m85019b(String str) {
        String encode = URLEncoder.encode(str, "UTF-8");
        C7573i.m23582a((Object) encode, "URLEncoder.encode(str, \"UTF-8\")");
        return encode;
    }

    /* renamed from: c */
    public static String m85020c(String str) {
        String decode = URLDecoder.decode(str, "UTF-8");
        C7573i.m23582a((Object) decode, "URLDecoder.decode(str, \"UTF-8\")");
        return decode;
    }

    /* renamed from: a */
    public final String mo67186a(String str) {
        StringBuilder sb = new StringBuilder("javascript:window.location.href='bytedance://adPageHtmlContent?html=' + encodeURIComponent(document.documentElement.outerHTML) + '&url=");
        sb.append(m85019b(str));
        sb.append("'");
        return sb.toString();
    }

    public PassBackWebInfoBusiness(C25856c cVar) {
        C7573i.m23587b(cVar, "crossPlatformBusiness");
        super(cVar);
    }

    /* renamed from: a */
    public final void mo67188a(Uri uri) {
        if (m85025i() && uri != null) {
            String queryParameter = uri.getQueryParameter("url");
            String queryParameter2 = uri.getQueryParameter("html");
            if (!TextUtils.isEmpty(queryParameter) && !TextUtils.isEmpty(queryParameter2)) {
                if (queryParameter == null) {
                    C7573i.m23580a();
                }
                if (queryParameter2 == null) {
                    C7573i.m23580a();
                }
                mo67191a(queryParameter, queryParameter2);
            }
        }
    }

    /* renamed from: a */
    public final void mo67189a(WebView webView) {
        boolean z;
        if (m85025i() && mo67187a().size() < this.f68350l && webView != null) {
            CharSequence url = webView.getUrl();
            if (url == null || C7634n.m23713a(url)) {
                z = true;
            } else {
                z = false;
            }
            if (!z && !C7573i.m23585a((Object) "about:blank", (Object) webView.getUrl())) {
                m85021e().postDelayed(new C25846e(this, new WeakReference(webView)), 200);
            }
        }
    }

    /* renamed from: a */
    public final void mo67190a(C25884b bVar) {
        this.f68344b = bVar;
        try {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            this.f68348f = a.getAdLandingPageConfig();
            AdLandingPageConfig adLandingPageConfig = this.f68348f;
            if (adLandingPageConfig != null) {
                Boolean adLandingPageReportWifiOnlyEnable = adLandingPageConfig.getAdLandingPageReportWifiOnlyEnable();
                C7573i.m23582a((Object) adLandingPageReportWifiOnlyEnable, "it.adLandingPageReportWifiOnlyEnable");
                this.f68349k = adLandingPageReportWifiOnlyEnable.booleanValue();
                Integer adLandingPageReportPageCount = adLandingPageConfig.getAdLandingPageReportPageCount();
                C7573i.m23582a((Object) adLandingPageReportPageCount, "it.adLandingPageReportPageCount");
                this.f68350l = adLandingPageReportPageCount.intValue();
                Integer adLandingPageReportLimitTimes = adLandingPageConfig.getAdLandingPageReportLimitTimes();
                C7573i.m23582a((Object) adLandingPageReportLimitTimes, "it.adLandingPageReportLimitTimes");
                this.f68351m = adLandingPageReportLimitTimes.intValue();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo67191a(String str, String str2) {
        if (str2 != null) {
            mo67187a().put(str, C7634n.m23763b(str2, "\""));
        }
    }

    /* renamed from: a */
    public final void mo67192a(String str, Map<String, String> map) {
        C7573i.m23587b(str, "url");
        C7573i.m23587b(map, "headers");
        if (m85025i() && mo67187a().size() < this.f68350l && !C7634n.m23713a(str) && !C7573i.m23585a((Object) "about:blank", (Object) str) && !C7634n.m23723c(str, ".js", false) && !C7634n.m23723c(str, ".css", false)) {
            String str2 = (String) map.get("Accept");
            if (str2 != null && C7634n.m23776c((CharSequence) str2, (CharSequence) "html", false)) {
                Map f = m85022f();
                String a = C12748a.m37035a(str);
                C7573i.m23582a((Object) a, "Md5Utils.hexDigest(url)");
                f.put(a, map);
            }
        }
    }
}
