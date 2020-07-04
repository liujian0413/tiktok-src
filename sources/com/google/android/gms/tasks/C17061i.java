package com.google.android.gms.tasks;

import com.google.android.gms.common.internal.C15267r;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.tasks.i */
public final class C17061i {

    /* renamed from: com.google.android.gms.tasks.i$a */
    static final class C17062a implements C17063b {

        /* renamed from: a */
        private final CountDownLatch f47732a;

        private C17062a() {
            this.f47732a = new CountDownLatch(1);
        }

        /* renamed from: a */
        public final void mo44284a(Object obj) {
            this.f47732a.countDown();
        }

        /* renamed from: a */
        public final void mo44283a(Exception exc) {
            this.f47732a.countDown();
        }

        /* renamed from: a */
        public final void mo44282a() {
            this.f47732a.countDown();
        }

        /* renamed from: b */
        public final void mo44304b() throws InterruptedException {
            this.f47732a.await();
        }

        /* renamed from: a */
        public final boolean mo44303a(long j, TimeUnit timeUnit) throws InterruptedException {
            return this.f47732a.await(j, timeUnit);
        }

        /* synthetic */ C17062a(C17080z zVar) {
            this();
        }
    }

    /* renamed from: com.google.android.gms.tasks.i$b */
    interface C17063b extends C17053b, C17055d, C17056e<Object> {
    }

    /* renamed from: a */
    public static <TResult> C17057f<TResult> m56597a(TResult tresult) {
        C17079y yVar = new C17079y();
        yVar.mo44316a(tresult);
        return yVar;
    }

    /* renamed from: a */
    public static <TResult> C17057f<TResult> m56596a(Exception exc) {
        C17079y yVar = new C17079y();
        yVar.mo44315a(exc);
        return yVar;
    }

    /* renamed from: a */
    public static <TResult> TResult m56598a(C17057f<TResult> fVar) throws ExecutionException, InterruptedException {
        C15267r.m44388a();
        C15267r.m44385a(fVar, (Object) "Task must not be null");
        if (fVar.mo44292a()) {
            return m56601b(fVar);
        }
        C17062a aVar = new C17062a(null);
        m56600a(fVar, aVar);
        aVar.mo44304b();
        return m56601b(fVar);
    }

    /* renamed from: a */
    public static <TResult> TResult m56599a(C17057f<TResult> fVar, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        C15267r.m44388a();
        C15267r.m44385a(fVar, (Object) "Task must not be null");
        C15267r.m44385a(timeUnit, (Object) "TimeUnit must not be null");
        if (fVar.mo44292a()) {
            return m56601b(fVar);
        }
        C17062a aVar = new C17062a(null);
        m56600a(fVar, aVar);
        if (aVar.mo44303a(j, timeUnit)) {
            return m56601b(fVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    /* renamed from: b */
    private static <TResult> TResult m56601b(C17057f<TResult> fVar) throws ExecutionException {
        if (fVar.mo44294b()) {
            return fVar.mo44296d();
        }
        if (fVar.mo44295c()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(fVar.mo44297e());
    }

    /* renamed from: a */
    private static void m56600a(C17057f<?> fVar, C17063b bVar) {
        fVar.mo44290a(C17059h.f47730b, (C17056e<? super TResult>) bVar);
        fVar.mo44289a(C17059h.f47730b, (C17055d) bVar);
        fVar.mo44287a(C17059h.f47730b, (C17053b) bVar);
    }
}
