package com.twitter.sdk.android.core.identity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.twitter.sdk.android.core.C46821b;
import com.twitter.sdk.android.core.C46830i;
import com.twitter.sdk.android.core.C46938j;
import com.twitter.sdk.android.core.C46939k;
import com.twitter.sdk.android.core.C46969q;
import com.twitter.sdk.android.core.C46972t;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthException;
import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.core.internal.scribe.C46898a;
import com.twitter.sdk.android.core.internal.scribe.C46904ad;
import com.twitter.sdk.android.core.internal.scribe.C46908e.C46909a;

public class TwitterAuthClient {

    /* renamed from: a */
    final C46969q f120128a;

    /* renamed from: b */
    final C46836b f120129b;

    /* renamed from: c */
    final C46939k<C46972t> f120130c;

    /* renamed from: d */
    final TwitterAuthConfig f120131d;

    /* renamed from: com.twitter.sdk.android.core.identity.TwitterAuthClient$a */
    static class C46831a {

        /* renamed from: a */
        public static final C46836b f120132a = new C46836b();
    }

    /* renamed from: com.twitter.sdk.android.core.identity.TwitterAuthClient$b */
    static class C46832b extends C46821b<C46972t> {

        /* renamed from: a */
        private final C46939k<C46972t> f120133a;

        /* renamed from: b */
        private final C46821b<C46972t> f120134b;

        /* renamed from: a */
        public final void mo29989a(TwitterException twitterException) {
            this.f120134b.mo29989a(twitterException);
        }

        /* renamed from: a */
        public final void mo29990a(C46830i<C46972t> iVar) {
            this.f120133a.mo117915a((C46938j) iVar.f120123a);
            this.f120134b.mo29990a(iVar);
        }

        C46832b(C46939k<C46972t> kVar, C46821b<C46972t> bVar) {
            this.f120133a = kVar;
            this.f120134b = bVar;
        }
    }

    /* renamed from: a */
    public final int mo117922a() {
        return 140;
    }

    /* renamed from: c */
    private static C46898a m146504c() {
        return C46904ad.m146705a();
    }

    public TwitterAuthClient() {
        this(C46969q.m146847a(), C46969q.m146847a().f120513e, C46969q.m146847a().f120510b, C46831a.f120132a);
    }

    /* renamed from: b */
    private void m146501b() {
        C46898a c = m146504c();
        if (c != null) {
            c.mo118023a(new C46909a().mo118034a("android").mo118036b("login").mo118037c("").mo118038d("").mo118039e("").mo118040f("impression").mo118035a());
        }
    }

    /* renamed from: b */
    private boolean m146503b(Activity activity, C46832b bVar) {
        return this.f120129b.mo117935a(activity, new C46842e(this.f120131d, bVar, 140));
    }

    /* renamed from: a */
    private boolean m146500a(Activity activity, C46832b bVar) {
        if (C46846h.m146545a((Context) activity)) {
            return this.f120129b.mo117935a(activity, new C46846h(this.f120131d, bVar, 140));
        }
        return false;
    }

    /* renamed from: b */
    private void m146502b(Activity activity, C46821b<C46972t> bVar) {
        m146501b();
        C46832b bVar2 = new C46832b(this.f120130c, bVar);
        if (!m146500a(activity, bVar2) && !m146503b(activity, bVar2)) {
            bVar2.mo29989a((TwitterException) new TwitterAuthException("Authorize failed."));
        }
    }

    /* renamed from: a */
    public final void mo117924a(Activity activity, C46821b<C46972t> bVar) {
        if (activity == null) {
            throw new IllegalArgumentException("Activity must not be null.");
        } else if (bVar == null) {
            throw new IllegalArgumentException("Callback must not be null.");
        } else if (!activity.isFinishing()) {
            m146502b(activity, bVar);
        }
    }

    /* renamed from: a */
    public final void mo117923a(int i, int i2, Intent intent) {
        StringBuilder sb = new StringBuilder("onActivityResult called with ");
        sb.append(i);
        sb.append(" ");
        sb.append(i2);
        if (this.f120129b.mo117936b()) {
            C46835a c = this.f120129b.mo117937c();
            if (c != null && c.mo117932a(i, i2, intent)) {
                this.f120129b.mo117934a();
            }
        }
    }

    private TwitterAuthClient(C46969q qVar, TwitterAuthConfig twitterAuthConfig, C46939k<C46972t> kVar, C46836b bVar) {
        this.f120128a = qVar;
        this.f120129b = bVar;
        this.f120131d = twitterAuthConfig;
        this.f120130c = kVar;
    }
}
