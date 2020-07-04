package com.bytedance.ies.util.thread;

import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.util.thread.p581a.C11086c;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class ApiThread implements Comparable<ApiThread>, Runnable {
    private static C11086c sQueue = new C11086c();
    private static AtomicBoolean sQueueStarted = new AtomicBoolean(false);
    private static AtomicInteger sSequenceGenerator = new AtomicInteger();
    protected final AtomicBoolean mCanceled = new AtomicBoolean(false);
    public final String mName;
    public final Priority mPriority;
    private int mSequence;
    protected final AtomicBoolean mStarted = new AtomicBoolean(false);

    public enum Priority {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    public boolean needTryLocal() {
        return false;
    }

    public void run() {
    }

    public boolean run4Local() {
        return false;
    }

    public void cancel() {
        this.mCanceled.compareAndSet(false, true);
    }

    public boolean isCanceled() {
        return this.mCanceled.get();
    }

    public final void start() {
        if (this.mStarted.compareAndSet(false, true)) {
            this.mSequence = sSequenceGenerator.incrementAndGet();
            if (sQueueStarted.compareAndSet(false, true)) {
                sQueue.mo27020a();
            }
            sQueue.mo27021a(this);
        }
    }

    public int compareTo(ApiThread apiThread) {
        Priority priority = this.mPriority;
        Priority priority2 = apiThread.mPriority;
        if (priority == null) {
            priority = Priority.NORMAL;
        }
        if (priority2 == null) {
            priority2 = Priority.NORMAL;
        }
        if (priority == priority2) {
            return this.mSequence - apiThread.mSequence;
        }
        return priority2.ordinal() - priority.ordinal();
    }

    protected ApiThread(String str, Priority priority) {
        this.mPriority = priority;
        if (C6319n.m19593a(str)) {
            str = getClass().getSimpleName();
        }
        this.mName = str;
    }
}
