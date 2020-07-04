package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* renamed from: com.google.android.play.core.internal.ai */
public abstract class C17100ai extends C17106av implements C17098ag {
    public C17100ai() {
        super("com.google.android.play.core.splitinstall.protocol.ISplitInstallServiceCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo44352a(int i, Parcel parcel) throws RemoteException {
        switch (i) {
            case 2:
                mo44342a(parcel.readInt(), (Bundle) C17105au.m56718a(parcel, Bundle.CREATOR));
                break;
            case 3:
                int readInt = parcel.readInt();
                C17105au.m56718a(parcel, Bundle.CREATOR);
                mo44341a(readInt);
                break;
            case 4:
                mo44346b(parcel.readInt(), (Bundle) C17105au.m56718a(parcel, Bundle.CREATOR));
                break;
            case 5:
                mo44348c(parcel.readInt(), (Bundle) C17105au.m56718a(parcel, Bundle.CREATOR));
                break;
            case 6:
                mo44343a((Bundle) C17105au.m56718a(parcel, Bundle.CREATOR));
                break;
            case 7:
                mo44344a((List<Bundle>) parcel.createTypedArrayList(Bundle.CREATOR));
                break;
            case 8:
                mo44347b((Bundle) C17105au.m56718a(parcel, Bundle.CREATOR));
                break;
            case 9:
                mo44349c((Bundle) C17105au.m56718a(parcel, Bundle.CREATOR));
                break;
            case 10:
                C17105au.m56718a(parcel, Bundle.CREATOR);
                mo44340a();
                break;
            case 11:
                C17105au.m56718a(parcel, Bundle.CREATOR);
                mo44345b();
                break;
            case 12:
                mo44350d((Bundle) C17105au.m56718a(parcel, Bundle.CREATOR));
                break;
            case 13:
                mo44351e((Bundle) C17105au.m56718a(parcel, Bundle.CREATOR));
                break;
            default:
                return false;
        }
        return true;
    }
}
