package com.p280ss.android.ugc.aweme.detail.operators;

import android.support.p022v4.app.Fragment;
import com.bytedance.common.utility.collection.C9727e;
import com.p280ss.android.ugc.aweme.detail.p1166j.C26105j;
import com.p280ss.android.ugc.aweme.detail.p1166j.C26111o;
import com.p280ss.android.ugc.aweme.feed.param.FeedParam;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.g */
public final class C26147g implements C26134am {

    /* renamed from: a */
    private WeakReference<C26138ao> f68976a;

    /* renamed from: b */
    private C26105j f68977b = new C26105j();

    /* renamed from: c */
    private C26111o f68978c = new C26111o();

    /* renamed from: a */
    public final int mo67682a(int i) {
        return i + 3000;
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
        return this.f68977b;
    }

    /* renamed from: c */
    public final boolean mo67689c() {
        return this.f68978c.mo66540i();
    }

    /* renamed from: e */
    public final void mo67691e() {
        this.f68978c.mo59134U_();
        this.f68978c.mo66535W_();
    }

    /* renamed from: a */
    public final void mo67685a(C26138ao aoVar) {
        this.f68976a = new C9727e(aoVar);
        this.f68978c.mo66537a(aoVar);
        this.f68978c.mo66536a(this.f68977b);
    }

    /* renamed from: a */
    public final boolean mo67687a(String str) {
        if (!(this.f68976a == null || this.f68976a.get() == null)) {
            ((C26138ao) this.f68976a.get()).mo67626f();
        }
        return false;
    }

    /* renamed from: a */
    public final void mo67684a(int i, FeedParam feedParam, int i2, boolean z) {
        this.f68978c.mo56976a(feedParam.getAid(), feedParam.getEventType());
    }
}
