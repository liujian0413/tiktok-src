package com.google.android.play.core.p766a;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.install.InstallException;
import com.google.android.play.core.internal.C6525f;
import com.google.android.play.core.tasks.C17157l;

/* renamed from: com.google.android.play.core.a.l */
final class C17092l extends C17091k<C17081a> {

    /* renamed from: b */
    private final String f47797b;

    C17092l(C17087g gVar, C17157l<C17081a> lVar, String str) {
        super(gVar, new C6525f("OnRequestInstallCallback"), lVar);
        this.f47797b = str;
    }

    /* renamed from: b */
    public final void mo44333b(Bundle bundle) throws RemoteException {
        super.mo44333b(bundle);
        if (C17087g.m56673b(bundle) == 0 || C17087g.m56673b(bundle) == 1) {
            this.f47794a.mo44429a(C17087g.m56675b(bundle, this.f47797b));
        } else {
            this.f47794a.mo44428a((Exception) new InstallException(C17087g.m56673b(bundle)));
        }
    }
}
