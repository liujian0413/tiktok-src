package com.p280ss.android.ugc.aweme.commercialize.feed;

import com.p280ss.android.ugc.aweme.commercialize.model.C25005n;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.n */
final /* synthetic */ class C24732n implements Runnable {

    /* renamed from: a */
    private final CommerceVideoDelegate f65170a;

    /* renamed from: b */
    private final C25005n f65171b;

    C24732n(CommerceVideoDelegate commerceVideoDelegate, C25005n nVar) {
        this.f65170a = commerceVideoDelegate;
        this.f65171b = nVar;
    }

    public final void run() {
        this.f65170a.mo64561a(this.f65171b);
    }
}
