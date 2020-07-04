package com.bytedance.ies.web.p582a;

import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.example.p266a.C6490c;
import com.taobao.android.dexposed.ClassUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.web.a.a */
public class C11087a implements C11094f {

    /* renamed from: a */
    public String f30152a = "_fetchQueue";

    /* renamed from: b */
    public String f30153b = "_handleMessageFromToutiao";

    /* renamed from: c */
    public String f30154c = "javascript:ToutiaoJSBridge";

    /* renamed from: d */
    public WebView f30155d;

    /* renamed from: e */
    public List<String> f30156e;

    /* renamed from: f */
    public List<String> f30157f;

    /* renamed from: g */
    public List<String> f30158g;

    /* renamed from: h */
    private String f30159h;

    /* renamed from: i */
    private Map<String, C11093e> f30160i = new HashMap();

    /* renamed from: j */
    private C11095g f30161j;

    /* renamed from: k */
    private Handler f30162k = new Handler(Looper.getMainLooper()) {
        public final void handleMessage(Message message) {
            if (message.obj instanceof C11097i) {
                C11087a.this.mo27029a((C11097i) message.obj);
            }
        }
    };

    /* renamed from: a */
    public final void mo27030a(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("__msg_type", "callback");
            jSONObject2.put("__callback_id", str);
            if (jSONObject != null) {
                jSONObject2.put("__params", jSONObject);
            }
            m32476a(jSONObject2);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo27031a(String str, String... strArr) {
        StringBuilder sb = new StringBuilder("javascript:");
        sb.append(str);
        sb.append("(");
        if (strArr != null) {
            for (int i = 0; i < strArr.length; i++) {
                sb.append(strArr[0]);
                if (i < strArr.length - 1) {
                    sb.append(",");
                }
            }
        }
        sb.append(")");
        if (this.f30155d != null) {
            C11098j.m32512a(this.f30155d, sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo27029a(C11097i iVar) {
        WebView webView = this.f30155d;
        if (!(webView == null || iVar == null || !TextUtils.equals("call", iVar.f30168a) || this.f30160i == null || this.f30160i.isEmpty())) {
            if (!m32477a(iVar, webView.getUrl())) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("code", -1);
                    mo27030a(iVar.f30169b, jSONObject);
                } catch (JSONException unused) {
                }
            } else {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    C11093e eVar = (C11093e) this.f30160i.get(iVar.f30170c);
                    if (eVar != null) {
                        eVar.call(iVar, jSONObject2);
                    }
                } catch (Exception unused2) {
                }
                if (iVar.f30173f) {
                    mo27030a(iVar.f30169b, jSONObject2);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo27032a(List<String> list, C11097i iVar, JSONObject jSONObject) {
        this.f30158g = list;
        mo27030a(iVar.f30169b, jSONObject);
    }

    /* renamed from: b */
    private void m32478b() {
        if ((this.f30155d instanceof C11090b) && !((C11090b) this.f30155d).f30165a) {
            this.f30155d.setWebChromeClient(new WebChromeClient());
        }
        try {
            this.f30155d.getSettings().setJavaScriptEnabled(true);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo27028a() {
        this.f30155d = null;
        if (this.f30162k != null) {
            this.f30162k.removeCallbacksAndMessages(null);
        }
        this.f30161j = null;
        this.f30160i = null;
    }

    /* renamed from: a */
    public final C11087a mo27024a(C11095g gVar) {
        this.f30161j = gVar;
        return this;
    }

    /* renamed from: b */
    public final C11087a mo27033b(List<String> list) {
        this.f30157f = list;
        return this;
    }

    /* renamed from: c */
    public final C11087a mo27036c(List<String> list) {
        this.f30158g = list;
        return this;
    }

    /* renamed from: a */
    public static C11087a m32475a(WebView webView) {
        return new C11087a(webView);
    }

    /* renamed from: f */
    private void m32479f(String str) {
        try {
            m32480g(new String(Base64.decode(str, 2)));
        } catch (Exception unused) {
        }
    }

    /* renamed from: h */
    private boolean m32481h(String str) {
        if (this.f30157f == null || !this.f30157f.contains(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    private boolean m32482i(String str) {
        if (this.f30158g == null || !this.f30158g.contains(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final C11087a mo27022a(WebChromeClient webChromeClient) {
        if (this.f30155d != null) {
            this.f30155d.setWebChromeClient(webChromeClient);
        }
        return this;
    }

    /* renamed from: j */
    private static boolean m32483j(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.startsWith("http://") || str.startsWith("https://")) {
            return true;
        }
        return false;
    }

    private C11087a(WebView webView) {
        this.f30155d = webView;
        if (this.f30155d != null) {
            m32478b();
        }
    }

    /* renamed from: a */
    private void m32476a(JSONObject jSONObject) {
        WebView webView = this.f30155d;
        if (webView != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f30154c);
            sb.append(ClassUtils.PACKAGE_SEPARATOR);
            sb.append(this.f30153b);
            sb.append("(");
            sb.append(jSONObject.toString());
            sb.append(")");
            C11098j.m32512a(webView, sb.toString());
        }
    }

    /* renamed from: d */
    public final void mo27038d(String str) {
        try {
            StringBuilder sb = new StringBuilder("{a=");
            sb.append(str);
            sb.append("}");
            m32480g(new JSONObject(sb.toString()).optString("a", ""));
        } catch (JSONException unused) {
        }
    }

    /* renamed from: g */
    private void m32480g(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                C11097i iVar = new C11097i();
                iVar.f30168a = jSONObject.getString("__msg_type");
                String str2 = null;
                iVar.f30169b = jSONObject.optString("__callback_id", null);
                iVar.f30170c = jSONObject.optString("func");
                iVar.f30171d = jSONObject.optJSONObject("params");
                iVar.f30172e = jSONObject.optInt("JSSDK");
                if (!TextUtils.isEmpty(iVar.f30168a) && !TextUtils.isEmpty(iVar.f30170c)) {
                    if (this.f30161j == null || !this.f30161j.mo27072a(iVar)) {
                        Message obtain = Message.obtain();
                        obtain.obj = iVar;
                        this.f30162k.sendMessage(obtain);
                    } else {
                        JSONObject jSONObject2 = new JSONObject();
                        WebView webView = this.f30155d;
                        if (webView != null) {
                            str2 = webView.getUrl();
                        }
                        this.f30161j.mo27071a(iVar, jSONObject2, str2, this);
                        return;
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final C11087a mo27023a(WebViewClient webViewClient) {
        if (this.f30155d == null) {
            return this;
        }
        if (webViewClient instanceof C11092d) {
            ((C11092d) webViewClient).f30167b = this;
        }
        this.f30155d.setWebViewClient(C6490c.m20171a(webViewClient));
        return this;
    }

    /* renamed from: e */
    public final boolean mo27039e(String str) {
        if (!m32483j(str)) {
            return false;
        }
        try {
            String a = C11104m.m32517a(str);
            if (!(a == null || this.f30156e == null)) {
                if (!this.f30156e.isEmpty()) {
                    int i = 0;
                    while (i < this.f30156e.size()) {
                        String str2 = (String) this.f30156e.get(i);
                        if (!a.equals(str2)) {
                            StringBuilder sb = new StringBuilder(ClassUtils.PACKAGE_SEPARATOR);
                            sb.append(str2);
                            if (!a.endsWith(sb.toString())) {
                                i++;
                            }
                        }
                        return true;
                    }
                    return false;
                }
            }
            return false;
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final C11087a mo27025a(String str) {
        this.f30159h = str;
        return this;
    }

    /* renamed from: b */
    public final boolean mo27035b(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(this.f30159h)) {
            return false;
        }
        if (!this.f30159h.equals(Uri.parse(str).getScheme().toLowerCase()) || !mo27037c(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final boolean mo27037c(String str) {
        if (str == null || !str.startsWith(this.f30159h)) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f30159h);
        sb.append("://dispatch_message/");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f30159h);
        sb3.append("://private/setresult/");
        String sb4 = sb3.toString();
        try {
            if (str.equals(sb2)) {
                WebView webView = this.f30155d;
                if (webView != null) {
                    if (VERSION.SDK_INT >= 19) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(this.f30154c);
                        sb5.append(ClassUtils.PACKAGE_SEPARATOR);
                        sb5.append(this.f30152a);
                        sb5.append("()");
                        webView.evaluateJavascript(sb5.toString(), new ValueCallback<String>() {
                            /* access modifiers changed from: private */
                            /* renamed from: a */
                            public void onReceiveValue(String str) {
                                C11087a.this.mo27038d(str);
                            }
                        });
                    } else {
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(this.f30154c);
                        sb6.append(ClassUtils.PACKAGE_SEPARATOR);
                        sb6.append(this.f30152a);
                        sb6.append("()");
                        C11098j.m32512a(webView, sb6.toString());
                    }
                }
                return true;
            }
            if (str.startsWith(sb4)) {
                if (VERSION.SDK_INT < 19) {
                    int length = sb4.length();
                    int indexOf = str.indexOf(38, length);
                    if (indexOf > 0) {
                        String substring = str.substring(length, indexOf);
                        String substring2 = str.substring(indexOf + 1);
                        if (substring.equals("SCENE_FETCHQUEUE") && substring2.length() > 0) {
                            m32479f(substring2);
                        }
                    }
                }
                return true;
            }
            return false;
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final C11087a mo27027a(List<String> list) {
        this.f30156e = list;
        return this;
    }

    /* renamed from: a */
    private boolean m32477a(C11097i iVar, String str) {
        if (mo27039e(str) || m32481h(iVar.f30170c) || m32482i(iVar.f30170c)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo27034b(String str, JSONObject jSONObject) {
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("__msg_type", "event");
                jSONObject2.put("__event_id", str);
                if (jSONObject != null) {
                    jSONObject2.put("__params", jSONObject);
                }
                m32476a(jSONObject2);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final C11087a mo27026a(String str, C11093e eVar) {
        if (TextUtils.isEmpty(str) || eVar == null) {
            return this;
        }
        this.f30160i.put(str, eVar);
        return this;
    }
}
