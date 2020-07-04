package com.google.android.gms.common.internal.p750a;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C15104c.C15106b;

/* renamed from: com.google.android.gms.common.internal.a.g */
final class C15201g extends C15196b {

    /* renamed from: a */
    private final C15106b<Status> f39351a;

    public C15201g(C15106b<Status> bVar) {
        this.f39351a = bVar;
    }

    /* renamed from: a */
    public final void mo38515a(int i) throws RemoteException {
        this.f39351a.mo38363a(new Status(i));
    }
}
