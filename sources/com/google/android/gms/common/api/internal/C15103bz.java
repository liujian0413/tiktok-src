package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C15133d.C15134a;
import com.google.android.gms.tasks.C17058g;

/* renamed from: com.google.android.gms.common.api.internal.bz */
abstract class C15103bz<T> extends C15090bm {

    /* renamed from: a */
    protected final C17058g<T> f39057a;

    public C15103bz(int i, C17058g<T> gVar) {
        super(4);
        this.f39057a = gVar;
    }

    /* renamed from: a */
    public void mo38306a(C15150q qVar, boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo38362d(C15134a<?> aVar) throws RemoteException;

    /* renamed from: a */
    public void mo38304a(Status status) {
        this.f39057a.mo44300b((Exception) new ApiException(status));
    }

    /* renamed from: a */
    public void mo38307a(RuntimeException runtimeException) {
        this.f39057a.mo44300b((Exception) runtimeException);
    }

    /* renamed from: a */
    public final void mo38305a(C15134a<?> aVar) throws DeadObjectException {
        try {
            mo38362d(aVar);
        } catch (DeadObjectException e) {
            mo38304a(C15065ap.m43714b(e));
            throw e;
        } catch (RemoteException e2) {
            mo38304a(C15065ap.m43714b(e2));
        } catch (RuntimeException e3) {
            mo38307a(e3);
        }
    }
}
