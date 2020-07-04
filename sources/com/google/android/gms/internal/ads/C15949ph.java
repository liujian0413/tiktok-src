package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C15345b;
import com.google.android.gms.dynamic.C15345b.C15346a;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.ph */
public abstract class C15949ph extends bfz implements C15948pg {
    public C15949ph() {
        super("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                String a = mo41866a();
                parcel2.writeNoException();
                parcel2.writeString(a);
                break;
            case 3:
                List b = mo41869b();
                parcel2.writeNoException();
                parcel2.writeList(b);
                break;
            case 4:
                String c = mo41871c();
                parcel2.writeNoException();
                parcel2.writeString(c);
                break;
            case 5:
                C15658en d = mo41873d();
                parcel2.writeNoException();
                bga.m48615a(parcel2, (IInterface) d);
                break;
            case 6:
                String e = mo41874e();
                parcel2.writeNoException();
                parcel2.writeString(e);
                break;
            case 7:
                String f = mo41875f();
                parcel2.writeNoException();
                parcel2.writeString(f);
                break;
            case 8:
                mo41876g();
                parcel2.writeNoException();
                break;
            case 9:
                mo41867a(C15346a.m44656a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 10:
                mo41870b(C15346a.m44656a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 11:
                boolean h = mo41877h();
                parcel2.writeNoException();
                bga.m48617a(parcel2, h);
                break;
            case 12:
                boolean i3 = mo41878i();
                parcel2.writeNoException();
                bga.m48617a(parcel2, i3);
                break;
            case 13:
                Bundle j = mo41879j();
                parcel2.writeNoException();
                bga.m48620b(parcel2, j);
                break;
            case 14:
                mo41872c(C15346a.m44656a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 15:
                C15345b k = mo41880k();
                parcel2.writeNoException();
                bga.m48615a(parcel2, (IInterface) k);
                break;
            case 16:
                C15488ak l = mo41881l();
                parcel2.writeNoException();
                bga.m48615a(parcel2, (IInterface) l);
                break;
            case 19:
                C15654ej m = mo41882m();
                parcel2.writeNoException();
                bga.m48615a(parcel2, (IInterface) m);
                break;
            case 20:
                C15345b n = mo41883n();
                parcel2.writeNoException();
                bga.m48615a(parcel2, (IInterface) n);
                break;
            case 21:
                C15345b o = mo41884o();
                parcel2.writeNoException();
                bga.m48615a(parcel2, (IInterface) o);
                break;
            case 22:
                mo41868a(C15346a.m44656a(parcel.readStrongBinder()), C15346a.m44656a(parcel.readStrongBinder()), C15346a.m44656a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
