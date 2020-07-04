package com.p280ss.android.ugc.network.observer;

import com.bytedance.netecho.NetechoConfig;
import com.p280ss.android.ugc.network.observer.bean.C44895c;
import com.p280ss.android.ugc.network.observer.bean.DetectorParam;
import com.p280ss.android.ugc.network.observer.p1749b.C44891b;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.ss.android.ugc.network.observer.b */
public final class C44887b {

    /* renamed from: a */
    public static final C44887b f115425a = new C44887b();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static ConcurrentHashMap<Long, C44891b> f115426b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private static volatile AtomicLong f115427c = new AtomicLong(10);

    /* renamed from: com.ss.android.ugc.network.observer.b$a */
    static final class C44889a extends Lambda implements C7562b<Long, C7581n> {

        /* renamed from: a */
        final /* synthetic */ long f115429a;

        /* renamed from: b */
        final /* synthetic */ DetectorParam f115430b;

        /* renamed from: c */
        final /* synthetic */ C44895c f115431c;

        /* renamed from: d */
        final /* synthetic */ C7563m f115432d;

        /* renamed from: e */
        final /* synthetic */ C7562b f115433e;

        C44889a(long j, DetectorParam detectorParam, C44895c cVar, C7563m mVar, C7562b bVar) {
            this.f115429a = j;
            this.f115430b = detectorParam;
            this.f115431c = cVar;
            this.f115432d = mVar;
            this.f115433e = bVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m141624a(((Number) obj).longValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m141624a(long j) {
            try {
                C44887b.f115426b.remove(Long.valueOf(this.f115429a));
                C44897c.f115457a.mo107371a(this.f115429a, this.f115430b, this.f115431c, this.f115432d, this.f115433e);
            } catch (Throwable unused) {
            }
        }
    }

    private C44887b() {
    }

    /* renamed from: a */
    private static long m141618a() {
        return f115427c.incrementAndGet();
    }

    static {
        NetechoConfig.INSTANCE.setLoadLibrary(C448881.f115428a);
    }

    /* renamed from: a */
    public static void m141621a(long j) {
        C44891b bVar = (C44891b) f115426b.get(Long.valueOf(j));
        if (bVar != null) {
            bVar.mo107346a();
            f115426b.remove(Long.valueOf(j));
        }
        C44897c.m141644b(j);
    }

    /* renamed from: a */
    public final long mo107345a(DetectorParam detectorParam, C44895c cVar, C7563m<? super NetworkState, ? super HashMap<String, HashMap<String, Object>>, C7581n> mVar, C7562b<? super HashMap<String, Object>, C7581n> bVar) {
        C7573i.m23587b(detectorParam, "netParam");
        C7573i.m23587b(cVar, "localParam");
        C7573i.m23587b(mVar, "callback");
        C7573i.m23587b(bVar, "callback2");
        long a = m141618a();
        f115426b.put(Long.valueOf(a), m141619a(a, detectorParam, cVar, mVar, bVar));
        return a;
    }

    /* renamed from: a */
    private static C44891b m141619a(long j, DetectorParam detectorParam, C44895c cVar, C7563m<? super NetworkState, ? super HashMap<String, HashMap<String, Object>>, C7581n> mVar, C7562b<? super HashMap<String, Object>, C7581n> bVar) {
        C44891b bVar2 = new C44891b();
        long startTimeout = (long) detectorParam.getStartTimeout();
        C44889a aVar = new C44889a(j, detectorParam, cVar, mVar, bVar);
        bVar2.mo107347a(startTimeout, aVar);
        return bVar2;
    }
}
