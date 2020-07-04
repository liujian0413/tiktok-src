package com.bytedance.sdk.account.network.dispatcher;

import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.sdk.account.network.dispatcher.a */
class C12899a extends Thread implements C6310a {

    /* renamed from: a */
    protected static C12903e f34085a = C12903e.m37565a();

    /* renamed from: b */
    protected static final AtomicInteger f34086b = new AtomicInteger();

    /* renamed from: c */
    protected C6309f f34087c;

    /* renamed from: d */
    private final BlockingQueue<IRequest> f34088d;

    /* renamed from: e */
    private volatile boolean f34089e;

    /* renamed from: f */
    private volatile boolean f34090f;

    /* renamed from: g */
    private String f34091g;

    /* renamed from: b */
    public boolean mo31371b() {
        return this.f34090f;
    }

    /* renamed from: a */
    public void mo31369a() {
        this.f34089e = true;
        interrupt();
    }

    /* renamed from: d */
    public void mo31373d() {
        this.f34087c.removeMessages(0);
    }

    /* renamed from: c */
    public void mo31372c() {
        mo31373d();
        this.f34087c.sendEmptyMessageDelayed(0, 2000);
    }

    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                IRequest iRequest = (IRequest) this.f34088d.take();
                mo31373d();
                if (iRequest != null && (iRequest instanceof C12901c)) {
                    m37543b((C12901c) iRequest);
                }
            } catch (InterruptedException unused) {
                if (this.f34089e) {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo31370a(C12901c cVar) {
        if (cVar != null) {
            cVar.mo31383g();
        }
    }

    public void handleMsg(Message message) {
        if (message != null) {
            try {
                if (message.what == 0) {
                    f34085a.mo31388d();
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    private void m37543b(C12901c cVar) {
        String str;
        String str2;
        try {
            this.f34090f = true;
            mo31370a(cVar);
            if (cVar.mo31378a()) {
                this.f34090f = false;
                return;
            }
            str2 = Thread.currentThread().getName();
            try {
                str = cVar.f34098c;
                try {
                    if (!C6319n.m19593a(str) && !C6319n.m19593a(str2)) {
                        Thread.currentThread().setName(str);
                    }
                    cVar.run();
                    mo31372c();
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                str = null;
            }
            this.f34090f = false;
            if (!C6319n.m19593a(str) && !C6319n.m19593a(str2)) {
                Thread.currentThread().setName(str2);
            }
        } catch (Throwable unused3) {
            str2 = null;
            str = null;
        }
    }

    public C12899a(BlockingQueue<IRequest> blockingQueue, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = "ApiDispatcher-Thread";
        }
        super(str);
        this.f34087c = new C6309f(Looper.getMainLooper(), this);
        this.f34089e = false;
        this.f34090f = false;
        this.f34091g = "ApiDispatcher";
        this.f34088d = blockingQueue;
        this.f34091g = str2;
    }
}
