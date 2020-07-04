package com.twitter.sdk.android.tweetui;

import com.twitter.sdk.android.core.C46821b;
import com.twitter.sdk.android.core.C46830i;
import com.twitter.sdk.android.core.models.C46959o;

/* renamed from: com.twitter.sdk.android.tweetui.ak */
final /* synthetic */ class C47022ak implements Runnable {

    /* renamed from: a */
    private final C46821b f120663a;

    /* renamed from: b */
    private final C46959o f120664b;

    C47022ak(C46821b bVar, C46959o oVar) {
        this.f120663a = bVar;
        this.f120664b = oVar;
    }

    public final void run() {
        this.f120663a.mo29990a(new C46830i<>(this.f120664b, null));
    }
}
