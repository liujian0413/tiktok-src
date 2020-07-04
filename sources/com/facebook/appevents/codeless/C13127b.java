package com.facebook.appevents.codeless;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import com.C1642a;
import com.facebook.AccessToken;
import com.facebook.C13499h;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest.C13090b;
import com.facebook.appevents.codeless.C13143f.C13144a;
import com.facebook.appevents.internal.C13173c;
import com.facebook.internal.C13892b;
import com.facebook.internal.C13924n;
import com.facebook.internal.C13926o;
import com.facebook.internal.C13967z;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.appevents.codeless.b */
public final class C13127b {

    /* renamed from: a */
    public static C13137e f34769a;

    /* renamed from: b */
    public static String f34770b;

    /* renamed from: c */
    public static Boolean f34771c = Boolean.valueOf(false);

    /* renamed from: d */
    public static volatile Boolean f34772d = Boolean.valueOf(false);

    /* renamed from: e */
    private static final C13143f f34773e = new C13143f();

    /* renamed from: f */
    private static SensorManager f34774f;

    /* renamed from: g */
    private static final AtomicBoolean f34775g = new AtomicBoolean(true);

    /* renamed from: a */
    public static void m38379a() {
        f34775g.set(true);
    }

    /* renamed from: b */
    public static void m38383b() {
        f34775g.set(false);
    }

    /* renamed from: d */
    static boolean m38387d() {
        return f34771c.booleanValue();
    }

    /* renamed from: c */
    static String m38385c() {
        if (f34770b == null) {
            f34770b = UUID.randomUUID().toString();
        }
        return f34770b;
    }

    /* renamed from: a */
    static void m38381a(Boolean bool) {
        f34771c = bool;
    }

    /* renamed from: c */
    public static void m38386c(Activity activity) {
        C13130c.m38390a().mo32303c(activity);
    }

    /* renamed from: a */
    public static void m38382a(final String str) {
        if (!f34772d.booleanValue()) {
            f34772d = Boolean.valueOf(true);
            C13499h.m39719e().execute(new Runnable() {
                public final void run() {
                    String str;
                    String str2;
                    boolean z = true;
                    GraphRequest a = GraphRequest.m38253a((AccessToken) null, C1642a.m8035a(Locale.US, "%s/app_indexing_session", new Object[]{str}), (JSONObject) null, (C13090b) null);
                    Bundle bundle = a.f34680j;
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    C13892b a2 = C13892b.m41018a(C13499h.m39721g());
                    JSONArray jSONArray = new JSONArray();
                    if (Build.MODEL != null) {
                        str = Build.MODEL;
                    } else {
                        str = "";
                    }
                    jSONArray.put(str);
                    if (a2 == null || a2.mo33547a() == null) {
                        jSONArray.put("");
                    } else {
                        jSONArray.put(a2.mo33547a());
                    }
                    jSONArray.put("0");
                    if (C13173c.m38494a()) {
                        str2 = "1";
                    } else {
                        str2 = "0";
                    }
                    jSONArray.put(str2);
                    Locale b = C13967z.m41255b();
                    StringBuilder sb = new StringBuilder();
                    sb.append(b.getLanguage());
                    sb.append("_");
                    sb.append(b.getCountry());
                    jSONArray.put(sb.toString());
                    String jSONArray2 = jSONArray.toString();
                    bundle.putString("device_session_id", C13127b.m38385c());
                    bundle.putString("extinfo", jSONArray2);
                    a.f34680j = bundle;
                    JSONObject jSONObject = a.mo31788a().f34702b;
                    if (jSONObject == null || !jSONObject.optBoolean("is_app_indexing_enabled", false)) {
                        z = false;
                    }
                    Boolean valueOf = Boolean.valueOf(z);
                    C13127b.f34771c = valueOf;
                    if (!valueOf.booleanValue()) {
                        C13127b.f34770b = null;
                    } else if (C13127b.f34769a != null) {
                        C13127b.f34769a.mo32311a();
                    }
                    C13127b.f34772d = Boolean.valueOf(false);
                }
            });
        }
    }

    /* renamed from: b */
    public static void m38384b(Activity activity) {
        if (f34775g.get()) {
            C13130c.m38390a().mo32302b(activity);
            if (f34769a != null) {
                f34769a.mo32313b();
            }
            if (f34774f != null) {
                f34774f.unregisterListener(f34773e);
            }
        }
    }

    /* renamed from: a */
    public static void m38380a(Activity activity) {
        if (f34775g.get()) {
            C13130c.m38390a().mo32300a(activity);
            Context applicationContext = activity.getApplicationContext();
            final String k = C13499h.m39725k();
            final C13924n a = C13926o.m41097a(k);
            if (a != null && a.f36848l) {
                SensorManager sensorManager = (SensorManager) applicationContext.getSystemService("sensor");
                f34774f = sensorManager;
                if (sensorManager != null) {
                    Sensor defaultSensor = f34774f.getDefaultSensor(1);
                    f34769a = new C13137e(activity);
                    f34773e.f34815a = new C13144a() {
                        /* renamed from: a */
                        public final void mo32298a() {
                            boolean z;
                            if (a == null || !a.f36848l) {
                                z = false;
                            } else {
                                z = true;
                            }
                            boolean o = C13499h.m39729o();
                            if (z && o) {
                                C13127b.m38382a(k);
                            }
                        }
                    };
                    f34774f.registerListener(f34773e, defaultSensor, 2);
                    if (a != null && a.f36848l) {
                        f34769a.mo32311a();
                    }
                }
            }
        }
    }
}
