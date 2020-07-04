package com.bytedance.crash.nativecrash;

import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.bytedance.crash.C9918j;
import com.bytedance.crash.p491b.C9861d;
import com.bytedance.crash.p491b.C9862e;
import com.bytedance.crash.p491b.C9863f;
import com.bytedance.crash.p499h.C9911b;
import com.bytedance.crash.p501j.C9954g;
import com.bytedance.crash.p504l.C10002u;
import com.bytedance.crash.p504l.C9992m;
import com.bytedance.p255e.C6326a;
import java.io.File;

public class NativeImpl {

    /* renamed from: a */
    public static volatile boolean f27243a;

    /* renamed from: b */
    private static volatile boolean f27244b;

    private static native boolean doCheckNativeCrash();

    private static native void doCloseFile(int i);

    private static native int doCreateCallbackThread();

    private static native void doDump(String str);

    private static native void doDumpHprof(String str);

    private static native void doDumpLogcat(String str, String str2, String str3);

    private static native void doDumpMemInfo(String str);

    private static native String doGetCrashHeader(String str);

    private static native String[] doGetFdDump(int i, int i2, int[] iArr, String[] strArr);

    private static native int doLock(String str, int i);

    private static native int doOpenFile(String str);

    private static native void doRebuildTombstone(String str, String str2, String str3);

    private static native void doSetAlogConfigPath(String str);

    private static native void doSetAlogFlushAddr(long j);

    private static native void doSetAlogLogDirAddr(long j);

    private static native void doSetUploadEnd();

    private static native void doSignalMainThread();

    private static native int doStart(int i, String str, String str2, String str3, int i2);

    private static native void doStartAnrMonitor(int i);

    private static native void doWriteFile(int i, String str, int i2);

    private static native boolean is64Bit();

    /* renamed from: a */
    public static String[] m29685a(int i, int[] iArr, String[] strArr) {
        if (!f27244b) {
            return null;
        }
        String[] strArr2 = new String[100];
        int[] iArr2 = new int[100];
        int i2 = 0;
        while (i2 < iArr.length) {
            int length = iArr.length - i2 > 100 ? 100 : iArr.length - i2;
            for (int i3 = 0; i3 < length; i3++) {
                iArr2[i3] = iArr[i3 + i2];
            }
            doGetFdDump(i, length, iArr2, strArr2);
            for (int i4 = 0; i4 < length; i4++) {
                strArr[i4 + i2] = strArr2[i4];
            }
            i2 += 100;
        }
        return strArr;
    }

    /* renamed from: b */
    public static int m29686b() {
        if (!f27244b) {
            return -1;
        }
        return doCreateCallbackThread();
    }

    /* renamed from: f */
    public static void m29696f() {
        C10002u.m29671a(new Runnable() {
            public final void run() {
                try {
                    NativeImpl.m29697g();
                } catch (Throwable unused) {
                }
            }
        }, "NPTH-AnrMonitor");
    }

    /* renamed from: g */
    public static void m29697g() {
        if (f27244b) {
            try {
                doStartAnrMonitor(VERSION.SDK_INT);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: h */
    public static void m29698h() {
        if (f27244b) {
            doSignalMainThread();
        }
    }

    /* renamed from: i */
    public static void m29699i() {
        if (f27244b) {
            doSetUploadEnd();
        }
    }

    /* renamed from: d */
    public static boolean m29693d() {
        if (!f27244b) {
            return false;
        }
        try {
            return doCheckNativeCrash();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: e */
    public static boolean m29695e() {
        if (!f27244b) {
            return false;
        }
        try {
            return is64Bit();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: j */
    private static boolean m29700j() {
        if (!f27244b) {
            try {
                C6326a.m19642a("npth", C9918j.m29342g());
                f27244b = true;
            } catch (Throwable unused) {
            }
        }
        return f27244b;
    }

    private static void reportEventForAnrMonitor() {
        try {
            System.currentTimeMillis();
            C9862e.m29107b(true);
            C9861d.m29104a();
            C9863f.m29108a(C9918j.m29342g()).f26897a.mo24429c();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m29679a() {
        C9954g.m29460b().mo24596a(new Runnable() {
            public final void run() {
                if (NativeImpl.f27243a) {
                    File file = new File(C9918j.m29342g().getFilesDir(), "npth_lib/libnpth_dumper.so");
                    file.getParentFile().mkdirs();
                    if (file.exists()) {
                        file.delete();
                    }
                    C9911b.m29303a(C9918j.m29342g(), "npth_dumper", file);
                }
            }
        });
    }

    /* renamed from: c */
    public static void m29690c() {
        if (f27244b) {
            try {
                String f = C9918j.m29341f();
                File h = C9992m.m29611h(C9918j.m29342g());
                h.mkdirs();
                StringBuilder sb = new StringBuilder();
                sb.append(h.getPath());
                sb.append("/native_");
                sb.append(f);
                sb.append(".atmp");
                doSetAlogConfigPath(sb.toString());
            } catch (Throwable unused) {
            }
        }
    }

    private static void handleNativeCrash(String str) {
        NativeCrashCollector.onNativeCrash(str);
    }

    /* renamed from: a */
    public static int m29677a(int i) {
        if (!f27244b && i > 0) {
            return -1;
        }
        try {
            return doLock("", i);
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: c */
    public static void m29691c(String str) {
        if (f27244b) {
            try {
                doDumpMemInfo(str);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: d */
    public static int m29692d(String str) {
        if (!f27244b) {
            return -1;
        }
        try {
            return doOpenFile(str);
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: e */
    public static void m29694e(String str) {
        if (f27244b) {
            doDump(str);
        }
    }

    /* renamed from: a */
    public static String m29678a(String str) {
        if (!f27244b) {
            return null;
        }
        return doGetCrashHeader(str);
    }

    /* renamed from: b */
    public static int m29687b(String str) {
        if (!f27244b && !TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            return doLock(str, -1);
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: b */
    public static void m29688b(int i) {
        if (f27244b) {
            try {
                doCloseFile(i);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public static void m29689b(long j) {
        if (f27244b) {
            try {
                doSetAlogLogDirAddr(j);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m29681a(long j) {
        if (f27244b) {
            try {
                doSetAlogFlushAddr(j);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m29682a(File file) {
        if (f27244b) {
            doRebuildTombstone(C9992m.m29606e(file).getAbsolutePath(), C9992m.m29603d(file).getAbsolutePath(), C9992m.m29607f(file).getAbsolutePath());
        }
    }

    /* renamed from: a */
    public static boolean m29684a(Context context) {
        String str;
        boolean j = m29700j();
        if (j) {
            String f = C9992m.m29608f(context);
            if (new File(context.getApplicationInfo().nativeLibraryDir, "libnpth_dumper.so").exists()) {
                str = context.getApplicationInfo().nativeLibraryDir;
            } else {
                str = new File(context.getFilesDir(), "npth_lib/").getAbsolutePath();
                f27243a = true;
            }
            doStart(VERSION.SDK_INT, str, f, C9918j.m29341f(), C9918j.m29347l());
        }
        return j;
    }

    /* renamed from: a */
    public static void m29680a(int i, String str) {
        if (f27244b && !TextUtils.isEmpty(str)) {
            try {
                doWriteFile(i, str, str.length());
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m29683a(String str, String str2, String str3) {
        if (f27244b) {
            try {
                doDumpLogcat(str, str2, str3);
            } catch (Throwable unused) {
            }
        }
    }
}
