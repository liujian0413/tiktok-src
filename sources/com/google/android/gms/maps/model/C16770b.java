package com.google.android.gms.maps.model;

import android.graphics.Bitmap;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.internal.p763e.C16374g;

/* renamed from: com.google.android.gms.maps.model.b */
public final class C16770b {

    /* renamed from: a */
    private static C16374g f46882a;

    /* renamed from: a */
    private static C16374g m55319a() {
        return (C16374g) C15267r.m44385a(f46882a, (Object) "IBitmapDescriptorFactory is not initialized");
    }

    /* renamed from: a */
    public static C16769a m55320a(Bitmap bitmap) {
        try {
            return new C16769a(m55319a().mo42465a(bitmap));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: a */
    public static void m55321a(C16374g gVar) {
        if (f46882a == null) {
            f46882a = (C16374g) C15267r.m44384a(gVar);
        }
    }
}
