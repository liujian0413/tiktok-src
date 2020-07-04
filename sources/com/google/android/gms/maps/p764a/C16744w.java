package com.google.android.gms.maps.p764a;

import android.os.Bundle;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.maps.a.w */
public final class C16744w {
    private C16744w() {
    }

    /* renamed from: a */
    private static <T extends Parcelable> T m55234a(Bundle bundle, String str) {
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(C16744w.class.getClassLoader());
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(C16744w.class.getClassLoader());
        return bundle2.getParcelable(str);
    }

    /* renamed from: a */
    public static void m55235a(Bundle bundle, Bundle bundle2) {
        if (bundle != null && bundle2 != null) {
            Parcelable a = m55234a(bundle, "MapOptions");
            if (a != null) {
                m55236a(bundle2, "MapOptions", a);
            }
            Parcelable a2 = m55234a(bundle, "StreetViewPanoramaOptions");
            if (a2 != null) {
                m55236a(bundle2, "StreetViewPanoramaOptions", a2);
            }
            Parcelable a3 = m55234a(bundle, "camera");
            if (a3 != null) {
                m55236a(bundle2, "camera", a3);
            }
            if (bundle.containsKey("position")) {
                bundle2.putString("position", bundle.getString("position"));
            }
            if (bundle.containsKey("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT")) {
                bundle2.putBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", bundle.getBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", false));
            }
        }
    }

    /* renamed from: a */
    public static void m55236a(Bundle bundle, String str, Parcelable parcelable) {
        bundle.setClassLoader(C16744w.class.getClassLoader());
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.setClassLoader(C16744w.class.getClassLoader());
        bundle2.putParcelable(str, parcelable);
        bundle.putBundle("map_state", bundle2);
    }
}
