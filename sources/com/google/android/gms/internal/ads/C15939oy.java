package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.oy */
public abstract class C15939oy extends bfz implements C15938ox {
    public C15939oy() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    /* renamed from: a */
    public static C15938ox m51599a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        if (queryLocalInterface instanceof C15938ox) {
            return (C15938ox) queryLocalInterface;
        }
        return new C15940oz(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        C15942pa paVar;
        switch (i) {
            case 1:
                mo41780a();
                break;
            case 2:
                mo41791b();
                break;
            case 3:
                mo41781a(parcel.readInt());
                break;
            case 4:
                mo41793c();
                break;
            case 5:
                mo41794d();
                break;
            case 6:
                mo41795e();
                break;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    paVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                    if (queryLocalInterface instanceof C15942pa) {
                        paVar = (C15942pa) queryLocalInterface;
                    } else {
                        paVar = new C15944pc(readStrongBinder);
                    }
                }
                mo41786a(paVar);
                break;
            case 8:
                mo41796f();
                break;
            case 9:
                mo41790a(parcel.readString(), parcel.readString());
                break;
            case 10:
                mo41783a(C15683fl.m50834a(parcel.readStrongBinder()), parcel.readString());
                break;
            case 11:
                mo41797g();
                break;
            case 12:
                mo41789a(parcel.readString());
                break;
            case 13:
                mo41798h();
                break;
            case 14:
                mo41788a((zzbaz) bga.m48614a(parcel, zzbaz.CREATOR));
                break;
            case 15:
                mo41799i();
                break;
            case 16:
                mo41787a(C16226zp.m52637a(parcel.readStrongBinder()));
                break;
            case 17:
                mo41792b(parcel.readInt());
                break;
            case 18:
                mo41800j();
                break;
            case 19:
                mo41782a((Bundle) bga.m48614a(parcel, Bundle.CREATOR));
                break;
            case 20:
                mo41801k();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
