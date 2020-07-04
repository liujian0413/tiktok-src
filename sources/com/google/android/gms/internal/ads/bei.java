package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

final class bei {
    /* renamed from: a */
    static ExecutorService m48547a(ThreadFactory threadFactory) {
        return Executors.newCachedThreadPool(threadFactory);
    }
}
