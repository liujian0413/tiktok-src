package com.google.common.util.concurrent;

import com.google.common.base.C17427g;
import com.google.common.base.C17430i;
import com.google.common.base.C17439m;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* renamed from: com.google.common.util.concurrent.h */
public final class C18246h extends C18249j {

    /* renamed from: com.google.common.util.concurrent.h$a */
    static final class C18247a<V> implements Runnable {

        /* renamed from: a */
        final Future<V> f49631a;

        /* renamed from: b */
        final C18245g<? super V> f49632b;

        public final String toString() {
            return C17430i.m57944a(this).mo44919a(this.f49632b).toString();
        }

        public final void run() {
            try {
                this.f49632b.onSuccess(C18246h.m60212a(this.f49631a));
            } catch (ExecutionException e) {
                this.f49632b.onFailure(e.getCause());
            } catch (Error | RuntimeException e2) {
                this.f49632b.onFailure(e2);
            }
        }

        C18247a(Future<V> future, C18245g<? super V> gVar) {
            this.f49631a = future;
            this.f49632b = gVar;
        }
    }

    /* renamed from: a */
    public static <V> C18253l<V> m60210a(V v) {
        if (v == null) {
            return C18252b.f49634a;
        }
        return new C18252b(v);
    }

    /* renamed from: a */
    public static <V> C18253l<V> m60211a(Throwable th) {
        C17439m.m57962a(th);
        return new C18251a(th);
    }

    /* renamed from: a */
    public static <V> V m60212a(Future<V> future) throws ExecutionException {
        C17439m.m57985b(future.isDone(), "Future was expected to be done: %s", (Object) future);
        return C18260p.m60224a(future);
    }

    /* renamed from: a */
    public static <V> void m60213a(C18253l<V> lVar, C18245g<? super V> gVar) {
        m60214a(lVar, gVar, C18254m.m60217a());
    }

    /* renamed from: a */
    public static <I, O> C18253l<O> m60208a(C18253l<I> lVar, C17427g<? super I, ? extends O> gVar, Executor executor) {
        return C18239c.m60195a(lVar, gVar, executor);
    }

    /* renamed from: a */
    public static <V> void m60214a(C18253l<V> lVar, C18245g<? super V> gVar, Executor executor) {
        C17439m.m57962a(gVar);
        lVar.mo6818a(new C18247a(lVar, gVar), executor);
    }

    /* renamed from: a */
    public static <V, X extends Throwable> C18253l<V> m60209a(C18253l<? extends V> lVar, Class<X> cls, C18241d<? super X, ? extends V> dVar, Executor executor) {
        return C18223a.m60143a(lVar, cls, dVar, executor);
    }
}
