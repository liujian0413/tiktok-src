package com.bytedance.crash.p504l;

import android.content.Context;
import android.text.TextUtils;
import com.C1642a;
import com.bytedance.crash.C9918j;
import java.io.File;

/* renamed from: com.bytedance.crash.l.m */
public final class C9992m {

    /* renamed from: a */
    private static String f27230a;

    /* renamed from: b */
    private static File f27231b;

    /* renamed from: c */
    private static File f27232c;

    /* renamed from: a */
    public static String m29594a(String str) {
        return str;
    }

    /* renamed from: b */
    public static String m29598b(String str) {
        return str;
    }

    /* renamed from: a */
    public static File m29590a() {
        if (f27231b == null) {
            return m29605e(C9918j.m29342g());
        }
        return f27231b;
    }

    /* renamed from: b */
    public static String m29597b() {
        StringBuilder sb = new StringBuilder("anr_");
        sb.append(C9918j.m29340e());
        return sb.toString();
    }

    /* renamed from: c */
    public static String m29601c() {
        return C1642a.m8034a("alog_%s.npth", new Object[]{C9918j.m29340e()});
    }

    /* renamed from: d */
    public static String m29604d() {
        return C1642a.m8034a("ensure_%s.npth", new Object[]{C9918j.m29340e()});
    }

    /* renamed from: a */
    public static File m29592a(File file) {
        return new File(file, "dump.zip");
    }

    /* renamed from: b */
    public static File m29596b(File file) {
        return new File(file, "funnel.txt");
    }

    /* renamed from: c */
    public static File m29600c(File file) {
        return new File(file, "flog.txt");
    }

    /* renamed from: d */
    public static File m29603d(File file) {
        return new File(file, "tombstone.txt");
    }

    /* renamed from: e */
    public static File m29606e(File file) {
        return new File(file, "header.bin");
    }

    /* renamed from: f */
    public static File m29607f(File file) {
        return new File(file, "maps.txt");
    }

    /* renamed from: g */
    public static File m29610g(File file) {
        return new File(file, "callback.json");
    }

    /* renamed from: h */
    public static File m29612h(File file) {
        return new File(file, "upload.json");
    }

    /* renamed from: i */
    public static File m29613i(File file) {
        return new File(file, "javastack.txt");
    }

    /* renamed from: j */
    public static File m29615j(File file) {
        return new File(file, "logcat.txt");
    }

    /* renamed from: k */
    public static File m29616k(File file) {
        return new File(file, "fds.txt");
    }

    /* renamed from: l */
    public static File m29617l(File file) {
        return new File(file, "threads.txt");
    }

    /* renamed from: m */
    public static File m29618m(File file) {
        return new File(file, "meminfo.txt");
    }

    /* renamed from: n */
    public static File m29619n(File file) {
        return new File(file, "abortmsg.txt");
    }

    /* renamed from: b */
    public static File m29595b(Context context) {
        return new File(m29614i(context), "CrashLogSimple");
    }

    /* renamed from: c */
    public static File m29599c(Context context) {
        return new File(m29614i(context), "RuntimeContext");
    }

    /* renamed from: d */
    public static File m29602d(Context context) {
        return new File(m29614i(context), "monitorLog");
    }

    /* renamed from: h */
    public static File m29611h(Context context) {
        return new File(m29614i(context), "alogCrash");
    }

    /* renamed from: a */
    public static File m29591a(Context context) {
        return new File(m29614i(context), "CrashLogJava");
    }

    /* renamed from: e */
    public static File m29605e(Context context) {
        if (f27231b == null) {
            if (context == null) {
                context = C9918j.m29342g();
            }
            f27231b = new File(m29614i(context), "CrashLogNative");
        }
        return f27231b;
    }

    /* renamed from: f */
    public static String m29608f(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(m29614i(context));
        sb.append("/CrashLogNative");
        return sb.toString();
    }

    /* renamed from: g */
    public static File m29609g(Context context) {
        if (f27232c == null) {
            f27232c = new File(m29614i(context), "ExternalLog");
        }
        return f27232c;
    }

    /* renamed from: i */
    private static String m29614i(Context context) {
        if (TextUtils.isEmpty(f27230a)) {
            try {
                f27230a = context.getFilesDir().getAbsolutePath();
            } catch (Exception unused) {
                f27230a = "/sdcard/";
            }
        }
        return f27230a;
    }

    /* renamed from: a */
    public static File m29593a(File file, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(file.getName());
        sb.append(str);
        return new File(file, sb.toString());
    }
}
