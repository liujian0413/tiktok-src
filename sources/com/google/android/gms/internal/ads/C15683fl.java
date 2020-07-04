package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C15345b;
import com.google.android.gms.dynamic.C15345b.C15346a;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.fl */
public abstract class C15683fl extends bfz implements C15682fk {
    public C15683fl() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    /* renamed from: a */
    public static C15682fk m50834a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        if (queryLocalInterface instanceof C15682fk) {
            return (C15682fk) queryLocalInterface;
        }
        return new C15684fm(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                String a = mo41531a(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(a);
                break;
            case 2:
                C15658en b = mo41534b(parcel.readString());
                parcel2.writeNoException();
                bga.m48615a(parcel2, (IInterface) b);
                break;
            case 3:
                List a2 = mo41532a();
                parcel2.writeNoException();
                parcel2.writeStringList(a2);
                break;
            case 4:
                String c = mo41482c();
                parcel2.writeNoException();
                parcel2.writeString(c);
                break;
            case 5:
                mo41535c(parcel.readString());
                parcel2.writeNoException();
                break;
            case 6:
                mo41538h();
                parcel2.writeNoException();
                break;
            case 7:
                C15488ak g = mo41537g();
                parcel2.writeNoException();
                bga.m48615a(parcel2, (IInterface) g);
                break;
            case 8:
                mo41540j();
                parcel2.writeNoException();
                break;
            case 9:
                C15345b i3 = mo41539i();
                parcel2.writeNoException();
                bga.m48615a(parcel2, (IInterface) i3);
                break;
            case 10:
                boolean a3 = mo41533a(C15346a.m44656a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                bga.m48617a(parcel2, a3);
                break;
            case 11:
                C15345b f = mo41536f();
                parcel2.writeNoException();
                bga.m48615a(parcel2, (IInterface) f);
                break;
            default:
                return false;
        }
        return true;
    }
}
