package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C15345b;

/* renamed from: com.google.android.gms.internal.ads.eo */
public abstract class C15659eo extends bfz implements C15658en {
    public C15659eo() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    /* renamed from: a */
    public static C15658en m50701a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        if (queryLocalInterface instanceof C15658en) {
            return (C15658en) queryLocalInterface;
        }
        return new C15660ep(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                C15345b a = mo41491a();
                parcel2.writeNoException();
                bga.m48615a(parcel2, (IInterface) a);
                break;
            case 2:
                Uri b = mo41492b();
                parcel2.writeNoException();
                bga.m48620b(parcel2, b);
                break;
            case 3:
                double c = mo41493c();
                parcel2.writeNoException();
                parcel2.writeDouble(c);
                break;
            case 4:
                int d = mo41494d();
                parcel2.writeNoException();
                parcel2.writeInt(d);
                break;
            case 5:
                int e = mo41495e();
                parcel2.writeNoException();
                parcel2.writeInt(e);
                break;
            default:
                return false;
        }
        return true;
    }
}
