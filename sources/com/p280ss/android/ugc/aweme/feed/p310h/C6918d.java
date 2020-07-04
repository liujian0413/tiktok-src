package com.p280ss.android.ugc.aweme.feed.p310h;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.h.d */
public final class C6918d {

    /* renamed from: a */
    public static final C6918d f19600a = new C6918d();

    /* renamed from: b */
    private static ConcurrentHashMap<String, C6916b> f19601b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private static ArrayList<String> f19602c = new ArrayList<>();

    /* renamed from: d */
    private static ReentrantReadWriteLock f19603d = new ReentrantReadWriteLock();

    private C6918d() {
    }

    /* renamed from: f */
    private static void m21546f(String str) {
        if (str != null && !f19601b.containsKey(str)) {
            f19601b.putIfAbsent(str, new C6916b());
        }
    }

    /* renamed from: b */
    public final void mo16977b(String str) {
        m21546f(str);
        C6916b bVar = (C6916b) f19601b.get(str);
        if (bVar != null) {
            AtomicInteger atomicInteger = bVar.f19590a;
            if (atomicInteger != null) {
                atomicInteger.getAndIncrement();
            }
        }
    }

    /* renamed from: c */
    public final void mo16978c(String str) {
        m21546f(str);
        C6916b bVar = (C6916b) f19601b.get(str);
        if (bVar != null) {
            AtomicInteger atomicInteger = bVar.f19591b;
            if (atomicInteger != null) {
                atomicInteger.getAndIncrement();
            }
        }
    }

    /* renamed from: d */
    public final void mo16979d(String str) {
        m21546f(str);
        C6916b bVar = (C6916b) f19601b.get(str);
        if (bVar != null) {
            AtomicInteger atomicInteger = bVar.f19593d;
            if (atomicInteger != null) {
                atomicInteger.getAndIncrement();
            }
        }
    }

    /* renamed from: e */
    public final void mo16980e(String str) {
        m21546f(str);
        C6916b bVar = (C6916b) f19601b.get(str);
        if (bVar != null) {
            AtomicInteger atomicInteger = bVar.f19592c;
            if (atomicInteger != null) {
                atomicInteger.getAndIncrement();
            }
        }
    }

    /* renamed from: a */
    public static void m21545a(String str) {
        C7573i.m23587b(str, "aid");
        f19603d.writeLock().lock();
        try {
            if (!f19602c.contains(str)) {
                f19602c.add(str);
            }
            if (f19602c.size() > 100) {
                Object obj = f19602c.get(0);
                C7573i.m23582a(obj, "historyAidList[0]");
                f19601b.remove((String) obj);
                f19602c.remove(0);
            }
        } finally {
            f19603d.writeLock().unlock();
        }
    }

    /* renamed from: a */
    public final void mo16976a(String str, long j) {
        m21546f(str);
        C6916b bVar = (C6916b) f19601b.get(str);
        if (bVar != null) {
            AtomicLong atomicLong = bVar.f19594e;
            if (atomicLong != null) {
                atomicLong.addAndGet(j);
            }
        }
    }

    /* renamed from: a */
    public static C6917c m21544a(String str, int i) {
        C6917c cVar;
        f19603d.readLock().lock();
        if (str != null && i > 0) {
            try {
                if (f19601b.containsKey(str) && f19602c.contains(str)) {
                    int indexOf = f19602c.indexOf(str);
                    cVar = new C6917c();
                    int i2 = indexOf;
                    for (int i3 = 0; i3 <= i && i2 >= 0; i3++) {
                        Object obj = f19602c.get(i2);
                        C7573i.m23582a(obj, "historyAidList.get(index)");
                        C6916b bVar = (C6916b) f19601b.get((String) obj);
                        if (bVar != null) {
                            cVar.f19595a += bVar.f19590a.get();
                            cVar.f19596b += bVar.f19591b.get();
                            cVar.f19597c += bVar.f19592c.get();
                            cVar.f19598d += bVar.f19593d.get();
                            cVar.f19599e.add(0, Long.valueOf(bVar.f19594e.get()));
                        }
                        i2--;
                    }
                    f19603d.readLock().unlock();
                    return cVar;
                }
            } catch (Throwable th) {
                f19603d.readLock().unlock();
                throw th;
            }
        }
        cVar = null;
        f19603d.readLock().unlock();
        return cVar;
    }
}
