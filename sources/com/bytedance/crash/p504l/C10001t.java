package com.bytedance.crash.p504l;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.StatFs;
import com.bytedance.crash.C9918j;
import java.io.File;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.l.t */
public final class C10001t {
    /* renamed from: a */
    private static long m29661a() {
        try {
            return m29665b(Environment.getRootDirectory());
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: b */
    private static long m29664b() {
        try {
            return m29662a(Environment.getRootDirectory());
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: c */
    private static long m29666c() {
        try {
            return m29665b(C9918j.m29342g().getFilesDir());
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: d */
    private static long m29667d() {
        try {
            return m29662a(C9918j.m29342g().getFilesDir());
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: g */
    private static boolean m29670g() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    /* renamed from: e */
    private static long m29668e() {
        try {
            if (m29670g()) {
                return Environment.getExternalStorageDirectory().getFreeSpace();
            }
        } catch (Throwable unused) {
        }
        return 0;
    }

    /* renamed from: f */
    private static long m29669f() {
        try {
            if (m29670g()) {
                return Environment.getExternalStorageDirectory().getTotalSpace();
            }
        } catch (Throwable unused) {
        }
        return 0;
    }

    /* renamed from: a */
    private static long m29662a(File file) {
        try {
            StatFs statFs = new StatFs(file.getPath());
            if (VERSION.SDK_INT >= 18) {
                return statFs.getTotalBytes();
            }
            return ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: b */
    private static long m29665b(File file) {
        try {
            StatFs statFs = new StatFs(file.getPath());
            if (VERSION.SDK_INT >= 18) {
                return statFs.getFreeBytes();
            }
            return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public static JSONObject m29663a(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("inner_free", m29661a());
            jSONObject.put("inner_total", m29664b());
            jSONObject.put("sdcard_free", m29668e());
            jSONObject.put("sdcard_total", m29669f());
            jSONObject.put("inner_free_real", m29666c());
            jSONObject.put("inner_total_real", m29667d());
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
