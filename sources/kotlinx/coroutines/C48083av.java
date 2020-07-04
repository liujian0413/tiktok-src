package kotlinx.coroutines;

import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;

/* renamed from: kotlinx.coroutines.av */
public final class C48083av extends C48107bn<C48100bi> {

    /* renamed from: a */
    private final C48081at f122941a;

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisposeOnCompletion[");
        sb.append(this.f122941a);
        sb.append(']');
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo120291a(Throwable th) {
        this.f122941a.mo120281a();
    }

    public final /* synthetic */ Object invoke(Object obj) {
        mo120291a((Throwable) obj);
        return C7581n.f20898a;
    }

    public C48083av(C48100bi biVar, C48081at atVar) {
        C7573i.m23587b(biVar, "job");
        C7573i.m23587b(atVar, "handle");
        super(biVar);
        this.f122941a = atVar;
    }
}
