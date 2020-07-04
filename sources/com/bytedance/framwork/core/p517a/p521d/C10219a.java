package com.bytedance.framwork.core.p517a.p521d;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.bytedance.framwork.core.a.d.a */
public final class C10219a {

    /* renamed from: c */
    public static long f27802c = 30000;

    /* renamed from: a */
    public C10223b f27803a;

    /* renamed from: b */
    public volatile boolean f27804b;

    /* renamed from: d */
    CopyOnWriteArraySet<C10222b> f27805d;

    /* renamed from: e */
    private final Runnable f27806e;

    /* renamed from: com.bytedance.framwork.core.a.d.a$a */
    static final class C10221a {

        /* renamed from: a */
        static final C10219a f27808a = new C10219a();
    }

    /* renamed from: com.bytedance.framwork.core.a.d.a$b */
    public interface C10222b {
        void onTimeEvent(long j);
    }

    /* renamed from: a */
    public static C10219a m30335a() {
        return C10221a.f27808a;
    }

    private C10219a() {
        this.f27804b = true;
        this.f27806e = new Runnable() {
            public final void run() {
                Iterator it = C10219a.this.f27805d.iterator();
                while (it.hasNext()) {
                    ((C10222b) it.next()).onTimeEvent(System.currentTimeMillis());
                }
                if (C10219a.this.f27804b) {
                    C10219a.this.f27803a.mo24936a((Runnable) this, C10219a.f27802c);
                }
            }
        };
        this.f27805d = new CopyOnWriteArraySet<>();
        this.f27803a = new C10223b("AsyncEventManager-Thread");
        this.f27803a.mo24934a();
    }

    /* renamed from: a */
    public final void mo24932a(Runnable runnable) {
        this.f27803a.mo24935a(runnable);
    }

    /* renamed from: a */
    public final void mo24931a(C10222b bVar) {
        try {
            this.f27805d.add(bVar);
            if (this.f27804b) {
                this.f27803a.mo24937b(this.f27806e);
                this.f27803a.mo24936a(this.f27806e, f27802c);
            }
        } catch (Throwable unused) {
        }
    }
}
