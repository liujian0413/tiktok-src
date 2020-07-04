package kotlinx.coroutines.scheduling;

import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.C7573i;
import kotlin.p356e.C7551d;

/* renamed from: kotlinx.coroutines.scheduling.m */
public final class C48213m {

    /* renamed from: b */
    static final AtomicIntegerFieldUpdater f123111b = AtomicIntegerFieldUpdater.newUpdater(C48213m.class, "producerIndex");

    /* renamed from: c */
    static final AtomicIntegerFieldUpdater f123112c = AtomicIntegerFieldUpdater.newUpdater(C48213m.class, "consumerIndex");

    /* renamed from: d */
    private static final AtomicReferenceFieldUpdater f123113d = AtomicReferenceFieldUpdater.newUpdater(C48213m.class, Object.class, "lastScheduledTask");

    /* renamed from: a */
    public final AtomicReferenceArray<C48208h> f123114a = new AtomicReferenceArray<>(PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
    volatile int consumerIndex = 0;
    private volatile Object lastScheduledTask = null;
    volatile int producerIndex = 0;

    /* renamed from: a */
    public final int mo120445a() {
        return this.producerIndex - this.consumerIndex;
    }

    /* renamed from: c */
    public final int mo120451c() {
        if (this.lastScheduledTask != null) {
            return mo120445a() + 1;
        }
        return mo120445a();
    }

    /* renamed from: b */
    public final C48208h mo120449b() {
        C48208h hVar = (C48208h) f123113d.getAndSet(this, null);
        if (hVar != null) {
            return hVar;
        }
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                return null;
            }
            int i2 = i & 127;
            if (((C48208h) this.f123114a.get(i2)) != null && f123112c.compareAndSet(this, i, i + 1)) {
                return (C48208h) this.f123114a.getAndSet(i2, null);
            }
        }
    }

    /* renamed from: a */
    private final boolean m149593a(C48208h hVar) {
        if (mo120445a() == 127) {
            return false;
        }
        int i = this.producerIndex & 127;
        if (this.f123114a.get(i) != null) {
            return false;
        }
        this.f123114a.lazySet(i, hVar);
        f123111b.incrementAndGet(this);
        return true;
    }

    /* renamed from: b */
    private final void m149594b(C48204d dVar) {
        C48208h hVar;
        int c = C7551d.m23566c(mo120445a() / 2, 1);
        int i = 0;
        while (i < c) {
            while (true) {
                int i2 = this.consumerIndex;
                hVar = null;
                if (i2 - this.producerIndex == 0) {
                    break;
                }
                int i3 = i2 & 127;
                if (((C48208h) this.f123114a.get(i3)) != null && f123112c.compareAndSet(this, i2, i2 + 1)) {
                    hVar = (C48208h) this.f123114a.getAndSet(i3, null);
                    break;
                }
            }
            if (hVar != null) {
                m149591a(dVar, hVar);
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final void mo120446a(C48204d dVar) {
        C48208h hVar;
        C7573i.m23587b(dVar, "globalQueue");
        C48208h hVar2 = (C48208h) f123113d.getAndSet(this, null);
        if (hVar2 != null) {
            m149591a(dVar, hVar2);
        }
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                hVar = null;
            } else {
                int i2 = i & 127;
                if (((C48208h) this.f123114a.get(i2)) != null && f123112c.compareAndSet(this, i, i + 1)) {
                    hVar = (C48208h) this.f123114a.getAndSet(i2, null);
                }
            }
            if (hVar != null) {
                m149591a(dVar, hVar);
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private static void m149591a(C48204d dVar, C48208h hVar) {
        if (!dVar.mo120383a(hVar)) {
            throw new IllegalStateException("GlobalQueue could not be closed yet".toString());
        }
    }

    /* renamed from: b */
    public final boolean mo120450b(C48208h hVar, C48204d dVar) {
        C7573i.m23587b(hVar, "task");
        C7573i.m23587b(dVar, "globalQueue");
        boolean z = true;
        while (!m149593a(hVar)) {
            m149594b(dVar);
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    public final boolean mo120447a(C48208h hVar, C48204d dVar) {
        C7573i.m23587b(hVar, "task");
        C7573i.m23587b(dVar, "globalQueue");
        C48208h hVar2 = (C48208h) f123113d.getAndSet(this, hVar);
        if (hVar2 == null) {
            return true;
        }
        return mo120450b(hVar2, dVar);
    }

    /* renamed from: a */
    public final boolean mo120448a(C48213m mVar, C48204d dVar) {
        C48208h hVar;
        boolean z;
        C48213m mVar2 = mVar;
        C48204d dVar2 = dVar;
        C7573i.m23587b(mVar2, "victim");
        C7573i.m23587b(dVar2, "globalQueue");
        long a = C48211k.f123110g.mo120441a();
        int a2 = mVar.mo120445a();
        if (a2 == 0) {
            return m149592a(a, mVar2, dVar2);
        }
        int c = C7551d.m23566c(a2 / 2, 1);
        int i = 0;
        boolean z2 = false;
        while (i < c) {
            while (true) {
                int i2 = mVar2.consumerIndex;
                hVar = null;
                if (i2 - mVar2.producerIndex == 0) {
                    break;
                }
                int i3 = i2 & 127;
                C48208h hVar2 = (C48208h) mVar2.f123114a.get(i3);
                if (hVar2 != null) {
                    if (a - hVar2.f123101f >= C48211k.f123104a || mVar.mo120445a() > C48211k.f123105b) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        break;
                    } else if (f123112c.compareAndSet(mVar2, i2, i2 + 1)) {
                        hVar = (C48208h) mVar2.f123114a.getAndSet(i3, null);
                        break;
                    }
                }
            }
            if (hVar == null) {
                return z2;
            }
            mo120447a(hVar, dVar2);
            i++;
            z2 = true;
        }
        return z2;
    }

    /* renamed from: a */
    private final boolean m149592a(long j, C48213m mVar, C48204d dVar) {
        C48208h hVar = (C48208h) mVar.lastScheduledTask;
        if (hVar == null || j - hVar.f123101f < C48211k.f123104a || !f123113d.compareAndSet(mVar, hVar, null)) {
            return false;
        }
        mo120447a(hVar, dVar);
        return true;
    }
}
