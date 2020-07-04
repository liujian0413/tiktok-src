package com.google.android.gms.maps.p764a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C15345b;
import com.google.android.gms.internal.p763e.C16368a;
import com.google.android.gms.internal.p763e.C16373f;
import com.google.android.gms.internal.p763e.C16377j;
import com.google.android.gms.internal.p763e.C16378k;
import com.google.android.gms.maps.model.MarkerOptions;

/* renamed from: com.google.android.gms.maps.a.aa */
public final class C16718aa extends C16368a implements C16723b {
    C16718aa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IGoogleMapDelegate");
    }

    /* renamed from: a */
    public final C16377j mo43310a(MarkerOptions markerOptions) throws RemoteException {
        Parcel a = mo42457a();
        C16373f.m53343a(a, (Parcelable) markerOptions);
        Parcel a2 = mo42458a(11, a);
        C16377j a3 = C16378k.m53354a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    /* renamed from: a */
    public final void mo43311a(C15345b bVar) throws RemoteException {
        Parcel a = mo42457a();
        C16373f.m53342a(a, (IInterface) bVar);
        mo42460b(4, a);
    }

    /* renamed from: a */
    public final void mo43312a(C16719ab abVar) throws RemoteException {
        Parcel a = mo42457a();
        C16373f.m53342a(a, (IInterface) abVar);
        mo42460b(33, a);
    }

    /* renamed from: a */
    public final void mo43313a(C16731j jVar) throws RemoteException {
        Parcel a = mo42457a();
        C16373f.m53342a(a, (IInterface) jVar);
        mo42460b(32, a);
    }

    /* renamed from: a */
    public final void mo43314a(C16733l lVar) throws RemoteException {
        Parcel a = mo42457a();
        C16373f.m53342a(a, (IInterface) lVar);
        mo42460b(28, a);
    }

    /* renamed from: a */
    public final void mo43315a(C16737p pVar) throws RemoteException {
        Parcel a = mo42457a();
        C16373f.m53342a(a, (IInterface) pVar);
        mo42460b(30, a);
    }

    /* renamed from: b */
    public final void mo43316b(C15345b bVar) throws RemoteException {
        Parcel a = mo42457a();
        C16373f.m53342a(a, (IInterface) bVar);
        mo42460b(5, a);
    }
}
