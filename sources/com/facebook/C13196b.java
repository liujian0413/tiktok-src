package com.facebook;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.p022v4.content.C0688e;
import com.facebook.AccessToken.C13078a;
import com.facebook.C14064l.C14065a;
import com.facebook.GraphRequest.C13090b;
import com.facebook.internal.C13876aa;
import com.facebook.internal.C13967z;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.b */
public final class C13196b {

    /* renamed from: c */
    private static volatile C13196b f34953c;

    /* renamed from: a */
    public AccessToken f34954a;

    /* renamed from: b */
    public AtomicBoolean f34955b = new AtomicBoolean(false);

    /* renamed from: d */
    private final C0688e f34956d;

    /* renamed from: e */
    private final C13096a f34957e;

    /* renamed from: f */
    private Date f34958f = new Date(0);

    /* renamed from: com.facebook.b$a */
    static class C13201a {

        /* renamed from: a */
        public String f34976a;

        /* renamed from: b */
        public int f34977b;

        /* renamed from: c */
        public Long f34978c;

        private C13201a() {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo32386c() {
        m38576a(this.f34954a, this.f34954a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo32385b() {
        AccessToken a = this.f34957e.mo31811a();
        if (a == null) {
            return false;
        }
        m38577a(a, false);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo32387d() {
        if (m38581f()) {
            m38579b(null);
        }
    }

    /* renamed from: a */
    static C13196b m38575a() {
        if (f34953c == null) {
            synchronized (C13196b.class) {
                if (f34953c == null) {
                    f34953c = new C13196b(C0688e.m2941a(C13499h.m39721g()), new C13096a());
                }
            }
        }
        return f34953c;
    }

    /* renamed from: e */
    private static void m38580e() {
        Context g = C13499h.m39721g();
        AccessToken a = AccessToken.m38225a();
        AlarmManager alarmManager = (AlarmManager) g.getSystemService("alarm");
        if (AccessToken.m38232b() && a.f34623a != null && alarmManager != null) {
            Intent intent = new Intent(g, CurrentAccessTokenExpirationBroadcastReceiver.class);
            intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
            alarmManager.set(1, a.f34623a.getTime(), PendingIntent.getBroadcast(g, 0, intent, 0));
        }
    }

    /* renamed from: f */
    private boolean m38581f() {
        if (this.f34954a == null) {
            return false;
        }
        Long valueOf = Long.valueOf(new Date().getTime());
        if (!this.f34954a.f34628f.canExtendToken || valueOf.longValue() - this.f34958f.getTime() <= 3600000 || valueOf.longValue() - this.f34954a.f34629g.getTime() <= 86400000) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo32384a(AccessToken accessToken) {
        m38577a(accessToken, true);
    }

    /* renamed from: b */
    private void m38579b(C13078a aVar) {
        if (Looper.getMainLooper().equals(Looper.myLooper())) {
            mo32383a((C13078a) null);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable(null) {
                public final void run() {
                    C13196b.this.mo32383a(null);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo32383a(C13078a aVar) {
        AccessToken accessToken = this.f34954a;
        if (accessToken == null) {
            if (aVar != null) {
                new FacebookException("No current access token to refresh");
            }
        } else if (!this.f34955b.compareAndSet(false, true)) {
            if (aVar != null) {
                new FacebookException("Refresh already in progress");
            }
        } else {
            this.f34958f = new Date();
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final C13201a aVar2 = new C13201a();
            final AtomicBoolean atomicBoolean2 = atomicBoolean;
            C131982 r8 = r0;
            final HashSet hashSet4 = hashSet;
            final HashSet hashSet5 = hashSet2;
            HashSet hashSet6 = hashSet2;
            final HashSet hashSet7 = hashSet3;
            C131982 r0 = new C13090b() {
                /* renamed from: a */
                public final void mo31792a(GraphResponse graphResponse) {
                    JSONObject jSONObject = graphResponse.f34702b;
                    if (jSONObject != null) {
                        JSONArray optJSONArray = jSONObject.optJSONArray("data");
                        if (optJSONArray != null) {
                            atomicBoolean2.set(true);
                            for (int i = 0; i < optJSONArray.length(); i++) {
                                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                                if (optJSONObject != null) {
                                    String optString = optJSONObject.optString("permission");
                                    String optString2 = optJSONObject.optString("status");
                                    if (!C13967z.m41249a(optString) && !C13967z.m41249a(optString2)) {
                                        String lowerCase = optString2.toLowerCase(Locale.US);
                                        if (lowerCase.equals("granted")) {
                                            hashSet4.add(optString);
                                        } else if (lowerCase.equals("declined")) {
                                            hashSet5.add(optString);
                                        } else if (lowerCase.equals("expired")) {
                                            hashSet7.add(optString);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            };
            C14064l lVar = new C14064l(m38574a(accessToken, (C13090b) r8), m38578b(accessToken, new C13090b() {
                /* renamed from: a */
                public final void mo31792a(GraphResponse graphResponse) {
                    JSONObject jSONObject = graphResponse.f34702b;
                    if (jSONObject != null) {
                        aVar2.f34976a = jSONObject.optString("access_token");
                        aVar2.f34977b = jSONObject.optInt("expires_at");
                        aVar2.f34978c = Long.valueOf(jSONObject.optLong("data_access_expiration_time"));
                    }
                }
            }));
            final AccessToken accessToken2 = accessToken;
            final C13078a aVar3 = aVar;
            final AtomicBoolean atomicBoolean3 = atomicBoolean;
            final C13201a aVar4 = aVar2;
            final HashSet hashSet8 = hashSet;
            final HashSet hashSet9 = hashSet6;
            final HashSet hashSet10 = hashSet3;
            C132004 r02 = new C14065a() {
                /* JADX WARNING: Unknown top exception splitter block from list: {B:18:0x0042=Splitter:B:18:0x0042, B:51:0x00e8=Splitter:B:51:0x00e8} */
                /* renamed from: a */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void mo32389a(com.facebook.C14064l r18) {
                    /*
                        r17 = this;
                        r1 = r17
                        r2 = 0
                        com.facebook.b r0 = com.facebook.C13196b.m38575a()     // Catch:{ all -> 0x00fb }
                        com.facebook.AccessToken r0 = r0.f34954a     // Catch:{ all -> 0x00fb }
                        if (r0 == 0) goto L_0x00e8
                        com.facebook.b r0 = com.facebook.C13196b.m38575a()     // Catch:{ all -> 0x00fb }
                        com.facebook.AccessToken r0 = r0.f34954a     // Catch:{ all -> 0x00fb }
                        java.lang.String r0 = r0.f34631i     // Catch:{ all -> 0x00fb }
                        com.facebook.AccessToken r3 = r2     // Catch:{ all -> 0x00fb }
                        java.lang.String r3 = r3.f34631i     // Catch:{ all -> 0x00fb }
                        if (r0 == r3) goto L_0x001b
                        goto L_0x00e8
                    L_0x001b:
                        java.util.concurrent.atomic.AtomicBoolean r0 = r4     // Catch:{ all -> 0x00fb }
                        boolean r0 = r0.get()     // Catch:{ all -> 0x00fb }
                        if (r0 != 0) goto L_0x0042
                        com.facebook.b$a r0 = r5     // Catch:{ all -> 0x00fb }
                        java.lang.String r0 = r0.f34976a     // Catch:{ all -> 0x00fb }
                        if (r0 != 0) goto L_0x0042
                        com.facebook.b$a r0 = r5     // Catch:{ all -> 0x00fb }
                        int r0 = r0.f34977b     // Catch:{ all -> 0x00fb }
                        if (r0 != 0) goto L_0x0042
                        com.facebook.AccessToken$a r0 = r3     // Catch:{ all -> 0x00fb }
                        if (r0 == 0) goto L_0x003a
                        com.facebook.FacebookException r0 = new com.facebook.FacebookException     // Catch:{ all -> 0x00fb }
                        java.lang.String r3 = "Failed to refresh access token"
                        r0.<init>(r3)     // Catch:{ all -> 0x00fb }
                    L_0x003a:
                        com.facebook.b r0 = com.facebook.C13196b.this
                        java.util.concurrent.atomic.AtomicBoolean r0 = r0.f34955b
                        r0.set(r2)
                        return
                    L_0x0042:
                        com.facebook.AccessToken r0 = new com.facebook.AccessToken     // Catch:{ all -> 0x00fb }
                        com.facebook.b$a r3 = r5     // Catch:{ all -> 0x00fb }
                        java.lang.String r3 = r3.f34976a     // Catch:{ all -> 0x00fb }
                        if (r3 == 0) goto L_0x004f
                        com.facebook.b$a r3 = r5     // Catch:{ all -> 0x00fb }
                        java.lang.String r3 = r3.f34976a     // Catch:{ all -> 0x00fb }
                        goto L_0x0053
                    L_0x004f:
                        com.facebook.AccessToken r3 = r2     // Catch:{ all -> 0x00fb }
                        java.lang.String r3 = r3.f34627e     // Catch:{ all -> 0x00fb }
                    L_0x0053:
                        r4 = r3
                        com.facebook.AccessToken r3 = r2     // Catch:{ all -> 0x00fb }
                        java.lang.String r5 = r3.f34630h     // Catch:{ all -> 0x00fb }
                        com.facebook.AccessToken r3 = r2     // Catch:{ all -> 0x00fb }
                        java.lang.String r6 = r3.f34631i     // Catch:{ all -> 0x00fb }
                        java.util.concurrent.atomic.AtomicBoolean r3 = r4     // Catch:{ all -> 0x00fb }
                        boolean r3 = r3.get()     // Catch:{ all -> 0x00fb }
                        if (r3 == 0) goto L_0x0068
                        java.util.Set r3 = r6     // Catch:{ all -> 0x00fb }
                    L_0x0066:
                        r7 = r3
                        goto L_0x006d
                    L_0x0068:
                        com.facebook.AccessToken r3 = r2     // Catch:{ all -> 0x00fb }
                        java.util.Set<java.lang.String> r3 = r3.f34624b     // Catch:{ all -> 0x00fb }
                        goto L_0x0066
                    L_0x006d:
                        java.util.concurrent.atomic.AtomicBoolean r3 = r4     // Catch:{ all -> 0x00fb }
                        boolean r3 = r3.get()     // Catch:{ all -> 0x00fb }
                        if (r3 == 0) goto L_0x0079
                        java.util.Set r3 = r7     // Catch:{ all -> 0x00fb }
                    L_0x0077:
                        r8 = r3
                        goto L_0x007e
                    L_0x0079:
                        com.facebook.AccessToken r3 = r2     // Catch:{ all -> 0x00fb }
                        java.util.Set<java.lang.String> r3 = r3.f34625c     // Catch:{ all -> 0x00fb }
                        goto L_0x0077
                    L_0x007e:
                        java.util.concurrent.atomic.AtomicBoolean r3 = r4     // Catch:{ all -> 0x00fb }
                        boolean r3 = r3.get()     // Catch:{ all -> 0x00fb }
                        if (r3 == 0) goto L_0x008a
                        java.util.Set r3 = r8     // Catch:{ all -> 0x00fb }
                    L_0x0088:
                        r9 = r3
                        goto L_0x008f
                    L_0x008a:
                        com.facebook.AccessToken r3 = r2     // Catch:{ all -> 0x00fb }
                        java.util.Set<java.lang.String> r3 = r3.f34626d     // Catch:{ all -> 0x00fb }
                        goto L_0x0088
                    L_0x008f:
                        com.facebook.AccessToken r3 = r2     // Catch:{ all -> 0x00fb }
                        com.facebook.AccessTokenSource r10 = r3.f34628f     // Catch:{ all -> 0x00fb }
                        com.facebook.b$a r3 = r5     // Catch:{ all -> 0x00fb }
                        int r3 = r3.f34977b     // Catch:{ all -> 0x00fb }
                        r11 = 1000(0x3e8, double:4.94E-321)
                        if (r3 == 0) goto L_0x00a8
                        java.util.Date r3 = new java.util.Date     // Catch:{ all -> 0x00fb }
                        com.facebook.b$a r13 = r5     // Catch:{ all -> 0x00fb }
                        int r13 = r13.f34977b     // Catch:{ all -> 0x00fb }
                        long r13 = (long) r13     // Catch:{ all -> 0x00fb }
                        long r13 = r13 * r11
                        r3.<init>(r13)     // Catch:{ all -> 0x00fb }
                        goto L_0x00ac
                    L_0x00a8:
                        com.facebook.AccessToken r3 = r2     // Catch:{ all -> 0x00fb }
                        java.util.Date r3 = r3.f34623a     // Catch:{ all -> 0x00fb }
                    L_0x00ac:
                        r13 = r3
                        java.util.Date r14 = new java.util.Date     // Catch:{ all -> 0x00fb }
                        r14.<init>()     // Catch:{ all -> 0x00fb }
                        com.facebook.b$a r3 = r5     // Catch:{ all -> 0x00fb }
                        java.lang.Long r3 = r3.f34978c     // Catch:{ all -> 0x00fb }
                        if (r3 == 0) goto L_0x00c8
                        java.util.Date r3 = new java.util.Date     // Catch:{ all -> 0x00fb }
                        com.facebook.b$a r15 = r5     // Catch:{ all -> 0x00fb }
                        java.lang.Long r15 = r15.f34978c     // Catch:{ all -> 0x00fb }
                        long r15 = r15.longValue()     // Catch:{ all -> 0x00fb }
                        long r11 = r11 * r15
                        r3.<init>(r11)     // Catch:{ all -> 0x00fb }
                        goto L_0x00cc
                    L_0x00c8:
                        com.facebook.AccessToken r3 = r2     // Catch:{ all -> 0x00fb }
                        java.util.Date r3 = r3.f34632j     // Catch:{ all -> 0x00fb }
                    L_0x00cc:
                        r15 = r3
                        r3 = r0
                        r11 = r13
                        r12 = r14
                        r13 = r15
                        r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x00fb }
                        com.facebook.b r3 = com.facebook.C13196b.m38575a()     // Catch:{ all -> 0x00fb }
                        r3.mo32384a(r0)     // Catch:{ all -> 0x00fb }
                        com.facebook.b r0 = com.facebook.C13196b.this
                        java.util.concurrent.atomic.AtomicBoolean r0 = r0.f34955b
                        r0.set(r2)
                        com.facebook.AccessToken$a r0 = r3
                        if (r0 == 0) goto L_0x00e7
                        return
                    L_0x00e7:
                        return
                    L_0x00e8:
                        com.facebook.AccessToken$a r0 = r3     // Catch:{ all -> 0x00fb }
                        if (r0 == 0) goto L_0x00f3
                        com.facebook.FacebookException r0 = new com.facebook.FacebookException     // Catch:{ all -> 0x00fb }
                        java.lang.String r3 = "No current access token to refresh"
                        r0.<init>(r3)     // Catch:{ all -> 0x00fb }
                    L_0x00f3:
                        com.facebook.b r0 = com.facebook.C13196b.this
                        java.util.concurrent.atomic.AtomicBoolean r0 = r0.f34955b
                        r0.set(r2)
                        return
                    L_0x00fb:
                        r0 = move-exception
                        com.facebook.b r3 = com.facebook.C13196b.this
                        java.util.concurrent.atomic.AtomicBoolean r3 = r3.f34955b
                        r3.set(r2)
                        throw r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.C13196b.C132004.mo32389a(com.facebook.l):void");
                }
            };
            lVar.mo33711a((C14065a) r02);
            lVar.mo33715b();
        }
    }

    /* renamed from: a */
    private static GraphRequest m38574a(AccessToken accessToken, C13090b bVar) {
        AccessToken accessToken2 = accessToken;
        GraphRequest graphRequest = new GraphRequest(accessToken2, "me/permissions", new Bundle(), HttpMethod.GET, bVar);
        return graphRequest;
    }

    /* renamed from: b */
    private static GraphRequest m38578b(AccessToken accessToken, C13090b bVar) {
        Bundle bundle = new Bundle();
        bundle.putString("grant_type", "fb_extend_sso_token");
        GraphRequest graphRequest = new GraphRequest(accessToken, "oauth/access_token", bundle, HttpMethod.GET, bVar);
        return graphRequest;
    }

    private C13196b(C0688e eVar, C13096a aVar) {
        C13876aa.m40978a((Object) eVar, "localBroadcastManager");
        C13876aa.m40978a((Object) aVar, "accessTokenCache");
        this.f34956d = eVar;
        this.f34957e = aVar;
    }

    /* renamed from: a */
    private void m38576a(AccessToken accessToken, AccessToken accessToken2) {
        Intent intent = new Intent(C13499h.m39721g(), CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", accessToken);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", accessToken2);
        this.f34956d.mo2839a(intent);
    }

    /* renamed from: a */
    private void m38577a(AccessToken accessToken, boolean z) {
        AccessToken accessToken2 = this.f34954a;
        this.f34954a = accessToken;
        this.f34955b.set(false);
        this.f34958f = new Date(0);
        if (z) {
            if (accessToken != null) {
                this.f34957e.mo31812a(accessToken);
            } else {
                this.f34957e.mo31813b();
                C13233c.m38672a(C13499h.m39721g());
            }
        }
        if (!C13967z.m41248a(accessToken2, accessToken)) {
            m38576a(accessToken2, accessToken);
            m38580e();
        }
    }
}
