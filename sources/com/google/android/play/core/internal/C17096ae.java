package com.google.android.play.core.internal;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.play.core.internal.ae */
public abstract class C17096ae extends C17106av implements C17097af {
    /* renamed from: a */
    public static C17097af m56689a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
        return queryLocalInterface instanceof C17097af ? (C17097af) queryLocalInterface : new C17099ah(iBinder);
    }
}
