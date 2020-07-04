package kotlinx.coroutines;

import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;

/* renamed from: kotlinx.coroutines.p */
public final class C48193p extends C48103bj<C48108bo> implements C48192o {

    /* renamed from: a */
    public final C48194q f123054a;

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChildHandle[");
        sb.append(this.f123054a);
        sb.append(']');
        return sb.toString();
    }

    public final /* synthetic */ Object invoke(Object obj) {
        mo120291a((Throwable) obj);
        return C7581n.f20898a;
    }

    /* renamed from: a */
    public final void mo120291a(Throwable th) {
        this.f123054a.mo120338a((C48120bw) this.f122966b);
    }

    /* renamed from: b */
    public final boolean mo120355b(Throwable th) {
        C7573i.m23587b(th, "cause");
        return ((C48108bo) this.f122966b).mo120341c(th);
    }

    public C48193p(C48108bo boVar, C48194q qVar) {
        C7573i.m23587b(boVar, "parent");
        C7573i.m23587b(qVar, "childJob");
        super(boVar);
        this.f123054a = qVar;
    }
}
