package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C15345b;
import com.google.android.gms.dynamic.C15345b.C15346a;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.pk */
public abstract class C15952pk extends bfz implements C15951pj {
    public C15952pk() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                String a = mo41885a();
                parcel2.writeNoException();
                parcel2.writeString(a);
                break;
            case 3:
                List b = mo41888b();
                parcel2.writeNoException();
                parcel2.writeList(b);
                break;
            case 4:
                String c = mo41890c();
                parcel2.writeNoException();
                parcel2.writeString(c);
                break;
            case 5:
                C15658en d = mo41891d();
                parcel2.writeNoException();
                bga.m48615a(parcel2, (IInterface) d);
                break;
            case 6:
                String e = mo41892e();
                parcel2.writeNoException();
                parcel2.writeString(e);
                break;
            case 7:
                String f = mo41893f();
                parcel2.writeNoException();
                parcel2.writeString(f);
                break;
            case 8:
                double g = mo41894g();
                parcel2.writeNoException();
                parcel2.writeDouble(g);
                break;
            case 9:
                String h = mo41895h();
                parcel2.writeNoException();
                parcel2.writeString(h);
                break;
            case 10:
                String i3 = mo41896i();
                parcel2.writeNoException();
                parcel2.writeString(i3);
                break;
            case 11:
                C15488ak j = mo41897j();
                parcel2.writeNoException();
                bga.m48615a(parcel2, (IInterface) j);
                break;
            case 12:
                C15654ej k = mo41898k();
                parcel2.writeNoException();
                bga.m48615a(parcel2, (IInterface) k);
                break;
            case 13:
                C15345b l = mo41899l();
                parcel2.writeNoException();
                bga.m48615a(parcel2, (IInterface) l);
                break;
            case 14:
                C15345b m = mo41900m();
                parcel2.writeNoException();
                bga.m48615a(parcel2, (IInterface) m);
                break;
            case 15:
                C15345b n = mo41901n();
                parcel2.writeNoException();
                bga.m48615a(parcel2, (IInterface) n);
                break;
            case 16:
                Bundle o = mo41902o();
                parcel2.writeNoException();
                bga.m48620b(parcel2, o);
                break;
            case 17:
                boolean p = mo41903p();
                parcel2.writeNoException();
                bga.m48617a(parcel2, p);
                break;
            case 18:
                boolean q = mo41904q();
                parcel2.writeNoException();
                bga.m48617a(parcel2, q);
                break;
            case 19:
                mo41905r();
                parcel2.writeNoException();
                break;
            case 20:
                mo41886a(C15346a.m44656a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 21:
                mo41887a(C15346a.m44656a(parcel.readStrongBinder()), C15346a.m44656a(parcel.readStrongBinder()), C15346a.m44656a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 22:
                mo41889b(C15346a.m44656a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
