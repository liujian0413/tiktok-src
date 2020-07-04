package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.play.core.internal.C17097af;
import com.google.android.play.core.internal.C17098ag;
import com.google.android.play.core.internal.C17113bd;
import com.google.android.play.core.tasks.C17157l;

/* renamed from: com.google.android.play.core.splitinstall.af */
final class C17129af extends C17113bd {

    /* renamed from: b */
    private final /* synthetic */ int f47854b;

    /* renamed from: c */
    private final /* synthetic */ C17157l f47855c;

    /* renamed from: d */
    private final /* synthetic */ C17125ab f47856d;

    C17129af(C17125ab abVar, C17157l lVar, int i, C17157l lVar2) {
        this.f47856d = abVar;
        this.f47854b = i;
        this.f47855c = lVar2;
        super(lVar);
    }

    /* renamed from: a */
    public final void mo44331a() {
        try {
            ((C17097af) this.f47856d.f47840a.f47815a).mo44336a(this.f47856d.f47842e, this.f47854b, C17125ab.m56767d(), (C17098ag) new C17131ah(this.f47856d, this.f47855c));
        } catch (RemoteException e) {
            C17125ab.f47838b.mo15890a((Throwable) e, "cancelInstall(%d)", Integer.valueOf(this.f47854b));
            this.f47855c.mo44428a((Exception) new RuntimeException(e));
        }
    }
}
