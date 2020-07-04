package com.bytedance.ies.util.thread.p581a;

import android.os.Process;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.util.thread.ApiThread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.ies.util.thread.a.a */
final class C11084a extends Thread {

    /* renamed from: a */
    protected static final AtomicInteger f30141a = new AtomicInteger();

    /* renamed from: b */
    private final BlockingQueue<ApiThread> f30142b;

    /* renamed from: c */
    private volatile boolean f30143c;

    /* renamed from: a */
    public final void mo27016a() {
        this.f30143c = true;
        interrupt();
    }

    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                ApiThread apiThread = (ApiThread) this.f30142b.take();
                String name = Thread.currentThread().getName();
                String str = apiThread.mName;
                try {
                    if (!apiThread.isCanceled()) {
                        if (!C6319n.m19593a(str) && !C6319n.m19593a(name)) {
                            Thread.currentThread().setName(str);
                        }
                        apiThread.run();
                        if (!C6319n.m19593a(str) && !C6319n.m19593a(name)) {
                            Thread.currentThread().setName(name);
                        }
                    }
                } catch (Throwable unused) {
                }
            } catch (InterruptedException unused2) {
                if (this.f30143c) {
                    return;
                }
            }
        }
    }

    public C11084a(BlockingQueue<ApiThread> blockingQueue) {
        super("ApiDispatcher-Thread");
        this.f30142b = blockingQueue;
    }
}
