package com.p280ss.android.ugc.aweme.account.login.authorize;

import android.content.Intent;

/* renamed from: com.ss.android.ugc.aweme.account.login.authorize.e */
final /* synthetic */ class C21311e implements Runnable {

    /* renamed from: a */
    private final AuthorizeActivity f57267a;

    /* renamed from: b */
    private final int f57268b;

    /* renamed from: c */
    private final Intent f57269c;

    C21311e(AuthorizeActivity authorizeActivity, int i, Intent intent) {
        this.f57267a = authorizeActivity;
        this.f57268b = i;
        this.f57269c = intent;
    }

    public final void run() {
        this.f57267a.mo57308a(this.f57268b, this.f57269c);
    }
}
