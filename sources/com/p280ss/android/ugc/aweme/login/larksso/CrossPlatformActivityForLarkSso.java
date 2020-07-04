package com.p280ss.android.ugc.aweme.login.larksso;

import android.os.Bundle;
import android.webkit.WebSettings;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p280ss.android.ugc.aweme.crossplatform.activity.C25821f;
import com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p280ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.p280ss.android.ugc.aweme.crossplatform.view.C26039m;
import com.p280ss.android.ugc.aweme.login.larksso.LarkSsoHelper.C32666a;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.login.larksso.CrossPlatformActivityForLarkSso */
public final class CrossPlatformActivityForLarkSso extends CrossPlatformActivity {

    /* renamed from: d */
    public static C32666a f85126d;

    /* renamed from: e */
    public static final C32663a f85127e = new C32663a(null);

    /* renamed from: com.ss.android.ugc.aweme.login.larksso.CrossPlatformActivityForLarkSso$a */
    public static final class C32663a {
        private C32663a() {
        }

        /* renamed from: a */
        public static C32666a m105766a() {
            return CrossPlatformActivityForLarkSso.f85126d;
        }

        /* renamed from: b */
        private static void m105767b(C32666a aVar) {
            CrossPlatformActivityForLarkSso.f85126d = aVar;
        }

        public /* synthetic */ C32663a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public final void mo84108a(C32666a aVar) {
            m105767b(aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.login.larksso.CrossPlatformActivityForLarkSso$b */
    public static final class C32664b implements C32666a {

        /* renamed from: a */
        final /* synthetic */ CrossPlatformActivityForLarkSso f85128a;

        /* renamed from: a */
        public final void mo84109a() {
            C32666a a = C32663a.m105766a();
            if (a != null) {
                a.mo84109a();
            }
            this.f85128a.finish();
        }

        C32664b(CrossPlatformActivityForLarkSso crossPlatformActivityForLarkSso) {
            this.f85128a = crossPlatformActivityForLarkSso;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.login.larksso.CrossPlatformActivityForLarkSso$c */
    static final class C32665c implements C25821f {

        /* renamed from: a */
        public static final C32665c f85129a = new C32665c();

        C32665c() {
        }

        /* renamed from: a */
        public final void mo67133a() {
        }
    }

    public final void onBackPressed() {
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.login.larksso.CrossPlatformActivityForLarkSso", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.login.larksso.CrossPlatformActivityForLarkSso", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.login.larksso.CrossPlatformActivityForLarkSso", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onDestroy() {
        super.onDestroy();
        LarkSsoHelper.m105775a((C32666a) null);
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.login.larksso.CrossPlatformActivityForLarkSso", "onCreate", true);
        super.onCreate(bundle);
        C26039m mVar = (C26039m) mo67102a(C26039m.class);
        if (mVar != null) {
            SingleWebView b = mVar.mo67531b();
            if (b != null) {
                WebSettings settings = b.getSettings();
                if (settings != null) {
                    settings.setUserAgentString("Mozilla/5.0 (Windows NT 6.1; WOW64) SSOMobileTest");
                }
            }
        }
        LarkSsoHelper.m105775a((C32666a) new C32664b(this));
        this.f68246a.mo67086a((C25821f) C32665c.f85129a);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.login.larksso.CrossPlatformActivityForLarkSso", "onCreate", false);
    }
}
