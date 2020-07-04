package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C15037d;
import com.google.android.gms.common.api.C15044g;

/* renamed from: com.google.android.gms.common.api.internal.bu */
final class C15098bu implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C15044g f39048a;

    /* renamed from: b */
    private final /* synthetic */ C15097bt f39049b;

    C15098bu(C15097bt btVar, C15044g gVar) {
        this.f39049b = btVar;
        this.f39048a = gVar;
    }

    public final void run() {
        try {
            BasePendingResult.f38917c.set(Boolean.valueOf(true));
            this.f39049b.f39046h.sendMessage(this.f39049b.f39046h.obtainMessage(0, this.f39049b.f39039a.mo38445a(this.f39048a)));
            BasePendingResult.f38917c.set(Boolean.valueOf(false));
            C15097bt.m43805b(this.f39048a);
            C15037d dVar = (C15037d) this.f39049b.f39045g.get();
            if (dVar != null) {
                dVar.mo38241b(this.f39049b);
            }
        } catch (RuntimeException e) {
            this.f39049b.f39046h.sendMessage(this.f39049b.f39046h.obtainMessage(1, e));
            BasePendingResult.f38917c.set(Boolean.valueOf(false));
            C15097bt.m43805b(this.f39048a);
            C15037d dVar2 = (C15037d) this.f39049b.f39045g.get();
            if (dVar2 != null) {
                dVar2.mo38241b(this.f39049b);
            }
        } catch (Throwable th) {
            BasePendingResult.f38917c.set(Boolean.valueOf(false));
            C15097bt.m43805b(this.f39048a);
            C15037d dVar3 = (C15037d) this.f39049b.f39045g.get();
            if (dVar3 != null) {
                dVar3.mo38241b(this.f39049b);
            }
            throw th;
        }
    }
}
