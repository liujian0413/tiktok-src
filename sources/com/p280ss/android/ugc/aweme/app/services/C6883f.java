package com.p280ss.android.ugc.aweme.app.services;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build;
import android.os.Build.VERSION;
import android.support.multidex.C0436a;
import bolts.C1592h;
import com.bytedance.boost_multidex.BoostMultiDex;
import com.bytedance.boost_multidex.Monitor;
import com.bytedance.boost_multidex.Result;
import com.bytedance.framwork.core.monitor.C6379c;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p255e.C6326a;
import com.google.p268a.p269a.p270a.p271a.p272a.C6497a;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.UUID;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.app.services.f */
public final class C6883f {

    /* renamed from: a */
    private static boolean f19542a;

    /* renamed from: b */
    private static long f19543b;

    /* renamed from: c */
    private static long f19544c;

    /* renamed from: d */
    private static Result f19545d;

    /* renamed from: e */
    private static boolean f19546e;

    /* renamed from: f */
    private static int f19547f;

    /* renamed from: g */
    private static boolean f19548g;

    /* renamed from: h */
    private static SharedPreferences f19549h;

    /* renamed from: a */
    public static void m21415a() {
        if (VERSION.SDK_INT < 21 && !f19542a) {
            f19542a = true;
            C1592h.m7848a(12000).mo6876a(C6885g.f19550a, (Executor) C7258h.m22730c());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m21417b() {
        String uuid = UUID.randomUUID().toString();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("gxl_id", uuid);
            jSONObject.put("gxl_cost", f19543b);
            if (f19544c != 0) {
                jSONObject.put("gxl_first_install_cost", f19544c);
            }
            jSONObject.put("gxl_install_type", f19547f);
            jSONObject.put("gxl_boost_fail", f19546e);
            jSONObject.put("gxl_sdk_int", VERSION.SDK_INT);
            jSONObject.put("gxl_fingerprint", Build.FINGERPRINT);
        } catch (Throwable th) {
            try {
                jSONObject.put("gxl_unknow_tr", m21414a(th));
            } catch (JSONException unused) {
            }
        }
        C6379c.m19826a("bmd_monitor", jSONObject);
        if (f19544c != 0) {
            f19549h.edit().remove("first_cost_time").commit();
        }
    }

    /* renamed from: a */
    private static String m21414a(Throwable th) {
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        C6497a.m20180a(th, new PrintWriter(stringWriter, true));
        return stringWriter.getBuffer().toString();
    }

    /* renamed from: a */
    public static boolean m21416a(Application application) {
        boolean z;
        if (VERSION.SDK_INT > 19) {
            return false;
        }
        SharedPreferences a = C7285c.m22838a(application, "bmd_monitor", 0);
        f19549h = a;
        Editor edit = a.edit();
        int o = (int) C6399b.m19939o();
        long lastModified = new File(application.getApplicationInfo().sourceDir).lastModified();
        int i = f19549h.getInt(C38347c.f99551f, 0);
        long j = f19549h.getLong("apk_time", 0);
        if (o == i && lastModified == j) {
            z = false;
        } else {
            z = true;
        }
        f19548g = z;
        if (z) {
            edit.putInt(C38347c.f99551f, o);
            edit.putLong("apk_time", lastModified);
        }
        if (f19548g) {
            f19547f = 90;
            edit.putInt("type", f19547f);
        } else {
            f19547f = f19549h.getInt("type", 0);
        }
        long nanoTime = System.nanoTime();
        if (f19547f == 90) {
            String c = C6776h.m20949c(application);
            if (BoostMultiDex.isOptimizeProcess(c)) {
                return true;
            }
            Result install = BoostMultiDex.install(application, new Monitor() {
                public final void loadLibrary(String str) {
                    C6326a.m19641a(str);
                }
            }.setProcessName(c));
            f19545d = install;
            if (install != null && (f19545d.continuousInterruptHappened || f19545d.fatalThrowable != null)) {
                f19546e = true;
                C0436a.m1926a((Context) application);
            }
        } else {
            C0436a.m1926a((Context) application);
        }
        f19543b = System.nanoTime() - nanoTime;
        if (f19548g) {
            f19544c = f19543b;
            edit.putLong("first_cost_time", f19544c);
            edit.commit();
        } else {
            f19544c = f19549h.getLong("first_cost_time", 0);
        }
        if (f19545d != null) {
            StringBuilder sb = new StringBuilder();
            for (Throwable a2 : f19545d.unFatalThrowable) {
                sb.append(m21414a(a2));
            }
        }
        return false;
    }
}
