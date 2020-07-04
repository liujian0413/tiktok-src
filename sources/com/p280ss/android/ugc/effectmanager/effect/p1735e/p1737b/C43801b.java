package com.p280ss.android.ugc.effectmanager.effect.p1735e.p1737b;

import com.p280ss.android.ugc.effectmanager.common.p1726a.C43703a;
import com.p280ss.android.ugc.effectmanager.common.p1728c.C43722d;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.common.p1730e.C43732d;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.p1731a.C43749a;
import com.p280ss.android.ugc.effectmanager.effect.p1731a.C43750b;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43754d;
import com.p280ss.android.ugc.effectmanager.effect.p1734d.C43782a;
import com.p280ss.android.ugc.effectmanager.effect.p1735e.p1736a.C43788e;
import com.p280ss.android.ugc.effectmanager.network.C43859a;
import java.io.File;

/* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.b */
public final class C43801b implements C43749a {

    /* renamed from: a */
    public final C43859a f113325a;

    /* renamed from: b */
    public final C43722d f113326b;

    /* renamed from: c */
    public final String f113327c;

    /* renamed from: d */
    public final String f113328d;

    /* renamed from: a */
    private C43782a<C43788e> m138716a(final Effect effect) {
        return new C43782a<C43788e>() {
            /* renamed from: a */
            public final void mo105722a() {
                mo105834a(this);
                mo105837a((C43782a<T>) this, new C43788e(effect, null));
            }
        };
    }

    /* renamed from: a */
    public final C43782a<C43788e> mo70645a(final C43750b bVar) {
        if (m138717a(new File(bVar.f113249c), bVar.f113247a)) {
            return m138716a(bVar.f113247a);
        }
        return new C43782a<C43788e>() {

            /* renamed from: a */
            String f113329a;

            /* renamed from: b */
            String f113330b;

            /* renamed from: c */
            Effect f113331c;

            /* renamed from: f */
            long f113332f;

            /* renamed from: g */
            long f113333g;

            /* renamed from: h */
            long f113334h;

            /* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.b$1$a */
            class C43803a implements C43754d {

                /* renamed from: b */
                private C43782a<C43788e> f113338b;

                public C43803a(C43782a aVar) {
                    this.f113338b = aVar;
                }

                /* renamed from: a */
                public final void mo105802a(int i, long j) {
                    if (this.f113338b != null) {
                        this.f113338b.mo105835a(this.f113338b, i, j);
                    }
                }
            }

            /* JADX WARNING: Can't wrap try/catch for region: R(8:15|16|(1:20)|21|22|23|24|(4:26|(1:28)(1:29)|30|31)(2:32|33)) */
            /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x00bd */
            /* JADX WARNING: Removed duplicated region for block: B:26:0x00f4 A[Catch:{ Exception -> 0x017b }] */
            /* JADX WARNING: Removed duplicated region for block: B:32:0x014c A[Catch:{ Exception -> 0x017b }] */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void mo105722a() {
                /*
                    r11 = this;
                    r11.mo105834a(r11)
                    long r0 = java.lang.System.currentTimeMillis()
                    com.ss.android.ugc.effectmanager.effect.a.b r2 = r3
                    com.ss.android.ugc.effectmanager.effect.model.Effect r2 = r2.f113247a
                    r11.f113331c = r2
                    if (r2 == 0) goto L_0x01e0
                    com.ss.android.ugc.effectmanager.effect.a.b r3 = r3
                    java.util.List<java.lang.String> r3 = r3.f113248b
                    if (r3 == 0) goto L_0x01e0
                    com.ss.android.ugc.effectmanager.effect.a.b r3 = r3
                    java.util.List<java.lang.String> r3 = r3.f113248b
                    boolean r3 = r3.isEmpty()
                    if (r3 != 0) goto L_0x01e0
                    com.ss.android.ugc.effectmanager.common.model.UrlModel r3 = r2.getFileUrl()
                    boolean r3 = com.p280ss.android.ugc.effectmanager.common.p1730e.C43731c.m138585a(r3)
                    if (r3 == 0) goto L_0x002b
                    goto L_0x01e0
                L_0x002b:
                    r3 = 0
                    com.ss.android.ugc.effectmanager.effect.a.b r4 = r3
                    java.util.List<java.lang.String> r4 = r4.f113248b
                    int r4 = r4.size()
                L_0x0034:
                    if (r3 >= r4) goto L_0x01df
                    boolean r5 = r11.f113281e
                    if (r5 == 0) goto L_0x0045
                    com.ss.android.ugc.effectmanager.common.d.c r0 = new com.ss.android.ugc.effectmanager.common.d.c
                    r1 = 10001(0x2711, float:1.4014E-41)
                    r0.<init>(r1)
                    r11.mo105836a(r11, r0)
                    return
                L_0x0045:
                    com.ss.android.ugc.effectmanager.effect.a.b r5 = r3
                    java.util.List<java.lang.String> r5 = r5.f113248b
                    java.lang.Object r5 = r5.get(r3)
                    java.lang.String r5 = (java.lang.String) r5
                    r11.f113329a = r5
                    java.lang.String r5 = r2.getZipPath()     // Catch:{ Exception -> 0x017b }
                    boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x017b }
                    if (r5 != 0) goto L_0x0065
                    java.lang.String r5 = r2.getUnzipPath()     // Catch:{ Exception -> 0x017b }
                    boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x017b }
                    if (r5 == 0) goto L_0x00a8
                L_0x0065:
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x017b }
                    r5.<init>()     // Catch:{ Exception -> 0x017b }
                    com.ss.android.ugc.effectmanager.effect.a.b r6 = r3     // Catch:{ Exception -> 0x017b }
                    java.lang.String r6 = r6.f113249c     // Catch:{ Exception -> 0x017b }
                    r5.append(r6)     // Catch:{ Exception -> 0x017b }
                    java.lang.String r6 = java.io.File.separator     // Catch:{ Exception -> 0x017b }
                    r5.append(r6)     // Catch:{ Exception -> 0x017b }
                    java.lang.String r6 = r2.getId()     // Catch:{ Exception -> 0x017b }
                    r5.append(r6)     // Catch:{ Exception -> 0x017b }
                    java.lang.String r6 = ".zip"
                    r5.append(r6)     // Catch:{ Exception -> 0x017b }
                    java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x017b }
                    r2.setZipPath(r5)     // Catch:{ Exception -> 0x017b }
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x017b }
                    r5.<init>()     // Catch:{ Exception -> 0x017b }
                    com.ss.android.ugc.effectmanager.effect.a.b r6 = r3     // Catch:{ Exception -> 0x017b }
                    java.lang.String r6 = r6.f113249c     // Catch:{ Exception -> 0x017b }
                    r5.append(r6)     // Catch:{ Exception -> 0x017b }
                    java.lang.String r6 = java.io.File.separator     // Catch:{ Exception -> 0x017b }
                    r5.append(r6)     // Catch:{ Exception -> 0x017b }
                    java.lang.String r6 = r2.getId()     // Catch:{ Exception -> 0x017b }
                    r5.append(r6)     // Catch:{ Exception -> 0x017b }
                    java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x017b }
                    r2.setUnzipPath(r5)     // Catch:{ Exception -> 0x017b }
                L_0x00a8:
                    java.net.URL r5 = new java.net.URL     // Catch:{ MalformedURLException | UnknownHostException -> 0x00bd }
                    java.lang.String r6 = r11.f113329a     // Catch:{ MalformedURLException | UnknownHostException -> 0x00bd }
                    r5.<init>(r6)     // Catch:{ MalformedURLException | UnknownHostException -> 0x00bd }
                    java.lang.String r5 = r5.getHost()     // Catch:{ MalformedURLException | UnknownHostException -> 0x00bd }
                    java.net.InetAddress r5 = java.net.InetAddress.getByName(r5)     // Catch:{ MalformedURLException | UnknownHostException -> 0x00bd }
                    java.lang.String r5 = r5.getHostAddress()     // Catch:{ MalformedURLException | UnknownHostException -> 0x00bd }
                    r11.f113330b = r5     // Catch:{ MalformedURLException | UnknownHostException -> 0x00bd }
                L_0x00bd:
                    com.ss.android.ugc.effectmanager.effect.e.b.b r5 = com.p280ss.android.ugc.effectmanager.effect.p1735e.p1737b.C43801b.this     // Catch:{ Exception -> 0x017b }
                    com.ss.android.ugc.effectmanager.network.a r5 = r5.f113325a     // Catch:{ Exception -> 0x017b }
                    com.ss.android.ugc.effectmanager.effect.a.b r6 = r3     // Catch:{ Exception -> 0x017b }
                    java.util.List<java.lang.String> r6 = r6.f113248b     // Catch:{ Exception -> 0x017b }
                    java.lang.Object r6 = r6.get(r3)     // Catch:{ Exception -> 0x017b }
                    java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x017b }
                    com.ss.android.ugc.effectmanager.effect.e.b.b$1$a r7 = new com.ss.android.ugc.effectmanager.effect.e.b.b$1$a     // Catch:{ Exception -> 0x017b }
                    r7.<init>(r11)     // Catch:{ Exception -> 0x017b }
                    com.p280ss.android.ugc.effectmanager.common.p1730e.C43731c.m138583a(r5, r6, r2, r7)     // Catch:{ Exception -> 0x017b }
                    long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x017b }
                    java.io.File r7 = new java.io.File     // Catch:{ Exception -> 0x017b }
                    java.lang.String r8 = r2.getZipPath()     // Catch:{ Exception -> 0x017b }
                    r7.<init>(r8)     // Catch:{ Exception -> 0x017b }
                    java.lang.String r8 = com.p280ss.android.ugc.effectmanager.common.p1730e.C43734f.m138604a(r7)     // Catch:{ Exception -> 0x017b }
                    com.ss.android.ugc.effectmanager.effect.model.Effect r9 = r11.f113331c     // Catch:{ Exception -> 0x017b }
                    com.ss.android.ugc.effectmanager.common.model.UrlModel r9 = r9.getFileUrl()     // Catch:{ Exception -> 0x017b }
                    java.lang.String r9 = r9.getUri()     // Catch:{ Exception -> 0x017b }
                    boolean r9 = r8.equals(r9)     // Catch:{ Exception -> 0x017b }
                    if (r9 == 0) goto L_0x014c
                    long r7 = r7.length()     // Catch:{ Exception -> 0x017b }
                    int r9 = com.p280ss.android.ugc.effectmanager.common.C43702a.f113154a     // Catch:{ Exception -> 0x017b }
                    long r9 = (long) r9     // Catch:{ Exception -> 0x017b }
                    long r7 = r7 / r9
                    r11.f113334h = r7     // Catch:{ Exception -> 0x017b }
                    com.ss.android.ugc.effectmanager.common.a.a r7 = com.p280ss.android.ugc.effectmanager.common.p1726a.C43703a.m138485a()     // Catch:{ Exception -> 0x017b }
                    com.ss.android.ugc.effectmanager.effect.a.b r8 = r3     // Catch:{ Exception -> 0x017b }
                    java.lang.String r8 = r8.f113249c     // Catch:{ Exception -> 0x017b }
                    com.ss.android.ugc.effectmanager.common.c.a r7 = r7.mo105727a(r8)     // Catch:{ Exception -> 0x017b }
                    boolean r7 = r7 instanceof com.p280ss.android.ugc.effectmanager.common.p1726a.C43704b     // Catch:{ Exception -> 0x017b }
                    if (r7 == 0) goto L_0x0120
                    com.ss.android.ugc.effectmanager.common.a.a r7 = com.p280ss.android.ugc.effectmanager.common.p1726a.C43703a.m138485a()     // Catch:{ Exception -> 0x017b }
                    com.ss.android.ugc.effectmanager.effect.a.b r8 = r3     // Catch:{ Exception -> 0x017b }
                    java.lang.String r8 = r8.f113249c     // Catch:{ Exception -> 0x017b }
                    com.ss.android.ugc.effectmanager.common.c.a r7 = r7.mo105727a(r8)     // Catch:{ Exception -> 0x017b }
                    com.ss.android.ugc.effectmanager.common.a.b r7 = (com.p280ss.android.ugc.effectmanager.common.p1726a.C43704b) r7     // Catch:{ Exception -> 0x017b }
                    r7.mo105731a(r2)     // Catch:{ Exception -> 0x017b }
                    goto L_0x0132
                L_0x0120:
                    java.lang.String r7 = r2.getZipPath()     // Catch:{ Exception -> 0x017b }
                    java.lang.String r8 = r2.getUnzipPath()     // Catch:{ Exception -> 0x017b }
                    com.p280ss.android.ugc.effectmanager.common.p1730e.C43733e.m138598b(r7, r8)     // Catch:{ Exception -> 0x017b }
                    java.lang.String r7 = r2.getZipPath()     // Catch:{ Exception -> 0x017b }
                    com.p280ss.android.ugc.effectmanager.common.p1730e.C43733e.m138599b(r7)     // Catch:{ Exception -> 0x017b }
                L_0x0132:
                    long r7 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x017b }
                    r9 = 0
                    long r7 = r7 - r5
                    r11.f113333g = r7     // Catch:{ Exception -> 0x017b }
                    long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x017b }
                    r7 = 0
                    long r5 = r5 - r0
                    r11.f113332f = r5     // Catch:{ Exception -> 0x017b }
                    com.ss.android.ugc.effectmanager.effect.e.a.e r5 = new com.ss.android.ugc.effectmanager.effect.e.a.e     // Catch:{ Exception -> 0x017b }
                    r6 = 0
                    r5.<init>(r2, r6)     // Catch:{ Exception -> 0x017b }
                    r11.mo105837a(r11, r5)     // Catch:{ Exception -> 0x017b }
                    return
                L_0x014c:
                    com.ss.android.ugc.effectmanager.effect.model.Effect r5 = r11.f113331c     // Catch:{ Exception -> 0x017b }
                    java.lang.String r5 = r5.getZipPath()     // Catch:{ Exception -> 0x017b }
                    com.p280ss.android.ugc.effectmanager.common.p1730e.C43733e.m138599b(r5)     // Catch:{ Exception -> 0x017b }
                    com.ss.android.ugc.effectmanager.common.exception.MD5Exception r5 = new com.ss.android.ugc.effectmanager.common.exception.MD5Exception     // Catch:{ Exception -> 0x017b }
                    java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x017b }
                    java.lang.String r7 = "downloadMD5: "
                    r6.<init>(r7)     // Catch:{ Exception -> 0x017b }
                    r6.append(r8)     // Catch:{ Exception -> 0x017b }
                    java.lang.String r7 = " expectMD5:"
                    r6.append(r7)     // Catch:{ Exception -> 0x017b }
                    com.ss.android.ugc.effectmanager.effect.model.Effect r7 = r11.f113331c     // Catch:{ Exception -> 0x017b }
                    com.ss.android.ugc.effectmanager.common.model.UrlModel r7 = r7.getFileUrl()     // Catch:{ Exception -> 0x017b }
                    java.lang.String r7 = r7.getUri()     // Catch:{ Exception -> 0x017b }
                    r6.append(r7)     // Catch:{ Exception -> 0x017b }
                    java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x017b }
                    r5.<init>(r6)     // Catch:{ Exception -> 0x017b }
                    throw r5     // Catch:{ Exception -> 0x017b }
                L_0x017b:
                    r5 = move-exception
                    int r6 = r4 + -1
                    if (r3 != r6) goto L_0x01db
                    com.ss.android.ugc.effectmanager.common.d.c r0 = new com.ss.android.ugc.effectmanager.common.d.c
                    r0.<init>(r5)
                    java.lang.String r1 = r11.f113329a
                    java.lang.String r3 = ""
                    java.lang.String r4 = r11.f113330b
                    r0.mo105767a(r1, r3, r4)
                    com.ss.android.ugc.effectmanager.common.a.a r1 = com.p280ss.android.ugc.effectmanager.common.p1726a.C43703a.m138485a()
                    com.ss.android.ugc.effectmanager.effect.a.b r3 = r3
                    java.lang.String r3 = r3.f113249c
                    com.ss.android.ugc.effectmanager.common.c.a r1 = r1.mo105727a(r3)
                    boolean r1 = r1 instanceof com.p280ss.android.ugc.effectmanager.common.p1726a.C43704b
                    if (r1 == 0) goto L_0x01c9
                    com.ss.android.ugc.effectmanager.common.a.a r1 = com.p280ss.android.ugc.effectmanager.common.p1726a.C43703a.m138485a()
                    com.ss.android.ugc.effectmanager.effect.a.b r3 = r3
                    java.lang.String r3 = r3.f113249c
                    com.ss.android.ugc.effectmanager.common.c.a r1 = r1.mo105727a(r3)
                    com.ss.android.ugc.effectmanager.common.a.b r1 = (com.p280ss.android.ugc.effectmanager.common.p1726a.C43704b) r1
                    java.lang.String r3 = r2.getUnzipPath()
                    r1.mo105736c(r3)
                    com.ss.android.ugc.effectmanager.common.a.a r1 = com.p280ss.android.ugc.effectmanager.common.p1726a.C43703a.m138485a()
                    com.ss.android.ugc.effectmanager.effect.a.b r3 = r3
                    java.lang.String r3 = r3.f113249c
                    com.ss.android.ugc.effectmanager.common.c.a r1 = r1.mo105727a(r3)
                    com.ss.android.ugc.effectmanager.common.a.b r1 = (com.p280ss.android.ugc.effectmanager.common.p1726a.C43704b) r1
                    java.lang.String r2 = r2.getZipPath()
                    r1.mo105736c(r2)
                    goto L_0x01d7
                L_0x01c9:
                    java.lang.String r1 = r2.getUnzipPath()
                    com.p280ss.android.ugc.effectmanager.common.p1730e.C43733e.m138603e(r1)
                    java.lang.String r1 = r2.getZipPath()
                    com.p280ss.android.ugc.effectmanager.common.p1730e.C43733e.m138603e(r1)
                L_0x01d7:
                    r11.mo105836a(r11, r0)
                    return
                L_0x01db:
                    int r3 = r3 + 1
                    goto L_0x0034
                L_0x01df:
                    return
                L_0x01e0:
                    com.ss.android.ugc.effectmanager.common.d.c r0 = new com.ss.android.ugc.effectmanager.common.d.c
                    r1 = 10003(0x2713, float:1.4017E-41)
                    r0.<init>(r1)
                    r11.mo105836a(r11, r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.effectmanager.effect.p1735e.p1737b.C43801b.C438021.mo105722a():void");
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo105837a(C43782a<C43788e> aVar, C43788e eVar) {
                String str;
                super.mo105837a(aVar, eVar);
                if (C43801b.this.f113326b != null) {
                    C43722d dVar = C43801b.this.f113326b;
                    String str2 = "effect_download_success_rate";
                    C43732d a = C43732d.m138588a().mo105776a("app_id", C43801b.this.f113327c).mo105776a("access_key", C43801b.this.f113328d).mo105775a("duration", Long.valueOf(this.f113332f)).mo105775a("unzip_time", Long.valueOf(this.f113333g));
                    String str3 = "effect_id";
                    if (this.f113331c == null) {
                        str = "";
                    } else {
                        str = this.f113331c.getEffectId();
                    }
                    dVar.mo55503a(str2, 0, a.mo105776a(str3, str).mo105775a("size", Long.valueOf(this.f113334h)).mo105777b());
                }
            }

            /* renamed from: a */
            public final void mo105836a(C43782a<C43788e> aVar, C43726c cVar) {
                String str;
                super.mo105836a(aVar, cVar);
                if (C43801b.this.f113326b != null) {
                    C43722d dVar = C43801b.this.f113326b;
                    String str2 = "effect_download_success_rate";
                    C43732d a = C43732d.m138588a().mo105776a("app_id", C43801b.this.f113327c).mo105776a("access_key", C43801b.this.f113328d);
                    String str3 = "effect_id";
                    if (this.f113331c == null) {
                        str = "";
                    } else {
                        str = this.f113331c.getEffectId();
                    }
                    dVar.mo55503a(str2, 1, a.mo105776a(str3, str).mo105774a("error_code", Integer.valueOf(cVar.f113220a)).mo105776a("error_msg", cVar.f113221b).mo105776a("download_url", this.f113329a).mo105776a("host_ip", this.f113330b).mo105777b());
                }
            }

            /* renamed from: a */
            public final void mo105835a(C43782a<C43788e> aVar, int i, long j) {
                super.mo105835a(aVar, i, j);
            }
        };
    }

    /* renamed from: a */
    private static boolean m138717a(File file, Effect effect) {
        return C43703a.m138485a().mo105727a(file.getAbsolutePath()).mo105737d(effect.getId());
    }

    public C43801b(C43859a aVar, C43722d dVar, String str, String str2) {
        this.f113325a = aVar;
        this.f113326b = dVar;
        this.f113327c = str;
        this.f113328d = str2;
    }
}
