package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C14793ay;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

@C6505uv
public final class afy {
    /* renamed from: a */
    public static <V> void m45824a(agj<V> agj, afv<? super V> afv, Executor executor) {
        agj.mo39308a(new afz(afv, agj), executor);
    }

    /* renamed from: a */
    public static <A, B> agj<B> m45820a(agj<A> agj, C15477afu<A, B> afu2, Executor executor) {
        agu agu = new agu();
        agj.mo39308a(new aga(agu, afu2, agj), executor);
        m45826a((agj<A>) agu, (Future<B>) agj);
        return agu;
    }

    /* renamed from: a */
    public static <A, B> agj<B> m45819a(agj<A> agj, aft<? super A, ? extends B> aft, Executor executor) {
        agu agu = new agu();
        agj.mo39308a(new agb(agu, aft, agj), executor);
        m45826a((agj<A>) agu, (Future<B>) agj);
        return agu;
    }

    /* renamed from: a */
    public static <V> agj<V> m45818a(agj<V> agj, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        agu agu = new agu();
        m45826a((agj<A>) agu, (Future<B>) agj);
        ScheduledFuture schedule = scheduledExecutorService.schedule(new agc(agu), j, timeUnit);
        m45825a(agj, agu);
        agu.mo39308a(new agd(schedule), ago.f40190b);
        return agu;
    }

    /* renamed from: a */
    public static <V, X extends Throwable> agj<V> m45821a(agj<? extends V> agj, Class<X> cls, aft<? super X, ? extends V> aft, Executor executor) {
        agu agu = new agu();
        m45826a((agj<A>) agu, (Future<B>) agj);
        age age = new age(agu, agj, cls, aft, executor);
        agj.mo39308a(age, ago.f40190b);
        return agu;
    }

    /* renamed from: a */
    public static <T> T m45822a(Future<T> future, T t) {
        try {
            return future.get(((Long) bym.m50299d().mo41272a(C15585bw.f43846bn)).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            future.cancel(true);
            acd.m45780c("InterruptedException caught while resolving future.", e);
            Thread.currentThread().interrupt();
            C14793ay.m42898d().mo39092b(e, "Futures.resolveFuture");
            return t;
        } catch (Exception e2) {
            future.cancel(true);
            acd.m45778b("Error waiting for future.", e2);
            C14793ay.m42898d().mo39092b(e2, "Futures.resolveFuture");
            return t;
        }
    }

    /* renamed from: a */
    public static <T> T m45823a(Future<T> future, T t, long j, TimeUnit timeUnit) {
        try {
            return future.get(j, timeUnit);
        } catch (InterruptedException e) {
            future.cancel(true);
            acd.m45780c("InterruptedException caught while resolving future.", e);
            Thread.currentThread().interrupt();
            C14793ay.m42898d().mo39092b(e, "Futures.resolveFuture");
            return t;
        } catch (Exception e2) {
            future.cancel(true);
            acd.m45778b("Error waiting for future.", e2);
            C14793ay.m42898d().mo39092b(e2, "Futures.resolveFuture");
            return t;
        }
    }

    /* renamed from: a */
    public static <T> agi<T> m45817a(T t) {
        return new agi<>(t);
    }

    /* renamed from: a */
    public static <T> agh<T> m45816a(Throwable th) {
        return new agh<>(th);
    }

    /* renamed from: a */
    private static <V> void m45825a(agj<? extends V> agj, agu<V> agu) {
        m45826a((agj<A>) agu, (Future<B>) agj);
        agj.mo39308a(new agf(agu, agj), ago.f40190b);
    }

    /* renamed from: a */
    private static <A, B> void m45826a(agj<A> agj, Future<B> future) {
        agj.mo39308a(new agg(agj, future), ago.f40190b);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final /* synthetic */ void m45828a(com.google.android.gms.internal.ads.agu r1, com.google.android.gms.internal.ads.agj r2, java.lang.Class r3, com.google.android.gms.internal.ads.aft r4, java.util.concurrent.Executor r5) {
        /*
            java.lang.Object r2 = r2.get()     // Catch:{ ExecutionException -> 0x0013, InterruptedException -> 0x000a, Exception -> 0x0008 }
            r1.mo39333b(r2)     // Catch:{ ExecutionException -> 0x0013, InterruptedException -> 0x000a, Exception -> 0x0008 }
            return
        L_0x0008:
            r2 = move-exception
            goto L_0x0018
        L_0x000a:
            r2 = move-exception
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L_0x0018
        L_0x0013:
            r2 = move-exception
            java.lang.Throwable r2 = r2.getCause()
        L_0x0018:
            boolean r3 = r3.isInstance(r2)
            if (r3 == 0) goto L_0x002a
            com.google.android.gms.internal.ads.agi r2 = m45817a((T) r2)
            com.google.android.gms.internal.ads.agj r2 = m45819a(r2, r4, r5)
            m45825a(r2, r1)
            return
        L_0x002a:
            r1.mo39332a(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.afy.m45828a(com.google.android.gms.internal.ads.agu, com.google.android.gms.internal.ads.agj, java.lang.Class, com.google.android.gms.internal.ads.aft, java.util.concurrent.Executor):void");
    }

    /* renamed from: a */
    static final /* synthetic */ void m45827a(agu agu, aft aft, agj agj) {
        if (!agu.isCancelled()) {
            try {
                m45825a(aft.mo37772a(agj.get()), agu);
            } catch (CancellationException unused) {
                agu.cancel(true);
            } catch (ExecutionException e) {
                agu.mo39332a(e.getCause());
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                agu.mo39332a(e2);
            } catch (Exception e3) {
                agu.mo39332a(e3);
            }
        }
    }
}
