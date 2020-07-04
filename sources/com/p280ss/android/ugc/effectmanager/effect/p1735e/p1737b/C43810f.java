package com.p280ss.android.ugc.effectmanager.effect.p1735e.p1737b;

import android.os.Handler;
import com.p280ss.android.ugc.effectmanager.C43834g;
import com.p280ss.android.ugc.effectmanager.common.C43707b;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43727d;
import com.p280ss.android.ugc.effectmanager.common.p1730e.C43731c;
import com.p280ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43754d;
import com.p280ss.android.ugc.effectmanager.effect.p1735e.p1736a.C43784a;
import com.p280ss.android.ugc.effectmanager.p1723a.C43680a;
import java.io.InputStream;

/* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.f */
public final class C43810f extends C43727d {

    /* renamed from: a */
    private ProviderEffect f113365a;

    /* renamed from: b */
    private int f113366b;

    /* renamed from: g */
    private C43680a f113367g;

    /* renamed from: h */
    private String f113368h;

    /* renamed from: i */
    private C43834g f113369i;

    /* renamed from: j */
    private String f113370j;

    /* renamed from: k */
    private String f113371k;

    /* JADX WARNING: Can't wrap try/catch for region: R(9:6|7|(1:9)|10|11|12|13|14|(3:27|16|17)(2:29|23)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0065 */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0071 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0099 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo105685a() {
        /*
            r6 = this;
            int r0 = r6.f113366b
            r1 = 0
        L_0x0003:
            if (r1 >= r0) goto L_0x009d
            boolean r2 = r6.f113228e
            r3 = 19
            if (r2 == 0) goto L_0x001d
            com.ss.android.ugc.effectmanager.effect.e.a.a r0 = new com.ss.android.ugc.effectmanager.effect.e.a.a
            com.ss.android.ugc.effectmanager.effect.model.ProviderEffect r1 = r6.f113365a
            com.ss.android.ugc.effectmanager.common.d.c r2 = new com.ss.android.ugc.effectmanager.common.d.c
            r4 = 10001(0x2711, float:1.4014E-41)
            r2.<init>(r4)
            r0.<init>(r1, r2)
            r6.mo105769a(r3, r0)
            return
        L_0x001d:
            com.ss.android.ugc.effectmanager.effect.model.ProviderEffect r2 = r6.f113365a     // Catch:{ Exception -> 0x007b }
            java.lang.String r2 = r2.path     // Catch:{ Exception -> 0x007b }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x007b }
            if (r2 == 0) goto L_0x004c
            com.ss.android.ugc.effectmanager.effect.model.ProviderEffect r2 = r6.f113365a     // Catch:{ Exception -> 0x007b }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x007b }
            r4.<init>()     // Catch:{ Exception -> 0x007b }
            com.ss.android.ugc.effectmanager.g r5 = r6.f113369i     // Catch:{ Exception -> 0x007b }
            java.io.File r5 = r5.f113519j     // Catch:{ Exception -> 0x007b }
            r4.append(r5)     // Catch:{ Exception -> 0x007b }
            java.lang.String r5 = java.io.File.separator     // Catch:{ Exception -> 0x007b }
            r4.append(r5)     // Catch:{ Exception -> 0x007b }
            com.ss.android.ugc.effectmanager.effect.model.ProviderEffect r5 = r6.f113365a     // Catch:{ Exception -> 0x007b }
            java.lang.String r5 = r5.f113502id     // Catch:{ Exception -> 0x007b }
            r4.append(r5)     // Catch:{ Exception -> 0x007b }
            java.lang.String r5 = ".gif"
            r4.append(r5)     // Catch:{ Exception -> 0x007b }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x007b }
            r2.path = r4     // Catch:{ Exception -> 0x007b }
        L_0x004c:
            java.lang.String r2 = r6.f113368h     // Catch:{ Exception -> 0x007b }
            r6.f113370j = r2     // Catch:{ Exception -> 0x007b }
            java.net.URL r2 = new java.net.URL     // Catch:{ MalformedURLException | UnknownHostException -> 0x0065 }
            java.lang.String r4 = r6.f113370j     // Catch:{ MalformedURLException | UnknownHostException -> 0x0065 }
            r2.<init>(r4)     // Catch:{ MalformedURLException | UnknownHostException -> 0x0065 }
            java.lang.String r2 = r2.getHost()     // Catch:{ MalformedURLException | UnknownHostException -> 0x0065 }
            java.net.InetAddress r2 = java.net.InetAddress.getByName(r2)     // Catch:{ MalformedURLException | UnknownHostException -> 0x0065 }
            java.lang.String r2 = r2.getHostAddress()     // Catch:{ MalformedURLException | UnknownHostException -> 0x0065 }
            r6.f113371k = r2     // Catch:{ MalformedURLException | UnknownHostException -> 0x0065 }
        L_0x0065:
            java.lang.String r2 = r6.f113368h     // Catch:{ Exception -> 0x007b }
            com.ss.android.ugc.effectmanager.effect.model.ProviderEffect r4 = r6.f113365a     // Catch:{ Exception -> 0x007b }
            java.lang.String r4 = r4.path     // Catch:{ Exception -> 0x007b }
            com.ss.android.ugc.effectmanager.effect.model.ProviderEffect r2 = r6.m138740a(r2, r4)     // Catch:{ Exception -> 0x007b }
            if (r2 == 0) goto L_0x0099
            com.ss.android.ugc.effectmanager.effect.e.a.a r4 = new com.ss.android.ugc.effectmanager.effect.e.a.a     // Catch:{ Exception -> 0x007b }
            r5 = 0
            r4.<init>(r2, r5)     // Catch:{ Exception -> 0x007b }
            r6.mo105769a(r3, r4)     // Catch:{ Exception -> 0x007b }
            return
        L_0x007b:
            r2 = move-exception
            int r4 = r0 + -1
            if (r1 != r4) goto L_0x0099
            com.ss.android.ugc.effectmanager.common.d.c r0 = new com.ss.android.ugc.effectmanager.common.d.c
            r0.<init>(r2)
            java.lang.String r1 = r6.f113370j
            java.lang.String r2 = ""
            java.lang.String r4 = r6.f113371k
            r0.mo105767a(r1, r2, r4)
            com.ss.android.ugc.effectmanager.effect.e.a.a r1 = new com.ss.android.ugc.effectmanager.effect.e.a.a
            com.ss.android.ugc.effectmanager.effect.model.ProviderEffect r2 = r6.f113365a
            r1.<init>(r2, r0)
            r6.mo105769a(r3, r1)
            return
        L_0x0099:
            int r1 = r1 + 1
            goto L_0x0003
        L_0x009d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.effectmanager.effect.p1735e.p1737b.C43810f.mo105685a():void");
    }

    /* renamed from: a */
    private ProviderEffect m138740a(String str, String str2) throws Exception {
        C43707b bVar = new C43707b("GET", str);
        InputStream a = this.f113367g.f113068a.f113533x.mo106116a(bVar);
        final C43784a aVar = new C43784a(this.f113365a, null, 0, 0);
        C43731c.m138581a(a, str2, bVar.f113171c, (C43754d) new C43754d() {
            /* renamed from: a */
            public final void mo105802a(int i, long j) {
                aVar.mo105838a(i).mo105839a(j);
                C43810f.this.mo105769a(54, aVar);
            }
        });
        return this.f113365a;
    }

    public C43810f(C43680a aVar, String str, ProviderEffect providerEffect, Handler handler) {
        super(handler, str, "NETWORK");
        this.f113365a = providerEffect;
        this.f113367g = aVar;
        this.f113369i = aVar.f113068a;
        this.f113366b = aVar.f113068a.f113529t;
        this.f113368h = C43731c.m138582a(providerEffect);
    }
}
