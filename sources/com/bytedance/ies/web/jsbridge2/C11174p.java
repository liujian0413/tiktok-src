package com.bytedance.ies.web.jsbridge2;

import android.webkit.WebView;
import com.bytedance.ies.web.jsbridge2.C11152c.C11154b;
import java.util.Collection;

/* renamed from: com.bytedance.ies.web.jsbridge2.p */
public final class C11174p {

    /* renamed from: e */
    private static C11181u f30320e = new C11181u();

    /* renamed from: a */
    public volatile boolean f30321a;

    /* renamed from: b */
    public C11156e f30322b;

    /* renamed from: c */
    public C11160g f30323c;

    /* renamed from: d */
    public WebView f30324d;

    /* renamed from: f */
    private C11170n f30325f;

    /* renamed from: com.bytedance.ies.web.jsbridge2.p$a */
    public interface C11175a {
        /* renamed from: a */
        void mo27207a();
    }

    /* renamed from: b */
    private void m32714b() {
        if (this.f30321a) {
            throw new IllegalStateException("JsBridge2 is already released!!!");
        }
    }

    /* renamed from: a */
    public final void mo27205a() {
        m32714b();
        this.f30322b.mo27164a();
        this.f30323c.mo27174a();
        this.f30324d = null;
        this.f30321a = true;
    }

    /* renamed from: a */
    public final C11174p mo27202a(C11170n nVar) {
        this.f30325f = nVar;
        return this;
    }

    /* renamed from: a */
    public static C11166j m32711a(WebView webView) {
        return new C11166j(webView);
    }

    /* renamed from: b */
    public static void m32715b(Collection<String> collection) {
        f30320e.mo27224b(collection);
    }

    /* renamed from: a */
    public static void m32713a(Collection<String> collection) {
        f30320e.mo27221a(collection);
    }

    C11174p(C11166j jVar) {
        this.f30323c = new C11160g(jVar, f30320e);
        this.f30322b = new C11156e(jVar);
        this.f30324d = jVar.f30300a;
        C11165i.m32684a(jVar.f30304e);
        C11192v.m32757a(jVar.f30305f);
    }

    /* renamed from: a */
    public static void m32712a(IBridgePermissionConfigurator iBridgePermissionConfigurator, C11175a aVar) {
        f30320e.mo27217a(iBridgePermissionConfigurator, aVar);
    }

    /* renamed from: a */
    public final C11174p mo27203a(String str, C11154b bVar) {
        m32714b();
        this.f30323c.mo27176a(str, bVar);
        if (this.f30325f != null) {
            this.f30325f.mo27194a(str);
        }
        return this;
    }

    /* renamed from: a */
    public final C11174p mo27204a(String str, C11155d<?, ?> dVar) {
        m32714b();
        this.f30323c.mo27177a(str, dVar);
        if (this.f30325f != null) {
            this.f30325f.mo27194a(str);
        }
        return this;
    }

    /* renamed from: a */
    public final <T> void mo27206a(String str, T t) {
        m32714b();
        this.f30323c.mo27178a(str, t);
    }
}
