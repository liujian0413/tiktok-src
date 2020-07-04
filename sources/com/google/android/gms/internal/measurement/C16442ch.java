package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C15345b;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.ch */
public final class C16442ch extends C16506eo implements C16440cf {
    C16442ch(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    /* renamed from: a */
    public final void mo42584a(C15345b bVar, zzdy zzdy, long j) throws RemoteException {
        Parcel a = mo42696a();
        C16517ez.m53833a(a, (IInterface) bVar);
        C16517ez.m53834a(a, (Parcelable) zzdy);
        a.writeLong(j);
        mo42699b(1, a);
    }

    /* renamed from: a */
    public final void mo42594a(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        Parcel a = mo42696a();
        a.writeString(str);
        a.writeString(str2);
        C16517ez.m53834a(a, (Parcelable) bundle);
        C16517ez.m53835a(a, z);
        C16517ez.m53835a(a, z2);
        a.writeLong(j);
        mo42699b(2, a);
    }

    /* renamed from: a */
    public final void mo42593a(String str, String str2, Bundle bundle, C16443ci ciVar, long j) throws RemoteException {
        Parcel a = mo42696a();
        a.writeString(str);
        a.writeString(str2);
        C16517ez.m53834a(a, (Parcelable) bundle);
        C16517ez.m53833a(a, (IInterface) ciVar);
        a.writeLong(j);
        mo42699b(3, a);
    }

    /* renamed from: a */
    public final void mo42595a(String str, String str2, C15345b bVar, boolean z, long j) throws RemoteException {
        Parcel a = mo42696a();
        a.writeString(str);
        a.writeString(str2);
        C16517ez.m53833a(a, (IInterface) bVar);
        C16517ez.m53835a(a, z);
        a.writeLong(j);
        mo42699b(4, a);
    }

    /* renamed from: a */
    public final void mo42597a(String str, String str2, boolean z, C16443ci ciVar) throws RemoteException {
        Parcel a = mo42696a();
        a.writeString(str);
        a.writeString(str2);
        C16517ez.m53835a(a, z);
        C16517ez.m53833a(a, (IInterface) ciVar);
        mo42699b(5, a);
    }

    /* renamed from: a */
    public final void mo42591a(String str, C16443ci ciVar) throws RemoteException {
        Parcel a = mo42696a();
        a.writeString(str);
        C16517ez.m53833a(a, (IInterface) ciVar);
        mo42699b(6, a);
    }

    /* renamed from: a */
    public final void mo42590a(String str, long j) throws RemoteException {
        Parcel a = mo42696a();
        a.writeString(str);
        a.writeLong(j);
        mo42699b(7, a);
    }

    /* renamed from: a */
    public final void mo42579a(Bundle bundle, long j) throws RemoteException {
        Parcel a = mo42696a();
        C16517ez.m53834a(a, (Parcelable) bundle);
        a.writeLong(j);
        mo42699b(8, a);
    }

    /* renamed from: a */
    public final void mo42592a(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel a = mo42696a();
        a.writeString(str);
        a.writeString(str2);
        C16517ez.m53834a(a, (Parcelable) bundle);
        mo42699b(9, a);
    }

    /* renamed from: a */
    public final void mo42596a(String str, String str2, C16443ci ciVar) throws RemoteException {
        Parcel a = mo42696a();
        a.writeString(str);
        a.writeString(str2);
        C16517ez.m53833a(a, (IInterface) ciVar);
        mo42699b(10, a);
    }

    /* renamed from: a */
    public final void mo42599a(boolean z, long j) throws RemoteException {
        Parcel a = mo42696a();
        C16517ez.m53835a(a, z);
        a.writeLong(j);
        mo42699b(11, a);
    }

    /* renamed from: a */
    public final void mo42578a(long j) throws RemoteException {
        Parcel a = mo42696a();
        a.writeLong(j);
        mo42699b(12, a);
    }

    /* renamed from: b */
    public final void mo42600b(long j) throws RemoteException {
        Parcel a = mo42696a();
        a.writeLong(j);
        mo42699b(13, a);
    }

    /* renamed from: c */
    public final void mo42605c(long j) throws RemoteException {
        Parcel a = mo42696a();
        a.writeLong(j);
        mo42699b(14, a);
    }

    /* renamed from: a */
    public final void mo42585a(C15345b bVar, String str, String str2, long j) throws RemoteException {
        Parcel a = mo42696a();
        C16517ez.m53833a(a, (IInterface) bVar);
        a.writeString(str);
        a.writeString(str2);
        a.writeLong(j);
        mo42699b(15, a);
    }

    /* renamed from: a */
    public final void mo42586a(C16443ci ciVar) throws RemoteException {
        Parcel a = mo42696a();
        C16517ez.m53833a(a, (IInterface) ciVar);
        mo42699b(16, a);
    }

    /* renamed from: b */
    public final void mo42602b(C16443ci ciVar) throws RemoteException {
        Parcel a = mo42696a();
        C16517ez.m53833a(a, (IInterface) ciVar);
        mo42699b(17, a);
    }

    /* renamed from: a */
    public final void mo42589a(C16448cn cnVar) throws RemoteException {
        Parcel a = mo42696a();
        C16517ez.m53833a(a, (IInterface) cnVar);
        mo42699b(18, a);
    }

    /* renamed from: c */
    public final void mo42607c(C16443ci ciVar) throws RemoteException {
        Parcel a = mo42696a();
        C16517ez.m53833a(a, (IInterface) ciVar);
        mo42699b(19, a);
    }

    /* renamed from: d */
    public final void mo42611d(C16443ci ciVar) throws RemoteException {
        Parcel a = mo42696a();
        C16517ez.m53833a(a, (IInterface) ciVar);
        mo42699b(20, a);
    }

    /* renamed from: e */
    public final void mo42613e(C16443ci ciVar) throws RemoteException {
        Parcel a = mo42696a();
        C16517ez.m53833a(a, (IInterface) ciVar);
        mo42699b(21, a);
    }

    /* renamed from: f */
    public final void mo42614f(C16443ci ciVar) throws RemoteException {
        Parcel a = mo42696a();
        C16517ez.m53833a(a, (IInterface) ciVar);
        mo42699b(22, a);
    }

    /* renamed from: b */
    public final void mo42604b(String str, long j) throws RemoteException {
        Parcel a = mo42696a();
        a.writeString(str);
        a.writeLong(j);
        mo42699b(23, a);
    }

    /* renamed from: c */
    public final void mo42609c(String str, long j) throws RemoteException {
        Parcel a = mo42696a();
        a.writeString(str);
        a.writeLong(j);
        mo42699b(24, a);
    }

    /* renamed from: a */
    public final void mo42581a(C15345b bVar, long j) throws RemoteException {
        Parcel a = mo42696a();
        C16517ez.m53833a(a, (IInterface) bVar);
        a.writeLong(j);
        mo42699b(25, a);
    }

    /* renamed from: b */
    public final void mo42601b(C15345b bVar, long j) throws RemoteException {
        Parcel a = mo42696a();
        C16517ez.m53833a(a, (IInterface) bVar);
        a.writeLong(j);
        mo42699b(26, a);
    }

    /* renamed from: a */
    public final void mo42582a(C15345b bVar, Bundle bundle, long j) throws RemoteException {
        Parcel a = mo42696a();
        C16517ez.m53833a(a, (IInterface) bVar);
        C16517ez.m53834a(a, (Parcelable) bundle);
        a.writeLong(j);
        mo42699b(27, a);
    }

    /* renamed from: c */
    public final void mo42606c(C15345b bVar, long j) throws RemoteException {
        Parcel a = mo42696a();
        C16517ez.m53833a(a, (IInterface) bVar);
        a.writeLong(j);
        mo42699b(28, a);
    }

    /* renamed from: d */
    public final void mo42610d(C15345b bVar, long j) throws RemoteException {
        Parcel a = mo42696a();
        C16517ez.m53833a(a, (IInterface) bVar);
        a.writeLong(j);
        mo42699b(29, a);
    }

    /* renamed from: e */
    public final void mo42612e(C15345b bVar, long j) throws RemoteException {
        Parcel a = mo42696a();
        C16517ez.m53833a(a, (IInterface) bVar);
        a.writeLong(j);
        mo42699b(30, a);
    }

    /* renamed from: a */
    public final void mo42583a(C15345b bVar, C16443ci ciVar, long j) throws RemoteException {
        Parcel a = mo42696a();
        C16517ez.m53833a(a, (IInterface) bVar);
        C16517ez.m53833a(a, (IInterface) ciVar);
        a.writeLong(j);
        mo42699b(31, a);
    }

    /* renamed from: a */
    public final void mo42580a(Bundle bundle, C16443ci ciVar, long j) throws RemoteException {
        Parcel a = mo42696a();
        C16517ez.m53834a(a, (Parcelable) bundle);
        C16517ez.m53833a(a, (IInterface) ciVar);
        a.writeLong(j);
        mo42699b(32, a);
    }

    /* renamed from: a */
    public final void mo42577a(int i, String str, C15345b bVar, C15345b bVar2, C15345b bVar3) throws RemoteException {
        Parcel a = mo42696a();
        a.writeInt(i);
        a.writeString(str);
        C16517ez.m53833a(a, (IInterface) bVar);
        C16517ez.m53833a(a, (IInterface) bVar2);
        C16517ez.m53833a(a, (IInterface) bVar3);
        mo42699b(33, a);
    }

    /* renamed from: a */
    public final void mo42588a(C16446cl clVar) throws RemoteException {
        Parcel a = mo42696a();
        C16517ez.m53833a(a, (IInterface) clVar);
        mo42699b(34, a);
    }

    /* renamed from: b */
    public final void mo42603b(C16446cl clVar) throws RemoteException {
        Parcel a = mo42696a();
        C16517ez.m53833a(a, (IInterface) clVar);
        mo42699b(35, a);
    }

    /* renamed from: c */
    public final void mo42608c(C16446cl clVar) throws RemoteException {
        Parcel a = mo42696a();
        C16517ez.m53833a(a, (IInterface) clVar);
        mo42699b(36, a);
    }

    /* renamed from: a */
    public final void mo42598a(Map map) throws RemoteException {
        Parcel a = mo42696a();
        a.writeMap(map);
        mo42699b(37, a);
    }

    /* renamed from: a */
    public final void mo42587a(C16443ci ciVar, int i) throws RemoteException {
        Parcel a = mo42696a();
        C16517ez.m53833a(a, (IInterface) ciVar);
        a.writeInt(i);
        mo42699b(38, a);
    }
}
