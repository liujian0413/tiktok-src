package com.snapchat.kit.sdk.core.networking;

import android.text.TextUtils;
import com.C1642a;
import com.bytedance.sysoptimizer.BuildConfig;
import com.google.gson.C6600e;
import com.snapchat.kit.sdk.OAuth2Manager;
import com.snapchat.kit.sdk.OAuth2Manager.OnTokenRefreshCallback;
import com.snapchat.kit.sdk.core.controller.C18647a;
import com.snapchat.kit.sdk.core.dagger.scope.SnapConnectScope;
import com.snapchat.kit.sdk.core.models.TokenErrorResponse;
import java.io.IOException;
import java.util.UUID;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;
import okhttp3.Request.Builder;
import okhttp3.Response;

@SnapConnectScope
/* renamed from: com.snapchat.kit.sdk.core.networking.e */
public class C18688e implements Interceptor {

    /* renamed from: a */
    private final OAuth2Manager f50484a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C18647a f50485b;

    /* renamed from: c */
    private final String f50486c;

    /* renamed from: a */
    private synchronized String m61233a() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    /* renamed from: b */
    private static boolean m61235b(TokenErrorResponse tokenErrorResponse) {
        if (tokenErrorResponse == null || TextUtils.isEmpty(tokenErrorResponse.getError()) || !TextUtils.equals(tokenErrorResponse.getError().toLowerCase(), "force_logout")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m61234a(TokenErrorResponse tokenErrorResponse) {
        if (tokenErrorResponse == null || TextUtils.isEmpty(tokenErrorResponse.getError()) || !TextUtils.equals(tokenErrorResponse.getError().toLowerCase(), "invalid_token")) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Builder mo49179a(Chain chain) {
        StringBuilder sb = new StringBuilder("Bearer ");
        sb.append(this.f50484a.mo48851b());
        return chain.request().newBuilder().header("User-Agent", C18685b.f50478a).header("authorization", sb.toString()).header("X-Snap-SDK-OAuth-Client-Id", this.f50486c).header("X-Cloud-Trace-Context", C1642a.m8034a("%s/0;o=1", new Object[]{m61233a()})).header("X-SnapKit-Core-Version", BuildConfig.VERSION_NAME);
    }

    public Response intercept(Chain chain) throws IOException {
        this.f50484a.mo48848a(false);
        Response proceed = chain.proceed(mo49179a(chain).build());
        if (!(proceed == null || proceed.body == null || proceed.code != 401)) {
            TokenErrorResponse tokenErrorResponse = (TokenErrorResponse) new C6600e().mo15973a(proceed.body.charStream(), TokenErrorResponse.class);
            if (m61234a(tokenErrorResponse)) {
                this.f50484a.mo48849a(true, (OnTokenRefreshCallback) new OnTokenRefreshCallback() {
                    public final void onTokenRefreshSucceeded(boolean z) {
                    }

                    public final void onTokenRefreshFailed(boolean z) {
                        if (z) {
                            C18688e.this.f50485b.mo48889a();
                        }
                    }
                });
            } else if (m61235b(tokenErrorResponse)) {
                this.f50484a.mo48845a();
                this.f50485b.mo48889a();
            }
        }
        return proceed;
    }

    C18688e(OAuth2Manager oAuth2Manager, C18647a aVar, String str) {
        this.f50484a = oAuth2Manager;
        this.f50485b = aVar;
        this.f50486c = str;
    }
}
