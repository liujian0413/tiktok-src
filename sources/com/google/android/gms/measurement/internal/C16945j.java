package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.C16507ep;
import com.google.android.gms.internal.measurement.C16517ez;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.j */
public abstract class C16945j extends C16507ep implements C16944i {
    public C16945j() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* renamed from: a */
    public final boolean mo42615a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                mo43687a((zzag) C16517ez.m53832a(parcel, zzag.CREATOR), (zzk) C16517ez.m53832a(parcel, zzk.CREATOR));
                parcel2.writeNoException();
                break;
            case 2:
                mo43689a((zzfv) C16517ez.m53832a(parcel, zzfv.CREATOR), (zzk) C16517ez.m53832a(parcel, zzk.CREATOR));
                parcel2.writeNoException();
                break;
            case 4:
                mo43690a((zzk) C16517ez.m53832a(parcel, zzk.CREATOR));
                parcel2.writeNoException();
                break;
            case 5:
                mo43688a((zzag) C16517ez.m53832a(parcel, zzag.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                break;
            case 6:
                mo43695b((zzk) C16517ez.m53832a(parcel, zzk.CREATOR));
                parcel2.writeNoException();
                break;
            case 7:
                List a = mo43681a((zzk) C16517ez.m53832a(parcel, zzk.CREATOR), C16517ez.m53836a(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(a);
                break;
            case 9:
                byte[] a2 = mo43693a((zzag) C16517ez.m53832a(parcel, zzag.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeByteArray(a2);
                break;
            case 10:
                mo43686a(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                break;
            case 11:
                String c = mo43696c((zzk) C16517ez.m53832a(parcel, zzk.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(c);
                break;
            case 12:
                mo43692a((zzo) C16517ez.m53832a(parcel, zzo.CREATOR), (zzk) C16517ez.m53832a(parcel, zzk.CREATOR));
                parcel2.writeNoException();
                break;
            case 13:
                mo43691a((zzo) C16517ez.m53832a(parcel, zzo.CREATOR));
                parcel2.writeNoException();
                break;
            case 14:
                List a3 = mo43685a(parcel.readString(), parcel.readString(), C16517ez.m53836a(parcel), (zzk) C16517ez.m53832a(parcel, zzk.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(a3);
                break;
            case 15:
                List a4 = mo43684a(parcel.readString(), parcel.readString(), parcel.readString(), C16517ez.m53836a(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(a4);
                break;
            case 16:
                List a5 = mo43682a(parcel.readString(), parcel.readString(), (zzk) C16517ez.m53832a(parcel, zzk.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(a5);
                break;
            case 17:
                List a6 = mo43683a(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeTypedList(a6);
                break;
            case 18:
                mo43697d((zzk) C16517ez.m53832a(parcel, zzk.CREATOR));
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
