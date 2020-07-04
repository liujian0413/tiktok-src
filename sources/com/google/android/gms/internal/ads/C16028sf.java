package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.sf */
public final class C16028sf extends bfz implements C16027se {
    /* renamed from: a */
    public static C16027se m52113a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
        if (queryLocalInterface instanceof C16027se) {
            return (C16027se) queryLocalInterface;
        }
        return new C16029sg(iBinder);
    }
}
