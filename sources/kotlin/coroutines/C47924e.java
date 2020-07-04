package kotlin.coroutines;

import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7563m;

/* renamed from: kotlin.coroutines.e */
public interface C47924e {

    /* renamed from: kotlin.coroutines.e$a */
    public static final class C47925a {

        /* renamed from: kotlin.coroutines.e$a$a */
        static final class C47926a extends Lambda implements C7563m<C47924e, C47927b, C47924e> {

            /* renamed from: a */
            public static final C47926a f122779a = new C47926a();

            C47926a() {
                super(2);
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                return m148868a((C47924e) obj, (C47927b) obj2);
            }

            /* renamed from: a */
            private static C47924e m148868a(C47924e eVar, C47927b bVar) {
                C47924e eVar2;
                C7573i.m23587b(eVar, "acc");
                C7573i.m23587b(bVar, "element");
                C47924e minusKey = eVar.minusKey(bVar.getKey());
                if (minusKey == EmptyCoroutineContext.INSTANCE) {
                    eVar2 = bVar;
                } else {
                    C47920c cVar = (C47920c) minusKey.get(C47920c.f122777a);
                    if (cVar == null) {
                        eVar2 = new CombinedContext(minusKey, bVar);
                    } else {
                        C47924e minusKey2 = minusKey.minusKey(C47920c.f122777a);
                        if (minusKey2 == EmptyCoroutineContext.INSTANCE) {
                            eVar2 = new CombinedContext(bVar, cVar);
                        } else {
                            eVar2 = new CombinedContext(new CombinedContext(minusKey2, bVar), cVar);
                        }
                    }
                }
                return eVar2;
            }
        }

        /* renamed from: a */
        public static C47924e m148867a(C47924e eVar, C47924e eVar2) {
            C7573i.m23587b(eVar2, "context");
            if (eVar2 == EmptyCoroutineContext.INSTANCE) {
                return eVar;
            }
            return (C47924e) eVar2.fold(eVar, C47926a.f122779a);
        }
    }

    /* renamed from: kotlin.coroutines.e$b */
    public interface C47927b extends C47924e {

        /* renamed from: kotlin.coroutines.e$b$a */
        public static final class C47928a {
            /* renamed from: a */
            public static C47924e m148871a(C47927b bVar, C47924e eVar) {
                C7573i.m23587b(eVar, "context");
                return C47925a.m148867a(bVar, eVar);
            }

            /* renamed from: a */
            public static <E extends C47927b> E m148870a(C47927b bVar, C47929c<E> cVar) {
                C7573i.m23587b(cVar, "key");
                if (!C7573i.m23585a((Object) bVar.getKey(), (Object) cVar)) {
                    return null;
                }
                if (bVar != null) {
                    return bVar;
                }
                throw new TypeCastException("null cannot be cast to non-null type E");
            }

            /* renamed from: b */
            public static C47924e m148872b(C47927b bVar, C47929c<?> cVar) {
                C7573i.m23587b(cVar, "key");
                if (C7573i.m23585a((Object) bVar.getKey(), (Object) cVar)) {
                    return EmptyCoroutineContext.INSTANCE;
                }
                return bVar;
            }

            /* renamed from: a */
            public static <R> R m148869a(C47927b bVar, R r, C7563m<? super R, ? super C47927b, ? extends R> mVar) {
                C7573i.m23587b(mVar, "operation");
                return mVar.invoke(r, bVar);
            }
        }

        <E extends C47927b> E get(C47929c<E> cVar);

        C47929c<?> getKey();
    }

    /* renamed from: kotlin.coroutines.e$c */
    public interface C47929c<E extends C47927b> {
    }

    <R> R fold(R r, C7563m<? super R, ? super C47927b, ? extends R> mVar);

    <E extends C47927b> E get(C47929c<E> cVar);

    C47924e minusKey(C47929c<?> cVar);

    C47924e plus(C47924e eVar);
}
