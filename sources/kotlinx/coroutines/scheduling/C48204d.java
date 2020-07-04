package kotlinx.coroutines.scheduling;

import kotlin.jvm.internal.C7573i;
import kotlinx.coroutines.internal.C48165k;
import kotlinx.coroutines.internal.C48166l;
import kotlinx.coroutines.internal.C48166l.C48168b;

/* renamed from: kotlinx.coroutines.scheduling.d */
public final class C48204d extends C48165k<C48208h> {
    public C48204d() {
        super(false);
    }

    /* renamed from: a */
    public final C48208h mo120436a(TaskMode taskMode) {
        Object obj;
        Object obj2;
        C7573i.m23587b(taskMode, "mode");
        while (true) {
            C48166l lVar = (C48166l) this._cur$internal;
            while (true) {
                long j = lVar._state$internal;
                obj = null;
                if ((1152921504606846976L & j) == 0) {
                    boolean z = false;
                    int i = (int) ((1073741823 & j) >> 0);
                    if ((((int) ((1152921503533105152L & j) >> 30)) & lVar.f123024a) != (lVar.f123024a & i)) {
                        obj2 = lVar.f123025c.get(lVar.f123024a & i);
                        if (obj2 != null) {
                            if (obj2 instanceof C48168b) {
                                break;
                            }
                            if (((C48208h) obj2).mo120442e() == taskMode) {
                                z = true;
                            }
                            if (!z) {
                                break;
                            }
                            int i2 = (i + 1) & 1073741823;
                            if (C48166l.f123020b.compareAndSet(lVar, j, C48166l.f123022f.mo120393a(j, i2))) {
                                lVar.f123025c.set(lVar.f123024a & i, null);
                                break;
                            } else if (lVar.f123026d) {
                                C48166l lVar2 = lVar;
                                do {
                                    lVar2 = lVar2.mo120387a(i, i2);
                                } while (lVar2 != null);
                                break;
                            }
                        } else if (lVar.f123026d) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    obj = C48166l.f123021e;
                    break;
                }
            }
            obj = obj2;
            if (obj != C48166l.f123021e) {
                return (C48208h) obj;
            }
            C48165k.f123019a.compareAndSet(this, lVar, lVar.mo120392e());
        }
    }
}
