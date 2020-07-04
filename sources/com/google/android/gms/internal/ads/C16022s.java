package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C15345b.C15346a;

/* renamed from: com.google.android.gms.internal.ads.s */
public abstract class C16022s extends bfz implements C15995r {
    public C16022s() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                C15698g a = mo37568a(C15346a.m44656a(parcel.readStrongBinder()), (zzyz) bga.m48614a(parcel, zzyz.CREATOR), parcel.readString(), C15933os.m51515a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                bga.m48615a(parcel2, (IInterface) a);
                break;
            case 2:
                C15698g b = mo37572b(C15346a.m44656a(parcel.readStrongBinder()), (zzyz) bga.m48614a(parcel, zzyz.CREATOR), parcel.readString(), C15933os.m51515a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                bga.m48615a(parcel2, (IInterface) b);
                break;
            case 3:
                C15553b a2 = mo37564a(C15346a.m44656a(parcel.readStrongBinder()), parcel.readString(), C15933os.m51515a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                bga.m48615a(parcel2, (IInterface) a2);
                break;
            case 4:
                C16156x a3 = mo37569a(C15346a.m44656a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                bga.m48615a(parcel2, (IInterface) a3);
                break;
            case 5:
                C15663es a4 = mo37565a(C15346a.m44656a(parcel.readStrongBinder()), C15346a.m44656a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                bga.m48615a(parcel2, (IInterface) a4);
                break;
            case 6:
                C16189yf a5 = mo37571a(C15346a.m44656a(parcel.readStrongBinder()), C15933os.m51515a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                bga.m48615a(parcel2, (IInterface) a5);
                break;
            case 7:
                C16030sh b2 = mo37573b(C15346a.m44656a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                bga.m48615a(parcel2, (IInterface) b2);
                break;
            case 8:
                C16019rx c = mo37575c(C15346a.m44656a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                bga.m48615a(parcel2, (IInterface) c);
                break;
            case 9:
                C16156x a6 = mo37570a(C15346a.m44656a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                bga.m48615a(parcel2, (IInterface) a6);
                break;
            case 10:
                C15698g a7 = mo37567a(C15346a.m44656a(parcel.readStrongBinder()), (zzyz) bga.m48614a(parcel, zzyz.CREATOR), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                bga.m48615a(parcel2, (IInterface) a7);
                break;
            case 11:
                C15668ex a8 = mo37566a(C15346a.m44656a(parcel.readStrongBinder()), C15346a.m44656a(parcel.readStrongBinder()), C15346a.m44656a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                bga.m48615a(parcel2, (IInterface) a8);
                break;
            case 12:
                C16228zr b3 = mo37574b(C15346a.m44656a(parcel.readStrongBinder()), parcel.readString(), C15933os.m51515a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                bga.m48615a(parcel2, (IInterface) b3);
                break;
            default:
                return false;
        }
        return true;
    }
}
