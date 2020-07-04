package com.p280ss.android.ugc.aweme.account.p978m.p979a;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.ies.web.p582a.C11087a;
import com.bytedance.ies.web.p582a.C11093e;
import com.bytedance.ies.web.p582a.C11097i;
import com.bytedance.sdk.account.platform.api.C12907c;
import com.bytedance.sdk.account.platform.p669a.C12904a;
import com.google.gson.C6600e;
import com.google.gson.p276a.C6593c;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.account.m.a.a */
public final class C22182a implements C11093e {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f59245a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C22182a.class), "mOneKeyLoginService", "getMOneKeyLoginService()Lcom/bytedance/sdk/account/platform/api/IOnekeyLoginService;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C22182a.class), "gson", "getGson()Lcom/google/gson/Gson;"))};

    /* renamed from: b */
    public CountDownLatch f59246b;

    /* renamed from: c */
    public C22184b f59247c;

    /* renamed from: d */
    public final WeakReference<Context> f59248d;

    /* renamed from: e */
    public final C11087a f59249e;

    /* renamed from: f */
    private final C7541d f59250f = C7546e.m23569a(C22192g.f59270a);

    /* renamed from: g */
    private C22183a f59251g;

    /* renamed from: h */
    private final C7541d f59252h = C7546e.m23569a(C22191f.f59269a);

    /* renamed from: com.ss.android.ugc.aweme.account.m.a.a$a */
    public static final class C22183a {
        @C6593c(mo15949a = "getMask")

        /* renamed from: a */
        public Integer f59253a;
        @C6593c(mo15949a = "getToken")

        /* renamed from: b */
        public Integer f59254b;
    }

    /* renamed from: com.ss.android.ugc.aweme.account.m.a.a$b */
    static final class C22184b {

        /* renamed from: a */
        static final /* synthetic */ C7595j[] f59255a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C22184b.class), "jsonObject", "getJsonObject()Lorg/json/JSONObject;"))};

        /* renamed from: g */
        public static final C22185a f59256g = new C22185a(null);

        /* renamed from: b */
        public String f59257b;

        /* renamed from: c */
        public volatile int f59258c = 1;

        /* renamed from: d */
        public volatile int f59259d;

        /* renamed from: e */
        public volatile int f59260e;

        /* renamed from: f */
        public volatile int f59261f;

        /* renamed from: h */
        private final C7541d f59262h = C7546e.m23569a(C22186b.f59263a);

        /* renamed from: com.ss.android.ugc.aweme.account.m.a.a$b$a */
        public static final class C22185a {
            private C22185a() {
            }

            public /* synthetic */ C22185a(C7571f fVar) {
                this();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.account.m.a.a$b$b */
        static final class C22186b extends Lambda implements C7561a<JSONObject> {

            /* renamed from: a */
            public static final C22186b f59263a = new C22186b();

            C22186b() {
                super(0);
            }

            /* renamed from: a */
            private static JSONObject m73625a() {
                return new JSONObject();
            }

            public final /* synthetic */ Object invoke() {
                return m73625a();
            }
        }

        /* renamed from: c */
        private final JSONObject m73621c() {
            return (JSONObject) this.f59262h.getValue();
        }

        /* renamed from: a */
        public final String mo58540a() {
            String str = this.f59257b;
            if (str == null) {
                C7573i.m23583a("from");
            }
            return str;
        }

        /* renamed from: b */
        public final JSONObject mo58542b() {
            if (this.f59258c == 0) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", this.f59258c);
                String str = "from";
                String str2 = this.f59257b;
                if (str2 == null) {
                    C7573i.m23583a("from");
                }
                jSONObject.put(str, str2);
                jSONObject.put("tokenErrorCode", this.f59259d);
                jSONObject.put("maskErrorCode", this.f59260e);
                jSONObject.put("networkType", this.f59261f);
                return jSONObject;
            }
            m73621c().put("code", this.f59258c);
            JSONObject c = m73621c();
            String str3 = "from";
            String str4 = this.f59257b;
            if (str4 == null) {
                C7573i.m23583a("from");
            }
            c.put(str3, str4);
            return m73621c();
        }

        /* renamed from: a */
        public final void mo58541a(String str) {
            C7573i.m23587b(str, "<set-?>");
            this.f59257b = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.m.a.a$c */
    public static final class C22187c {

        /* renamed from: a */
        final /* synthetic */ C22182a f59264a;

        C22187c(C22182a aVar) {
            this.f59264a = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.m.a.a$d */
    public static final class C22188d {

        /* renamed from: a */
        final /* synthetic */ C22182a f59265a;

        C22188d(C22182a aVar) {
            this.f59265a = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.m.a.a$e */
    static final class C22189e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C22182a f59266a;

        /* renamed from: b */
        final /* synthetic */ C11097i f59267b;

        C22189e(C22182a aVar, C11097i iVar) {
            this.f59266a = aVar;
            this.f59267b = iVar;
        }

        public final void run() {
            C22182a.m73619b(this.f59266a).await();
            new Handler(Looper.getMainLooper()).post(new Runnable(this) {

                /* renamed from: a */
                final /* synthetic */ C22189e f59268a;

                {
                    this.f59268a = r1;
                }

                public final void run() {
                    C22182a aVar = this.f59268a.f59266a;
                    String str = this.f59268a.f59267b.f30169b;
                    C7573i.m23582a((Object) str, "jsMsg.callback_id");
                    aVar.mo58539a(str, C22182a.m73616a(this.f59268a.f59266a).mo58542b());
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.m.a.a$f */
    static final class C22191f extends Lambda implements C7561a<C6600e> {

        /* renamed from: a */
        public static final C22191f f59269a = new C22191f();

        C22191f() {
            super(0);
        }

        /* renamed from: a */
        private static C6600e m73626a() {
            return new C6600e();
        }

        public final /* synthetic */ Object invoke() {
            return m73626a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.m.a.a$g */
    static final class C22192g extends Lambda implements C7561a<C12907c> {

        /* renamed from: a */
        public static final C22192g f59270a = new C22192g();

        C22192g() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m73627a();
        }

        /* renamed from: a */
        private static C12907c m73627a() {
            return (C12907c) C12904a.m37574a(C12907c.class);
        }
    }

    /* renamed from: a */
    private final C12907c m73614a() {
        return (C12907c) this.f59250f.getValue();
    }

    /* renamed from: b */
    private final C6600e m73618b() {
        return (C6600e) this.f59252h.getValue();
    }

    /* renamed from: a */
    public static final /* synthetic */ C22184b m73616a(C22182a aVar) {
        C22184b bVar = aVar.f59247c;
        if (bVar == null) {
            C7573i.m23583a("jsResponseBody");
        }
        return bVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ CountDownLatch m73619b(C22182a aVar) {
        CountDownLatch countDownLatch = aVar.f59246b;
        if (countDownLatch == null) {
            C7573i.m23583a("countDownLatch");
        }
        return countDownLatch;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
        if (r2 == null) goto L_0x001f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m73617a(com.bytedance.ies.web.p582a.C11097i r5) {
        /*
            r4 = this;
            r0 = 0
            r5.f30173f = r0
            com.ss.android.ugc.aweme.account.m.a.a$b r1 = new com.ss.android.ugc.aweme.account.m.a.a$b
            r1.<init>()
            r4.f59247c = r1
            com.ss.android.ugc.aweme.account.m.a.a$b r1 = r4.f59247c
            if (r1 != 0) goto L_0x0013
            java.lang.String r2 = "jsResponseBody"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x0013:
            com.bytedance.sdk.account.platform.api.c r2 = r4.m73614a()
            if (r2 == 0) goto L_0x001f
            java.lang.String r2 = r2.mo31390a()
            if (r2 != 0) goto L_0x0021
        L_0x001f:
            java.lang.String r2 = ""
        L_0x0021:
            r1.mo58541a(r2)
            com.ss.android.ugc.aweme.account.m.a.a$b r1 = r4.f59247c
            if (r1 != 0) goto L_0x002d
            java.lang.String r2 = "jsResponseBody"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x002d:
            com.bytedance.sdk.account.platform.api.c r2 = r4.m73614a()
            int r2 = r2.mo31391b()
            r1.f59261f = r2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "from: "
            r1.<init>(r2)
            com.ss.android.ugc.aweme.account.m.a.a$b r2 = r4.f59247c
            if (r2 != 0) goto L_0x0047
            java.lang.String r3 = "jsResponseBody"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x0047:
            java.lang.String r2 = r2.mo58540a()
            r1.append(r2)
            com.google.gson.e r1 = r4.m73618b()
            org.json.JSONObject r5 = r5.f30171d
            java.lang.String r5 = r5.toString()
            java.lang.Class<com.ss.android.ugc.aweme.account.m.a.a$a> r2 = com.p280ss.android.ugc.aweme.account.p978m.p979a.C22182a.C22183a.class
            java.lang.Object r5 = r1.mo15974a(r5, r2)
            java.lang.String r1 = "gson.fromJson(jsMsg.para…(), JsParams::class.java)"
            kotlin.jvm.internal.C7573i.m23582a(r5, r1)
            com.ss.android.ugc.aweme.account.m.a.a$a r5 = (com.p280ss.android.ugc.aweme.account.p978m.p979a.C22182a.C22183a) r5
            com.ss.android.ugc.aweme.account.m.a.a$b r1 = r4.f59247c
            if (r1 != 0) goto L_0x006e
            java.lang.String r2 = "jsResponseBody"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x006e:
            com.ss.android.ugc.aweme.account.m.a.a$a r5 = m73615a(r5, r1)
            r4.f59251g = r5
            com.ss.android.ugc.aweme.account.m.a.a$a r5 = r4.f59251g
            if (r5 != 0) goto L_0x007d
            java.lang.String r1 = "jsParams"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x007d:
            java.lang.Integer r5 = r5.f59253a
            if (r5 == 0) goto L_0x0086
            int r5 = r5.intValue()
            goto L_0x0087
        L_0x0086:
            r5 = 0
        L_0x0087:
            int r5 = r5 + r0
            com.ss.android.ugc.aweme.account.m.a.a$a r1 = r4.f59251g
            if (r1 != 0) goto L_0x0091
            java.lang.String r2 = "jsParams"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x0091:
            java.lang.Integer r1 = r1.f59254b
            if (r1 == 0) goto L_0x0099
            int r0 = r1.intValue()
        L_0x0099:
            int r5 = r5 + r0
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r0.<init>(r5)
            r4.f59246b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.account.p978m.p979a.C22182a.m73617a(com.bytedance.ies.web.a.i):void");
    }

    /* renamed from: a */
    public final void mo58539a(String str, JSONObject jSONObject) {
        this.f59249e.mo27030a(str, jSONObject);
    }

    public C22182a(WeakReference<Context> weakReference, C11087a aVar) {
        C7573i.m23587b(weakReference, "contextRef");
        C7573i.m23587b(aVar, "iesJsBridge");
        this.f59248d = weakReference;
        this.f59249e = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0033, code lost:
        if (r0.intValue() != 0) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        if (r0.intValue() != 0) goto L_0x0035;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.p280ss.android.ugc.aweme.account.p978m.p979a.C22182a.C22183a m73615a(com.p280ss.android.ugc.aweme.account.p978m.p979a.C22182a.C22183a r2, com.p280ss.android.ugc.aweme.account.p978m.p979a.C22182a.C22184b r3) {
        /*
            java.lang.Integer r0 = r2.f59253a
            r1 = 1
            if (r0 == 0) goto L_0x001b
            java.lang.Integer r0 = r2.f59253a
            if (r0 != 0) goto L_0x000a
            goto L_0x0010
        L_0x000a:
            int r0 = r0.intValue()
            if (r0 == r1) goto L_0x001b
        L_0x0010:
            java.lang.Integer r0 = r2.f59253a
            if (r0 != 0) goto L_0x0015
            goto L_0x0035
        L_0x0015:
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x0035
        L_0x001b:
            java.lang.Integer r0 = r2.f59254b
            if (r0 == 0) goto L_0x0044
            java.lang.Integer r0 = r2.f59254b
            if (r0 != 0) goto L_0x0024
            goto L_0x002a
        L_0x0024:
            int r0 = r0.intValue()
            if (r0 == r1) goto L_0x0044
        L_0x002a:
            java.lang.Integer r0 = r2.f59254b
            if (r0 != 0) goto L_0x002f
            goto L_0x0035
        L_0x002f:
            int r0 = r0.intValue()
            if (r0 == 0) goto L_0x0044
        L_0x0035:
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r2.f59253a = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r2.f59254b = r1
            r3.f59258c = r0
        L_0x0044:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.account.p978m.p979a.C22182a.m73615a(com.ss.android.ugc.aweme.account.m.a.a$a, com.ss.android.ugc.aweme.account.m.a.a$b):com.ss.android.ugc.aweme.account.m.a.a$a");
    }

    public final void call(C11097i iVar, JSONObject jSONObject) {
        C7573i.m23587b(iVar, "jsMsg");
        m73617a(iVar);
        C22183a aVar = this.f59251g;
        if (aVar == null) {
            C7573i.m23583a("jsParams");
        }
        Integer num = aVar.f59253a;
        if (num != null && 1 == num.intValue()) {
            m73614a();
            new C22187c(this);
        }
        C22183a aVar2 = this.f59251g;
        if (aVar2 == null) {
            C7573i.m23583a("jsParams");
        }
        Integer num2 = aVar2.f59254b;
        if (num2 != null && 1 == num2.intValue()) {
            m73614a();
            new C22188d(this);
        }
        new Thread(new C22189e(this, iVar)).start();
    }
}
