package com.bytedance.ies.util.thread.p581a;

import android.os.Process;
import com.bytedance.common.utility.C6312h;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.p254b.C6304f;
import com.bytedance.ies.util.thread.ApiThread;
import com.bytedance.ies.util.thread.ApiThread.Priority;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.bytedance.ies.util.thread.a.b */
final class C11085b extends Thread {

    /* renamed from: a */
    private final BlockingQueue<ApiThread> f30144a;

    /* renamed from: b */
    private final BlockingQueue<ApiThread> f30145b;

    /* renamed from: c */
    private volatile boolean f30146c;

    /* renamed from: a */
    public final void mo27018a() {
        this.f30146c = true;
        interrupt();
    }

    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                ApiThread apiThread = (ApiThread) this.f30144a.take();
                String name = Thread.currentThread().getName();
                String str = apiThread.mName;
                try {
                    if (!apiThread.isCanceled()) {
                        if (!C6319n.m19593a(str) && !C6319n.m19593a(name)) {
                            Thread currentThread = Thread.currentThread();
                            StringBuilder sb = new StringBuilder("ApiLocalDispatcher-");
                            sb.append(str);
                            currentThread.setName(sb.toString());
                        }
                        if (C6312h.m19578b()) {
                            this.f30144a.size();
                            this.f30145b.size();
                        }
                        if (!apiThread.run4Local()) {
                            if (apiThread.mPriority == Priority.IMMEDIATE) {
                                C6304f.submitRunnable(apiThread);
                            } else {
                                this.f30145b.add(apiThread);
                            }
                        }
                        if (!C6319n.m19593a(str) && !C6319n.m19593a(name)) {
                            Thread.currentThread().setName(name);
                        }
                    }
                } catch (Throwable unused) {
                }
            } catch (InterruptedException unused2) {
                if (this.f30146c) {
                    return;
                }
            }
        }
    }

    public C11085b(BlockingQueue<ApiThread> blockingQueue, BlockingQueue<ApiThread> blockingQueue2) {
        super("ApiLocalDispatcher-Thread");
        this.f30144a = blockingQueue;
        this.f30145b = blockingQueue2;
    }
}
