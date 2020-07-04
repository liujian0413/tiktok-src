package kotlin.coroutines;

import java.io.Serializable;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.coroutines.C47924e.C47925a;
import kotlin.coroutines.C47924e.C47927b;
import kotlin.coroutines.C47924e.C47929c;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.IntRef;
import kotlin.jvm.p357a.C7563m;

public final class CombinedContext implements Serializable, C47924e {
    private final C47927b element;
    private final C47924e left;

    /* renamed from: kotlin.coroutines.CombinedContext$a */
    static final class C47914a implements Serializable {

        /* renamed from: a */
        public static final C47915a f122772a = new C47915a(null);
        private static final long serialVersionUID = 0;

        /* renamed from: b */
        private final C47924e[] f122773b;

        /* renamed from: kotlin.coroutines.CombinedContext$a$a */
        public static final class C47915a {
            private C47915a() {
            }

            public /* synthetic */ C47915a(C7571f fVar) {
                this();
            }
        }

        private final Object readResolve() {
            C47924e[] eVarArr = this.f122773b;
            C47924e eVar = EmptyCoroutineContext.INSTANCE;
            for (C47924e plus : eVarArr) {
                eVar = eVar.plus(plus);
            }
            return eVar;
        }

        public C47914a(C47924e[] eVarArr) {
            C7573i.m23587b(eVarArr, "elements");
            this.f122773b = eVarArr;
        }
    }

    /* renamed from: kotlin.coroutines.CombinedContext$b */
    static final class C47916b extends Lambda implements C7563m<String, C47927b, String> {

        /* renamed from: a */
        public static final C47916b f122774a = new C47916b();

        C47916b() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m148858a((String) obj, (C47927b) obj2);
        }

        /* renamed from: a */
        private static String m148858a(String str, C47927b bVar) {
            boolean z;
            C7573i.m23587b(str, "acc");
            C7573i.m23587b(bVar, "element");
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return bVar.toString();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(", ");
            sb.append(bVar);
            return sb.toString();
        }
    }

    /* renamed from: kotlin.coroutines.CombinedContext$c */
    static final class C47917c extends Lambda implements C7563m<C7581n, C47927b, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C47924e[] f122775a;

        /* renamed from: b */
        final /* synthetic */ IntRef f122776b;

        C47917c(C47924e[] eVarArr, IntRef intRef) {
            this.f122775a = eVarArr;
            this.f122776b = intRef;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m148859a((C7581n) obj, (C47927b) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m148859a(C7581n nVar, C47927b bVar) {
            C7573i.m23587b(nVar, "<anonymous parameter 0>");
            C7573i.m23587b(bVar, "element");
            C47924e[] eVarArr = this.f122775a;
            IntRef intRef = this.f122776b;
            int i = intRef.element;
            intRef.element = i + 1;
            eVarArr[i] = bVar;
        }
    }

    public final int hashCode() {
        return this.left.hashCode() + this.element.hashCode();
    }

    private final int size() {
        CombinedContext combinedContext = this;
        int i = 2;
        while (true) {
            C47924e eVar = combinedContext.left;
            if (!(eVar instanceof CombinedContext)) {
                eVar = null;
            }
            combinedContext = (CombinedContext) eVar;
            if (combinedContext == null) {
                return i;
            }
            i++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append((String) fold("", C47916b.f122774a));
        sb.append("]");
        return sb.toString();
    }

    private final Object writeReplace() {
        int size = size();
        C47924e[] eVarArr = new C47924e[size];
        IntRef intRef = new IntRef();
        boolean z = false;
        intRef.element = 0;
        fold(C7581n.f20898a, new C47917c(eVarArr, intRef));
        if (intRef.element == size) {
            z = true;
        }
        if (z) {
            return new C47914a(eVarArr);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    private final boolean contains(C47927b bVar) {
        return C7573i.m23585a((Object) get(bVar.getKey()), (Object) bVar);
    }

    public final C47924e plus(C47924e eVar) {
        C7573i.m23587b(eVar, "context");
        return C47925a.m148867a(this, eVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (r3.containsAll(r2) != false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = r2
            kotlin.coroutines.CombinedContext r0 = (kotlin.coroutines.CombinedContext) r0
            if (r0 == r3) goto L_0x001e
            boolean r0 = r3 instanceof kotlin.coroutines.CombinedContext
            if (r0 == 0) goto L_0x001c
            kotlin.coroutines.CombinedContext r3 = (kotlin.coroutines.CombinedContext) r3
            int r0 = r3.size()
            int r1 = r2.size()
            if (r0 != r1) goto L_0x001c
            boolean r3 = r3.containsAll(r2)
            if (r3 == 0) goto L_0x001c
            goto L_0x001e
        L_0x001c:
            r3 = 0
            return r3
        L_0x001e:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.coroutines.CombinedContext.equals(java.lang.Object):boolean");
    }

    public final <E extends C47927b> E get(C47929c<E> cVar) {
        C7573i.m23587b(cVar, "key");
        C47924e eVar = this;
        while (true) {
            CombinedContext combinedContext = (CombinedContext) eVar;
            E e = combinedContext.element.get(cVar);
            if (e != null) {
                return e;
            }
            eVar = combinedContext.left;
            if (!(eVar instanceof CombinedContext)) {
                return eVar.get(cVar);
            }
        }
    }

    private final boolean containsAll(CombinedContext combinedContext) {
        while (contains(combinedContext.element)) {
            C47924e eVar = combinedContext.left;
            if (eVar instanceof CombinedContext) {
                combinedContext = (CombinedContext) eVar;
            } else if (eVar != null) {
                return contains((C47927b) eVar);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
            }
        }
        return false;
    }

    public final C47924e minusKey(C47929c<?> cVar) {
        C7573i.m23587b(cVar, "key");
        if (this.element.get(cVar) != null) {
            return this.left;
        }
        C47924e minusKey = this.left.minusKey(cVar);
        if (minusKey == this.left) {
            return this;
        }
        if (minusKey == EmptyCoroutineContext.INSTANCE) {
            return this.element;
        }
        return new CombinedContext(minusKey, this.element);
    }

    public CombinedContext(C47924e eVar, C47927b bVar) {
        C7573i.m23587b(eVar, "left");
        C7573i.m23587b(bVar, "element");
        this.left = eVar;
        this.element = bVar;
    }

    public final <R> R fold(R r, C7563m<? super R, ? super C47927b, ? extends R> mVar) {
        C7573i.m23587b(mVar, "operation");
        return mVar.invoke(this.left.fold(r, mVar), this.element);
    }
}
