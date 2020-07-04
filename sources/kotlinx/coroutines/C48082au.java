package kotlinx.coroutines;

import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;

/* renamed from: kotlinx.coroutines.au */
final class C48082au extends C48146h {

    /* renamed from: a */
    private final C48081at f122940a;

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisposeOnCancel[");
        sb.append(this.f122940a);
        sb.append(']');
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo120289a(Throwable th) {
        this.f122940a.mo120281a();
    }

    public final /* synthetic */ Object invoke(Object obj) {
        mo120289a((Throwable) obj);
        return C7581n.f20898a;
    }

    public C48082au(C48081at atVar) {
        C7573i.m23587b(atVar, "handle");
        this.f122940a = atVar;
    }
}
