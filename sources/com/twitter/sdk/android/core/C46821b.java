package com.twitter.sdk.android.core;

import retrofit2.C48475b;
import retrofit2.C48478d;
import retrofit2.C48516l;

/* renamed from: com.twitter.sdk.android.core.b */
public abstract class C46821b<T> implements C48478d<T> {
    /* renamed from: a */
    public abstract void mo29989a(TwitterException twitterException);

    /* renamed from: a */
    public abstract void mo29990a(C46830i<T> iVar);

    /* renamed from: a */
    public final void mo48914a(C48475b<T> bVar, Throwable th) {
        mo29989a(new TwitterException("Request Failure", th));
    }

    /* renamed from: a */
    public final void mo48915a(C48475b<T> bVar, C48516l<T> lVar) {
        if (lVar.mo123310d()) {
            mo29990a(new C46830i<>(lVar.f123664b, lVar));
        } else {
            mo29989a((TwitterException) new TwitterApiException(lVar));
        }
    }
}
