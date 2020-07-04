package kotlinx.coroutines;

import kotlin.jvm.internal.C7573i;

/* renamed from: kotlinx.coroutines.cc */
public final class C48128cc {

    /* renamed from: a */
    public static final C48128cc f122987a = new C48128cc();

    /* renamed from: b */
    private static final ThreadLocal<C48085ax> f122988b = new ThreadLocal<>();

    private C48128cc() {
    }

    /* renamed from: c */
    public static void m149250c() {
        f122988b.set(null);
    }

    /* renamed from: b */
    public static C48085ax m149249b() {
        return (C48085ax) f122988b.get();
    }

    /* renamed from: a */
    public static C48085ax m149247a() {
        C48085ax axVar = (C48085ax) f122988b.get();
        if (axVar != null) {
            return axVar;
        }
        C48085ax a = C48090az.m149119a();
        f122988b.set(a);
        return a;
    }

    /* renamed from: a */
    public static void m149248a(C48085ax axVar) {
        C7573i.m23587b(axVar, "eventLoop");
        f122988b.set(axVar);
    }
}
