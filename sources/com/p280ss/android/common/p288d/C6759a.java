package com.p280ss.android.common.p288d;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.common.utility.C6319n;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.common.applog.TeaThread;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.common.d.a */
public final class C6759a {
    /* renamed from: a */
    public static void m20910a(String str, JSONObject jSONObject) {
        C6762b.m20912a(str, jSONObject);
    }

    /* renamed from: a */
    private static JSONObject m20908a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        Iterator keys = jSONObject.keys();
        if (keys == null) {
            return null;
        }
        while (keys.hasNext()) {
            linkedList.add(keys.next());
        }
        try {
            return new JSONObject(jSONObject, (String[]) linkedList.toArray(new String[0]));
        } catch (Exception unused) {
            return jSONObject;
        }
    }

    /* renamed from: a */
    public static void m20909a(final String str, final Bundle bundle) {
        final long currentTimeMillis = System.currentTimeMillis();
        TeaThread.getInst().ensureTeaThreadLite(new Runnable() {
            public final void run() {
                if (!C6319n.m19593a(str)) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("_event_v3", 1);
                        jSONObject.put("event_v3_reserved_field_time_stamp", currentTimeMillis);
                        if (bundle != null) {
                            for (String str : bundle.keySet()) {
                                jSONObject.put(str, bundle.get(str));
                            }
                        }
                        String abSDKVersion = AppLog.getAbSDKVersion();
                        if (!TextUtils.isEmpty(abSDKVersion)) {
                            jSONObject.put("ab_sdk_version", abSDKVersion);
                        }
                    } catch (Throwable unused) {
                    }
                    AppLog.onEvent((Context) null, "event_v3", str, (String) null, 0, 0, jSONObject);
                }
            }
        });
    }

    /* renamed from: b */
    public static void m20911b(final String str, JSONObject jSONObject) {
        final JSONObject a = m20908a(jSONObject);
        final long currentTimeMillis = System.currentTimeMillis();
        TeaThread.getInst().ensureTeaThreadLite(new Runnable() {
            public final void run() {
                if (!C6319n.m19593a(str)) {
                    JSONObject jSONObject = a;
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                    }
                    JSONObject jSONObject2 = jSONObject;
                    try {
                        jSONObject2.put("_event_v3", 1);
                        jSONObject2.put("event_v3_reserved_field_time_stamp", currentTimeMillis);
                        String abSDKVersion = AppLog.getAbSDKVersion();
                        if (!TextUtils.isEmpty(abSDKVersion)) {
                            jSONObject2.put("ab_sdk_version", abSDKVersion);
                        }
                    } catch (JSONException unused) {
                    }
                    AppLog.onEvent((Context) null, "event_v3", str, (String) null, 0, 0, jSONObject2);
                }
            }
        });
    }
}
