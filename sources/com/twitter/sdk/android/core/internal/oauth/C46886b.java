package com.twitter.sdk.android.core.internal.oauth;

import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import java.util.Map;

/* renamed from: com.twitter.sdk.android.core.internal.oauth.b */
public final class C46886b {
    /* renamed from: b */
    private static C46887c m146658b(TwitterAuthConfig twitterAuthConfig, TwitterAuthToken twitterAuthToken, String str, String str2, String str3, Map<String, String> map) {
        C46887c cVar = new C46887c(twitterAuthConfig, twitterAuthToken, str, str2, str3, map);
        return cVar;
    }

    /* renamed from: a */
    public final String mo118003a(TwitterAuthConfig twitterAuthConfig, TwitterAuthToken twitterAuthToken, String str, String str2, String str3, Map<String, String> map) {
        return m146658b(twitterAuthConfig, twitterAuthToken, str, str2, str3, map).mo118004a();
    }
}
