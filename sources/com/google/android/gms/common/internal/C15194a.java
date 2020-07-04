package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C15256m.C15257a;

/* renamed from: com.google.android.gms.common.internal.a */
public final class C15194a extends C15257a {
    /* renamed from: a */
    public static Account m44204a(C15256m mVar) {
        if (mVar != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return mVar.mo38513a();
            } catch (RemoteException unused) {
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        return null;
    }

    /* renamed from: a */
    public final Account mo38513a() {
        throw new NoSuchMethodError();
    }

    public final boolean equals(Object obj) {
        throw new NoSuchMethodError();
    }
}
