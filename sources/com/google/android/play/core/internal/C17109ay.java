package com.google.android.play.core.internal;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.play.core.internal.ay */
public abstract class C17109ay extends C17106av implements C17107aw {
    /* renamed from: a */
    public static C17107aw m56726a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        return queryLocalInterface instanceof C17107aw ? (C17107aw) queryLocalInterface : new C17108ax(iBinder);
    }
}
