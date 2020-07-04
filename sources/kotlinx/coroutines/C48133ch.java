package kotlinx.coroutines;

import kotlin.coroutines.C47924e;
import kotlin.jvm.internal.C7573i;

/* renamed from: kotlinx.coroutines.ch */
public final class C48133ch extends C48222y {

    /* renamed from: b */
    public static final C48133ch f122992b = new C48133ch();

    private C48133ch() {
    }

    /* renamed from: a */
    public final boolean mo83490a(C47924e eVar) {
        C7573i.m23587b(eVar, "context");
        return false;
    }

    public final String toString() {
        return "Unconfined";
    }

    /* renamed from: a */
    public final void mo83489a(C47924e eVar, Runnable runnable) {
        C7573i.m23587b(eVar, "context");
        C7573i.m23587b(runnable, "block");
        throw new UnsupportedOperationException();
    }
}
