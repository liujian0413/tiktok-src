package com.bytedance.lobby.twitter;

import android.app.Application;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.lobby.C12191a;
import com.bytedance.lobby.C12203b;
import com.bytedance.lobby.internal.BaseProvider;
import com.twitter.sdk.android.core.C46940l;
import com.twitter.sdk.android.core.C46966o.C46968a;
import com.twitter.sdk.android.core.TwitterAuthConfig;

class TwitterProvider<T> extends BaseProvider<T> {

    /* renamed from: c */
    private static final boolean f32536c = C12191a.f32435a;

    /* renamed from: d */
    private Application f32537d;

    /* renamed from: e */
    public final void mo29949e() {
        String str = this.f32494b.f32467c;
        String str2 = "";
        Bundle bundle = this.f32494b.f32468d;
        if (bundle != null) {
            str2 = bundle.getString("twitter_consumer_secret");
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            C46940l.m146817a(new C46968a(this.f32537d).mo118101a(f32536c).mo118100a(new TwitterAuthConfig(this.f32494b.f32467c, str2)).mo118102a());
        } else if (f32536c) {
            throw new NullPointerException("Cannot initialize Twitter SDK with an incomplete consumer credentials.");
        }
    }

    TwitterProvider(Application application, C12203b bVar) {
        super(application, bVar);
        this.f32537d = application;
    }
}
