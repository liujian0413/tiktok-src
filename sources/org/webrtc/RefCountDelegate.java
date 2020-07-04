package org.webrtc;

import java.util.concurrent.atomic.AtomicInteger;

class RefCountDelegate implements RefCounted {
    private final AtomicInteger refCount = new AtomicInteger(1);
    private final Runnable releaseCallback;

    public void retain() {
        this.refCount.incrementAndGet();
    }

    public void release() {
        if (this.refCount.decrementAndGet() == 0 && this.releaseCallback != null) {
            this.releaseCallback.run();
        }
    }

    public RefCountDelegate(Runnable runnable) {
        this.releaseCallback = runnable;
    }
}
