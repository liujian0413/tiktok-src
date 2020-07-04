package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.p358a.C7565a;
import kotlin.jvm.p357a.C7562b;

/* renamed from: kotlin.sequences.o */
public final class C48032o<T, R> implements C7604g<R> {

    /* renamed from: a */
    public final C7604g<T> f122872a;

    /* renamed from: b */
    public final C7562b<T, R> f122873b;

    /* renamed from: kotlin.sequences.o$a */
    public static final class C48033a implements Iterator<R>, C7565a {

        /* renamed from: a */
        public final Iterator<T> f122874a;

        /* renamed from: b */
        final /* synthetic */ C48032o f122875b;

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean hasNext() {
            return this.f122874a.hasNext();
        }

        public final R next() {
            return this.f122875b.f122873b.invoke(this.f122874a.next());
        }

        C48033a(C48032o oVar) {
            this.f122875b = oVar;
            this.f122874a = oVar.f122872a.mo19416a();
        }
    }

    /* renamed from: a */
    public final Iterator<R> mo19416a() {
        return new C48033a<>(this);
    }

    /* renamed from: a */
    public final <E> C7604g<E> mo120226a(C7562b<? super R, ? extends Iterator<? extends E>> bVar) {
        C7573i.m23587b(bVar, "iterator");
        return new C48026e<>(this.f122872a, this.f122873b, bVar);
    }

    public C48032o(C7604g<? extends T> gVar, C7562b<? super T, ? extends R> bVar) {
        C7573i.m23587b(gVar, "sequence");
        C7573i.m23587b(bVar, "transformer");
        this.f122872a = gVar;
        this.f122873b = bVar;
    }
}
