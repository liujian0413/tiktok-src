package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C15345b;
import com.google.android.gms.dynamic.C15345b.C15346a;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.ov */
public abstract class C15936ov extends bfz implements C15935ou {
    public C15936ov() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        C15938ox oxVar = null;
        switch (i) {
            case 1:
                C15345b a = C15346a.m44656a(parcel.readStrongBinder());
                zzyz zzyz = (zzyz) bga.m48614a(parcel, zzyz.CREATOR);
                zzyv zzyv = (zzyv) bga.m48614a(parcel, zzyv.CREATOR);
                String readString = parcel.readString();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface instanceof C15938ox) {
                        oxVar = (C15938ox) queryLocalInterface;
                    } else {
                        oxVar = new C15940oz(readStrongBinder);
                    }
                }
                mo41823a(a, zzyz, zzyv, readString, oxVar);
                parcel2.writeNoException();
                break;
            case 2:
                C15345b a2 = mo41815a();
                parcel2.writeNoException();
                bga.m48615a(parcel2, (IInterface) a2);
                break;
            case 3:
                C15345b a3 = C15346a.m44656a(parcel.readStrongBinder());
                zzyv zzyv2 = (zzyv) bga.m48614a(parcel, zzyv.CREATOR);
                String readString2 = parcel.readString();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface2 instanceof C15938ox) {
                        oxVar = (C15938ox) queryLocalInterface2;
                    } else {
                        oxVar = new C15940oz(readStrongBinder2);
                    }
                }
                mo41819a(a3, zzyv2, readString2, oxVar);
                parcel2.writeNoException();
                break;
            case 4:
                mo41828b();
                parcel2.writeNoException();
                break;
            case 5:
                mo41831c();
                parcel2.writeNoException();
                break;
            case 6:
                C15345b a4 = C15346a.m44656a(parcel.readStrongBinder());
                zzyz zzyz2 = (zzyz) bga.m48614a(parcel, zzyz.CREATOR);
                zzyv zzyv3 = (zzyv) bga.m48614a(parcel, zzyv.CREATOR);
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface3 instanceof C15938ox) {
                        oxVar = (C15938ox) queryLocalInterface3;
                    } else {
                        oxVar = new C15940oz(readStrongBinder3);
                    }
                }
                mo41824a(a4, zzyz2, zzyv3, readString3, readString4, oxVar);
                parcel2.writeNoException();
                break;
            case 7:
                C15345b a5 = C15346a.m44656a(parcel.readStrongBinder());
                zzyv zzyv4 = (zzyv) bga.m48614a(parcel, zzyv.CREATOR);
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface4 instanceof C15938ox) {
                        oxVar = (C15938ox) queryLocalInterface4;
                    } else {
                        oxVar = new C15940oz(readStrongBinder4);
                    }
                }
                mo41821a(a5, zzyv4, readString5, readString6, oxVar);
                parcel2.writeNoException();
                break;
            case 8:
                mo41832d();
                parcel2.writeNoException();
                break;
            case 9:
                mo41833e();
                parcel2.writeNoException();
                break;
            case 10:
                mo41820a(C15346a.m44656a(parcel.readStrongBinder()), (zzyv) bga.m48614a(parcel, zzyv.CREATOR), parcel.readString(), C16220zj.m52605a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                break;
            case 11:
                mo41825a((zzyv) bga.m48614a(parcel, zzyv.CREATOR), parcel.readString());
                parcel2.writeNoException();
                break;
            case 12:
                mo41834f();
                parcel2.writeNoException();
                break;
            case 13:
                boolean g = mo41835g();
                parcel2.writeNoException();
                bga.m48617a(parcel2, g);
                break;
            case 14:
                C15345b a6 = C15346a.m44656a(parcel.readStrongBinder());
                zzyv zzyv5 = (zzyv) bga.m48614a(parcel, zzyv.CREATOR);
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface5 instanceof C15938ox) {
                        oxVar = (C15938ox) queryLocalInterface5;
                    } else {
                        oxVar = new C15940oz(readStrongBinder5);
                    }
                }
                mo41822a(a6, zzyv5, readString7, readString8, oxVar, (zzafl) bga.m48614a(parcel, zzafl.CREATOR), parcel.createStringArrayList());
                parcel2.writeNoException();
                break;
            case 15:
                C15945pd h = mo41836h();
                parcel2.writeNoException();
                bga.m48615a(parcel2, (IInterface) h);
                break;
            case 16:
                C15948pg i3 = mo41837i();
                parcel2.writeNoException();
                bga.m48615a(parcel2, (IInterface) i3);
                break;
            case 17:
                Bundle j = mo41838j();
                parcel2.writeNoException();
                bga.m48620b(parcel2, j);
                break;
            case 18:
                Bundle k = mo41839k();
                parcel2.writeNoException();
                bga.m48620b(parcel2, k);
                break;
            case 19:
                Bundle l = mo41840l();
                parcel2.writeNoException();
                bga.m48620b(parcel2, l);
                break;
            case 20:
                mo41826a((zzyv) bga.m48614a(parcel, zzyv.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                break;
            case 21:
                mo41816a(C15346a.m44656a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 22:
                boolean m = mo41841m();
                parcel2.writeNoException();
                bga.m48617a(parcel2, m);
                break;
            case 23:
                mo41818a(C15346a.m44656a(parcel.readStrongBinder()), C16220zj.m52605a(parcel.readStrongBinder()), (List<String>) parcel.createStringArrayList());
                parcel2.writeNoException();
                break;
            case 24:
                C15682fk n = mo41842n();
                parcel2.writeNoException();
                bga.m48615a(parcel2, (IInterface) n);
                break;
            case 25:
                mo41827a(bga.m48618a(parcel));
                parcel2.writeNoException();
                break;
            case BaseNotice.STORY_NOTICE_COMMENT /*26*/:
                C15488ak o = mo41843o();
                parcel2.writeNoException();
                bga.m48615a(parcel2, (IInterface) o);
                break;
            case BaseNotice.STORY_NOTICE_UPDATE /*27*/:
                C15951pj p = mo41844p();
                parcel2.writeNoException();
                bga.m48615a(parcel2, (IInterface) p);
                break;
            case 28:
                C15345b a7 = C15346a.m44656a(parcel.readStrongBinder());
                zzyv zzyv6 = (zzyv) bga.m48614a(parcel, zzyv.CREATOR);
                String readString9 = parcel.readString();
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface6 instanceof C15938ox) {
                        oxVar = (C15938ox) queryLocalInterface6;
                    } else {
                        oxVar = new C15940oz(readStrongBinder6);
                    }
                }
                mo41830b(a7, zzyv6, readString9, oxVar);
                parcel2.writeNoException();
                break;
            case 30:
                mo41829b(C15346a.m44656a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 31:
                mo41817a(C15346a.m44656a(parcel.readStrongBinder()), C15780ja.m51100a(parcel.readStrongBinder()), (List<zzakq>) parcel.createTypedArrayList(zzakq.CREATOR));
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
