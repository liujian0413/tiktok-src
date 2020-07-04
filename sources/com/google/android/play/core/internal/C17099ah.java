package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import java.util.List;

/* renamed from: com.google.android.play.core.internal.ah */
public final class C17099ah extends C17104as implements C17097af {
    C17099ah(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
    }

    /* renamed from: a */
    public final void mo44336a(String str, int i, Bundle bundle, C17098ag agVar) throws RemoteException {
        Parcel a = mo44379a();
        a.writeString(str);
        a.writeInt(i);
        C17105au.m56720a(a, (Parcelable) bundle);
        C17105au.m56719a(a, (IInterface) agVar);
        mo44380a(4, a);
    }

    /* renamed from: a */
    public final void mo44337a(String str, int i, C17098ag agVar) throws RemoteException {
        Parcel a = mo44379a();
        a.writeString(str);
        a.writeInt(i);
        C17105au.m56719a(a, (IInterface) agVar);
        mo44380a(5, a);
    }

    /* renamed from: a */
    public final void mo44338a(String str, List<Bundle> list, Bundle bundle, C17098ag agVar) throws RemoteException {
        Parcel a = mo44379a();
        a.writeString(str);
        a.writeTypedList(list);
        C17105au.m56720a(a, (Parcelable) bundle);
        C17105au.m56719a(a, (IInterface) agVar);
        mo44380a(2, a);
    }

    /* renamed from: b */
    public final void mo44339b(String str, List<Bundle> list, Bundle bundle, C17098ag agVar) throws RemoteException {
        Parcel a = mo44379a();
        a.writeString(str);
        a.writeTypedList(list);
        C17105au.m56720a(a, (Parcelable) bundle);
        C17105au.m56719a(a, (IInterface) agVar);
        mo44380a(8, a);
    }
}
