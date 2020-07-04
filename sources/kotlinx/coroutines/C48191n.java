package kotlinx.coroutines;

import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;

/* renamed from: kotlinx.coroutines.n */
public final class C48191n extends C48103bj<C48100bi> {

    /* renamed from: a */
    public final C48188k<?> f123053a;

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChildContinuation[");
        sb.append(this.f123053a);
        sb.append(']');
        return sb.toString();
    }

    public final /* synthetic */ Object invoke(Object obj) {
        mo120291a((Throwable) obj);
        return C7581n.f20898a;
    }

    /* renamed from: a */
    public final void mo120291a(Throwable th) {
        this.f123053a.mo120407a(this.f123053a.mo120346a(this.f122966b));
    }

    public C48191n(C48100bi biVar, C48188k<?> kVar) {
        C7573i.m23587b(biVar, "parent");
        C7573i.m23587b(kVar, "child");
        super(biVar);
        this.f123053a = kVar;
    }
}
