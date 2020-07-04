package com.snapchat.kit.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.C1642a;
import com.google.gson.C6600e;
import com.snapchat.kit.sdk.core.controller.C18647a;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.business.C18673e;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import com.snapchat.kit.sdk.core.models.AuthToken;
import com.snapchat.kit.sdk.core.models.AuthorizationRequest;
import com.snapchat.kit.sdk.core.models.TokenErrorResponse;
import com.snapchat.kit.sdk.core.networking.AuthTokenManager;
import com.snapchat.kit.sdk.core.security.C18701h;
import com.snapchat.kit.sdk.p805a.C18641a;
import com.snapchat.kit.sdk.p805a.C18641a.C18642a;
import com.snapchat.kit.sdk.util.SnapUtils;
import dagger.C47369a;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody.Builder;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public final class OAuth2Manager implements AuthTokenManager {

    /* renamed from: a */
    static final Set<String> f50335a = new HashSet<String>() {
        {
            add("invalid_grant");
            add("invalid_request");
            add("invalid_scope");
            add("unsupported_grant_type");
        }
    };

    /* renamed from: b */
    public AuthorizationRequest f50336b;

    /* renamed from: c */
    private final String f50337c;

    /* renamed from: d */
    private final String f50338d;

    /* renamed from: e */
    private final List<String> f50339e;

    /* renamed from: f */
    private final Context f50340f;

    /* renamed from: g */
    private final C18701h f50341g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C18647a f50342h;

    /* renamed from: i */
    private final OkHttpClient f50343i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C6600e f50344j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C47369a<MetricQueue<ServerEvent>> f50345k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C18673e f50346l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C18641a f50347m;

    /* renamed from: n */
    private AtomicReference<AuthToken> f50348n;

    /* renamed from: o */
    private final AtomicBoolean f50349o = new AtomicBoolean(false);

    /* renamed from: p */
    private int f50350p = 0;

    public interface OnTokenRefreshCallback {
        void onTokenRefreshFailed(boolean z);

        void onTokenRefreshSucceeded(boolean z);
    }

    /* renamed from: com.snapchat.kit.sdk.OAuth2Manager$a */
    static class C18639a extends AsyncTask<Void, Void, Void> {

        /* renamed from: a */
        private final WeakReference<OAuth2Manager> f50361a;

        /* renamed from: b */
        private final boolean f50362b;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            OAuth2Manager oAuth2Manager = (OAuth2Manager) this.f50361a.get();
            if (oAuth2Manager == null) {
                return null;
            }
            oAuth2Manager.mo48848a(this.f50362b);
            return null;
        }

        private C18639a(OAuth2Manager oAuth2Manager, boolean z) {
            this.f50361a = new WeakReference<>(oAuth2Manager);
            this.f50362b = z;
        }
    }

    /* renamed from: a */
    public final void mo48845a() {
        this.f50348n.set(null);
        m61123c((AuthToken) null);
    }

    /* renamed from: a */
    public final void mo48848a(boolean z) {
        mo48849a(z, (OnTokenRefreshCallback) null);
    }

    /* renamed from: a */
    public final void mo48849a(boolean z, OnTokenRefreshCallback onTokenRefreshCallback) {
        Request a = m61110a(z, m61121c());
        if (a != null && this.f50349o.compareAndSet(false, true)) {
            this.f50347m.mo48876a(C18642a.REFRESH);
            try {
                m61115a(this.f50343i.newCall(a).execute(), onTokenRefreshCallback);
            } catch (Exception unused) {
            } catch (Throwable th) {
                this.f50349o.set(false);
                throw th;
            }
            this.f50349o.set(false);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo48847a(AuthToken authToken) {
        AuthToken f = m61128f();
        if (m61119b(authToken) && (f == null || f.getLastUpdated() <= authToken.getLastUpdated())) {
            m61123c(authToken);
            this.f50348n.set(authToken);
        }
    }

    /* renamed from: a */
    public final void mo48846a(Uri uri) {
        AuthorizationRequest authorizationRequest = this.f50336b;
        if (uri == null || TextUtils.isEmpty(uri.getQueryParameter("code")) || TextUtils.isEmpty(uri.getQueryParameter("state")) || authorizationRequest == null || !TextUtils.equals(uri.getQueryParameter("state"), authorizationRequest.getState()) || TextUtils.isEmpty(authorizationRequest.getRedirectUri()) || TextUtils.isEmpty(authorizationRequest.getCodeVerifier())) {
            ((MetricQueue) this.f50345k.get()).push(this.f50346l.mo48922a(false));
            this.f50342h.mo48891c();
            return;
        }
        this.f50350p = 0;
        Builder builder = new Builder();
        builder.add("grant_type", "authorization_code");
        builder.add("code", uri.getQueryParameter("code"));
        builder.add("redirect_uri", authorizationRequest.getRedirectUri());
        builder.add("client_id", this.f50337c);
        builder.add("code_verifier", authorizationRequest.getCodeVerifier());
        Request a = m61109a((RequestBody) builder.build(), "/accounts/oauth2/token");
        if (a == null) {
            ((MetricQueue) this.f50345k.get()).push(this.f50346l.mo48922a(false));
            this.f50342h.mo48891c();
            return;
        }
        this.f50342h.mo48892d();
        this.f50347m.mo48876a(C18642a.GRANT);
        this.f50343i.newCall(a).enqueue(new Callback() {
            public final void onFailure(Call call, IOException iOException) {
                OAuth2Manager.m61114a((Runnable) new Runnable() {
                    public final void run() {
                        ((MetricQueue) OAuth2Manager.this.f50345k.get()).push(OAuth2Manager.this.f50346l.mo48922a(false));
                        OAuth2Manager.this.f50347m.mo48877a(C18642a.GRANT, false);
                        OAuth2Manager.this.f50342h.mo48891c();
                    }
                });
            }

            public final void onResponse(Call call, Response response) {
                if (!(!response.isSuccessful() || response.body == null || response.body.charStream() == null)) {
                    AuthToken authToken = (AuthToken) OAuth2Manager.this.f50344j.mo15973a(response.body.charStream(), AuthToken.class);
                    if (OAuth2Manager.m61119b(authToken)) {
                        authToken.setLastUpdated(System.currentTimeMillis());
                        OAuth2Manager.this.mo48847a(authToken);
                        OAuth2Manager.this.f50336b = null;
                        OAuth2Manager.this.f50347m.mo48877a(C18642a.GRANT, true);
                        OAuth2Manager.m61114a((Runnable) new Runnable() {
                            public final void run() {
                                ((MetricQueue) OAuth2Manager.this.f50345k.get()).push(OAuth2Manager.this.f50346l.mo48922a(true));
                                OAuth2Manager.this.f50342h.mo48890b();
                            }
                        });
                        return;
                    }
                }
                OAuth2Manager.m61114a((Runnable) new Runnable() {
                    public final void run() {
                        ((MetricQueue) OAuth2Manager.this.f50345k.get()).push(OAuth2Manager.this.f50346l.mo48922a(false));
                        OAuth2Manager.this.f50347m.mo48877a(C18642a.GRANT, false);
                        OAuth2Manager.this.f50342h.mo48891c();
                    }
                });
            }
        });
    }

    /* renamed from: a */
    public final boolean mo48850a(Intent intent) {
        if (intent == null) {
            return false;
        }
        Uri data = intent.getData();
        if (data == null) {
            return false;
        }
        return data.toString().startsWith(this.f50338d);
    }

    /* renamed from: a */
    private static boolean m61116a(Context context, PackageManager packageManager, String str, Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.setPackage(str);
        intent.setFlags(268435456);
        if (intent.resolveActivity(packageManager) == null) {
            return false;
        }
        context.startActivity(intent);
        return true;
    }

    /* renamed from: c */
    private AuthToken m61121c() {
        m61127e();
        return (AuthToken) this.f50348n.get();
    }

    /* renamed from: d */
    private String m61125d() {
        AuthToken c = m61121c();
        if (c == null) {
            return null;
        }
        return c.getRefreshToken();
    }

    /* renamed from: f */
    private AuthToken m61128f() {
        return (AuthToken) this.f50341g.get("auth_token", AuthToken.class);
    }

    /* renamed from: b */
    public final String mo48851b() {
        AuthToken c = m61121c();
        if (c == null) {
            return null;
        }
        return c.getAccessToken();
    }

    public final boolean isUserLoggedIn() {
        if (!TextUtils.isEmpty(mo48851b())) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m61127e() {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.concurrent.atomic.AtomicReference<com.snapchat.kit.sdk.core.models.AuthToken> r0 = r4.f50348n     // Catch:{ all -> 0x002b }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x002b }
            if (r0 != 0) goto L_0x0029
            com.snapchat.kit.sdk.core.models.AuthToken r0 = r4.m61128f()     // Catch:{ all -> 0x002b }
            if (r0 != 0) goto L_0x0011
            monitor-exit(r4)
            return
        L_0x0011:
            java.lang.String r1 = r0.getScope()     // Catch:{ all -> 0x002b }
            if (r1 != 0) goto L_0x0024
            com.snapchat.kit.sdk.OAuth2Manager$a r1 = new com.snapchat.kit.sdk.OAuth2Manager$a     // Catch:{ all -> 0x002b }
            r2 = 1
            r3 = 0
            r1.<init>()     // Catch:{ all -> 0x002b }
            r2 = 0
            java.lang.Void[] r2 = new java.lang.Void[r2]     // Catch:{ all -> 0x002b }
            r1.execute(r2)     // Catch:{ all -> 0x002b }
        L_0x0024:
            java.util.concurrent.atomic.AtomicReference<com.snapchat.kit.sdk.core.models.AuthToken> r1 = r4.f50348n     // Catch:{ all -> 0x002b }
            r1.set(r0)     // Catch:{ all -> 0x002b }
        L_0x0029:
            monitor-exit(r4)
            return
        L_0x002b:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.OAuth2Manager.m61127e():void");
    }

    public final void revokeToken() {
        AuthToken c = m61121c();
        if (c != null) {
            Builder builder = new Builder();
            builder.add("token", c.getRefreshToken());
            builder.add("client_id", this.f50337c);
            Request a = m61109a((RequestBody) builder.build(), "/accounts/oauth2/revoke");
            if (a != null) {
                this.f50347m.mo48876a(C18642a.REVOKE);
                this.f50343i.newCall(a).enqueue(new Callback() {
                    public final void onFailure(Call call, IOException iOException) {
                        OAuth2Manager.this.f50347m.mo48877a(C18642a.REVOKE, false);
                    }

                    public final void onResponse(Call call, Response response) throws IOException {
                        response.isSuccessful();
                        OAuth2Manager.this.f50347m.mo48877a(C18642a.REVOKE, true);
                    }
                });
                this.f50348n.set(null);
                m61123c((AuthToken) null);
                this.f50342h.mo48889a();
            }
        }
    }

    public final void startTokenGrant() {
        if (TextUtils.isEmpty(this.f50338d)) {
            throw new IllegalStateException("Redirect URL must be set!");
        } else if (this.f50339e == null || this.f50339e.isEmpty()) {
            throw new IllegalStateException("Valid scopes must be set");
        } else {
            AuthorizationRequest a = C18643b.m61147a(this.f50337c, this.f50338d, this.f50339e);
            this.f50336b = a;
            PackageManager packageManager = this.f50340f.getPackageManager();
            String str = "com.snapchat.android";
            if (this.f50350p >= 3 || !SnapUtils.isSnapchatInstalled(packageManager, str) || !m61116a(this.f50340f, packageManager, str, a.toUri("snapchat://", "oauth2", this.f50340f.getPackageName(), null))) {
                Uri uri = a.toUri("https://accounts.snapchat.com/accounts", "/oauth2/auth", null, "snapkit_web");
                this.f50347m.mo48878a("authWeb");
                m61111a(uri, this.f50340f);
                ((MetricQueue) this.f50345k.get()).push(this.f50346l.mo48921a());
                return;
            }
            this.f50347m.mo48878a("authSnapchat");
            ((MetricQueue) this.f50345k.get()).push(this.f50346l.mo48921a());
            this.f50350p++;
        }
    }

    /* renamed from: c */
    private synchronized void m61123c(AuthToken authToken) {
        this.f50341g.put("auth_token", authToken);
    }

    /* renamed from: a */
    private AuthToken m61107a(Response response) throws IOException {
        if (response == null || !response.isSuccessful() || response.body == null || response.body.charStream() == null) {
            return null;
        }
        return (AuthToken) this.f50344j.mo15973a(response.body.charStream(), AuthToken.class);
    }

    /* renamed from: b */
    private TokenErrorResponse m61118b(Response response) throws IOException {
        if (response == null || response.isSuccessful() || response.code != 400) {
            return null;
        }
        return (TokenErrorResponse) this.f50344j.mo15973a(response.body.charStream(), TokenErrorResponse.class);
    }

    public final boolean hasAccessToScope(String str) {
        AuthToken c = m61121c();
        if (c == null || c.getScope() == null) {
            return false;
        }
        return Arrays.asList(c.getScope().split(" ")).contains(str);
    }

    /* renamed from: b */
    static boolean m61119b(AuthToken authToken) {
        if (authToken == null || TextUtils.isEmpty(authToken.getAccessToken()) || TextUtils.isEmpty(authToken.getRefreshToken()) || !TextUtils.equals(authToken.getTokenType(), "Bearer") || authToken.getExpiresIn() <= 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m61114a(Runnable runnable) {
        new Handler(Looper.getMainLooper()).post(runnable);
    }

    /* renamed from: a */
    private static void m61111a(Uri uri, Context context) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            intent.setFlags(268435456);
            context.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private static Request m61109a(RequestBody requestBody, String str) {
        return new Request.Builder().header("Content-Type", "application/x-www-form-urlencoded").url(C1642a.m8034a("%s%s", new Object[]{"https://accounts.snapchat.com", str})).post(requestBody).build();
    }

    /* renamed from: a */
    private Request m61110a(boolean z, AuthToken authToken) {
        if (!m61119b(authToken) || !m61120b(z, authToken)) {
            return null;
        }
        Builder builder = new Builder();
        builder.add("grant_type", "refresh_token");
        builder.add("refresh_token", authToken.getRefreshToken());
        builder.add("client_id", this.f50337c);
        return m61109a((RequestBody) builder.build(), "/accounts/oauth2/token");
    }

    /* renamed from: b */
    private static boolean m61120b(boolean z, AuthToken authToken) {
        boolean z2;
        boolean z3;
        boolean z4;
        double currentTimeMillis = (double) (System.currentTimeMillis() - authToken.getLastUpdated());
        double expiresInMillis = (double) authToken.getExpiresInMillis();
        Double.isNaN(expiresInMillis);
        if (currentTimeMillis >= Math.min(3600000.0d, expiresInMillis / 2.0d)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (System.currentTimeMillis() >= authToken.getLastUpdated() + authToken.getExpiresInMillis()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (authToken.getScope() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z || z2 || z3 || z4) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m61115a(Response response, OnTokenRefreshCallback onTokenRefreshCallback) throws IOException {
        AuthToken a = m61107a(response);
        if (a != null) {
            if (TextUtils.isEmpty(a.getRefreshToken())) {
                a.setRefreshToken(m61125d());
            }
            if (m61119b(a)) {
                a.setLastUpdated(System.currentTimeMillis());
                mo48847a(a);
                this.f50347m.mo48877a(C18642a.REFRESH, true);
                m61112a(onTokenRefreshCallback, true, true, false);
                return;
            }
        }
        TokenErrorResponse b = m61118b(response);
        if (b == null || TextUtils.isEmpty(b.getError()) || !f50335a.contains(b.getError().toLowerCase())) {
            this.f50347m.mo48877a(C18642a.REFRESH, false);
            m61112a(onTokenRefreshCallback, false, false, false);
            return;
        }
        mo48845a();
        this.f50347m.mo48877a(C18642a.REFRESH, false);
        m61112a(onTokenRefreshCallback, false, false, true);
    }

    /* renamed from: a */
    private void m61112a(OnTokenRefreshCallback onTokenRefreshCallback, boolean z, boolean z2, boolean z3) {
        if (onTokenRefreshCallback != null) {
            final boolean z4 = z;
            final OnTokenRefreshCallback onTokenRefreshCallback2 = onTokenRefreshCallback;
            final boolean z5 = z2;
            final boolean z6 = z3;
            C186384 r0 = new Runnable() {
                public final void run() {
                    if (z4) {
                        onTokenRefreshCallback2.onTokenRefreshSucceeded(z5);
                    } else {
                        onTokenRefreshCallback2.onTokenRefreshFailed(z6);
                    }
                }
            };
            m61114a((Runnable) r0);
        }
    }

    OAuth2Manager(String str, String str2, List<String> list, Context context, C18701h hVar, C18647a aVar, OkHttpClient okHttpClient, C6600e eVar, C47369a<MetricQueue<ServerEvent>> aVar2, C18673e eVar2, C47369a<MetricQueue<OpMetric>> aVar3) {
        this.f50337c = str;
        this.f50338d = str2;
        this.f50339e = list;
        this.f50340f = context;
        this.f50341g = hVar;
        this.f50342h = aVar;
        this.f50343i = okHttpClient;
        this.f50344j = eVar;
        this.f50345k = aVar2;
        this.f50346l = eVar2;
        this.f50347m = new C18641a(aVar3);
        this.f50348n = new AtomicReference<>(null);
    }
}
