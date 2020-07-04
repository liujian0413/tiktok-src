package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C15345b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.z */
public final class C16210z extends bfy implements C16156x {
    C16210z(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    /* renamed from: a */
    public final void mo37853a() throws RemoteException {
        mo40589b(1, mo40591z());
    }

    /* renamed from: a */
    public final void mo37854a(float f) throws RemoteException {
        Parcel z = mo40591z();
        z.writeFloat(f);
        mo40589b(2, z);
    }

    /* renamed from: a */
    public final void mo37859a(String str) throws RemoteException {
        Parcel z = mo40591z();
        z.writeString(str);
        mo40589b(3, z);
    }

    /* renamed from: a */
    public final void mo37861a(boolean z) throws RemoteException {
        Parcel z2 = mo40591z();
        bga.m48617a(z2, z);
        mo40589b(4, z2);
    }

    /* renamed from: a */
    public final void mo37855a(C15345b bVar, String str) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) bVar);
        z.writeString(str);
        mo40589b(5, z);
    }

    /* renamed from: a */
    public final void mo37860a(String str, C15345b bVar) throws RemoteException {
        Parcel z = mo40591z();
        z.writeString(str);
        bga.m48615a(z, (IInterface) bVar);
        mo40589b(6, z);
    }

    /* renamed from: b */
    public final float mo37862b() throws RemoteException {
        Parcel a = mo40587a(7, mo40591z());
        float readFloat = a.readFloat();
        a.recycle();
        return readFloat;
    }

    /* renamed from: c */
    public final boolean mo37864c() throws RemoteException {
        Parcel a = mo40587a(8, mo40591z());
        boolean a2 = bga.m48618a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: d */
    public final String mo37865d() throws RemoteException {
        Parcel a = mo40587a(9, mo40591z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: b */
    public final void mo37863b(String str) throws RemoteException {
        Parcel z = mo40591z();
        z.writeString(str);
        mo40589b(10, z);
    }

    /* renamed from: a */
    public final void mo37857a(C15931oq oqVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) oqVar);
        mo40589b(11, z);
    }

    /* renamed from: a */
    public final void mo37856a(C15782jc jcVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) jcVar);
        mo40589b(12, z);
    }

    /* renamed from: e */
    public final List<zzaki> mo37866e() throws RemoteException {
        Parcel a = mo40587a(13, mo40591z());
        ArrayList createTypedArrayList = a.createTypedArrayList(zzaki.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }
}
