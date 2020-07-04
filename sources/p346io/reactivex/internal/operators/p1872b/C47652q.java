package p346io.reactivex.internal.operators.p1872b;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p346io.reactivex.C47557ad;
import p346io.reactivex.C7319aa;
import p346io.reactivex.C7499z;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.p347b.C7321c;

/* renamed from: io.reactivex.internal.operators.b.q */
public final class C47652q extends C7319aa<Long> {

    /* renamed from: a */
    final long f122139a;

    /* renamed from: b */
    final TimeUnit f122140b;

    /* renamed from: c */
    final C7499z f122141c;

    /* renamed from: io.reactivex.internal.operators.b.q$a */
    static final class C47653a extends AtomicReference<C7321c> implements C7321c, Runnable {
        private static final long serialVersionUID = 8465401857522493082L;

        /* renamed from: a */
        final C47557ad<? super Long> f122142a;

        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        public final boolean isDisposed() {
            return DisposableHelper.isDisposed((C7321c) get());
        }

        public final void run() {
            this.f122142a.onSuccess(Long.valueOf(0));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo119719a(C7321c cVar) {
            DisposableHelper.replace(this, cVar);
        }

        C47653a(C47557ad<? super Long> adVar) {
            this.f122142a = adVar;
        }
    }

    /* renamed from: a */
    public final void mo10199a(C47557ad<? super Long> adVar) {
        C47653a aVar = new C47653a(adVar);
        adVar.onSubscribe(aVar);
        aVar.mo119719a(this.f122141c.mo19337a(aVar, this.f122139a, this.f122140b));
    }

    public C47652q(long j, TimeUnit timeUnit, C7499z zVar) {
        this.f122139a = j;
        this.f122140b = timeUnit;
        this.f122141c = zVar;
    }
}
