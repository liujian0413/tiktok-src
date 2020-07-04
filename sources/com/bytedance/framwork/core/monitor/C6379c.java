package com.bytedance.framwork.core.monitor;

import com.bytedance.apm.C6159b;
import com.bytedance.apm.internal.ApmDelegate;
import org.json.JSONObject;

/* renamed from: com.bytedance.framwork.core.monitor.c */
public final class C6379c {
    /* renamed from: b */
    public static boolean m19831b(String str) {
        return ApmDelegate.getInstance().getMetricsTypeSwitch(str);
    }

    /* renamed from: a */
    public static boolean m19829a(String str) {
        return ApmDelegate.getInstance().getLogTypeSwitch(str);
    }

    /* renamed from: a */
    public static void m19826a(String str, JSONObject jSONObject) {
        C6159b.m19110a(str, jSONObject);
    }

    /* renamed from: a */
    public static void m19823a(String str, int i, JSONObject jSONObject) {
        C6159b.m19102a(str, i, jSONObject);
    }

    /* renamed from: a */
    public static void m19825a(String str, String str2, float f) {
        C6159b.m19106a(str, str2, f);
    }

    /* renamed from: a */
    public static void m19827a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        C6159b.m19111a(str, jSONObject, jSONObject2);
    }

    /* renamed from: a */
    public static void m19824a(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        C6159b.m19103a(str, i, jSONObject, jSONObject2);
    }

    /* renamed from: a */
    public static void m19828a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        C6159b.m19112a(str, jSONObject, jSONObject2, jSONObject3);
    }

    /* renamed from: a */
    public static void m19822a(long j, long j2, String str, String str2, String str3, int i, JSONObject jSONObject) {
        C6159b.m19101a(j, j2, str, str2, str3, i, jSONObject);
    }

    /* renamed from: b */
    public static void m19830b(long j, long j2, String str, String str2, String str3, int i, JSONObject jSONObject) {
        C6159b.m19116b(j, j2, str, str2, str3, i, jSONObject);
    }
}
