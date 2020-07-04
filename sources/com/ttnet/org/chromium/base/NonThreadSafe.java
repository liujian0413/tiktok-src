package com.ttnet.org.chromium.base;

public class NonThreadSafe {
    private Long mThreadId;

    public NonThreadSafe() {
        ensureThreadIdAssigned();
    }

    public synchronized void detachFromThread() {
        this.mThreadId = null;
    }

    private void ensureThreadIdAssigned() {
        if (this.mThreadId == null) {
            this.mThreadId = Long.valueOf(Thread.currentThread().getId());
        }
    }

    public synchronized boolean calledOnValidThread() {
        ensureThreadIdAssigned();
        return this.mThreadId.equals(Long.valueOf(Thread.currentThread().getId()));
    }
}
