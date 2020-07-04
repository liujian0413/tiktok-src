package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.al */
public abstract class C15489al extends bfz implements C15488ak {
    public C15489al() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    /* renamed from: a */
    public static C15488ak m46249a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        if (queryLocalInterface instanceof C15488ak) {
            return (C15488ak) queryLocalInterface;
        }
        return new C15490am(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        C15491an anVar;
        switch (i) {
            case 1:
                mo39574a();
                parcel2.writeNoException();
                break;
            case 2:
                mo39577b();
                parcel2.writeNoException();
                break;
            case 3:
                mo39576a(bga.m48618a(parcel));
                parcel2.writeNoException();
                break;
            case 4:
                boolean c = mo39578c();
                parcel2.writeNoException();
                bga.m48617a(parcel2, c);
                break;
            case 5:
                int d = mo39579d();
                parcel2.writeNoException();
                parcel2.writeInt(d);
                break;
            case 6:
                float e = mo39580e();
                parcel2.writeNoException();
                parcel2.writeFloat(e);
                break;
            case 7:
                float f = mo39581f();
                parcel2.writeNoException();
                parcel2.writeFloat(f);
                break;
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    anVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    if (queryLocalInterface instanceof C15491an) {
                        anVar = (C15491an) queryLocalInterface;
                    } else {
                        anVar = new C15493ap(readStrongBinder);
                    }
                }
                mo39575a(anVar);
                parcel2.writeNoException();
                break;
            case 9:
                float g = mo39582g();
                parcel2.writeNoException();
                parcel2.writeFloat(g);
                break;
            case 10:
                boolean h = mo39583h();
                parcel2.writeNoException();
                bga.m48617a(parcel2, h);
                break;
            case 11:
                C15491an i3 = mo39584i();
                parcel2.writeNoException();
                bga.m48615a(parcel2, (IInterface) i3);
                break;
            case 12:
                boolean j = mo39585j();
                parcel2.writeNoException();
                bga.m48617a(parcel2, j);
                break;
            case 13:
                mo39586k();
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
