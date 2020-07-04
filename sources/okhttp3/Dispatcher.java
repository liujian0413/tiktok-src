package okhttp3;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.Util;

public final class Dispatcher {
    private ExecutorService executorService;
    private Runnable idleCallback;
    private int maxRequests = 64;
    private int maxRequestsPerHost = 5;
    private final Deque<AsyncCall> readyAsyncCalls = new ArrayDeque();
    private final Deque<AsyncCall> runningAsyncCalls = new ArrayDeque();
    private final Deque<RealCall> runningSyncCalls = new ArrayDeque();

    public final synchronized int getMaxRequests() {
        return this.maxRequests;
    }

    public final synchronized int getMaxRequestsPerHost() {
        return this.maxRequestsPerHost;
    }

    public final synchronized int queuedCallsCount() {
        return this.readyAsyncCalls.size();
    }

    public Dispatcher() {
    }

    public final synchronized int runningCallsCount() {
        return this.runningAsyncCalls.size() + this.runningSyncCalls.size();
    }

    public final synchronized ExecutorService executorService() {
        if (this.executorService == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), Util.threadFactory("OkHttp Dispatcher", false));
            this.executorService = threadPoolExecutor;
        }
        return this.executorService;
    }

    public final synchronized List<Call> queuedCalls() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (AsyncCall asyncCall : this.readyAsyncCalls) {
            arrayList.add(RealCall.this);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final synchronized List<Call> runningCalls() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        arrayList.addAll(this.runningSyncCalls);
        for (AsyncCall asyncCall : this.runningAsyncCalls) {
            arrayList.add(RealCall.this);
        }
        return Collections.unmodifiableList(arrayList);
    }

    private void promoteCalls() {
        if (this.runningAsyncCalls.size() < this.maxRequests && !this.readyAsyncCalls.isEmpty()) {
            Iterator it = this.readyAsyncCalls.iterator();
            while (it.hasNext()) {
                AsyncCall asyncCall = (AsyncCall) it.next();
                if (runningCallsForHost(asyncCall) < this.maxRequestsPerHost) {
                    it.remove();
                    this.runningAsyncCalls.add(asyncCall);
                    executorService().execute(asyncCall);
                }
                if (this.runningAsyncCalls.size() >= this.maxRequests) {
                    return;
                }
            }
        }
    }

    public final synchronized void cancelAll() {
        for (AsyncCall asyncCall : this.readyAsyncCalls) {
            RealCall.this.cancel();
        }
        for (AsyncCall asyncCall2 : this.runningAsyncCalls) {
            RealCall.this.cancel();
        }
        for (RealCall cancel : this.runningSyncCalls) {
            cancel.cancel();
        }
    }

    /* access modifiers changed from: 0000 */
    public final void finished(AsyncCall asyncCall) {
        finished(this.runningAsyncCalls, asyncCall, true);
    }

    public final synchronized void setIdleCallback(Runnable runnable) {
        this.idleCallback = runnable;
    }

    /* access modifiers changed from: 0000 */
    public final synchronized void executed(RealCall realCall) {
        this.runningSyncCalls.add(realCall);
    }

    /* access modifiers changed from: 0000 */
    public final void finished(RealCall realCall) {
        finished(this.runningSyncCalls, realCall, false);
    }

    public Dispatcher(ExecutorService executorService2) {
        this.executorService = executorService2;
    }

    private int runningCallsForHost(AsyncCall asyncCall) {
        int i = 0;
        for (AsyncCall asyncCall2 : this.runningAsyncCalls) {
            if (!RealCall.this.forWebSocket && asyncCall2.host().equals(asyncCall.host())) {
                i++;
            }
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    public final synchronized void enqueue(AsyncCall asyncCall) {
        if (this.runningAsyncCalls.size() >= this.maxRequests || runningCallsForHost(asyncCall) >= this.maxRequestsPerHost) {
            this.readyAsyncCalls.add(asyncCall);
            return;
        }
        this.runningAsyncCalls.add(asyncCall);
        executorService().execute(asyncCall);
    }

    public final synchronized void setMaxRequests(int i) {
        if (i > 0) {
            this.maxRequests = i;
            promoteCalls();
        } else {
            StringBuilder sb = new StringBuilder("max < 1: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final synchronized void setMaxRequestsPerHost(int i) {
        if (i > 0) {
            this.maxRequestsPerHost = i;
            promoteCalls();
        } else {
            StringBuilder sb = new StringBuilder("max < 1: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private <T> void finished(Deque<T> deque, T t, boolean z) {
        int runningCallsCount;
        Runnable runnable;
        synchronized (this) {
            if (deque.remove(t)) {
                if (z) {
                    promoteCalls();
                }
                runningCallsCount = runningCallsCount();
                runnable = this.idleCallback;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (runningCallsCount == 0 && runnable != null) {
            runnable.run();
        }
    }
}
