package com.bytedance.ies.web.jsbridge2;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.ies.web.p582a.C11087a;
import com.bytedance.ies.web.p582a.C11093e;
import com.bytedance.ies.web.p582a.C11094f;
import com.bytedance.ies.web.p582a.C11097i;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.web.jsbridge2.q */
public final class C11176q implements C11094f, C11170n {

    /* renamed from: a */
    public C11087a f30326a;

    /* renamed from: b */
    private C11156e f30327b;

    /* renamed from: c */
    private C11160g f30328c;

    /* renamed from: d */
    private C11178s f30329d;

    /* renamed from: e */
    private Set<String> f30330e = new CopyOnWriteArraySet();

    /* renamed from: a */
    public final void mo27212a() {
        this.f30326a.mo27028a();
    }

    /* renamed from: b */
    public final C11176q mo27214b(String str) {
        this.f30326a.mo27025a(str);
        return this;
    }

    /* renamed from: a */
    public final C11176q mo27208a(WebChromeClient webChromeClient) {
        this.f30326a.mo27022a(webChromeClient);
        return this;
    }

    /* renamed from: b */
    public final C11176q mo27215b(List<String> list) {
        this.f30326a.mo27027a(list);
        return this;
    }

    /* renamed from: a */
    public final C11176q mo27209a(WebViewClient webViewClient) {
        this.f30326a.mo27023a(webViewClient);
        return this;
    }

    /* renamed from: a */
    public final C11176q mo27211a(List<String> list) {
        this.f30326a.mo27033b(list);
        return this;
    }

    /* renamed from: a */
    public final void mo27194a(String str) {
        this.f30330e.remove(str);
        this.f30326a.mo27026a(str, (C11093e) this.f30329d);
    }

    /* renamed from: a */
    public static C11176q m32722a(WebView webView, C11174p pVar) {
        return new C11176q(webView, pVar);
    }

    private C11176q(WebView webView, C11174p pVar) {
        this.f30327b = pVar.f30322b;
        this.f30328c = pVar.f30323c;
        this.f30326a = C11087a.m32475a(webView);
        this.f30329d = new C11178s(this.f30327b, this.f30330e);
    }

    /* renamed from: a */
    public final C11176q mo27210a(String str, C11093e eVar) {
        this.f30326a.mo27026a(str, (C11093e) this.f30329d);
        this.f30328c.mo27175a(str, (C11151b) new C11168l(eVar));
        return this;
    }

    /* renamed from: a */
    public final void mo27213a(String str, JSONObject jSONObject) {
        this.f30326a.mo27034b(str, jSONObject);
    }

    /* renamed from: a */
    public final void mo27032a(List<String> list, C11097i iVar, JSONObject jSONObject) {
        this.f30326a.mo27032a(list, iVar, jSONObject);
    }
}
