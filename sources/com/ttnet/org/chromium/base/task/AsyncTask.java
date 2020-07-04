package com.ttnet.org.chromium.base.task;

import android.os.Binder;
import com.ttnet.org.chromium.base.Log;
import com.ttnet.org.chromium.base.ThreadUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class AsyncTask<Result> {
    public static final Executor SERIAL_EXECUTOR = new SerialExecutor();
    private static final StealRunnableHandler STEAL_RUNNABLE_HANDLER = new StealRunnableHandler();
    public static final Executor THREAD_POOL_EXECUTOR = AsyncTask$$Lambda$1.$instance;
    public final AtomicBoolean mCancelled = new AtomicBoolean();
    private final FutureTask<Result> mFuture = new NamedFutureTask(this.mWorker);
    private volatile int mStatus;
    public final AtomicBoolean mTaskInvoked = new AtomicBoolean();
    private final Callable<Result> mWorker = new Callable<Result>() {
        public Result call() throws Exception {
            AsyncTask.this.mTaskInvoked.set(true);
            Object obj = null;
            try {
                Result doInBackground = AsyncTask.this.doInBackground();
                try {
                    Binder.flushPendingCommands();
                    AsyncTask.this.postResult(doInBackground);
                    return doInBackground;
                } catch (Throwable th) {
                    th = th;
                    obj = doInBackground;
                    AsyncTask.this.postResult(obj);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                AsyncTask.this.mCancelled.set(true);
                throw th;
            }
        }
    };

    @Retention(RetentionPolicy.SOURCE)
    public @interface Status {
    }

    class NamedFutureTask extends FutureTask<Result> {
        /* access modifiers changed from: 0000 */
        public Class getBlamedClass() {
            return AsyncTask.this.getClass();
        }

        /* access modifiers changed from: protected */
        public void done() {
            try {
                AsyncTask.this.postResultIfNotInvoked(get());
            } catch (InterruptedException e) {
                Log.m146404w("AsyncTask", e.toString(), new Object[0]);
            } catch (ExecutionException e2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
            } catch (CancellationException unused) {
                AsyncTask.this.postResultIfNotInvoked(null);
            }
        }

        NamedFutureTask(Callable<Result> callable) {
            super(callable);
        }
    }

    static class StealRunnableHandler implements RejectedExecutionHandler {
        private StealRunnableHandler() {
        }

        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(runnable);
        }
    }

    /* access modifiers changed from: protected */
    public abstract Result doInBackground();

    public final int getStatus() {
        return this.mStatus;
    }

    /* access modifiers changed from: protected */
    public void onCancelled() {
    }

    /* access modifiers changed from: protected */
    public abstract void onPostExecute(Result result);

    /* access modifiers changed from: protected */
    public void onPreExecute() {
    }

    public final boolean isCancelled() {
        return this.mCancelled.get();
    }

    public static void takeOverAndroidThreadPool() {
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) android.os.AsyncTask.THREAD_POOL_EXECUTOR;
        threadPoolExecutor.setRejectedExecutionHandler(STEAL_RUNNABLE_HANDLER);
        threadPoolExecutor.shutdown();
    }

    private void executionPreamble() {
        if (this.mStatus != 0) {
            switch (this.mStatus) {
                case 1:
                    throw new IllegalStateException("Cannot execute task: the task is already running.");
                case 2:
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        }
        this.mStatus = 1;
        onPreExecute();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0061, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0065, code lost:
        if (r0 != null) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0067, code lost:
        if (r1 != null) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006e, code lost:
        com.google.p268a.p269a.p270a.p271a.p272a.C6497a.m20181a(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0072, code lost:
        r0.close();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final Result get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
        /*
            r4 = this;
            int r0 = r4.getStatus()
            r1 = 2
            if (r0 == r1) goto L_0x0076
            boolean r0 = com.ttnet.org.chromium.base.ThreadUtils.runningOnUiThread()
            if (r0 == 0) goto L_0x0076
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            java.lang.String r1 = ""
            int r2 = r0.length
            r3 = 1
            if (r2 <= r3) goto L_0x003f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = r0[r3]
            java.lang.String r2 = r2.getClassName()
            r1.append(r2)
            r2 = 46
            r1.append(r2)
            r0 = r0[r3]
            java.lang.String r0 = r0.getMethodName()
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
        L_0x003f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "AsyncTask.get"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.ttnet.org.chromium.base.TraceEvent r0 = com.ttnet.org.chromium.base.TraceEvent.scoped(r0)
            r1 = 0
            java.util.concurrent.FutureTask<Result> r2 = r4.mFuture     // Catch:{ Throwable -> 0x0063 }
            java.lang.Object r2 = r2.get()     // Catch:{ Throwable -> 0x0063 }
            if (r0 == 0) goto L_0x007c
            r0.close()
            goto L_0x007c
        L_0x0061:
            r2 = move-exception
            goto L_0x0065
        L_0x0063:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0061 }
        L_0x0065:
            if (r0 == 0) goto L_0x0075
            if (r1 == 0) goto L_0x0072
            r0.close()     // Catch:{ Throwable -> 0x006d }
            goto L_0x0075
        L_0x006d:
            r0 = move-exception
            com.google.p268a.p269a.p270a.p271a.p272a.C6497a.m20181a(r1, r0)
            goto L_0x0075
        L_0x0072:
            r0.close()
        L_0x0075:
            throw r2
        L_0x0076:
            java.util.concurrent.FutureTask<Result> r0 = r4.mFuture
            java.lang.Object r2 = r0.get()
        L_0x007c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base.task.AsyncTask.get():java.lang.Object");
    }

    /* access modifiers changed from: protected */
    public void onCancelled(Result result) {
        onCancelled();
    }

    public final boolean cancel(boolean z) {
        this.mCancelled.set(true);
        return this.mFuture.cancel(z);
    }

    public final AsyncTask<Result> executeOnExecutor(Executor executor) {
        executionPreamble();
        executor.execute(this.mFuture);
        return this;
    }

    public final AsyncTask<Result> executeOnTaskRunner(TaskRunner taskRunner) {
        executionPreamble();
        taskRunner.postTask(this.mFuture);
        return this;
    }

    public final AsyncTask<Result> executeWithTaskTraits(TaskTraits taskTraits) {
        executionPreamble();
        PostTask.postTask(taskTraits, this.mFuture);
        return this;
    }

    public void postResultIfNotInvoked(Result result) {
        if (!this.mTaskInvoked.get()) {
            postResult(result);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: finish */
    public void lambda$postResult$1$AsyncTask(Result result) {
        if (isCancelled()) {
            onCancelled(result);
        } else {
            onPostExecute(result);
        }
        this.mStatus = 2;
    }

    public void postResult(Result result) {
        if (this instanceof BackgroundOnlyAsyncTask) {
            this.mStatus = 2;
        } else {
            ThreadUtils.postOnUiThread((Runnable) new AsyncTask$$Lambda$0(this, result));
        }
    }
}
