package com.google.android.play.core.splitinstall;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.C17100ai;
import com.google.android.play.core.tasks.C17157l;
import java.util.List;

/* renamed from: com.google.android.play.core.splitinstall.k */
class C17141k<T> extends C17100ai {

    /* renamed from: a */
    final C17157l<T> f47862a;

    /* renamed from: b */
    private final /* synthetic */ C17125ab f47863b;

    C17141k(C17125ab abVar, C17157l<T> lVar) {
        this.f47863b = abVar;
        this.f47862a = lVar;
    }

    /* renamed from: a */
    public final void mo44340a() throws RemoteException {
        this.f47863b.f47840a.mo44386a();
        C17125ab.f47838b.mo15889a("onGetSplitsForAppUpdate", new Object[0]);
    }

    /* renamed from: a */
    public final void mo44341a(int i) throws RemoteException {
        this.f47863b.f47840a.mo44386a();
        C17125ab.f47838b.mo15889a("onCompleteInstall(%d)", Integer.valueOf(i));
    }

    /* renamed from: a */
    public void mo44342a(int i, Bundle bundle) throws RemoteException {
        this.f47863b.f47840a.mo44386a();
        C17125ab.f47838b.mo15889a("onStartInstall(%d)", Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo44343a(Bundle bundle) throws RemoteException {
        this.f47863b.f47840a.mo44386a();
        int i = bundle.getInt("error_code");
        C17125ab.f47838b.mo15893d("onError(%d)", Integer.valueOf(i));
        this.f47862a.mo44428a((Exception) new SplitInstallException(i));
    }

    /* renamed from: a */
    public final void mo44344a(List<Bundle> list) throws RemoteException {
        this.f47863b.f47840a.mo44386a();
        C17125ab.f47838b.mo15889a("onGetSessionStates", new Object[0]);
    }

    /* renamed from: b */
    public final void mo44345b() throws RemoteException {
        this.f47863b.f47840a.mo44386a();
        C17125ab.f47838b.mo15889a("onCompleteInstallForAppUpdate", new Object[0]);
    }

    /* renamed from: b */
    public void mo44346b(int i, Bundle bundle) throws RemoteException {
        this.f47863b.f47840a.mo44386a();
        C17125ab.f47838b.mo15889a("onCancelInstall(%d)", Integer.valueOf(i));
    }

    /* renamed from: b */
    public final void mo44347b(Bundle bundle) throws RemoteException {
        this.f47863b.f47840a.mo44386a();
        C17125ab.f47838b.mo15889a("onDeferredUninstall", new Object[0]);
    }

    /* renamed from: c */
    public void mo44348c(int i, Bundle bundle) throws RemoteException {
        this.f47863b.f47840a.mo44386a();
        C17125ab.f47838b.mo15889a("onGetSession(%d)", Integer.valueOf(i));
    }

    /* renamed from: c */
    public void mo44349c(Bundle bundle) throws RemoteException {
        this.f47863b.f47840a.mo44386a();
        C17125ab.f47838b.mo15889a("onDeferredInstall", new Object[0]);
    }

    /* renamed from: d */
    public final void mo44350d(Bundle bundle) throws RemoteException {
        this.f47863b.f47840a.mo44386a();
        C17125ab.f47838b.mo15889a("onDeferredLanguageInstall", new Object[0]);
    }

    /* renamed from: e */
    public final void mo44351e(Bundle bundle) throws RemoteException {
        this.f47863b.f47840a.mo44386a();
        C17125ab.f47838b.mo15889a("onDeferredLanguageUninstall", new Object[0]);
    }
}
