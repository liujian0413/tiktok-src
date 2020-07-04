package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: com.google.android.play.core.internal.ax */
public final class C17108ax extends C17104as implements C17107aw {
    C17108ax(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.appupdate.protocol.IAppUpdateService");
    }

    /* renamed from: a */
    public final void mo44384a(String str, Bundle bundle, C17111bb bbVar) throws RemoteException {
        Parcel a = mo44379a();
        a.writeString(str);
        C17105au.m56720a(a, (Parcelable) bundle);
        C17105au.m56719a(a, (IInterface) bbVar);
        mo44380a(2, a);
    }

    /* renamed from: b */
    public final void mo44385b(String str, Bundle bundle, C17111bb bbVar) throws RemoteException {
        Parcel a = mo44379a();
        a.writeString(str);
        C17105au.m56720a(a, (Parcelable) bundle);
        C17105au.m56719a(a, (IInterface) bbVar);
        mo44380a(3, a);
    }
}
