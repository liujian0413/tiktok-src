package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C15345b.C15346a;

/* renamed from: com.google.android.gms.internal.ads.ry */
public abstract class C16020ry extends bfz implements C16019rx {
    public C16020ry() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    /* renamed from: a */
    public static C16019rx m52095a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        if (queryLocalInterface instanceof C16019rx) {
            return (C16019rx) queryLocalInterface;
        }
        return new C16021rz(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                mo37811a((Bundle) bga.m48614a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 2:
                mo37820f();
                parcel2.writeNoException();
                break;
            case 3:
                mo37821g();
                parcel2.writeNoException();
                break;
            case 4:
                mo37822h();
                parcel2.writeNoException();
                break;
            case 5:
                mo37823i();
                parcel2.writeNoException();
                break;
            case 6:
                Bundle bundle = (Bundle) bga.m48614a(parcel, Bundle.CREATOR);
                mo37816b(bundle);
                parcel2.writeNoException();
                bga.m48620b(parcel2, bundle);
                break;
            case 7:
                mo37824j();
                parcel2.writeNoException();
                break;
            case 8:
                mo37825k();
                parcel2.writeNoException();
                break;
            case 9:
                mo37826l();
                parcel2.writeNoException();
                break;
            case 10:
                mo37818d();
                parcel2.writeNoException();
                break;
            case 11:
                boolean e = mo37819e();
                parcel2.writeNoException();
                bga.m48617a(parcel2, e);
                break;
            case 12:
                mo37810a(parcel.readInt(), parcel.readInt(), (Intent) bga.m48614a(parcel, Intent.CREATOR));
                parcel2.writeNoException();
                break;
            case 13:
                mo37813a(C15346a.m44656a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
