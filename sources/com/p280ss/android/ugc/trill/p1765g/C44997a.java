package com.p280ss.android.ugc.trill.p1765g;

import android.content.Context;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.android.gms.common.GoogleApiAvailability;

/* renamed from: com.ss.android.ugc.trill.g.a */
public final class C44997a {
    /* renamed from: a */
    public static boolean m141971a() {
        return m141972a(C6399b.m19921a());
    }

    /* renamed from: b */
    public static int m141973b(Context context) {
        try {
            return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context);
        } catch (Exception unused) {
            return 1;
        }
    }

    /* renamed from: a */
    public static boolean m141972a(Context context) {
        if (m141973b(context) == 0) {
            return true;
        }
        return false;
    }
}
