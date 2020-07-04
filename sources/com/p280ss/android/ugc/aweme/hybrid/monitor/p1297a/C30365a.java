package com.p280ss.android.ugc.aweme.hybrid.monitor.p1297a;

import android.net.Uri;
import android.net.http.SslError;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import com.p280ss.android.ugc.aweme.hybrid.monitor.C30392l;
import com.p280ss.android.ugc.aweme.hybrid.monitor.C30393m;
import com.p280ss.android.ugc.aweme.hybrid.monitor.utils.C30404a;
import java.lang.ref.WeakReference;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.hybrid.monitor.a.a */
public final class C30365a implements ValueCallback<String> {

    /* renamed from: f */
    private static final String f79801f = "javascript:var result = {};var timing = window.performance && window.performance.timing;result.dom_ready = timing.domComplete - timing.domInteractive;";

    /* renamed from: q */
    private static long f79802q;

    /* renamed from: a */
    public C30368b f79803a = new C30368b();

    /* renamed from: b */
    public WeakReference<WebView> f79804b;

    /* renamed from: c */
    public int f79805c;

    /* renamed from: d */
    public int f79806d;

    /* renamed from: e */
    public final Handler f79807e = new Handler();

    /* renamed from: g */
    private boolean f79808g;

    /* renamed from: h */
    private WebView f79809h;

    /* renamed from: i */
    private List<String> f79810i;

    /* renamed from: j */
    private C30392l f79811j;

    /* renamed from: k */
    private boolean f79812k;

    /* renamed from: l */
    private String f79813l;

    /* renamed from: m */
    private String f79814m;

    /* renamed from: n */
    private long f79815n;

    /* renamed from: o */
    private long f79816o;

    /* renamed from: p */
    private final Runnable f79817p = new Runnable() {
        public final void run() {
            WebView webView;
            if (C30365a.this.f79804b != null) {
                webView = (WebView) C30365a.this.f79804b.get();
            } else {
                webView = null;
            }
            if (webView != null) {
                if (C30365a.this.f79803a.f79831j == 100) {
                    C30365a.this.mo79948a(true);
                } else if (C30365a.this.f79803a.f79831j > C30365a.this.f79805c) {
                    C30365a.this.f79805c = C30365a.this.f79803a.f79831j;
                    C30365a.this.f79806d = 0;
                    C30365a.this.f79807e.postDelayed(this, 1000);
                } else {
                    C30365a.this.f79806d++;
                    if (C30365a.this.f79806d < 3) {
                        C30365a.this.f79807e.postDelayed(this, 1000);
                    } else {
                        C30365a.this.mo79957f();
                    }
                }
            }
        }
    };

    /* renamed from: a */
    public final void mo79947a(String str) {
        if (!m99208i(str)) {
            this.f79803a.f79829h = str;
            this.f79803a.f79828g = this.f79813l;
            this.f79803a.f79830i = str;
            this.f79803a.f79832k = SystemClock.uptimeMillis();
            this.f79807e.removeCallbacks(this.f79817p);
            this.f79807e.postDelayed(this.f79817p, 3000);
        }
    }

    /* renamed from: a */
    public final void mo79946a(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (webResourceRequest != null && webResourceRequest.getUrl() != null) {
            this.f79803a.f79846y = -2;
            this.f79803a.f79837p = webResourceRequest.isForMainFrame();
            this.f79803a.f79821B = webResourceRequest.getUrl().toString();
            this.f79803a.f79847z = Integer.valueOf(webResourceResponse != null ? webResourceResponse.getStatusCode() : 0);
            m99211k();
        }
    }

    /* renamed from: g */
    public static void m99205g() {
        f79802q = SystemClock.uptimeMillis();
    }

    /* renamed from: i */
    private void m99207i() {
        if (this.f79811j != null) {
            this.f79811j.mo80012a("hybrid_ttwebview_monitor", m99209j());
        }
    }

    /* renamed from: l */
    private void m99213l() {
        this.f79815n = SystemClock.uptimeMillis();
        m99202a("detailGetWebViewData", (ValueCallback<String>) this);
    }

    /* renamed from: e */
    public final void mo79955e() {
        this.f79803a.f79826e = SystemClock.uptimeMillis();
    }

    /* renamed from: h */
    private void m99206h() {
        long uptimeMillis = SystemClock.uptimeMillis();
        long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
        this.f79803a.f79822a = C30404a.m99373a(this.f79809h);
        this.f79803a.f79823b = uptimeMillis2;
        m99207i();
    }

    /* renamed from: c */
    public final void mo79951c() {
        if (this.f79803a.f79835n == 0) {
            this.f79803a.f79835n = SystemClock.uptimeMillis();
        }
    }

    /* renamed from: f */
    public final void mo79957f() {
        if (VERSION.SDK_INT >= 19 && this.f79809h != null) {
            try {
                this.f79809h.evaluateJavascript(f79801f, null);
                this.f79809h.evaluateJavascript("javascript:result", new ValueCallback<String>() {
                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public void onReceiveValue(String str) {
                        try {
                            if (new JSONObject(str).getLong("dom_ready") <= 0) {
                                C30365a.this.f79803a.f79846y = -4;
                                C30365a.this.f79803a.f79837p = true;
                            }
                            C30365a.this.mo79948a(true);
                        } catch (JSONException unused) {
                        }
                    }
                });
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: k */
    private void m99211k() {
        if (this.f79803a.f79846y != 0) {
            if (TextUtils.equals(this.f79803a.f79821B, this.f79803a.f79830i)) {
                this.f79803a.f79837p = true;
                mo79948a(true);
                return;
            }
            this.f79803a.f79841t++;
        }
    }

    /* renamed from: d */
    public final void mo79953d() {
        if (!m99208i(this.f79803a.f79829h)) {
            m99213l();
            this.f79803a.f79827f = SystemClock.uptimeMillis();
            this.f79807e.removeCallbacks(this.f79817p);
            if (!this.f79808g) {
                m99203a(false, true);
            }
            m99206h();
        }
    }

    /* renamed from: a */
    public final JSONObject mo79941a() {
        boolean z;
        C30368b bVar = this.f79803a;
        if (bVar == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isBlank", Boolean.toString(bVar.f79822a));
            jSONObject.put("pageFinish", Boolean.toString(bVar.f79838q));
            jSONObject.put("mainFrameError", Boolean.toString(bVar.f79837p));
            jSONObject.put("webViewType", bVar.f79828g);
            String str = "isOfflineCache";
            if (bVar.f79843v > 0) {
                z = true;
            } else {
                z = false;
            }
            jSONObject.put(str, Boolean.toString(z));
            jSONObject.put("errUrl", bVar.f79821B);
            jSONObject.put("errType", Integer.toString(bVar.f79846y));
            jSONObject.put("errCode", Integer.toString(bVar.f79847z.intValue()));
            jSONObject.put("errMsg", bVar.f79820A);
            jSONObject.put("useCache", Boolean.toString(m99204a(bVar)));
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* renamed from: b */
    public final JSONObject mo79949b() {
        C30368b bVar = this.f79803a;
        if (bVar == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("detectDuration", bVar.f79823b);
            jSONObject.put("attachedWindowToLoadUrl", bVar.f79832k - bVar.f79826e);
            jSONObject.put("loadUrlToAttachedWindow", bVar.f79826e - bVar.f79832k);
            jSONObject.put("loadUrlToPageFinish", bVar.f79834m - bVar.f79832k);
            jSONObject.put("loadUrlToPageStart", bVar.f79833l - bVar.f79832k);
            jSONObject.put("attachedWindowToDetachWindow", bVar.f79827f - bVar.f79826e);
            jSONObject.put("pageStartToPageFinish", bVar.f79834m - bVar.f79833l);
            jSONObject.put("loadUrlToDetachWindow", bVar.f79827f - bVar.f79832k);
            jSONObject.put("loadResCount", bVar.f79839r);
            jSONObject.put("requestResCount", bVar.f79840s);
            jSONObject.put("loadResErrorCount", bVar.f79841t);
            jSONObject.put("ttNetResCount", bVar.f79842u);
            jSONObject.put("offlineResCount", bVar.f79843v);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: j */
    private JSONObject m99209j() {
        C30368b bVar = this.f79803a;
        if (bVar == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ttweb_isBlank", bVar.f79822a);
            jSONObject.put("ttweb_pageFinish", bVar.f79838q);
            jSONObject.put("ttweb_originalUrl", bVar.f79829h);
            jSONObject.put("ttweb_pageUrl", bVar.f79830i);
            jSONObject.put("ttweb_webviewType", bVar.f79828g);
            jSONObject.put("ttweb_mainFrameError", bVar.f79837p);
            jSONObject.put("ttweb_errUrl", bVar.f79821B);
            jSONObject.put("ttweb_errType", bVar.f79846y);
            jSONObject.put("ttweb_errCode", bVar.f79847z);
            jSONObject.put("ttweb_errMsg", bVar.f79820A);
            jSONObject.put("ttweb_useCache", m99204a(bVar));
            if (f79802q > 0) {
                jSONObject.put("ttweb_initToLoadUrl", bVar.f79832k - f79802q);
                jSONObject.put("ttweb_initToPageStart", bVar.f79833l - f79802q);
                jSONObject.put("ttweb_initToPageFinish", bVar.f79834m - f79802q);
            }
            jSONObject.put("ttweb_detectDuration", bVar.f79823b);
            jSONObject.put("ttweb_attachedWindowToLoadUrl", bVar.f79832k - bVar.f79826e);
            jSONObject.put("ttweb_loadUrlToAttachedWindow", bVar.f79826e - bVar.f79832k);
            jSONObject.put("ttweb_loadUrlToPageFinish", bVar.f79834m - bVar.f79832k);
            jSONObject.put("ttweb_loadUrlToPageStart", bVar.f79833l - bVar.f79832k);
            jSONObject.put("ttweb_attachedWindowToDetachWindow", bVar.f79827f - bVar.f79826e);
            jSONObject.put("ttweb_pageStartToPageFinish", bVar.f79834m - bVar.f79833l);
            jSONObject.put("ttweb_loadUrlToDetachWindow", bVar.f79827f - bVar.f79832k);
            jSONObject.put("ttweb_loadResCount", bVar.f79839r);
            jSONObject.put("ttweb_requestResCount", bVar.f79840s);
            jSONObject.put("ttweb_loadResErrorCount", bVar.f79841t);
            jSONObject.put("ttweb_ttNetResCount", bVar.f79842u);
            jSONObject.put("ttweb_offlineResCount", bVar.f79843v);
            jSONObject.put("ttweb_TTWebViewData", this.f79814m);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public final void mo79942a(int i) {
        this.f79803a.f79831j = i;
    }

    /* renamed from: a */
    public final void mo79948a(boolean z) {
        m99203a(true, false);
    }

    /* renamed from: d */
    public final void mo79954d(String str) {
        this.f79803a.f79839r++;
    }

    /* renamed from: f */
    public final void mo79958f(String str) {
        this.f79803a.f79843v++;
    }

    /* renamed from: g */
    public final void mo79959g(String str) {
        this.f79803a.f79842u++;
    }

    /* renamed from: j */
    private static boolean m99210j(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.startsWith(WebKitApi.SCHEME_HTTP) || str.startsWith(WebKitApi.SCHEME_HTTPS)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo79950b(String str) {
        this.f79803a.f79830i = str;
        if (this.f79803a.f79833l == 0) {
            this.f79803a.f79833l = SystemClock.uptimeMillis();
        }
    }

    /* renamed from: e */
    public final void mo79956e(String str) {
        this.f79803a.f79840s++;
    }

    /* renamed from: i */
    private static boolean m99208i(String str) {
        if (m99210j(str)) {
            return false;
        }
        if (TextUtils.equals("about:blank", str) || (str != null && str.length() > 9 && str.substring(0, 10).equalsIgnoreCase("javascript"))) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo79952c(String str) {
        if (this.f79803a.f79834m == 0 && !m99208i(str)) {
            this.f79803a.f79830i = str;
            this.f79803a.f79834m = SystemClock.uptimeMillis();
            mo79948a(true);
        }
        this.f79807e.removeCallbacks(this.f79817p);
    }

    /* renamed from: h */
    public final void mo79960h(String str) {
        if (!m99208i(str)) {
            m99202a("detailClearWebViewData", (ValueCallback<String>) this);
            m99202a("detailEnableDomData", (ValueCallback<String>) this);
        }
    }

    /* renamed from: a */
    private boolean m99204a(C30368b bVar) {
        if (this.f79810i == null || bVar == null || TextUtils.isEmpty(bVar.f79829h)) {
            return false;
        }
        for (String contains : this.f79810i) {
            if (bVar.f79829h.contains(contains)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void onReceiveValue(String str) {
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(TEVideoRecorder.FACE_BEAUTY_NULL, str) && !TextUtils.equals("{}", str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("detailGetWebViewData")) {
                    this.f79814m = jSONObject.getString("detailGetWebViewData");
                    this.f79816o = SystemClock.uptimeMillis();
                }
                jSONObject.has("detailClearWebViewData");
                jSONObject.has("detailEnableDomData");
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo79944a(SslError sslError) {
        if (sslError != null) {
            this.f79803a.f79846y = -3;
            this.f79803a.f79847z = Integer.valueOf(sslError.getPrimaryError());
            this.f79803a.f79821B = sslError.getUrl();
            this.f79803a.f79820A = sslError.toString();
            m99211k();
        }
    }

    /* renamed from: a */
    private void m99203a(boolean z, boolean z2) {
        if (!this.f79808g) {
            this.f79808g = true;
            if (!this.f79803a.f79837p) {
                if (z || !z2) {
                    this.f79803a.f79838q = true;
                }
            }
        }
    }

    /* renamed from: a */
    private void m99202a(String str, ValueCallback<String> valueCallback) {
        if (this.f79809h != null && VERSION.SDK_INT >= 19 && this.f79812k) {
            WebView webView = this.f79809h;
            StringBuilder sb = new StringBuilder("ttwebview:/*");
            sb.append(str);
            sb.append("*/;");
            webView.evaluateJavascript(sb.toString(), valueCallback);
        }
    }

    /* renamed from: a */
    public final void mo79943a(int i, String str) {
        if (m99210j(str)) {
            this.f79803a.f79846y = -1;
            this.f79803a.f79847z = Integer.valueOf(i);
            this.f79803a.f79821B = str;
            m99211k();
        }
    }

    /* renamed from: a */
    public final void mo79945a(WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        Uri uri;
        int i;
        if (webResourceRequest != null) {
            uri = webResourceRequest.getUrl();
        } else {
            uri = null;
        }
        if (uri != null && m99210j(uri.toString())) {
            this.f79803a.f79846y = -1;
            this.f79803a.f79837p = webResourceRequest.isForMainFrame();
            this.f79803a.f79821B = uri.toString();
            C30368b bVar = this.f79803a;
            if (webResourceError != null) {
                i = webResourceError.getErrorCode();
            } else {
                i = 0;
            }
            bVar.f79847z = Integer.valueOf(i);
            m99211k();
        }
    }

    public C30365a(WebView webView, List<String> list, C30392l lVar, C30393m mVar) {
        boolean z;
        String str;
        this.f79804b = new WeakReference<>(webView);
        this.f79809h = webView;
        this.f79810i = list;
        this.f79811j = lVar;
        if (mVar == null || !mVar.mo80017g()) {
            z = false;
        } else {
            z = true;
        }
        this.f79812k = z;
        if (mVar != null) {
            str = mVar.mo80016f();
        } else {
            str = "";
        }
        this.f79813l = str;
    }
}
