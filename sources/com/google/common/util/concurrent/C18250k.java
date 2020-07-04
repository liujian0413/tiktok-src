package com.google.common.util.concurrent;

import com.google.common.base.C17439m;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.common.util.concurrent.k */
abstract class C18250k<V> extends C18244f<V> {

    /* renamed from: a */
    private static final Logger f49633a = Logger.getLogger(C18250k.class.getName());

    /* renamed from: com.google.common.util.concurrent.k$a */
    static final class C18251a<V> extends C18235h<V> {
        C18251a(Throwable th) {
            mo47087a(th);
        }
    }

    /* renamed from: com.google.common.util.concurrent.k$b */
    static class C18252b<V> extends C18250k<V> {

        /* renamed from: a */
        static final C18252b<Object> f49634a = new C18252b<>(null);

        /* renamed from: b */
        private final V f49635b;

        public final V get() {
            return this.f49635b;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append("[status=SUCCESS, result=[");
            sb.append(this.f49635b);
            sb.append("]]");
            return sb.toString();
        }

        C18252b(V v) {
            this.f49635b = v;
        }
    }

    C18250k() {
    }

    public boolean cancel(boolean z) {
        return false;
    }

    public abstract V get() throws ExecutionException;

    public boolean isCancelled() {
        return false;
    }

    public boolean isDone() {
        return true;
    }

    public V get(long j, TimeUnit timeUnit) throws ExecutionException {
        C17439m.m57962a(timeUnit);
        return get();
    }

    /* renamed from: a */
    public final void mo6818a(Runnable runnable, Executor executor) {
        C17439m.m57963a(runnable, (Object) "Runnable was null.");
        C17439m.m57963a(executor, (Object) "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f49633a;
            Level level = Level.SEVERE;
            StringBuilder sb = new StringBuilder("RuntimeException while executing runnable ");
            sb.append(runnable);
            sb.append(" with executor ");
            sb.append(executor);
            logger.log(level, sb.toString(), e);
        }
    }
}
