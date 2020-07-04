package com.iab.omid.library.bytedance.p793f;

import android.os.Handler;
import android.webkit.WebView;
import com.iab.omid.library.bytedance.adsession.C18402f;
import com.iab.omid.library.bytedance.p789b.C18411c;
import com.iab.omid.library.bytedance.p789b.C18412d;
import java.util.List;

/* renamed from: com.iab.omid.library.bytedance.f.c */
public final class C18433c extends C18430a {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public WebView f49977c;

    /* renamed from: d */
    private List<C18402f> f49978d;

    /* renamed from: e */
    private final String f49979e;

    public C18433c(List<C18402f> list, String str) {
        this.f49978d = list;
        this.f49979e = str;
    }

    /* renamed from: f */
    private void m60699f() {
        this.f49977c = new WebView(C18411c.m60611a().f49949a);
        this.f49977c.getSettings().setJavaScriptEnabled(true);
        mo47862a(this.f49977c);
        C18412d.m60617a(this.f49977c, this.f49979e);
        for (C18402f fVar : this.f49978d) {
            C18412d.m60613a().mo47850b(this.f49977c, fVar.f49921b.toExternalForm());
        }
    }

    /* renamed from: a */
    public final void mo47860a() {
        super.mo47860a();
        m60699f();
    }

    /* renamed from: b */
    public final void mo47869b() {
        super.mo47869b();
        new Handler().postDelayed(new Runnable() {

            /* renamed from: b */
            private WebView f49981b = C18433c.this.f49977c;

            public final void run() {
                this.f49981b.destroy();
            }
        }, 2000);
        this.f49977c = null;
    }
}
