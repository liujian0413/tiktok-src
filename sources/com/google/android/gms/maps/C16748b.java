package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.p764a.C16717a;

/* renamed from: com.google.android.gms.maps.b */
public final class C16748b {

    /* renamed from: a */
    private static C16717a f46745a;

    /* renamed from: a */
    private static C16717a m55254a() {
        return (C16717a) C15267r.m44385a(f46745a, (Object) "CameraUpdateFactory is not initialized");
    }

    /* renamed from: a */
    public static C16716a m55255a(float f) {
        try {
            return new C16716a(m55254a().mo43307a(13.0f));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: a */
    public static C16716a m55256a(LatLng latLng) {
        try {
            return new C16716a(m55254a().mo43308a(latLng));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: a */
    public static C16716a m55257a(LatLng latLng, float f) {
        try {
            return new C16716a(m55254a().mo43309a(latLng, f));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: a */
    public static void m55258a(C16717a aVar) {
        f46745a = (C16717a) C15267r.m44384a(aVar);
    }
}
