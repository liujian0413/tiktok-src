package com.bytedance.ies.web.jsbridge2;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.Collection;

/* renamed from: com.bytedance.ies.web.jsbridge2.j */
public final class C11166j {

    /* renamed from: a */
    WebView f30300a;

    /* renamed from: b */
    String f30301b = "IESJSBridge";

    /* renamed from: c */
    C11167k f30302c;

    /* renamed from: d */
    Context f30303d;

    /* renamed from: e */
    boolean f30304e;

    /* renamed from: f */
    boolean f30305f;

    /* renamed from: g */
    boolean f30306g;

    /* renamed from: h */
    C11169m f30307h;

    /* renamed from: b */
    private void m32686b() {
        if (this.f30300a == null || TextUtils.isEmpty(this.f30301b) || this.f30302c == null) {
            throw new IllegalArgumentException("Requested arguments aren't set properly when building JsBridge.");
        }
    }

    /* renamed from: a */
    public final C11174p mo27189a() {
        m32686b();
        return new C11174p(this);
    }

    /* renamed from: a */
    public final C11166j mo27183a(Context context) {
        this.f30303d = context;
        return this;
    }

    /* renamed from: b */
    public final C11166j mo27190b(boolean z) {
        this.f30304e = false;
        return this;
    }

    /* renamed from: c */
    public final C11166j mo27191c(boolean z) {
        this.f30305f = true;
        return this;
    }

    /* renamed from: a */
    public final C11166j mo27184a(C11167k kVar) {
        this.f30302c = kVar;
        return this;
    }

    C11166j(WebView webView) {
        this.f30300a = webView;
    }

    /* renamed from: a */
    public final C11166j mo27185a(C11169m mVar) {
        this.f30307h = mVar;
        return this;
    }

    /* renamed from: a */
    public final C11166j mo27186a(String str) {
        this.f30301b = str;
        return this;
    }

    /* renamed from: a */
    public final C11166j mo27187a(Collection<String> collection) {
        C11174p.m32713a(collection);
        return this;
    }

    /* renamed from: a */
    public final C11166j mo27188a(boolean z) {
        this.f30306g = true;
        return this;
    }
}
