package com.p280ss.android.ugc.aweme.commercialize.feed;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.s */
final /* synthetic */ class C24743s implements Runnable {

    /* renamed from: a */
    private final CommerceVideoDelegate f65192a;

    /* renamed from: b */
    private final boolean f65193b;

    /* renamed from: c */
    private final boolean f65194c;

    C24743s(CommerceVideoDelegate commerceVideoDelegate, boolean z, boolean z2) {
        this.f65192a = commerceVideoDelegate;
        this.f65193b = z;
        this.f65194c = z2;
    }

    public final void run() {
        this.f65192a.mo64569a(this.f65193b, this.f65194c);
    }
}
