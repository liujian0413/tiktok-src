package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.C47924e;
import kotlin.jvm.internal.C7573i;

/* renamed from: kotlinx.coroutines.c */
final class C48124c<T> extends C48048a<T> {

    /* renamed from: c */
    private final Thread f122985c;

    /* renamed from: d */
    private final C48085ax f122986d;

    /* JADX INFO: finally extract failed */
    public final T cc_() {
        long j;
        C48085ax axVar = this.f122986d;
        T t = null;
        if (axVar != null) {
            axVar.mo120297a(false);
        }
        while (!Thread.interrupted()) {
            try {
                C48085ax axVar2 = this.f122986d;
                if (axVar2 != null) {
                    j = axVar2.mo120298b();
                } else {
                    j = Long.MAX_VALUE;
                }
                if (!mo120328j()) {
                    C48130ce.m149255a().mo120270a(this, j);
                } else {
                    C48085ax axVar3 = this.f122986d;
                    if (axVar3 != null) {
                        axVar3.mo120299b(false);
                    }
                    T b = C48113bp.m149222b(mo120343o());
                    if (b instanceof C48217t) {
                        t = b;
                    }
                    C48217t tVar = (C48217t) t;
                    if (tVar == null) {
                        return b;
                    }
                    throw tVar.f123124a;
                }
            } catch (Throwable th) {
                C48085ax axVar4 = this.f122986d;
                if (axVar4 != null) {
                    axVar4.mo120299b(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        mo120327b((Throwable) interruptedException);
        throw interruptedException;
    }

    public C48124c(C47924e eVar, Thread thread, C48085ax axVar) {
        C7573i.m23587b(eVar, "parentContext");
        C7573i.m23587b(thread, "blockedThread");
        super(eVar, true);
        this.f122985c = thread;
        this.f122986d = axVar;
    }

    /* renamed from: a */
    public final void mo120248a(Object obj, int i, boolean z) {
        if (!C7573i.m23585a((Object) Thread.currentThread(), (Object) this.f122985c)) {
            LockSupport.unpark(this.f122985c);
        }
    }
}
