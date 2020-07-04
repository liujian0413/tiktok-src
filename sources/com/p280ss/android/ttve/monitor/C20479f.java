package com.p280ss.android.ttve.monitor;

import android.content.Context;
import android.text.TextUtils;
import com.p280ss.android.vesdk.C45372t;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ttve.monitor.f */
public final class C20479f {

    /* renamed from: a */
    public static int f55342a = 0;

    /* renamed from: b */
    public static int f55343b = 1;

    /* renamed from: c */
    private static WeakReference<IMonitor> f55344c = null;

    /* renamed from: d */
    private static String f55345d = "";

    /* renamed from: e */
    private static boolean f55346e = true;

    /* renamed from: a */
    public static void m67945a() {
        TEMonitorInvoker.nativeReset();
    }

    /* renamed from: a */
    public static void m67954a(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            C45372t.m143407c("TEMonitor", "perfLong: key is null");
        } else {
            TEMonitorInvoker.nativePerfLong(str, j);
        }
    }

    /* renamed from: a */
    public static void m67955a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            C45372t.m143407c("TEMonitor", "perfString: key is null");
            return;
        }
        if (str2 == null) {
            str2 = "";
        }
        TEMonitorInvoker.nativePerfString(str, str2);
    }

    /* renamed from: a */
    public static boolean m67960a(String str, String str2, long j) {
        HashMap hashMap = new HashMap();
        hashMap.put(str2, Long.valueOf(j));
        return m67961a(str, str2, (Map) hashMap);
    }

    /* renamed from: a */
    public static boolean m67959a(String str, String str2, float f) {
        HashMap hashMap = new HashMap();
        hashMap.put(str2, Float.valueOf(f));
        return m67961a(str, str2, (Map) hashMap);
    }

    /* renamed from: a */
    public static boolean m67961a(String str, String str2, Map map) {
        return m67962a(f55344c, str, str2, map);
    }

    /* renamed from: a */
    public static void m67956a(String str, String str2, String str3) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str3);
            try {
                if (f55346e) {
                    jSONObject.put("service", str2);
                }
            } catch (JSONException unused) {
            }
        } catch (JSONException unused2) {
            jSONObject = null;
        }
        if (f55346e) {
            m67967b(f55344c, str, jSONObject);
        } else {
            m67964a(f55344c, str2, jSONObject);
        }
    }

    /* renamed from: a */
    private static boolean m67963a(WeakReference<IMonitor> weakReference, String str, Map map) {
        if (weakReference == null || weakReference.get() == null) {
            C45372t.m143409d("TEMonitor", "monitorEventToBusiness business monitor invalid");
            return false;
        } else if (TextUtils.isEmpty(str) || map == null) {
            C45372t.m143409d("TEMonitor", "monitorEventToBusiness param invalid");
            return false;
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                m67958a(map, jSONObject);
                return m67964a(weakReference, str, jSONObject);
            } catch (JSONException e) {
                StringBuilder sb = new StringBuilder("monitorEventToBusiness json err: ");
                sb.append(e);
                C45372t.m143409d("TEMonitor", sb.toString());
                return false;
            }
        }
    }

    /* renamed from: a */
    private static boolean m67964a(WeakReference<IMonitor> weakReference, String str, JSONObject jSONObject) {
        if (weakReference == null || weakReference.get() == null) {
            C45372t.m143409d("TEMonitor", "monitorEventJsonToBusiness business monitor invalid");
            return false;
        } else if (TextUtils.isEmpty(str) || jSONObject == null) {
            C45372t.m143409d("TEMonitor", "monitorEventJsonToBusiness param invalid");
            return false;
        } else {
            try {
                ((IMonitor) weakReference.get()).monitorLog(str, jSONObject);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("Something happened when monitor log: ");
                sb.append(e);
                C45372t.m143409d("TEMonitor", sb.toString());
            }
            return true;
        }
    }

    /* renamed from: a */
    private static boolean m67962a(WeakReference<IMonitor> weakReference, String str, String str2, Map map) {
        if (!f55346e) {
            return m67963a(weakReference, str2, map);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("service", str2);
            }
            if (!str2.equals("iesve_veeditor_record_finish") && !str2.equals("iesve_veeditor_composition_finish") && !str2.equals("iesve_veeditor_edit")) {
                if (!str2.equals("iesve_veeditor_cut")) {
                    m67958a(map, jSONObject);
                    m67967b(weakReference, str, jSONObject);
                    return true;
                }
            }
            m67957a(str2, map, jSONObject);
            m67967b(weakReference, str, jSONObject);
            return true;
        } catch (JSONException unused) {
            C45372t.m143405b("TEMonitor", "No monitor callback, skip");
            return false;
        }
    }

    /* renamed from: a */
    public static void m67958a(Map map, JSONObject jSONObject) throws JSONException {
        for (String str : map.keySet()) {
            str.startsWith("iesve_");
            int a = C20482h.m67977a(str);
            if (a == 1) {
                try {
                    jSONObject.put(str, Integer.parseInt(String.valueOf(map.get(str))));
                } catch (Exception unused) {
                    StringBuilder sb = new StringBuilder("Parse int error:");
                    sb.append(map.get(str));
                    C45372t.m143409d("TEMonitor", sb.toString());
                }
            } else if (a == 2) {
                try {
                    jSONObject.put(str, (double) Float.parseFloat(String.valueOf(map.get(str))));
                } catch (Exception unused2) {
                    C45372t.m143409d("TEMonitor", "Parse float error");
                }
            } else {
                jSONObject.put(str, map.get(str));
            }
        }
    }

    /* renamed from: a */
    private static void m67957a(String str, Map map, JSONObject jSONObject) throws JSONException {
        int i;
        for (String str2 : map.keySet()) {
            if (str.equals("iesve_veeditor_record_finish") || str.equals("iesve_veeditor_composition_finish") || str.equals("iesve_veeditor_edit") || str.equals("iesve_veeditor_cut")) {
                i = C20482h.m67977a(str2);
            } else {
                i = C20482h.m67977a(str2);
            }
            if (i == 1) {
                try {
                    jSONObject.put(str2, Integer.parseInt(String.valueOf(map.get(str2))));
                } catch (Exception unused) {
                    StringBuilder sb = new StringBuilder("Parse int error:");
                    sb.append(map.get(str2));
                    C45372t.m143409d("TEMonitor", sb.toString());
                }
            } else if (i == 2) {
                try {
                    jSONObject.put(str2, (double) Float.parseFloat(String.valueOf(map.get(str2))));
                } catch (Exception unused2) {
                    C45372t.m143409d("TEMonitor", "Parse float error");
                }
            } else {
                jSONObject.put(str2, map.get(str2));
            }
        }
    }

    /* renamed from: b */
    private static String m67965b() {
        return C20477e.m67931a();
    }

    /* renamed from: b */
    public static void m67966b(int i) {
        TEMonitorInvoker.nativeMonitorPerfWithType(i);
    }

    /* renamed from: d */
    public static void m67969d(int i) {
        TEMonitorInvoker.nativeReset(i);
    }

    /* renamed from: a */
    public static void m67946a(int i) {
        TEMonitorInvoker.nativeMonitorPerf(i);
    }

    /* renamed from: e */
    public static Map<String, String> m67970e(int i) {
        return TEMonitorInvoker.nativeGetMapByType(1);
    }

    /* renamed from: a */
    private static int m67944a(JSONObject jSONObject) {
        try {
            if (jSONObject.has("completed")) {
                return jSONObject.getInt("completed");
            }
            return 0;
        } catch (JSONException unused) {
            C45372t.m143409d("TEMonitor", "get complete filed error!");
            return 0;
        }
    }

    /* renamed from: c */
    public static void m67968c(int i) {
        if (i == 0) {
            m67948a(0, "te_record_err_code", 0);
            return;
        }
        if (i == 1) {
            m67948a(1, "te_edit_err_code", 0);
            m67948a(1, "te_composition_err_code", 0);
        }
    }

    /* renamed from: a */
    public static void m67951a(IMonitor iMonitor) {
        f55344c = new WeakReference<>(iMonitor);
    }

    /* renamed from: a */
    public static void m67950a(Context context, String str) {
        TEMonitorInvoker.nativeInit();
        C20477e.m67934a(context.getApplicationContext(), str, null, null);
    }

    /* renamed from: a */
    public static void m67952a(String str, double d) {
        if (TextUtils.isEmpty(str)) {
            C45372t.m143407c("TEMonitor", "perfDouble: key is null");
        } else {
            TEMonitorInvoker.nativePerfDouble(str, d);
        }
    }

    /* renamed from: a */
    public static void m67948a(int i, String str, long j) {
        if (!TextUtils.isEmpty(str)) {
            TEMonitorInvoker.nativePerfLong(i, str, j);
        }
    }

    /* renamed from: a */
    public static void m67947a(int i, String str, double d) {
        if (TextUtils.isEmpty(str)) {
            C45372t.m143407c("TEMonitor", "perfDouble: key is null");
        } else {
            TEMonitorInvoker.nativePerfDouble(i, str, d);
        }
    }

    /* renamed from: a */
    public static void m67949a(int i, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            C45372t.m143407c("TEMonitor", "perfString: key is null");
            return;
        }
        if (str2 == null) {
            str2 = "";
        }
        TEMonitorInvoker.nativePerfString(i, str, str2);
    }

    /* renamed from: b */
    private static void m67967b(WeakReference<IMonitor> weakReference, String str, JSONObject jSONObject) {
        int i;
        String str2 = "sdk_video_edit_compose";
        if (jSONObject != null) {
            i = m67944a(jSONObject);
            try {
                if (jSONObject.has("service")) {
                    str2 = jSONObject.getString("service");
                }
                if (str2.equals("iesve_veeditor_record_finish") || str2.equals("iesve_veeditor_composition_finish")) {
                    if ("".equals(f55345d)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(m67965b());
                        sb.append("_");
                        sb.append(System.currentTimeMillis());
                        f55345d = sb.toString();
                    }
                    jSONObject.put("te_record_compose_vid", f55345d);
                }
                if (str2.equals("iesve_veeditor_composition_finish")) {
                    f55345d = "";
                }
            } catch (JSONException unused) {
            }
        } else {
            i = 0;
        }
        C20477e.m67937a(str2, i, jSONObject);
        if (!(weakReference == null || weakReference.get() == null)) {
            try {
                ((IMonitor) weakReference.get()).monitorLog(str, jSONObject);
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: a */
    public static void m67953a(String str, float f, float f2) {
        if (TextUtils.isEmpty(str)) {
            C45372t.m143407c("TEMonitor", "perfLong: key is null");
        } else {
            TEMonitorInvoker.nativePerfRational(str, 1.0f, f2);
        }
    }
}
