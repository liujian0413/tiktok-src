package com.bytedance.crash.event;

import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.bytedance.crash.C9918j;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.nativecrash.C10008c;
import com.bytedance.crash.p497f.C9896a;
import com.bytedance.crash.p501j.C9957i;
import com.bytedance.crash.p504l.C9982g;
import com.taobao.android.dexposed.ClassUtils;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.event.a */
public final class C9887a {
    /* renamed from: a */
    private static void m29177a(Event event, JSONObject jSONObject) {
        if (jSONObject != null) {
            event.appVersion = jSONObject.optString("app_version");
            event.updateVersionCode = jSONObject.optString("update_version_code");
            event.sdkVersion = jSONObject.optString("sdk_version");
            event.mccMnc = jSONObject.optString("mcc_mnc");
            event.access = jSONObject.optString("access");
            event.aid = jSONObject.optString("aid");
            event.deviceId = jSONObject.optString("device_id");
            event.deviceModel = jSONObject.optString("device_model");
            event.osType = jSONObject.optString("os");
            event.osVersion = jSONObject.optString("os_version");
            m29179b(event);
        }
    }

    /* renamed from: a */
    private static void m29176a(Event event) {
        event.osVersion = m29174a();
        event.appVersion = m29178b("app_version");
        event.updateVersionCode = m29178b("update_version_code");
        event.sdkVersion = "3120";
        event.aid = m29178b("aid");
        event.deviceId = C9918j.m29338c().mo24593a();
        event.deviceModel = Build.MODEL;
        event.osType = "Android";
    }

    /* renamed from: a */
    private static String m29174a() {
        String str = VERSION.RELEASE;
        if (str.contains(ClassUtils.PACKAGE_SEPARATOR)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        return sb.toString();
    }

    /* renamed from: c */
    public static int m29180c(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* renamed from: d */
    private static long m29181d(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* renamed from: b */
    public static String m29178b(String str) {
        if (C9918j.m29332a() != null) {
            Map a = C9918j.m29332a().mo24525a();
            if (a != null) {
                Object obj = a.get(str);
                if (obj != null) {
                    return String.valueOf(obj);
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    private static void m29179b(Event event) {
        if (event != null) {
            event.osVersion = m29174a();
            event.deviceId = C9918j.m29338c().mo24593a();
            event.deviceModel = Build.MODEL;
            event.osType = "Android";
        }
    }

    /* renamed from: a */
    static Event m29173a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(C9982g.m29555c(str));
            Event event = new Event();
            event.crashTime = jSONObject.optLong("crash_time");
            event.eventTime = jSONObject.optLong("event_time");
            event.event = jSONObject.optString("event");
            event.eventType = jSONObject.optString("event_type");
            event.crashSummary = jSONObject.optString("crash_summary");
            event.crashType = jSONObject.optString("crash_type");
            event.state = jSONObject.optInt("state");
            event.errorInfo = jSONObject.optString("error_info");
            event.osType = jSONObject.optString("os");
            event.osVersion = jSONObject.optString("os_version");
            event.deviceModel = jSONObject.optString("device_model");
            event.appVersion = jSONObject.optString("app_version");
            event.updateVersionCode = jSONObject.optString("update_version_code");
            event.sdkVersion = jSONObject.optString("sdk_version");
            event.mccMnc = jSONObject.optString("mcc_mnc");
            event.access = jSONObject.optString("access");
            event.aid = jSONObject.optString("aid");
            event.deviceId = jSONObject.optString("device_id");
            event.uuid = jSONObject.optString("uuid");
            return event;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static ArrayList<Event> m29175a(C10008c cVar) {
        JSONObject a = C9957i.m29466a().mo24583a(cVar.mo24616a());
        Map b = cVar.mo24618b();
        if (a == null || b == null || b.isEmpty()) {
            return null;
        }
        Event event = new Event();
        String optString = a.optString("aid");
        String optString2 = a.optString("app_version");
        String optString3 = a.optString("update_version_code");
        String optString4 = a.optString("sdk_version");
        String a2 = C9918j.m29338c().mo24593a();
        if (TextUtils.isEmpty(optString3) || TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2) || TextUtils.isEmpty(optString4)) {
            return null;
        }
        event.aid = optString;
        event.updateVersionCode = optString3;
        event.appVersion = optString2;
        event.sdkVersion = optString4;
        event.deviceId = a2;
        Map c = cVar.mo24619c();
        if (c != null) {
            long d = m29181d((String) c.get("crash_time"));
            if (d > 0) {
                event.crashTime = d;
                event.eventTime = d;
            }
        }
        String d2 = cVar.mo24620d();
        if (!TextUtils.isEmpty(d2)) {
            event.crashSummary = d2;
        }
        event.crashType = CrashType.NATIVE.getName();
        ArrayList<Event> arrayList = new ArrayList<>();
        for (String str : b.keySet()) {
            Event clone = event.clone();
            clone.event = str;
            clone.state = m29180c((String) b.get(str));
            arrayList.add(clone);
        }
        return arrayList;
    }

    /* renamed from: a */
    public static Event m29171a(CrashType crashType, String str, C9896a aVar) {
        if (aVar == null || aVar.f26984a == null) {
            return new Event();
        }
        return m29172a(crashType, str, aVar.f26984a);
    }

    /* renamed from: a */
    public static Event m29172a(CrashType crashType, String str, JSONObject jSONObject) {
        int i;
        Event event = new Event();
        event.eventTime = System.currentTimeMillis();
        event.event = str;
        if (jSONObject != null) {
            int i2 = 0;
            if (crashType == CrashType.LAUNCH) {
                JSONArray optJSONArray = jSONObject.optJSONArray("data");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(0);
                    event.crashTime = optJSONObject.optLong("crash_time");
                    event.crashSummary = optJSONObject.optString("stack");
                }
            } else {
                event.crashTime = jSONObject.optLong("crash_time");
                event.crashSummary = jSONObject.optString("data");
            }
            if (!TextUtils.isEmpty(event.crashSummary)) {
                if (crashType == CrashType.NATIVE) {
                    i = Math.max(0, event.crashSummary.indexOf("\n"));
                } else {
                    String str2 = ": ";
                    i2 = Math.max(0, event.crashSummary.indexOf(str2) + str2.length());
                    i = Math.max(i2, event.crashSummary.indexOf("\n"));
                }
                if (i > 0) {
                    event.crashSummary = event.crashSummary.substring(i2, i);
                } else {
                    event.crashSummary = null;
                }
            }
            if (crashType != null) {
                event.crashType = crashType.getName();
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("header");
            if (optJSONObject2 != null) {
                m29177a(event, optJSONObject2);
            } else {
                m29176a(event);
            }
        }
        return event;
    }

    /* renamed from: a */
    public static Event m29170a(CrashType crashType, String str, long j, JSONObject jSONObject) {
        Event event = new Event();
        event.crashTime = j;
        event.eventTime = System.currentTimeMillis();
        event.event = str;
        if (crashType != null) {
            event.crashType = crashType.getName();
        }
        m29177a(event, jSONObject);
        return event;
    }

    /* renamed from: a */
    public static Event m29169a(CrashType crashType, String str, long j, Throwable th) {
        Event event = new Event();
        event.crashTime = j;
        event.eventTime = System.currentTimeMillis();
        event.event = str;
        if (th != null) {
            event.crashSummary = th.getMessage();
        }
        if (crashType != null) {
            event.crashType = crashType.getName();
        }
        m29176a(event);
        return event;
    }
}
