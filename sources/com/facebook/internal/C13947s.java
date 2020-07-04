package com.facebook.internal;

import com.facebook.C13499h;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;

/* renamed from: com.facebook.internal.s */
public final class C13947s<T> {

    /* renamed from: a */
    public T f36903a;

    /* renamed from: b */
    public CountDownLatch f36904b = new CountDownLatch(1);

    /* renamed from: a */
    public final T mo33600a() {
        m41125b();
        return this.f36903a;
    }

    /* renamed from: b */
    private void m41125b() {
        if (this.f36904b != null) {
            try {
                this.f36904b.await();
            } catch (InterruptedException unused) {
            }
        }
    }

    public C13947s(final Callable<T> callable) {
        C13499h.m39719e().execute(new FutureTask(new Callable<Void>() {
            /* JADX INFO: finally extract failed */
            /* access modifiers changed from: private */
            /* renamed from: a */
            public Void call() throws Exception {
                try {
                    C13947s.this.f36903a = callable.call();
                    C13947s.this.f36904b.countDown();
                    return null;
                } catch (Throwable th) {
                    C13947s.this.f36904b.countDown();
                    throw th;
                }
            }
        }));
    }
}
