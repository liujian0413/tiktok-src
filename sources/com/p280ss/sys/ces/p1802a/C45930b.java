package com.p280ss.sys.ces.p1802a;

import java.io.File;
import java.io.FileFilter;
import java.util.HashMap;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.ss.sys.ces.a.b */
public final class C45930b {

    /* renamed from: a */
    private static final FileFilter f117399a = new FileFilter() {
        public final boolean accept(File file) {
            return Pattern.matches("cpu[0-9]", file.getName());
        }
    };

    /* renamed from: a */
    public static String m144049a() {
        JSONObject jSONObject = new JSONObject();
        try {
            HashMap b = m144052b();
            jSONObject.put("core", m144053c());
            jSONObject.put("hw", m144051a(b, "Hardware"));
            jSONObject.put("max", m144050a("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq"));
            jSONObject.put("min", m144050a("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_min_freq"));
            jSONObject.put("ft", m144051a(b, "Features"));
        } catch (Throwable unused) {
        }
        String jSONObject2 = jSONObject.toString();
        return jSONObject2 == null ? "{}" : jSONObject2.trim();
    }

    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r4v3, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r0v2, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r4v9, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: type inference failed for: r4v11 */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0012 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v0
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], ?[OBJECT, ARRAY]]
      uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], java.lang.String, java.io.BufferedReader]
      mth insns count: 33
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0026 A[SYNTHETIC, Splitter:B:22:0x0026] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x002d A[SYNTHETIC, Splitter:B:26:0x002d] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0035 A[SYNTHETIC, Splitter:B:33:0x0035] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x003c A[SYNTHETIC, Splitter:B:37:0x003c] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0044  */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m144050a(java.lang.String r4) {
        /*
            r0 = 0
            java.io.FileReader r1 = new java.io.FileReader     // Catch:{ Throwable -> 0x0031, all -> 0x0022 }
            r1.<init>(r4)     // Catch:{ Throwable -> 0x0031, all -> 0x0022 }
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x0020, all -> 0x001e }
            r4.<init>(r1)     // Catch:{ Throwable -> 0x0020, all -> 0x001e }
            java.lang.String r2 = r4.readLine()     // Catch:{ Throwable -> 0x001c, all -> 0x0017 }
            r4.close()     // Catch:{ Throwable -> 0x0012 }
        L_0x0012:
            r1.close()     // Catch:{ Throwable -> 0x0015 }
        L_0x0015:
            r0 = r2
            goto L_0x003f
        L_0x0017:
            r0 = move-exception
            r3 = r0
            r0 = r4
            r4 = r3
            goto L_0x0024
        L_0x001c:
            goto L_0x0033
        L_0x001e:
            r4 = move-exception
            goto L_0x0024
        L_0x0020:
            r4 = r0
            goto L_0x0033
        L_0x0022:
            r4 = move-exception
            r1 = r0
        L_0x0024:
            if (r0 == 0) goto L_0x002b
            r0.close()     // Catch:{ Throwable -> 0x002a }
            goto L_0x002b
        L_0x002a:
        L_0x002b:
            if (r1 == 0) goto L_0x0030
            r1.close()     // Catch:{ Throwable -> 0x0030 }
        L_0x0030:
            throw r4
        L_0x0031:
            r4 = r0
            r1 = r4
        L_0x0033:
            if (r4 == 0) goto L_0x003a
            r4.close()     // Catch:{ Throwable -> 0x0039 }
            goto L_0x003a
        L_0x0039:
        L_0x003a:
            if (r1 == 0) goto L_0x003f
            r1.close()     // Catch:{ Throwable -> 0x003f }
        L_0x003f:
            if (r0 != 0) goto L_0x0044
            java.lang.String r4 = "0"
            goto L_0x0048
        L_0x0044:
            java.lang.String r4 = r0.trim()
        L_0x0048:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.sys.ces.p1802a.C45930b.m144050a(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    private static String m144051a(HashMap<String, String> hashMap, String str) {
        String str2;
        try {
            str2 = (String) hashMap.get(str);
        } catch (Throwable unused) {
            str2 = null;
        }
        return str2 == null ? "" : str2.trim();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0062, code lost:
        if (r2 == null) goto L_0x0065;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003d */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f A[SYNTHETIC, Splitter:B:26:0x004f] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0056 A[SYNTHETIC, Splitter:B:30:0x0056] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x005d A[SYNTHETIC, Splitter:B:37:0x005d] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.HashMap<java.lang.String, java.lang.String> m144052b() {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1 = 0
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ Throwable -> 0x005a, all -> 0x004a }
            java.lang.String r3 = "/proc/cpuinfo"
            r2.<init>(r3)     // Catch:{ Throwable -> 0x005a, all -> 0x004a }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x0048, all -> 0x0045 }
            r3.<init>(r2)     // Catch:{ Throwable -> 0x0048, all -> 0x0045 }
        L_0x0012:
            java.lang.String r1 = r3.readLine()     // Catch:{ Throwable -> 0x0043, all -> 0x0041 }
            if (r1 == 0) goto L_0x003a
            java.lang.String r4 = ":"
            r5 = 2
            java.lang.String[] r1 = r1.split(r4, r5)     // Catch:{ Throwable -> 0x0043, all -> 0x0041 }
            int r4 = r1.length     // Catch:{ Throwable -> 0x0043, all -> 0x0041 }
            if (r4 < r5) goto L_0x0012
            r4 = 0
            r4 = r1[r4]     // Catch:{ Throwable -> 0x0043, all -> 0x0041 }
            java.lang.String r4 = r4.trim()     // Catch:{ Throwable -> 0x0043, all -> 0x0041 }
            r5 = 1
            r1 = r1[r5]     // Catch:{ Throwable -> 0x0043, all -> 0x0041 }
            java.lang.String r1 = r1.trim()     // Catch:{ Throwable -> 0x0043, all -> 0x0041 }
            java.lang.Object r5 = r0.get(r4)     // Catch:{ Throwable -> 0x0043, all -> 0x0041 }
            if (r5 != 0) goto L_0x0012
            r0.put(r4, r1)     // Catch:{ Throwable -> 0x0043, all -> 0x0041 }
            goto L_0x0012
        L_0x003a:
            r3.close()     // Catch:{ Throwable -> 0x003d }
        L_0x003d:
            r2.close()     // Catch:{ Throwable -> 0x0065 }
            goto L_0x0065
        L_0x0041:
            r0 = move-exception
            goto L_0x004d
        L_0x0043:
            r1 = r3
            goto L_0x005b
        L_0x0045:
            r0 = move-exception
            r3 = r1
            goto L_0x004d
        L_0x0048:
            goto L_0x005b
        L_0x004a:
            r0 = move-exception
            r2 = r1
            r3 = r2
        L_0x004d:
            if (r3 == 0) goto L_0x0054
            r3.close()     // Catch:{ Throwable -> 0x0053 }
            goto L_0x0054
        L_0x0053:
        L_0x0054:
            if (r2 == 0) goto L_0x0059
            r2.close()     // Catch:{ Throwable -> 0x0059 }
        L_0x0059:
            throw r0
        L_0x005a:
            r2 = r1
        L_0x005b:
            if (r1 == 0) goto L_0x0062
            r1.close()     // Catch:{ Throwable -> 0x0061 }
            goto L_0x0062
        L_0x0061:
        L_0x0062:
            if (r2 == 0) goto L_0x0065
            goto L_0x003d
        L_0x0065:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.sys.ces.p1802a.C45930b.m144052b():java.util.HashMap");
    }

    /* renamed from: c */
    private static int m144053c() {
        try {
            return new File("/sys/devices/system/cpu/").listFiles(f117399a).length;
        } catch (Throwable unused) {
            return -1;
        }
    }
}
