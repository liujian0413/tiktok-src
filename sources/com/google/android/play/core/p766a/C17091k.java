package com.google.android.play.core.p766a;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.C17110az;
import com.google.android.play.core.internal.C6525f;
import com.google.android.play.core.tasks.C17157l;

/* renamed from: com.google.android.play.core.a.k */
class C17091k<T> extends C17110az {

    /* renamed from: a */
    final C17157l<T> f47794a;

    /* renamed from: b */
    private final C6525f f47795b;

    /* renamed from: c */
    private final /* synthetic */ C17087g f47796c;

    C17091k(C17087g gVar, C6525f fVar, C17157l<T> lVar) {
        this.f47796c = gVar;
        this.f47795b = fVar;
        this.f47794a = lVar;
    }

    /* renamed from: a */
    public void mo44332a(Bundle bundle) throws RemoteException {
        this.f47796c.f47785a.mo44386a();
        this.f47795b.mo15889a("onCompleteUpdate", new Object[0]);
    }

    /* renamed from: b */
    public void mo44333b(Bundle bundle) throws RemoteException {
        this.f47796c.f47785a.mo44386a();
        this.f47795b.mo15889a("onRequestInfo", new Object[0]);
    }
}
