package com.p280ss.android.ugc.network.observer;

import com.p280ss.android.ugc.network.observer.bean.C44895c;
import com.p280ss.android.ugc.network.observer.bean.C44896d;
import com.p280ss.android.ugc.network.observer.bean.DetectorParam;
import com.p280ss.android.ugc.network.observer.p1749b.C44890a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.C7581n;
import kotlin.Pair;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.ss.android.ugc.network.observer.c */
public final class C44897c {

    /* renamed from: a */
    public static final C44897c f115457a = new C44897c();

    /* renamed from: b */
    private static NetworkState f115458b = NetworkState.UNKNOWN_STATUS;

    /* renamed from: c */
    private static long f115459c = -1;

    /* renamed from: d */
    private static long f115460d = -1;

    /* renamed from: e */
    private static int f115461e;

    /* renamed from: f */
    private static AtomicBoolean f115462f = new AtomicBoolean(true);

    /* renamed from: g */
    private static Thread f115463g;

    /* renamed from: h */
    private static C44880a f115464h;

    private C44897c() {
    }

    /* renamed from: a */
    private static boolean m141642a() {
        if (f115463g != null) {
            Thread thread = f115463g;
            if (thread == null) {
                C7573i.m23580a();
            }
            if (thread.isAlive()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static void m141640a(long j) {
        f115459c = j;
    }

    /* renamed from: b */
    public static void m141644b(long j) {
        C44880a aVar = f115464h;
        if (aVar != null && aVar.f115399b.contains(Long.valueOf(j))) {
            Thread thread = f115463g;
            if (thread != null) {
                thread.interrupt();
            }
        }
    }

    /* renamed from: a */
    private static void m141641a(DetectorParam detectorParam, C44895c cVar) {
        f115464h = new C44880a(detectorParam, cVar);
        Thread thread = new Thread(f115464h);
        f115463g = thread;
        thread.start();
    }

    /* renamed from: a */
    private static boolean m141643a(long j, DetectorParam detectorParam) {
        if (j - f115459c <= ((long) detectorParam.getBlackTimeout())) {
            return true;
        }
        if (j - f115460d > 60000) {
            f115460d = j;
            f115461e = 1;
            f115462f.set(true);
        } else {
            int i = f115461e + 1;
            f115461e = i;
            if (i > detectorParam.getFrequencyLimit()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo107371a(long j, DetectorParam detectorParam, C44895c cVar, C7563m<? super NetworkState, ? super HashMap<String, HashMap<String, Object>>, C7581n> mVar, C7562b<? super HashMap<String, Object>, C7581n> bVar) {
        C7573i.m23587b(detectorParam, "param");
        C7573i.m23587b(cVar, "localParam");
        C7573i.m23587b(mVar, "callback");
        C7573i.m23587b(bVar, "callback2");
        if (!m141642a()) {
            if (m141643a(System.currentTimeMillis(), detectorParam)) {
                mVar.invoke(NetworkState.UNKNOWN_STATUS, new HashMap());
                if (f115462f.compareAndSet(true, false)) {
                    HashMap hashMap = new HashMap();
                    HashMap hashMap2 = new HashMap();
                    Map map = hashMap;
                    map.put(C44896d.m141638j(), String.valueOf(NetworkState.UNKNOWN_STATUS.ordinal()));
                    hashMap2.put("extra_info", C44890a.m141625a("1", cVar));
                    map.put(C44896d.m141639k(), hashMap2);
                    bVar.invoke(hashMap);
                }
                return;
            }
            m141641a(detectorParam, cVar);
        }
        C44880a aVar = f115464h;
        if (aVar != null) {
            aVar.f115398a.add(new Pair(mVar, bVar));
            aVar.f115399b.add(Long.valueOf(j));
        }
    }
}
