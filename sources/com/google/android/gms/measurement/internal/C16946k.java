package com.google.android.gms.measurement.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.C16506eo;
import com.google.android.gms.internal.measurement.C16517ez;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.k */
public final class C16946k extends C16506eo implements C16944i {
    C16946k(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* renamed from: a */
    public final void mo43687a(zzag zzag, zzk zzk) throws RemoteException {
        Parcel a = mo42696a();
        C16517ez.m53834a(a, (Parcelable) zzag);
        C16517ez.m53834a(a, (Parcelable) zzk);
        mo42699b(1, a);
    }

    /* renamed from: a */
    public final void mo43689a(zzfv zzfv, zzk zzk) throws RemoteException {
        Parcel a = mo42696a();
        C16517ez.m53834a(a, (Parcelable) zzfv);
        C16517ez.m53834a(a, (Parcelable) zzk);
        mo42699b(2, a);
    }

    /* renamed from: a */
    public final void mo43690a(zzk zzk) throws RemoteException {
        Parcel a = mo42696a();
        C16517ez.m53834a(a, (Parcelable) zzk);
        mo42699b(4, a);
    }

    /* renamed from: a */
    public final void mo43688a(zzag zzag, String str, String str2) throws RemoteException {
        Parcel a = mo42696a();
        C16517ez.m53834a(a, (Parcelable) zzag);
        a.writeString(str);
        a.writeString(str2);
        mo42699b(5, a);
    }

    /* renamed from: b */
    public final void mo43695b(zzk zzk) throws RemoteException {
        Parcel a = mo42696a();
        C16517ez.m53834a(a, (Parcelable) zzk);
        mo42699b(6, a);
    }

    /* renamed from: a */
    public final List<zzfv> mo43681a(zzk zzk, boolean z) throws RemoteException {
        Parcel a = mo42696a();
        C16517ez.m53834a(a, (Parcelable) zzk);
        C16517ez.m53835a(a, z);
        Parcel a2 = mo42697a(7, a);
        ArrayList createTypedArrayList = a2.createTypedArrayList(zzfv.CREATOR);
        a2.recycle();
        return createTypedArrayList;
    }

    /* renamed from: a */
    public final byte[] mo43693a(zzag zzag, String str) throws RemoteException {
        Parcel a = mo42696a();
        C16517ez.m53834a(a, (Parcelable) zzag);
        a.writeString(str);
        Parcel a2 = mo42697a(9, a);
        byte[] createByteArray = a2.createByteArray();
        a2.recycle();
        return createByteArray;
    }

    /* renamed from: a */
    public final void mo43686a(long j, String str, String str2, String str3) throws RemoteException {
        Parcel a = mo42696a();
        a.writeLong(j);
        a.writeString(str);
        a.writeString(str2);
        a.writeString(str3);
        mo42699b(10, a);
    }

    /* renamed from: c */
    public final String mo43696c(zzk zzk) throws RemoteException {
        Parcel a = mo42696a();
        C16517ez.m53834a(a, (Parcelable) zzk);
        Parcel a2 = mo42697a(11, a);
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    /* renamed from: a */
    public final void mo43692a(zzo zzo, zzk zzk) throws RemoteException {
        Parcel a = mo42696a();
        C16517ez.m53834a(a, (Parcelable) zzo);
        C16517ez.m53834a(a, (Parcelable) zzk);
        mo42699b(12, a);
    }

    /* renamed from: a */
    public final void mo43691a(zzo zzo) throws RemoteException {
        Parcel a = mo42696a();
        C16517ez.m53834a(a, (Parcelable) zzo);
        mo42699b(13, a);
    }

    /* renamed from: a */
    public final List<zzfv> mo43685a(String str, String str2, boolean z, zzk zzk) throws RemoteException {
        Parcel a = mo42696a();
        a.writeString(str);
        a.writeString(str2);
        C16517ez.m53835a(a, z);
        C16517ez.m53834a(a, (Parcelable) zzk);
        Parcel a2 = mo42697a(14, a);
        ArrayList createTypedArrayList = a2.createTypedArrayList(zzfv.CREATOR);
        a2.recycle();
        return createTypedArrayList;
    }

    /* renamed from: a */
    public final List<zzfv> mo43684a(String str, String str2, String str3, boolean z) throws RemoteException {
        Parcel a = mo42696a();
        a.writeString(str);
        a.writeString(str2);
        a.writeString(str3);
        C16517ez.m53835a(a, z);
        Parcel a2 = mo42697a(15, a);
        ArrayList createTypedArrayList = a2.createTypedArrayList(zzfv.CREATOR);
        a2.recycle();
        return createTypedArrayList;
    }

    /* renamed from: a */
    public final List<zzo> mo43682a(String str, String str2, zzk zzk) throws RemoteException {
        Parcel a = mo42696a();
        a.writeString(str);
        a.writeString(str2);
        C16517ez.m53834a(a, (Parcelable) zzk);
        Parcel a2 = mo42697a(16, a);
        ArrayList createTypedArrayList = a2.createTypedArrayList(zzo.CREATOR);
        a2.recycle();
        return createTypedArrayList;
    }

    /* renamed from: a */
    public final List<zzo> mo43683a(String str, String str2, String str3) throws RemoteException {
        Parcel a = mo42696a();
        a.writeString(str);
        a.writeString(str2);
        a.writeString(str3);
        Parcel a2 = mo42697a(17, a);
        ArrayList createTypedArrayList = a2.createTypedArrayList(zzo.CREATOR);
        a2.recycle();
        return createTypedArrayList;
    }

    /* renamed from: d */
    public final void mo43697d(zzk zzk) throws RemoteException {
        Parcel a = mo42696a();
        C16517ez.m53834a(a, (Parcelable) zzk);
        mo42699b(18, a);
    }
}
