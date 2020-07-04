package com.google.android.gms.internal.p763e;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.Tile;

/* renamed from: com.google.android.gms.internal.e.d */
public final class C16371d extends C16368a implements C16369b {
    C16371d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ITileProviderDelegate");
    }

    /* renamed from: a */
    public final Tile mo42461a(int i, int i2, int i3) throws RemoteException {
        Parcel a = mo42457a();
        a.writeInt(i);
        a.writeInt(i2);
        a.writeInt(i3);
        Parcel a2 = mo42458a(1, a);
        Tile tile = (Tile) C16373f.m53341a(a2, Tile.CREATOR);
        a2.recycle();
        return tile;
    }
}
