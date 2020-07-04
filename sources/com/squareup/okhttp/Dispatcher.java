package com.squareup.okhttp;

import com.squareup.okhttp.internal.Util;
import com.squareup.okhttp.internal.http.HttpEngine;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class Dispatcher {
    private final Deque<Call> executedCalls = new ArrayDeque();
    private ExecutorService executorService;
    private int maxRequests = 64;
    private int maxRequestsPerHost = 5;
    private final Deque<AsyncCall> readyCalls = new ArrayDeque();
    private final Deque<AsyncCall> runningCalls = new ArrayDeque();

    public final synchronized int getMaxRequests() {
        return this.maxRequests;
    }

    public final synchronized int getMaxRequestsPerHost() {
        return this.maxRequestsPerHost;
    }

    public final synchronized int getQueuedCallCount() {
        return this.readyCalls.size();
    }

    public final synchronized int getRunningCallCount() {
        return this.runningCalls.size();
    }

    public Dispatcher() {
    }

    public final synchronized ExecutorService getExecutorService() {
        if (this.executorService == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), Util.threadFactory("OkHttp Dispatcher", false));
            this.executorService = threadPoolExecutor;
        }
        return this.executorService;
    }

    private void promoteCalls() {
        if (this.runningCalls.size() < this.maxRequests && !this.readyCalls.isEmpty()) {
            Iterator it = this.readyCalls.iterator();
            while (it.hasNext()) {
                AsyncCall asyncCall = (AsyncCall) it.next();
                if (runningCallsForHost(asyncCall) < this.maxRequestsPerHost) {
                    it.remove();
                    this.runningCalls.add(asyncCall);
                    getExecutorService().execute(asyncCall);
                }
                if (this.runningCalls.size() >= this.maxRequests) {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final synchronized void executed(Call call) {
        this.executedCalls.add(call);
    }

    /* access modifiers changed from: 0000 */
    public final synchronized void finished(AsyncCall asyncCall) {
        if (this.runningCalls.remove(asyncCall)) {
            promoteCalls();
        } else {
            throw new AssertionError("AsyncCall wasn't running!");
        }
    }

    public Dispatcher(ExecutorService executorService2) {
        this.executorService = executorService2;
    }

    private int runningCallsForHost(AsyncCall asyncCall) {
        int i = 0;
        for (AsyncCall host : this.runningCalls) {
            if (host.host().equals(asyncCall.host())) {
                i++;
            }
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    public final synchronized void enqueue(AsyncCall asyncCall) {
        if (this.runningCalls.size() >= this.maxRequests || runningCallsForHost(asyncCall) >= this.maxRequestsPerHost) {
            this.readyCalls.add(asyncCall);
            return;
        }
        this.runningCalls.add(asyncCall);
        getExecutorService().execute(asyncCall);
    }

    /* access modifiers changed from: 0000 */
    public final synchronized void finished(Call call) {
        if (!this.executedCalls.remove(call)) {
            throw new AssertionError("Call wasn't in-flight!");
        }
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

    public final synchronized void cancel(Object obj) {
        for (AsyncCall asyncCall : this.readyCalls) {
            if (Util.equal(obj, asyncCall.tag())) {
                asyncCall.cancel();
            }
        }
        for (AsyncCall asyncCall2 : this.runningCalls) {
            if (Util.equal(obj, asyncCall2.tag())) {
                asyncCall2.get().canceled = true;
                HttpEngine httpEngine = asyncCall2.get().engine;
                if (httpEngine != null) {
                    httpEngine.cancel();
                }
            }
        }
        for (Call call : this.executedCalls) {
            if (Util.equal(obj, call.tag())) {
                call.cancel();
            }
        }
    }
}
