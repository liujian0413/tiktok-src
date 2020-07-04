package com.google.android.play.core.internal;

import com.google.android.play.core.tasks.C17157l;

/* renamed from: com.google.android.play.core.internal.bd */
public abstract class C17113bd implements Runnable {

    /* renamed from: a */
    public final C17157l<?> f47826a;

    C17113bd() {
    }

    public C17113bd(C17157l<?> lVar) {
        this.f47826a = lVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo44331a();

    public final void run() {
        try {
            mo44331a();
        } catch (Exception e) {
            if (this.f47826a != null) {
                this.f47826a.mo44428a(e);
            }
        }
    }
}
