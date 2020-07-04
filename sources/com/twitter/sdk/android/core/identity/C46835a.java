package com.twitter.sdk.android.core.identity;

import android.app.Activity;
import android.content.Intent;
import com.twitter.sdk.android.core.C46821b;
import com.twitter.sdk.android.core.C46830i;
import com.twitter.sdk.android.core.C46972t;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthException;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.TwitterException;

/* renamed from: com.twitter.sdk.android.core.identity.a */
public abstract class C46835a {

    /* renamed from: a */
    protected final int f120140a;

    /* renamed from: b */
    public final TwitterAuthConfig f120141b;

    /* renamed from: c */
    public final C46821b<C46972t> f120142c;

    /* renamed from: a */
    public abstract boolean mo117933a(Activity activity);

    C46835a(TwitterAuthConfig twitterAuthConfig, C46821b<C46972t> bVar, int i) {
        this.f120141b = twitterAuthConfig;
        this.f120142c = bVar;
        this.f120140a = i;
    }

    /* renamed from: a */
    public final boolean mo117932a(int i, int i2, Intent intent) {
        if (this.f120140a != i) {
            return false;
        }
        C46821b<C46972t> bVar = this.f120142c;
        if (bVar != null) {
            if (i2 == -1) {
                String stringExtra = intent.getStringExtra("tk");
                String stringExtra2 = intent.getStringExtra("ts");
                String stringExtra3 = intent.getStringExtra("screen_name");
                bVar.mo29990a(new C46830i<>(new C46972t(new TwitterAuthToken(stringExtra, stringExtra2), intent.getLongExtra("user_id", 0), stringExtra3), null));
            } else if (intent == null || !intent.hasExtra("auth_error")) {
                bVar.mo29989a((TwitterException) new TwitterAuthException("Authorize failed."));
            } else {
                bVar.mo29989a((TwitterException) (TwitterAuthException) intent.getSerializableExtra("auth_error"));
            }
        }
        return true;
    }
}
