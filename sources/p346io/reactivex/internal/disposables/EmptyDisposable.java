package p346io.reactivex.internal.disposables;

import p346io.reactivex.C47557ad;
import p346io.reactivex.C47560b;
import p346io.reactivex.C47856n;
import p346io.reactivex.C7498y;
import p346io.reactivex.internal.p353b.C47600d;

/* renamed from: io.reactivex.internal.disposables.EmptyDisposable */
public enum EmptyDisposable implements C47600d<Object> {
    INSTANCE,
    NEVER;

    public final void clear() {
    }

    public final void dispose() {
    }

    public final boolean isEmpty() {
        return true;
    }

    public final Object poll() throws Exception {
        return null;
    }

    public final int requestFusion(int i) {
        return i & 2;
    }

    public final boolean isDisposed() {
        if (this == INSTANCE) {
            return true;
        }
        return false;
    }

    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public static void complete(C47560b bVar) {
        bVar.onSubscribe(INSTANCE);
        bVar.onComplete();
    }

    public static void complete(C47856n<?> nVar) {
        nVar.onSubscribe(INSTANCE);
        nVar.onComplete();
    }

    public static void complete(C7498y<?> yVar) {
        yVar.onSubscribe(INSTANCE);
        yVar.onComplete();
    }

    public static void error(Throwable th, C47557ad<?> adVar) {
        adVar.onSubscribe(INSTANCE);
        adVar.onError(th);
    }

    public final boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public static void error(Throwable th, C47560b bVar) {
        bVar.onSubscribe(INSTANCE);
        bVar.onError(th);
    }

    public static void error(Throwable th, C47856n<?> nVar) {
        nVar.onSubscribe(INSTANCE);
        nVar.onError(th);
    }

    public static void error(Throwable th, C7498y<?> yVar) {
        yVar.onSubscribe(INSTANCE);
        yVar.onError(th);
    }
}
