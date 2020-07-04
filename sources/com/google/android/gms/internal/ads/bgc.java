package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class bgc extends bfz implements bgb {
    /* renamed from: a */
    public static bgb m48629a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.clearcut.IClearcut");
        if (queryLocalInterface instanceof bgb) {
            return (bgb) queryLocalInterface;
        }
        return new bgd(iBinder);
    }
}
