package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.p358a.C7565a;
import kotlin.jvm.p357a.C7562b;

/* renamed from: kotlin.sequences.d */
public final class C48024d<T> implements C7604g<T> {

    /* renamed from: a */
    public final C7604g<T> f122849a;

    /* renamed from: b */
    public final boolean f122850b;

    /* renamed from: c */
    public final C7562b<T, Boolean> f122851c;

    /* renamed from: kotlin.sequences.d$a */
    public static final class C48025a implements Iterator<T>, C7565a {

        /* renamed from: a */
        public final Iterator<T> f122852a;

        /* renamed from: b */
        public int f122853b = -1;

        /* renamed from: c */
        public T f122854c;

        /* renamed from: d */
        final /* synthetic */ C48024d f122855d;

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean hasNext() {
            if (this.f122853b == -1) {
                m148968a();
            }
            if (this.f122853b == 1) {
                return true;
            }
            return false;
        }

        public final T next() {
            if (this.f122853b == -1) {
                m148968a();
            }
            if (this.f122853b != 0) {
                T t = this.f122854c;
                this.f122854c = null;
                this.f122853b = -1;
                return t;
            }
            throw new NoSuchElementException();
        }

        /* renamed from: a */
        private final void m148968a() {
            while (this.f122852a.hasNext()) {
                T next = this.f122852a.next();
                if (((Boolean) this.f122855d.f122851c.invoke(next)).booleanValue() == this.f122855d.f122850b) {
                    this.f122854c = next;
                    this.f122853b = 1;
                    return;
                }
            }
            this.f122853b = 0;
        }

        C48025a(C48024d dVar) {
            this.f122855d = dVar;
            this.f122852a = dVar.f122849a.mo19416a();
        }
    }

    /* renamed from: a */
    public final Iterator<T> mo19416a() {
        return new C48025a<>(this);
    }

    public C48024d(C7604g<? extends T> gVar, boolean z, C7562b<? super T, Boolean> bVar) {
        C7573i.m23587b(gVar, "sequence");
        C7573i.m23587b(bVar, "predicate");
        this.f122849a = gVar;
        this.f122850b = z;
        this.f122851c = bVar;
    }
}
