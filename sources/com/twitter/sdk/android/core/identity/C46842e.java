package com.twitter.sdk.android.core.identity;

import android.app.Activity;
import android.content.Intent;
import com.twitter.sdk.android.core.C46821b;
import com.twitter.sdk.android.core.C46972t;
import com.twitter.sdk.android.core.TwitterAuthConfig;

/* renamed from: com.twitter.sdk.android.core.identity.e */
final class C46842e extends C46835a {
    /* renamed from: b */
    private Intent m146539b(Activity activity) {
        Intent intent = new Intent(activity, OAuthActivity.class);
        intent.putExtra("auth_config", this.f120141b);
        return intent;
    }

    /* renamed from: a */
    public final boolean mo117933a(Activity activity) {
        activity.startActivityForResult(m146539b(activity), this.f120140a);
        return true;
    }

    C46842e(TwitterAuthConfig twitterAuthConfig, C46821b<C46972t> bVar, int i) {
        super(twitterAuthConfig, bVar, i);
    }
}
