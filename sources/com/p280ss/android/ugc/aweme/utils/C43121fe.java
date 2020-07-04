package com.p280ss.android.ugc.aweme.utils;

import com.bytedance.crash.CrashType;
import com.bytedance.crash.p497f.C9896a;
import com.bytedance.crash.p501j.p502a.C9930f;
import com.bytedance.crash.upload.C10016a;
import java.io.File;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.utils.fe */
public final class C43121fe {
    /* renamed from: b */
    public static String m136752b(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return str;
        }
        return str.substring(lastIndexOf + 1);
    }

    /* renamed from: a */
    public static String m136750a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null || stackTraceElementArr.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement append : stackTraceElementArr) {
            sb.append(append);
            sb.append("\n");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static void m136751a(String str) {
        C9896a aVar = new C9896a(new JSONObject());
        aVar.mo24492a("data", (Object) str);
        aVar.mo24492a("isOOM", (Object) Boolean.valueOf(false));
        aVar.mo24492a("crash_time", (Object) Long.valueOf(System.currentTimeMillis()));
        C10016a.m29765a().mo24637a(C9930f.m29397a().mo24554a(CrashType.JAVA, aVar), (File) null, (String) null, false);
    }
}
