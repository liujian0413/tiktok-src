package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.p358a.C7565a;

/* renamed from: kotlin.sequences.n */
public final class C48030n<T> implements C48022b<T>, C7604g<T> {

    /* renamed from: a */
    public final C7604g<T> f122867a;

    /* renamed from: b */
    public final int f122868b;

    /* renamed from: kotlin.sequences.n$a */
    public static final class C48031a implements Iterator<T>, C7565a {

        /* renamed from: a */
        public int f122869a;

        /* renamed from: b */
        public final Iterator<T> f122870b;

        /* renamed from: c */
        final /* synthetic */ C48030n f122871c;

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean hasNext() {
            if (this.f122869a <= 0 || !this.f122870b.hasNext()) {
                return false;
            }
            return true;
        }

        public final T next() {
            if (this.f122869a != 0) {
                this.f122869a--;
                return this.f122870b.next();
            }
            throw new NoSuchElementException();
        }

        C48031a(C48030n nVar) {
            this.f122871c = nVar;
            this.f122869a = nVar.f122868b;
            this.f122870b = nVar.f122867a.mo19416a();
        }
    }

    /* renamed from: a */
    public final Iterator<T> mo19416a() {
        return new C48031a<>(this);
    }

    /* renamed from: a */
    public final C7604g<T> mo120213a(int i) {
        if (i >= this.f122868b) {
            return this;
        }
        return new C48030n<>(this.f122867a, i);
    }

    public C48030n(C7604g<? extends T> gVar, int i) {
        boolean z;
        C7573i.m23587b(gVar, "sequence");
        this.f122867a = gVar;
        this.f122868b = i;
        if (this.f122868b >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            StringBuilder sb = new StringBuilder("count must be non-negative, but was ");
            sb.append(this.f122868b);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString().toString());
        }
    }
}
