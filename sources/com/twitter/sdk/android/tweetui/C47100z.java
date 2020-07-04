package com.twitter.sdk.android.tweetui;

import com.twitter.sdk.android.core.C46821b;
import com.twitter.sdk.android.core.C46830i;
import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.core.models.C46959o;

/* renamed from: com.twitter.sdk.android.tweetui.z */
final class C47100z extends C46821b<C46959o> {

    /* renamed from: a */
    final C47037e f120860a;

    /* renamed from: b */
    final C47018aj f120861b;

    /* renamed from: c */
    final C46821b<C46959o> f120862c;

    /* renamed from: a */
    public final void mo29989a(TwitterException twitterException) {
        if (this.f120862c != null) {
            this.f120862c.mo29989a(twitterException);
        }
    }

    /* renamed from: a */
    public final void mo29990a(C46830i<C46959o> iVar) {
        this.f120861b.mo118224b((C46959o) iVar.f120123a);
        this.f120860a.setTweet((C46959o) iVar.f120123a);
        if (this.f120862c != null) {
            this.f120862c.mo29990a(iVar);
        }
    }

    C47100z(C47037e eVar, C47018aj ajVar, C46821b<C46959o> bVar) {
        this.f120860a = eVar;
        this.f120861b = ajVar;
        this.f120862c = bVar;
    }
}
