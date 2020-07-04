package com.p280ss.android.ugc.aweme.app;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.p280ss.android.ugc.aweme.main.MainActivity;

/* renamed from: com.ss.android.ugc.aweme.app.AppLinkHandler */
public class AppLinkHandler extends DeepLinkHandlerActivity {

    /* renamed from: f */
    private static final String[] f60324f = {"v.douyin.com", "v16.musical.ly", "v16.tiktokv.com", "vt.tiktok.com", "vm.tiktok.com"};

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.AppLinkHandler", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.AppLinkHandler", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.AppLinkHandler", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: c */
    private void m74897c() {
        C23019q qVar;
        Intent intent = getIntent();
        Uri data = intent.getData();
        if (data != null) {
            if (TextUtils.equals(WebKitApi.SCHEME_HTTP, data.getScheme()) || TextUtils.equals(WebKitApi.SCHEME_HTTPS, data.getScheme())) {
                try {
                    String host = data.getHost();
                    if (TextUtils.equals("www.tiktok.com", host)) {
                        qVar = new C22899bi(getApplicationContext());
                    } else if (m74896a(host)) {
                        qVar = new C22905bn(getApplicationContext());
                    } else {
                        qVar = new C22902bk(getApplicationContext());
                    }
                    Uri a = qVar.mo59864a(data);
                    if (a == null && !(qVar instanceof C22902bk)) {
                        a = new C22902bk(getApplicationContext()).mo59864a(data);
                    }
                    if (a != null) {
                        intent.setData(a);
                        this.f60344a.mo59977a("link_direct");
                        this.f60344a.mo59978b("google");
                        return;
                    }
                    m74895a(data);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m74896a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (String equals : f60324f) {
            if (TextUtils.equals(str, equals)) {
                return true;
            }
        }
        return false;
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.AppLinkHandler", "onCreate", true);
        m74897c();
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.AppLinkHandler", "onCreate", false);
    }

    /* renamed from: a */
    private void m74895a(Uri uri) {
        Intent a = C22912d.m75406a(this, uri.buildUpon().appendQueryParameter("url", uri.toString()).build(), true);
        if (a != null) {
            if (!this.f60346c) {
                a.addFlags(268435456);
            }
            startActivity(a);
        }
    }

    /* renamed from: a */
    public final Intent mo59394a(Uri uri, boolean z, boolean z2) {
        if (uri == null || !TextUtils.equals("shortlink", uri.getHost())) {
            return super.mo59394a(uri, z, z2);
        }
        if (m74919a()) {
            return null;
        }
        return new Intent(this, MainActivity.class);
    }
}
