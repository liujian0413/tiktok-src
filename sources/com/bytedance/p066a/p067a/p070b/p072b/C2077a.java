package com.bytedance.p066a.p067a.p070b.p072b;

import android.text.TextUtils;
import com.bytedance.apm.p244g.C6207b;
import com.bytedance.apm.p244g.C6210c;
import com.bytedance.apm.util.C6297v;
import com.bytedance.services.apm.api.C6476a;
import com.google.p268a.p269a.p270a.p271a.p272a.C6497a;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.a.a.b.b.a */
public final class C2077a {
    /* renamed from: a */
    public static void m9156a() {
        if (C6476a.m20157a() != null) {
            C6476a.m20163b();
        } else {
            m9164b();
        }
    }

    /* renamed from: b */
    private static void m9164b() {
        m9157a(3, Thread.currentThread().getStackTrace(), null, true, null);
    }

    /* renamed from: c */
    private static void m9169c(String str) {
        m9157a(3, Thread.currentThread().getStackTrace(), str, true, null);
    }

    /* renamed from: a */
    public static void m9159a(String str) {
        if (C6476a.m20157a() != null) {
            C6476a.m20159a(str);
        } else {
            m9169c(str);
        }
    }

    /* renamed from: b */
    public static void m9165b(String str) {
        if (!TextUtils.isEmpty(str)) {
            C6207b.m19279a(str);
        }
    }

    /* renamed from: c */
    private static boolean m9170c(Throwable th) {
        C6207b.m19278a();
        if (!C6207b.m19280b() || !C6210c.m19286a(th)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m9160a(Throwable th) {
        if (C6476a.m20157a() != null) {
            C6476a.m20160a(th);
        } else {
            m9166b(th);
        }
    }

    /* renamed from: b */
    private static void m9166b(Throwable th) {
        if (m9170c(th)) {
            m9158a(3, Thread.currentThread().getStackTrace(), th, null, true, true, null);
        }
    }

    /* renamed from: d */
    private static String m9171d(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        C6497a.m20180a(th, printWriter);
        Throwable cause = th.getCause();
        if (cause != null) {
            C6497a.m20180a(cause, printWriter);
            Throwable cause2 = cause.getCause();
            if (cause2 != null) {
                C6497a.m20180a(cause2, printWriter);
            }
        }
        String stringWriter2 = stringWriter.toString();
        printWriter.close();
        if (stringWriter2.length() > 1024) {
            return stringWriter2.substring(0, PreloadTask.BYTE_UNIT_NUMBER);
        }
        return stringWriter2;
    }

    /* renamed from: a */
    public static void m9161a(Throwable th, String str) {
        if (C6476a.m20157a() != null) {
            C6476a.m20161a(th, str);
        } else {
            m9167b(th, str);
        }
    }

    /* renamed from: b */
    private static void m9167b(Throwable th, String str) {
        if (m9170c(th)) {
            m9158a(3, Thread.currentThread().getStackTrace(), th, str, true, true, null);
        }
    }

    /* renamed from: a */
    private static void m9163a(Map<String, String> map, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (map != null) {
                for (String str : map.keySet()) {
                    jSONObject2.put(str, map.get(str));
                }
                jSONObject.put("custom", jSONObject2);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    private static void m9168b(Throwable th, String str, Map<String, String> map) {
        if (m9170c(th)) {
            m9158a(3, Thread.currentThread().getStackTrace(), th, str, true, false, map);
        }
    }

    /* renamed from: a */
    public static void m9162a(Throwable th, String str, Map<String, String> map) {
        if (C6476a.m20157a() != null) {
            C6476a.m20162a(th, str, map);
        } else {
            m9168b(th, str, map);
        }
    }

    /* renamed from: a */
    private static void m9157a(int i, StackTraceElement[] stackTraceElementArr, String str, boolean z, Map<String, String> map) {
        if (stackTraceElementArr != null) {
            try {
                if (stackTraceElementArr.length > 4) {
                    StackTraceElement stackTraceElement = stackTraceElementArr[3];
                    if (stackTraceElement != null) {
                        String className = stackTraceElement.getClassName();
                        String methodName = stackTraceElement.getMethodName();
                        int lineNumber = stackTraceElement.getLineNumber();
                        String a = C6297v.m19537a(stackTraceElementArr);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("event_type", "exception");
                        jSONObject.put("timestamp", System.currentTimeMillis());
                        jSONObject.put("class_ref", className);
                        jSONObject.put("method", methodName);
                        jSONObject.put("line_num", lineNumber);
                        jSONObject.put("stack", a);
                        jSONObject.put("exception_type", 1);
                        jSONObject.put("is_core", 1);
                        if (!TextUtils.isEmpty(str)) {
                            if (str.length() > 1024) {
                                jSONObject.put("message", str.substring(0, PreloadTask.BYTE_UNIT_NUMBER));
                            } else {
                                jSONObject.put("message", str);
                            }
                        }
                        m9163a(null, jSONObject);
                        C6207b.m19278a().mo14943a("core_exception_monitor", jSONObject.toString(), str, true);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    private static void m9158a(int i, StackTraceElement[] stackTraceElementArr, Throwable th, String str, boolean z, boolean z2, Map<String, String> map) {
        if (th != null) {
            try {
                StackTraceElement stackTraceElement = stackTraceElementArr[3];
                String className = stackTraceElement.getClassName();
                String methodName = stackTraceElement.getMethodName();
                int lineNumber = stackTraceElement.getLineNumber();
                String d = m9171d(th);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("event_type", "exception");
                jSONObject.put("timestamp", System.currentTimeMillis());
                jSONObject.put("class_ref", className);
                jSONObject.put("method", methodName);
                jSONObject.put("line_num", lineNumber);
                jSONObject.put("stack", d);
                jSONObject.put("exception_type", 0);
                if (z2) {
                    jSONObject.put("is_core", 1);
                } else {
                    jSONObject.put("is_core", 0);
                }
                if (!TextUtils.isEmpty(str)) {
                    if (str.length() > 1024) {
                        jSONObject.put("message", str.substring(0, PreloadTask.BYTE_UNIT_NUMBER));
                    } else {
                        jSONObject.put("message", str);
                    }
                }
                m9163a(map, jSONObject);
                C6207b.m19278a().mo14943a("core_exception_monitor", jSONObject.toString(), str, true);
            } catch (Throwable unused) {
            }
        }
    }
}
