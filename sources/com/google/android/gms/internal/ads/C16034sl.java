package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.sl */
public final class C16034sl extends bfz implements C16033sk {
    /* renamed from: a */
    public static C16033sk m52115a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
        if (queryLocalInterface instanceof C16033sk) {
            return (C16033sk) queryLocalInterface;
        }
        return new C16036sn(iBinder);
    }
}
