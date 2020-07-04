package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;

/* renamed from: kotlinx.coroutines.bg */
final class C48098bg extends C48103bj<C48100bi> {

    /* renamed from: a */
    private static final AtomicIntegerFieldUpdater f122961a = AtomicIntegerFieldUpdater.newUpdater(C48098bg.class, "_invoked");
    private volatile int _invoked = 0;

    /* renamed from: e */
    private final C7562b<Throwable, C7581n> f122962e;

    public final String toString() {
        StringBuilder sb = new StringBuilder("InvokeOnCancelling[");
        sb.append(C48059ag.m149023b(this));
        sb.append('@');
        sb.append(C48059ag.m149021a((Object) this));
        sb.append(']');
        return sb.toString();
    }

    public final /* synthetic */ Object invoke(Object obj) {
        mo120291a((Throwable) obj);
        return C7581n.f20898a;
    }

    /* renamed from: a */
    public final void mo120291a(Throwable th) {
        if (f122961a.compareAndSet(this, 0, 1)) {
            this.f122962e.invoke(th);
        }
    }

    public C48098bg(C48100bi biVar, C7562b<? super Throwable, C7581n> bVar) {
        C7573i.m23587b(biVar, "job");
        C7573i.m23587b(bVar, "handler");
        super(biVar);
        this.f122962e = bVar;
    }
}
