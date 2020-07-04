package com.p280ss.android.ugc.effectmanager;

import bolts.C1591g;
import bolts.C1592h;
import com.p280ss.android.ugc.effectmanager.C43746d.C43747a;
import com.p280ss.android.ugc.effectmanager.DownloadableModelConfig.ModelFileEnv;
import com.p280ss.android.ugc.effectmanager.common.C43707b;
import com.p280ss.android.ugc.effectmanager.common.C43728e;
import com.p280ss.android.ugc.effectmanager.common.C43739h;
import com.p280ss.android.ugc.effectmanager.common.p1728c.C43721c;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43727d;
import com.p280ss.android.ugc.effectmanager.common.p1730e.C43735g;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.p1731a.C43749a;
import com.p280ss.android.ugc.effectmanager.link.model.host.Host;
import com.p280ss.android.ugc.effectmanager.model.DownloadableModelResponse;
import com.p280ss.android.ugc.effectmanager.model.ModelInfo;
import com.p280ss.android.ugc.effectmanager.network.C43859a;
import com.p280ss.android.ugc.effectmanager.p1725c.C43701a;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.ugc.effectmanager.b */
public final class C43681b {

    /* renamed from: a */
    static C43746d f113070a = new C43747a();

    /* renamed from: j */
    private static C43681b f113071j;

    /* renamed from: b */
    public final C43859a f113072b;

    /* renamed from: c */
    public final List<Host> f113073c;

    /* renamed from: d */
    public final C43721c f113074d;

    /* renamed from: e */
    public final String f113075e;

    /* renamed from: f */
    public final String f113076f;

    /* renamed from: g */
    public final ModelFileEnv f113077g;

    /* renamed from: h */
    public final DownloadableModelConfig f113078h;

    /* renamed from: i */
    C43831f f113079i;

    /* renamed from: k */
    private final C43679a f113080k;

    /* renamed from: l */
    private final String f113081l;

    /* renamed from: m */
    private final Executor f113082m;

    /* renamed from: n */
    private final C43687a f113083n;

    /* renamed from: o */
    private C43698c f113084o;

    /* renamed from: p */
    private DownloadableModelSupportResourceFinder f113085p;

    /* renamed from: q */
    private C43856m f113086q;

    /* renamed from: com.ss.android.ugc.effectmanager.b$a */
    public interface C43687a {
        /* renamed from: a */
        void mo90377a(Effect effect, ModelInfo modelInfo, long j);

        /* renamed from: a */
        void mo90378a(Effect effect, ModelInfo modelInfo, Exception exc);

        /* renamed from: a */
        void mo90379a(Effect effect, Exception exc);
    }

    /* renamed from: a */
    public static boolean m138406a() {
        if (f113071j != null) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    private static C43698c m138409h() {
        return f113071j.mo105681e();
    }

    /* renamed from: d */
    public final C43749a mo105680d() {
        return m138409h();
    }

    /* renamed from: f */
    public final DownloadableModelSupportResourceFinder mo105682f() {
        return m138410i();
    }

    /* renamed from: b */
    public static C43681b m138407b() {
        if (f113071j != null) {
            return f113071j;
        }
        throw new IllegalStateException("downloadableModelSupport not initialize");
    }

    /* renamed from: g */
    private void m138408g() {
        this.f113086q = new C43856m(new C43739h<C1592h<C43862o>>() {
            /* access modifiers changed from: private */
            /* renamed from: b */
            public C1592h<C43862o> mo105683a() {
                return C43681b.this.mo105679c();
            }
        });
    }

    /* renamed from: c */
    public final C1592h<C43862o> mo105679c() {
        return C1592h.m7855a((Callable<TResult>) new Callable<C43862o>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public C43862o call() throws Exception {
                HashMap hashMap = new HashMap();
                hashMap.put("sdk_version", C43681b.this.f113076f);
                hashMap.put("device_type", C43681b.this.f113075e);
                hashMap.put("status", String.valueOf(C43681b.this.f113077g.ordinal()));
                new C43727d(null, null, hashMap) {

                    /* renamed from: a */
                    final /* synthetic */ Map f113089a;

                    /* renamed from: a */
                    public final void mo105685a() {
                        C43834g gVar = C43681b.this.f113078h.f113044k;
                        if (gVar != null) {
                            this.f113089a.putAll(m138568a(gVar));
                        }
                    }

                    {
                        this.f113089a = r4;
                    }
                }.mo105685a();
                StringBuilder sb = new StringBuilder();
                sb.append(((Host) C43681b.this.f113073c.get(0)).getItemName());
                sb.append("/model/api/arithmetics");
                DownloadableModelResponse downloadableModelResponse = (DownloadableModelResponse) C43681b.this.f113074d.mo70689a(C43681b.this.f113072b.mo106116a(new C43707b("GET", C43735g.m138609a(hashMap, sb.toString()))), DownloadableModelResponse.class);
                C43728e eVar = new C43728e();
                if (downloadableModelResponse == null || downloadableModelResponse.getData() == null) {
                    throw new IllegalStateException("get net data failed");
                }
                for (String str : downloadableModelResponse.getData().getArithmetics().keySet()) {
                    for (ModelInfo a : (List) downloadableModelResponse.getData().getArithmetics().get(str)) {
                        eVar.mo105772a(str, a);
                    }
                }
                return new C43862o(eVar);
            }
        }, this.f113082m);
    }

    /* renamed from: i */
    private DownloadableModelSupportResourceFinder m138410i() {
        if (this.f113085p == null) {
            this.f113085p = new DownloadableModelSupportResourceFinder(this.f113086q, this.f113079i, this.f113080k, this.f113083n);
        }
        return this.f113085p;
    }

    /* renamed from: e */
    public final C43698c mo105681e() {
        if (this.f113084o == null) {
            C43698c cVar = new C43698c(this.f113078h, this.f113080k, this.f113079i, this.f113072b, this.f113086q, this.f113083n);
            this.f113084o = cVar;
        }
        return this.f113084o;
    }

    /* renamed from: a */
    public static void m138405a(C43746d dVar) {
        f113070a = (C43746d) C43701a.m138484a(dVar);
    }

    /* renamed from: a */
    public static void m138404a(DownloadableModelConfig downloadableModelConfig) {
        if (downloadableModelConfig == null) {
            throw new NullPointerException();
        } else if (f113071j == null) {
            C43681b bVar = new C43681b(downloadableModelConfig);
            f113071j = bVar;
            bVar.m138408g();
        } else {
            throw new IllegalStateException("Duplicate initialization");
        }
    }

    private C43681b(DownloadableModelConfig downloadableModelConfig) {
        this.f113080k = new C43679a(downloadableModelConfig.f113034a, downloadableModelConfig.f113042i);
        this.f113081l = downloadableModelConfig.f113035b;
        this.f113072b = new C43859a(downloadableModelConfig.f113036c);
        this.f113073c = downloadableModelConfig.f113037d;
        this.f113074d = downloadableModelConfig.f113038e;
        this.f113082m = downloadableModelConfig.f113039f;
        this.f113075e = downloadableModelConfig.f113040g;
        this.f113076f = downloadableModelConfig.f113041h;
        this.f113079i = new C43831f(this.f113081l, this.f113076f);
        this.f113083n = downloadableModelConfig.f113043j;
        this.f113077g = downloadableModelConfig.f113045l;
        this.f113078h = downloadableModelConfig;
    }

    /* renamed from: a */
    public final void mo105677a(final String[] strArr, final C43845j jVar) {
        C1592h.m7855a((Callable<TResult>) new Callable<Void>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public Void call() throws Exception {
                C43681b.this.mo105681e().mo105720a(Arrays.asList(strArr));
                return null;
            }
        }, (Executor) C1592h.f5957a).mo6875a((C1591g<TResult, TContinuationResult>) new C1591g<Void, Void>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public Void then(C1592h<Void> hVar) throws Exception {
                if (hVar.mo6889d()) {
                    if (jVar != null) {
                        jVar.mo70700a(hVar.mo6891f());
                    }
                } else if (jVar != null) {
                    jVar.mo70701a(strArr);
                }
                return null;
            }
        });
    }

    /* JADX INFO: used method not loaded: com.ss.android.ugc.effectmanager.c.a(java.lang.String[]):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0047, code lost:
        if (m138409h().mo105719a(new java.lang.String[]{r3}).isEmpty() == false) goto L_0x0049;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo105678a(com.p280ss.android.ugc.effectmanager.C43837h r8, com.p280ss.android.ugc.effectmanager.effect.model.Effect r9) {
        /*
            r7 = this;
            boolean r8 = r8.mo106021a(r9)
            r0 = 0
            if (r8 == 0) goto L_0x0051
            java.util.List r8 = r9.getRequirements()
            if (r8 != 0) goto L_0x0011
            java.util.List r8 = java.util.Collections.emptyList()
        L_0x0011:
            boolean r9 = r8.isEmpty()
            r1 = 1
            if (r9 == 0) goto L_0x0019
            return r1
        L_0x0019:
            int r9 = r8.size()
            java.lang.String[] r9 = new java.lang.String[r9]
            java.lang.Object[] r8 = r8.toArray(r9)
            java.lang.String[] r8 = (java.lang.String[]) r8
            java.lang.String[] r8 = com.bef.effectsdk.RequirementResourceMapper.m8926a(r8)
            int r9 = r8.length
            r2 = 0
        L_0x002b:
            if (r2 >= r9) goto L_0x0050
            r3 = r8[r2]
            com.ss.android.ugc.effectmanager.DownloadableModelSupportResourceFinder r4 = r7.m138410i()
            boolean r4 = r4.isResourceAvailable(r3)
            com.ss.android.ugc.effectmanager.c r5 = m138409h()     // Catch:{ Exception -> 0x0049 }
            java.lang.String[] r6 = new java.lang.String[r1]     // Catch:{ Exception -> 0x0049 }
            r6[r0] = r3     // Catch:{ Exception -> 0x0049 }
            java.util.Collection r3 = r5.mo105719a(r6)     // Catch:{ Exception -> 0x0049 }
            boolean r3 = r3.isEmpty()     // Catch:{ Exception -> 0x0049 }
            if (r3 != 0) goto L_0x004a
        L_0x0049:
            r4 = 0
        L_0x004a:
            if (r4 != 0) goto L_0x004d
            return r0
        L_0x004d:
            int r2 = r2 + 1
            goto L_0x002b
        L_0x0050:
            return r1
        L_0x0051:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.effectmanager.C43681b.mo105678a(com.ss.android.ugc.effectmanager.h, com.ss.android.ugc.effectmanager.effect.model.Effect):boolean");
    }
}
