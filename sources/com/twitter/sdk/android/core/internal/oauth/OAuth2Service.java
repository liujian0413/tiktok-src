package com.twitter.sdk.android.core.internal.oauth;

import com.twitter.sdk.android.core.C46821b;
import com.twitter.sdk.android.core.C46830i;
import com.twitter.sdk.android.core.C46969q;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.core.internal.C46892r;
import com.twitter.sdk.android.core.internal.p1845a.C46858f;
import okio.ByteString;
import retrofit2.C48475b;
import retrofit2.p363b.C7727c;
import retrofit2.p363b.C7729e;
import retrofit2.p363b.C7733i;
import retrofit2.p363b.C7735k;
import retrofit2.p363b.C7739o;

public final class OAuth2Service extends C46888d {

    /* renamed from: a */
    OAuth2Api f120211a = ((OAuth2Api) this.f120232e.mo123312a(OAuth2Api.class));

    interface OAuth2Api {
        @C7739o(mo20429a = "/oauth2/token")
        @C7729e
        @C7735k(mo20426a = {"Content-Type: application/x-www-form-urlencoded;charset=UTF-8"})
        C48475b<OAuth2Token> getAppAuthToken(@C7733i(mo20425a = "Authorization") String str, @C7727c(mo20417a = "grant_type") String str2);

        @C7739o(mo20429a = "/1.1/guest/activate.json")
        C48475b<C46885a> getGuestToken(@C7733i(mo20425a = "Authorization") String str);
    }

    /* renamed from: a */
    private String m146644a() {
        TwitterAuthConfig twitterAuthConfig = this.f120229b.f120513e;
        StringBuilder sb = new StringBuilder();
        sb.append(C46858f.m146570b(twitterAuthConfig.f120104a));
        sb.append(":");
        sb.append(C46858f.m146570b(twitterAuthConfig.f120105b));
        ByteString encodeUtf8 = ByteString.encodeUtf8(sb.toString());
        StringBuilder sb2 = new StringBuilder("Basic ");
        sb2.append(encodeUtf8.base64());
        return sb2.toString();
    }

    /* renamed from: b */
    private void m146646b(C46821b<OAuth2Token> bVar) {
        this.f120211a.getAppAuthToken(m146644a(), "client_credentials").mo123283a(bVar);
    }

    /* renamed from: a */
    public final void mo117990a(final C46821b<GuestAuthToken> bVar) {
        m146646b(new C46821b<OAuth2Token>() {
            /* renamed from: a */
            public final void mo29989a(TwitterException twitterException) {
                if (bVar != null) {
                    bVar.mo29989a(twitterException);
                }
            }

            /* renamed from: a */
            public final void mo29990a(C46830i<OAuth2Token> iVar) {
                final OAuth2Token oAuth2Token = (OAuth2Token) iVar.f120123a;
                OAuth2Service.this.mo117991a(new C46821b<C46885a>() {
                    /* renamed from: a */
                    public final void mo29989a(TwitterException twitterException) {
                        bVar.mo29989a(twitterException);
                    }

                    /* renamed from: a */
                    public final void mo29990a(C46830i<C46885a> iVar) {
                        bVar.mo29990a(new C46830i<>(new GuestAuthToken(oAuth2Token.f120216c, oAuth2Token.f120217d, ((C46885a) iVar.f120123a).f120221a), null));
                    }
                }, oAuth2Token);
            }
        });
    }

    /* renamed from: a */
    private static String m146645a(OAuth2Token oAuth2Token) {
        StringBuilder sb = new StringBuilder("Bearer ");
        sb.append(oAuth2Token.f120217d);
        return sb.toString();
    }

    public OAuth2Service(C46969q qVar, C46892r rVar) {
        super(qVar, rVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo117991a(C46821b<C46885a> bVar, OAuth2Token oAuth2Token) {
        this.f120211a.getGuestToken(m146645a(oAuth2Token)).mo123283a(bVar);
    }
}
