package com.p280ss.android.ugc.aweme.feed.cache;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

/* renamed from: com.ss.android.ugc.aweme.feed.cache.b */
public final class C28274b {
    /* renamed from: c */
    public static void m92985c(Lock lock) {
        if (lock != null) {
            try {
                lock.unlock();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m92983a(Lock lock) {
        if (lock != null) {
            return lock.tryLock();
        }
        return false;
    }

    /* renamed from: b */
    public static void m92984b(Lock lock) {
        if (lock != null) {
            try {
                lock.tryLock(1000, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
            }
        }
    }
}
