package android.support.p029v7.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.support.p022v4.content.C0692f;
import java.util.Calendar;

/* renamed from: android.support.v7.app.h */
final class C1117h {

    /* renamed from: a */
    private static C1117h f3992a;

    /* renamed from: b */
    private final Context f3993b;

    /* renamed from: c */
    private final LocationManager f3994c;

    /* renamed from: d */
    private final C1118a f3995d = new C1118a();

    /* renamed from: android.support.v7.app.h$a */
    static class C1118a {

        /* renamed from: a */
        boolean f3996a;

        /* renamed from: b */
        long f3997b;

        /* renamed from: c */
        long f3998c;

        /* renamed from: d */
        long f3999d;

        /* renamed from: e */
        long f4000e;

        /* renamed from: f */
        long f4001f;

        C1118a() {
        }
    }

    /* renamed from: c */
    private boolean m4958c() {
        if (this.f3995d.f4001f > System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private Location m4957b() {
        Location location;
        Location location2 = null;
        if (C0692f.m2946a(this.f3993b, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            location = m4954a("network");
        } else {
            location = null;
        }
        if (C0692f.m2946a(this.f3993b, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location2 = m4954a("gps");
        }
        if (location2 == null || location == null) {
            if (location2 != null) {
                return location2;
            }
            return location;
        } else if (location2.getTime() > location.getTime()) {
            return location2;
        } else {
            return location;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo4414a() {
        C1118a aVar = this.f3995d;
        if (m4958c()) {
            return aVar.f3996a;
        }
        Location b = m4957b();
        if (b != null) {
            m4956a(b);
            return aVar.f3996a;
        }
        int i = Calendar.getInstance().get(11);
        if (i < 6 || i >= 22) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private Location m4954a(String str) {
        try {
            if (this.f3994c.isProviderEnabled(str)) {
                return this.f3994c.getLastKnownLocation(str);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: a */
    static C1117h m4955a(Context context) {
        if (f3992a == null) {
            Context applicationContext = context.getApplicationContext();
            f3992a = new C1117h(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f3992a;
    }

    /* renamed from: a */
    private void m4956a(Location location) {
        boolean z;
        long j;
        long j2;
        C1118a aVar = this.f3995d;
        long currentTimeMillis = System.currentTimeMillis();
        C1116g a = C1116g.m4952a();
        C1116g gVar = a;
        gVar.mo4413a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j3 = a.f3989a;
        gVar.mo4413a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        if (a.f3991c == 1) {
            z = true;
        } else {
            z = false;
        }
        long j4 = a.f3990b;
        long j5 = a.f3989a;
        long j6 = 86400000 + currentTimeMillis;
        long j7 = j3;
        long j8 = j5;
        long j9 = j6;
        long j10 = j4;
        boolean z2 = z;
        a.mo4413a(j9, location.getLatitude(), location.getLongitude());
        long j11 = a.f3990b;
        if (j10 == -1 || j8 == -1) {
            j = 43200000 + currentTimeMillis;
        } else {
            if (currentTimeMillis > j8) {
                j2 = 0 + j11;
            } else if (currentTimeMillis > j10) {
                j2 = 0 + j8;
            } else {
                j2 = 0 + j10;
            }
            j = j2 + 60000;
        }
        aVar.f3996a = z2;
        aVar.f3997b = j7;
        aVar.f3998c = j10;
        aVar.f3999d = j8;
        aVar.f4000e = j11;
        aVar.f4001f = j;
    }

    private C1117h(Context context, LocationManager locationManager) {
        this.f3993b = context;
        this.f3994c = locationManager;
    }
}
