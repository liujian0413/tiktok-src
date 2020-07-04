package com.p280ss.android.ugc.aweme.hybrid.monitor;

import android.net.Uri;
import android.net.http.SslError;
import android.view.View;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.android.monitor.webview.C9529a;
import com.bytedance.android.monitor.webview.C9531c;
import com.bytedance.android.monitor.webview.C9531c.C9532a;
import com.bytedance.android.monitor.webview.C9533d;
import com.bytedance.android.monitor.webview.C9535f;
import com.bytedance.android.monitor.webview.C9541j;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.p280ss.android.ugc.aweme.hybrid.monitor.p1297a.C30365a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.LazyThreadSafetyMode;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C48007r;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7595j;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.hybrid.monitor.g */
public final class C30382g extends C30370ab implements C30391k {

    /* renamed from: d */
    static final /* synthetic */ C7595j[] f79872d = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C30382g.class), "container", "getContainer()Landroid/webkit/WebView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C30382g.class), "blankMonitor", "getBlankMonitor()Lcom/ss/android/ugc/aweme/hybrid/monitor/h5/H5BlankScreenMonitor;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C30382g.class), "monitorHelper", "getMonitorHelper()Lcom/bytedance/android/monitor/webview/ITTLiveWebViewMonitorHelper;"))};

    /* renamed from: e */
    public final JSONObject f79873e;

    /* renamed from: k */
    private final List<String> f79874k = new ArrayList();

    /* renamed from: l */
    private final C7541d f79875l = C7546e.m23568a(LazyThreadSafetyMode.NONE, new C30384b(this));

    /* renamed from: m */
    private final C7541d f79876m = C7546e.m23568a(LazyThreadSafetyMode.NONE, new C30383a(this));

    /* renamed from: n */
    private final C7541d f79877n = C7546e.m23568a(LazyThreadSafetyMode.NONE, new C30385c(this));

    /* renamed from: o */
    private boolean f79878o;

    /* renamed from: p */
    private List<String> f79879p = C7525m.m23461a();

    /* renamed from: q */
    private boolean f79880q = true;

    /* renamed from: r */
    private long f79881r;

    /* renamed from: s */
    private long f79882s;

    /* renamed from: t */
    private final Map<Uri, Long> f79883t = new LinkedHashMap();

    /* renamed from: com.ss.android.ugc.aweme.hybrid.monitor.g$a */
    static final class C30383a extends Lambda implements C7561a<C30365a> {

        /* renamed from: a */
        final /* synthetic */ C30382g f79884a;

        C30383a(C30382g gVar) {
            this.f79884a = gVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C30365a invoke() {
            C30393m h = this.f79884a.mo79972h();
            List list = null;
            if (h == null || !h.mo80014d()) {
                return null;
            }
            WebView c = this.f79884a.mo80002c();
            C30393m h2 = this.f79884a.mo79972h();
            if (h2 != null) {
                list = h2.mo80015e();
            }
            return new C30365a(c, list, this.f79884a.mo79974i(), this.f79884a.mo79972h());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.hybrid.monitor.g$b */
    static final class C30384b extends Lambda implements C7561a<WebView> {

        /* renamed from: a */
        final /* synthetic */ C30382g f79885a;

        C30384b(C30382g gVar) {
            this.f79885a = gVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public WebView invoke() {
            View view = (View) this.f79885a.f79852h.mo79983a(View.class);
            View view2 = null;
            if (view != null) {
                if (!(view instanceof WebView)) {
                    view = null;
                }
                if (view != null) {
                    if (view != null) {
                        view2 = (WebView) view;
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type android.webkit.WebView");
                    }
                }
            }
            return (WebView) view2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.hybrid.monitor.g$c */
    static final class C30385c extends Lambda implements C7561a<C9531c> {

        /* renamed from: a */
        final /* synthetic */ C30382g f79886a;

        /* renamed from: com.ss.android.ugc.aweme.hybrid.monitor.g$c$a */
        static final /* synthetic */ class C30386a extends FunctionReference implements C48007r<String, Integer, JSONObject, JSONObject, C7581n> {
            C30386a(C30382g gVar) {
                super(4, gVar);
            }

            public final String getName() {
                return "monitorStatusAndDuration";
            }

            public final C7585d getOwner() {
                return C7575l.m23595a(C30382g.class);
            }

            public final String getSignature() {
                return "monitorStatusAndDuration(Ljava/lang/String;Ljava/lang/Integer;Lorg/json/JSONObject;Lorg/json/JSONObject;)V";
            }

            /* renamed from: a */
            private void m99306a(String str, Integer num, JSONObject jSONObject, JSONObject jSONObject2) {
                ((C30382g) this.receiver).mo79967a(str, num, jSONObject, jSONObject2);
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                m99306a((String) obj, (Integer) obj2, (JSONObject) obj3, (JSONObject) obj4);
                return C7581n.f20898a;
            }
        }

        C30385c(C30382g gVar) {
            this.f79886a = gVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C9531c invoke() {
            String str;
            C9531c b = C9541j.m28227b();
            C9532a a = b.mo23584a();
            a.mo23605b("HybridMonitor");
            a.mo23608d("douyin");
            a.mo23601a((C9533d) C9535f.m28156a());
            a.mo23603a(b.mo23599d(this.f79886a.mo80002c()));
            a.mo23600a((C9529a) new C30387h(new C30386a(this.f79886a)));
            if (this.f79886a.f79799b) {
                a.mo23606b(true);
                C30393m h = this.f79886a.mo79972h();
                if (h != null) {
                    str = h.mo80013c();
                } else {
                    str = null;
                }
                a.mo23607c(str);
            }
            if (this.f79886a.mo80002c() == null) {
                b.mo23598c(a);
            } else {
                b.mo23592a(a);
            }
            return b;
        }
    }

    /* renamed from: m */
    private final C30365a m99273m() {
        return (C30365a) this.f79876m.getValue();
    }

    /* renamed from: n */
    private C9531c m99274n() {
        return (C9531c) this.f79877n.getValue();
    }

    /* renamed from: o */
    private boolean m99275o() {
        return this.f79878o;
    }

    /* renamed from: p */
    private List<String> m99276p() {
        return this.f79879p;
    }

    /* renamed from: c */
    public final WebView mo80002c() {
        return (WebView) this.f79875l.getValue();
    }

    /* renamed from: a */
    public final void mo79939a(String str, boolean z) {
        C7573i.m23587b(str, "id");
        super.mo79939a(str, z);
        this.f79880q = true;
        this.f79881r = System.currentTimeMillis();
        C30365a m = m99273m();
        if (m != null) {
            m.mo79960h(mo79968e().mo80027a());
        }
        C30365a m2 = m99273m();
        if (m2 != null) {
            m2.mo79947a(mo79968e().mo80027a());
        }
        m99274n().mo23597c(mo80002c());
        C30400r e = mo79968e();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("trigger", "load_url");
        C30370ab.m99240a(this, "hybrid_app_monitor_load_url_event", e, jSONObject, null, null, 24, null);
        m99271a(mo79968e().f79893a, "load_url");
    }

    /* renamed from: a */
    public final void mo79993a(C30375b bVar, ApiResultException apiResultException) {
        C7573i.m23587b(bVar, "request");
        String str = "hybrid_app_monitor_fetch_api_error";
        C30400r k = mo79976k();
        JSONObject jSONObject = new JSONObject();
        C30377c.m99262a(jSONObject, bVar.getFormatData());
        if (apiResultException == null) {
            jSONObject.put("error_type", "success");
        } else {
            C30377c.m99262a(jSONObject, apiResultException.getFormatData());
        }
        C30370ab.m99240a(this, str, k, jSONObject, null, null, 24, null);
    }

    /* renamed from: a */
    public final void mo79994a(String str) {
        String str2 = "should_intercept_request";
        if (str != null) {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                if (m99271a(parse, str2)) {
                    parse = null;
                }
                if (parse != null) {
                    m99272b(parse, str2);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo79990a(WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        C30365a m = m99273m();
        if (m != null) {
            m.mo79945a(webResourceRequest, webResourceError);
        }
        String str = "hybrid_app_monitor_h5_received_error";
        C30400r e = mo79968e();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("trigger", "on_received_error");
        if (webResourceError != null) {
            jSONObject.put("received_error_code", String.valueOf(webResourceError.getErrorCode()));
            jSONObject.put("received_error_desc", webResourceError.getDescription());
        }
        if (webResourceRequest != null) {
            Uri url = webResourceRequest.getUrl();
            if (url != null) {
                jSONObject.put("failing_url", url.toString());
            }
        }
        C30370ab.m99240a(this, str, e, jSONObject, null, null, 24, null);
    }

    /* renamed from: a */
    public final void mo79991a(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        C30365a m = m99273m();
        if (m != null) {
            m.mo79946a(webResourceRequest, webResourceResponse);
        }
        String str = "hybrid_app_monitor_h5_received_error";
        C30400r e = mo79968e();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("trigger", "on_received_http_error");
        if (webResourceResponse != null) {
            jSONObject.put("received_status_code", String.valueOf(webResourceResponse.getStatusCode()));
        }
        if (webResourceRequest != null) {
            Uri url = webResourceRequest.getUrl();
            if (url != null) {
                jSONObject.put("failing_url", url.toString());
            }
        }
        C30370ab.m99240a(this, str, e, jSONObject, null, null, 24, null);
    }

    /* renamed from: a */
    public final void mo79996a(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        C7573i.m23587b(str, "serviceName");
        C7573i.m23587b(str2, "triggerFrom");
        C30400r e = mo79968e();
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("trigger", str2);
        if (jSONObject != null) {
            C30377c.m99262a(jSONObject4, jSONObject);
        }
        mo79966a(str, e, jSONObject4, jSONObject2, jSONObject3);
    }

    /* renamed from: a */
    public final void mo79995a(String str, String str2, String str3, long j) {
        String str4 = "hybrid_app_monitor_h5_download";
        C30400r e = mo79968e();
        JSONObject jSONObject = new JSONObject();
        if (str != null) {
            jSONObject.put("download_url", str);
        }
        if (str2 != null) {
            jSONObject.put("content_disposition", str2);
        }
        if (str3 != null) {
            jSONObject.put("mime_type", str3);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("content_length", j);
        C30370ab.m99240a(this, str4, e, jSONObject, jSONObject2, null, 16, null);
    }

    /* renamed from: a */
    public final void mo79967a(String str, Integer num, JSONObject jSONObject, JSONObject jSONObject2) {
        super.mo79967a(str, num, jSONObject, jSONObject2);
        if (!C7573i.m23585a((Object) "ttdouyin_webview_timing_monitor_custom_service", (Object) str)) {
            try {
                m99270a(jSONObject2);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo79966a(String str, C30400r rVar, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        C7573i.m23587b(str, "eventName");
        C7573i.m23587b(rVar, "identifier");
        try {
            m99269a(rVar, str, jSONObject, jSONObject2, jSONObject3);
        } catch (Exception e) {
            mo79965a(e, rVar.mo80027a(), "h5");
        }
    }

    /* renamed from: d */
    public final void mo80004d() {
        C30365a m = m99273m();
        if (m != null) {
            m.mo79951c();
        }
    }

    /* renamed from: b */
    public final void mo79940b() {
        super.mo79940b();
        C9531c n = m99274n();
        n.mo23593a(n.mo23599d(mo80002c()));
    }

    /* renamed from: a */
    public final void mo79998a(boolean z) {
        this.f79878o = z;
    }

    /* renamed from: a */
    public final void mo79997a(List<String> list) {
        C7573i.m23587b(list, "<set-?>");
        this.f79879p = list;
    }

    /* renamed from: a */
    public final void mo79989a(View view) {
        C30365a m = m99273m();
        if (m != null) {
            m.mo79955e();
        }
    }

    /* renamed from: e */
    public final void mo80006e(String str) {
        C30365a m = m99273m();
        if (m != null) {
            m.mo79959g(str);
        }
    }

    /* renamed from: f */
    public final void mo80007f(String str) {
        C30365a m = m99273m();
        if (m != null) {
            m.mo79956e(str);
        }
    }

    /* renamed from: c */
    public final void mo80003c(String str) {
        C30365a m = m99273m();
        if (m != null) {
            m.mo79954d(str);
        }
    }

    /* renamed from: d */
    public final void mo80005d(String str) {
        C30365a m = m99273m();
        if (m != null) {
            m.mo79958f(str);
        }
    }

    /* renamed from: b */
    public final void mo80000b(View view) {
        C30365a m = m99273m();
        if (m != null) {
            m.mo79953d();
            C30370ab.m99240a(this, "hybrid_app_monitor_h5_blank_screen", mo79976k(), m.mo79941a(), m.mo79949b(), null, 16, null);
        }
    }

    /* renamed from: b */
    public final void mo80001b(String str) {
        String str2 = "should_override_url_loading";
        if (str != null) {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                if (m99271a(parse, str2)) {
                    parse = null;
                }
                if (parse != null) {
                    m99272b(parse, str2);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01e5, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m99270a(org.json.JSONObject r21) {
        /*
            r20 = this;
            r8 = r20
            r0 = r21
            if (r0 == 0) goto L_0x01e6
            java.lang.String r1 = "navigation_id"
            java.lang.String r9 = r0.optString(r1)
            java.lang.String r1 = "ev_type"
            java.lang.String r1 = r0.optString(r1)
            if (r1 != 0) goto L_0x0016
            goto L_0x01e6
        L_0x0016:
            int r2 = r1.hashCode()
            r10 = 0
            r11 = 0
            switch(r2) {
                case -1077756671: goto L_0x01bb;
                case -270976012: goto L_0x0133;
                case 101609: goto L_0x00f1;
                case 1669986551: goto L_0x009f;
                case 1837434847: goto L_0x0021;
                default: goto L_0x001f;
            }
        L_0x001f:
            goto L_0x01e5
        L_0x0021:
            java.lang.String r2 = "static_performance"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x01e5
            java.lang.String r1 = "event"
            org.json.JSONObject r0 = r0.optJSONObject(r1)
            if (r0 == 0) goto L_0x01e6
            java.lang.String r1 = "resources"
            org.json.JSONArray r11 = r0.optJSONArray(r1)
            if (r11 == 0) goto L_0x01e6
            int r12 = r11.length()
        L_0x003d:
            if (r10 >= r12) goto L_0x01e5
            org.json.JSONObject r0 = r11.optJSONObject(r10)
            if (r0 == 0) goto L_0x009c
            java.lang.String r1 = "name"
            java.lang.String r1 = r0.optString(r1)
            java.lang.String r2 = "hybrid_app_monitor_load_resource_event"
            com.ss.android.ugc.aweme.hybrid.monitor.u r3 = r20.mo79976k()
            com.ss.android.ugc.aweme.hybrid.monitor.r r3 = (com.p280ss.android.ugc.aweme.hybrid.monitor.C30400r) r3
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            java.lang.String r5 = "trigger"
            java.lang.String r6 = "on_load"
            r4.put(r5, r6)
            java.lang.String r5 = "navigation_id"
            r4.put(r5, r9)
            com.ss.android.ugc.aweme.hybrid.monitor.t r5 = new com.ss.android.ugc.aweme.hybrid.monitor.t
            android.net.Uri r14 = android.net.Uri.parse(r1)
            java.lang.String r1 = "Uri.parse(url)"
            kotlin.jvm.internal.C7573i.m23582a(r14, r1)
            java.lang.String r15 = "resource_"
            r16 = 0
            r17 = 0
            r18 = 12
            r19 = 0
            r13 = r5
            r13.<init>(r14, r15, r16, r17, r18, r19)
            org.json.JSONObject r1 = r5.getFormatData()
            com.p280ss.android.ugc.aweme.hybrid.monitor.C30377c.m99262a(r4, r1)
            com.ss.android.ugc.aweme.hybrid.monitor.utils.d r1 = com.p280ss.android.ugc.aweme.hybrid.monitor.utils.C30408d.f79911a
            com.ss.android.ugc.aweme.hybrid.monitor.utils.FetcherType r5 = com.p280ss.android.ugc.aweme.hybrid.monitor.utils.FetcherType.H5_RESOURCE_TIMING
            org.json.JSONObject r5 = r1.mo80036a(r0, r5)
            r6 = 0
            r7 = 16
            r13 = 0
            r0 = r20
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r13
            com.p280ss.android.ugc.aweme.hybrid.monitor.C30370ab.m99240a(r0, r1, r2, r3, r4, r5, r6, r7)
        L_0x009c:
            int r10 = r10 + 1
            goto L_0x003d
        L_0x009f:
            java.lang.String r2 = "static_error"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x01e5
            java.lang.String r1 = "event"
            org.json.JSONObject r0 = r0.optJSONObject(r1)
            java.lang.String r1 = "hybrid_app_monitor_load_resource_error"
            com.ss.android.ugc.aweme.hybrid.monitor.u r2 = r20.mo79976k()
            com.ss.android.ugc.aweme.hybrid.monitor.r r2 = (com.p280ss.android.ugc.aweme.hybrid.monitor.C30400r) r2
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r4 = "navigation_id"
            r3.put(r4, r9)
            if (r0 == 0) goto L_0x00e5
            com.ss.android.ugc.aweme.hybrid.monitor.t r4 = new com.ss.android.ugc.aweme.hybrid.monitor.t
            java.lang.String r5 = "st_url"
            java.lang.String r0 = r0.optString(r5)
            android.net.Uri r11 = android.net.Uri.parse(r0)
            java.lang.String r0 = "Uri.parse(it.optString(\"st_url\"))"
            kotlin.jvm.internal.C7573i.m23582a(r11, r0)
            java.lang.String r12 = "resource_"
            r13 = 0
            r14 = 0
            r15 = 12
            r16 = 0
            r10 = r4
            r10.<init>(r11, r12, r13, r14, r15, r16)
            org.json.JSONObject r0 = r4.getFormatData()
            com.p280ss.android.ugc.aweme.hybrid.monitor.C30377c.m99262a(r3, r0)
        L_0x00e5:
            r4 = 0
            r5 = 0
            r6 = 24
            r7 = 0
            r0 = r20
            com.p280ss.android.ugc.aweme.hybrid.monitor.C30370ab.m99240a(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L_0x01e5
        L_0x00f1:
            java.lang.String r2 = "fps"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x01e5
            java.lang.String r1 = "event"
            org.json.JSONObject r0 = r0.optJSONObject(r1)
            if (r0 == 0) goto L_0x010b
            java.lang.String r1 = "fps"
            double r0 = r0.optDouble(r1)
            java.lang.Double r11 = java.lang.Double.valueOf(r0)
        L_0x010b:
            java.lang.String r1 = "hybrid_app_monitor_js_fps"
            com.ss.android.ugc.aweme.hybrid.monitor.u r0 = r20.mo79976k()
            r2 = r0
            com.ss.android.ugc.aweme.hybrid.monitor.r r2 = (com.p280ss.android.ugc.aweme.hybrid.monitor.C30400r) r2
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r0 = "navigation_id"
            r3.put(r0, r9)
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            java.lang.String r0 = "fps"
            r4.put(r0, r11)
            r5 = 0
            r6 = 16
            r7 = 0
            r0 = r20
            com.p280ss.android.ugc.aweme.hybrid.monitor.C30370ab.m99240a(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L_0x01e6
        L_0x0133:
            java.lang.String r2 = "performance_interval"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x01e5
            java.lang.String r1 = "event"
            org.json.JSONObject r0 = r0.optJSONObject(r1)
            if (r0 == 0) goto L_0x01e6
            java.lang.String r1 = "navigation"
            org.json.JSONObject r12 = r0.optJSONObject(r1)
            if (r12 == 0) goto L_0x01e6
            java.util.Iterator r13 = r12.keys()
            if (r13 == 0) goto L_0x01e5
        L_0x0151:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x01e6
            java.lang.Object r0 = r13.next()
            java.lang.String r0 = (java.lang.String) r0
            r1 = 0
            double r3 = r12.optDouble(r0, r1)
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            r4 = r3
            java.lang.Number r4 = (java.lang.Number) r4
            double r4 = r4.doubleValue()
            int r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r6 <= 0) goto L_0x017c
            java.util.List<java.lang.String> r1 = r8.f79874k
            boolean r1 = r1.contains(r0)
            if (r1 != 0) goto L_0x017c
            r1 = 1
            goto L_0x017d
        L_0x017c:
            r1 = 0
        L_0x017d:
            if (r1 == 0) goto L_0x0180
            goto L_0x0181
        L_0x0180:
            r3 = r11
        L_0x0181:
            if (r3 == 0) goto L_0x0151
            java.lang.Number r3 = (java.lang.Number) r3
            r3.doubleValue()
            java.util.List<java.lang.String> r1 = r8.f79874k
            java.lang.String r2 = "eventKey"
            kotlin.jvm.internal.C7573i.m23582a(r0, r2)
            r1.add(r0)
            java.lang.String r1 = "hybrid_app_monitor_h5_timeline_event"
            com.ss.android.ugc.aweme.hybrid.monitor.u r2 = r20.mo79976k()
            com.ss.android.ugc.aweme.hybrid.monitor.r r2 = (com.p280ss.android.ugc.aweme.hybrid.monitor.C30400r) r2
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r4 = "trigger"
            r3.put(r4, r0)
            java.lang.String r4 = "navigation_id"
            r3.put(r4, r9)
            com.ss.android.ugc.aweme.hybrid.monitor.utils.d r4 = com.p280ss.android.ugc.aweme.hybrid.monitor.utils.C30408d.f79911a
            com.ss.android.ugc.aweme.hybrid.monitor.utils.FetcherType r5 = com.p280ss.android.ugc.aweme.hybrid.monitor.utils.FetcherType.H5_TIMING
            org.json.JSONObject r4 = r4.mo80035a(r0, r12, r5)
            r5 = 0
            r6 = 16
            r7 = 0
            r0 = r20
            com.p280ss.android.ugc.aweme.hybrid.monitor.C30370ab.m99240a(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0151
        L_0x01bb:
            java.lang.String r2 = "memory"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x01e5
            java.lang.String r1 = "hybrid_app_monitor_js_memory"
            com.ss.android.ugc.aweme.hybrid.monitor.u r2 = r20.mo79976k()
            com.ss.android.ugc.aweme.hybrid.monitor.r r2 = (com.p280ss.android.ugc.aweme.hybrid.monitor.C30400r) r2
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r4 = "navigation_id"
            r3.put(r4, r9)
            java.lang.String r4 = "event"
            org.json.JSONObject r4 = r0.optJSONObject(r4)
            r5 = 0
            r6 = 16
            r7 = 0
            r0 = r20
            com.p280ss.android.ugc.aweme.hybrid.monitor.C30370ab.m99240a(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L_0x01e6
        L_0x01e5:
            return
        L_0x01e6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.hybrid.monitor.C30382g.m99270a(org.json.JSONObject):void");
    }

    /* renamed from: b */
    public final void mo79999b(Uri uri) {
        boolean z;
        String str;
        boolean z2;
        JSONObject jSONObject;
        Uri uri2 = uri;
        C7573i.m23587b(uri2, "uri");
        boolean z3 = true;
        if (C7573i.m23585a((Object) uri.getScheme(), (Object) WebKitApi.SCHEME_HTTP) || C7573i.m23585a((Object) uri.getScheme(), (Object) WebKitApi.SCHEME_HTTPS)) {
            z = true;
        } else {
            z = false;
        }
        JSONObject jSONObject2 = null;
        if (!z) {
            uri2 = null;
        }
        if (uri2 != null) {
            Long l = (Long) this.f79883t.remove(uri2);
            if (l != null) {
                long longValue = l.longValue();
                C30365a m = m99273m();
                if (m != null) {
                    m.mo79952c(mo79976k().f79898b.mo80027a());
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (this.f79880q) {
                    longValue = this.f79881r;
                }
                if (this.f79880q) {
                    this.f79882s = currentTimeMillis;
                }
                String str2 = "hybrid_app_monitor_load_url_event";
                C30400r e = mo79968e();
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("trigger", "on_load");
                String str3 = "is_first_screen";
                if (this.f79880q) {
                    str = "first_screen";
                } else {
                    str = "navigation";
                }
                jSONObject3.put(str3, str);
                JSONObject jSONObject4 = new JSONObject();
                if (currentTimeMillis <= 0 || longValue <= 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    jSONObject = jSONObject4;
                } else {
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    jSONObject.put("page_load_interval", currentTimeMillis - longValue);
                }
                if (this.f79882s <= 0 || this.f79881r <= 0) {
                    z3 = false;
                }
                if (z3) {
                    jSONObject2 = jSONObject4;
                }
                if (jSONObject2 != null) {
                    jSONObject2.put("first_screen_page_load_interval", this.f79882s - this.f79881r);
                }
                jSONObject4.put("event_ts", currentTimeMillis);
                C30370ab.m99240a(this, str2, e, jSONObject3, jSONObject4, null, 16, null);
                this.f79880q = false;
            }
        }
    }

    /* renamed from: a */
    public final void mo79987a(Uri uri) {
        boolean z;
        C30382g gVar;
        Uri uri2 = uri;
        C7573i.m23587b(uri2, "uri");
        boolean z2 = false;
        if (C7573i.m23585a((Object) uri.getScheme(), (Object) WebKitApi.SCHEME_HTTP) || C7573i.m23585a((Object) uri.getScheme(), (Object) WebKitApi.SCHEME_HTTPS)) {
            z = true;
        } else {
            z = false;
        }
        JSONObject jSONObject = null;
        if (!z) {
            uri2 = null;
        }
        if (uri2 != null) {
            mo79976k().mo80028a(uri2);
            C30365a m = m99273m();
            if (m != null) {
                m.mo79950b(mo79976k().f79898b.mo80027a());
            }
            m99274n().mo23585a(mo80002c());
            long currentTimeMillis = System.currentTimeMillis();
            this.f79883t.put(uri2, Long.valueOf(currentTimeMillis));
            if (!this.f79880q) {
                gVar = this;
            } else {
                gVar = null;
            }
            C30382g gVar2 = gVar;
            if (gVar2 != null) {
                String str = "hybrid_app_monitor_load_url_event";
                C30400r e = gVar2.mo79968e();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("trigger", "navigation_start");
                jSONObject2.put("is_first_screen", "navigation");
                JSONObject jSONObject3 = new JSONObject();
                if (gVar2.f79882s > 0 && gVar2.f79881r > 0) {
                    z2 = true;
                }
                if (z2) {
                    jSONObject = jSONObject3;
                }
                if (jSONObject != null) {
                    jSONObject.put("first_screen_page_load_interval", gVar2.f79882s - gVar2.f79881r);
                }
                jSONObject3.put("event_ts", currentTimeMillis);
                C30370ab.m99240a(gVar2, str, e, jSONObject2, jSONObject3, null, 16, null);
            }
        }
    }

    /* renamed from: a */
    public final void mo79988a(SslError sslError) {
        C30365a m = m99273m();
        if (m != null) {
            m.mo79944a(sslError);
        }
        String str = "hybrid_app_monitor_h5_received_error";
        C30400r e = mo79968e();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("trigger", "on_received_ssl_error");
        if (sslError != null) {
            jSONObject.put("received_primary_error", String.valueOf(sslError.getPrimaryError()));
            jSONObject.put("failing_url", sslError.getUrl());
        }
        C30370ab.m99240a(this, str, e, jSONObject, null, null, 24, null);
    }

    /* renamed from: a */
    public final void mo79992a(WebView webView, int i) {
        C30365a m = m99273m();
        if (m != null) {
            m.mo79942a(i);
        }
        m99274n().mo23586a(webView, i);
    }

    /* renamed from: a */
    public final void mo79986a(int i, String str) {
        C30365a m = m99273m();
        if (m != null) {
            m.mo79943a(i, str);
        }
        String str2 = "hybrid_app_monitor_h5_received_error";
        C30400r e = mo79968e();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("trigger", "on_received_error");
        jSONObject.put("received_error_code", String.valueOf(i));
        if (str != null) {
            jSONObject.put("failing_url", str);
        }
        C30370ab.m99240a(this, str2, e, jSONObject, null, null, 24, null);
    }

    /* renamed from: a */
    private final boolean m99271a(Uri uri, String str) {
        String scheme = uri.getScheme();
        if (scheme != null) {
            Locale locale = Locale.getDefault();
            C7573i.m23582a((Object) locale, "Locale.getDefault()");
            if (scheme != null) {
                String lowerCase = scheme.toLowerCase(locale);
                C7573i.m23582a((Object) lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                if (!C7573i.m23585a((Object) lowerCase, (Object) "file")) {
                    scheme = null;
                }
                if (scheme != null) {
                    C30400r k = mo79976k();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("trigger", str);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("resource_url", String.valueOf(uri));
                    C30370ab.m99240a(this, "hybrid_app_monitor_file_schema_event", k, jSONObject, jSONObject2, null, 16, null);
                    return true;
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008f  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m99272b(android.net.Uri r14, java.lang.String r15) {
        /*
            r13 = this;
            java.lang.String r0 = r14.getScheme()
            r1 = 0
            if (r0 == 0) goto L_0x00bb
            java.util.Locale r2 = java.util.Locale.getDefault()
            java.lang.String r3 = "Locale.getDefault()"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            if (r0 == 0) goto L_0x00b3
            java.lang.String r2 = r0.toLowerCase(r2)
            java.lang.String r3 = "(this as java.lang.String).toLowerCase(locale)"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            java.lang.String r3 = "http"
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r2, r3)
            r4 = 1
            if (r3 != 0) goto L_0x002f
            java.lang.String r3 = "https"
            boolean r2 = kotlin.jvm.internal.C7573i.m23585a(r2, r3)
            if (r2 == 0) goto L_0x002d
            goto L_0x002f
        L_0x002d:
            r2 = 0
            goto L_0x0030
        L_0x002f:
            r2 = 1
        L_0x0030:
            r3 = 0
            if (r2 == 0) goto L_0x0034
            goto L_0x0035
        L_0x0034:
            r0 = r3
        L_0x0035:
            if (r0 == 0) goto L_0x00bb
            com.ss.android.ugc.aweme.hybrid.monitor.t r0 = new com.ss.android.ugc.aweme.hybrid.monitor.t
            java.lang.String r7 = "resource_"
            r8 = 0
            r9 = 0
            r10 = 12
            r11 = 0
            r5 = r0
            r6 = r14
            r5.<init>(r6, r7, r8, r9, r10, r11)
            boolean r2 = r13.m99275o()
            if (r2 == 0) goto L_0x004d
            r2 = r13
            goto L_0x004e
        L_0x004d:
            r2 = r3
        L_0x004e:
            com.ss.android.ugc.aweme.hybrid.monitor.g r2 = (com.p280ss.android.ugc.aweme.hybrid.monitor.C30382g) r2
            if (r2 == 0) goto L_0x00b2
            java.util.List r5 = r13.m99276p()
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x005e
        L_0x005c:
            r1 = 1
            goto L_0x0089
        L_0x005e:
            java.util.List r5 = r13.m99276p()
            java.util.Iterator r5 = r5.iterator()
        L_0x0066:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0089
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = r14.getHost()
            if (r7 == 0) goto L_0x0066
            r8 = r7
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r9 = 2
            boolean r6 = kotlin.text.C7634n.m23776c(r8, r6, false)
            if (r6 == 0) goto L_0x0085
            goto L_0x0086
        L_0x0085:
            r7 = r3
        L_0x0086:
            if (r7 == 0) goto L_0x0066
            goto L_0x005c
        L_0x0089:
            if (r1 == 0) goto L_0x008c
            goto L_0x008d
        L_0x008c:
            r2 = r3
        L_0x008d:
            if (r2 == 0) goto L_0x00b2
            java.lang.String r6 = "hybrid_app_monitor_resource_load_event"
            com.ss.android.ugc.aweme.hybrid.monitor.u r14 = r13.mo79976k()
            r7 = r14
            com.ss.android.ugc.aweme.hybrid.monitor.r r7 = (com.p280ss.android.ugc.aweme.hybrid.monitor.C30400r) r7
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            java.lang.String r14 = "trigger"
            r8.put(r14, r15)
            org.json.JSONObject r14 = r0.getFormatData()
            com.p280ss.android.ugc.aweme.hybrid.monitor.C30377c.m99262a(r8, r14)
            r9 = 0
            r10 = 0
            r11 = 24
            r12 = 0
            r5 = r13
            com.p280ss.android.ugc.aweme.hybrid.monitor.C30370ab.m99240a(r5, r6, r7, r8, r9, r10, r11, r12)
        L_0x00b2:
            return r4
        L_0x00b3:
            kotlin.TypeCastException r14 = new kotlin.TypeCastException
            java.lang.String r15 = "null cannot be cast to non-null type java.lang.String"
            r14.<init>(r15)
            throw r14
        L_0x00bb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.hybrid.monitor.C30382g.m99272b(android.net.Uri, java.lang.String):boolean");
    }

    public C30382g(Uri uri, C30379e eVar, String str, String str2, JSONObject jSONObject) {
        C7573i.m23587b(uri, "uri");
        C7573i.m23587b(eVar, "providerFactory");
        C7573i.m23587b(str, "chromeVersion");
        super(uri, eVar, str, str2);
        this.f79873e = jSONObject;
    }

    /* renamed from: a */
    private final void m99269a(C30400r rVar, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        String str2;
        C9531c n = m99274n();
        WebView c = mo80002c();
        String a = rVar.mo80027a();
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject.put("type", "h5");
        String str3 = "is_fallback";
        if (mo79975j() == null) {
            str2 = "origin";
        } else {
            str2 = "fallback";
        }
        jSONObject.put(str3, str2);
        C30401s j = mo79975j();
        if (j != null) {
            String f = j.mo79969f();
            if (f != null) {
                jSONObject.put("fallback_reason", f);
            }
            String g = j.mo79970g();
            if (g != null) {
                jSONObject.put("fallback_message", g);
            }
        }
        C30377c.m99262a(jSONObject, rVar.getFormatData());
        C30402t l = mo79977l();
        if (l != null) {
            C30377c.m99262a(jSONObject, l.getFormatData());
        }
        String jSONObject4 = jSONObject.toString();
        JSONObject jSONObject5 = new JSONObject();
        if (jSONObject2 != null) {
            C30377c.m99262a(jSONObject5, jSONObject2);
        }
        String jSONObject6 = jSONObject5.toString();
        JSONObject jSONObject7 = new JSONObject();
        if (jSONObject3 != null) {
            C30377c.m99262a(jSONObject7, jSONObject3);
        }
        JSONObject jSONObject8 = this.f79873e;
        if (jSONObject8 != null) {
            C30377c.m99262a(jSONObject7, jSONObject8);
        }
        n.mo23590a(c, a, str, jSONObject4, jSONObject6, jSONObject7.toString(), "0");
        m99274n().mo23594b(mo80002c());
    }
}
