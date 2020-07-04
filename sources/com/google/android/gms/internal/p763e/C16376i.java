package com.google.android.gms.internal.p763e;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C15345b;
import com.google.android.gms.dynamic.C15345b.C15346a;

/* renamed from: com.google.android.gms.internal.e.i */
public final class C16376i extends C16368a implements C16374g {
    C16376i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
    }

    /* renamed from: a */
    public final C15345b mo42465a(Bitmap bitmap) throws RemoteException {
        Parcel a = mo42457a();
        C16373f.m53343a(a, (Parcelable) bitmap);
        Parcel a2 = mo42458a(6, a);
        C15345b a3 = C15346a.m44656a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }
}
