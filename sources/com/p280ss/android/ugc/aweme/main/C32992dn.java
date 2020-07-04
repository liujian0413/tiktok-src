package com.p280ss.android.ugc.aweme.main;

/* renamed from: com.ss.android.ugc.aweme.main.dn */
final /* synthetic */ class C32992dn implements Runnable {

    /* renamed from: a */
    private final TabChangeManager f85961a;

    /* renamed from: b */
    private final String f85962b;

    /* renamed from: c */
    private final boolean f85963c;

    /* renamed from: d */
    private final int f85964d;

    /* renamed from: e */
    private final boolean f85965e;

    C32992dn(TabChangeManager tabChangeManager, String str, boolean z, int i, boolean z2) {
        this.f85961a = tabChangeManager;
        this.f85962b = str;
        this.f85963c = z;
        this.f85964d = i;
        this.f85965e = z2;
    }

    public final void run() {
        this.f85961a.mo84576a(this.f85962b, this.f85963c, this.f85964d, this.f85965e);
    }
}
