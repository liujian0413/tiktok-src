package com.p280ss.android.ugc.aweme.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

/* renamed from: com.ss.android.ugc.aweme.utils.at */
public final class C42941at {

    /* renamed from: a */
    private static final FileFilter f111474a = new FileFilter() {
        public final boolean accept(File file) {
            String name = file.getName();
            if (!name.startsWith("cpu")) {
                return false;
            }
            for (int i = 3; i < name.length(); i++) {
                if (!Character.isDigit(name.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
    };

    /* renamed from: com.ss.android.ugc.aweme.utils.at$a */
    public static class C42943a {

        /* renamed from: a */
        public String f111475a;

        /* renamed from: b */
        public int f111476b;

        /* renamed from: c */
        public int f111477c;
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.at$b */
    public static class C42944b {

        /* renamed from: a */
        public long f111478a;

        /* renamed from: b */
        public long f111479b;
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.at$c */
    public static class C42945c {

        /* renamed from: a */
        public int f111480a;

        /* renamed from: b */
        public int f111481b;

        /* renamed from: c */
        public int f111482c;
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.at$d */
    public static class C42946d {

        /* renamed from: a */
        public long f111483a;

        /* renamed from: b */
        public long f111484b;

        /* renamed from: c */
        public long f111485c;

        /* renamed from: d */
        public long f111486d;

        /* renamed from: e */
        public long f111487e;

        /* renamed from: f */
        public int f111488f;
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.at$e */
    static class C42947e {

        /* renamed from: a */
        static final C42948a f111489a;

        /* renamed from: com.ss.android.ugc.aweme.utils.at$e$a */
        static class C42948a {
            private C42948a() {
            }

            /* renamed from: a */
            public String mo104645a() {
                StringBuilder sb = new StringBuilder();
                sb.append(Build.CPU_ABI);
                sb.append("_");
                sb.append(Build.CPU_ABI2);
                return sb.toString();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.utils.at$e$b */
        static class C42949b extends C42948a {
            private C42949b() {
                super();
            }

            /* renamed from: a */
            public final String mo104645a() {
                String[] strArr;
                if (Build.SUPPORTED_ABIS == null) {
                    return "";
                }
                String str = "";
                for (String str2 : Build.SUPPORTED_ABIS) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(str2);
                    sb.append("_");
                    str = sb.toString();
                }
                return str;
            }
        }

        /* renamed from: a */
        public static String m136338a() {
            return f111489a.mo104645a();
        }

        static {
            if (VERSION.SDK_INT >= 21) {
                f111489a = new C42949b();
            } else {
                f111489a = new C42948a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.at$f */
    public static class C42950f {

        /* renamed from: a */
        public long f111490a = -1;

        /* renamed from: b */
        public long f111491b = -1;

        /* renamed from: c */
        public long f111492c = -1;

        /* renamed from: d */
        public long f111493d = -1;

        /* renamed from: e */
        public int f111494e = -1;
    }

    /* renamed from: b */
    public static String m136312b() {
        return C42947e.m136338a();
    }

    /* renamed from: f */
    private static int m136322f() {
        return new File("/sys/devices/system/cpu/").listFiles(f111474a).length;
    }

    /* renamed from: l */
    private static boolean m136332l() {
        return Environment.getExternalStorageState().equals("mounted");
    }

    /* renamed from: e */
    private static int m136319e() {
        if (VERSION.SDK_INT <= 10) {
            return 1;
        }
        int i = -1;
        try {
            int a = m136303a("/sys/devices/system/cpu/possible");
            if (a == -1) {
                a = m136303a("/sys/devices/system/cpu/present");
            }
            if (a == -1) {
                a = m136322f();
            }
            i = a;
        } catch (NullPointerException | SecurityException unused) {
        }
        return i;
    }

    /* renamed from: h */
    private static long m136327h() {
        if (Environment.getRootDirectory() != null) {
            return m136313c(Environment.getRootDirectory().getPath());
        }
        return -1;
    }

    /* renamed from: i */
    private static long m136328i() {
        if (Environment.getRootDirectory() != null) {
            return m136316d(Environment.getRootDirectory().getPath());
        }
        return -1;
    }

    /* renamed from: j */
    private static long m136330j() {
        if (!m136332l() || Environment.getExternalStorageDirectory() == null) {
            return -1;
        }
        return m136313c(Environment.getExternalStorageDirectory().getPath());
    }

    /* renamed from: k */
    private static long m136331k() {
        if (!m136332l() || Environment.getExternalStorageDirectory() == null) {
            return -1;
        }
        return m136316d(Environment.getExternalStorageDirectory().getPath());
    }

    /* renamed from: m */
    private static int m136333m() {
        FileInputStream fileInputStream = null;
        try {
            StringBuilder sb = new StringBuilder("/proc/");
            sb.append(Process.myPid());
            sb.append("/status");
            FileInputStream fileInputStream2 = new FileInputStream(sb.toString());
            try {
                int a = m136304a("VmPeak", fileInputStream2);
                m136309a((Closeable) fileInputStream2);
                return a;
            } catch (Exception unused) {
                fileInputStream = fileInputStream2;
                m136309a((Closeable) fileInputStream);
                return -1;
            } catch (Throwable th) {
                FileInputStream fileInputStream3 = fileInputStream2;
                th = th;
                fileInputStream = fileInputStream3;
                m136309a((Closeable) fileInputStream);
                throw th;
            }
        } catch (Exception unused2) {
            m136309a((Closeable) fileInputStream);
            return -1;
        } catch (Throwable th2) {
            th = th2;
            m136309a((Closeable) fileInputStream);
            throw th;
        }
    }

    /* renamed from: n */
    private static int m136334n() {
        FileInputStream fileInputStream = null;
        try {
            StringBuilder sb = new StringBuilder("/proc/");
            sb.append(Process.myPid());
            sb.append("/status");
            FileInputStream fileInputStream2 = new FileInputStream(sb.toString());
            try {
                int a = m136304a("VmSize", fileInputStream2);
                m136309a((Closeable) fileInputStream2);
                return a;
            } catch (Exception unused) {
                fileInputStream = fileInputStream2;
                m136309a((Closeable) fileInputStream);
                return -1;
            } catch (Throwable th) {
                FileInputStream fileInputStream3 = fileInputStream2;
                th = th;
                fileInputStream = fileInputStream3;
                m136309a((Closeable) fileInputStream);
                throw th;
            }
        } catch (Exception unused2) {
            m136309a((Closeable) fileInputStream);
            return -1;
        } catch (Throwable th2) {
            th = th2;
            m136309a((Closeable) fileInputStream);
            throw th;
        }
    }

    /* renamed from: o */
    private static int m136335o() {
        StringBuilder sb = new StringBuilder("/proc/");
        sb.append(Process.myPid());
        sb.append("/fd");
        File file = new File(sb.toString());
        if (!file.isDirectory()) {
            return -1;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            return listFiles.length;
        }
        return -1;
    }

    /* renamed from: p */
    private static int m136336p() {
        FileInputStream fileInputStream = null;
        try {
            StringBuilder sb = new StringBuilder("/proc/");
            sb.append(Process.myPid());
            sb.append("/status");
            FileInputStream fileInputStream2 = new FileInputStream(sb.toString());
            try {
                int a = m136304a("Threads", fileInputStream2);
                m136309a((Closeable) fileInputStream2);
                return a;
            } catch (Exception unused) {
                fileInputStream = fileInputStream2;
                m136309a((Closeable) fileInputStream);
                return -1;
            } catch (Throwable th) {
                FileInputStream fileInputStream3 = fileInputStream2;
                th = th;
                fileInputStream = fileInputStream3;
                m136309a((Closeable) fileInputStream);
                throw th;
            }
        } catch (Exception unused2) {
            m136309a((Closeable) fileInputStream);
            return -1;
        } catch (Throwable th2) {
            th = th2;
            m136309a((Closeable) fileInputStream);
            throw th;
        }
    }

    /* renamed from: q */
    private static int m136337q() {
        FileInputStream fileInputStream = null;
        try {
            StringBuilder sb = new StringBuilder("/proc/");
            sb.append(Process.myPid());
            sb.append("/limits");
            FileInputStream fileInputStream2 = new FileInputStream(sb.toString());
            try {
                int a = m136304a("Max open files", fileInputStream2);
                m136309a((Closeable) fileInputStream2);
                return a;
            } catch (Exception unused) {
                fileInputStream = fileInputStream2;
                m136309a((Closeable) fileInputStream);
                return -1;
            } catch (Throwable th) {
                FileInputStream fileInputStream3 = fileInputStream2;
                th = th;
                fileInputStream = fileInputStream3;
                m136309a((Closeable) fileInputStream);
                throw th;
            }
        } catch (Exception unused2) {
            m136309a((Closeable) fileInputStream);
            return -1;
        } catch (Throwable th2) {
            th = th2;
            m136309a((Closeable) fileInputStream);
            throw th;
        }
    }

    /* renamed from: d */
    public static boolean m136318d() {
        String str = Build.TAGS;
        if (str != null && str.contains("test-keys")) {
            return true;
        }
        try {
            if (new File("/system/app/Superuser.apk").exists()) {
                return true;
            }
        } catch (Exception unused) {
        }
        if (m136321e("/system/xbin/which su") || m136321e("/system/bin/which su") || m136321e("which su") || m136321e("busybox which su")) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static C42950f m136315c() {
        C42950f fVar = new C42950f();
        try {
            fVar.f111490a = (long) m136333m();
            fVar.f111491b = (long) m136334n();
            fVar.f111493d = (long) m136335o();
            fVar.f111494e = m136336p();
            fVar.f111492c = (long) m136337q();
            return fVar;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x005a */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m136324g() {
        /*
            r0 = -1
            r1 = 0
            r2 = 0
            r3 = -1
        L_0x0004:
            int r4 = m136319e()     // Catch:{ IOException -> 0x0083 }
            if (r2 >= r4) goto L_0x0066
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0083 }
            java.lang.String r5 = "/sys/devices/system/cpu/cpu"
            r4.<init>(r5)     // Catch:{ IOException -> 0x0083 }
            r4.append(r2)     // Catch:{ IOException -> 0x0083 }
            java.lang.String r5 = "/cpufreq/cpuinfo_max_freq"
            r4.append(r5)     // Catch:{ IOException -> 0x0083 }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x0083 }
            java.io.File r5 = new java.io.File     // Catch:{ IOException -> 0x0083 }
            r5.<init>(r4)     // Catch:{ IOException -> 0x0083 }
            boolean r4 = r5.exists()     // Catch:{ IOException -> 0x0083 }
            if (r4 == 0) goto L_0x0063
            r4 = 128(0x80, float:1.794E-43)
            byte[] r6 = new byte[r4]     // Catch:{ IOException -> 0x0083 }
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0083 }
            r7.<init>(r5)     // Catch:{ IOException -> 0x0083 }
            r7.read(r6)     // Catch:{ NumberFormatException -> 0x005a, all -> 0x005e }
            r5 = 0
        L_0x0035:
            byte r8 = r6[r5]     // Catch:{ NumberFormatException -> 0x005a, all -> 0x005e }
            boolean r8 = java.lang.Character.isDigit(r8)     // Catch:{ NumberFormatException -> 0x005a, all -> 0x005e }
            if (r8 == 0) goto L_0x0042
            if (r5 >= r4) goto L_0x0042
            int r5 = r5 + 1
            goto L_0x0035
        L_0x0042:
            java.lang.String r4 = new java.lang.String     // Catch:{ NumberFormatException -> 0x005a, all -> 0x005e }
            r4.<init>(r6, r1, r5)     // Catch:{ NumberFormatException -> 0x005a, all -> 0x005e }
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x005a, all -> 0x005e }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x005a, all -> 0x005e }
            int r5 = r4.intValue()     // Catch:{ NumberFormatException -> 0x005a, all -> 0x005e }
            if (r5 <= r3) goto L_0x005a
            int r4 = r4.intValue()     // Catch:{ NumberFormatException -> 0x005a, all -> 0x005e }
            r3 = r4
        L_0x005a:
            r7.close()     // Catch:{ IOException -> 0x0083 }
            goto L_0x0063
        L_0x005e:
            r2 = move-exception
            r7.close()     // Catch:{ IOException -> 0x0083 }
            throw r2     // Catch:{ IOException -> 0x0083 }
        L_0x0063:
            int r2 = r2 + 1
            goto L_0x0004
        L_0x0066:
            if (r3 != r0) goto L_0x0084
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0083 }
            java.lang.String r4 = "/proc/cpuinfo"
            r2.<init>(r4)     // Catch:{ IOException -> 0x0083 }
            java.lang.String r4 = "cpu MHz"
            int r4 = m136304a(r4, r2)     // Catch:{ all -> 0x007e }
            int r4 = r4 * 1000
            if (r4 <= r3) goto L_0x007a
            r3 = r4
        L_0x007a:
            r2.close()     // Catch:{ IOException -> 0x0083 }
            goto L_0x0084
        L_0x007e:
            r3 = move-exception
            r2.close()     // Catch:{ IOException -> 0x0083 }
            throw r3     // Catch:{ IOException -> 0x0083 }
        L_0x0083:
            r3 = -1
        L_0x0084:
            java.lang.String r0 = java.lang.String.valueOf(r3)
            int r0 = r0.length()
            r2 = 6
            if (r0 < r2) goto L_0x0090
            r1 = 1
        L_0x0090:
            if (r1 == 0) goto L_0x0094
            int r3 = r3 / 1000
        L_0x0094:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.utils.C42941at.m136324g():int");
    }

    /* renamed from: a */
    public static String m136308a() {
        BufferedReader bufferedReader;
        String str = ":";
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("/proc/cpuinfo"));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        m136309a((Closeable) bufferedReader);
                        break;
                    } else if (readLine.contains(str)) {
                        String[] split = readLine.split(str);
                        if (split[0].contains("Hardware")) {
                            String str2 = split[1];
                            m136309a((Closeable) bufferedReader);
                            return str2;
                        }
                    }
                } catch (IOException unused) {
                    bufferedReader2 = bufferedReader;
                    m136309a((Closeable) bufferedReader2);
                    return Build.HARDWARE;
                } catch (Throwable th) {
                    th = th;
                    m136309a((Closeable) bufferedReader);
                    throw th;
                }
            }
        } catch (IOException unused2) {
            m136309a((Closeable) bufferedReader2);
            return Build.HARDWARE;
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
            m136309a((Closeable) bufferedReader);
            throw th;
        }
        return Build.HARDWARE;
    }

    /* renamed from: a */
    private static void m136309a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: h */
    private static int m136326h(Context context) {
        try {
            if ((context.getApplicationInfo().flags & 262144) == 262144) {
                return 1;
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: b */
    private static int m136310b(String str) {
        if (str == null || !str.matches("0-[\\d]+$")) {
            return -1;
        }
        return Integer.valueOf(str.substring(2)).intValue() + 1;
    }

    /* renamed from: d */
    public static C42944b m136317d(Context context) {
        C42944b bVar = new C42944b();
        bVar.f111478a = m136323f(context);
        bVar.f111479b = m136325g(context);
        return bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0024 A[SYNTHETIC, Splitter:B:15:0x0024] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002a A[SYNTHETIC, Splitter:B:21:0x002a] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m136303a(java.lang.String r2) {
        /*
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0028, all -> 0x0020 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0028, all -> 0x0020 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ IOException -> 0x001e, all -> 0x001c }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x001e, all -> 0x001c }
            r0.<init>(r1)     // Catch:{ IOException -> 0x001e, all -> 0x001c }
            r2.<init>(r0)     // Catch:{ IOException -> 0x001e, all -> 0x001c }
            java.lang.String r2 = r2.readLine()     // Catch:{ IOException -> 0x001e, all -> 0x001c }
            int r2 = m136310b(r2)     // Catch:{ IOException -> 0x001e, all -> 0x001c }
            r1.close()     // Catch:{ IOException -> 0x001b }
        L_0x001b:
            return r2
        L_0x001c:
            r2 = move-exception
            goto L_0x0022
        L_0x001e:
            r0 = r1
            goto L_0x0028
        L_0x0020:
            r2 = move-exception
            r1 = r0
        L_0x0022:
            if (r1 == 0) goto L_0x0027
            r1.close()     // Catch:{ IOException -> 0x0027 }
        L_0x0027:
            throw r2
        L_0x0028:
            if (r0 == 0) goto L_0x002d
            r0.close()     // Catch:{ IOException -> 0x002d }
        L_0x002d:
            r2 = -1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.utils.C42941at.m136303a(java.lang.String):int");
    }

    /* renamed from: b */
    public static C42943a m136311b(Context context) {
        C42943a aVar = new C42943a();
        aVar.f111475a = m136308a();
        aVar.f111476b = m136324g() * 1000;
        aVar.f111477c = m136319e();
        return aVar;
    }

    /* renamed from: c */
    private static long m136313c(String str) {
        try {
            StatFs statFs = new StatFs(str);
            if (VERSION.SDK_INT >= 18) {
                return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
            }
            return ((long) statFs.getBlockSize()) * ((long) statFs.getAvailableBlocks());
        } catch (IllegalArgumentException unused) {
            return -1;
        }
    }

    /* renamed from: d */
    private static long m136316d(String str) {
        try {
            StatFs statFs = new StatFs(str);
            if (VERSION.SDK_INT >= 18) {
                return statFs.getBlockSizeLong() * statFs.getBlockCountLong();
            }
            return ((long) statFs.getBlockSize()) * ((long) statFs.getBlockCount());
        } catch (IllegalArgumentException unused) {
            return -1;
        }
    }

    /* renamed from: e */
    public static int m136320e(Context context) {
        try {
            return ((ActivityManager) context.getSystemService("activity")).getProcessMemoryInfo(new int[]{Process.myPid()})[0].getTotalPss();
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: c */
    public static C42946d m136314c(Context context) {
        C42946d dVar = new C42946d();
        dVar.f111487e = m136329i(context);
        dVar.f111483a = m136330j();
        dVar.f111485c = m136327h();
        dVar.f111484b = m136331k();
        dVar.f111486d = m136328i();
        dVar.f111488f = m136326h(context);
        return dVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0032  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m136321e(java.lang.String r4) {
        /*
            r0 = 0
            r1 = 0
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch:{ Exception -> 0x002f, all -> 0x0027 }
            java.lang.Process r4 = r2.exec(r4)     // Catch:{ Exception -> 0x002f, all -> 0x0027 }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0030, all -> 0x0025 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0030, all -> 0x0025 }
            java.io.InputStream r3 = r4.getInputStream()     // Catch:{ Exception -> 0x0030, all -> 0x0025 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0030, all -> 0x0025 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0030, all -> 0x0025 }
            java.lang.String r1 = r1.readLine()     // Catch:{ Exception -> 0x0030, all -> 0x0025 }
            if (r1 == 0) goto L_0x001f
            r0 = 1
        L_0x001f:
            if (r4 == 0) goto L_0x0024
            r4.destroy()
        L_0x0024:
            return r0
        L_0x0025:
            r0 = move-exception
            goto L_0x0029
        L_0x0027:
            r0 = move-exception
            r4 = r1
        L_0x0029:
            if (r4 == 0) goto L_0x002e
            r4.destroy()
        L_0x002e:
            throw r0
        L_0x002f:
            r4 = r1
        L_0x0030:
            if (r4 == 0) goto L_0x0035
            r4.destroy()
        L_0x0035:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.utils.C42941at.m136321e(java.lang.String):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long m136323f(android.content.Context r6) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = -1
            r3 = 16
            if (r0 < r3) goto L_0x001d
            android.app.ActivityManager$MemoryInfo r0 = new android.app.ActivityManager$MemoryInfo
            r0.<init>()
            java.lang.String r3 = "activity"
            java.lang.Object r6 = r6.getSystemService(r3)
            android.app.ActivityManager r6 = (android.app.ActivityManager) r6
            if (r6 == 0) goto L_0x001d
            r6.getMemoryInfo(r0)
            long r3 = r0.totalMem
            goto L_0x001e
        L_0x001d:
            r3 = r1
        L_0x001e:
            int r6 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r6 != 0) goto L_0x0048
            r6 = 0
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0045, all -> 0x0040 }
            java.lang.String r1 = "/proc/meminfo"
            r0.<init>(r1)     // Catch:{ Exception -> 0x0045, all -> 0x0040 }
            java.lang.String r6 = "MemTotal"
            int r6 = m136304a(r6, r0)     // Catch:{ Exception -> 0x003e, all -> 0x0039 }
            long r1 = (long) r6
            r3 = 1024(0x400, double:5.06E-321)
            long r3 = r3 * r1
            m136309a(r0)
            goto L_0x0048
        L_0x0039:
            r6 = move-exception
            r5 = r0
            r0 = r6
            r6 = r5
            goto L_0x0041
        L_0x003e:
            r6 = r0
            goto L_0x0045
        L_0x0040:
            r0 = move-exception
        L_0x0041:
            m136309a(r6)
            throw r0
        L_0x0045:
            m136309a(r6)
        L_0x0048:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.utils.C42941at.m136323f(android.content.Context):long");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long m136325g(android.content.Context r6) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = -1
            r3 = 16
            if (r0 < r3) goto L_0x001d
            android.app.ActivityManager$MemoryInfo r0 = new android.app.ActivityManager$MemoryInfo
            r0.<init>()
            java.lang.String r3 = "activity"
            java.lang.Object r6 = r6.getSystemService(r3)
            android.app.ActivityManager r6 = (android.app.ActivityManager) r6
            if (r6 == 0) goto L_0x001d
            r6.getMemoryInfo(r0)
            long r3 = r0.availMem
            goto L_0x001e
        L_0x001d:
            r3 = r1
        L_0x001e:
            int r6 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r6 != 0) goto L_0x0048
            r6 = 0
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0045, all -> 0x0040 }
            java.lang.String r1 = "/proc/meminfo"
            r0.<init>(r1)     // Catch:{ Exception -> 0x0045, all -> 0x0040 }
            java.lang.String r6 = "MemAvailable"
            int r6 = m136304a(r6, r0)     // Catch:{ Exception -> 0x003e, all -> 0x0039 }
            long r1 = (long) r6
            r3 = 1024(0x400, double:5.06E-321)
            long r3 = r3 * r1
            m136309a(r0)
            goto L_0x0048
        L_0x0039:
            r6 = move-exception
            r5 = r0
            r0 = r6
            r6 = r5
            goto L_0x0041
        L_0x003e:
            r6 = r0
            goto L_0x0045
        L_0x0040:
            r0 = move-exception
        L_0x0041:
            m136309a(r6)
            throw r0
        L_0x0045:
            m136309a(r6)
        L_0x0048:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.utils.C42941at.m136325g(android.content.Context):long");
    }

    /* renamed from: i */
    private static long m136329i(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            String packageName = context.getPackageName();
            if (TextUtils.isEmpty(packageName)) {
                return -1;
            }
            StringBuilder sb = new StringBuilder("/data/data/");
            sb.append(packageName);
            File file = new File(sb.toString());
            if (!file.exists()) {
                return -1;
            }
            long a = m136306a(file);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Environment.getExternalStorageDirectory().getAbsolutePath());
            sb2.append("/Android/data/");
            sb2.append(packageName);
            File file2 = new File(sb2.toString());
            long j = 0;
            if (file2.exists()) {
                j = m136306a(file2);
            }
            return a + j;
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: a */
    private static long m136306a(File file) {
        long j;
        File[] listFiles = file.listFiles();
        long j2 = 0;
        if (listFiles == null) {
            return 0;
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                j = m136306a(file2);
            } else {
                j = file2.length();
            }
            j2 += j;
        }
        return j2;
    }

    /* renamed from: a */
    public static C42945c m136307a(Context context) {
        C42945c cVar = new C42945c();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            cVar.f111480a = displayMetrics.densityDpi;
            cVar.f111481b = displayMetrics.widthPixels;
            cVar.f111482c = displayMetrics.heightPixels;
        }
        return cVar;
    }

    /* renamed from: a */
    private static int m136304a(String str, FileInputStream fileInputStream) {
        byte[] bArr = new byte[PreloadTask.BYTE_UNIT_NUMBER];
        try {
            int read = fileInputStream.read(bArr);
            int i = 0;
            while (i < read) {
                if (bArr[i] == 10 || i == 0) {
                    if (bArr[i] == 10) {
                        i++;
                    }
                    int i2 = i;
                    while (i2 < read) {
                        int i3 = i2 - i;
                        if (bArr[i2] != str.charAt(i3)) {
                            continue;
                            break;
                        } else if (i3 == str.length() - 1) {
                            return m136305a(bArr, i2);
                        } else {
                            i2++;
                        }
                    }
                    continue;
                }
                i++;
            }
        } catch (IOException | NumberFormatException unused) {
        }
        return -1;
    }

    /* renamed from: a */
    private static int m136305a(byte[] bArr, int i) {
        while (i < 1024 && bArr[i] != 10) {
            if (Character.isDigit(bArr[i])) {
                int i2 = i + 1;
                while (i2 < 1024 && Character.isDigit(bArr[i2])) {
                    i2++;
                }
                return Integer.parseInt(new String(bArr, 0, i, i2 - i));
            }
            i++;
        }
        return -1;
    }
}
