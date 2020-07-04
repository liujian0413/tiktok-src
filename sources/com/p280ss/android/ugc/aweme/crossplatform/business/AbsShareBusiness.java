package com.p280ss.android.ugc.aweme.crossplatform.business;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.common.collect.C17795bu;
import com.google.gson.C6600e;
import com.google.gson.p277b.C6597a;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.crossplatform.C25870d.C25871a;
import com.p280ss.android.ugc.aweme.crossplatform.business.BusinessService.Business;
import com.p280ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.p280ss.android.ugc.aweme.hybrid.monitor.C30388i;
import com.p280ss.android.ugc.aweme.hybrid.monitor.C30391k;
import com.p280ss.android.ugc.aweme.hybrid.monitor.C30398q;
import com.p280ss.android.ugc.aweme.share.improve.pkg.WebSharePackage;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p346io.reactivex.p1865a.p1867b.C47549a;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.business.AbsShareBusiness */
abstract class AbsShareBusiness extends Business {

    /* renamed from: a */
    WebSharePackage f68314a;

    /* renamed from: b */
    List<String> f68315b = C17795bu.m59146a((E[]) new String[]{"copylink", "qrcode", "browser", "refresh"});

    /* renamed from: c */
    String f68316c = this.f68330i.f68473a.f68430c;

    /* renamed from: d */
    String f68317d;

    /* renamed from: e */
    String f68318e;

    /* renamed from: f */
    public WebView f68319f;

    /* renamed from: k */
    private C25840a f68320k;

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.business.AbsShareBusiness$a */
    final class C25840a {
        private C25840a() {
        }

        /* renamed from: a */
        private void m84985a(String str) {
            C30398q qVar;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("title", str);
            } catch (JSONException unused) {
            }
            if (AbsShareBusiness.this.f68319f != null && (AbsShareBusiness.this.f68319f instanceof SingleWebView)) {
                C30388i monitorSession = ((SingleWebView) AbsShareBusiness.this.f68319f).getMonitorSession();
                if (monitorSession != null) {
                    qVar = (C30391k) monitorSession.mo80008a(C30391k.class);
                } else {
                    qVar = null;
                }
                C25871a.m85133a().mo67244a(qVar, "webview_safe_log", "abs_share_business_jsb", jSONObject);
                AbsShareBusiness.this.f68319f = null;
            }
        }

        @JavascriptInterface
        public final void showSource(String str, String str2) {
            m84985a(str);
            JSONObject jSONObject = null;
            try {
                if (!TextUtils.isEmpty(str2)) {
                    jSONObject = new JSONObject(str2);
                }
            } catch (JSONException unused) {
            }
            AbsShareBusiness.this.mo67159a(str, jSONObject);
        }
    }

    /* renamed from: d */
    private static String m84976d() {
        return "javascript: function getMetaContent(name) {            var item = document.getElementsByTagName('meta')[name];            if (item != null) {            return item.getAttribute('content');}            else {return null}        }        function getAwemeMetaDatas() {        var aweme = new Object();        aweme.title = getMetaContent('aweme:title');        aweme.desc = getMetaContent('aweme:description');        aweme.image = getMetaContent('aweme:image');        aweme.url = getMetaContent('aweme:url');        aweme.innerUrl = getMetaContent('aweme:innerUrl');        aweme.qrcode = getMetaContent('aweme:qrcode');        aweme.shareitems = getMetaContent('aweme:shareitems');        aweme.sharetips = getMetaContent('aweme:share:tips');        return JSON.stringify(aweme);        }        window.local_obj.showSource(window.__title__, getAwemeMetaDatas());";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo67161b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo67160a() {
        return this.f68328g.mo65882h();
    }

    /* renamed from: c */
    public void mo67164c() {
        C47549a.m148327a().mo19335a(new C25853a(this));
    }

    /* renamed from: a */
    public void mo67158a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f68314a = null;
            this.f68316c = str;
        }
    }

    /* renamed from: b */
    public void mo67162b(WebView webView) {
        if (webView != null) {
            this.f68319f = webView;
            C25855b.m85089a(this.f68319f, m84976d());
        }
    }

    AbsShareBusiness(C25856c cVar) {
        super(cVar);
    }

    /* renamed from: a */
    private void m84975a(JSONObject jSONObject) {
        String a = m84974a(jSONObject, "shareitems");
        if (a != null) {
            List list = (List) new C6600e().mo15975a(a, new C6597a<List<String>>() {
            }.type);
            if (list != null) {
                this.f68315b.clear();
                this.f68315b.addAll(list);
            }
        }
    }

    /* renamed from: a */
    public void mo67157a(WebView webView) {
        if (webView != null) {
            if (this.f68320k == null) {
                this.f68320k = new C25840a();
            }
            webView.getSettings().setJavaScriptEnabled(true);
            webView.addJavascriptInterface(this.f68320k, "local_obj");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo67163b(String str) {
        String str2;
        String str3;
        String str4;
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", "h5_page");
        hashMap.put("platform", str);
        hashMap.put("previous_page", this.f68330i.f68473a.f68433f);
        String str5 = "group_id";
        if (TextUtils.isEmpty(this.f68330i.f68473a.f68432e)) {
            str2 = "";
        } else {
            str2 = this.f68330i.f68473a.f68432e;
        }
        hashMap.put(str5, str2);
        String str6 = "webview_type";
        if (TextUtils.isEmpty(this.f68330i.f68473a.f68432e)) {
            str3 = "";
        } else {
            str3 = "article";
        }
        hashMap.put(str6, str3);
        String str7 = "url";
        if (this.f68314a == null || TextUtils.isEmpty(this.f68314a.f20185k)) {
            str4 = this.f68316c;
        } else {
            str4 = this.f68314a.f20185k;
        }
        hashMap.put(str7, str4);
        C6907h.m21524a("h5_share", (Map) hashMap);
    }

    /* renamed from: a */
    private static String m84974a(JSONObject jSONObject, String str) {
        String optString = jSONObject.optString(str);
        if (optString == null || TextUtils.equals(optString, TEVideoRecorder.FACE_BEAUTY_NULL)) {
            return null;
        }
        return optString;
    }

    /* renamed from: a */
    public final void mo67159a(String str, JSONObject jSONObject) {
        this.f68314a = WebSharePackage.m122139a(this.f68331j, str, jSONObject, this.f68316c, this.f68328g);
        String a = m84974a(jSONObject, "qrcode");
        this.f68318e = m84974a(jSONObject, "sharetips");
        if (TextUtils.isEmpty(a) || (!TextUtils.equals("1", a) && !TextUtils.equals(a, "true"))) {
            this.f68315b.remove("qrcode");
        }
        this.f68317d = m84974a(jSONObject, "innerUrl");
        String str2 = this.f68314a.f20185k;
        if (!TextUtils.isEmpty(this.f68317d)) {
            str2 = this.f68317d;
        } else if (!TextUtils.isEmpty(this.f68316c)) {
            str2 = this.f68316c;
        }
        if (!TextUtils.equals(str2, this.f68314a.f20185k)) {
            this.f68314a.f20186l.putString("url_for_im_share", str2);
        }
        m84975a(jSONObject);
        mo67164c();
    }
}
