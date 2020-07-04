package com.p280ss.android.ugc.aweme.commercialize.feed;

import android.content.Context;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p984ad.p985a.C22375a;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.e */
public final class C24723e implements C24724f {

    /* renamed from: a */
    private Aweme f65164a;

    /* renamed from: b */
    private Context f65165b;

    /* renamed from: c */
    private C24711ae f65166c;

    /* renamed from: d */
    private boolean f65167d;

    /* renamed from: p */
    public final void mo64721p() {
        C24725g.m81199a(this);
    }

    /* renamed from: a */
    public final boolean mo64705a() {
        if (this.f65166c == null) {
            return false;
        }
        return this.f65166c.mo64636a();
    }

    /* renamed from: a */
    public final void mo64704a(boolean z) {
        if (this.f65166c != null) {
            this.f65166c.mo64635a(this.f65165b, this.f65164a, z);
        }
    }

    /* renamed from: a */
    public final boolean mo64706a(int i) {
        if (this.f65166c == null) {
            return false;
        }
        return this.f65166c.mo64637a(this.f65165b, this.f65164a, i);
    }

    /* renamed from: q */
    private boolean m81171q() {
        if (!this.f65167d) {
            return false;
        }
        this.f65167d = false;
        return true;
    }

    /* renamed from: b */
    public final boolean mo64707b() {
        if (this.f65166c == null) {
            return false;
        }
        return this.f65166c.hasLandPage();
    }

    /* renamed from: c */
    public final boolean mo64708c() {
        if (this.f65166c == null) {
            return false;
        }
        return this.f65166c.hasOpenUrl();
    }

    /* renamed from: d */
    public final boolean mo64709d() {
        if (this.f65166c == null) {
            return false;
        }
        return this.f65166c.hasMpUrl();
    }

    /* renamed from: e */
    public final boolean mo64710e() {
        if (this.f65166c == null) {
            return true;
        }
        return this.f65166c.isRealAuthor();
    }

    /* renamed from: f */
    public final boolean mo64711f() {
        if (this.f65166c == null) {
            return true;
        }
        return this.f65166c.enableComment();
    }

    /* renamed from: g */
    public final boolean mo64712g() {
        if (this.f65166c == null) {
            return false;
        }
        return this.f65166c.isDownloadMode();
    }

    /* renamed from: h */
    public final boolean mo64713h() {
        if (this.f65166c == null) {
            return false;
        }
        return this.f65166c.isDownloadMode();
    }

    /* renamed from: i */
    public final void mo64714i() {
        if (this.f65166c != null) {
            this.f65166c.mo64630a(this.f65165b, this.f65164a);
        }
    }

    /* renamed from: j */
    public final void mo64715j() {
        if (this.f65166c != null) {
            this.f65166c.mo64638b(this.f65165b, this.f65164a);
        }
    }

    /* renamed from: k */
    public final void mo64716k() {
        if (this.f65166c != null) {
            this.f65166c.mo64640c(this.f65165b, this.f65164a);
        }
    }

    /* renamed from: l */
    public final void mo64717l() {
        if (this.f65166c != null) {
            this.f65166c.mo64642d(this.f65165b, this.f65164a);
        }
    }

    /* renamed from: m */
    public final void mo64718m() {
        if (this.f65166c != null) {
            this.f65166c.mo64643e(this.f65165b, this.f65164a);
        }
    }

    /* renamed from: n */
    public final void mo64719n() {
        if (this.f65166c != null) {
            this.f65166c.mo64644f(this.f65165b, this.f65164a);
        }
    }

    /* renamed from: o */
    public final void mo64720o() {
        this.f65166c = C22375a.m74074a().f59710d.mo58871a();
    }

    /* renamed from: a */
    public final void mo64698a(Context context) {
        mo64699a(context, this.f65164a);
    }

    /* renamed from: a */
    public final void mo64702a(String str) {
        if (this.f65166c != null) {
            this.f65166c.mo64633a(this.f65165b, this.f65164a, str);
        }
    }

    /* renamed from: a */
    private static void m81170a(Aweme aweme, String str) {
        if (aweme != null && aweme.isAd()) {
            aweme.getAwemeRawAd().setPageFrom(str);
        }
    }

    /* renamed from: a */
    public final void mo64697a(long j, int i) {
        if (this.f65166c != null) {
            this.f65166c.mo64631a(this.f65165b, this.f65164a, j, i);
        }
    }

    /* renamed from: a */
    public final void mo64696a(int i, int i2) {
        switch (i) {
            case 1:
                if (!m81171q() && this.f65166c != null) {
                    this.f65166c.mo64639b(this.f65165b, this.f65164a, i2);
                    return;
                }
            case 2:
                if (!m81171q() && this.f65166c != null) {
                    this.f65166c.mo64641c(this.f65165b, this.f65164a, i2);
                    break;
                }
            case 3:
                this.f65167d = true;
                C22375a.m74074a().f59713g.mo58852c(this.f65165b, this.f65164a);
                return;
        }
    }

    /* renamed from: a */
    public final void mo64699a(Context context, Aweme aweme) {
        this.f65164a = aweme;
        this.f65165b = context;
        if (this.f65165b != null && this.f65164a != null) {
            IFeedTypeService iFeedTypeService = (IFeedTypeService) ServiceManager.get().getService(IFeedTypeService.class);
            if (iFeedTypeService != null) {
                this.f65166c = iFeedTypeService.valueOf(aweme);
            }
            this.f65167d = false;
        }
    }

    /* renamed from: a */
    public final void mo64700a(Context context, Aweme aweme, String str) {
        m81170a(aweme, str);
        mo64699a(context, aweme);
    }

    /* renamed from: a */
    public final void mo64703a(String str, long j, int i) {
        if (this.f65166c != null) {
            this.f65166c.mo64634a(this.f65165b, this.f65164a, str, j, i);
        }
    }

    /* renamed from: a */
    public final void mo64701a(Aweme aweme, String str, long j, int i) {
        if (this.f65166c != null) {
            this.f65166c.mo64632a(this.f65165b, this.f65164a, aweme, str, j, i);
        }
    }
}
