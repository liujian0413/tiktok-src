package kotlinx.coroutines;

import kotlin.C7581n;
import kotlin.Result;
import kotlin.coroutines.C47919b;
import kotlin.jvm.internal.C7573i;

/* renamed from: kotlinx.coroutines.bz */
final class C48123bz extends C48107bn<C48100bi> {

    /* renamed from: a */
    private final C47919b<C7581n> f122984a;

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResumeOnCompletion[");
        sb.append(this.f122984a);
        sb.append(']');
        return sb.toString();
    }

    public final /* synthetic */ Object invoke(Object obj) {
        mo120291a((Throwable) obj);
        return C7581n.f20898a;
    }

    /* renamed from: a */
    public final void mo120291a(Throwable th) {
        this.f122984a.resumeWith(Result.m150902constructorimpl(C7581n.f20898a));
    }

    public C48123bz(C48100bi biVar, C47919b<? super C7581n> bVar) {
        C7573i.m23587b(biVar, "job");
        C7573i.m23587b(bVar, "continuation");
        super(biVar);
        this.f122984a = bVar;
    }
}
