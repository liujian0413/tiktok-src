package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.si */
public final class C16031si extends bfz implements C16030sh {
    /* renamed from: a */
    public static C16030sh m52114a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManager");
        if (queryLocalInterface instanceof C16030sh) {
            return (C16030sh) queryLocalInterface;
        }
        return new C16032sj(iBinder);
    }
}
