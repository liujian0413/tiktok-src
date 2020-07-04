package kotlinx.coroutines;

import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;

/* renamed from: kotlinx.coroutines.bh */
final class C48099bh extends C48107bn<C48100bi> {

    /* renamed from: a */
    private final C7562b<Throwable, C7581n> f122963a;

    public final String toString() {
        StringBuilder sb = new StringBuilder("InvokeOnCompletion[");
        sb.append(C48059ag.m149023b(this));
        sb.append('@');
        sb.append(C48059ag.m149021a((Object) this));
        sb.append(']');
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo120291a(Throwable th) {
        this.f122963a.invoke(th);
    }

    public final /* synthetic */ Object invoke(Object obj) {
        mo120291a((Throwable) obj);
        return C7581n.f20898a;
    }

    public C48099bh(C48100bi biVar, C7562b<? super Throwable, C7581n> bVar) {
        C7573i.m23587b(biVar, "job");
        C7573i.m23587b(bVar, "handler");
        super(biVar);
        this.f122963a = bVar;
    }
}
