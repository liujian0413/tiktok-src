package p346io.reactivex.p354j;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p346io.reactivex.C47557ad;
import p346io.reactivex.C7319aa;
import p346io.reactivex.internal.p352a.C7364b;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.j.e */
public final class C47850e<T> extends C7319aa<T> implements C47557ad<T> {

    /* renamed from: b */
    static final C47851a[] f122659b = new C47851a[0];

    /* renamed from: c */
    static final C47851a[] f122660c = new C47851a[0];

    /* renamed from: a */
    final AtomicReference<C47851a<T>[]> f122661a = new AtomicReference<>(f122659b);

    /* renamed from: d */
    final AtomicBoolean f122662d = new AtomicBoolean();

    /* renamed from: e */
    T f122663e;

    /* renamed from: f */
    Throwable f122664f;

    /* renamed from: io.reactivex.j.e$a */
    static final class C47851a<T> extends AtomicReference<C47850e<T>> implements C7321c {
        private static final long serialVersionUID = -7650903191002190468L;

        /* renamed from: a */
        final C47557ad<? super T> f122665a;

        public final void dispose() {
            C47850e eVar = (C47850e) getAndSet(null);
            if (eVar != null) {
                eVar.mo119926a(this);
            }
        }

        public final boolean isDisposed() {
            if (get() == null) {
                return true;
            }
            return false;
        }

        C47851a(C47557ad<? super T> adVar, C47850e<T> eVar) {
            this.f122665a = adVar;
            lazySet(eVar);
        }
    }

    /* renamed from: c */
    public static <T> C47850e<T> m148766c() {
        return new C47850e<>();
    }

    C47850e() {
    }

    public final void onSubscribe(C7321c cVar) {
        if (this.f122661a.get() == f122660c) {
            cVar.dispose();
        }
    }

    /* renamed from: b */
    private boolean m148765b(C47851a<T> aVar) {
        C47851a[] aVarArr;
        C47851a[] aVarArr2;
        do {
            aVarArr = (C47851a[]) this.f122661a.get();
            if (aVarArr == f122660c) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new C47851a[(length + 1)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!this.f122661a.compareAndSet(aVarArr, aVarArr2));
        return true;
    }

    /* renamed from: a */
    public final void mo10199a(C47557ad<? super T> adVar) {
        C47851a aVar = new C47851a(adVar, this);
        adVar.onSubscribe(aVar);
        if (!m148765b(aVar)) {
            Throwable th = this.f122664f;
            if (th != null) {
                adVar.onError(th);
                return;
            }
            adVar.onSuccess(this.f122663e);
        } else if (aVar.isDisposed()) {
            mo119926a(aVar);
        }
    }

    public final void onError(Throwable th) {
        C7364b.m23081a(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f122662d.compareAndSet(false, true)) {
            this.f122664f = th;
            for (C47851a aVar : (C47851a[]) this.f122661a.getAndSet(f122660c)) {
                aVar.f122665a.onError(th);
            }
            return;
        }
        C7332a.m23029a(th);
    }

    public final void onSuccess(T t) {
        C7364b.m23081a(t, "onSuccess called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f122662d.compareAndSet(false, true)) {
            this.f122663e = t;
            for (C47851a aVar : (C47851a[]) this.f122661a.getAndSet(f122660c)) {
                aVar.f122665a.onSuccess(t);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo119926a(C47851a<T> aVar) {
        C47851a<T>[] aVarArr;
        C47851a[] aVarArr2;
        do {
            aVarArr = (C47851a[]) this.f122661a.get();
            int length = aVarArr.length;
            if (length != 0) {
                int i = -1;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (aVarArr[i2] == aVar) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        aVarArr2 = f122659b;
                    } else {
                        C47851a[] aVarArr3 = new C47851a[(length - 1)];
                        System.arraycopy(aVarArr, 0, aVarArr3, 0, i);
                        System.arraycopy(aVarArr, i + 1, aVarArr3, i, (length - i) - 1);
                        aVarArr2 = aVarArr3;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!this.f122661a.compareAndSet(aVarArr, aVarArr2));
    }
}
