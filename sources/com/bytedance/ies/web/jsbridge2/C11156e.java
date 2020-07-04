package com.bytedance.ies.web.jsbridge2;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.web.jsbridge2.e */
public final class C11156e {

    /* renamed from: a */
    public WebView f30271a;

    /* renamed from: b */
    public C11160g f30272b = this.f30323c;

    /* renamed from: c */
    public volatile boolean f30273c = false;

    /* renamed from: d */
    private String f30274d;

    /* renamed from: e */
    private Context f30275e;

    /* renamed from: f */
    private Handler f30276f = new Handler(Looper.getMainLooper());

    /* renamed from: g */
    private C11169m f30277g;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo27164a() {
        this.f30271a.removeJavascriptInterface(this.f30274d);
        this.f30276f.removeCallbacksAndMessages(null);
        this.f30272b = null;
        this.f30271a = null;
        this.f30275e = null;
        this.f30273c = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo27167a(final JSONObject jSONObject) {
        if (!this.f30273c) {
            this.f30276f.post(new Runnable() {
                public final void run() {
                    if (!C11156e.this.f30273c) {
                        C11171o b = C11156e.this.mo27168b(jSONObject);
                        if (C11171o.m32704a(b)) {
                            new StringBuilder("By pass invalid call: ").append(b);
                            if (b != null) {
                                C11156e.this.mo27166a(b.f30314f, C11192v.m32756a((Throwable) new C11177r(b.f30309a, "Failed to parse invocation.")));
                            }
                            return;
                        }
                        C11156e.this.mo27165a(b);
                    }
                }
            });
        }
    }

    @JavascriptInterface
    public final void invokeMethod(String str) {
        if (!this.f30273c) {
            new StringBuilder("Received call: ").append(str);
            try {
                mo27167a(new JSONObject(str));
            } catch (JSONException unused) {
            }
        }
    }

    C11156e(C11166j jVar) {
        this.f30271a = jVar.f30300a;
        this.f30274d = jVar.f30301b;
        if (jVar.f30303d != null) {
            this.f30275e = jVar.f30303d;
        } else {
            this.f30275e = this.f30271a.getContext();
        }
        this.f30277g = jVar.f30307h;
        if (VERSION.SDK_INT >= 17) {
            this.f30271a.addJavascriptInterface(this, this.f30274d);
        }
    }

    /* renamed from: a */
    private void m32655a(String str) {
        if (!this.f30273c) {
            if (str == null) {
                str = "";
            }
            StringBuilder sb = new StringBuilder("javascript:");
            sb.append(this.f30274d);
            sb.append("._handleMessageFromToutiao(");
            sb.append(str);
            sb.append(")");
            final String sb2 = sb.toString();
            C111582 r0 = new Runnable() {
                public final void run() {
                    if (!C11156e.this.f30273c) {
                        if (VERSION.SDK_INT >= 19) {
                            new StringBuilder("Invoking Jsb using evaluateJavascript: ").append(sb2);
                            C11156e.this.f30271a.evaluateJavascript(sb2, null);
                            return;
                        }
                        new StringBuilder("Invoking Jsb using loadUrl: ").append(sb2);
                        C11159f.m32662a(C11156e.this.f30271a, sb2);
                    }
                }
            };
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new StringBuilder("Received call on sub-thread, posting to main thread: ").append(sb2);
                this.f30276f.post(r0);
                return;
            }
            r0.run();
        }
    }

    /* renamed from: b */
    public final C11171o mo27168b(JSONObject jSONObject) {
        if (this.f30273c) {
            return null;
        }
        String optString = jSONObject.optString("__callback_id");
        String optString2 = jSONObject.optString("func");
        String url = this.f30271a.getUrl();
        if (url == null) {
            if (this.f30277g != null) {
                this.f30277g.mo27193a(null, null, 3);
            }
            return null;
        }
        try {
            String string = jSONObject.getString("__msg_type");
            return C11171o.m32702a().mo27196a(jSONObject.getString("JSSDK")).mo27198b(string).mo27199c(optString2).mo27200d(jSONObject.getString("params")).mo27201e(optString).mo27197a();
        } catch (JSONException unused) {
            if (this.f30277g != null) {
                this.f30277g.mo27193a(url, optString2, 1);
            }
            return C11171o.m32703a(optString, -1);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo27165a(C11171o oVar) {
        if (!this.f30273c) {
            String url = this.f30271a.getUrl();
            if (url != null) {
                CallContext callContext = new CallContext();
                callContext.f30266b = url;
                callContext.f30265a = this.f30275e;
                callContext.f30267c = this.f30272b;
                try {
                    C11163a a = this.f30272b.mo27173a(oVar, callContext);
                    if (a == null) {
                        new StringBuilder("Received call but not registered, ").append(oVar);
                        if (this.f30277g != null) {
                            this.f30277g.mo27193a(this.f30271a.getUrl(), oVar.f30312d, 2);
                        }
                        String str = oVar.f30314f;
                        StringBuilder sb = new StringBuilder("Function ");
                        sb.append(oVar.f30312d);
                        sb.append("is not registered.");
                        mo27166a(str, C11192v.m32756a((Throwable) new C11177r(-2, sb.toString())));
                        return;
                    }
                    if (a.f30296a) {
                        mo27166a(oVar.f30314f, a.f30297b);
                    }
                    if (this.f30277g != null) {
                        this.f30277g.mo27192a(this.f30271a.getUrl(), oVar.f30312d);
                    }
                } catch (Exception e) {
                    new StringBuilder("call finished with error, ").append(oVar);
                    mo27166a(oVar.f30314f, C11192v.m32756a((Throwable) e));
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo27169b(String str, String str2) {
        if (!this.f30273c) {
            new StringBuilder("Sending js event: ").append(str);
            StringBuilder sb = new StringBuilder("{\"__msg_type\":\"event\",\"__event_id\":\"");
            sb.append(str);
            sb.append("\",\"__params\":");
            sb.append(str2);
            sb.append("}");
            m32655a(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo27166a(String str, String str2) {
        if (!this.f30273c) {
            if (TextUtils.isEmpty(str)) {
                new StringBuilder("By passing js callback due to empty callback: ").append(str2);
                return;
            }
            if (!str2.startsWith("{") || !str2.endsWith("}")) {
                StringBuilder sb = new StringBuilder("Illegal callback data: ");
                sb.append(str2);
                C11165i.m32683a((RuntimeException) new IllegalArgumentException(sb.toString()));
            }
            new StringBuilder("Invoking js callback: ").append(str);
            StringBuilder sb2 = new StringBuilder("{\"__msg_type\":\"callback\",\"__callback_id\":\"");
            sb2.append(str);
            sb2.append("\",\"__params\":");
            sb2.append(str2);
            sb2.append("}");
            m32655a(sb2.toString());
        }
    }
}
