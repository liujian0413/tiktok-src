package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C15345b.C15346a;

/* renamed from: com.google.android.gms.internal.ads.zj */
public abstract class C16220zj extends bfz implements C16219zi {
    public C16220zj() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    /* renamed from: a */
    public static C16219zi m52605a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        if (queryLocalInterface instanceof C16219zi) {
            return (C16219zi) queryLocalInterface;
        }
        return new C16221zk(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                mo42129a(C15346a.m44656a(parcel.readStrongBinder()));
                break;
            case 2:
                mo42130a(C15346a.m44656a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 3:
                mo42132b(C15346a.m44656a(parcel.readStrongBinder()));
                break;
            case 4:
                mo42134c(C15346a.m44656a(parcel.readStrongBinder()));
                break;
            case 5:
                mo42135d(C15346a.m44656a(parcel.readStrongBinder()));
                break;
            case 6:
                mo42136e(C15346a.m44656a(parcel.readStrongBinder()));
                break;
            case 7:
                mo42131a(C15346a.m44656a(parcel.readStrongBinder()), (zzbaz) bga.m48614a(parcel, zzbaz.CREATOR));
                break;
            case 8:
                mo42137f(C15346a.m44656a(parcel.readStrongBinder()));
                break;
            case 9:
                mo42133b(C15346a.m44656a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 10:
                mo42138g(C15346a.m44656a(parcel.readStrongBinder()));
                break;
            case 11:
                mo42139h(C15346a.m44656a(parcel.readStrongBinder()));
                break;
            case 12:
                mo42128a((Bundle) bga.m48614a(parcel, Bundle.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
