package com.facebook.login;

import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import com.C1642a;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.C13499h;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookServiceException;
import com.facebook.internal.C13967z;
import com.facebook.login.LoginClient.Request;
import com.facebook.login.LoginClient.Result;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.util.Collection;
import java.util.Locale;

abstract class WebLoginMethodHandler extends LoginMethodHandler {

    /* renamed from: c */
    private String f37241c;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo33725c() {
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s_ */
    public abstract AccessTokenSource mo33727s_();

    /* renamed from: e */
    private static final String m41631e() {
        StringBuilder sb = new StringBuilder("fb");
        sb.append(C13499h.m39725k());
        sb.append("://authorize");
        return sb.toString();
    }

    /* renamed from: f */
    private String m41632f() {
        return C7285c.m22838a(this.f37240b.mo33770a(), "com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).getString("TOKEN", "");
    }

    WebLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }

    WebLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* renamed from: c */
    private void m41630c(String str) {
        C7285c.m22838a(this.f37240b.mo33770a(), "com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", str).apply();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Bundle mo33819b(Request request) {
        String str;
        Bundle bundle = new Bundle();
        if (!C13967z.m41250a((Collection<T>) request.f37201b)) {
            String join = TextUtils.join(",", request.f37201b);
            bundle.putString("scope", join);
            mo33813a("scope", join);
        }
        bundle.putString("default_audience", request.f37202c.getNativeProtocolAudience());
        bundle.putString("state", mo33811a(request.f37204e));
        AccessToken a = AccessToken.m38225a();
        if (a != null) {
            str = a.f34627e;
        } else {
            str = null;
        }
        if (str == null || !str.equals(m41632f())) {
            C14104f.m41663a(this.f37240b.mo33770a());
            mo33813a("access_token", "0");
        } else {
            bundle.putString("access_token", str);
            mo33813a("access_token", "1");
        }
        return bundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Bundle mo33817a(Bundle bundle, Request request) {
        bundle.putString("redirect_uri", m41631e());
        bundle.putString("client_id", request.f37203d);
        bundle.putString("e2e", LoginClient.m41540h());
        bundle.putString("response_type", "token,signed_request");
        bundle.putString("return_scopes", "true");
        bundle.putString("auth_type", request.f37207h);
        if (mo33725c() != null) {
            bundle.putString("sso", mo33725c());
        }
        return bundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo33818a(Request request, Bundle bundle, FacebookException facebookException) {
        Result result;
        String str;
        this.f37241c = null;
        if (bundle != null) {
            if (bundle.containsKey("e2e")) {
                this.f37241c = bundle.getString("e2e");
            }
            try {
                AccessToken a = m41611a(request.f37201b, bundle, mo33727s_(), request.f37203d);
                result = Result.m41563a(this.f37240b.f37196g, a);
                CookieSyncManager.createInstance(this.f37240b.mo33770a()).sync();
                m41630c(a.f34627e);
            } catch (FacebookException e) {
                result = Result.m41565a(this.f37240b.f37196g, null, e.getMessage());
            }
        } else if (facebookException instanceof FacebookOperationCanceledException) {
            result = Result.m41564a(this.f37240b.f37196g, "User canceled log in.");
        } else {
            this.f37241c = null;
            String message = facebookException.getMessage();
            if (facebookException instanceof FacebookServiceException) {
                FacebookRequestError requestError = ((FacebookServiceException) facebookException).getRequestError();
                str = C1642a.m8035a(Locale.ROOT, "%d", new Object[]{Integer.valueOf(requestError.f34654d)});
                message = requestError.toString();
            } else {
                str = null;
            }
            result = Result.m41566a(this.f37240b.f37196g, null, message, str);
        }
        if (!C13967z.m41249a(this.f37241c)) {
            mo33814b(this.f37241c);
        }
        this.f37240b.mo33773a(result);
    }
}
