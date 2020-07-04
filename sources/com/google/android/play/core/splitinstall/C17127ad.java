package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.play.core.internal.C17097af;
import com.google.android.play.core.internal.C17113bd;
import com.google.android.play.core.tasks.C17157l;
import java.util.List;

/* renamed from: com.google.android.play.core.splitinstall.ad */
final class C17127ad extends C17113bd {

    /* renamed from: b */
    private final /* synthetic */ List f47848b;

    /* renamed from: c */
    private final /* synthetic */ C17157l f47849c;

    /* renamed from: d */
    private final /* synthetic */ C17125ab f47850d;

    C17127ad(C17125ab abVar, C17157l lVar, List list, C17157l lVar2) {
        this.f47850d = abVar;
        this.f47848b = list;
        this.f47849c = lVar2;
        super(lVar);
    }

    /* renamed from: a */
    public final void mo44331a() {
        try {
            ((C17097af) this.f47850d.f47840a.f47815a).mo44339b(this.f47850d.f47842e, C17125ab.m56768d(this.f47848b), C17125ab.m56767d(), new C17130ag(this.f47850d, this.f47849c));
        } catch (RemoteException e) {
            C17125ab.f47838b.mo15890a((Throwable) e, "deferredInstall(%s)", this.f47848b);
            this.f47849c.mo44428a((Exception) new RuntimeException(e));
        }
    }
}
