package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.p358a.C7565a;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;

/* renamed from: kotlin.sequences.f */
final class C48028f<T> implements C7604g<T> {

    /* renamed from: a */
    public final C7561a<T> f122862a;

    /* renamed from: b */
    public final C7562b<T, T> f122863b;

    /* renamed from: kotlin.sequences.f$a */
    public static final class C48029a implements Iterator<T>, C7565a {

        /* renamed from: a */
        public T f122864a;

        /* renamed from: b */
        public int f122865b = -2;

        /* renamed from: c */
        final /* synthetic */ C48028f f122866c;

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean hasNext() {
            if (this.f122865b < 0) {
                m148972a();
            }
            if (this.f122865b == 1) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        private final void m148972a() {
            T t;
            int i;
            if (this.f122865b == -2) {
                t = this.f122866c.f122862a.invoke();
            } else {
                C7562b<T, T> bVar = this.f122866c.f122863b;
                T t2 = this.f122864a;
                if (t2 == null) {
                    C7573i.m23580a();
                }
                t = bVar.invoke(t2);
            }
            this.f122864a = t;
            if (this.f122864a == null) {
                i = 0;
            } else {
                i = 1;
            }
            this.f122865b = i;
        }

        public final T next() {
            if (this.f122865b < 0) {
                m148972a();
            }
            if (this.f122865b != 0) {
                T t = this.f122864a;
                if (t != null) {
                    this.f122865b = -1;
                    return t;
                }
                throw new TypeCastException("null cannot be cast to non-null type T");
            }
            throw new NoSuchElementException();
        }

        C48029a(C48028f fVar) {
            this.f122866c = fVar;
        }
    }

    /* renamed from: a */
    public final Iterator<T> mo19416a() {
        return new C48029a<>(this);
    }

    public C48028f(C7561a<? extends T> aVar, C7562b<? super T, ? extends T> bVar) {
        C7573i.m23587b(aVar, "getInitialValue");
        C7573i.m23587b(bVar, "getNextValue");
        this.f122862a = aVar;
        this.f122863b = bVar;
    }
}
