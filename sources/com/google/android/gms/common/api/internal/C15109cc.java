package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C15133d.C15134a;
import com.google.android.gms.common.api.internal.C15140h.C15141a;
import com.google.android.gms.tasks.C17058g;

/* renamed from: com.google.android.gms.common.api.internal.cc */
public final class C15109cc extends C15103bz<Boolean> {

    /* renamed from: b */
    private final C15141a<?> f39064b;

    public C15109cc(C15141a<?> aVar, C17058g<Boolean> gVar) {
        super(4, gVar);
        this.f39064b = aVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo38306a(C15150q qVar, boolean z) {
    }

    /* renamed from: d */
    public final void mo38362d(C15134a<?> aVar) throws RemoteException {
        C15089bl blVar = (C15089bl) aVar.f39160b.remove(this.f39064b);
        if (blVar != null) {
            blVar.f39025a.mo38434a();
        } else {
            this.f39057a.mo44301b(Boolean.valueOf(false));
        }
    }

    /* renamed from: b */
    public final Feature[] mo38346b(C15134a<?> aVar) {
        C15089bl blVar = (C15089bl) aVar.f39160b.get(this.f39064b);
        if (blVar == null) {
            return null;
        }
        return blVar.f39025a.f39191a;
    }

    /* renamed from: c */
    public final boolean mo38347c(C15134a<?> aVar) {
        C15089bl blVar = (C15089bl) aVar.f39160b.get(this.f39064b);
        return blVar != null && blVar.f39025a.f39192b;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo38307a(RuntimeException runtimeException) {
        super.mo38307a(runtimeException);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo38304a(Status status) {
        super.mo38304a(status);
    }
}
