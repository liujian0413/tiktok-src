package com.p280ss.android.ugc.aweme.app;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.support.p029v7.app.C1107c;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.p280ss.android.common.util.NetworkUtils;
import com.p280ss.android.image.C6813b;
import com.p280ss.android.monitor.privacy.PrivacyCheckerInitializer;
import com.p280ss.android.newmedia.p300c.C6837a;
import com.p280ss.android.ugc.asve.C6855a;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import com.p280ss.android.ugc.aweme.legoImp.task.C7158v;
import com.p280ss.android.ugc.aweme.net.C7179f;

/* renamed from: com.ss.android.ugc.aweme.app.AwemeApplication */
public abstract class AwemeApplication extends Application {

    /* renamed from: a */
    protected static AwemeApplication f19513a;

    /* renamed from: b */
    protected static AwemeApplication f19514b;

    /* renamed from: c */
    public boolean f19515c;

    /* renamed from: d */
    protected long f19516d;

    /* renamed from: a */
    public static AwemeApplication m21341a() {
        return f19513a;
    }

    /* renamed from: c */
    public static AwemeApplication m21344c() {
        return f19514b;
    }

    public Resources getResources() {
        return super.getResources();
    }

    /* renamed from: b */
    public static Activity m21343b() {
        Activity g = C6405d.m19984g();
        if (g != null) {
            return g;
        }
        return null;
    }

    /* renamed from: d */
    private void mo16889d() {
        NetworkUtils.setAppContext(this);
        NetworkUtils.setApiProcessHook(new C6837a());
        NetworkUtils.setDefaultUserAgent(System.getProperty("http.agent"));
    }

    public void onCreate() {
        f19514b = this;
        super.onCreate();
        C6855a.m21307a((Application) this);
        if (this.f19515c) {
            C7121a.m22248b().mo18559a(C7158v.m22354d()).mo18559a(C7158v.m22352b()).mo18560a();
        }
        C7121a.m22248b().mo18559a(new PrivacyCheckerInitializer()).mo18560a();
        C6405d.m19981e().mo19325f(C6871l.f19522a);
        mo16889d();
        C6813b.f19415a = "/aweme";
        if (this.f19515c) {
            C6903bc.m21465F().mo16864k();
        }
        C1107c.m4899a(true);
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* renamed from: a */
    static final /* synthetic */ void m21342a(Boolean bool) throws Exception {
        if (!bool.booleanValue()) {
            C7179f.m22409a();
        }
    }
}
