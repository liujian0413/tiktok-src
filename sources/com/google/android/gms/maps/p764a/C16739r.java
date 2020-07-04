package com.google.android.gms.maps.p764a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C15345b;
import com.google.android.gms.dynamic.C15345b.C15346a;
import com.google.android.gms.internal.p763e.C16368a;
import com.google.android.gms.internal.p763e.C16373f;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: com.google.android.gms.maps.a.r */
public final class C16739r extends C16368a implements C16717a {
    C16739r(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
    }

    /* renamed from: a */
    public final C15345b mo43307a(float f) throws RemoteException {
        Parcel a = mo42457a();
        a.writeFloat(f);
        Parcel a2 = mo42458a(4, a);
        C15345b a3 = C15346a.m44656a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    /* renamed from: a */
    public final C15345b mo43308a(LatLng latLng) throws RemoteException {
        Parcel a = mo42457a();
        C16373f.m53343a(a, (Parcelable) latLng);
        Parcel a2 = mo42458a(8, a);
        C15345b a3 = C15346a.m44656a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    /* renamed from: a */
    public final C15345b mo43309a(LatLng latLng, float f) throws RemoteException {
        Parcel a = mo42457a();
        C16373f.m53343a(a, (Parcelable) latLng);
        a.writeFloat(f);
        Parcel a2 = mo42458a(9, a);
        C15345b a3 = C15346a.m44656a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }
}
