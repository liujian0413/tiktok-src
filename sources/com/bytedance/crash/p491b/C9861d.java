package com.bytedance.crash.p491b;

import android.app.ActivityManager.ProcessErrorStateInfo;
import android.content.Context;
import android.os.Looper;
import android.os.Process;
import com.bytedance.crash.C9875d;
import com.bytedance.crash.p504l.C9972a;
import com.bytedance.crash.p504l.C9999s;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.b.d */
public final class C9861d {

    /* renamed from: a */
    private static ProcessErrorStateInfo f26893a;

    /* renamed from: a */
    public static void m29104a() {
        f26893a = null;
    }

    /* renamed from: a */
    public static JSONObject m29103a(boolean z) throws JSONException {
        try {
            StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("thread_number", 1);
            jSONObject.put("mainStackFromTrace", C9999s.m29645a(stackTrace));
            return jSONObject;
        } catch (Throwable th) {
            C9875d.m29130a().mo24453a("NPTH_CATCH", th);
            return null;
        }
    }

    /* renamed from: a */
    static String m29102a(Context context, int i) {
        try {
            ProcessErrorStateInfo a = C9972a.m29499a(context, 1);
            if (a != null && Process.myPid() == a.pid) {
                if (f26893a != null && C9856a.m29084a(f26893a, a)) {
                    return null;
                }
                f26893a = a;
                return C9856a.m29083a(a);
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
