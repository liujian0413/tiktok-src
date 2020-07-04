package com.bytedance.frameworks.core.thread;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import com.bytedance.frameworks.core.thread.TTPriority.Priority;
import com.bytedance.frameworks.core.thread.TTPriority.ThreadType;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class AsyncTask<Params, Progress, Result> {

    /* renamed from: a */
    public static final Executor f27726a;

    /* renamed from: e */
    private static final BlockingQueue<Runnable> f27727e = new PriorityBlockingQueue();

    /* renamed from: f */
    private static volatile Executor f27728f;

    /* renamed from: g */
    private static C10197b f27729g;

    /* renamed from: b */
    public final C10202b<Result> f27730b = new C10202b<Result>(this.f27733h, Priority.NORMAL, ThreadType.DEFAULT) {
        /* access modifiers changed from: protected */
        public final void done() {
            try {
                AsyncTask.this.mo24895a(get());
            } catch (InterruptedException unused) {
            } catch (ExecutionException e) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e.getCause());
            } catch (CancellationException unused2) {
                AsyncTask.this.mo24895a(null);
            }
        }
    };

    /* renamed from: c */
    public volatile Status f27731c = Status.PENDING;

    /* renamed from: d */
    public final AtomicBoolean f27732d = new AtomicBoolean();

    /* renamed from: h */
    private final C10201d<Params, Result> f27733h = new C10201d<Params, Result>() {
        public final Result call() throws Exception {
            AsyncTask.this.f27732d.set(true);
            Process.setThreadPriority(10);
            Object a = AsyncTask.this.mo24894a((Params[]) this.f27748b);
            Binder.flushPendingCommands();
            return AsyncTask.this.mo24896b(a);
        }
    };

    /* renamed from: i */
    private final AtomicBoolean f27734i = new AtomicBoolean();

    /* renamed from: com.bytedance.frameworks.core.thread.AsyncTask$1 */
    class C101931 extends C10201d<Params, Result> {

        /* renamed from: a */
        final /* synthetic */ AsyncTask f27735a;

        public final Result call() throws Exception {
            this.f27735a.f27732d.set(true);
            Process.setThreadPriority(10);
            Object a = this.f27735a.mo24894a((Params[]) this.f27748b);
            Binder.flushPendingCommands();
            return this.f27735a.mo24896b(a);
        }
    }

    public enum Status {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* renamed from: com.bytedance.frameworks.core.thread.AsyncTask$a */
    static class C10196a<Data> {

        /* renamed from: a */
        final AsyncTask f27738a;

        /* renamed from: b */
        final Data[] f27739b;

        C10196a(AsyncTask asyncTask, Data... dataArr) {
            this.f27738a = asyncTask;
            this.f27739b = dataArr;
        }
    }

    /* renamed from: com.bytedance.frameworks.core.thread.AsyncTask$b */
    static class C10197b extends Handler {
        public C10197b() {
            super(Looper.getMainLooper());
        }

        public final void handleMessage(Message message) {
            C10196a aVar = (C10196a) message.obj;
            if (message.what == 1) {
                aVar.f27738a.mo24897c(aVar.f27739b[0]);
            }
        }
    }

    /* renamed from: com.bytedance.frameworks.core.thread.AsyncTask$c */
    static class C10198c implements Executor {

        /* renamed from: a */
        final PriorityBlockingQueue<C6371c> f27740a;

        /* renamed from: b */
        final PriorityBlockingQueue<C6371c> f27741b;

        /* renamed from: c */
        C6371c f27742c;

        /* renamed from: d */
        C6371c f27743d;

        private C10198c() {
            this.f27740a = new PriorityBlockingQueue<>();
            this.f27741b = new PriorityBlockingQueue<>();
        }

        /* synthetic */ C10198c(C101931 r1) {
            this();
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized void mo24902a(com.bytedance.frameworks.core.thread.TTPriority.ThreadType r2) {
            /*
                r1 = this;
                monitor-enter(r1)
                if (r2 == 0) goto L_0x0027
                int r2 = r2.getValue()     // Catch:{ all -> 0x0025 }
                com.bytedance.frameworks.core.thread.TTPriority$ThreadType r0 = com.bytedance.frameworks.core.thread.TTPriority.ThreadType.API     // Catch:{ all -> 0x0025 }
                int r0 = r0.getValue()     // Catch:{ all -> 0x0025 }
                if (r2 != r0) goto L_0x0027
                java.util.concurrent.PriorityBlockingQueue<com.bytedance.frameworks.core.thread.c> r2 = r1.f27741b     // Catch:{ all -> 0x0025 }
                java.lang.Object r2 = r2.poll()     // Catch:{ all -> 0x0025 }
                com.bytedance.frameworks.core.thread.c r2 = (com.bytedance.frameworks.core.thread.C6371c) r2     // Catch:{ all -> 0x0025 }
                r1.f27743d = r2     // Catch:{ all -> 0x0025 }
                if (r2 == 0) goto L_0x003b
                com.bytedance.frameworks.core.thread.C6370a.m19801a()     // Catch:{ all -> 0x0025 }
                com.bytedance.frameworks.core.thread.c r2 = r1.f27743d     // Catch:{ all -> 0x0025 }
                com.bytedance.frameworks.core.thread.C6370a.m19802a(r2)     // Catch:{ all -> 0x0025 }
                monitor-exit(r1)
                return
            L_0x0025:
                r2 = move-exception
                goto L_0x003d
            L_0x0027:
                java.util.concurrent.PriorityBlockingQueue<com.bytedance.frameworks.core.thread.c> r2 = r1.f27740a     // Catch:{ all -> 0x0025 }
                java.lang.Object r2 = r2.poll()     // Catch:{ all -> 0x0025 }
                com.bytedance.frameworks.core.thread.c r2 = (com.bytedance.frameworks.core.thread.C6371c) r2     // Catch:{ all -> 0x0025 }
                r1.f27742c = r2     // Catch:{ all -> 0x0025 }
                if (r2 == 0) goto L_0x003b
                com.bytedance.frameworks.core.thread.C6370a.m19801a()     // Catch:{ all -> 0x0025 }
                com.bytedance.frameworks.core.thread.c r2 = r1.f27742c     // Catch:{ all -> 0x0025 }
                com.bytedance.frameworks.core.thread.C6370a.m19803b(r2)     // Catch:{ all -> 0x0025 }
            L_0x003b:
                monitor-exit(r1)
                return
            L_0x003d:
                monitor-exit(r1)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.core.thread.AsyncTask.C10198c.mo24902a(com.bytedance.frameworks.core.thread.TTPriority$ThreadType):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:0x004e, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized void execute(final java.lang.Runnable r4) {
            /*
                r3 = this;
                monitor-enter(r3)
                com.bytedance.frameworks.core.thread.TTPriority$Priority r0 = com.bytedance.frameworks.core.thread.TTPriority.Priority.NORMAL     // Catch:{ all -> 0x004f }
                com.bytedance.frameworks.core.thread.TTPriority$ThreadType r1 = com.bytedance.frameworks.core.thread.TTPriority.ThreadType.DEFAULT     // Catch:{ all -> 0x004f }
                if (r4 == 0) goto L_0x0017
                boolean r2 = r4 instanceof com.bytedance.frameworks.core.thread.C10202b     // Catch:{ all -> 0x004f }
                if (r2 == 0) goto L_0x0017
                r0 = r4
                com.bytedance.frameworks.core.thread.b r0 = (com.bytedance.frameworks.core.thread.C10202b) r0     // Catch:{ all -> 0x004f }
                com.bytedance.frameworks.core.thread.TTPriority$Priority r0 = r0.mo24906a()     // Catch:{ all -> 0x004f }
                r1 = r4
                com.bytedance.frameworks.core.thread.b r1 = (com.bytedance.frameworks.core.thread.C10202b) r1     // Catch:{ all -> 0x004f }
                com.bytedance.frameworks.core.thread.TTPriority$ThreadType r1 = r1.f27750b     // Catch:{ all -> 0x004f }
            L_0x0017:
                if (r1 == 0) goto L_0x003a
                int r1 = r1.getValue()     // Catch:{ all -> 0x004f }
                com.bytedance.frameworks.core.thread.TTPriority$ThreadType r2 = com.bytedance.frameworks.core.thread.TTPriority.ThreadType.API     // Catch:{ all -> 0x004f }
                int r2 = r2.getValue()     // Catch:{ all -> 0x004f }
                if (r1 != r2) goto L_0x003a
                java.util.concurrent.PriorityBlockingQueue<com.bytedance.frameworks.core.thread.c> r1 = r3.f27741b     // Catch:{ all -> 0x004f }
                com.bytedance.frameworks.core.thread.AsyncTask$c$1 r2 = new com.bytedance.frameworks.core.thread.AsyncTask$c$1     // Catch:{ all -> 0x004f }
                r2.<init>(r0, r4)     // Catch:{ all -> 0x004f }
                r1.offer(r2)     // Catch:{ all -> 0x004f }
                com.bytedance.frameworks.core.thread.c r4 = r3.f27743d     // Catch:{ all -> 0x004f }
                if (r4 != 0) goto L_0x004d
                com.bytedance.frameworks.core.thread.TTPriority$ThreadType r4 = com.bytedance.frameworks.core.thread.TTPriority.ThreadType.API     // Catch:{ all -> 0x004f }
                r3.mo24902a(r4)     // Catch:{ all -> 0x004f }
                monitor-exit(r3)
                return
            L_0x003a:
                java.util.concurrent.PriorityBlockingQueue<com.bytedance.frameworks.core.thread.c> r1 = r3.f27740a     // Catch:{ all -> 0x004f }
                com.bytedance.frameworks.core.thread.AsyncTask$c$2 r2 = new com.bytedance.frameworks.core.thread.AsyncTask$c$2     // Catch:{ all -> 0x004f }
                r2.<init>(r0, r4)     // Catch:{ all -> 0x004f }
                r1.offer(r2)     // Catch:{ all -> 0x004f }
                com.bytedance.frameworks.core.thread.c r4 = r3.f27742c     // Catch:{ all -> 0x004f }
                if (r4 != 0) goto L_0x004d
                com.bytedance.frameworks.core.thread.TTPriority$ThreadType r4 = com.bytedance.frameworks.core.thread.TTPriority.ThreadType.DEFAULT     // Catch:{ all -> 0x004f }
                r3.mo24902a(r4)     // Catch:{ all -> 0x004f }
            L_0x004d:
                monitor-exit(r3)
                return
            L_0x004f:
                r4 = move-exception
                monitor-exit(r3)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.core.thread.AsyncTask.C10198c.execute(java.lang.Runnable):void");
        }
    }

    /* renamed from: com.bytedance.frameworks.core.thread.AsyncTask$d */
    static abstract class C10201d<Params, Result> implements Callable<Result> {

        /* renamed from: b */
        Params[] f27748b;

        private C10201d() {
        }

        /* synthetic */ C10201d(C101931 r1) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Result mo24894a(Params... paramsArr);

    /* renamed from: b */
    private boolean m30275b() {
        return this.f27734i.get();
    }

    static {
        C10198c cVar = new C10198c(null);
        f27726a = cVar;
        f27728f = cVar;
    }

    /* renamed from: a */
    private static Handler m30274a() {
        C10197b bVar;
        synchronized (AsyncTask.class) {
            if (f27729g == null) {
                f27729g = new C10197b();
            }
            bVar = f27729g;
        }
        return bVar;
    }

    /* renamed from: c */
    public final void mo24897c(Result result) {
        m30275b();
        this.f27731c = Status.FINISHED;
    }

    /* renamed from: a */
    public final void mo24895a(Result result) {
        if (!this.f27732d.get()) {
            mo24896b(result);
        }
    }

    /* renamed from: b */
    public final Result mo24896b(Result result) {
        m30274a().obtainMessage(1, new C10196a(this, result)).sendToTarget();
        return result;
    }
}
