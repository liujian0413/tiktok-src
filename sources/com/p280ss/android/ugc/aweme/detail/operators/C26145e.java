package com.p280ss.android.ugc.aweme.detail.operators;

import android.support.p022v4.app.Fragment;
import com.p280ss.android.ugc.aweme.detail.p1166j.C26105j;
import com.p280ss.android.ugc.aweme.detail.p1166j.C26111o;
import com.p280ss.android.ugc.aweme.feed.param.FeedParam;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.e */
public final class C26145e implements C26134am {

    /* renamed from: a */
    private C26105j f68973a = new C26105j();

    /* renamed from: b */
    private WeakReference<C26138ao> f68974b = null;

    /* renamed from: c */
    private C26111o f68975c = new C26111o();

    /* renamed from: a */
    public final int mo67682a(int i) {
        return 7000;
    }

    /* renamed from: a */
    public final boolean mo67686a(Fragment fragment) {
        return true;
    }

    /* renamed from: b */
    public final boolean mo67688b() {
        return true;
    }

    /* renamed from: f */
    public final boolean mo67692f() {
        return false;
    }

    /* renamed from: g */
    public final boolean mo67693g() {
        return false;
    }

    /* renamed from: a */
    public final Object mo67683a() {
        return this.f68973a;
    }

    /* renamed from: c */
    public final boolean mo67689c() {
        return this.f68975c.mo66540i();
    }

    /* renamed from: e */
    public final void mo67691e() {
        this.f68974b = null;
        this.f68975c.mo59134U_();
        this.f68975c.mo66535W_();
    }

    /* renamed from: a */
    public final void mo67685a(C26138ao aoVar) {
        this.f68974b = new WeakReference<>(aoVar);
        this.f68975c.mo66537a(aoVar);
        this.f68975c.mo66536a(this.f68973a);
    }

    /* renamed from: a */
    public final boolean mo67687a(String str) {
        if (!(this.f68974b == null || this.f68974b.get() == null)) {
            ((C26138ao) this.f68974b.get()).mo67626f();
        }
        return false;
    }

    /* renamed from: a */
    public final void mo67684a(int i, FeedParam feedParam, int i2, boolean z) {
        this.f68975c.mo56976a(feedParam.getAid(), feedParam.getEventType());
    }
}
