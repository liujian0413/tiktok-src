package com.bytedance.jedi.model.p608h;

import com.bytedance.jedi.model.p605g.C11847a;
import com.bytedance.jedi.model.p605g.C11848b;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.jedi.model.h.f */
public final class C11942f {

    /* renamed from: a */
    public static final C11942f f31822a = new C11942f();

    /* renamed from: b */
    private static boolean f31823b;

    /* renamed from: c */
    private static final List<C11936c> f31824c = C7525m.m23466c(C11961k.f31870b);

    /* renamed from: d */
    private static final C11935b f31825d = new C11943a();

    /* renamed from: com.bytedance.jedi.model.h.f$a */
    public static final class C11943a implements C11935b {
        C11943a() {
        }
    }

    private C11942f() {
    }

    /* renamed from: a */
    public static boolean m34996a() {
        return f31823b;
    }

    /* renamed from: a */
    public static void m34995a(C11847a<?> aVar, C11848b<?> bVar) {
        C7573i.m23587b(aVar, "tracePoint");
        C7573i.m23587b(bVar, "traceable");
        if (f31823b && bVar.mo29378b() != null) {
            for (C11936c a : f31824c) {
                a.mo29548a(aVar, bVar);
            }
        }
    }
}
