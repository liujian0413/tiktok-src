package dagger.p1859a;

import javax.p1876a.C47883a;

/* renamed from: dagger.a.b */
public final class C47371b<T> implements C47373d<T> {

    /* renamed from: a */
    private C47883a<T> f121584a;

    public final T get() {
        if (this.f121584a != null) {
            return this.f121584a.get();
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public final void mo119461a(C47883a<T> aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException();
        } else if (this.f121584a == null) {
            this.f121584a = aVar;
        } else {
            throw new IllegalStateException();
        }
    }
}
