package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.aj */
abstract class C15059aj implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C15159z f38950a;

    private C15059aj(C15159z zVar) {
        this.f38950a = zVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo38287a();

    public void run() {
        this.f38950a.f39214b.lock();
        try {
            if (!Thread.interrupted()) {
                mo38287a();
                this.f38950a.f39214b.unlock();
            }
        } catch (RuntimeException e) {
            this.f38950a.f39213a.mo38315a(e);
        } finally {
            this.f38950a.f39214b.unlock();
        }
    }

    /* synthetic */ C15059aj(C15159z zVar, C15050aa aaVar) {
        this(zVar);
    }
}
