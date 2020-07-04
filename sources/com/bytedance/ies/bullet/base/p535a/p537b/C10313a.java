package com.bytedance.ies.bullet.base.p535a.p537b;

import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.ies.bullet.core.model.p542a.C10403b;
import com.bytedance.ies.bullet.core.params.C10471n;
import com.bytedance.ies.bullet.kit.web.C10626b;
import com.bytedance.ies.bullet.kit.web.C10644k;
import com.bytedance.ies.bullet.kit.web.p549c.C10630a;
import com.bytedance.ies.bullet.kit.web.p550d.C10637c;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.ies.bullet.base.a.b.a */
public class C10313a implements C10644k {
    /* renamed from: b */
    public C10630a mo25054b() {
        return null;
    }

    /* renamed from: a */
    public C10626b mo25052a() {
        C10626b bVar = new C10626b(Boolean.valueOf(true), null, null, 6, null);
        return bVar;
    }

    /* renamed from: a */
    public final C10471n mo25050a(C10403b bVar) {
        C7573i.m23587b(bVar, "providerFactory");
        return new C10637c();
    }

    /* renamed from: a */
    public void mo25053a(WebSettings webSettings, WebView webView) {
        C7573i.m23587b(webSettings, "settings");
        C7573i.m23587b(webView, "webView");
        webSettings.setJavaScriptEnabled(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setSupportZoom(true);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setUseWideViewPort(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setAllowFileAccess(true);
        webSettings.setBlockNetworkImage(false);
    }
}
