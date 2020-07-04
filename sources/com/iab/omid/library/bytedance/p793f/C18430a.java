package com.iab.omid.library.bytedance.p793f;

import android.webkit.WebView;
import com.iab.omid.library.bytedance.adsession.C18397a;
import com.iab.omid.library.bytedance.adsession.C18399c;
import com.iab.omid.library.bytedance.adsession.C18400d;
import com.iab.omid.library.bytedance.adsession.C18402f;
import com.iab.omid.library.bytedance.adsession.C18403g;
import com.iab.omid.library.bytedance.adsession.video.C18405b;
import com.iab.omid.library.bytedance.p789b.C18411c;
import com.iab.omid.library.bytedance.p789b.C18412d;
import com.iab.omid.library.bytedance.p791d.C18422a;
import com.iab.omid.library.bytedance.p791d.C18423b;
import com.iab.omid.library.bytedance.p791d.C18425c;
import com.iab.omid.library.bytedance.p792e.C18429b;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.bytedance.f.a */
public abstract class C18430a {

    /* renamed from: a */
    public C18397a f49968a;

    /* renamed from: b */
    public C18405b f49969b;

    /* renamed from: c */
    private C18429b f49970c = new C18429b(null);

    /* renamed from: d */
    private C18431a f49971d;

    /* renamed from: e */
    private double f49972e;

    /* renamed from: com.iab.omid.library.bytedance.f.a$a */
    enum C18431a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_HIDDEN
    }

    public C18430a() {
        mo47873e();
    }

    /* renamed from: f */
    private WebView m60682f() {
        return (WebView) this.f49970c.get();
    }

    /* renamed from: g */
    private boolean m60683g() {
        return this.f49970c.get() != null;
    }

    /* renamed from: a */
    public void mo47860a() {
    }

    /* renamed from: a */
    public final void mo47861a(float f) {
        C18412d.m60613a().mo47845a(m60682f(), f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo47862a(WebView webView) {
        this.f49970c = new C18429b(webView);
    }

    /* renamed from: a */
    public final void mo47863a(C18399c cVar) {
        C18412d.m60613a().mo47848a(m60682f(), cVar.mo47808c());
    }

    /* renamed from: a */
    public final void mo47864a(C18403g gVar, C18400d dVar) {
        String e = gVar.mo47812e();
        JSONObject jSONObject = new JSONObject();
        C18423b.m60655a(jSONObject, "environment", "app");
        C18423b.m60655a(jSONObject, "adSessionType", dVar.f49916e);
        C18423b.m60655a(jSONObject, "deviceInfo", C18422a.m60646a());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C18423b.m60655a(jSONObject, "supports", jSONArray);
        JSONObject jSONObject2 = new JSONObject();
        C18423b.m60655a(jSONObject2, "partnerName", dVar.f49912a.f49918a);
        C18423b.m60655a(jSONObject2, "partnerVersion", dVar.f49912a.f49919b);
        C18423b.m60655a(jSONObject, "omidNativeInfo", jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        C18423b.m60655a(jSONObject3, "libraryVersion", "1.2.16-Bytedance");
        C18423b.m60655a(jSONObject3, "appId", C18411c.m60611a().f49949a.getApplicationContext().getPackageName());
        C18423b.m60655a(jSONObject, "app", jSONObject3);
        if (dVar.f49915d != null) {
            C18423b.m60655a(jSONObject, "customReferenceData", dVar.f49915d);
        }
        JSONObject jSONObject4 = new JSONObject();
        for (C18402f fVar : dVar.mo47809a()) {
            C18423b.m60655a(jSONObject4, fVar.f49920a, fVar.f49922c);
        }
        C18412d.m60613a().mo47847a(m60682f(), e, jSONObject, jSONObject4);
    }

    /* renamed from: a */
    public final void mo47865a(String str) {
        C18412d.m60613a().mo47846a(m60682f(), str, (JSONObject) null);
    }

    /* renamed from: a */
    public final void mo47866a(String str, double d) {
        if (d > this.f49972e) {
            this.f49971d = C18431a.AD_STATE_VISIBLE;
            C18412d.m60613a().mo47851c(m60682f(), str);
        }
    }

    /* renamed from: a */
    public final void mo47867a(String str, JSONObject jSONObject) {
        C18412d.m60613a().mo47846a(m60682f(), str, jSONObject);
    }

    /* renamed from: a */
    public final void mo47868a(boolean z) {
        if (m60683g()) {
            C18412d.m60613a().mo47852d(m60682f(), z ? "foregrounded" : "backgrounded");
        }
    }

    /* renamed from: b */
    public void mo47869b() {
        this.f49970c.clear();
    }

    /* renamed from: b */
    public final void mo47870b(String str, double d) {
        if (d > this.f49972e && this.f49971d != C18431a.AD_STATE_HIDDEN) {
            this.f49971d = C18431a.AD_STATE_HIDDEN;
            C18412d.m60613a().mo47851c(m60682f(), str);
        }
    }

    /* renamed from: c */
    public final void mo47871c() {
        C18412d.m60613a().mo47844a(m60682f());
    }

    /* renamed from: d */
    public final void mo47872d() {
        C18412d.m60613a().mo47849b(m60682f());
    }

    /* renamed from: e */
    public final void mo47873e() {
        this.f49972e = C18425c.m60665a();
        this.f49971d = C18431a.AD_STATE_IDLE;
    }
}
