package com.snapchat.kit.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.snapchat.kit.sdk.core.controller.C18647a;
import com.snapchat.kit.sdk.core.controller.LoginStateController;
import com.snapchat.kit.sdk.core.dagger.scope.SnapConnectScope;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.business.C18673e;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import com.snapchat.kit.sdk.core.networking.AuthTokenManager;
import com.snapchat.kit.sdk.core.security.C18701h;
import dagger.C47369a;
import java.util.List;
import okhttp3.Cache;
import okhttp3.OkHttpClient;

/* renamed from: com.snapchat.kit.sdk.e */
class C18713e {

    /* renamed from: a */
    public final Context f50533a;

    /* renamed from: b */
    public final String f50534b;

    /* renamed from: c */
    public final String f50535c;

    /* renamed from: d */
    private final List<String> f50536d;

    /* renamed from: a */
    static LoginStateController m61276a(C18647a aVar) {
        return aVar;
    }

    /* renamed from: a */
    static AuthTokenManager m61277a(OAuth2Manager oAuth2Manager) {
        return oAuth2Manager;
    }

    @SnapConnectScope
    /* renamed from: a */
    static C6600e m61275a() {
        return new C6600e();
    }

    @SnapConnectScope
    /* renamed from: d */
    static OkHttpClient m61278d() {
        return new OkHttpClient();
    }

    /* renamed from: e */
    static Handler m61279e() {
        return new Handler(Looper.getMainLooper());
    }

    /* access modifiers changed from: 0000 */
    @SnapConnectScope
    /* renamed from: b */
    public final SharedPreferences mo49225b() {
        return C7285c.m22838a(this.f50533a, "com.snapchat.connect.sdk.sharedPreferences", 0);
    }

    /* access modifiers changed from: 0000 */
    @SnapConnectScope
    /* renamed from: c */
    public final Cache mo49226c() {
        return new Cache(this.f50533a.getCacheDir(), 1048576);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0079, code lost:
        r1 = new com.snapchat.kit.sdk.core.security.C18695d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007f, code lost:
        r1 = new com.snapchat.kit.sdk.core.security.C18695d();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0036 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0049 A[Catch:{ JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, Exception -> 0x0079 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0066 A[Catch:{ JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, Exception -> 0x0079 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ExcHandler: JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:1:0x000b] */
    @com.snapchat.kit.sdk.core.dagger.scope.SnapConnectScope
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.snapchat.kit.sdk.core.security.C18701h mo49224a(com.google.gson.C6600e r7, android.content.SharedPreferences r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.f50533a
            java.lang.String r1 = "com.snapchat.connect.sdk.secureSharedPreferences"
            r2 = 0
            android.content.SharedPreferences r0 = com.p280ss.android.ugc.aweme.p340x.C7285c.m22838a(r0, r1, r2)
            java.lang.String r1 = "AndroidKeyStore"
            java.security.KeyStore r1 = java.security.KeyStore.getInstance(r1)     // Catch:{ JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, Exception -> 0x0079 }
            r2 = 0
            r1.load(r2)     // Catch:{ JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, Exception -> 0x0079 }
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, Exception -> 0x0079 }
            r4 = 23
            if (r3 < r4) goto L_0x0027
            java.lang.String r3 = "rsa_public"
            boolean r3 = r8.contains(r3)     // Catch:{ JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, Exception -> 0x0079 }
            if (r3 == 0) goto L_0x0022
            goto L_0x0027
        L_0x0022:
            com.snapchat.kit.sdk.core.security.f r8 = com.snapchat.kit.sdk.core.security.C18700g.m61251a(r1)     // Catch:{ JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, Exception -> 0x0079 }
            goto L_0x0062
        L_0x0027:
            java.lang.String r3 = "rsa_public"
            java.lang.String r3 = r8.getString(r3, r2)     // Catch:{ JsonParseException -> 0x0036, JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f }
            java.lang.Class<com.snapchat.kit.sdk.core.security.e$a> r4 = com.snapchat.kit.sdk.core.security.C18696e.C18698a.class
            java.lang.Object r3 = r7.mo15974a(r3, r4)     // Catch:{ JsonParseException -> 0x0036, JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f }
            com.snapchat.kit.sdk.core.security.e$a r3 = (com.snapchat.kit.sdk.core.security.C18696e.C18698a) r3     // Catch:{ JsonParseException -> 0x0036, JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f }
            r2 = r3
        L_0x0036:
            com.snapchat.kit.sdk.core.security.e r3 = new com.snapchat.kit.sdk.core.security.e     // Catch:{ JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, Exception -> 0x0079 }
            android.content.Context r4 = r6.f50533a     // Catch:{ JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, Exception -> 0x0079 }
            r3.<init>(r1, r4, r2)     // Catch:{ JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, Exception -> 0x0079 }
            com.snapchat.kit.sdk.core.security.e$a r1 = r3.mo49188a()     // Catch:{ JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, Exception -> 0x0079 }
            boolean r1 = r1.equals(r2)     // Catch:{ JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, Exception -> 0x0079 }
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x005e
            android.content.SharedPreferences$Editor r2 = r8.edit()     // Catch:{ JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, Exception -> 0x0079 }
            java.lang.String r4 = "rsa_public"
            com.snapchat.kit.sdk.core.security.e$a r5 = r3.mo49188a()     // Catch:{ JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, Exception -> 0x0079 }
            java.lang.String r5 = r7.mo15979b(r5)     // Catch:{ JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, Exception -> 0x0079 }
            android.content.SharedPreferences$Editor r2 = r2.putString(r4, r5)     // Catch:{ JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, Exception -> 0x0079 }
            r2.apply()     // Catch:{ JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, Exception -> 0x0079 }
        L_0x005e:
            com.snapchat.kit.sdk.core.security.f r8 = com.snapchat.kit.sdk.core.security.C18700g.m61250a(r8, r3, r1)     // Catch:{ JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, Exception -> 0x0079 }
        L_0x0062:
            boolean r1 = r8.f50501b     // Catch:{ JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, Exception -> 0x0079 }
            if (r1 == 0) goto L_0x0071
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, Exception -> 0x0079 }
            android.content.SharedPreferences$Editor r1 = r1.clear()     // Catch:{ JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, Exception -> 0x0079 }
            r1.apply()     // Catch:{ JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, Exception -> 0x0079 }
        L_0x0071:
            com.snapchat.kit.sdk.core.security.b r1 = new com.snapchat.kit.sdk.core.security.b     // Catch:{ JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, Exception -> 0x0079 }
            javax.crypto.SecretKey r8 = r8.f50500a     // Catch:{ JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, Exception -> 0x0079 }
            r1.<init>(r8, r7)     // Catch:{ JsonParseException | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException -> 0x007f, Exception -> 0x0079 }
            goto L_0x0084
        L_0x0079:
            com.snapchat.kit.sdk.core.security.d r1 = new com.snapchat.kit.sdk.core.security.d
            r1.<init>()
            goto L_0x0084
        L_0x007f:
            com.snapchat.kit.sdk.core.security.d r1 = new com.snapchat.kit.sdk.core.security.d
            r1.<init>()
        L_0x0084:
            com.snapchat.kit.sdk.core.security.h r8 = new com.snapchat.kit.sdk.core.security.h
            r8.<init>(r0, r1, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.C18713e.mo49224a(com.google.gson.e, android.content.SharedPreferences):com.snapchat.kit.sdk.core.security.h");
    }

    C18713e(Context context, String str, String str2, List<String> list) {
        this.f50533a = context;
        this.f50534b = str;
        this.f50535c = str2;
        this.f50536d = list;
    }

    /* access modifiers changed from: 0000 */
    @SnapConnectScope
    /* renamed from: a */
    public final OAuth2Manager mo49223a(C18701h hVar, C18647a aVar, OkHttpClient okHttpClient, C6600e eVar, C47369a<MetricQueue<ServerEvent>> aVar2, C18673e eVar2, C47369a<MetricQueue<OpMetric>> aVar3) {
        OAuth2Manager oAuth2Manager = new OAuth2Manager(this.f50534b, this.f50535c, this.f50536d, this.f50533a, hVar, aVar, okHttpClient, eVar, aVar2, eVar2, aVar3);
        return oAuth2Manager;
    }
}
