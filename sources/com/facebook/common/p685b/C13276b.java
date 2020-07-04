package com.facebook.common.p685b;

import com.facebook.common.p686c.C13286a;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.common.b.b */
public class C13276b extends AbstractExecutorService {

    /* renamed from: a */
    public static final Class<?> f35167a = C13276b.class;

    /* renamed from: b */
    public final String f35168b;

    /* renamed from: c */
    public final BlockingQueue<Runnable> f35169c;

    /* renamed from: d */
    public final AtomicInteger f35170d;

    /* renamed from: e */
    private final Executor f35171e;

    /* renamed from: f */
    private volatile int f35172f = 1;

    /* renamed from: g */
    private final C13278a f35173g;

    /* renamed from: h */
    private final AtomicInteger f35174h;

    /* renamed from: com.facebook.common.b.b$a */
    class C13278a implements Runnable {
        public final void run() {
            try {
                Runnable runnable = (Runnable) C13276b.this.f35169c.poll();
                if (runnable != null) {
                    runnable.run();
                } else {
                    C13286a.m38835a(C13276b.f35167a, "%s: Worker has nothing to run", (Object) C13276b.this.f35168b);
                }
                int decrementAndGet = C13276b.this.f35170d.decrementAndGet();
                if (!C13276b.this.f35169c.isEmpty()) {
                    C13276b.this.mo32501a();
                } else {
                    C13286a.m38836a(C13276b.f35167a, "%s: worker finished; %d workers left", (Object) C13276b.this.f35168b, (Object) Integer.valueOf(decrementAndGet));
                }
            } catch (Throwable th) {
                int decrementAndGet2 = C13276b.this.f35170d.decrementAndGet();
                if (!C13276b.this.f35169c.isEmpty()) {
                    C13276b.this.mo32501a();
                } else {
                    C13286a.m38836a(C13276b.f35167a, "%s: worker finished; %d workers left", (Object) C13276b.this.f35168b, (Object) Integer.valueOf(decrementAndGet2));
                }
                throw th;
            }
        }

        private C13278a() {
        }
    }

    public boolean isShutdown() {
        return false;
    }

    public boolean isTerminated() {
        return false;
    }

    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo32501a() {
        int i = this.f35170d.get();
        while (i < this.f35172f) {
            int i2 = i + 1;
            if (this.f35170d.compareAndSet(i, i2)) {
                C13286a.m38837a(f35167a, "%s: starting worker %d of %d", this.f35168b, Integer.valueOf(i2), Integer.valueOf(this.f35172f));
                this.f35171e.execute(this.f35173g);
                return;
            }
            C13286a.m38835a(f35167a, "%s: race in startWorkerIfNeeded; retrying", (Object) this.f35168b);
            i = this.f35170d.get();
        }
    }

    public void execute(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException("runnable parameter is null");
        } else if (this.f35169c.offer(runnable)) {
            int size = this.f35169c.size();
            int i = this.f35174h.get();
            if (size > i && this.f35174h.compareAndSet(i, size)) {
                C13286a.m38836a(f35167a, "%s: max pending work in queue = %d", (Object) this.f35168b, (Object) Integer.valueOf(size));
            }
            mo32501a();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f35168b);
            sb.append(" queue is full, size=");
            sb.append(this.f35169c.size());
            throw new RejectedExecutionException(sb.toString());
        }
    }

    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        throw new UnsupportedOperationException();
    }

    public C13276b(String str, int i, Executor executor, BlockingQueue<Runnable> blockingQueue) {
        this.f35168b = str;
        this.f35171e = executor;
        this.f35169c = blockingQueue;
        this.f35173g = new C13278a();
        this.f35170d = new AtomicInteger(0);
        this.f35174h = new AtomicInteger(0);
    }
}
