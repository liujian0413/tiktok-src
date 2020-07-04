package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C15017a.C15019b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C15133d.C15134a;
import com.google.android.gms.tasks.C17058g;

/* renamed from: com.google.android.gms.common.api.internal.cb */
public final class C15108cb<ResultT> extends C15090bm {

    /* renamed from: a */
    private final C15147n<C15019b, ResultT> f39061a;

    /* renamed from: b */
    private final C17058g<ResultT> f39062b;

    /* renamed from: c */
    private final C15145l f39063c;

    public C15108cb(int i, C15147n<C15019b, ResultT> nVar, C17058g<ResultT> gVar, C15145l lVar) {
        super(i);
        this.f39062b = gVar;
        this.f39061a = nVar;
        this.f39063c = lVar;
    }

    /* renamed from: a */
    public final void mo38305a(C15134a<?> aVar) throws DeadObjectException {
        try {
            this.f39061a.mo38435a(aVar.f39159a, this.f39062b);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            mo38304a(C15065ap.m43714b(e2));
        } catch (RuntimeException e3) {
            mo38307a(e3);
        }
    }

    /* renamed from: a */
    public final void mo38304a(Status status) {
        this.f39062b.mo44300b(this.f39063c.mo38284a(status));
    }

    /* renamed from: a */
    public final void mo38307a(RuntimeException runtimeException) {
        this.f39062b.mo44300b((Exception) runtimeException);
    }

    /* renamed from: a */
    public final void mo38306a(C15150q qVar, boolean z) {
        qVar.mo38438a(this.f39062b, z);
    }

    /* renamed from: b */
    public final Feature[] mo38346b(C15134a<?> aVar) {
        return this.f39061a.f39194a;
    }

    /* renamed from: c */
    public final boolean mo38347c(C15134a<?> aVar) {
        return this.f39061a.f39195b;
    }
}
