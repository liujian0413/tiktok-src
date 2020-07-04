package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.av */
abstract class C15071av {

    /* renamed from: a */
    private final C15069at f39004a;

    protected C15071av(C15069at atVar) {
        this.f39004a = atVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo38288a();

    /* renamed from: a */
    public final void mo38325a(C15070au auVar) {
        auVar.f38994f.lock();
        try {
            if (auVar.f39002n == this.f39004a) {
                mo38288a();
                auVar.f38994f.unlock();
            }
        } finally {
            auVar.f38994f.unlock();
        }
    }
}
