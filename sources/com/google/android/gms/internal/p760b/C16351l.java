package com.google.android.gms.internal.p760b;

import android.os.RemoteException;
import com.google.android.gms.common.api.C15017a.C15019b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C15147n;
import com.google.android.gms.common.api.internal.C15148o;
import com.google.android.gms.tasks.C17058g;

/* renamed from: com.google.android.gms.internal.b.l */
abstract class C16351l extends C15147n<C16347h, Void> {

    /* renamed from: c */
    private C17058g<Void> f45837c;

    private C16351l() {
    }

    /* synthetic */ C16351l(C16349j jVar) {
        this();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo42439a(Status status) {
        C15148o.m44053a(status, this.f45837c);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo38435a(C15019b bVar, C17058g gVar) throws RemoteException {
        C16347h hVar = (C16347h) bVar;
        this.f45837c = gVar;
        mo42438a((C16343d) hVar.mo38568o());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo42438a(C16343d dVar) throws RemoteException;
}
