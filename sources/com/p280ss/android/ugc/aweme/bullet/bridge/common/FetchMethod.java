package com.p280ss.android.ugc.aweme.bullet.bridge.common;

import com.bytedance.ies.bullet.core.kit.bridge.IBridge.Access;
import com.bytedance.ies.bullet.core.model.p542a.C10403b;
import com.bytedance.ies.web.p582a.C11087a;
import com.bytedance.ies.web.p582a.C11097i;
import com.p280ss.android.ugc.aweme.bullet.bridge.BaseBridge;
import com.p280ss.android.ugc.aweme.bullet.bridge.BaseBridge.C23565a;
import com.p280ss.android.ugc.aweme.hybrid.monitor.C30388i;
import com.p280ss.android.ugc.aweme.web.jsbridge.p1706a.C43468a;
import com.p280ss.android.ugc.aweme.web.jsbridge.p1706a.C43468a.C43470b;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.FetchMethod */
public final class FetchMethod extends BaseBridge {

    /* renamed from: d */
    public static final C23571a f62179d = new C23571a(null);

    /* renamed from: c */
    public C30388i f62180c;

    /* renamed from: e */
    private final String f62181e = "fetch";

    /* renamed from: f */
    private Access f62182f = Access.PROTECT;

    /* renamed from: g */
    private final C43470b f62183g = new C23572b(this);

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.FetchMethod$a */
    public static final class C23571a {
        private C23571a() {
        }

        public /* synthetic */ C23571a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.FetchMethod$b */
    static final class C23572b implements C43470b {

        /* renamed from: a */
        final /* synthetic */ FetchMethod f62184a;

        C23572b(FetchMethod fetchMethod) {
            this.f62184a = fetchMethod;
        }

        /* JADX WARNING: Removed duplicated region for block: B:43:0x00d9  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo61496a(com.p280ss.android.ugc.aweme.web.jsbridge.p1706a.C43468a.C43469a r7, com.p280ss.android.ugc.aweme.web.jsbridge.p1706a.C43468a.C43471c r8) {
            /*
                r6 = this;
                if (r7 != 0) goto L_0x000e
                com.ss.android.ugc.aweme.hybrid.monitor.b r7 = new com.ss.android.ugc.aweme.hybrid.monitor.b
                java.lang.String r0 = ""
                java.lang.String r1 = ""
                java.lang.String r2 = ""
                r7.<init>(r0, r1, r2)
                goto L_0x0042
            L_0x000e:
                com.ss.android.ugc.aweme.hybrid.monitor.b r0 = new com.ss.android.ugc.aweme.hybrid.monitor.b
                java.lang.String r1 = r7.f112575b
                if (r1 != 0) goto L_0x0017
                java.lang.String r1 = ""
                goto L_0x0019
            L_0x0017:
                java.lang.String r1 = r7.f112575b
            L_0x0019:
                java.lang.String r2 = "if (request.url == null) \"\" else request.url"
                kotlin.jvm.internal.C7573i.m23582a(r1, r2)
                java.lang.String r2 = r7.f112574a
                if (r2 != 0) goto L_0x0025
                java.lang.String r2 = ""
                goto L_0x0027
            L_0x0025:
                java.lang.String r2 = r7.f112574a
            L_0x0027:
                java.lang.String r3 = "if (request.method == null) \"\" else request.method"
                kotlin.jvm.internal.C7573i.m23582a(r2, r3)
                org.json.JSONObject r3 = r7.f112576c
                if (r3 != 0) goto L_0x0033
                java.lang.String r7 = ""
                goto L_0x003e
            L_0x0033:
                org.json.JSONObject r7 = r7.f112576c
                java.lang.String r7 = r7.toString()
                java.lang.String r3 = "request.body.toString()"
                kotlin.jvm.internal.C7573i.m23582a(r7, r3)
            L_0x003e:
                r0.<init>(r1, r2, r7)
                r7 = r0
            L_0x0042:
                r0 = 0
                if (r8 == 0) goto L_0x00d2
                java.lang.Exception r1 = r8.f112578b
                if (r1 == 0) goto L_0x005b
                com.ss.android.ugc.aweme.hybrid.monitor.ApiResultException r1 = new com.ss.android.ugc.aweme.hybrid.monitor.ApiResultException
                java.lang.String r2 = "network_error"
                java.lang.Exception r8 = r8.f112578b
                java.lang.String r3 = "response.e"
                kotlin.jvm.internal.C7573i.m23582a(r8, r3)
                java.lang.Throwable r8 = (java.lang.Throwable) r8
                r1.<init>(r2, r8)
                goto L_0x00d3
            L_0x005b:
                org.json.JSONObject r1 = r8.f112577a
                if (r1 == 0) goto L_0x00d2
                org.json.JSONObject r1 = r8.f112577a
                java.lang.String r2 = "message"
                boolean r1 = r1.has(r2)
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L_0x007d
                java.lang.String r1 = "success"
                org.json.JSONObject r4 = r8.f112577a
                java.lang.String r5 = "message"
                java.lang.String r4 = r4.optString(r5)
                boolean r1 = kotlin.jvm.internal.C7573i.m23585a(r1, r4)
                r1 = r1 ^ r3
                if (r1 == 0) goto L_0x007d
                goto L_0x00bb
            L_0x007d:
                org.json.JSONObject r1 = r8.f112577a
                java.lang.String r4 = "code"
                boolean r1 = r1.has(r4)
                if (r1 == 0) goto L_0x0090
                org.json.JSONObject r1 = r8.f112577a
                java.lang.String r4 = "code"
                int r1 = r1.optInt(r4)
                goto L_0x00b7
            L_0x0090:
                org.json.JSONObject r1 = r8.f112577a
                java.lang.String r4 = "status_code"
                boolean r1 = r1.has(r4)
                if (r1 == 0) goto L_0x00a3
                org.json.JSONObject r1 = r8.f112577a
                java.lang.String r4 = "status_code"
                int r1 = r1.optInt(r4)
                goto L_0x00b7
            L_0x00a3:
                org.json.JSONObject r1 = r8.f112577a
                java.lang.String r4 = "statusCode"
                boolean r1 = r1.has(r4)
                if (r1 == 0) goto L_0x00b6
                org.json.JSONObject r1 = r8.f112577a
                java.lang.String r4 = "statusCode"
                int r1 = r1.optInt(r4)
                goto L_0x00b7
            L_0x00b6:
                r1 = 0
            L_0x00b7:
                if (r1 == 0) goto L_0x00ba
                goto L_0x00bb
            L_0x00ba:
                r3 = 0
            L_0x00bb:
                if (r3 == 0) goto L_0x00d2
                com.ss.android.ugc.aweme.hybrid.monitor.ApiResultException r1 = new com.ss.android.ugc.aweme.hybrid.monitor.ApiResultException
                java.lang.String r2 = "api_error"
                java.lang.Exception r3 = new java.lang.Exception
                org.json.JSONObject r8 = r8.f112577a
                java.lang.String r8 = r8.toString()
                r3.<init>(r8)
                java.lang.Throwable r3 = (java.lang.Throwable) r3
                r1.<init>(r2, r3)
                goto L_0x00d3
            L_0x00d2:
                r1 = r0
            L_0x00d3:
                com.ss.android.ugc.aweme.bullet.bridge.common.FetchMethod r8 = r6.f62184a
                com.ss.android.ugc.aweme.hybrid.monitor.i r8 = r8.f62180c
                if (r8 == 0) goto L_0x00f0
                boolean r2 = r8.f79800c
                if (r2 == 0) goto L_0x00de
                goto L_0x00df
            L_0x00de:
                r8 = r0
            L_0x00df:
                if (r8 == 0) goto L_0x00f0
                java.lang.Class<com.ss.android.ugc.aweme.hybrid.monitor.k> r0 = com.p280ss.android.ugc.aweme.hybrid.monitor.C30391k.class
                com.ss.android.ugc.aweme.hybrid.monitor.q r8 = r8.mo80008a(r0)
                com.ss.android.ugc.aweme.hybrid.monitor.k r8 = (com.p280ss.android.ugc.aweme.hybrid.monitor.C30391k) r8
                if (r8 == 0) goto L_0x00ef
                r8.mo79993a(r7, r1)
                goto L_0x00f0
            L_0x00ef:
                return
            L_0x00f0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.bullet.bridge.common.FetchMethod.C23572b.mo61496a(com.ss.android.ugc.aweme.web.jsbridge.a.a$a, com.ss.android.ugc.aweme.web.jsbridge.a.a$c):void");
        }
    }

    /* renamed from: b */
    public final Access mo25126b() {
        return this.f62182f;
    }

    /* renamed from: c */
    public final String mo25127c() {
        return this.f62181e;
    }

    /* renamed from: a */
    public final void mo25139a(Access access) {
        C7573i.m23587b(access, "<set-?>");
        this.f62182f = access;
    }

    public FetchMethod(C10403b bVar) {
        C7573i.m23587b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* renamed from: a */
    public final void mo61491a(JSONObject jSONObject, C23565a aVar) {
        C7573i.m23587b(jSONObject, "params");
        C7573i.m23587b(aVar, "iReturn");
        C11087a aVar2 = (C11087a) this.f28074a.mo25202b(C11087a.class);
        try {
            C11097i iVar = new C11097i();
            iVar.f30169b = jSONObject.optString("callback_id");
            iVar.f30171d = jSONObject;
            iVar.f30173f = false;
            C43468a.m137933a(iVar, jSONObject.optJSONObject("res"), aVar2, this.f62183g).mo105394a();
        } catch (Exception unused) {
        }
    }
}
