package com.p280ss.android.account.token;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.retrofit2.C12466b;
import com.bytedance.retrofit2.C12474e;
import com.bytedance.retrofit2.C12534t;
import com.bytedance.retrofit2.p637a.C12461b;
import com.bytedance.retrofit2.p638c.C12469a;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.p280ss.android.account.token.C18898b.C18899a;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.security.PrivateKey;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.account.token.c */
public final class C18900c implements C6310a {

    /* renamed from: g */
    private static C18900c f50950g;

    /* renamed from: a */
    public volatile boolean f50951a;

    /* renamed from: b */
    public volatile String f50952b;

    /* renamed from: c */
    public C18898b f50953c;

    /* renamed from: d */
    public Handler f50954d;

    /* renamed from: e */
    public volatile int f50955e;

    /* renamed from: f */
    public volatile boolean f50956f;

    /* renamed from: h */
    private SharedPreferences f50957h;

    /* renamed from: i */
    private volatile boolean f50958i;

    /* renamed from: j */
    private volatile boolean f50959j;

    /* renamed from: k */
    private IGetTokenApi f50960k;

    /* renamed from: l */
    private PrivateKey f50961l;

    /* renamed from: m */
    private Context f50962m;

    /* renamed from: n */
    private final int f50963n = 1000;

    /* renamed from: o */
    private volatile int f50964o;

    /* renamed from: p */
    private final long f50965p = 10000;

    /* renamed from: q */
    private volatile boolean f50966q = true;

    /* renamed from: r */
    private volatile boolean f50967r;

    /* renamed from: s */
    private volatile boolean f50968s;

    /* renamed from: a */
    protected static C18900c m61692a() {
        return f50950g;
    }

    /* renamed from: e */
    private static String m61700e() {
        return "1";
    }

    /* renamed from: c */
    public final C18907h mo50271c() {
        return this.f50953c.f50944c;
    }

    /* renamed from: d */
    public final void mo50272d() {
        this.f50954d.removeMessages(1000);
    }

    /* renamed from: f */
    private boolean m61701f() {
        if (this.f50959j || !this.f50958i || (!"change.token".equals(this.f50952b) && !TextUtils.isEmpty(this.f50952b))) {
            return false;
        }
        this.f50959j = true;
        return true;
    }

    /* renamed from: g */
    private void m61702g() {
        this.f50952b = "";
        this.f50957h.edit().putString("X-Tt-Token", "").apply();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo50270b() {
        if (!this.f50951a && this.f50966q) {
            this.f50951a = true;
            String str = this.f50953c.f50942a;
            if (this.f50960k == null) {
                this.f50960k = (IGetTokenApi) RetrofitUtils.m37898a(str, IGetTokenApi.class);
            }
            if (!TextUtils.isEmpty(this.f50952b) || !this.f50968s) {
                if (!C18903d.m61712a(this.f50962m)) {
                    this.f50964o++;
                    this.f50954d.sendEmptyMessageDelayed(1000, Math.min(((long) this.f50964o) * 10000, this.f50953c.f50947f));
                    this.f50951a = false;
                    return;
                }
                this.f50964o = 0;
                this.f50960k.requestToken("").enqueue(new C12474e<String>() {
                    /* renamed from: a */
                    public final void mo26463a(C12466b<String> bVar, C12534t<String> tVar) {
                        try {
                            C18900c.this.f50951a = false;
                            C18900c.this.f50954d.sendEmptyMessageDelayed(1000, C18900c.this.f50953c.f50947f);
                            if (!(tVar == null || tVar.mo30510a() == 200)) {
                                C18905f.m61717a("tt_token_beat", tVar.mo30511b(), tVar.mo30510a(), (String) tVar.f33302b);
                            }
                        } catch (Exception unused) {
                        }
                    }

                    /* renamed from: a */
                    public final void mo26464a(C12466b<String> bVar, Throwable th) {
                        try {
                            C18900c.this.f50951a = false;
                            C18900c.this.f50954d.sendEmptyMessageDelayed(1000, C18900c.this.f50953c.f50947f);
                            C18905f.m61717a("tt_token_beat", (List) null, -1, th.getMessage());
                        } catch (Exception unused) {
                        }
                    }
                });
            } else if (!this.f50956f) {
                this.f50960k.requestChangeToken("").enqueue(new C12474e<String>() {
                    /* renamed from: a */
                    public final void mo26463a(C12466b<String> bVar, C12534t<String> tVar) {
                        try {
                            C18900c.this.f50951a = false;
                            C18900c.this.f50954d.sendEmptyMessageDelayed(1000, C18900c.this.f50953c.f50947f);
                            if (tVar == null || tVar.mo30510a() == 200) {
                                C18900c.this.f50956f = true;
                            } else {
                                C18905f.m61717a("tt_token_change", tVar.mo30511b(), tVar.mo30510a(), (String) tVar.f33302b);
                            }
                        } catch (Exception unused) {
                        }
                    }

                    /* renamed from: a */
                    public final void mo26464a(C12466b<String> bVar, Throwable th) {
                        try {
                            C18900c.this.f50951a = false;
                            C18900c.this.f50955e++;
                            if (C18900c.this.f50955e < 5) {
                                C18900c.this.f50954d.sendEmptyMessageDelayed(1000, C18900c.this.f50953c.f50948g * ((long) C18900c.this.f50955e));
                            }
                            C18905f.m61717a("tt_token_change", (List) null, -1, th.getMessage());
                        } catch (Exception unused) {
                        }
                    }
                });
            }
        }
    }

    /* renamed from: c */
    private boolean m61699c(String str) {
        if (str != null) {
            C18899a aVar = this.f50953c.f50949h;
            if (aVar != null) {
                return aVar.mo50267a(str);
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo50268a(Collection<String> collection) {
        this.f50953c.mo50266b(collection);
    }

    public final void handleMsg(Message message) {
        if (message.what == 1000) {
            this.f50954d.removeMessages(1000);
            mo50270b();
        }
    }

    /* renamed from: b */
    private boolean m61698b(String str) {
        if (!this.f50966q || !C18906g.m61719a(str, this.f50953c.f50943b)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo50269a(boolean z) {
        this.f50966q = z;
        if (!z) {
            m61702g();
        }
    }

    /* renamed from: a */
    public static Map<String, String> m61693a(String str) {
        LinkedList<C12461b> linkedList = new LinkedList<>();
        m61696a(str, (List<C12461b>) linkedList);
        if (linkedList.isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap(linkedList.size());
        for (C12461b bVar : linkedList) {
            hashMap.put(bVar.f33095a, bVar.f33096b);
        }
        return hashMap;
    }

    /* renamed from: a */
    protected static void m61694a(Context context, C18898b bVar) {
        f50950g = new C18900c(context, bVar);
    }

    private C18900c(Context context, C18898b bVar) {
        this.f50953c = bVar;
        this.f50962m = context.getApplicationContext();
        RetrofitUtils.m37902a((C12469a) new AuthTokenInterceptor());
        String str = bVar.f50945d;
        if (TextUtils.isEmpty(str)) {
            str = "token_shared_preference";
        }
        this.f50957h = C7285c.m22838a(context, str, 0);
        this.f50952b = this.f50957h.getString("X-Tt-Token", "");
        this.f50968s = this.f50957h.getBoolean("first-launch", true);
        this.f50957h.edit().putBoolean("first-launch", false).apply();
        this.f50954d = new C6309f(Looper.getMainLooper(), this);
        this.f50958i = !TextUtils.isEmpty(this.f50952b);
    }

    /* renamed from: a */
    public static void m61696a(String str, List<C12461b> list) {
        if (f50950g != null && f50950g.m61698b(str) && !f50950g.m61699c(str)) {
            if (!TextUtils.isEmpty(f50950g.f50952b) && !f50950g.f50967r) {
                list.add(new C12461b("X-Tt-Token", f50950g.f50952b));
            }
            list.add(new C12461b("sdk-version", m61700e()));
            if (f50950g.m61701f()) {
                C18905f.m61714a(str);
            }
        }
    }

    /* renamed from: b */
    public static void m61697b(String str, List<C12461b> list) {
        if (f50950g != null && f50950g.m61698b(str) && !f50950g.m61699c(str)) {
            String str2 = null;
            String str3 = null;
            for (C12461b bVar : list) {
                if ("X-Tt-Token-Sign".equalsIgnoreCase(bVar.f33095a)) {
                    str3 = bVar.f33096b;
                } else if ("X-Tt-Token".equalsIgnoreCase(bVar.f33095a)) {
                    str2 = bVar.f33096b;
                }
                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                    f50950g.m61695a(str3, str2);
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0097, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00cc, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m61695a(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            com.ss.android.account.token.b r0 = r6.f50953c     // Catch:{ all -> 0x00cd }
            boolean r0 = r0.f50946e     // Catch:{ all -> 0x00cd }
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0098
            java.lang.String r0 = ""
            java.security.PrivateKey r3 = r6.f50961l     // Catch:{ all -> 0x00cd }
            if (r3 != 0) goto L_0x001b
            java.security.PrivateKey r3 = com.p280ss.android.account.token.C18908i.m61722a()     // Catch:{ Exception -> 0x0016 }
            r6.f50961l = r3     // Catch:{ Exception -> 0x0016 }
            goto L_0x001b
        L_0x0016:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x00cd }
        L_0x001b:
            java.security.PrivateKey r3 = r6.f50961l     // Catch:{ all -> 0x00cd }
            if (r3 == 0) goto L_0x008e
            byte[] r3 = com.p280ss.android.account.token.C18908i.m61723a(r7)     // Catch:{ all -> 0x00cd }
            java.security.PrivateKey r4 = r6.f50961l     // Catch:{ all -> 0x00cd }
            byte[] r3 = com.p280ss.android.account.token.C18908i.m61724a(r3, r4)     // Catch:{ all -> 0x00cd }
            r4 = 0
            if (r3 == 0) goto L_0x0031
            java.lang.String r4 = new java.lang.String     // Catch:{ all -> 0x00cd }
            r4.<init>(r3)     // Catch:{ all -> 0x00cd }
        L_0x0031:
            r3 = 100
            if (r4 == 0) goto L_0x003f
            int r5 = r4.length()     // Catch:{ all -> 0x00cd }
            if (r5 <= r3) goto L_0x003f
            java.lang.String r4 = r4.substring(r2, r3)     // Catch:{ all -> 0x00cd }
        L_0x003f:
            if (r8 == 0) goto L_0x004c
            int r5 = r8.length()     // Catch:{ all -> 0x00cd }
            if (r5 <= r3) goto L_0x004c
            java.lang.String r3 = r8.substring(r2, r3)     // Catch:{ all -> 0x00cd }
            goto L_0x004d
        L_0x004c:
            r3 = r8
        L_0x004d:
            if (r4 == 0) goto L_0x0085
            if (r8 == 0) goto L_0x0085
            boolean r3 = r4.equals(r3)     // Catch:{ all -> 0x00cd }
            if (r3 == 0) goto L_0x0085
            boolean r7 = r6.f50967r     // Catch:{ all -> 0x00cd }
            if (r7 == 0) goto L_0x005d
            r6.f50967r = r2     // Catch:{ all -> 0x00cd }
        L_0x005d:
            r6.f50952b = r8     // Catch:{ all -> 0x00cd }
            android.content.SharedPreferences r7 = r6.f50957h     // Catch:{ all -> 0x00cd }
            android.content.SharedPreferences$Editor r7 = r7.edit()     // Catch:{ all -> 0x00cd }
            java.lang.String r0 = "X-Tt-Token"
            android.content.SharedPreferences$Editor r7 = r7.putString(r0, r8)     // Catch:{ all -> 0x00cd }
            r7.apply()     // Catch:{ all -> 0x00cd }
            java.lang.String r7 = "change.token"
            java.lang.String r8 = r6.f50952b     // Catch:{ all -> 0x00cd }
            boolean r7 = r7.equals(r8)     // Catch:{ all -> 0x00cd }
            if (r7 != 0) goto L_0x0081
            java.lang.String r7 = r6.f50952b     // Catch:{ all -> 0x00cd }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x00cd }
            if (r7 != 0) goto L_0x0081
            goto L_0x0082
        L_0x0081:
            r1 = 0
        L_0x0082:
            r6.f50958i = r1     // Catch:{ all -> 0x00cd }
            goto L_0x0096
        L_0x0085:
            java.lang.String r1 = "compare"
            com.p280ss.android.account.token.C18905f.m61715a(r1, r7, r8, r0)     // Catch:{ all -> 0x00cd }
            r6.m61702g()     // Catch:{ all -> 0x00cd }
            goto L_0x00cb
        L_0x008e:
            java.lang.String r1 = "privateKey"
            com.p280ss.android.account.token.C18905f.m61715a(r1, r7, r8, r0)     // Catch:{ all -> 0x00cd }
            r6.m61702g()     // Catch:{ all -> 0x00cd }
        L_0x0096:
            monitor-exit(r6)
            return
        L_0x0098:
            boolean r7 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x00cd }
            if (r7 != 0) goto L_0x00cb
            boolean r7 = r6.f50967r     // Catch:{ all -> 0x00cd }
            if (r7 == 0) goto L_0x00a4
            r6.f50967r = r2     // Catch:{ all -> 0x00cd }
        L_0x00a4:
            r6.f50952b = r8     // Catch:{ all -> 0x00cd }
            android.content.SharedPreferences r7 = r6.f50957h     // Catch:{ all -> 0x00cd }
            android.content.SharedPreferences$Editor r7 = r7.edit()     // Catch:{ all -> 0x00cd }
            java.lang.String r0 = "X-Tt-Token"
            android.content.SharedPreferences$Editor r7 = r7.putString(r0, r8)     // Catch:{ all -> 0x00cd }
            r7.apply()     // Catch:{ all -> 0x00cd }
            java.lang.String r7 = "change.token"
            java.lang.String r8 = r6.f50952b     // Catch:{ all -> 0x00cd }
            boolean r7 = r7.equals(r8)     // Catch:{ all -> 0x00cd }
            if (r7 != 0) goto L_0x00c8
            java.lang.String r7 = r6.f50952b     // Catch:{ all -> 0x00cd }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x00cd }
            if (r7 != 0) goto L_0x00c8
            goto L_0x00c9
        L_0x00c8:
            r1 = 0
        L_0x00c9:
            r6.f50958i = r1     // Catch:{ all -> 0x00cd }
        L_0x00cb:
            monitor-exit(r6)
            return
        L_0x00cd:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.account.token.C18900c.m61695a(java.lang.String, java.lang.String):void");
    }
}
