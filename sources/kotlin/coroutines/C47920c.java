package kotlin.coroutines;

import kotlin.coroutines.C47924e.C47927b;
import kotlin.coroutines.C47924e.C47929c;
import kotlin.jvm.internal.C7573i;

/* renamed from: kotlin.coroutines.c */
public interface C47920c extends C47927b {

    /* renamed from: a */
    public static final C47922b f122777a = C47922b.f122778a;

    /* renamed from: kotlin.coroutines.c$a */
    public static final class C47921a {
        /* renamed from: a */
        public static void m148863a(C47920c cVar, C47919b<?> bVar) {
            C7573i.m23587b(bVar, "continuation");
        }

        /* renamed from: a */
        public static <E extends C47927b> E m148862a(C47920c cVar, C47929c<E> cVar2) {
            C7573i.m23587b(cVar2, "key");
            if (cVar2 == C47920c.f122777a) {
                return cVar;
            }
            return null;
        }

        /* renamed from: b */
        public static C47924e m148864b(C47920c cVar, C47929c<?> cVar2) {
            C7573i.m23587b(cVar2, "key");
            if (cVar2 == C47920c.f122777a) {
                return EmptyCoroutineContext.INSTANCE;
            }
            return cVar;
        }
    }

    /* renamed from: kotlin.coroutines.c$b */
    public static final class C47922b implements C47929c<C47920c> {

        /* renamed from: a */
        static final /* synthetic */ C47922b f122778a = new C47922b();

        private C47922b() {
        }
    }

    /* renamed from: a */
    <T> C47919b<T> mo120140a(C47919b<? super T> bVar);

    /* renamed from: b */
    void mo120141b(C47919b<?> bVar);
}
