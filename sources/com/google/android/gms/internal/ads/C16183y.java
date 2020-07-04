package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C15345b.C15346a;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.y */
public abstract class C16183y extends bfz implements C16156x {
    public C16183y() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                mo37853a();
                parcel2.writeNoException();
                break;
            case 2:
                mo37854a(parcel.readFloat());
                parcel2.writeNoException();
                break;
            case 3:
                mo37859a(parcel.readString());
                parcel2.writeNoException();
                break;
            case 4:
                mo37861a(bga.m48618a(parcel));
                parcel2.writeNoException();
                break;
            case 5:
                mo37855a(C15346a.m44656a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                break;
            case 6:
                mo37860a(parcel.readString(), C15346a.m44656a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 7:
                float b = mo37862b();
                parcel2.writeNoException();
                parcel2.writeFloat(b);
                break;
            case 8:
                boolean c = mo37864c();
                parcel2.writeNoException();
                bga.m48617a(parcel2, c);
                break;
            case 9:
                String d = mo37865d();
                parcel2.writeNoException();
                parcel2.writeString(d);
                break;
            case 10:
                mo37863b(parcel.readString());
                parcel2.writeNoException();
                break;
            case 11:
                mo37857a(C15933os.m51515a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 12:
                mo37856a(C15783jd.m51101a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 13:
                List e = mo37866e();
                parcel2.writeNoException();
                parcel2.writeTypedList(e);
                break;
            default:
                return false;
        }
        return true;
    }
}
