package com.google.android.gms.ads.measurement;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C15345b;
import com.google.android.gms.dynamic.C15345b.C15346a;
import com.google.android.gms.internal.ads.bfz;
import com.google.android.gms.internal.ads.bga;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.measurement.a */
public interface C14876a extends IInterface {

    /* renamed from: com.google.android.gms.ads.measurement.a$a */
    public static abstract class C14877a extends bfz implements C14876a {
        public C14877a() {
            super("com.google.android.gms.ads.measurement.IAppMeasurementProxy");
        }

        public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case 1:
                    mo37884a((Bundle) bga.m48614a(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 2:
                    Bundle b = mo37888b((Bundle) bga.m48614a(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    bga.m48620b(parcel2, b);
                    break;
                case 3:
                    mo37886a(parcel.readString(), parcel.readString(), (Bundle) bga.m48614a(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 4:
                    mo37887a(parcel.readString(), parcel.readString(), C15346a.m44656a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                case 5:
                    Map a = mo37883a(parcel.readString(), parcel.readString(), bga.m48618a(parcel));
                    parcel2.writeNoException();
                    parcel2.writeMap(a);
                    break;
                case 6:
                    int a2 = mo37880a(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(a2);
                    break;
                case 7:
                    mo37893c((Bundle) bga.m48614a(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 8:
                    mo37891b(parcel.readString(), parcel.readString(), (Bundle) bga.m48614a(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 9:
                    List a3 = mo37882a(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeList(a3);
                    break;
                case 10:
                    String a4 = mo37881a();
                    parcel2.writeNoException();
                    parcel2.writeString(a4);
                    break;
                case 11:
                    String b2 = mo37889b();
                    parcel2.writeNoException();
                    parcel2.writeString(b2);
                    break;
                case 12:
                    long c = mo37892c();
                    parcel2.writeNoException();
                    parcel2.writeLong(c);
                    break;
                case 13:
                    mo37890b(parcel.readString());
                    parcel2.writeNoException();
                    break;
                case 14:
                    mo37894c(parcel.readString());
                    parcel2.writeNoException();
                    break;
                case 15:
                    mo37885a(C15346a.m44656a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    break;
                case 16:
                    String d = mo37895d();
                    parcel2.writeNoException();
                    parcel2.writeString(d);
                    break;
                case 17:
                    String e = mo37896e();
                    parcel2.writeNoException();
                    parcel2.writeString(e);
                    break;
                case 18:
                    String f = mo37897f();
                    parcel2.writeNoException();
                    parcel2.writeString(f);
                    break;
                default:
                    return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    int mo37880a(String str) throws RemoteException;

    /* renamed from: a */
    String mo37881a() throws RemoteException;

    /* renamed from: a */
    List mo37882a(String str, String str2) throws RemoteException;

    /* renamed from: a */
    Map mo37883a(String str, String str2, boolean z) throws RemoteException;

    /* renamed from: a */
    void mo37884a(Bundle bundle) throws RemoteException;

    /* renamed from: a */
    void mo37885a(C15345b bVar, String str, String str2) throws RemoteException;

    /* renamed from: a */
    void mo37886a(String str, String str2, Bundle bundle) throws RemoteException;

    /* renamed from: a */
    void mo37887a(String str, String str2, C15345b bVar) throws RemoteException;

    /* renamed from: b */
    Bundle mo37888b(Bundle bundle) throws RemoteException;

    /* renamed from: b */
    String mo37889b() throws RemoteException;

    /* renamed from: b */
    void mo37890b(String str) throws RemoteException;

    /* renamed from: b */
    void mo37891b(String str, String str2, Bundle bundle) throws RemoteException;

    /* renamed from: c */
    long mo37892c() throws RemoteException;

    /* renamed from: c */
    void mo37893c(Bundle bundle) throws RemoteException;

    /* renamed from: c */
    void mo37894c(String str) throws RemoteException;

    /* renamed from: d */
    String mo37895d() throws RemoteException;

    /* renamed from: e */
    String mo37896e() throws RemoteException;

    /* renamed from: f */
    String mo37897f() throws RemoteException;
}
