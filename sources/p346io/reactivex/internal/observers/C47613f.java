package p346io.reactivex.internal.observers;

import p346io.reactivex.C7498y;
import p346io.reactivex.internal.p353b.C47603h;
import p346io.reactivex.internal.util.C47839g;
import p346io.reactivex.internal.util.C47842j;
import p346io.reactivex.p347b.C7321c;

/* renamed from: io.reactivex.internal.observers.f */
public abstract class C47613f<T, U, V> extends C47615h implements C47839g<U, V>, C7498y<T> {

    /* renamed from: a */
    protected final C7498y<? super V> f122064a;

    /* renamed from: b */
    public final C47603h<U> f122065b;

    /* renamed from: c */
    public volatile boolean f122066c;

    /* renamed from: d */
    protected volatile boolean f122067d;

    /* renamed from: e */
    protected Throwable f122068e;

    /* renamed from: a */
    public void mo19216a(C7498y<? super V> yVar, U u) {
    }

    /* renamed from: b */
    public final boolean mo119711b() {
        return this.f122067d;
    }

    /* renamed from: d */
    public final Throwable mo119713d() {
        return this.f122068e;
    }

    /* renamed from: a */
    public final boolean mo119709a() {
        return this.f122066c;
    }

    /* renamed from: c */
    public final boolean mo119712c() {
        if (this.f122069f.getAndIncrement() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final int mo119707a(int i) {
        return this.f122069f.addAndGet(i);
    }

    public C47613f(C7498y<? super V> yVar, C47603h<U> hVar) {
        this.f122064a = yVar;
        this.f122065b = hVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo119708a(U u, boolean z, C7321c cVar) {
        C7498y<? super V> yVar = this.f122064a;
        C47603h<U> hVar = this.f122065b;
        if (this.f122069f.get() != 0 || !this.f122069f.compareAndSet(0, 1)) {
            hVar.offer(u);
            if (!mo119712c()) {
                return;
            }
        } else {
            mo19216a(yVar, u);
            if (mo119707a(-1) == 0) {
                return;
            }
        }
        C47842j.m148738a(hVar, yVar, false, cVar, this);
    }

    /* renamed from: b */
    public final void mo119710b(U u, boolean z, C7321c cVar) {
        C7498y<? super V> yVar = this.f122064a;
        C47603h<U> hVar = this.f122065b;
        if (this.f122069f.get() != 0 || !this.f122069f.compareAndSet(0, 1)) {
            hVar.offer(u);
            if (!mo119712c()) {
                return;
            }
        } else if (hVar.isEmpty()) {
            mo19216a(yVar, u);
            if (mo119707a(-1) == 0) {
                return;
            }
        } else {
            hVar.offer(u);
        }
        C47842j.m148738a(hVar, yVar, false, cVar, this);
    }
}
