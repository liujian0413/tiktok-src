package com.p280ss.android.ugc.effectmanager;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.ss.android.ugc.effectmanager.i */
final class C43844i {
    /* renamed from: a */
    static ExecutorService m138861a(ThreadFactory threadFactory) {
        return Executors.newCachedThreadPool(threadFactory);
    }
}
