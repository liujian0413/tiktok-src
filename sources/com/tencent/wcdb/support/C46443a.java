package com.tencent.wcdb.support;

/* renamed from: com.tencent.wcdb.support.a */
public final class C46443a {

    /* renamed from: a */
    private boolean f119646a;

    /* renamed from: b */
    private C46444a f119647b;

    /* renamed from: c */
    private boolean f119648c;

    /* renamed from: com.tencent.wcdb.support.a$a */
    public interface C46444a {
        /* renamed from: b */
        void mo115436b();
    }

    /* renamed from: b */
    private boolean m146016b() {
        boolean z;
        synchronized (this) {
            z = this.f119646a;
        }
        return z;
    }

    /* renamed from: c */
    private void m146017c() {
        while (this.f119648c) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo115546a() {
        if (m146016b()) {
            throw new OperationCanceledException();
        }
    }

    /* renamed from: a */
    public final void mo115547a(C46444a aVar) {
        synchronized (this) {
            m146017c();
            if (this.f119647b != aVar) {
                this.f119647b = aVar;
                if (this.f119646a) {
                    if (aVar != null) {
                        aVar.mo115436b();
                    }
                }
            }
        }
    }
}
