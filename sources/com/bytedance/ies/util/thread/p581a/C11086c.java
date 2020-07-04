package com.bytedance.ies.util.thread.p581a;

import com.bytedance.common.utility.p254b.C6304f;
import com.bytedance.ies.util.thread.ApiThread;
import com.bytedance.ies.util.thread.ApiThread.Priority;
import java.util.concurrent.PriorityBlockingQueue;

/* renamed from: com.bytedance.ies.util.thread.a.c */
public final class C11086c {

    /* renamed from: a */
    private volatile boolean f30147a;

    /* renamed from: b */
    private final PriorityBlockingQueue<ApiThread> f30148b;

    /* renamed from: c */
    private final PriorityBlockingQueue<ApiThread> f30149c;

    /* renamed from: d */
    private C11084a[] f30150d;

    /* renamed from: e */
    private C11085b f30151e;

    public C11086c() {
        this(4);
    }

    /* renamed from: b */
    private synchronized void m32472b() {
        this.f30147a = false;
        if (this.f30151e != null) {
            this.f30151e.mo27018a();
        }
        for (int i = 0; i < this.f30150d.length; i++) {
            if (this.f30150d[i] != null) {
                this.f30150d[i].mo27016a();
                this.f30150d[i] = null;
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo27020a() {
        m32472b();
        this.f30151e = new C11085b(this.f30148b, this.f30149c);
        this.f30151e.start();
        for (int i = 0; i < this.f30150d.length; i++) {
            C11084a aVar = new C11084a(this.f30149c);
            this.f30150d[i] = aVar;
            aVar.start();
        }
        this.f30147a = true;
    }

    private C11086c(int i) {
        this.f30148b = new PriorityBlockingQueue<>();
        this.f30149c = new PriorityBlockingQueue<>();
        this.f30150d = new C11084a[4];
    }

    /* renamed from: a */
    public final synchronized void mo27021a(ApiThread apiThread) {
        if (apiThread.needTryLocal()) {
            this.f30148b.add(apiThread);
        } else if (apiThread.mPriority == Priority.IMMEDIATE) {
            C6304f.submitRunnable(apiThread);
        } else {
            this.f30149c.add(apiThread);
        }
        boolean z = this.f30147a;
    }
}
