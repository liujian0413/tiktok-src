package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C15345b;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.gk */
public abstract class C15709gk extends bfz implements C15708gj {
    public C15709gk() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        C15706gh ghVar;
        switch (i) {
            case 2:
                String a = mo41544a();
                parcel2.writeNoException();
                parcel2.writeString(a);
                break;
            case 3:
                List f = mo41500f();
                parcel2.writeNoException();
                parcel2.writeList(f);
                break;
            case 4:
                String i3 = mo41553i();
                parcel2.writeNoException();
                parcel2.writeString(i3);
                break;
            case 5:
                C15658en j = mo41554j();
                parcel2.writeNoException();
                bga.m48615a(parcel2, (IInterface) j);
                break;
            case 6:
                String k = mo41555k();
                parcel2.writeNoException();
                parcel2.writeString(k);
                break;
            case 7:
                String l = mo41556l();
                parcel2.writeNoException();
                parcel2.writeString(l);
                break;
            case 8:
                double m = mo41557m();
                parcel2.writeNoException();
                parcel2.writeDouble(m);
                break;
            case 9:
                String n = mo41558n();
                parcel2.writeNoException();
                parcel2.writeString(n);
                break;
            case 10:
                String o = mo41559o();
                parcel2.writeNoException();
                parcel2.writeString(o);
                break;
            case 11:
                C15488ak p = mo41560p();
                parcel2.writeNoException();
                bga.m48615a(parcel2, (IInterface) p);
                break;
            case 12:
                String s = mo41563s();
                parcel2.writeNoException();
                parcel2.writeString(s);
                break;
            case 13:
                mo41566v();
                parcel2.writeNoException();
                break;
            case 14:
                C15654ej u = mo41565u();
                parcel2.writeNoException();
                bga.m48615a(parcel2, (IInterface) u);
                break;
            case 15:
                mo41545a((Bundle) bga.m48614a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 16:
                boolean b = mo41549b((Bundle) bga.m48614a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                bga.m48617a(parcel2, b);
                break;
            case 17:
                mo41550c((Bundle) bga.m48614a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 18:
                C15345b q = mo41561q();
                parcel2.writeNoException();
                bga.m48615a(parcel2, (IInterface) q);
                break;
            case 19:
                C15345b r = mo41562r();
                parcel2.writeNoException();
                bga.m48615a(parcel2, (IInterface) r);
                break;
            case 20:
                Bundle t = mo41564t();
                parcel2.writeNoException();
                bga.m48620b(parcel2, t);
                break;
            case 21:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    ghVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    if (queryLocalInterface instanceof C15706gh) {
                        ghVar = (C15706gh) queryLocalInterface;
                    } else {
                        ghVar = new C15707gi(readStrongBinder);
                    }
                }
                mo41548a(ghVar);
                parcel2.writeNoException();
                break;
            case 22:
                mo41569y();
                parcel2.writeNoException();
                break;
            case 23:
                List g = mo41551g();
                parcel2.writeNoException();
                parcel2.writeList(g);
                break;
            case 24:
                boolean h = mo41552h();
                parcel2.writeNoException();
                bga.m48617a(parcel2, h);
                break;
            case 25:
                mo41547a(C15479ah.m45850a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case BaseNotice.STORY_NOTICE_COMMENT /*26*/:
                mo41546a(C15473ae.m45671a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case BaseNotice.STORY_NOTICE_UPDATE /*27*/:
                mo41567w();
                parcel2.writeNoException();
                break;
            case 28:
                mo41568x();
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
