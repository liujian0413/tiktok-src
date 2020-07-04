package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C15133d.C15134a;
import com.google.android.gms.common.util.C15333p;

/* renamed from: com.google.android.gms.common.api.internal.ap */
public abstract class C15065ap {

    /* renamed from: a */
    private final int f38982a;

    public C15065ap(int i) {
        this.f38982a = i;
    }

    /* renamed from: a */
    public abstract void mo38304a(Status status);

    /* renamed from: a */
    public abstract void mo38305a(C15134a<?> aVar) throws DeadObjectException;

    /* renamed from: a */
    public abstract void mo38306a(C15150q qVar, boolean z);

    /* renamed from: a */
    public abstract void mo38307a(RuntimeException runtimeException);

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static Status m43714b(RemoteException remoteException) {
        StringBuilder sb = new StringBuilder();
        if (C15333p.m44594a() && (remoteException instanceof TransactionTooLargeException)) {
            sb.append("TransactionTooLargeException: ");
        }
        sb.append(remoteException.getLocalizedMessage());
        return new Status(8, sb.toString());
    }
}
