package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.maps.model.C16770b;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.p764a.C16745x;
import com.google.android.gms.maps.p764a.C16746y;

/* renamed from: com.google.android.gms.maps.e */
public final class C16757e {

    /* renamed from: a */
    private static boolean f46756a;

    /* renamed from: a */
    public static synchronized int m55294a(Context context) {
        synchronized (C16757e.class) {
            C15267r.m44385a(context, (Object) "Context is null");
            if (f46756a) {
                return 0;
            }
            try {
                C16746y a = C16745x.m55237a(context);
                try {
                    C16748b.m55258a(a.mo43358L_());
                    C16770b.m55321a(a.mo43362b());
                    f46756a = true;
                    return 0;
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                }
            } catch (GooglePlayServicesNotAvailableException e2) {
                return e2.errorCode;
            }
        }
    }
}
