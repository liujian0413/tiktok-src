package com.p280ss.android.ugc.aweme.live.p1363c;

import com.bytedance.android.live.base.C2324b;
import com.bytedance.android.live.base.p118b.C2325a;
import com.bytedance.android.live.utility.C3594b;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.p396j.C8345a;
import com.bytedance.android.livesdkapi.host.C9439a;
import com.bytedance.android.livesdkapi.host.C9454b;
import com.bytedance.android.livesdkapi.host.C9456c;
import com.bytedance.android.livesdkapi.host.C9462d;
import com.bytedance.android.livesdkapi.host.C9463e;
import com.bytedance.android.livesdkapi.host.C9464f;
import com.bytedance.android.livesdkapi.host.C9465g;
import com.bytedance.android.livesdkapi.host.C9466h;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.android.livesdkapi.host.IHostPlugin;
import com.bytedance.android.livesdkapi.host.IHostShare;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.android.livesdkapi.host.IHostWallet;
import com.bytedance.android.livesdkapi.p447e.C9399d;
import com.bytedance.android.livesdkapi.service.C9514b;
import com.p280ss.android.ugc.aweme.utils.C43013ch;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.live.c.k */
public final class C32488k implements C9514b {

    /* renamed from: a */
    private IHostAction f84736a = new C32471b();

    /* renamed from: b */
    private IHostContext f84737b = new C32470a();

    /* renamed from: c */
    private C2325a f84738c = new C32483h();

    /* renamed from: d */
    private IHostNetwork f84739d = new C32484i();

    /* renamed from: e */
    private C9463e f84740e = new C32482g();

    /* renamed from: f */
    private IHostPlugin f84741f = new C32487j();

    /* renamed from: g */
    private IHostApp f84742g = new C32472c();

    /* renamed from: h */
    private Locale f84743h = C43013ch.m136515b();

    /* renamed from: i */
    private IHostShare f84744i = new C32489l();

    /* renamed from: j */
    private IHostUser f84745j = new C32493p();

    /* renamed from: k */
    private IHostWallet f84746k = new C32499s();

    /* renamed from: l */
    private C9439a f84747l = new C32474d(this.f84737b.context());

    /* renamed from: m */
    private C9464f f84748m = new C32490m();

    /* renamed from: n */
    private C9466h f84749n = new C32501t();

    /* renamed from: o */
    private C9399d f84750o = C8345a.m25438a();

    /* renamed from: p */
    private C9465g f84751p = new C32498r();

    /* renamed from: q */
    private C9456c f84752q = new C32479f();

    /* renamed from: I */
    private IHostPlugin m105243I() {
        return this.f84741f;
    }

    /* renamed from: a */
    public final IHostContext mo14560G() {
        return this.f84737b;
    }

    /* renamed from: b */
    public final C9439a mo14559F() {
        return this.f84747l;
    }

    /* renamed from: c */
    public final IHostApp mo14558E() {
        return this.f84742g;
    }

    /* renamed from: d */
    public final C2325a mo14557D() {
        return this.f84738c;
    }

    /* renamed from: e */
    public final C9463e mo14556C() {
        return this.f84740e;
    }

    /* renamed from: f */
    public final IHostWallet mo14555B() {
        return this.f84746k;
    }

    /* renamed from: g */
    public final IHostShare mo14554A() {
        return this.f84744i;
    }

    /* renamed from: h */
    public final IHostNetwork mo14586z() {
        return this.f84739d;
    }

    /* renamed from: i */
    public final IHostAction mo14585y() {
        return this.f84736a;
    }

    /* renamed from: j */
    public final C9464f mo14584x() {
        return this.f84748m;
    }

    /* renamed from: k */
    public final IHostUser mo14583w() {
        return this.f84745j;
    }

    /* renamed from: l */
    public final C9466h mo14582v() {
        return this.f84749n;
    }

    /* renamed from: m */
    public final C9399d mo14581u() {
        return this.f84750o;
    }

    /* renamed from: n */
    public final C9465g mo14580t() {
        return this.f84751p;
    }

    /* renamed from: o */
    public final C9456c mo14579s() {
        return this.f84752q;
    }

    /* renamed from: p */
    public final C9462d mo14578r() {
        return null;
    }

    /* renamed from: q */
    public final C9454b mo14577q() {
        return null;
    }

    public C32488k() {
        m105242H();
    }

    /* renamed from: H */
    private void m105242H() {
        C3596c.m13174a(IHostAction.class, (C2324b) C3594b.m13169a(mo14585y(), IHostAction.class));
        C3596c.m13174a(IHostContext.class, (C2324b) C3594b.m13169a(mo14560G(), IHostContext.class));
        C3596c.m13174a(C2325a.class, mo14557D());
        C3596c.m13174a(IHostNetwork.class, mo14586z());
        C3596c.m13174a(C9463e.class, mo14556C());
        C3596c.m13174a(C9456c.class, mo14579s());
        C3596c.m13174a(IHostApp.class, (C2324b) C3594b.m13169a(mo14558E(), IHostApp.class));
        C3596c.m13174a(IHostPlugin.class, (C2324b) C3594b.m13169a(m105243I(), IHostPlugin.class));
        C3596c.m13174a(C9466h.class, mo14582v());
        C3596c.m13174a(C9399d.class, mo14581u());
        C3596c.m13174a(IHostShare.class, (C2324b) C3594b.m13169a(mo14554A(), IHostShare.class));
        C3596c.m13174a(C9439a.class, mo14559F());
        C3596c.m13174a(C9465g.class, mo14580t());
        C3596c.m13174a(C9464f.class, mo14584x());
    }
}
