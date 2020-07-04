package com.bytedance.android.live.core.rxutils;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;
import p346io.reactivex.C7498y;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.p347b.C7321c;

public final class DisposableObserverDelegate<T> extends AtomicReference<C7321c> implements C7321c, C7498y<T> {
    private final C7561a<C7581n> doOnDispose;
    private final C7498y<T> downstream;

    public final void onComplete() {
        this.downstream.onComplete();
    }

    public final void onError(Throwable th) {
        C7573i.m23587b(th, "p0");
        this.downstream.onError(th);
    }

    public final void onNext(T t) {
        this.downstream.onNext(t);
    }

    public final boolean isDisposed() {
        if (((C7321c) get()) == DisposableHelper.DISPOSED) {
            return true;
        }
        return false;
    }

    public final void dispose() {
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (((C7321c) get()) != disposableHelper) {
            C7321c cVar = (C7321c) getAndSet(disposableHelper);
            if (cVar != disposableHelper) {
                if (cVar != null) {
                    cVar.dispose();
                }
                this.doOnDispose.invoke();
            }
        }
    }

    public final void onSubscribe(C7321c cVar) {
        C7573i.m23587b(cVar, "d");
        if (!compareAndSet(null, cVar)) {
            cVar.dispose();
        } else {
            this.downstream.onSubscribe(cVar);
        }
    }

    public DisposableObserverDelegate(C7498y<T> yVar, C7561a<C7581n> aVar) {
        C7573i.m23587b(yVar, "downstream");
        C7573i.m23587b(aVar, "doOnDispose");
        this.downstream = yVar;
        this.doOnDispose = aVar;
    }

    public /* synthetic */ DisposableObserverDelegate(C7498y yVar, C7561a aVar, int i, C7571f fVar) {
        if ((i & 2) != 0) {
            aVar = C32301.f9943a;
        }
        this(yVar, aVar);
    }
}
