package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.yl */
public abstract class C16195yl extends bfz implements C16194yk {
    public C16195yl() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    /* renamed from: a */
    public static C16194yk m52503a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
        if (queryLocalInterface instanceof C16194yk) {
            return (C16194yk) queryLocalInterface;
        }
        return new C16196ym(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        C16184ya yaVar;
        switch (i) {
            case 1:
                mo41682a();
                break;
            case 2:
                mo41685b();
                break;
            case 3:
                mo41686c();
                break;
            case 4:
                mo41687d();
                break;
            case 5:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    yaVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardItem");
                    if (queryLocalInterface instanceof C16184ya) {
                        yaVar = (C16184ya) queryLocalInterface;
                    } else {
                        yaVar = new C16186yc(readStrongBinder);
                    }
                }
                mo41684a(yaVar);
                break;
            case 6:
                mo41688e();
                break;
            case 7:
                mo41683a(parcel.readInt());
                break;
            case 8:
                mo41689f();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
