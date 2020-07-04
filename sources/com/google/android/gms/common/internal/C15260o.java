package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.p761c.C16357b;
import com.google.android.gms.internal.p761c.C16358c;

/* renamed from: com.google.android.gms.common.internal.o */
public interface C15260o extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.o$a */
    public static abstract class C15261a extends C16357b implements C15260o {
        public C15261a() {
            super("com.google.android.gms.common.internal.IGmsCallbacks");
        }

        /* renamed from: a */
        public final boolean mo38544a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case 1:
                    mo38546a(parcel.readInt(), parcel.readStrongBinder(), (Bundle) C16358c.m53320a(parcel, Bundle.CREATOR));
                    break;
                case 2:
                    mo38545a(parcel.readInt(), (Bundle) C16358c.m53320a(parcel, Bundle.CREATOR));
                    break;
                case 3:
                    mo38547a(parcel.readInt(), parcel.readStrongBinder(), (zzb) C16358c.m53320a(parcel, zzb.CREATOR));
                    break;
                default:
                    return false;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    /* renamed from: a */
    void mo38545a(int i, Bundle bundle) throws RemoteException;

    /* renamed from: a */
    void mo38546a(int i, IBinder iBinder, Bundle bundle) throws RemoteException;

    /* renamed from: a */
    void mo38547a(int i, IBinder iBinder, zzb zzb) throws RemoteException;
}
