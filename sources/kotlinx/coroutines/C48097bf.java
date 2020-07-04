package kotlinx.coroutines;

import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;

/* renamed from: kotlinx.coroutines.bf */
final class C48097bf extends C48146h {

    /* renamed from: a */
    private final C7562b<Throwable, C7581n> f122960a;

    public final String toString() {
        StringBuilder sb = new StringBuilder("InvokeOnCancel[");
        sb.append(C48059ag.m149023b(this.f122960a));
        sb.append('@');
        sb.append(C48059ag.m149021a((Object) this));
        sb.append(']');
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo120289a(Throwable th) {
        this.f122960a.invoke(th);
    }

    public final /* synthetic */ Object invoke(Object obj) {
        mo120289a((Throwable) obj);
        return C7581n.f20898a;
    }

    public C48097bf(C7562b<? super Throwable, C7581n> bVar) {
        C7573i.m23587b(bVar, "handler");
        this.f122960a = bVar;
    }
}
