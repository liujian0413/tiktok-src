package com.p280ss.android.ugc.aweme.i18n.musically.follows.presenter;

import android.content.Intent;
import com.p280ss.android.ugc.aweme.common.C25640a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;

/* renamed from: com.ss.android.ugc.aweme.i18n.musically.follows.presenter.d */
public final class C30523d extends C25674b<C30521c> {

    /* renamed from: a */
    private String f80210a;

    /* renamed from: d */
    private int f80211d;

    /* renamed from: e */
    private C30524e f80212e;

    /* renamed from: e */
    public final void mo80234e() {
        mo59134U_();
        mo66535W_();
    }

    /* renamed from: f */
    public final boolean mo80235f() {
        if (this.f80211d == 0) {
            return true;
        }
        return false;
    }

    public C30523d(Intent intent) {
        this.f80210a = intent.getStringExtra("uid");
        this.f80211d = intent.getIntExtra("type", 0);
    }

    /* renamed from: a */
    public final void mo80232a(C30528i iVar) {
        C25640a aVar;
        this.f80212e = new C30524e(iVar);
        mo66537a(this.f80212e);
        if (this.f80211d == 0) {
            aVar = new C30526g(this.f80210a);
        } else {
            aVar = new C30527h(this.f80210a);
        }
        mo66536a(aVar);
    }

    /* renamed from: a */
    public final void mo80233a(String str, int i) {
        this.f80212e.mo80236a(str, i);
    }
}
