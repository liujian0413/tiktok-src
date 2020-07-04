package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.play.core.internal.az */
public abstract class C17110az extends C17106av implements C17111bb {
    public C17110az() {
        super("com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo44352a(int i, Parcel parcel) throws RemoteException {
        switch (i) {
            case 2:
                mo44333b((Bundle) C17105au.m56718a(parcel, Bundle.CREATOR));
                break;
            case 3:
                mo44332a((Bundle) C17105au.m56718a(parcel, Bundle.CREATOR));
                break;
            default:
                return false;
        }
        return true;
    }
}
