package com.bytedance.sdk.account.network.dispatcher;

import android.os.Process;
import com.bytedance.common.utility.C6312h;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.p254b.C6304f;
import com.bytedance.sdk.account.network.dispatcher.IRequest.Priority;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.bytedance.sdk.account.network.dispatcher.b */
final class C12900b extends Thread {

    /* renamed from: a */
    private final BlockingQueue<IRequest> f34092a;

    /* renamed from: b */
    private final BlockingQueue<IRequest> f34093b;

    /* renamed from: c */
    private volatile boolean f34094c;

    /* renamed from: a */
    public final void mo31375a() {
        this.f34094c = true;
        interrupt();
    }

    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                IRequest iRequest = (IRequest) this.f34092a.take();
                C12901c cVar = null;
                if (iRequest instanceof C12901c) {
                    cVar = (C12901c) iRequest;
                }
                if (cVar != null) {
                    String name = Thread.currentThread().getName();
                    String str = cVar.f34098c;
                    try {
                        if (!cVar.mo31378a()) {
                            if (!C6319n.m19593a(str) && !C6319n.m19593a(name)) {
                                Thread currentThread = Thread.currentThread();
                                StringBuilder sb = new StringBuilder("ApiLocalDispatcher-");
                                sb.append(str);
                                currentThread.setName(sb.toString());
                            }
                            if (C6312h.m19578b()) {
                                this.f34092a.size();
                                this.f34093b.size();
                            }
                            if (cVar.mo31367d() == Priority.IMMEDIATE) {
                                C6304f.submitRunnable(cVar);
                            } else {
                                cVar.mo31382f();
                                this.f34093b.add(cVar);
                            }
                            if (!C6319n.m19593a(str) && !C6319n.m19593a(name)) {
                                Thread.currentThread().setName(name);
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
            } catch (InterruptedException unused2) {
                if (this.f34094c) {
                    return;
                }
            }
        }
    }

    public C12900b(BlockingQueue<IRequest> blockingQueue, BlockingQueue<IRequest> blockingQueue2) {
        super("ApiLocalDispatcher-Thread");
        this.f34092a = blockingQueue;
        this.f34093b = blockingQueue2;
    }
}
