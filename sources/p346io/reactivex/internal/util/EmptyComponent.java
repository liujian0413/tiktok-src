package p346io.reactivex.internal.util;

import org.p361a.C48293c;
import org.p361a.C48294d;
import p346io.reactivex.C47557ad;
import p346io.reactivex.C47560b;
import p346io.reactivex.C47597i;
import p346io.reactivex.C47856n;
import p346io.reactivex.C7498y;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.util.EmptyComponent */
public enum EmptyComponent implements C47557ad<Object>, C47560b, C7321c, C47597i<Object>, C47856n<Object>, C7498y<Object>, C48294d {
    INSTANCE;

    public static <T> C7498y<T> asObserver() {
        return INSTANCE;
    }

    public static <T> C48293c<T> asSubscriber() {
        return INSTANCE;
    }

    public final void cancel() {
    }

    public final void dispose() {
    }

    public final boolean isDisposed() {
        return true;
    }

    public final void onComplete() {
    }

    public final void onNext(Object obj) {
    }

    public final void onSuccess(Object obj) {
    }

    public final void request(long j) {
    }

    public final void onError(Throwable th) {
        C7332a.m23029a(th);
    }

    public final void onSubscribe(C7321c cVar) {
        cVar.dispose();
    }

    public final void onSubscribe(C48294d dVar) {
        dVar.cancel();
    }
}
