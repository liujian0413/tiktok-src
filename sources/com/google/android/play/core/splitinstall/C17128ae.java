package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.play.core.internal.C17097af;
import com.google.android.play.core.internal.C17113bd;
import com.google.android.play.core.tasks.C17157l;

/* renamed from: com.google.android.play.core.splitinstall.ae */
final class C17128ae extends C17113bd {

    /* renamed from: b */
    private final /* synthetic */ int f47851b;

    /* renamed from: c */
    private final /* synthetic */ C17157l f47852c;

    /* renamed from: d */
    private final /* synthetic */ C17125ab f47853d;

    C17128ae(C17125ab abVar, C17157l lVar, int i, C17157l lVar2) {
        this.f47853d = abVar;
        this.f47851b = i;
        this.f47852c = lVar2;
        super(lVar);
    }

    /* renamed from: a */
    public final void mo44331a() {
        try {
            ((C17097af) this.f47853d.f47840a.f47815a).mo44337a(this.f47853d.f47842e, this.f47851b, new C17139i(this.f47853d, this.f47852c));
        } catch (RemoteException e) {
            C17125ab.f47838b.mo15890a((Throwable) e, "getSessionState(%d)", Integer.valueOf(this.f47851b));
            this.f47852c.mo44428a((Exception) new RuntimeException(e));
        }
    }
}
