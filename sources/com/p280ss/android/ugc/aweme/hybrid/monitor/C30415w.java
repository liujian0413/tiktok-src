package com.p280ss.android.ugc.aweme.hybrid.monitor;

import android.net.Uri;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.android.monitor.webview.C9529a;
import com.bytedance.android.monitor.webview.C9531c;
import com.bytedance.android.monitor.webview.C9531c.C9532a;
import com.bytedance.android.monitor.webview.C9533d;
import com.bytedance.android.monitor.webview.C9535f;
import com.bytedance.android.monitor.webview.C9541j;
import com.p280ss.android.ugc.aweme.hybrid.monitor.utils.C30408d;
import com.p280ss.android.ugc.aweme.hybrid.monitor.utils.FetcherType;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.LazyThreadSafetyMode;
import kotlin.TypeCastException;
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

/* renamed from: com.ss.android.ugc.aweme.hybrid.monitor.w */
public final class C30415w extends C30370ab implements C30395o {

    /* renamed from: d */
    static final /* synthetic */ C7595j[] f79925d = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C30415w.class), "monitorHelper", "getMonitorHelper()Lcom/bytedance/android/monitor/webview/ITTLiveWebViewMonitorHelper;"))};

    /* renamed from: e */
    public final JSONObject f79926e;

    /* renamed from: k */
    private final C7541d f79927k = C7546e.m23568a(LazyThreadSafetyMode.NONE, new C30416a(this));

    /* renamed from: l */
    private String f79928l;

    /* renamed from: m */
    private long f79929m;

    /* renamed from: n */
    private long f79930n;

    /* renamed from: o */
    private long f79931o;

    /* renamed from: p */
    private long f79932p;

    /* renamed from: q */
    private long f79933q;

    /* renamed from: r */
    private long f79934r;

    /* renamed from: s */
    private long f79935s;

    /* renamed from: t */
    private long f79936t;

    /* renamed from: com.ss.android.ugc.aweme.hybrid.monitor.w$a */
    static final class C30416a extends Lambda implements C7561a<C9531c> {

        /* renamed from: a */
        final /* synthetic */ C30415w f79937a;

        /* renamed from: com.ss.android.ugc.aweme.hybrid.monitor.w$a$a */
        static final /* synthetic */ class C30417a extends FunctionReference implements C48007r<String, Integer, JSONObject, JSONObject, C7581n> {
            C30417a(C30415w wVar) {
                super(4, wVar);
            }

            public final String getName() {
                return "monitorStatusAndDuration";
            }

            public final C7585d getOwner() {
                return C7575l.m23595a(C30415w.class);
            }

            public final String getSignature() {
                return "monitorStatusAndDuration(Ljava/lang/String;Ljava/lang/Integer;Lorg/json/JSONObject;Lorg/json/JSONObject;)V";
            }

            /* renamed from: a */
            private void m99399a(String str, Integer num, JSONObject jSONObject, JSONObject jSONObject2) {
                ((C30415w) this.receiver).mo79967a(str, num, jSONObject, jSONObject2);
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                m99399a((String) obj, (Integer) obj2, (JSONObject) obj3, (JSONObject) obj4);
                return C7581n.f20898a;
            }
        }

        C30416a(C30415w wVar) {
            this.f79937a = wVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C9531c invoke() {
            C9531c b = C9541j.m28227b();
            C9532a a = b.mo23584a();
            a.mo23605b("HybridMonitor");
            a.mo23608d("douyin");
            a.mo23601a((C9533d) C9535f.m28156a());
            a.mo23600a((C9529a) new C30418x(new C30417a(this.f79937a)));
            b.mo23598c(a);
            return b;
        }
    }

    /* renamed from: d */
    private C9531c m99383d() {
        return (C9531c) this.f79927k.getValue();
    }

    /* renamed from: a */
    public final void mo80022a(boolean z) {
        this.f79934r = System.currentTimeMillis();
        String str = "hybrid_app_monitor_load_url_event";
        C30400r e = mo79968e();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("trigger", "prepare_rn_end");
        jSONObject.put("is_first_screen", "first_screen");
        jSONObject.put("is_reuse", String.valueOf(z));
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = (this.f79932p > 0 ? 1 : (this.f79932p == 0 ? 0 : -1)) > 0 && (this.f79931o > 0 ? 1 : (this.f79931o == 0 ? 0 : -1)) > 0 ? jSONObject2 : null;
        if (jSONObject3 != null) {
            jSONObject3.put("dynamic_update_interval", this.f79932p - this.f79931o);
        }
        jSONObject2.put("prepare_rn_interval", this.f79934r - this.f79933q);
        jSONObject2.put("event_ts", this.f79934r);
        C30370ab.m99240a(this, str, e, jSONObject, jSONObject2, null, 16, null);
    }

    /* renamed from: a */
    public final void mo80021a(JSONObject jSONObject) {
        this.f79935s = System.currentTimeMillis();
        String str = "hybrid_app_monitor_load_url_event";
        C30400r e = mo79968e();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("trigger", "on_load");
        jSONObject2.put("is_first_screen", "first_screen");
        JSONObject jSONObject3 = new JSONObject();
        boolean z = true;
        JSONObject jSONObject4 = null;
        JSONObject jSONObject5 = (this.f79932p > 0 ? 1 : (this.f79932p == 0 ? 0 : -1)) > 0 && (this.f79931o > 0 ? 1 : (this.f79931o == 0 ? 0 : -1)) > 0 ? jSONObject3 : null;
        if (jSONObject5 != null) {
            jSONObject5.put("dynamic_update_interval", this.f79932p - this.f79931o);
        }
        JSONObject jSONObject6 = (this.f79934r > 0 ? 1 : (this.f79934r == 0 ? 0 : -1)) > 0 && (this.f79933q > 0 ? 1 : (this.f79933q == 0 ? 0 : -1)) > 0 ? jSONObject3 : null;
        if (jSONObject6 != null) {
            jSONObject6.put("prepare_rn_interval", this.f79934r - this.f79933q);
        }
        JSONObject jSONObject7 = (this.f79935s > 0 ? 1 : (this.f79935s == 0 ? 0 : -1)) > 0 && (this.f79934r > 0 ? 1 : (this.f79934r == 0 ? 0 : -1)) > 0 ? jSONObject3 : null;
        if (jSONObject7 != null) {
            jSONObject7.put("load_interval", this.f79935s - this.f79934r);
        }
        if (this.f79935s <= 0 || this.f79929m <= 0) {
            z = false;
        }
        if (z) {
            jSONObject4 = jSONObject3;
        }
        if (jSONObject4 != null) {
            jSONObject4.put("page_load_interval", this.f79935s - this.f79929m);
        }
        jSONObject3.put("event_ts", this.f79935s);
        C30370ab.m99240a(this, str, e, jSONObject2, jSONObject3, null, 16, null);
    }

    public final void aX_() {
        this.f79931o = System.currentTimeMillis();
        C30400r e = mo79968e();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("trigger", "dynamic_update_start");
        jSONObject.put("is_first_screen", "first_screen");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("event_ts", this.f79931o);
        C30370ab.m99240a(this, "hybrid_app_monitor_load_url_event", e, jSONObject, jSONObject2, null, 16, null);
    }

    /* renamed from: m */
    private final String m99384m() {
        String str;
        if (this.f79935s > 0) {
            return "page_finish";
        }
        if (this.f79928l != null) {
            str = this.f79928l;
            if (str == null) {
                C7573i.m23580a();
                return str;
            }
        } else if (this.f79934r > 0) {
            return "prepare_rn_end";
        } else {
            if (this.f79933q > 0) {
                return "prepare_rn_start";
            }
            if (this.f79932p > 0) {
                return "dynamic_update_end";
            }
            if (this.f79931o > 0) {
                return "dynamic_update_start";
            }
            if (this.f79929m > 0) {
                return "load_url";
            }
            if (this.f79930n > 0) {
                return "attach_window";
            }
            str = "none";
        }
        return str;
    }

    public final void aY_() {
        this.f79932p = System.currentTimeMillis();
        C30400r e = mo79968e();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("trigger", "dynamic_update_end");
        jSONObject.put("is_first_screen", "first_screen");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("dynamic_update_interval", this.f79932p - this.f79931o);
        jSONObject2.put("event_ts", this.f79932p);
        C30370ab.m99240a(this, "hybrid_app_monitor_load_url_event", e, jSONObject, jSONObject2, null, 16, null);
    }

    /* renamed from: c */
    public final void mo80026c() {
        boolean z;
        JSONObject jSONObject;
        this.f79933q = System.currentTimeMillis();
        String str = "hybrid_app_monitor_load_url_event";
        C30400r e = mo79968e();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("trigger", "prepare_rn_start");
        jSONObject2.put("is_first_screen", "first_screen");
        JSONObject jSONObject3 = new JSONObject();
        if (this.f79932p <= 0 || this.f79931o <= 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            jSONObject = jSONObject3;
        } else {
            jSONObject = null;
        }
        if (jSONObject != null) {
            jSONObject.put("dynamic_update_interval", this.f79932p - this.f79931o);
        }
        jSONObject3.put("event_ts", this.f79933q);
        C30370ab.m99240a(this, str, e, jSONObject2, jSONObject3, null, 16, null);
    }

    /* renamed from: a */
    public final void mo79989a(View view) {
        this.f79930n = System.currentTimeMillis();
    }

    /* renamed from: b */
    public final void mo80025b(JSONObject jSONObject) {
        C7573i.m23587b(jSONObject, "obj");
        String str = "hybrid_app_monitor_rn_js_exception";
        C30400r e = mo79968e();
        JSONObject jSONObject2 = new JSONObject();
        String str2 = "channel_name";
        String authority = this.f79851g.getAuthority();
        if (authority == null) {
            authority = "none";
        }
        jSONObject2.put(str2, authority);
        String str3 = "module_name";
        String lastPathSegment = this.f79851g.getLastPathSegment();
        if (lastPathSegment == null) {
            lastPathSegment = "none";
        }
        jSONObject2.put(str3, lastPathSegment);
        C30377c.m99262a(jSONObject2, jSONObject);
        C30370ab.m99240a(this, str, e, jSONObject2, null, null, 24, null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0093  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo80000b(android.view.View r13) {
        /*
            r12 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r12.f79936t = r0
            com.ss.android.ugc.aweme.hybrid.monitor.m r0 = r12.mo79972h()
            r1 = 0
            if (r0 == 0) goto L_0x0038
            boolean r0 = r0.mo80014d()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r2 = r0.booleanValue()
            if (r2 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r0 = r1
        L_0x001d:
            if (r0 == 0) goto L_0x0038
            r0.booleanValue()
            long r0 = java.lang.System.currentTimeMillis()
            boolean r13 = com.p280ss.android.ugc.aweme.hybrid.monitor.utils.C30404a.m99372a(r13)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r0
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            goto L_0x0039
        L_0x0038:
            r13 = r1
        L_0x0039:
            java.lang.String r3 = "hybrid_app_monitor_rn_blank_screen"
            com.ss.android.ugc.aweme.hybrid.monitor.u r0 = r12.mo79976k()
            r4 = r0
            com.ss.android.ugc.aweme.hybrid.monitor.r r4 = (com.p280ss.android.ugc.aweme.hybrid.monitor.C30400r) r4
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            if (r13 == 0) goto L_0x0056
            boolean r13 = r13.booleanValue()
            java.lang.String r0 = "isBlank"
            java.lang.String r13 = java.lang.String.valueOf(r13)
            r5.put(r0, r13)
        L_0x0056:
            java.lang.String r13 = "pageFinish"
            long r6 = r12.f79935s
            r8 = 0
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0063
            java.lang.String r0 = "true"
            goto L_0x0065
        L_0x0063:
            java.lang.String r0 = "false"
        L_0x0065:
            r5.put(r13, r0)
            java.lang.String r13 = "trigger"
            java.lang.String r0 = r12.m99384m()
            r5.put(r13, r0)
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            if (r1 == 0) goto L_0x0083
            java.lang.Number r1 = (java.lang.Number) r1
            long r0 = r1.longValue()
            java.lang.String r13 = "detectDuration"
            r6.put(r13, r0)
        L_0x0083:
            java.lang.String r13 = "loadUrlToAttachedWindow"
            long r0 = r12.f79930n
            long r10 = r12.f79929m
            long r0 = r0 - r10
            r6.put(r13, r0)
            long r0 = r12.f79935s
            int r13 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r13 <= 0) goto L_0x009d
            java.lang.String r13 = "loadUrlToPageFinish"
            long r0 = r12.f79935s
            long r7 = r12.f79929m
            long r0 = r0 - r7
            r6.put(r13, r0)
        L_0x009d:
            java.lang.String r13 = "attachedWindowToDetachWindow"
            long r0 = r12.f79936t
            long r7 = r12.f79930n
            long r0 = r0 - r7
            r6.put(r13, r0)
            java.lang.String r13 = "loadUrlToDetachWindow"
            long r0 = r12.f79936t
            long r7 = r12.f79929m
            long r0 = r0 - r7
            r6.put(r13, r0)
            r7 = 0
            r8 = 16
            r9 = 0
            r2 = r12
            com.p280ss.android.ugc.aweme.hybrid.monitor.C30370ab.m99240a(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.hybrid.monitor.C30415w.mo80000b(android.view.View):void");
    }

    /* renamed from: a */
    public final void mo80020a(String str, String str2) {
        C7573i.m23587b(str, "reason");
        mo79971g(str);
        mo79973h(str2);
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
    public final void mo80018a(Exception exc, String str) {
        boolean z;
        C30392l i = mo79974i();
        if (i != null) {
            if (exc != null) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                i = null;
            }
            if (i != null) {
                String authority = this.f79851g.getAuthority();
                if (authority == null) {
                    authority = "none";
                }
                String lastPathSegment = this.f79851g.getLastPathSegment();
                if (lastPathSegment == null) {
                    lastPathSegment = "none";
                }
                if (str == null) {
                    str = "none";
                }
                StringBuilder sb = new StringBuilder("hybrid_rn_exception|");
                sb.append(authority);
                sb.append("|");
                sb.append(lastPathSegment);
                sb.append("|");
                sb.append(str);
                String sb2 = sb.toString();
                Map linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("channel", authority);
                linkedHashMap.put("module_name", lastPathSegment);
                linkedHashMap.put("exception_type", str);
                if (exc != null) {
                    i.mo80010a(exc, sb2, linkedHashMap);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Exception /* = java.lang.Exception */");
            }
        }
    }

    /* renamed from: a */
    public final void mo79939a(String str, boolean z) {
        C7573i.m23587b(str, "id");
        super.mo79939a(str, z);
        this.f79929m = System.currentTimeMillis();
        C30400r e = mo79968e();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("trigger", "load_url");
        C30370ab.m99240a(this, "hybrid_app_monitor_load_url_event", e, jSONObject, null, null, 24, null);
    }

    /* renamed from: a */
    public final void mo80019a(String str, long j, Map<String, Long> map) {
        C7573i.m23587b(str, "event");
        C7573i.m23587b(map, "eventsMap");
        this.f79928l = str;
        C30400r e = mo79968e();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("trigger", str);
        C30370ab.m99240a(this, "hybrid_app_monitor_rn_timeline_event", e, jSONObject, C30408d.f79911a.mo80035a(str, new JSONObject(map), FetcherType.RN_TIMING), null, 16, null);
    }

    /* renamed from: a */
    public final void mo79966a(String str, C30400r rVar, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        C7573i.m23587b(str, "eventName");
        C7573i.m23587b(rVar, "identifier");
        try {
            m99382a(rVar, str, jSONObject, jSONObject2, jSONObject3);
        } catch (Exception e) {
            mo79965a(e, rVar.mo80027a(), "rn");
        }
    }

    public C30415w(Uri uri, C30379e eVar, String str, String str2, JSONObject jSONObject) {
        C7573i.m23587b(uri, "uri");
        C7573i.m23587b(eVar, "providerFactory");
        C7573i.m23587b(str, "chromeVersion");
        super(uri, eVar, str, str2);
        this.f79926e = jSONObject;
    }

    /* renamed from: a */
    private final void m99382a(C30400r rVar, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        String str2;
        C9531c d = m99383d();
        String a = rVar.mo80027a();
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject.put("type", "rn");
        String str3 = "is_fallback";
        if (mo79975j() == null) {
            str2 = "origin";
        } else {
            str2 = "fallback";
        }
        jSONObject.put(str3, str2);
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
        JSONObject jSONObject8 = this.f79926e;
        if (jSONObject8 != null) {
            C30377c.m99262a(jSONObject7, jSONObject8);
        }
        d.mo23590a(null, a, str, jSONObject4, jSONObject6, jSONObject7.toString(), "0");
        m99383d().mo23594b((WebView) null);
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
}
