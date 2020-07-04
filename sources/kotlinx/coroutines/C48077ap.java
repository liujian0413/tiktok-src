package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.C47919b;
import kotlin.coroutines.C47924e;
import kotlin.coroutines.intrinsics.C47948a;
import kotlin.jvm.internal.C7573i;
import kotlinx.coroutines.internal.C48175s;

/* renamed from: kotlinx.coroutines.ap */
final class C48077ap<T> extends C48175s<T> {

    /* renamed from: d */
    private static final AtomicIntegerFieldUpdater f122933d = AtomicIntegerFieldUpdater.newUpdater(C48077ap.class, "_decision");
    private volatile int _decision = 0;

    /* renamed from: f */
    public final int mo120255f() {
        return 0;
    }

    /* renamed from: i */
    public final Object mo120286i() {
        if (m149055q()) {
            return C47948a.m148881a();
        }
        Object b = C48113bp.m149222b(mo120343o());
        if (!(b instanceof C48217t)) {
            return b;
        }
        throw ((C48217t) b).f123124a;
    }

    /* renamed from: q */
    private final boolean m149055q() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f122933d.compareAndSet(this, 0, 1));
        return true;
    }

    /* renamed from: r */
    private final boolean m149056r() {
        do {
            switch (this._decision) {
                case 0:
                    break;
                case 1:
                    return false;
                default:
                    throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f122933d.compareAndSet(this, 0, 2));
        return true;
    }

    public C48077ap(C47924e eVar, C47919b<? super T> bVar) {
        C7573i.m23587b(eVar, "context");
        C7573i.m23587b(bVar, "uCont");
        super(eVar, bVar);
    }

    /* renamed from: a */
    public final void mo120248a(Object obj, int i, boolean z) {
        if (!m149056r()) {
            super.mo120248a(obj, i, z);
        }
    }
}
