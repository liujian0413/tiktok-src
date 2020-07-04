package com.twitter.sdk.android.core.internal.oauth;

import android.net.Uri;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.twitter.sdk.android.core.C46821b;
import com.twitter.sdk.android.core.C46969q;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.core.internal.C46892r;
import com.twitter.sdk.android.core.internal.p1845a.C46858f;
import java.util.TreeMap;
import okhttp3.ResponseBody;
import retrofit2.C48475b;
import retrofit2.p363b.C7733i;
import retrofit2.p363b.C7739o;
import retrofit2.p363b.C7744t;

public final class OAuth1aService extends C46888d {

    /* renamed from: a */
    OAuthApi f120208a = ((OAuthApi) this.f120232e.mo123312a(OAuthApi.class));

    interface OAuthApi {
        @C7739o(mo20429a = "/oauth/access_token")
        C48475b<ResponseBody> getAccessToken(@C7733i(mo20425a = "Authorization") String str, @C7744t(mo20436a = "oauth_verifier") String str2);

        @C7739o(mo20429a = "/oauth/request_token")
        C48475b<ResponseBody> getTempToken(@C7733i(mo20425a = "Authorization") String str);
    }

    /* renamed from: a */
    private String m146635a() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f120230c.f120234a);
        sb.append("/oauth/request_token");
        return sb.toString();
    }

    /* renamed from: b */
    private String m146637b() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f120230c.f120234a);
        sb.append("/oauth/access_token");
        return sb.toString();
    }

    /* renamed from: b */
    private C46821b<ResponseBody> m146636b(final C46821b<OAuthResponse> bVar) {
        return new C46821b<ResponseBody>() {
            /* renamed from: a */
            public final void mo29989a(TwitterException twitterException) {
                bVar.mo29989a(twitterException);
            }

            /* JADX WARNING: Removed duplicated region for block: B:17:0x0059 A[Catch:{ IOException -> 0x005d }] */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void mo29990a(com.twitter.sdk.android.core.C46830i<okhttp3.ResponseBody> r5) {
                /*
                    r4 = this;
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    r1 = 0
                    java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x0056 }
                    java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ all -> 0x0056 }
                    T r5 = r5.f120123a     // Catch:{ all -> 0x0056 }
                    okhttp3.ResponseBody r5 = (okhttp3.ResponseBody) r5     // Catch:{ all -> 0x0056 }
                    java.io.InputStream r5 = r5.byteStream()     // Catch:{ all -> 0x0056 }
                    r3.<init>(r5)     // Catch:{ all -> 0x0056 }
                    r2.<init>(r3)     // Catch:{ all -> 0x0056 }
                L_0x0018:
                    java.lang.String r5 = r2.readLine()     // Catch:{ all -> 0x0053 }
                    if (r5 == 0) goto L_0x0022
                    r0.append(r5)     // Catch:{ all -> 0x0053 }
                    goto L_0x0018
                L_0x0022:
                    r2.close()     // Catch:{ IOException -> 0x005d }
                    java.lang.String r5 = r0.toString()     // Catch:{ IOException -> 0x005d }
                    com.twitter.sdk.android.core.internal.oauth.OAuthResponse r0 = com.twitter.sdk.android.core.internal.oauth.OAuth1aService.m146634a(r5)     // Catch:{ IOException -> 0x005d }
                    if (r0 != 0) goto L_0x0048
                    com.twitter.sdk.android.core.b r0 = r2     // Catch:{ IOException -> 0x005d }
                    com.twitter.sdk.android.core.TwitterAuthException r1 = new com.twitter.sdk.android.core.TwitterAuthException     // Catch:{ IOException -> 0x005d }
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x005d }
                    java.lang.String r3 = "Failed to parse auth response: "
                    r2.<init>(r3)     // Catch:{ IOException -> 0x005d }
                    r2.append(r5)     // Catch:{ IOException -> 0x005d }
                    java.lang.String r5 = r2.toString()     // Catch:{ IOException -> 0x005d }
                    r1.<init>(r5)     // Catch:{ IOException -> 0x005d }
                    r0.mo29989a(r1)     // Catch:{ IOException -> 0x005d }
                    goto L_0x006e
                L_0x0048:
                    com.twitter.sdk.android.core.b r5 = r2     // Catch:{ IOException -> 0x005d }
                    com.twitter.sdk.android.core.i r2 = new com.twitter.sdk.android.core.i     // Catch:{ IOException -> 0x005d }
                    r2.<init>(r0, r1)     // Catch:{ IOException -> 0x005d }
                    r5.mo29990a(r2)     // Catch:{ IOException -> 0x005d }
                    return
                L_0x0053:
                    r5 = move-exception
                    r1 = r2
                    goto L_0x0057
                L_0x0056:
                    r5 = move-exception
                L_0x0057:
                    if (r1 == 0) goto L_0x005f
                    r1.close()     // Catch:{ IOException -> 0x005d }
                    goto L_0x005f
                L_0x005d:
                    r5 = move-exception
                    goto L_0x0060
                L_0x005f:
                    throw r5     // Catch:{ IOException -> 0x005d }
                L_0x0060:
                    com.twitter.sdk.android.core.b r0 = r2
                    com.twitter.sdk.android.core.TwitterAuthException r1 = new com.twitter.sdk.android.core.TwitterAuthException
                    java.lang.String r2 = r5.getMessage()
                    r1.<init>(r2, r5)
                    r0.mo29989a(r1)
                L_0x006e:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.twitter.sdk.android.core.internal.oauth.OAuth1aService.C468801.mo29990a(com.twitter.sdk.android.core.i):void");
            }
        };
    }

    /* renamed from: a */
    public final String mo117984a(TwitterAuthConfig twitterAuthConfig) {
        return Uri.parse("twittersdk://callback").buildUpon().appendQueryParameter(C38347c.f99551f, C46969q.m146848b()).appendQueryParameter("app", twitterAuthConfig.f120104a).build().toString();
    }

    /* renamed from: a */
    public static OAuthResponse m146634a(String str) {
        long j;
        TreeMap a = C46858f.m146568a(str, false);
        String str2 = (String) a.get("oauth_token");
        String str3 = (String) a.get("oauth_token_secret");
        String str4 = (String) a.get("screen_name");
        if (a.containsKey("user_id")) {
            j = Long.parseLong((String) a.get("user_id"));
        } else {
            j = 0;
        }
        if (str2 == null || str3 == null) {
            return null;
        }
        return new OAuthResponse(new TwitterAuthToken(str2, str3), str4, j);
    }

    /* renamed from: a */
    public final String mo117985a(TwitterAuthToken twitterAuthToken) {
        return this.f120230c.mo118007a("oauth", "authorize").appendQueryParameter("oauth_token", twitterAuthToken.f120106b).build().toString();
    }

    /* renamed from: a */
    public final void mo117986a(C46821b<OAuthResponse> bVar) {
        TwitterAuthConfig twitterAuthConfig = this.f120229b.f120513e;
        this.f120208a.getTempToken(new C46886b().mo118003a(twitterAuthConfig, null, mo117984a(twitterAuthConfig), "POST", m146635a(), null)).mo123283a(m146636b(bVar));
    }

    public OAuth1aService(C46969q qVar, C46892r rVar) {
        super(qVar, rVar);
    }

    /* renamed from: a */
    public final void mo117987a(C46821b<OAuthResponse> bVar, TwitterAuthToken twitterAuthToken, String str) {
        TwitterAuthToken twitterAuthToken2 = twitterAuthToken;
        this.f120208a.getAccessToken(new C46886b().mo118003a(this.f120229b.f120513e, twitterAuthToken2, null, "POST", m146637b(), null), str).mo123283a(m146636b(bVar));
    }
}
