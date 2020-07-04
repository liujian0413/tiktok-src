package com.p280ss.android.newmedia;

import android.content.Context;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.newmedia.p891a.C19923c;
import com.p280ss.android.sdk.webview.C20145l;
import com.p280ss.android.ugc.aweme.app.AwemeAppData;
import com.p280ss.android.ugc.aweme.splash.SplashAdManagerHolder;
import com.p280ss.android.ugc.aweme.web.C43447i;

/* renamed from: com.ss.android.newmedia.f */
public abstract class C19936f {

    /* renamed from: h */
    private static volatile AwemeAppData f54022h;

    /* renamed from: a */
    protected int f54023a = ((int) C6399b.m19933i());

    /* renamed from: b */
    protected final Context f54024b = C6399b.m19921a();

    /* renamed from: c */
    public long f54025c = -1;

    /* renamed from: d */
    public long f54026d = -1;

    /* renamed from: e */
    private final Object f54027e = new Object();

    /* renamed from: f */
    private int f54028f = 1;

    /* renamed from: g */
    private int f54029g = 2;

    /* renamed from: g */
    public C20145l mo53441g() {
        return C43447i.m137872c();
    }

    /* renamed from: d */
    public final boolean mo53438d() {
        synchronized (this.f54027e) {
            if (this.f54028f > 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: f */
    public final int mo53440f() {
        if (mo53439e() == 2) {
            return 1;
        }
        return 0;
    }

    /* renamed from: h */
    public final void mo53442h() {
        SplashAdManagerHolder.m132895b(this.f54024b).mo50575c();
    }

    /* renamed from: a */
    public static AwemeAppData m65765a() {
        if (f54022h == null) {
            synchronized (C19936f.class) {
                if (f54022h == null) {
                    f54022h = new AwemeAppData();
                }
            }
        }
        return f54022h;
    }

    /* renamed from: c */
    public final int mo53437c() {
        if (this.f54023a == -1 || this.f54023a == 0 || this.f54023a == 1) {
            this.f54023a = (int) C6399b.m19933i();
        }
        return this.f54023a;
    }

    /* renamed from: e */
    public final int mo53439e() {
        if (this.f54029g == 1 || this.f54029g == 0 || this.f54029g == 2) {
            return this.f54029g;
        }
        return 2;
    }

    protected C19936f() {
    }

    /* renamed from: b */
    public final String mo53436b() {
        StringBuilder sb = new StringBuilder();
        sb.append("v");
        String j = C6399b.m19934j();
        if (j == null) {
            j = "1.0";
        }
        sb.append(j);
        sb.append(" Build ");
        sb.append(C6399b.m19941q());
        sb.append("_");
        sb.append(C19923c.m65736a(this.f54024b).mo53429a("release_build", ""));
        return sb.toString();
    }
}
