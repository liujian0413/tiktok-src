package com.ttnet.org.chromium.net1.urlconnection;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

public class MessageLoop implements Executor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private boolean mLoopFailed;
    private boolean mLoopRunning;
    private final BlockingQueue<Runnable> mQueue = new LinkedBlockingQueue();
    private long mThreadId = -1;

    public boolean hasLoopFailed() {
        return this.mLoopFailed;
    }

    public boolean isRunning() {
        return this.mLoopRunning;
    }

    public void quit() {
        this.mLoopRunning = false;
    }

    public void reset() {
        this.mLoopFailed = false;
    }

    public void loop() throws IOException {
        loop(0);
    }

    private boolean calledOnValidThread() {
        if (this.mThreadId == -1) {
            this.mThreadId = Thread.currentThread().getId();
            return true;
        } else if (this.mThreadId == Thread.currentThread().getId()) {
            return true;
        } else {
            return false;
        }
    }

    public void execute(Runnable runnable) throws RejectedExecutionException {
        if (runnable != null) {
            try {
                this.mQueue.put(runnable);
            } catch (InterruptedException e) {
                throw new RejectedExecutionException(e);
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void loop(int i) throws IOException {
        long nanoTime = System.nanoTime();
        long convert = TimeUnit.NANOSECONDS.convert((long) i, TimeUnit.MILLISECONDS);
        if (this.mLoopFailed) {
            throw new IllegalStateException("Cannot run loop as an exception has occurred previously.");
        } else if (!this.mLoopRunning) {
            this.mLoopRunning = true;
            while (this.mLoopRunning) {
                if (i == 0) {
                    try {
                        take(false, 0).run();
                    } catch (SocketTimeoutException e) {
                        this.mLoopRunning = false;
                        this.mLoopFailed = true;
                        throw e;
                    } catch (InterruptedIOException | RuntimeException e2) {
                        this.mLoopRunning = false;
                        this.mLoopFailed = true;
                        throw new IllegalStateException(e2);
                    }
                } else {
                    take(true, (convert - System.nanoTime()) + nanoTime).run();
                }
            }
        } else {
            throw new IllegalStateException("Cannot run loop when it is already running.");
        }
    }

    private Runnable take(boolean z, long j) throws InterruptedIOException {
        Runnable runnable;
        if (!z) {
            try {
                runnable = (Runnable) this.mQueue.take();
            } catch (InterruptedException e) {
                InterruptedIOException interruptedIOException = new InterruptedIOException();
                interruptedIOException.initCause(e);
                throw interruptedIOException;
            }
        } else {
            runnable = (Runnable) this.mQueue.poll(j, TimeUnit.NANOSECONDS);
        }
        if (runnable != null) {
            return runnable;
        }
        throw new SocketTimeoutException();
    }
}
