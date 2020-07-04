package kotlinx.coroutines.internal;

import kotlin.coroutines.C47919b;
import kotlin.coroutines.C47924e;
import kotlin.coroutines.jvm.internal.C47953c;
import kotlin.jvm.internal.C7573i;
import kotlinx.coroutines.C48048a;
import kotlinx.coroutines.C48122by;
import kotlinx.coroutines.C48217t;

/* renamed from: kotlinx.coroutines.internal.s */
public class C48175s<T> extends C48048a<T> implements C47953c {

    /* renamed from: c */
    public final C47919b<T> f123034c;

    /* renamed from: f */
    public int mo120255f() {
        return 2;
    }

    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    public final C47953c getCallerFrame() {
        return (C47953c) this.f123034c;
    }

    public C48175s(C47924e eVar, C47919b<? super T> bVar) {
        C7573i.m23587b(eVar, "context");
        C7573i.m23587b(bVar, "uCont");
        super(eVar, true);
        this.f123034c = bVar;
    }

    /* renamed from: a */
    public void mo120248a(Object obj, int i, boolean z) {
        Throwable th;
        if (obj instanceof C48217t) {
            if (i == 4) {
                th = ((C48217t) obj).f123124a;
            } else {
                th = C48177u.m149466a(((C48217t) obj).f123124a, this.f123034c);
            }
            C48122by.m149235b(this.f123034c, th, i);
            return;
        }
        C48122by.m149234b(this.f123034c, obj, i);
    }
}
