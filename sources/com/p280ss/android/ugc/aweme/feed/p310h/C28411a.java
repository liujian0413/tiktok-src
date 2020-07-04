package com.p280ss.android.ugc.aweme.feed.p310h;

import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.p280ss.android.ugc.aweme.thread.C7265m;
import com.p280ss.android.ugc.aweme.thread.ThreadPoolType;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.h.a */
public final class C28411a {

    /* renamed from: a */
    public static final C28411a f74859a = new C28411a();

    /* renamed from: b */
    private static ExecutorService f74860b;

    /* renamed from: c */
    private static ReentrantLock f74861c = new ReentrantLock();

    private C28411a() {
    }

    /* renamed from: a */
    public static ExecutorService m93380a() {
        if (f74860b == null) {
            f74861c.lock();
            try {
                if (f74860b == null) {
                    f74860b = C7258h.m22724a(C7265m.m22758a(ThreadPoolType.SERIAL).mo18996a());
                }
            } finally {
                f74861c.unlock();
            }
        }
        ExecutorService executorService = f74860b;
        if (executorService == null) {
            C7573i.m23580a();
        }
        return executorService;
    }
}
