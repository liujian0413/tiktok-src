package com.facebook.appevents.internal;

import android.os.Bundle;
import com.C1642a;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger.FlushBehavior;
import com.facebook.appevents.C13187j;
import com.facebook.internal.C13949t;
import java.util.Locale;

/* renamed from: com.facebook.appevents.internal.i */
class C13185i {

    /* renamed from: a */
    private static final String f34927a = C13185i.class.getCanonicalName();

    /* renamed from: b */
    private static final long[] f34928b = {300000, 900000, 1800000, 3600000, 21600000, 43200000, 86400000, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};

    C13185i() {
    }

    /* renamed from: a */
    private static void m38536a() {
        C13949t.m41130a(LoggingBehavior.APP_EVENTS, f34927a, "Clock skew detected");
    }

    /* renamed from: a */
    private static int m38535a(long j) {
        int i = 0;
        while (i < f34928b.length && f34928b[i] < j) {
            i++;
        }
        return i;
    }

    /* renamed from: a */
    public static void m38538a(String str, C13186j jVar, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("fb_mobile_launch_source", "Unclassified");
        C13187j jVar2 = new C13187j(str, str2, null);
        jVar2.mo32366a("fb_mobile_activate_app", bundle);
        if (C13187j.m38542a() != FlushBehavior.EXPLICIT_ONLY) {
            jVar2.mo32370b();
        }
    }

    /* renamed from: a */
    public static void m38537a(String str, C13184h hVar, String str2) {
        String str3;
        Long valueOf = Long.valueOf(hVar.mo32359d() - hVar.f34922b.longValue());
        if (valueOf.longValue() < 0) {
            valueOf = Long.valueOf(0);
            m38536a();
        }
        Long valueOf2 = Long.valueOf(hVar.mo32360e());
        if (valueOf2.longValue() < 0) {
            m38536a();
            valueOf2 = Long.valueOf(0);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("fb_mobile_app_interruptions", hVar.f34923c);
        bundle.putString("fb_mobile_time_between_sessions", C1642a.m8035a(Locale.ROOT, "session_quanta_%d", new Object[]{Integer.valueOf(m38535a(valueOf.longValue()))}));
        C13186j jVar = hVar.f34924d;
        if (jVar != null) {
            str3 = jVar.toString();
        } else {
            str3 = "Unclassified";
        }
        bundle.putString("fb_mobile_launch_source", str3);
        bundle.putLong("_logTime", hVar.f34922b.longValue() / 1000);
        double longValue = (double) valueOf2.longValue();
        Double.isNaN(longValue);
        new C13187j(str, str2, null).mo32365a("fb_mobile_deactivate_app", longValue / 1000.0d, bundle);
    }
}
