package kotlinx.coroutines;

import kotlin.coroutines.C47919b;
import kotlin.coroutines.jvm.internal.C47953c;
import kotlin.jvm.internal.C7573i;

/* renamed from: kotlinx.coroutines.cf */
final class C48131cf<U, T extends U> extends C48048a<T> implements Runnable, C47919b<T>, C47953c {

    /* renamed from: c */
    public final long f122990c;

    /* renamed from: d */
    public final C47919b<U> f122991d;

    /* renamed from: f */
    public final int mo120255f() {
        return 2;
    }

    public final void run() {
        mo120327b((Throwable) C48132cg.m149261a(this.f122990c, (C48100bi) this));
    }

    /* renamed from: g */
    public final String mo120256g() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.mo120256g());
        sb.append("(timeMillis=");
        sb.append(this.f122990c);
        sb.append(')');
        return sb.toString();
    }

    public final C47953c getCallerFrame() {
        C47919b<U> bVar = this.f122991d;
        if (!(bVar instanceof C47953c)) {
            bVar = null;
        }
        C47953c cVar = (C47953c) bVar;
        if (cVar != null) {
            return cVar.getCallerFrame();
        }
        return null;
    }

    public final StackTraceElement getStackTraceElement() {
        C47919b<U> bVar = this.f122991d;
        if (!(bVar instanceof C47953c)) {
            bVar = null;
        }
        C47953c cVar = (C47953c) bVar;
        if (cVar != null) {
            return cVar.getStackTraceElement();
        }
        return null;
    }

    public C48131cf(long j, C47919b<? super U> bVar) {
        C7573i.m23587b(bVar, "uCont");
        super(bVar.getContext(), true);
        this.f122990c = j;
        this.f122991d = bVar;
    }

    /* renamed from: a */
    public final void mo120248a(Object obj, int i, boolean z) {
        if (obj instanceof C48217t) {
            C48122by.m149235b(this.f122991d, ((C48217t) obj).f123124a, i);
        } else {
            C48122by.m149234b(this.f122991d, obj, i);
        }
    }
}
