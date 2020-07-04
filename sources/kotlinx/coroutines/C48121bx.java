package kotlinx.coroutines;

import kotlin.C7581n;
import kotlin.Result;
import kotlin.jvm.internal.C7573i;

/* renamed from: kotlinx.coroutines.bx */
final class C48121bx<T> extends C48107bn<C48108bo> {

    /* renamed from: a */
    private final C48188k<T> f122983a;

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResumeAwaitOnCompletion[");
        sb.append(this.f122983a);
        sb.append(']');
        return sb.toString();
    }

    public final /* synthetic */ Object invoke(Object obj) {
        mo120291a((Throwable) obj);
        return C7581n.f20898a;
    }

    /* renamed from: a */
    public final void mo120291a(Throwable th) {
        boolean z;
        Object o = ((C48108bo) this.f122966b).mo120343o();
        if (!(o instanceof C48095bd)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalStateException("Check failed.".toString());
        } else if (o instanceof C48217t) {
            this.f122983a.mo120406a(((C48217t) o).f123124a, 0);
        } else {
            this.f122983a.resumeWith(Result.m150902constructorimpl(C48113bp.m149222b(o)));
        }
    }

    public C48121bx(C48108bo boVar, C48188k<? super T> kVar) {
        C7573i.m23587b(boVar, "job");
        C7573i.m23587b(kVar, "continuation");
        super(boVar);
        this.f122983a = kVar;
    }
}
