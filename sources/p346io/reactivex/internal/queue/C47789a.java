package p346io.reactivex.internal.queue;

import java.util.concurrent.atomic.AtomicReference;
import p346io.reactivex.internal.p353b.C47603h;

/* renamed from: io.reactivex.internal.queue.a */
public final class C47789a<T> implements C47603h<T> {

    /* renamed from: a */
    private final AtomicReference<C47790a<T>> f122506a = new AtomicReference<>();

    /* renamed from: b */
    private final AtomicReference<C47790a<T>> f122507b = new AtomicReference<>();

    /* renamed from: io.reactivex.internal.queue.a$a */
    static final class C47790a<E> extends AtomicReference<C47790a<E>> {
        private static final long serialVersionUID = 2404266111789071508L;

        /* renamed from: a */
        private E f122508a;

        C47790a() {
        }

        /* renamed from: c */
        private E m148622c() {
            return this.f122508a;
        }

        /* renamed from: b */
        public final C47790a<E> mo119800b() {
            return (C47790a) get();
        }

        /* renamed from: a */
        public final E mo119798a() {
            E c = m148622c();
            m148621a((E) null);
            return c;
        }

        /* renamed from: a */
        private void m148621a(E e) {
            this.f122508a = e;
        }

        C47790a(E e) {
            m148621a(e);
        }

        /* renamed from: a */
        public final void mo119799a(C47790a<E> aVar) {
            lazySet(aVar);
        }
    }

    /* renamed from: a */
    private C47790a<T> m148616a() {
        return (C47790a) this.f122506a.get();
    }

    /* renamed from: b */
    private C47790a<T> m148618b() {
        return (C47790a) this.f122507b.get();
    }

    /* renamed from: c */
    private C47790a<T> m148620c() {
        return (C47790a) this.f122507b.get();
    }

    public final void clear() {
        while (poll() != null) {
            if (isEmpty()) {
                return;
            }
        }
    }

    public final boolean isEmpty() {
        if (m148618b() == m148616a()) {
            return true;
        }
        return false;
    }

    public C47789a() {
        C47790a aVar = new C47790a();
        m148619b(aVar);
        m148617a(aVar);
    }

    public final T poll() {
        C47790a b;
        C47790a c = m148620c();
        C47790a b2 = c.mo119800b();
        if (b2 != null) {
            T a = b2.mo119798a();
            m148619b(b2);
            return a;
        } else if (c == m148616a()) {
            return null;
        } else {
            do {
                b = c.mo119800b();
            } while (b == null);
            T a2 = b.mo119798a();
            m148619b(b);
            return a2;
        }
    }

    /* renamed from: b */
    private void m148619b(C47790a<T> aVar) {
        this.f122507b.lazySet(aVar);
    }

    /* renamed from: a */
    private C47790a<T> m148617a(C47790a<T> aVar) {
        return (C47790a) this.f122506a.getAndSet(aVar);
    }

    public final boolean offer(T t) {
        if (t != null) {
            C47790a aVar = new C47790a(t);
            m148617a(aVar).mo119799a(aVar);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }
}
