package com.bytedance.crash.p501j;

import android.text.TextUtils;
import com.bytedance.crash.C9875d;
import com.bytedance.crash.C9918j;
import com.bytedance.crash.nativecrash.NativeImpl;
import com.bytedance.crash.p504l.C9984i;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import org.json.JSONArray;

/* renamed from: com.bytedance.crash.j.e */
public final class C9949e {

    /* renamed from: com.bytedance.crash.j.e$a */
    static class C9950a extends Thread {

        /* renamed from: a */
        private InputStream f27154a;

        /* renamed from: b */
        private List<String> f27155b;

        public final void run() {
            BufferedReader bufferedReader;
            Throwable th;
            BufferedReader bufferedReader2 = null;
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(this.f27154a));
                int i = 512000;
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        } else if (!readLine.startsWith("---------")) {
                            i -= readLine.getBytes("UTF-8").length;
                            if (i < 0) {
                                break;
                            }
                            this.f27155b.add(readLine);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        C9984i.m29565a((Closeable) bufferedReader);
                        throw th;
                    }
                }
                C9984i.m29565a((Closeable) bufferedReader);
            } catch (Throwable th3) {
                Throwable th4 = th3;
                bufferedReader = null;
                th = th4;
                C9984i.m29565a((Closeable) bufferedReader);
                throw th;
            }
        }

        C9950a(InputStream inputStream, List<String> list) {
            this.f27154a = inputStream;
            this.f27155b = list;
        }
    }

    /* renamed from: com.bytedance.crash.j.e$b */
    static class C9951b extends Thread {

        /* renamed from: a */
        private Process f27156a;

        /* renamed from: b */
        private long f27157b = 3000;

        public final void run() {
            try {
                sleep(this.f27157b);
            } catch (InterruptedException unused) {
            }
            if (this.f27156a != null) {
                this.f27156a.destroy();
            }
        }

        public C9951b(Process process, long j) {
            this.f27156a = process;
        }
    }

    /* renamed from: a */
    private static String m29442a(int i) {
        String[] strArr = {"*:V", "*:D", "*:I", "*:W", "*:E", "*:F"};
        if (i < 0 || i >= 6) {
            return "*:V";
        }
        return strArr[i];
    }

    /* renamed from: b */
    public static JSONArray m29446b(File file) {
        JSONArray jSONArray = null;
        try {
            File file2 = new File(file, "meminfo.txt");
            if (file2.exists()) {
                JSONArray a = m29445a(file2.getAbsolutePath());
                if (a != null) {
                    try {
                        if (a.length() > 0) {
                            return a;
                        }
                    } catch (Throwable th) {
                        Throwable th2 = th;
                        jSONArray = a;
                        th = th2;
                        C9875d.m29130a().mo24453a("NPTH_CATCH", th);
                        return jSONArray;
                    }
                }
                jSONArray = a;
            }
            if (jSONArray == null) {
                new JSONArray();
            }
            file2.createNewFile();
            NativeImpl.m29691c(file2.getAbsolutePath());
            return m29445a(file2.getAbsolutePath());
        } catch (Throwable th3) {
            th = th3;
            C9875d.m29130a().mo24453a("NPTH_CATCH", th);
            return jSONArray;
        }
    }

    /* renamed from: a */
    public static JSONArray m29444a(File file) {
        int i = C9918j.m29344i().f27121g;
        int i2 = C9918j.m29344i().f27122h;
        JSONArray jSONArray = null;
        try {
            File file2 = new File(file, "logcat.txt");
            if (file2.exists() && file2.length() > 0) {
                JSONArray a = m29445a(file2.getAbsolutePath());
                if (a != null) {
                    try {
                        if (a.length() > 0) {
                            return a;
                        }
                    } catch (Throwable th) {
                        th = th;
                        jSONArray = a;
                        C9875d.m29130a().mo24453a("NPTH_CATCH", th);
                        return jSONArray;
                    }
                }
                jSONArray = a;
            }
            if (jSONArray == null) {
                new JSONArray();
            }
            file2.createNewFile();
            NativeImpl.m29683a(file2.getAbsolutePath(), String.valueOf(i), String.valueOf(i2));
            return m29445a(file2.getAbsolutePath());
        } catch (Throwable th2) {
            th = th2;
            C9875d.m29130a().mo24453a("NPTH_CATCH", th);
            return jSONArray;
        }
    }

    /* renamed from: a */
    public static JSONArray m29445a(String str) {
        BufferedReader bufferedReader;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            bufferedReader = new BufferedReader(new FileReader(str));
            try {
                File file = new File(str);
                if (file.length() > 512000) {
                    bufferedReader.skip(file.length() - 512000);
                }
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        jSONArray.put(readLine);
                    } else {
                        C9984i.m29565a((Closeable) bufferedReader);
                        return jSONArray;
                    }
                }
            } catch (IOException unused) {
                C9984i.m29565a((Closeable) bufferedReader);
                return null;
            } catch (Throwable th) {
                th = th;
                C9984i.m29565a((Closeable) bufferedReader);
                throw th;
            }
        } catch (IOException unused2) {
            bufferedReader = null;
            C9984i.m29565a((Closeable) bufferedReader);
            return null;
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
            C9984i.m29565a((Closeable) bufferedReader);
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<java.lang.String> m29443a(int r5, int r6) {
        /*
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1 = 6
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.String r2 = "logcat"
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "-t"
            r3 = 1
            r1[r3] = r2
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r2 = 2
            r1[r2] = r5
            java.lang.String r5 = m29442a(r6)
            r6 = 3
            r1[r6] = r5
            java.lang.String r5 = "-b"
            r6 = 4
            r1[r6] = r5
            java.lang.String r5 = "main,system,crash,events"
            r6 = 5
            r1[r6] = r5
            r5 = 0
            java.lang.Runtime r6 = java.lang.Runtime.getRuntime()     // Catch:{ Throwable -> 0x0078, all -> 0x006e }
            java.lang.Process r6 = r6.exec(r1)     // Catch:{ Throwable -> 0x0078, all -> 0x006e }
            com.bytedance.crash.j.e$a r5 = new com.bytedance.crash.j.e$a     // Catch:{ Throwable -> 0x006c, all -> 0x006a }
            java.io.InputStream r1 = r6.getInputStream()     // Catch:{ Throwable -> 0x006c, all -> 0x006a }
            r5.<init>(r1, r0)     // Catch:{ Throwable -> 0x006c, all -> 0x006a }
            r5.start()     // Catch:{ Throwable -> 0x006c, all -> 0x006a }
            com.bytedance.crash.j.e$a r5 = new com.bytedance.crash.j.e$a     // Catch:{ Throwable -> 0x006c, all -> 0x006a }
            java.io.InputStream r1 = r6.getErrorStream()     // Catch:{ Throwable -> 0x006c, all -> 0x006a }
            r5.<init>(r1, r0)     // Catch:{ Throwable -> 0x006c, all -> 0x006a }
            r5.start()     // Catch:{ Throwable -> 0x006c, all -> 0x006a }
            com.bytedance.crash.j.e$b r5 = new com.bytedance.crash.j.e$b     // Catch:{ Throwable -> 0x006c, all -> 0x006a }
            r1 = 3000(0xbb8, double:1.482E-320)
            r5.<init>(r6, r1)     // Catch:{ Throwable -> 0x006c, all -> 0x006a }
            r5.start()     // Catch:{ Throwable -> 0x006c, all -> 0x006a }
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x006c, all -> 0x006a }
            r3 = 26
            if (r5 < r3) goto L_0x0061
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ Throwable -> 0x006c, all -> 0x006a }
            r6.waitFor(r1, r5)     // Catch:{ Throwable -> 0x006c, all -> 0x006a }
            goto L_0x0064
        L_0x0061:
            r6.waitFor()     // Catch:{ Throwable -> 0x006c, all -> 0x006a }
        L_0x0064:
            if (r6 == 0) goto L_0x007d
            r6.destroy()
            goto L_0x007d
        L_0x006a:
            r5 = move-exception
            goto L_0x0072
        L_0x006c:
            r5 = r6
            goto L_0x0078
        L_0x006e:
            r6 = move-exception
            r4 = r6
            r6 = r5
            r5 = r4
        L_0x0072:
            if (r6 == 0) goto L_0x0077
            r6.destroy()
        L_0x0077:
            throw r5
        L_0x0078:
            if (r5 == 0) goto L_0x007d
            r5.destroy()
        L_0x007d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p501j.C9949e.m29443a(int, int):java.util.List");
    }
}
