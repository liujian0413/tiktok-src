package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C15345b;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.fd */
public abstract class C15675fd extends bfz implements C15674fc {
    public C15675fd() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                C15345b n = mo41508n();
                parcel2.writeNoException();
                bga.m48615a(parcel2, (IInterface) n);
                break;
            case 3:
                String a = mo41496a();
                parcel2.writeNoException();
                parcel2.writeString(a);
                break;
            case 4:
                List f = mo41500f();
                parcel2.writeNoException();
                parcel2.writeList(f);
                break;
            case 5:
                String g = mo41501g();
                parcel2.writeNoException();
                parcel2.writeString(g);
                break;
            case 6:
                C15658en h = mo41502h();
                parcel2.writeNoException();
                bga.m48615a(parcel2, (IInterface) h);
                break;
            case 7:
                String i3 = mo41503i();
                parcel2.writeNoException();
                parcel2.writeString(i3);
                break;
            case 8:
                double j = mo41504j();
                parcel2.writeNoException();
                parcel2.writeDouble(j);
                break;
            case 9:
                String k = mo41505k();
                parcel2.writeNoException();
                parcel2.writeString(k);
                break;
            case 10:
                String l = mo41506l();
                parcel2.writeNoException();
                parcel2.writeString(l);
                break;
            case 11:
                Bundle o = mo41509o();
                parcel2.writeNoException();
                bga.m48620b(parcel2, o);
                break;
            case 12:
                mo41513s();
                parcel2.writeNoException();
                break;
            case 13:
                C15488ak m = mo41507m();
                parcel2.writeNoException();
                bga.m48615a(parcel2, (IInterface) m);
                break;
            case 14:
                mo41497a((Bundle) bga.m48614a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 15:
                boolean b = mo41498b((Bundle) bga.m48614a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                bga.m48617a(parcel2, b);
                break;
            case 16:
                mo41499c((Bundle) bga.m48614a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 17:
                C15654ej r = mo41512r();
                parcel2.writeNoException();
                bga.m48615a(parcel2, (IInterface) r);
                break;
            case 18:
                C15345b p = mo41510p();
                parcel2.writeNoException();
                bga.m48615a(parcel2, (IInterface) p);
                break;
            case 19:
                String q = mo41511q();
                parcel2.writeNoException();
                parcel2.writeString(q);
                break;
            default:
                return false;
        }
        return true;
    }
}
