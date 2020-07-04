package kotlinx.coroutines.internal;

import kotlin.TypeCastException;
import kotlin.coroutines.C47924e;
import kotlin.coroutines.C47924e.C47927b;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7563m;
import kotlinx.coroutines.C48126cb;

/* renamed from: kotlinx.coroutines.internal.x */
public final class C48180x {

    /* renamed from: a */
    private static final C48178v f123037a = new C48178v("ZERO");

    /* renamed from: b */
    private static final C7563m<Object, C47927b, Object> f123038b = C48181a.f123042a;

    /* renamed from: c */
    private static final C7563m<C48126cb<?>, C47927b, C48126cb<?>> f123039c = C48182b.f123043a;

    /* renamed from: d */
    private static final C7563m<C48149aa, C47927b, C48149aa> f123040d = C48184d.f123045a;

    /* renamed from: e */
    private static final C7563m<C48149aa, C47927b, C48149aa> f123041e = C48183c.f123044a;

    /* renamed from: kotlinx.coroutines.internal.x$a */
    static final class C48181a extends Lambda implements C7563m<Object, C47927b, Object> {

        /* renamed from: a */
        public static final C48181a f123042a = new C48181a();

        C48181a() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m149484a(obj, (C47927b) obj2);
        }

        /* renamed from: a */
        private static Object m149484a(Object obj, C47927b bVar) {
            int i;
            C7573i.m23587b(bVar, "element");
            if (!(bVar instanceof C48126cb)) {
                return obj;
            }
            if (!(obj instanceof Integer)) {
                obj = null;
            }
            Integer num = (Integer) obj;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 1;
            }
            if (i == 0) {
                return bVar;
            }
            return Integer.valueOf(i + 1);
        }
    }

    /* renamed from: kotlinx.coroutines.internal.x$b */
    static final class C48182b extends Lambda implements C7563m<C48126cb<?>, C47927b, C48126cb<?>> {

        /* renamed from: a */
        public static final C48182b f123043a = new C48182b();

        C48182b() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m149485a((C48126cb) obj, (C47927b) obj2);
        }

        /* renamed from: a */
        private static C48126cb<?> m149485a(C48126cb<?> cbVar, C47927b bVar) {
            C7573i.m23587b(bVar, "element");
            if (cbVar != null) {
                return cbVar;
            }
            if (!(bVar instanceof C48126cb)) {
                bVar = null;
            }
            return (C48126cb) bVar;
        }
    }

    /* renamed from: kotlinx.coroutines.internal.x$c */
    static final class C48183c extends Lambda implements C7563m<C48149aa, C47927b, C48149aa> {

        /* renamed from: a */
        public static final C48183c f123044a = new C48183c();

        C48183c() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m149486a((C48149aa) obj, (C47927b) obj2);
        }

        /* renamed from: a */
        private static C48149aa m149486a(C48149aa aaVar, C47927b bVar) {
            C7573i.m23587b(aaVar, "state");
            C7573i.m23587b(bVar, "element");
            if (bVar instanceof C48126cb) {
                ((C48126cb) bVar).mo120258a(aaVar.f122994a, aaVar.mo120364a());
            }
            return aaVar;
        }
    }

    /* renamed from: kotlinx.coroutines.internal.x$d */
    static final class C48184d extends Lambda implements C7563m<C48149aa, C47927b, C48149aa> {

        /* renamed from: a */
        public static final C48184d f123045a = new C48184d();

        C48184d() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m149487a((C48149aa) obj, (C47927b) obj2);
        }

        /* renamed from: a */
        private static C48149aa m149487a(C48149aa aaVar, C47927b bVar) {
            C7573i.m23587b(aaVar, "state");
            C7573i.m23587b(bVar, "element");
            if (bVar instanceof C48126cb) {
                aaVar.mo120365a(((C48126cb) bVar).mo120257a(aaVar.f122994a));
            }
            return aaVar;
        }
    }

    /* renamed from: a */
    public static final Object m149481a(C47924e eVar) {
        C7573i.m23587b(eVar, "context");
        Object fold = eVar.fold(Integer.valueOf(0), f123038b);
        if (fold == null) {
            C7573i.m23580a();
        }
        return fold;
    }

    /* renamed from: a */
    public static final Object m149482a(C47924e eVar, Object obj) {
        C7573i.m23587b(eVar, "context");
        if (obj == null) {
            obj = m149481a(eVar);
        }
        if (obj == Integer.valueOf(0)) {
            return f123037a;
        }
        if (obj instanceof Integer) {
            return eVar.fold(new C48149aa(eVar, ((Number) obj).intValue()), f123040d);
        }
        if (obj != null) {
            return ((C48126cb) obj).mo120257a(eVar);
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
    }

    /* renamed from: b */
    public static final void m149483b(C47924e eVar, Object obj) {
        C7573i.m23587b(eVar, "context");
        if (obj != f123037a) {
            if (obj instanceof C48149aa) {
                ((C48149aa) obj).mo120366b();
                eVar.fold(obj, f123041e);
                return;
            }
            Object fold = eVar.fold(null, f123039c);
            if (fold != null) {
                ((C48126cb) fold).mo120258a(eVar, obj);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        }
    }
}
