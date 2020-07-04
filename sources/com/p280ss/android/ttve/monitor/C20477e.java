package com.p280ss.android.ttve.monitor;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.vesdk.p1776d.C45306a;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ttve.monitor.e */
public final class C20477e {

    /* renamed from: a */
    public static volatile boolean f55333a = false;

    /* renamed from: b */
    public static final Object f55334b = new Object();

    /* renamed from: c */
    public static boolean f55335c = false;

    /* renamed from: d */
    private static boolean f55336d = true;

    /* renamed from: e */
    private static Thread f55337e;

    /* renamed from: a */
    public static String m67931a() {
        return m67943d("device_id");
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x000b */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x000b A[LOOP:0: B:6:0x000b->B:18:0x000b, LOOP_START, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m67940b() {
        /*
            boolean r0 = f55335c
            if (r0 == 0) goto L_0x001d
            boolean r0 = f55333a
            if (r0 != 0) goto L_0x001d
            java.lang.Object r0 = f55334b
            monitor-enter(r0)
        L_0x000b:
            boolean r1 = f55333a     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x0018
            java.lang.System.currentTimeMillis()     // Catch:{ InterruptedException -> 0x000b }
            java.lang.Object r1 = f55334b     // Catch:{ InterruptedException -> 0x000b }
            r1.wait()     // Catch:{ InterruptedException -> 0x000b }
            goto L_0x000b
        L_0x0018:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return
        L_0x001a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r1
        L_0x001d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ttve.monitor.C20477e.m67940b():void");
    }

    /* renamed from: a */
    public static void m67932a(int i) {
        C20475d.m67925a(i);
    }

    /* renamed from: b */
    public static void m67941b(String str) {
        m67938a("device_id", str);
    }

    /* renamed from: c */
    public static void m67942c(String str) {
        m67938a("app_version", str);
    }

    /* renamed from: a */
    public static void m67935a(String str) {
        m67938a("user_id", str);
    }

    /* renamed from: d */
    private static String m67943d(String str) {
        if (!f55336d) {
            return null;
        }
        m67940b();
        return C20475d.m67924a(str);
    }

    /* renamed from: a */
    public static void m67933a(Context context) {
        boolean z;
        Object obj;
        boolean z2;
        Object obj2;
        boolean z3;
        Object obj3;
        boolean z4;
        Object obj4;
        HashMap hashMap = new HashMap();
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        Sensor defaultSensor = sensorManager.getDefaultSensor(4);
        String str = "te_sensor_type_gyroscope_exist";
        boolean z5 = false;
        if (defaultSensor != null) {
            z = true;
        } else {
            z = false;
        }
        hashMap.put(str, Boolean.valueOf(z));
        String str2 = "te_sensor_type_gyroscope_name";
        String str3 = null;
        if (defaultSensor != null) {
            obj = defaultSensor.getName();
        } else {
            obj = null;
        }
        hashMap.put(str2, obj);
        Sensor defaultSensor2 = sensorManager.getDefaultSensor(15);
        String str4 = "te_sensor_type_game_rotation_vector_exist";
        if (defaultSensor2 != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        hashMap.put(str4, Boolean.valueOf(z2));
        String str5 = "te_sensor_type_game_rotation_vector_name";
        if (defaultSensor2 != null) {
            obj2 = defaultSensor2.getName();
        } else {
            obj2 = null;
        }
        hashMap.put(str5, obj2);
        Sensor defaultSensor3 = sensorManager.getDefaultSensor(11);
        String str6 = "te_sensor_type_rotation_vector_exist";
        if (defaultSensor3 != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        hashMap.put(str6, Boolean.valueOf(z3));
        String str7 = "te_sensor_type_rotation_vector_name";
        if (defaultSensor3 != null) {
            obj3 = defaultSensor3.getName();
        } else {
            obj3 = null;
        }
        hashMap.put(str7, obj3);
        Sensor defaultSensor4 = sensorManager.getDefaultSensor(9);
        String str8 = "te_sensor_type_gravity_exist";
        if (defaultSensor4 != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        hashMap.put(str8, Boolean.valueOf(z4));
        String str9 = "te_sensor_type_gravity_name";
        if (defaultSensor4 != null) {
            obj4 = defaultSensor4.getName();
        } else {
            obj4 = null;
        }
        hashMap.put(str9, obj4);
        Sensor defaultSensor5 = sensorManager.getDefaultSensor(1);
        String str10 = "te_sensor_type_accelerometer_exist";
        if (defaultSensor5 != null) {
            z5 = true;
        }
        hashMap.put(str10, Boolean.valueOf(z5));
        String str11 = "te_sensor_type_accelerometer_name";
        if (defaultSensor5 != null) {
            str3 = defaultSensor5.getName();
        }
        hashMap.put(str11, str3);
        C20479f.m67961a("iesve_veeditor_sensor_report", "iesve_veeditor_sensor_report", (Map) hashMap);
    }

    /* renamed from: a */
    private static void m67938a(String str, String str2) {
        if (f55336d) {
            m67940b();
            C20475d.m67928a(str, str2);
        }
    }

    /* renamed from: a */
    public static void m67936a(String str, int i, C45306a aVar) {
        JSONObject jSONObject;
        if (f55336d) {
            m67940b();
            if (aVar == null) {
                jSONObject = null;
            } else {
                jSONObject = aVar.mo108382a();
            }
            C20475d.m67927a(str, i, jSONObject);
        }
    }

    /* renamed from: a */
    public static void m67937a(String str, int i, JSONObject jSONObject) {
        if (f55336d && jSONObject != null) {
            m67940b();
            if (TextUtils.isEmpty(m67943d("device_id"))) {
                m67938a("device_id", "Unknown");
            }
            if (TextUtils.isEmpty(m67943d("user_id"))) {
                m67938a("user_id", "Unknown");
            }
            if (TextUtils.isEmpty(m67943d("app_version"))) {
                m67938a("app_version", "Unknown");
            }
            try {
                for (Entry entry : C20471b.m67908a().entrySet()) {
                    String str2 = (String) entry.getValue();
                    if (!C20471b.f55310a.contains(entry.getKey())) {
                        StringBuilder sb = new StringBuilder("te_device_info_");
                        sb.append((String) entry.getKey());
                        jSONObject.put(sb.toString(), str2);
                    } else if (!TextUtils.isEmpty(str2)) {
                        try {
                            float parseFloat = Float.parseFloat(str2);
                            StringBuilder sb2 = new StringBuilder("te_device_info_");
                            sb2.append((String) entry.getKey());
                            jSONObject.put(sb2.toString(), (double) parseFloat);
                        } catch (Exception unused) {
                        }
                    }
                }
            } catch (JSONException unused2) {
            }
            C20475d.m67927a(str, i, jSONObject);
        }
    }

    /* renamed from: a */
    public static void m67934a(final Context context, final String str, String str2, String str3) {
        if (f55336d) {
            if (!f55335c) {
                C20475d.m67926a(context, str, null, null);
                f55333a = true;
            } else if (!f55333a && f55337e == null) {
                Thread thread = new Thread(new Runnable(null, null) {

                    /* renamed from: c */
                    final /* synthetic */ String f55340c;

                    public final void run() {
                        synchronized (C20477e.f55334b) {
                            C20475d.m67926a(context, str, this.f55340c, null);
                            C20477e.f55333a = true;
                            C20477e.f55334b.notifyAll();
                        }
                    }

                    {
                        this.f55340c = r3;
                    }
                });
                f55337e = thread;
                thread.start();
            }
        }
    }

    /* renamed from: b */
    static JSONObject m67939b(Context context, String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device_id", str);
            try {
                jSONObject.put("app_version", context.getPackageManager().getPackageInfo(context.getPackageName(), PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH).versionName);
            } catch (NameNotFoundException unused) {
                jSONObject.put("app_version", "vesdk:6.0.0.96");
            }
            jSONObject.put("ve_version", "6.0.0.96");
            jSONObject.put("effect_version", "6.0.0_rel_15_douyin_MT_202001141700_1611d1aa7c");
            jSONObject.put("model", Build.MODEL);
            jSONObject.put("channel", "release");
            jSONObject.put("package_name", context.getPackageName());
            jSONObject.put("user_id", str2);
            jSONObject.put("version_code", str3);
        } catch (JSONException unused2) {
        }
        return jSONObject;
    }
}
