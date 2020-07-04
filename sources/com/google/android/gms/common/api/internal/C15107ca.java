package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import com.google.android.gms.common.api.C15017a.C15019b;
import com.google.android.gms.common.api.C15044g;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C15104c.C15105a;
import com.google.android.gms.common.api.internal.C15133d.C15134a;

/* renamed from: com.google.android.gms.common.api.internal.ca */
public final class C15107ca<A extends C15105a<? extends C15044g, C15019b>> extends C15065ap {

    /* renamed from: a */
    private final A f39060a;

    public C15107ca(int i, A a) {
        super(i);
        this.f39060a = a;
    }

    /* renamed from: a */
    public final void mo38305a(C15134a<?> aVar) throws DeadObjectException {
        try {
            this.f39060a.mo38365b(aVar.f39159a);
        } catch (RuntimeException e) {
            mo38307a(e);
        }
    }

    /* renamed from: a */
    public final void mo38304a(Status status) {
        this.f39060a.mo38364b(status);
    }

    /* renamed from: a */
    public final void mo38307a(RuntimeException runtimeException) {
        String simpleName = runtimeException.getClass().getSimpleName();
        String localizedMessage = runtimeException.getLocalizedMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 2 + String.valueOf(localizedMessage).length());
        sb.append(simpleName);
        sb.append(": ");
        sb.append(localizedMessage);
        this.f39060a.mo38364b(new Status(10, sb.toString()));
    }

    /* renamed from: a */
    public final void mo38306a(C15150q qVar, boolean z) {
        qVar.mo38437a((BasePendingResult<? extends C15044g>) this.f39060a, z);
    }
}
