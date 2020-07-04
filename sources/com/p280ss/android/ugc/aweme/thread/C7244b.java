package com.p280ss.android.ugc.aweme.thread;

import android.os.SystemClock;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.thread.b */
final class C7244b implements Comparable, Runnable {

    /* renamed from: a */
    public Runnable f20255a;

    /* renamed from: b */
    public C7243a f20256b;

    /* renamed from: c */
    public long f20257c = SystemClock.uptimeMillis();

    /* renamed from: d */
    public Thread f20258d;

    public final int hashCode() {
        return this.f20255a.hashCode();
    }

    public final void run() {
        Object obj;
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            this.f20258d = Thread.currentThread();
            Object obj2 = null;
            if (C7273p.m22774b(this.f20255a) && (C7258h.m22729b().mo18965b() || C7258h.m22729b().mo18967c())) {
                obj2 = (Callable) C7273p.m22775c(this.f20255a);
            }
            C7252g.m22716a().mo18977a(this);
            long j = uptimeMillis - this.f20257c;
            if (j >= C7258h.m22723a().f20310d && C7258h.m22729b().mo18965b()) {
                C7252g a = C7252g.m22716a();
                if (obj2 != null) {
                    obj = obj2;
                } else {
                    obj = this.f20255a;
                }
                a.mo18978a(obj, this.f20256b.f20254a.name(), this.f20256b.getPoolSize(), this.f20256b.getQueue().size(), j);
            }
            this.f20255a.run();
            long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
            if (uptimeMillis2 >= C7258h.m22723a().f20311e && C7258h.m22729b().mo18967c()) {
                C7252g a2 = C7252g.m22716a();
                if (obj2 == null) {
                    obj2 = this.f20255a;
                }
                a2.mo18981b(obj2, this.f20256b.f20254a.name(), this.f20256b.getPoolSize(), this.f20256b.getQueue().size(), uptimeMillis2);
            }
        } finally {
            C7252g.m22716a().mo18980b(this);
        }
    }

    public final int compareTo(Object obj) {
        if (!(this.f20255a instanceof Comparable) || !(obj instanceof C7244b)) {
            return 0;
        }
        return ((Comparable) this.f20255a).compareTo(((C7244b) obj).f20255a);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7244b) || !this.f20255a.equals(((C7244b) obj).f20255a)) {
            return false;
        }
        return true;
    }

    C7244b(Runnable runnable, C7243a aVar) {
        this.f20255a = runnable;
        this.f20256b = aVar;
    }
}
