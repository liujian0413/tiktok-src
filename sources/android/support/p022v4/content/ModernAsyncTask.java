package android.support.p022v4.content;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: android.support.v4.content.ModernAsyncTask */
abstract class ModernAsyncTask<Params, Progress, Result> {

    /* renamed from: a */
    private static final ThreadFactory f2606a = new ThreadFactory() {

        /* renamed from: a */
        private final AtomicInteger f2616a = new AtomicInteger(1);

        public final Thread newThread(Runnable runnable) {
            StringBuilder sb = new StringBuilder("ModernAsyncTask #");
            sb.append(this.f2616a.getAndIncrement());
            return new Thread(runnable, sb.toString());
        }
    };

    /* renamed from: b */
    private static final BlockingQueue<Runnable> f2607b = new LinkedBlockingQueue(10);

    /* renamed from: c */
    public static final Executor f2608c;

    /* renamed from: g */
    private static C0680b f2609g;

    /* renamed from: h */
    private static volatile Executor f2610h;

    /* renamed from: d */
    public volatile Status f2611d = Status.PENDING;

    /* renamed from: e */
    final AtomicBoolean f2612e = new AtomicBoolean();

    /* renamed from: f */
    final AtomicBoolean f2613f = new AtomicBoolean();

    /* renamed from: i */
    private final C0681c<Params, Result> f2614i = new C0681c<Params, Result>() {
        public final Result call() throws Exception {
            ModernAsyncTask.this.f2613f.set(true);
            Object obj = null;
            try {
                Process.setThreadPriority(10);
                Result a = ModernAsyncTask.this.mo2786a((Params[]) this.f2622b);
                try {
                    Binder.flushPendingCommands();
                    ModernAsyncTask.this.mo2815d(a);
                    return a;
                } catch (Throwable th) {
                    th = th;
                    obj = a;
                    ModernAsyncTask.this.mo2815d(obj);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                ModernAsyncTask.this.f2612e.set(true);
                throw th;
            }
        }
    };

    /* renamed from: j */
    private final FutureTask<Result> f2615j = new FutureTask<Result>(this.f2614i) {
        /* access modifiers changed from: protected */
        public final void done() {
            try {
                ModernAsyncTask.this.mo2814c(get());
            } catch (InterruptedException unused) {
            } catch (ExecutionException e) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e.getCause());
            } catch (CancellationException unused2) {
                ModernAsyncTask.this.mo2814c(null);
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    };

    /* renamed from: android.support.v4.content.ModernAsyncTask$Status */
    public enum Status {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* renamed from: android.support.v4.content.ModernAsyncTask$a */
    static class C0679a<Data> {

        /* renamed from: a */
        final ModernAsyncTask f2620a;

        /* renamed from: b */
        final Data[] f2621b;

        C0679a(ModernAsyncTask modernAsyncTask, Data... dataArr) {
            this.f2620a = modernAsyncTask;
            this.f2621b = dataArr;
        }
    }

    /* renamed from: android.support.v4.content.ModernAsyncTask$b */
    static class C0680b extends Handler {
        C0680b() {
            super(Looper.getMainLooper());
        }

        public final void handleMessage(Message message) {
            C0679a aVar = (C0679a) message.obj;
            if (message.what == 1) {
                aVar.f2620a.mo2816e(aVar.f2621b[0]);
            }
        }
    }

    /* renamed from: android.support.v4.content.ModernAsyncTask$c */
    static abstract class C0681c<Params, Result> implements Callable<Result> {

        /* renamed from: b */
        Params[] f2622b;

        C0681c() {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Result mo2786a(Params... paramsArr);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2787a(Result result) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo2788b(Result result) {
    }

    /* renamed from: a */
    public final boolean mo2812a() {
        return this.f2612e.get();
    }

    /* renamed from: b */
    private static Handler m2890b() {
        C0680b bVar;
        synchronized (ModernAsyncTask.class) {
            if (f2609g == null) {
                f2609g = new C0680b();
            }
            bVar = f2609g;
        }
        return bVar;
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH, 1, TimeUnit.SECONDS, f2607b, f2606a);
        f2608c = threadPoolExecutor;
        f2610h = threadPoolExecutor;
    }

    ModernAsyncTask() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo2814c(Result result) {
        if (!this.f2613f.get()) {
            mo2815d(result);
        }
    }

    /* renamed from: a */
    public final boolean mo2813a(boolean z) {
        this.f2612e.set(true);
        return this.f2615j.cancel(false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final Result mo2815d(Result result) {
        m2890b().obtainMessage(1, new C0679a(this, result)).sendToTarget();
        return result;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final void mo2816e(Result result) {
        if (mo2812a()) {
            mo2788b(result);
        } else {
            mo2787a(result);
        }
        this.f2611d = Status.FINISHED;
    }

    /* renamed from: a */
    public final ModernAsyncTask<Params, Progress, Result> mo2811a(Executor executor, Params... paramsArr) {
        if (this.f2611d != Status.PENDING) {
            switch (this.f2611d) {
                case RUNNING:
                    throw new IllegalStateException("Cannot execute task: the task is already running.");
                case FINISHED:
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                default:
                    throw new IllegalStateException("We should never reach this state");
            }
        } else {
            this.f2611d = Status.RUNNING;
            this.f2614i.f2622b = null;
            executor.execute(this.f2615j);
            return this;
        }
    }
}
