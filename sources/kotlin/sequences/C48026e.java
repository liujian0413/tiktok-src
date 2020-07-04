package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.p358a.C7565a;
import kotlin.jvm.p357a.C7562b;

/* renamed from: kotlin.sequences.e */
public final class C48026e<T, R, E> implements C7604g<E> {

    /* renamed from: a */
    public final C7604g<T> f122856a;

    /* renamed from: b */
    public final C7562b<T, R> f122857b;

    /* renamed from: c */
    public final C7562b<R, Iterator<E>> f122858c;

    /* renamed from: kotlin.sequences.e$a */
    public static final class C48027a implements Iterator<E>, C7565a {

        /* renamed from: a */
        public final Iterator<T> f122859a;

        /* renamed from: b */
        public Iterator<? extends E> f122860b;

        /* renamed from: c */
        final /* synthetic */ C48026e f122861c;

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean hasNext() {
            return m148970a();
        }

        public final E next() {
            if (m148970a()) {
                Iterator<? extends E> it = this.f122860b;
                if (it == null) {
                    C7573i.m23580a();
                }
                return it.next();
            }
            throw new NoSuchElementException();
        }

        /* renamed from: a */
        private final boolean m148970a() {
            Iterator<? extends E> it = this.f122860b;
            if (it != null && !it.hasNext()) {
                this.f122860b = null;
            }
            while (this.f122860b == null) {
                if (!this.f122859a.hasNext()) {
                    return false;
                }
                Iterator<? extends E> it2 = (Iterator) this.f122861c.f122858c.invoke(this.f122861c.f122857b.invoke(this.f122859a.next()));
                if (it2.hasNext()) {
                    this.f122860b = it2;
                    return true;
                }
            }
            return true;
        }

        C48027a(C48026e eVar) {
            this.f122861c = eVar;
            this.f122859a = eVar.f122856a.mo19416a();
        }
    }

    /* renamed from: a */
    public final Iterator<E> mo19416a() {
        return new C48027a<>(this);
    }

    public C48026e(C7604g<? extends T> gVar, C7562b<? super T, ? extends R> bVar, C7562b<? super R, ? extends Iterator<? extends E>> bVar2) {
        C7573i.m23587b(gVar, "sequence");
        C7573i.m23587b(bVar, "transformer");
        C7573i.m23587b(bVar2, "iterator");
        this.f122856a = gVar;
        this.f122857b = bVar;
        this.f122858c = bVar2;
    }
}
