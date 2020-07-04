package com.bytedance.crash.nativecrash;

import android.content.Context;
import android.os.Environment;
import com.bytedance.crash.C9875d;
import com.bytedance.crash.C9908h;
import com.bytedance.crash.C9918j;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.event.C9887a;
import com.bytedance.crash.event.C9888b;
import com.bytedance.crash.p493d.C9876a;
import com.bytedance.crash.p493d.p494a.C9877a;
import com.bytedance.crash.p497f.C9896a;
import com.bytedance.crash.p497f.C9898c;
import com.bytedance.crash.p501j.C9957i;
import com.bytedance.crash.p504l.C10001t;
import com.bytedance.crash.p504l.C9982g;
import com.bytedance.crash.p504l.C9984i;
import com.bytedance.crash.p504l.C9992m;
import com.bytedance.crash.p504l.C9996p;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.nativecrash.c */
public final class C10008c {

    /* renamed from: d */
    private static Boolean f27247d;

    /* renamed from: a */
    public C10010b f27248a;

    /* renamed from: b */
    private final Context f27249b;

    /* renamed from: c */
    private JSONObject f27250c;

    /* renamed from: com.bytedance.crash.nativecrash.c$a */
    static class C10009a {
        /* renamed from: a */
        public static String m29735a(File file) {
            BufferedReader bufferedReader = null;
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
                try {
                    String readLine = bufferedReader2.readLine();
                    if (readLine == null) {
                        String str = "";
                        C9984i.m29565a((Closeable) bufferedReader2);
                        return str;
                    } else if (!readLine.startsWith("[FATAL:jni_android.cc") || !readLine.contains("Please include Java exception stack in crash report ttwebview:")) {
                        C9984i.m29565a((Closeable) bufferedReader2);
                        return "";
                    } else {
                        StringBuilder sb = new StringBuilder();
                        int indexOf = readLine.indexOf(" ttwebview:");
                        sb.append("Caused by: ");
                        sb.append("Please include Java exception stack in crash report");
                        sb.append("\n");
                        sb.append(readLine.substring(indexOf + 11));
                        sb.append("\n");
                        while (true) {
                            String readLine2 = bufferedReader2.readLine();
                            if (readLine2 != null) {
                                sb.append(readLine2);
                                sb.append("\n");
                            } else {
                                String sb2 = sb.toString();
                                C9984i.m29565a((Closeable) bufferedReader2);
                                return sb2;
                            }
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    C9984i.m29565a((Closeable) bufferedReader2);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                C9875d.m29130a().mo24453a("NPTH_CATCH", th);
                C9984i.m29565a((Closeable) bufferedReader);
                return "";
            }
        }
    }

    /* renamed from: com.bytedance.crash.nativecrash.c$b */
    class C10010b {

        /* renamed from: a */
        public final C10015d f27251a;

        /* renamed from: b */
        public final C10006a f27252b;

        /* renamed from: c */
        public final C10007b f27253c;

        /* renamed from: d */
        public final File f27254d;

        /* renamed from: b */
        public final boolean mo24632b() {
            return this.f27252b.mo24614a();
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x001a A[Catch:{ Throwable -> 0x0015 }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final long mo24631a() {
            /*
                r3 = this;
                com.bytedance.crash.nativecrash.a r0 = r3.f27252b
                java.util.Map<java.lang.String, java.lang.String> r0 = r0.f27245a
                if (r0 == 0) goto L_0x0017
                boolean r1 = r0.isEmpty()     // Catch:{ Throwable -> 0x0015 }
                if (r1 != 0) goto L_0x0017
                java.lang.String r1 = "start_time"
                java.lang.Object r0 = r0.get(r1)     // Catch:{ Throwable -> 0x0015 }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Throwable -> 0x0015 }
                goto L_0x0018
            L_0x0015:
                r0 = move-exception
                goto L_0x001f
            L_0x0017:
                r0 = 0
            L_0x0018:
                if (r0 == 0) goto L_0x0028
                long r0 = java.lang.Long.parseLong(r0)     // Catch:{ Throwable -> 0x0015 }
                return r0
            L_0x001f:
                com.bytedance.crash.e r1 = com.bytedance.crash.C9875d.m29130a()
                java.lang.String r2 = "NPTH_CATCH"
                r1.mo24453a(r2, r0)
            L_0x0028:
                long r0 = java.lang.System.currentTimeMillis()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.nativecrash.C10008c.C10010b.mo24631a():long");
        }

        public C10010b(File file) {
            this.f27254d = file;
            this.f27252b = new C10006a(file);
            this.f27253c = new C10007b(file);
            this.f27251a = new C10015d(file);
            if (this.f27252b.mo24614a() && this.f27251a.f27274f == null) {
                this.f27251a.mo24635a(file);
            }
        }
    }

    /* renamed from: com.bytedance.crash.nativecrash.c$c */
    public class C10011c extends C10013e {
        C10011c() {
            super();
            this.f27259c = "Total FD Count:";
            this.f27258b = C9992m.m29616k(C10008c.this.f27248a.f27254d);
            this.f27260d = ":";
            this.f27261e = -2;
        }
    }

    /* renamed from: com.bytedance.crash.nativecrash.c$d */
    public class C10012d extends C10013e {
        C10012d() {
            super();
            this.f27259c = "VmSize:";
            this.f27258b = C9992m.m29618m(C10008c.this.f27248a.f27254d);
            this.f27260d = "\\s+";
            this.f27261e = -1;
        }
    }

    /* renamed from: com.bytedance.crash.nativecrash.c$e */
    public class C10013e {

        /* renamed from: b */
        protected File f27258b;

        /* renamed from: c */
        protected String f27259c;

        /* renamed from: d */
        protected String f27260d;

        /* renamed from: e */
        protected int f27261e;

        /* JADX WARNING: Removed duplicated region for block: B:25:0x004b  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0052  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int mo24633a() {
            /*
                r5 = this;
                java.io.File r0 = r5.f27258b
                boolean r0 = r0.exists()
                r1 = -1
                if (r0 == 0) goto L_0x0056
                java.io.File r0 = r5.f27258b
                boolean r0 = r0.isFile()
                if (r0 != 0) goto L_0x0012
                goto L_0x0056
            L_0x0012:
                r0 = 0
                java.io.FileReader r2 = new java.io.FileReader     // Catch:{ Throwable -> 0x003f }
                java.io.File r3 = r5.f27258b     // Catch:{ Throwable -> 0x003f }
                r2.<init>(r3)     // Catch:{ Throwable -> 0x003f }
                java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x003f }
                r3.<init>(r2)     // Catch:{ Throwable -> 0x003f }
                r0 = -1
            L_0x0020:
                java.lang.String r2 = r3.readLine()     // Catch:{ Throwable -> 0x0038, all -> 0x0034 }
                if (r2 == 0) goto L_0x0030
                int r2 = r5.m29738a(r2)     // Catch:{ Throwable -> 0x0038, all -> 0x0034 }
                if (r2 == r1) goto L_0x002e
                r0 = r2
                goto L_0x0030
            L_0x002e:
                r0 = r2
                goto L_0x0020
            L_0x0030:
                com.bytedance.crash.p504l.C9984i.m29565a(r3)
                goto L_0x004f
            L_0x0034:
                r0 = move-exception
                r1 = r0
                r0 = r3
                goto L_0x0050
            L_0x0038:
                r1 = move-exception
                r2 = r1
                r1 = r0
                r0 = r3
                goto L_0x0040
            L_0x003d:
                r1 = move-exception
                goto L_0x0050
            L_0x003f:
                r2 = move-exception
            L_0x0040:
                com.bytedance.crash.e r3 = com.bytedance.crash.C9875d.m29130a()     // Catch:{ all -> 0x003d }
                java.lang.String r4 = "NPTH_CATCH"
                r3.mo24453a(r4, r2)     // Catch:{ all -> 0x003d }
                if (r0 == 0) goto L_0x004e
                com.bytedance.crash.p504l.C9984i.m29565a(r0)
            L_0x004e:
                r0 = r1
            L_0x004f:
                return r0
            L_0x0050:
                if (r0 == 0) goto L_0x0055
                com.bytedance.crash.p504l.C9984i.m29565a(r0)
            L_0x0055:
                throw r1
            L_0x0056:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.nativecrash.C10008c.C10013e.mo24633a():int");
        }

        public C10013e() {
        }

        /* renamed from: a */
        private int m29738a(String str) {
            int i = this.f27261e;
            if (!str.startsWith(this.f27259c)) {
                return i;
            }
            try {
                i = Integer.parseInt(str.split(this.f27260d)[1].trim());
            } catch (NumberFormatException e) {
                C9875d.m29130a().mo24453a("NPTH_CATCH", (Throwable) e);
            }
            if (i < 0) {
                return -2;
            }
            return i;
        }
    }

    /* renamed from: com.bytedance.crash.nativecrash.c$f */
    public class C10014f extends C10013e {
        C10014f() {
            super();
            this.f27259c = "Total Threads Count:";
            this.f27258b = C9992m.m29617l(C10008c.this.f27248a.f27254d);
            this.f27260d = ":";
            this.f27261e = -2;
        }
    }

    /* renamed from: a */
    public final long mo24616a() {
        return this.f27248a.mo24631a();
    }

    /* renamed from: s */
    private int m29717s() {
        return new C10011c().mo24633a();
    }

    /* renamed from: t */
    private int m29718t() {
        return new C10014f().mo24633a();
    }

    /* renamed from: u */
    private int m29719u() {
        return new C10012d().mo24633a();
    }

    /* renamed from: b */
    public final Map<String, String> mo24618b() {
        if (this.f27248a != null) {
            return this.f27248a.f27253c.f27246a;
        }
        return null;
    }

    /* renamed from: c */
    public final Map<String, String> mo24619c() {
        if (this.f27248a != null) {
            return this.f27248a.f27252b.f27245a;
        }
        return null;
    }

    /* renamed from: e */
    public final boolean mo24621e() {
        if (this.f27248a != null) {
            return this.f27248a.mo24632b();
        }
        return false;
    }

    /* renamed from: n */
    public final boolean mo24629n() {
        return C9982g.m29547a(this.f27248a.f27254d);
    }

    /* renamed from: l */
    public static long m29713l() {
        if (NativeImpl.m29695e()) {
            return Long.MAX_VALUE;
        }
        if (C9898c.m29252a()) {
            return 3891200;
        }
        return 2867200;
    }

    /* renamed from: d */
    public final String mo24620d() {
        if (this.f27248a == null) {
            return null;
        }
        String a = this.f27248a.f27251a.mo24634a();
        if (a == null || a.isEmpty()) {
            a = this.f27248a.f27252b.mo24615b();
        }
        return a;
    }

    /* renamed from: g */
    public final void mo24623g() {
        ArrayList a = C9887a.m29175a(this);
        if (a != null && !a.isEmpty()) {
            C9888b.m29184a(a);
            C9888b.m29187c();
            m29715q();
        }
    }

    /* renamed from: j */
    public final boolean mo24626j() {
        return C9876a.m29132a().mo24442a(C9992m.m29612h(this.f27248a.f27254d).getAbsolutePath());
    }

    /* renamed from: k */
    public final void mo24627k() {
        C9876a.m29132a().mo24441a(C9877a.m29137a(C9992m.m29612h(this.f27248a.f27254d).getAbsolutePath()));
    }

    /* renamed from: q */
    private void m29715q() {
        File b = C9992m.m29596b(this.f27248a.f27254d);
        if (b.exists()) {
            File c = C9992m.m29600c(this.f27248a.f27254d);
            if (c.exists()) {
                c.delete();
            }
            if (!b.renameTo(c)) {
                b.delete();
            }
        }
    }

    /* renamed from: r */
    private C9898c m29716r() {
        C9898c cVar = new C9898c(this.f27249b);
        C9898c.m29253b(cVar);
        JSONObject a = C9957i.m29466a().mo24583a(this.f27248a.mo24631a());
        if (a != null) {
            cVar.mo24510b(a);
            if (C9918j.m29332a() != null) {
                cVar.mo24508a(C9918j.m29338c().mo24593a());
                cVar.mo24507a(C9918j.m29332a().f27069a.mo24480c());
            }
        }
        return cVar;
    }

    /* renamed from: i */
    public final boolean mo24625i() {
        C9908h hVar = C9918j.m29337b().f26865g;
        if (hVar != null) {
            try {
                if (!hVar.mo24521a(mo24620d(), "")) {
                    return false;
                }
            } catch (Throwable th) {
                C9875d.m29130a().mo24453a("NPTH_CATCH", th);
            }
        }
        return true;
    }

    /* renamed from: m */
    public final JSONObject mo24628m() {
        try {
            C9896a aVar = new C9896a();
            m29704a(aVar);
            m29712h(aVar);
            m29707c(aVar);
            m29708d(aVar);
            m29709e(aVar);
            m29711g(aVar);
            m29710f(aVar);
            m29706b(aVar);
            File h = C9992m.m29612h(this.f27248a.f27254d);
            JSONObject jSONObject = aVar.f26984a;
            C9982g.m29543a(h, jSONObject, false);
            return jSONObject;
        } catch (Throwable th) {
            C9875d.m29130a().mo24453a("NPTH_CATCH", th);
            return null;
        }
    }

    /* renamed from: p */
    public static boolean m29714p() {
        if (f27247d != null) {
            return f27247d.booleanValue();
        }
        String[] strArr = {"/data/local/su", "/data/local/bin/su", "/data/local/xbin/su", "/system/xbin/su", "/system/bin/su", "/system/bin/.ext/su", "/system/bin/failsafe/su", "/system/sd/xbin/su", "/system/usr/we-need-root/su", "/sbin/su", "/su/bin/su"};
        int i = 0;
        while (i < 11) {
            try {
                if (new File(strArr[i]).exists()) {
                    Boolean valueOf = Boolean.valueOf(true);
                    f27247d = valueOf;
                    return valueOf.booleanValue();
                }
                i++;
            } catch (Throwable th) {
                C9875d.m29130a().mo24453a("NPTH_CATCH", th);
            }
        }
        Boolean valueOf2 = Boolean.valueOf(false);
        f27247d = valueOf2;
        return valueOf2.booleanValue();
    }

    /* renamed from: f */
    public final JSONObject mo24622f() {
        File h = C9992m.m29612h(this.f27248a.f27254d);
        if (!h.exists()) {
            return null;
        }
        try {
            String c = C9982g.m29555c(h.getAbsolutePath());
            if (c != null && !c.isEmpty()) {
                return new JSONObject(c);
            }
        } catch (Throwable th) {
            C9875d.m29130a().mo24453a("NPTH_CATCH", th);
        }
        return null;
    }

    /* renamed from: o */
    public final void mo24630o() {
        try {
            String absolutePath = this.f27248a.f27254d.getAbsolutePath();
            StringBuilder sb = new StringBuilder();
            sb.append(Environment.getExternalStorageDirectory().getAbsolutePath());
            sb.append("/localDebug");
            sb.append("/");
            sb.append(C9918j.m29342g().getPackageName());
            sb.append("/");
            sb.append(this.f27248a.f27254d.getName());
            sb.append(".zip");
            C9982g.m29556c(absolutePath, sb.toString());
        } catch (Throwable th) {
            C9875d.m29130a().mo24453a("NPTH_CATCH", th);
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x00c6 */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00cc A[Catch:{ IOException -> 0x0101 }] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24624h() {
        /*
            r10 = this;
            com.bytedance.crash.nativecrash.c$b r0 = r10.f27248a     // Catch:{ IOException -> 0x0101 }
            java.io.File r0 = r0.f27254d     // Catch:{ IOException -> 0x0101 }
            java.io.File r0 = com.bytedance.crash.p504l.C9992m.m29610g(r0)     // Catch:{ IOException -> 0x0101 }
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x0101 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0101 }
            r2.<init>()     // Catch:{ IOException -> 0x0101 }
            java.lang.String r3 = r0.getAbsolutePath()     // Catch:{ IOException -> 0x0101 }
            r2.append(r3)     // Catch:{ IOException -> 0x0101 }
            java.lang.String r3 = ".tmp'"
            r2.append(r3)     // Catch:{ IOException -> 0x0101 }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x0101 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0101 }
            boolean r2 = r1.exists()     // Catch:{ IOException -> 0x0101 }
            if (r2 == 0) goto L_0x002b
            r1.delete()     // Catch:{ IOException -> 0x0101 }
        L_0x002b:
            boolean r2 = r0.exists()     // Catch:{ IOException -> 0x0101 }
            r3 = 46
            r4 = 6
            r5 = 0
            if (r2 == 0) goto L_0x005e
        L_0x0035:
            if (r5 >= r4) goto L_0x010b
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x0101 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0101 }
            r2.<init>()     // Catch:{ IOException -> 0x0101 }
            java.lang.String r6 = r0.getAbsolutePath()     // Catch:{ IOException -> 0x0101 }
            r2.append(r6)     // Catch:{ IOException -> 0x0101 }
            r2.append(r3)     // Catch:{ IOException -> 0x0101 }
            r2.append(r5)     // Catch:{ IOException -> 0x0101 }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x0101 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0101 }
            boolean r2 = r1.exists()     // Catch:{ IOException -> 0x0101 }
            if (r2 == 0) goto L_0x005b
            r1.delete()     // Catch:{ IOException -> 0x0101 }
        L_0x005b:
            int r5 = r5 + 1
            goto L_0x0035
        L_0x005e:
            com.bytedance.crash.f.a r2 = new com.bytedance.crash.f.a     // Catch:{ IOException -> 0x0101 }
            r2.<init>()     // Catch:{ IOException -> 0x0101 }
            r6 = 0
        L_0x0064:
            if (r6 >= r4) goto L_0x00ab
            java.io.File r7 = new java.io.File     // Catch:{ IOException -> 0x0101 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0101 }
            r8.<init>()     // Catch:{ IOException -> 0x0101 }
            java.lang.String r9 = r0.getAbsolutePath()     // Catch:{ IOException -> 0x0101 }
            r8.append(r9)     // Catch:{ IOException -> 0x0101 }
            r8.append(r3)     // Catch:{ IOException -> 0x0101 }
            r8.append(r6)     // Catch:{ IOException -> 0x0101 }
            java.lang.String r8 = r8.toString()     // Catch:{ IOException -> 0x0101 }
            r7.<init>(r8)     // Catch:{ IOException -> 0x0101 }
            boolean r8 = r7.exists()     // Catch:{ IOException -> 0x0101 }
            if (r8 == 0) goto L_0x00a8
            java.lang.String r7 = r7.getAbsolutePath()     // Catch:{ JSONException -> 0x009e }
            java.lang.String r7 = com.bytedance.crash.p504l.C9982g.m29555c(r7)     // Catch:{ JSONException -> 0x009e }
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ JSONException -> 0x009e }
            r8.<init>(r7)     // Catch:{ JSONException -> 0x009e }
            int r7 = r8.length()     // Catch:{ JSONException -> 0x009e }
            if (r7 <= 0) goto L_0x00a8
            r2.mo24503e(r8)     // Catch:{ JSONException -> 0x009e }
            goto L_0x00a8
        L_0x009e:
            r7 = move-exception
            com.bytedance.crash.e r8 = com.bytedance.crash.C9875d.m29130a()     // Catch:{ IOException -> 0x0101 }
            java.lang.String r9 = "NPTH_CATCH"
            r8.mo24453a(r9, r7)     // Catch:{ IOException -> 0x0101 }
        L_0x00a8:
            int r6 = r6 + 1
            goto L_0x0064
        L_0x00ab:
            org.json.JSONObject r2 = r2.f26984a     // Catch:{ IOException -> 0x0101 }
            int r6 = r2.length()     // Catch:{ Throwable -> 0x00c6 }
            if (r6 == 0) goto L_0x00c6
            java.lang.String r6 = "storage"
            java.lang.Object r6 = r2.opt(r6)     // Catch:{ Throwable -> 0x00c6 }
            if (r6 != 0) goto L_0x00c6
            android.content.Context r6 = com.bytedance.crash.C9918j.m29342g()     // Catch:{ Throwable -> 0x00c6 }
            org.json.JSONObject r6 = com.bytedance.crash.p504l.C10001t.m29663a(r6)     // Catch:{ Throwable -> 0x00c6 }
            com.bytedance.crash.p497f.C9896a.m29214a(r2, r6)     // Catch:{ Throwable -> 0x00c6 }
        L_0x00c6:
            int r6 = r2.length()     // Catch:{ IOException -> 0x0101 }
            if (r6 == 0) goto L_0x0100
            r10.f27250c = r2     // Catch:{ IOException -> 0x0101 }
            com.bytedance.crash.p504l.C9982g.m29552b(r1, r2, r5)     // Catch:{ IOException -> 0x0101 }
            boolean r1 = r1.renameTo(r0)     // Catch:{ IOException -> 0x0101 }
            if (r1 == 0) goto L_0x0100
        L_0x00d7:
            if (r5 >= r4) goto L_0x0100
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x0101 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0101 }
            r2.<init>()     // Catch:{ IOException -> 0x0101 }
            java.lang.String r6 = r0.getAbsolutePath()     // Catch:{ IOException -> 0x0101 }
            r2.append(r6)     // Catch:{ IOException -> 0x0101 }
            r2.append(r3)     // Catch:{ IOException -> 0x0101 }
            r2.append(r5)     // Catch:{ IOException -> 0x0101 }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x0101 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0101 }
            boolean r2 = r1.exists()     // Catch:{ IOException -> 0x0101 }
            if (r2 == 0) goto L_0x00fd
            r1.delete()     // Catch:{ IOException -> 0x0101 }
        L_0x00fd:
            int r5 = r5 + 1
            goto L_0x00d7
        L_0x0100:
            return
        L_0x0101:
            r0 = move-exception
            com.bytedance.crash.e r1 = com.bytedance.crash.C9875d.m29130a()
            java.lang.String r2 = "NPTH_CATCH"
            r1.mo24453a(r2, r0)
        L_0x010b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.nativecrash.C10008c.mo24624h():void");
    }

    public C10008c(Context context) {
        this.f27249b = context;
    }

    /* renamed from: a */
    public final void mo24617a(File file) {
        this.f27248a = new C10010b(file);
    }

    /* renamed from: a */
    private void m29704a(C9896a aVar) {
        aVar.mo24484a(m29716r());
        aVar.mo24492a("is_native_crash", (Object) Integer.valueOf(1));
        aVar.mo24492a("repack_time", (Object) Long.valueOf(System.currentTimeMillis()));
        aVar.mo24492a("crash_uuid", (Object) this.f27248a.f27254d.getName());
    }

    /* renamed from: f */
    private void m29710f(C9896a aVar) {
        File c = C9992m.m29600c(this.f27248a.f27254d);
        if (c.exists()) {
            try {
                aVar.mo24492a("native_log", (Object) C9982g.m29551b(C9982g.m29540a(c.getAbsolutePath(), "\n"), "\n"));
            } catch (Throwable th) {
                C9875d.m29130a().mo24453a("NPTH_CATCH", th);
            }
        }
    }

    /* renamed from: c */
    private void m29707c(C9896a aVar) {
        Map<String, String> map = this.f27248a.f27251a.f27275g;
        if (!map.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            for (String str : map.keySet()) {
                String a = m29703a((String) map.get(str));
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("lib_name", str);
                    jSONObject.put("lib_uuid", a);
                    jSONArray.put(jSONObject);
                } catch (JSONException e) {
                    C9875d.m29130a().mo24453a("NPTH_CATCH", (Throwable) e);
                }
            }
            aVar.mo24492a("crash_lib_uuid", (Object) jSONArray);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0058 A[Catch:{ Throwable -> 0x005e }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0032  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m29709e(com.bytedance.crash.p497f.C9896a r5) {
        /*
            r4 = this;
            com.bytedance.crash.nativecrash.c$b r0 = r4.f27248a
            java.io.File r0 = r0.f27254d
            java.io.File r0 = com.bytedance.crash.p504l.C9992m.m29613i(r0)
            java.lang.String r1 = ""
            boolean r2 = r0.exists()
            if (r2 == 0) goto L_0x0023
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ Throwable -> 0x0019 }
            java.lang.String r0 = com.bytedance.crash.p504l.C9999s.m29643a(r0)     // Catch:{ Throwable -> 0x0019 }
            goto L_0x0024
        L_0x0019:
            r0 = move-exception
            com.bytedance.crash.e r2 = com.bytedance.crash.C9875d.m29130a()
            java.lang.String r3 = "NPTH_CATCH"
            r2.mo24453a(r3, r0)
        L_0x0023:
            r0 = r1
        L_0x0024:
            com.bytedance.crash.nativecrash.c$b r1 = r4.f27248a
            java.io.File r1 = r1.f27254d
            java.io.File r1 = com.bytedance.crash.p504l.C9992m.m29619n(r1)
            boolean r2 = r1.exists()
            if (r2 == 0) goto L_0x0052
            java.lang.String r1 = com.bytedance.crash.nativecrash.C10008c.C10009a.m29735a(r1)
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x0051
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "\n"
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            goto L_0x0052
        L_0x0051:
            r0 = r1
        L_0x0052:
            boolean r1 = r0.isEmpty()     // Catch:{ Throwable -> 0x005e }
            if (r1 != 0) goto L_0x005d
            java.lang.String r1 = "java_data"
            r5.mo24492a(r1, r0)     // Catch:{ Throwable -> 0x005e }
        L_0x005d:
            return
        L_0x005e:
            r5 = move-exception
            com.bytedance.crash.e r0 = com.bytedance.crash.C9875d.m29130a()
            java.lang.String r1 = "NPTH_CATCH"
            r0.mo24453a(r1, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.nativecrash.C10008c.m29709e(com.bytedance.crash.f.a):void");
    }

    /* renamed from: a */
    private static String m29703a(String str) {
        StringBuilder sb = new StringBuilder();
        try {
            if (str.length() < 16) {
                sb.append(str);
            } else {
                sb.append(str.charAt(6));
                sb.append(str.charAt(7));
                sb.append(str.charAt(4));
                sb.append(str.charAt(5));
                sb.append(str.charAt(2));
                sb.append(str.charAt(3));
                sb.append(str.charAt(0));
                sb.append(str.charAt(1));
                sb.append(str.charAt(10));
                sb.append(str.charAt(11));
                sb.append(str.charAt(8));
                sb.append(str.charAt(9));
                sb.append(str.charAt(14));
                sb.append(str.charAt(15));
                sb.append(str.charAt(12));
                sb.append(str.charAt(13));
                if (str.length() >= 32) {
                    sb.append(str, 16, 32);
                    sb.append('0');
                }
            }
        } catch (Throwable th) {
            C9875d.m29130a().mo24453a("NPTH_CATCH", th);
        }
        return sb.toString().toUpperCase();
    }

    /* renamed from: b */
    private void m29706b(C9896a aVar) {
        HashMap hashMap = new HashMap();
        if (m29714p()) {
            hashMap.put("is_root", "true");
            aVar.mo24492a("is_root", (Object) "true");
        } else {
            hashMap.put("is_root", "false");
            aVar.mo24492a("is_root", (Object) "false");
        }
        m29705a((Map<String, String>) hashMap);
        int s = m29717s();
        if (s > 0) {
            if (s > 960) {
                hashMap.put("fd_leak", "true");
            } else {
                hashMap.put("fd_leak", "false");
            }
            aVar.mo24492a("fd_count", (Object) Integer.valueOf(s));
        }
        int t = m29718t();
        if (t > 0) {
            if (t > 350) {
                hashMap.put("threads_leak", "true");
            } else {
                hashMap.put("threads_leak", "false");
            }
            aVar.mo24492a("threads_count", (Object) Integer.valueOf(t));
        }
        int u = m29719u();
        if (u > 0) {
            if (((long) u) > m29713l()) {
                hashMap.put("memory_leak", "true");
            } else {
                hashMap.put("memory_leak", "false");
            }
            aVar.mo24492a("memory_size", (Object) Integer.valueOf(u));
        }
        hashMap.put("sdk_version", "3.1.2-rc.0-oversea");
        aVar.mo24497b();
        aVar.mo24500c();
        aVar.mo24498c((Map<? extends String, ? extends String>) hashMap);
    }

    /* renamed from: d */
    private void m29708d(C9896a aVar) {
        JSONObject jSONObject;
        File g = C9992m.m29610g(this.f27248a.f27254d);
        if (g.exists() || this.f27250c != null) {
            try {
                if (this.f27250c == null) {
                    jSONObject = new JSONObject(C9982g.m29555c(g.getAbsolutePath()));
                } else {
                    jSONObject = this.f27250c;
                }
                aVar.mo24503e(jSONObject);
                aVar.mo24487a("has_callback", "true");
                if (aVar.f26984a.opt("storage") == null) {
                    aVar.mo24501d(C10001t.m29663a(C9918j.m29342g()));
                }
                C9996p.m29626a(aVar, aVar.mo24506g(), CrashType.NATIVE);
            } catch (Throwable th) {
                C9875d.m29130a().mo24453a("NPTH_CATCH", th);
            }
            long j = -1;
            long optLong = aVar.f26984a.optLong("crash_time", -1);
            long optLong2 = aVar.f26984a.optLong("java_end", -1);
            if (!(optLong2 == -1 || optLong == -1)) {
                j = optLong2 - optLong;
            }
            try {
                aVar.mo24494b("total_cost", String.valueOf(j));
                aVar.mo24487a("total_cost", String.valueOf(j / 1000));
            } catch (Throwable unused) {
            }
        } else {
            aVar.mo24501d(C10001t.m29663a(C9918j.m29342g()));
            aVar.mo24487a("has_callback", "false");
        }
    }

    /* renamed from: g */
    private void m29711g(C9896a aVar) {
        String str;
        File j = C9992m.m29615j(this.f27248a.f27254d);
        if (!j.exists()) {
            NativeImpl.m29683a(j.getAbsolutePath(), String.valueOf(C9918j.m29344i().f27121g), String.valueOf(C9918j.m29344i().f27122h));
        }
        BufferedReader bufferedReader = null;
        JSONArray jSONArray = new JSONArray();
        StringBuilder sb = new StringBuilder(" ");
        sb.append((String) this.f27248a.f27252b.f27245a.get("pid"));
        sb.append(" ");
        String sb2 = sb.toString();
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(j));
            try {
                if (j.length() > 512000) {
                    bufferedReader2.skip(j.length() - 512000);
                }
                while (true) {
                    String readLine = bufferedReader2.readLine();
                    if (readLine == null) {
                        break;
                    }
                    if (readLine.length() > 32) {
                        str = readLine.substring(0, 31);
                    } else {
                        str = readLine;
                    }
                    if (str.contains(sb2)) {
                        jSONArray.put(readLine);
                    }
                }
                C9984i.m29565a((Closeable) bufferedReader2);
            } catch (Throwable th) {
                th = th;
                C9984i.m29565a((Closeable) bufferedReader2);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            C9875d.m29130a().mo24453a("NPTH_CATCH", th);
            C9984i.m29565a((Closeable) bufferedReader);
            aVar.mo24492a("logcat", (Object) jSONArray);
        }
        aVar.mo24492a("logcat", (Object) jSONArray);
    }

    /* renamed from: h */
    private void m29712h(C9896a aVar) {
        Map c = mo24619c();
        if (c != null) {
            String str = (String) c.get("process_name");
            if (str != null) {
                aVar.mo24492a("process_name", (Object) str);
            }
            String str2 = (String) c.get("start_time");
            if (str2 != null) {
                try {
                    aVar.mo24483a(Long.decode(str2).longValue());
                } catch (Throwable th) {
                    C9875d.m29130a().mo24453a("NPTH_CATCH", th);
                }
            }
            String str3 = (String) c.get("pid");
            if (str3 != null) {
                try {
                    aVar.mo24492a("pid", (Object) Long.decode(str3));
                } catch (Throwable th2) {
                    C9875d.m29130a().mo24453a("NPTH_CATCH", th2);
                }
            }
            String str4 = (String) c.get("crash_thread_name");
            if (str4 != null) {
                aVar.mo24492a("crash_thread_name", (Object) str4);
            }
            String str5 = (String) c.get("crash_time");
            if (str5 != null) {
                try {
                    aVar.mo24492a("crash_time", (Object) Long.decode(str5));
                } catch (Throwable th3) {
                    C9875d.m29130a().mo24453a("NPTH_CATCH", th3);
                }
            }
            aVar.mo24492a("data", (Object) mo24620d());
        }
    }

    /* renamed from: a */
    private void m29705a(Map<String, String> map) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7 = "has_fds_file";
        if (C9992m.m29616k(this.f27248a.f27254d).exists()) {
            str = "true";
        } else {
            str = "false";
        }
        map.put(str7, str);
        File j = C9992m.m29615j(this.f27248a.f27254d);
        String str8 = "has_logcat_file";
        if (!j.exists() || j.length() <= 128) {
            str2 = "false";
        } else {
            str2 = "true";
        }
        map.put(str8, str2);
        String str9 = "has_maps_file";
        if (C9992m.m29607f(this.f27248a.f27254d).exists()) {
            str3 = "true";
        } else {
            str3 = "false";
        }
        map.put(str9, str3);
        String str10 = "has_tombstone_file";
        if (C9992m.m29603d(this.f27248a.f27254d).exists()) {
            str4 = "true";
        } else {
            str4 = "false";
        }
        map.put(str10, str4);
        String str11 = "has_meminfo_file";
        if (C9992m.m29618m(this.f27248a.f27254d).exists()) {
            str5 = "true";
        } else {
            str5 = "false";
        }
        map.put(str11, str5);
        String str12 = "has_threads_file";
        if (C9992m.m29617l(this.f27248a.f27254d).exists()) {
            str6 = "true";
        } else {
            str6 = "false";
        }
        map.put(str12, str6);
    }
}
