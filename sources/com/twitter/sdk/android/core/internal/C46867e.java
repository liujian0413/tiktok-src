package com.twitter.sdk.android.core.internal;

import android.content.Context;

/* renamed from: com.twitter.sdk.android.core.internal.e */
final class C46867e implements C46868f {

    /* renamed from: a */
    private final Context f120177a;

    /* renamed from: b */
    private String m146594b() {
        try {
            return (String) Class.forName("com.google.android.gms.ads.b.a$a").getMethod("getId", new Class[0]).invoke(m146596d(), new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final C46859b mo117969a() {
        if (m146593a(this.f120177a)) {
            return new C46859b(m146594b(), m146595c());
        }
        return null;
    }

    /* renamed from: c */
    private boolean m146595c() {
        try {
            return ((Boolean) Class.forName("com.google.android.gms.ads.b.a$a").getMethod("isLimitAdTrackingEnabled", new Class[0]).invoke(m146596d(), new Object[0])).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: d */
    private Object m146596d() {
        try {
            return Class.forName("com.google.android.gms.ads.b.a").getMethod("getAdvertisingIdInfo", new Class[]{Context.class}).invoke(null, new Object[]{this.f120177a});
        } catch (Exception unused) {
            return null;
        }
    }

    C46867e(Context context) {
        this.f120177a = context.getApplicationContext();
    }

    /* renamed from: a */
    private static boolean m146593a(Context context) {
        try {
            if (((Integer) Class.forName("com.google.android.gms.common.d").getMethod("isGooglePlayServicesAvailable", new Class[]{Context.class}).invoke(null, new Object[]{context})).intValue() == 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
