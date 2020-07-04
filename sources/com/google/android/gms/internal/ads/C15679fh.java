package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C15345b;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.fh */
public abstract class C15679fh extends bfz implements C15678fg {
    public C15679fh() {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                C15345b n = mo41526n();
                parcel2.writeNoException();
                bga.m48615a(parcel2, (IInterface) n);
                break;
            case 3:
                String a = mo41515a();
                parcel2.writeNoException();
                parcel2.writeString(a);
                break;
            case 4:
                List f = mo41500f();
                parcel2.writeNoException();
                parcel2.writeList(f);
                break;
            case 5:
                String i3 = mo41521i();
                parcel2.writeNoException();
                parcel2.writeString(i3);
                break;
            case 6:
                C15658en j = mo41522j();
                parcel2.writeNoException();
                bga.m48615a(parcel2, (IInterface) j);
                break;
            case 7:
                String k = mo41523k();
                parcel2.writeNoException();
                parcel2.writeString(k);
                break;
            case 8:
                String l = mo41524l();
                parcel2.writeNoException();
                parcel2.writeString(l);
                break;
            case 9:
                Bundle o = mo41527o();
                parcel2.writeNoException();
                bga.m48620b(parcel2, o);
                break;
            case 10:
                mo41529q();
                parcel2.writeNoException();
                break;
            case 11:
                C15488ak m = mo41525m();
                parcel2.writeNoException();
                bga.m48615a(parcel2, (IInterface) m);
                break;
            case 12:
                mo41516a((Bundle) bga.m48614a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 13:
                boolean b = mo41517b((Bundle) bga.m48614a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                bga.m48617a(parcel2, b);
                break;
            case 14:
                mo41518c((Bundle) bga.m48614a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 15:
                C15654ej p = mo41528p();
                parcel2.writeNoException();
                bga.m48615a(parcel2, (IInterface) p);
                break;
            case 16:
                C15345b g = mo41519g();
                parcel2.writeNoException();
                bga.m48615a(parcel2, (IInterface) g);
                break;
            case 17:
                String h = mo41520h();
                parcel2.writeNoException();
                parcel2.writeString(h);
                break;
            default:
                return false;
        }
        return true;
    }
}
