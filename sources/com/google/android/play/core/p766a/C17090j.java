package com.google.android.play.core.p766a;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.install.InstallException;
import com.google.android.play.core.internal.C6525f;
import com.google.android.play.core.tasks.C17157l;

/* renamed from: com.google.android.play.core.a.j */
final class C17090j extends C17091k<Void> {
    C17090j(C17087g gVar, C17157l<Void> lVar) {
        super(gVar, new C6525f("OnCompleteUpdateCallback"), lVar);
    }

    /* renamed from: a */
    public final void mo44332a(Bundle bundle) throws RemoteException {
        super.mo44332a(bundle);
        if (C17087g.m56673b(bundle) != 0) {
            this.f47794a.mo44428a((Exception) new InstallException(C17087g.m56673b(bundle)));
        } else {
            this.f47794a.mo44429a(null);
        }
    }
}
