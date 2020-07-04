package p346io.reactivex.internal.operators.observable;

import p346io.reactivex.C7492s;
import p346io.reactivex.C7498y;
import p346io.reactivex.internal.observers.C47609b;
import p346io.reactivex.internal.p352a.C7364b;

/* renamed from: io.reactivex.internal.operators.observable.v */
public final class C7479v<T> extends C7492s<T> {

    /* renamed from: a */
    final T[] f20823a;

    /* renamed from: io.reactivex.internal.operators.observable.v$a */
    static final class C7480a<T> extends C47609b<T> {

        /* renamed from: a */
        final C7498y<? super T> f20824a;

        /* renamed from: b */
        final T[] f20825b;

        /* renamed from: c */
        int f20826c;

        /* renamed from: d */
        boolean f20827d;

        /* renamed from: e */
        volatile boolean f20828e;

        public final void dispose() {
            this.f20828e = true;
        }

        public final boolean isDisposed() {
            return this.f20828e;
        }

        public final void clear() {
            this.f20826c = this.f20825b.length;
        }

        public final boolean isEmpty() {
            if (this.f20826c == this.f20825b.length) {
                return true;
            }
            return false;
        }

        public final T poll() {
            int i = this.f20826c;
            T[] tArr = this.f20825b;
            if (i == tArr.length) {
                return null;
            }
            this.f20826c = i + 1;
            return C7364b.m23081a(tArr[i], "The array element is null");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo19252a() {
            T[] tArr = this.f20825b;
            int length = tArr.length;
            for (int i = 0; i < length && !isDisposed(); i++) {
                T t = tArr[i];
                if (t == null) {
                    C7498y<? super T> yVar = this.f20824a;
                    StringBuilder sb = new StringBuilder("The ");
                    sb.append(i);
                    sb.append("th element is null");
                    yVar.onError(new NullPointerException(sb.toString()));
                    return;
                }
                this.f20824a.onNext(t);
            }
            if (!isDisposed()) {
                this.f20824a.onComplete();
            }
        }

        public final int requestFusion(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.f20827d = true;
            return 1;
        }

        C7480a(C7498y<? super T> yVar, T[] tArr) {
            this.f20824a = yVar;
            this.f20825b = tArr;
        }
    }

    public C7479v(T[] tArr) {
        this.f20823a = tArr;
    }

    /* renamed from: a_ */
    public final void mo10166a_(C7498y<? super T> yVar) {
        C7480a aVar = new C7480a(yVar, this.f20823a);
        yVar.onSubscribe(aVar);
        if (!aVar.f20827d) {
            aVar.mo19252a();
        }
    }
}
