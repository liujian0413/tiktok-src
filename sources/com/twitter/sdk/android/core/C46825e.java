package com.twitter.sdk.android.core;

import com.twitter.sdk.android.core.internal.oauth.GuestAuthToken;
import com.twitter.sdk.android.core.internal.oauth.OAuth2Service;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.twitter.sdk.android.core.e */
public final class C46825e {

    /* renamed from: a */
    public final C46939k<C46823d> f120111a;

    /* renamed from: b */
    private final OAuth2Service f120112b;

    /* renamed from: b */
    private void m146479b() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f120112b.mo117990a((C46821b<GuestAuthToken>) new C46821b<GuestAuthToken>() {
            /* renamed from: a */
            public final void mo29989a(TwitterException twitterException) {
                C46825e.this.f120111a.mo117917b(0);
                countDownLatch.countDown();
            }

            /* renamed from: a */
            public final void mo29990a(C46830i<GuestAuthToken> iVar) {
                C46825e.this.f120111a.mo117915a(new C46823d((GuestAuthToken) iVar.f120123a));
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
            this.f120111a.mo117917b(0);
        }
    }

    /* renamed from: a */
    public final synchronized C46823d mo117911a() {
        C46823d dVar = (C46823d) this.f120111a.mo117913a();
        if (m146480b(dVar)) {
            return dVar;
        }
        m146479b();
        return (C46823d) this.f120111a.mo117913a();
    }

    /* renamed from: b */
    private static boolean m146480b(C46823d dVar) {
        if (dVar == null || dVar.f120356a == null || ((GuestAuthToken) dVar.f120356a).mo117981a()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final synchronized C46823d mo117912a(C46823d dVar) {
        C46823d dVar2 = (C46823d) this.f120111a.mo117913a();
        if (dVar != null && dVar.equals(dVar2)) {
            m146479b();
        }
        return (C46823d) this.f120111a.mo117913a();
    }

    public C46825e(OAuth2Service oAuth2Service, C46939k<C46823d> kVar) {
        this.f120112b = oAuth2Service;
        this.f120111a = kVar;
    }
}
