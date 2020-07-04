package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import com.facebook.GraphRequest.C13090b;
import com.facebook.appevents.C13187j;
import com.facebook.internal.C13892b;
import com.facebook.internal.C13924n;
import com.facebook.internal.C13926o;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.u */
final class C14637u {

    /* renamed from: a */
    public static AtomicBoolean f37780a = new AtomicBoolean(false);

    /* renamed from: b */
    public static C14639a f37781b = new C14639a(true, "com.facebook.sdk.AdvertiserIDCollectionEnabled");

    /* renamed from: c */
    public static C14639a f37782c = new C14639a(false, "auto_event_setup_enabled");

    /* renamed from: d */
    private static final String f37783d = "com.facebook.u";

    /* renamed from: e */
    private static AtomicBoolean f37784e = new AtomicBoolean(false);

    /* renamed from: f */
    private static C14639a f37785f = new C14639a(true, "com.facebook.sdk.AutoInitEnabled");

    /* renamed from: g */
    private static C14639a f37786g = new C14639a(true, "com.facebook.sdk.AutoLogAppEventsEnabled");

    /* renamed from: h */
    private static SharedPreferences f37787h;

    /* renamed from: i */
    private static Editor f37788i;

    /* renamed from: com.facebook.u$a */
    static class C14639a {

        /* renamed from: a */
        String f37790a;

        /* renamed from: b */
        Boolean f37791b;

        /* renamed from: c */
        boolean f37792c;

        /* renamed from: d */
        long f37793d;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo36874a() {
            if (this.f37791b == null) {
                return this.f37792c;
            }
            return this.f37791b.booleanValue();
        }

        C14639a(boolean z, String str) {
            this.f37792c = z;
            this.f37790a = str;
        }
    }

    C14637u() {
    }

    /* renamed from: a */
    public static boolean m42330a() {
        m42336e();
        return f37785f.mo36874a();
    }

    /* renamed from: b */
    public static boolean m42332b() {
        m42336e();
        return f37786g.mo36874a();
    }

    /* renamed from: c */
    public static boolean m42334c() {
        m42336e();
        return f37781b.mo36874a();
    }

    /* renamed from: d */
    public static boolean m42335d() {
        m42336e();
        return f37782c.mo36874a();
    }

    /* renamed from: i */
    private static void m42340i() {
        if (!f37784e.get()) {
            throw new FacebookSdkNotInitializedException("The UserSettingManager has not been initialized successfully");
        }
    }

    /* renamed from: f */
    private static void m42337f() {
        m42331b(f37782c);
        final long currentTimeMillis = System.currentTimeMillis();
        if (f37782c.f37791b == null || currentTimeMillis - f37782c.f37793d >= 604800000) {
            f37782c.f37791b = null;
            f37782c.f37793d = 0;
            if (f37780a.compareAndSet(false, true)) {
                C13499h.m39719e().execute(new Runnable() {
                    public final void run() {
                        String str;
                        if (C14637u.f37781b.mo36874a()) {
                            C13924n a = C13926o.m41099a(C13499h.m39725k(), false);
                            if (a != null && a.f36848l) {
                                C13892b a2 = C13892b.m41018a(C13499h.m39721g());
                                if (a2 == null || a2.mo33547a() == null) {
                                    str = null;
                                } else {
                                    str = a2.mo33547a();
                                }
                                if (str != null) {
                                    Bundle bundle = new Bundle();
                                    bundle.putString("advertiser_id", a2.mo33547a());
                                    bundle.putString("fields", "auto_event_setup_enabled");
                                    GraphRequest a3 = GraphRequest.m38252a((AccessToken) null, C13499h.m39725k(), (C13090b) null);
                                    a3.f34684n = true;
                                    a3.f34680j = bundle;
                                    JSONObject jSONObject = a3.mo31788a().f34702b;
                                    if (jSONObject != null) {
                                        C14637u.f37782c.f37791b = Boolean.valueOf(jSONObject.optBoolean("auto_event_setup_enabled", false));
                                        C14637u.f37782c.f37793d = currentTimeMillis;
                                        C14637u.m42328a(C14637u.f37782c);
                                    }
                                }
                            }
                        }
                        C14637u.f37780a.set(false);
                    }
                });
            }
        }
    }

    /* renamed from: g */
    private static void m42338g() {
        try {
            Context g = C13499h.m39721g();
            ApplicationInfo a = C14640v.m42342a(g.getPackageManager(), g.getPackageName(), PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
            if (!(a == null || a.metaData == null)) {
                a.metaData.containsKey("com.facebook.sdk.AutoLogAppEventsEnabled");
                a.metaData.containsKey("com.facebook.sdk.AdvertiserIDCollectionEnabled");
                m42334c();
            }
        } catch (NameNotFoundException unused) {
        }
    }

    /* renamed from: e */
    private static void m42336e() {
        if (C13499h.m39710a() && f37784e.compareAndSet(false, true)) {
            SharedPreferences a = C7285c.m22838a(C13499h.m39721g(), "com.facebook.sdk.USER_SETTINGS", 0);
            f37787h = a;
            f37788i = a.edit();
            m42329a(f37786g, f37781b, f37785f);
            m42337f();
            m42338g();
            m42339h();
        }
    }

    /* renamed from: h */
    private static void m42339h() {
        int i;
        boolean[] zArr;
        if (f37784e.get() && C13499h.m39710a()) {
            Context g = C13499h.m39721g();
            int i2 = 0;
            int i3 = ((f37785f.mo36874a() ? 1 : 0) << false) | 0 | ((f37786g.mo36874a() ? 1 : 0) << true) | ((f37781b.mo36874a() ? 1 : 0) << true);
            int i4 = f37787h.getInt("com.facebook.sdk.USER_SETTINGS_BITMASK", 0);
            if (i4 != i3) {
                f37788i.putInt("com.facebook.sdk.USER_SETTINGS_BITMASK", i3).commit();
                try {
                    ApplicationInfo a = C14640v.m42342a(g.getPackageManager(), g.getPackageName(), PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
                    if (!(a == null || a.metaData == null)) {
                        String[] strArr = {"com.facebook.sdk.AutoInitEnabled", "com.facebook.sdk.AutoLogAppEventsEnabled", "com.facebook.sdk.AdvertiserIDCollectionEnabled"};
                        // fill-array-data instruction
                        new boolean[]{true, true, true}[0] = 1;
                        new boolean[]{true, true, true}[1] = 1;
                        new boolean[]{true, true, true}[2] = 1;
                        int i5 = 0;
                        i = 0;
                        while (i2 < 3) {
                            try {
                                i |= (a.metaData.containsKey(strArr[i2]) ? 1 : 0) << i2;
                                i5 |= (a.metaData.getBoolean(strArr[i2], zArr[i2]) ? 1 : 0) << i2;
                                i2++;
                            } catch (NameNotFoundException unused) {
                            }
                        }
                        i2 = i5;
                        C13187j jVar = new C13187j(g);
                        Bundle bundle = new Bundle();
                        bundle.putInt("usage", i);
                        bundle.putInt("initial", i2);
                        bundle.putInt("previous", i4);
                        bundle.putInt("current", i3);
                        jVar.mo32371b("fb_sdk_settings_changed", bundle);
                    }
                } catch (NameNotFoundException unused2) {
                }
                i = 0;
                C13187j jVar2 = new C13187j(g);
                Bundle bundle2 = new Bundle();
                bundle2.putInt("usage", i);
                bundle2.putInt("initial", i2);
                bundle2.putInt("previous", i4);
                bundle2.putInt("current", i3);
                jVar2.mo32371b("fb_sdk_settings_changed", bundle2);
            }
        }
    }

    /* renamed from: a */
    public static void m42328a(C14639a aVar) {
        m42340i();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("value", aVar.f37791b);
            jSONObject.put("last_timestamp", aVar.f37793d);
            f37788i.putString(aVar.f37790a, jSONObject.toString()).commit();
            m42339h();
        } catch (JSONException unused) {
        }
    }

    /* renamed from: b */
    private static void m42331b(C14639a aVar) {
        m42340i();
        try {
            String string = f37787h.getString(aVar.f37790a, "");
            if (!string.isEmpty()) {
                JSONObject jSONObject = new JSONObject(string);
                aVar.f37791b = Boolean.valueOf(jSONObject.getBoolean("value"));
                aVar.f37793d = jSONObject.getLong("last_timestamp");
            }
        } catch (JSONException unused) {
        }
    }

    /* renamed from: c */
    private static void m42333c(C14639a aVar) {
        m42340i();
        try {
            Context g = C13499h.m39721g();
            ApplicationInfo a = C14640v.m42342a(g.getPackageManager(), g.getPackageName(), PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
            if (!(a == null || a.metaData == null || !a.metaData.containsKey(aVar.f37790a))) {
                aVar.f37791b = Boolean.valueOf(a.metaData.getBoolean(aVar.f37790a, aVar.f37792c));
            }
        } catch (NameNotFoundException unused) {
        }
    }

    /* renamed from: a */
    private static void m42329a(C14639a... aVarArr) {
        for (int i = 0; i < 3; i++) {
            C14639a aVar = aVarArr[i];
            if (aVar == f37782c) {
                m42337f();
            } else if (aVar.f37791b == null) {
                m42331b(aVar);
                if (aVar.f37791b == null) {
                    m42333c(aVar);
                }
            } else {
                m42328a(aVar);
            }
        }
    }
}
