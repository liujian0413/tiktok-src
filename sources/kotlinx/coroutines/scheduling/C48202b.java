package kotlinx.coroutines.scheduling;

import kotlin.p356e.C7551d;
import kotlinx.coroutines.C48222y;
import kotlinx.coroutines.internal.C48179w;

/* renamed from: kotlinx.coroutines.scheduling.b */
public final class C48202b extends C48203c {

    /* renamed from: b */
    public static final C48202b f123086b;

    /* renamed from: c */
    private static final C48222y f123087c;

    /* renamed from: a */
    public static C48222y m149574a() {
        return f123087c;
    }

    public final String toString() {
        return "DefaultDispatcher";
    }

    private C48202b() {
        super(0, 0, null, 7, null);
    }

    public final void close() {
        throw new UnsupportedOperationException("DefaultDispatcher cannot be closed");
    }

    static {
        C48202b bVar = new C48202b();
        f123086b = bVar;
        f123087c = bVar.mo120434a(C48179w.m149476a("kotlinx.coroutines.io.parallelism", C7551d.m23566c(64, C48179w.m149474a()), 0, 0, 12, (Object) null));
    }
}
