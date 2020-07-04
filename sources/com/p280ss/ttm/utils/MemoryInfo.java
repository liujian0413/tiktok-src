package com.p280ss.ttm.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Environment;
import android.os.StatFs;

/* renamed from: com.ss.ttm.utils.MemoryInfo */
public class MemoryInfo {
    private static long[] mRomMemroy;
    private static long mTotalMemorySize;

    public static long[] getRomMemroy() {
        if (mRomMemroy == null) {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            mRomMemroy = new long[]{getTotalInternalMemorySize(), ((long) statFs.getBlockSize()) * ((long) statFs.getAvailableBlocks())};
        }
        return mRomMemroy;
    }

    public static long getTotalInternalMemorySize() {
        if (mTotalMemorySize == 0) {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            mTotalMemorySize = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        }
        return mTotalMemorySize;
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r2v4, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r2v5, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r0v12, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0025, code lost:
        if (r2 != 0) goto L_0x0016;
     */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v0
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], ?[OBJECT, ARRAY]]
      uses: [java.lang.String, ?[int, boolean, OBJECT, ARRAY, byte, short, char], java.io.BufferedReader]
      mth insns count: 28
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
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0020 A[SYNTHETIC, Splitter:B:13:0x0020] */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long getTolalMemory() {
        /*
            java.lang.String r0 = "/proc/meminfo"
            r1 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0024, all -> 0x001d }
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ Exception -> 0x0024, all -> 0x001d }
            r3.<init>(r0)     // Catch:{ Exception -> 0x0024, all -> 0x001d }
            r0 = 8
            r2.<init>(r3, r0)     // Catch:{ Exception -> 0x0024, all -> 0x001d }
            java.lang.String r0 = r2.readLine()     // Catch:{ Exception -> 0x0025, all -> 0x001a }
            if (r0 == 0) goto L_0x0016
            r1 = r0
        L_0x0016:
            r2.close()     // Catch:{ Exception -> 0x0028 }
            goto L_0x0028
        L_0x001a:
            r0 = move-exception
            r1 = r2
            goto L_0x001e
        L_0x001d:
            r0 = move-exception
        L_0x001e:
            if (r1 == 0) goto L_0x0023
            r1.close()     // Catch:{ Exception -> 0x0023 }
        L_0x0023:
            throw r0
        L_0x0024:
            r2 = r1
        L_0x0025:
            if (r2 == 0) goto L_0x0028
            goto L_0x0016
        L_0x0028:
            r0 = 58
            int r0 = r1.indexOf(r0)
            r2 = 107(0x6b, float:1.5E-43)
            int r2 = r1.indexOf(r2)
            int r0 = r0 + 1
            java.lang.String r0 = r1.substring(r0, r2)
            java.lang.String r0 = r0.trim()
            int r0 = java.lang.Integer.parseInt(r0)
            long r0 = (long) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.ttm.utils.MemoryInfo.getTolalMemory():long");
    }

    public static long getAvailMemory(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        android.app.ActivityManager.MemoryInfo memoryInfo = new android.app.ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.availMem / 1024;
    }
}
