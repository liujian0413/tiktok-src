package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C15345b;
import com.google.android.gms.dynamic.C15345b.C15346a;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.pe */
public abstract class C15946pe extends bfz implements C15945pd {
    public C15946pe() {
        super("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                String a = mo41845a();
                parcel2.writeNoException();
                parcel2.writeString(a);
                break;
            case 3:
                List b = mo41848b();
                parcel2.writeNoException();
                parcel2.writeList(b);
                break;
            case 4:
                String c = mo41850c();
                parcel2.writeNoException();
                parcel2.writeString(c);
                break;
            case 5:
                C15658en d = mo41852d();
                parcel2.writeNoException();
                bga.m48615a(parcel2, (IInterface) d);
                break;
            case 6:
                String e = mo41853e();
                parcel2.writeNoException();
                parcel2.writeString(e);
                break;
            case 7:
                double f = mo41854f();
                parcel2.writeNoException();
                parcel2.writeDouble(f);
                break;
            case 8:
                String g = mo41855g();
                parcel2.writeNoException();
                parcel2.writeString(g);
                break;
            case 9:
                String h = mo41856h();
                parcel2.writeNoException();
                parcel2.writeString(h);
                break;
            case 10:
                mo41857i();
                parcel2.writeNoException();
                break;
            case 11:
                mo41846a(C15346a.m44656a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 12:
                mo41849b(C15346a.m44656a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 13:
                boolean j = mo41858j();
                parcel2.writeNoException();
                bga.m48617a(parcel2, j);
                break;
            case 14:
                boolean k = mo41859k();
                parcel2.writeNoException();
                bga.m48617a(parcel2, k);
                break;
            case 15:
                Bundle l = mo41860l();
                parcel2.writeNoException();
                bga.m48620b(parcel2, l);
                break;
            case 16:
                mo41851c(C15346a.m44656a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 17:
                C15488ak m = mo41861m();
                parcel2.writeNoException();
                bga.m48615a(parcel2, (IInterface) m);
                break;
            case 18:
                C15345b n = mo41862n();
                parcel2.writeNoException();
                bga.m48615a(parcel2, (IInterface) n);
                break;
            case 19:
                C15654ej o = mo41863o();
                parcel2.writeNoException();
                bga.m48615a(parcel2, (IInterface) o);
                break;
            case 20:
                C15345b p = mo41864p();
                parcel2.writeNoException();
                bga.m48615a(parcel2, (IInterface) p);
                break;
            case 21:
                C15345b q = mo41865q();
                parcel2.writeNoException();
                bga.m48615a(parcel2, (IInterface) q);
                break;
            case 22:
                mo41847a(C15346a.m44656a(parcel.readStrongBinder()), C15346a.m44656a(parcel.readStrongBinder()), C15346a.m44656a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
