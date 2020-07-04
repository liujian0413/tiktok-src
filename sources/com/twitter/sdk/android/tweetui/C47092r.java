package com.twitter.sdk.android.tweetui;

import com.twitter.sdk.android.core.C46821b;
import com.twitter.sdk.android.core.C46828g;
import com.twitter.sdk.android.core.TwitterException;

/* renamed from: com.twitter.sdk.android.tweetui.r */
abstract class C47092r<T> extends C46821b<T> {

    /* renamed from: a */
    private final C46821b f120844a;

    /* renamed from: b */
    private final C46828g f120845b;

    /* renamed from: a */
    public final void mo29989a(TwitterException twitterException) {
        twitterException.getMessage();
        if (this.f120844a != null) {
            this.f120844a.mo29989a(twitterException);
        }
    }

    C47092r(C46821b bVar, C46828g gVar) {
        this.f120844a = bVar;
        this.f120845b = gVar;
    }
}
