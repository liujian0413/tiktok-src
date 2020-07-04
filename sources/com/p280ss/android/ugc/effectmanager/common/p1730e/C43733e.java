package com.p280ss.android.ugc.effectmanager.common.p1730e;

import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.ss.android.ugc.effectmanager.common.e.e */
public class C43733e {
    /* renamed from: a */
    private static boolean m138596a() {
        try {
            return "mounted".equals(Environment.getExternalStorageState());
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: e */
    public static void m138603e(String str) {
        m138594a(new File(str));
    }

    /* renamed from: a */
    public static boolean m138597a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(str).exists();
    }

    /* renamed from: d */
    public static InputStream m138602d(String str) {
        InputStream inputStream;
        File file = new File(str);
        if (!m138597a(file.getPath())) {
            return null;
        }
        try {
            inputStream = new FileInputStream(file);
        } catch (Exception unused) {
            inputStream = null;
        }
        return inputStream;
    }

    /* renamed from: b */
    public static boolean m138599b(String str) {
        if (!m138596a() || TextUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        if (!file.exists() || !file.canWrite() || !file.delete()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static void m138594a(File file) {
        if (file != null && file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                if (listFiles.length == 0) {
                    file.delete();
                    return;
                }
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        m138594a(file2);
                    } else {
                        file2.delete();
                    }
                }
                file.delete();
            }
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0036 */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0048 A[SYNTHETIC, Splitter:B:25:0x0048] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004f A[SYNTHETIC, Splitter:B:29:0x004f] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0056 A[SYNTHETIC, Splitter:B:36:0x0056] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x005d A[SYNTHETIC, Splitter:B:40:0x005d] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m138600c(java.lang.String r4) {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r4)
            java.lang.String r4 = r0.getPath()
            boolean r4 = m138597a(r4)
            if (r4 == 0) goto L_0x0061
            java.lang.String r4 = ""
            r1 = 0
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ Exception -> 0x0053, all -> 0x0043 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x0053, all -> 0x0043 }
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0041, all -> 0x003e }
            r0.<init>(r2)     // Catch:{ Exception -> 0x0041, all -> 0x003e }
        L_0x001c:
            java.lang.String r1 = r0.readLine()     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            if (r1 == 0) goto L_0x0033
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            r3.<init>()     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            r3.append(r4)     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            r3.append(r1)     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            java.lang.String r1 = r3.toString()     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            r4 = r1
            goto L_0x001c
        L_0x0033:
            r2.close()     // Catch:{ IOException -> 0x0036 }
        L_0x0036:
            r0.close()     // Catch:{ IOException -> 0x0060 }
            goto L_0x0060
        L_0x003a:
            r4 = move-exception
            goto L_0x0046
        L_0x003c:
            r1 = r0
            goto L_0x0054
        L_0x003e:
            r4 = move-exception
            r0 = r1
            goto L_0x0046
        L_0x0041:
            goto L_0x0054
        L_0x0043:
            r4 = move-exception
            r0 = r1
            r2 = r0
        L_0x0046:
            if (r2 == 0) goto L_0x004d
            r2.close()     // Catch:{ IOException -> 0x004c }
            goto L_0x004d
        L_0x004c:
        L_0x004d:
            if (r0 == 0) goto L_0x0052
            r0.close()     // Catch:{ IOException -> 0x0052 }
        L_0x0052:
            throw r4
        L_0x0053:
            r2 = r1
        L_0x0054:
            if (r2 == 0) goto L_0x005b
            r2.close()     // Catch:{ IOException -> 0x005a }
            goto L_0x005b
        L_0x005a:
        L_0x005b:
            if (r1 == 0) goto L_0x0060
            r1.close()     // Catch:{ IOException -> 0x0060 }
        L_0x0060:
            return r4
        L_0x0061:
            java.lang.String r4 = ""
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.effectmanager.common.p1730e.C43733e.m138600c(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    private static File m138593a(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(str);
        if (!file.exists()) {
            try {
                File parentFile = file.getParentFile();
                if (!parentFile.exists()) {
                    parentFile.mkdirs();
                }
                file.createNewFile();
            } catch (IOException unused) {
            }
        }
        return file;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(12:2|3|(1:5)|6|7|8|9|10|11|12|27|28) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:13|14|(0)|21|22) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0032 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0038 */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x002f A[SYNTHETIC, Splitter:B:19:0x002f] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0035 A[SYNTHETIC, Splitter:B:25:0x0035] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:21:0x0032=Splitter:B:21:0x0032, B:27:0x0038=Splitter:B:27:0x0038} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m138595a(java.lang.String r3, java.lang.String r4) {
        /*
            java.lang.Class<com.ss.android.ugc.effectmanager.common.e.e> r0 = com.p280ss.android.ugc.effectmanager.common.p1730e.C43733e.class
            monitor-enter(r0)
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x003a }
            r1.<init>(r4)     // Catch:{ all -> 0x003a }
            boolean r4 = r1.exists()     // Catch:{ all -> 0x003a }
            if (r4 != 0) goto L_0x0016
            java.lang.String r4 = r1.getPath()     // Catch:{ all -> 0x003a }
            r2 = 1
            m138593a(r4, r2)     // Catch:{ all -> 0x003a }
        L_0x0016:
            r4 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0033, all -> 0x002c }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0033, all -> 0x002c }
            byte[] r3 = r3.getBytes()     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
            r2.write(r3)     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
            r2.close()     // Catch:{ IOException -> 0x0038 }
            goto L_0x0038
        L_0x0027:
            r3 = move-exception
            r4 = r2
            goto L_0x002d
        L_0x002a:
            r4 = r2
            goto L_0x0033
        L_0x002c:
            r3 = move-exception
        L_0x002d:
            if (r4 == 0) goto L_0x0032
            r4.close()     // Catch:{ IOException -> 0x0032 }
        L_0x0032:
            throw r3     // Catch:{ all -> 0x003a }
        L_0x0033:
            if (r4 == 0) goto L_0x0038
            r4.close()     // Catch:{ IOException -> 0x0038 }
        L_0x0038:
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            return
        L_0x003a:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.effectmanager.common.p1730e.C43733e.m138595a(java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r4v0, types: [java.util.zip.ZipInputStream] */
    /* JADX WARNING: type inference failed for: r2v4, types: [java.io.BufferedOutputStream] */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r5v1 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r5v2 */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r4v4, types: [java.util.zip.ZipInputStream] */
    /* JADX WARNING: type inference failed for: r2v7, types: [java.io.BufferedOutputStream] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* JADX WARNING: type inference failed for: r5v9, types: [java.io.BufferedOutputStream] */
    /* JADX WARNING: type inference failed for: r2v12 */
    /* JADX WARNING: type inference failed for: r2v13 */
    /* JADX WARNING: type inference failed for: r2v14 */
    /* JADX WARNING: type inference failed for: r2v15 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r5v11 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r2v16 */
    /* JADX WARNING: type inference failed for: r2v17 */
    /* JADX WARNING: type inference failed for: r5v12 */
    /* JADX WARNING: type inference failed for: r2v18 */
    /* JADX WARNING: type inference failed for: r5v13 */
    /* JADX WARNING: type inference failed for: r5v14 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r4v1
      assigns: []
      uses: []
      mth insns count: 97
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
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00e9 A[SYNTHETIC, Splitter:B:60:0x00e9] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00ee A[Catch:{ IOException -> 0x00f1 }] */
    /* JADX WARNING: Unknown variable types count: 12 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m138598b(java.lang.String r8, java.lang.String r9) throws com.p280ss.android.ugc.effectmanager.common.exception.UnzipException {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r9)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L_0x000e
            m138594a(r0)
        L_0x000e:
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r9)
            java.lang.String r3 = "_tmp"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            boolean r2 = r1.exists()
            if (r2 == 0) goto L_0x002d
            m138594a(r1)
        L_0x002d:
            r2 = 0
            java.lang.String r3 = r1.getCanonicalPath()     // Catch:{ IOException -> 0x00d5, all -> 0x00d2 }
            java.util.zip.ZipInputStream r4 = new java.util.zip.ZipInputStream     // Catch:{ IOException -> 0x00d5, all -> 0x00d2 }
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x00d5, all -> 0x00d2 }
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00d5, all -> 0x00d2 }
            r6.<init>(r8)     // Catch:{ IOException -> 0x00d5, all -> 0x00d2 }
            r5.<init>(r6)     // Catch:{ IOException -> 0x00d5, all -> 0x00d2 }
            r4.<init>(r5)     // Catch:{ IOException -> 0x00d5, all -> 0x00d2 }
        L_0x0041:
            java.util.zip.ZipEntry r5 = r4.getNextEntry()     // Catch:{ IOException -> 0x00ce, all -> 0x00cc }
            if (r5 == 0) goto L_0x00b6
            java.lang.String r6 = r5.getName()     // Catch:{ IOException -> 0x00ce, all -> 0x00cc }
            java.io.File r7 = new java.io.File     // Catch:{ IOException -> 0x00ce, all -> 0x00cc }
            r7.<init>(r1, r6)     // Catch:{ IOException -> 0x00ce, all -> 0x00cc }
            java.lang.String r6 = r7.getCanonicalPath()     // Catch:{ IOException -> 0x00ce, all -> 0x00cc }
            boolean r6 = r6.startsWith(r3)     // Catch:{ IOException -> 0x00ce, all -> 0x00cc }
            if (r6 == 0) goto L_0x009e
            boolean r5 = r5.isDirectory()     // Catch:{ IOException -> 0x00ce, all -> 0x00cc }
            if (r5 == 0) goto L_0x0064
            r7.mkdirs()     // Catch:{ IOException -> 0x00ce, all -> 0x00cc }
            goto L_0x0041
        L_0x0064:
            boolean r5 = r7.exists()     // Catch:{ IOException -> 0x00ce, all -> 0x00cc }
            if (r5 == 0) goto L_0x006e
            r7.delete()     // Catch:{ IOException -> 0x00ce, all -> 0x00cc }
            goto L_0x0075
        L_0x006e:
            java.io.File r5 = r7.getParentFile()     // Catch:{ IOException -> 0x00ce, all -> 0x00cc }
            r5.mkdirs()     // Catch:{ IOException -> 0x00ce, all -> 0x00cc }
        L_0x0075:
            r7.createNewFile()     // Catch:{ IOException -> 0x00ce, all -> 0x00cc }
            java.io.BufferedOutputStream r5 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x00ce, all -> 0x00cc }
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00ce, all -> 0x00cc }
            r6.<init>(r7)     // Catch:{ IOException -> 0x00ce, all -> 0x00cc }
            r5.<init>(r6)     // Catch:{ IOException -> 0x00ce, all -> 0x00cc }
            r2 = 2048(0x800, float:2.87E-42)
            byte[] r2 = new byte[r2]     // Catch:{ IOException -> 0x009c, all -> 0x009a }
        L_0x0086:
            int r6 = r4.read(r2)     // Catch:{ IOException -> 0x009c, all -> 0x009a }
            r7 = -1
            if (r6 == r7) goto L_0x0092
            r7 = 0
            r5.write(r2, r7, r6)     // Catch:{ IOException -> 0x009c, all -> 0x009a }
            goto L_0x0086
        L_0x0092:
            r5.flush()     // Catch:{ IOException -> 0x009c, all -> 0x009a }
            r5.close()     // Catch:{ IOException -> 0x009c, all -> 0x009a }
            r2 = r5
            goto L_0x0041
        L_0x009a:
            r8 = move-exception
            goto L_0x00e6
        L_0x009c:
            r8 = move-exception
            goto L_0x00d0
        L_0x009e:
            com.ss.android.ugc.effectmanager.common.exception.UnzipException r8 = new com.ss.android.ugc.effectmanager.common.exception.UnzipException     // Catch:{ IOException -> 0x00ce, all -> 0x00cc }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00ce, all -> 0x00cc }
            java.lang.String r0 = "Entry is outside of the target dir: "
            r9.<init>(r0)     // Catch:{ IOException -> 0x00ce, all -> 0x00cc }
            java.lang.String r0 = r5.getName()     // Catch:{ IOException -> 0x00ce, all -> 0x00cc }
            r9.append(r0)     // Catch:{ IOException -> 0x00ce, all -> 0x00cc }
            java.lang.String r9 = r9.toString()     // Catch:{ IOException -> 0x00ce, all -> 0x00cc }
            r8.<init>(r9)     // Catch:{ IOException -> 0x00ce, all -> 0x00cc }
            throw r8     // Catch:{ IOException -> 0x00ce, all -> 0x00cc }
        L_0x00b6:
            boolean r0 = r1.renameTo(r0)     // Catch:{ IOException -> 0x00ce, all -> 0x00cc }
            if (r0 != 0) goto L_0x00c2
            m138594a(r1)     // Catch:{ IOException -> 0x00ce, all -> 0x00cc }
            m138601c(r8, r9)     // Catch:{ IOException -> 0x00ce, all -> 0x00cc }
        L_0x00c2:
            r4.close()     // Catch:{ IOException -> 0x00cb }
            if (r2 == 0) goto L_0x00ca
            r2.close()     // Catch:{ IOException -> 0x00cb }
        L_0x00ca:
            return
        L_0x00cb:
            return
        L_0x00cc:
            r8 = move-exception
            goto L_0x00e7
        L_0x00ce:
            r8 = move-exception
            r5 = r2
        L_0x00d0:
            r2 = r4
            goto L_0x00d7
        L_0x00d2:
            r8 = move-exception
            r4 = r2
            goto L_0x00e7
        L_0x00d5:
            r8 = move-exception
            r5 = r2
        L_0x00d7:
            m138594a(r1)     // Catch:{ all -> 0x00e4 }
            com.ss.android.ugc.effectmanager.common.exception.UnzipException r9 = new com.ss.android.ugc.effectmanager.common.exception.UnzipException     // Catch:{ all -> 0x00e4 }
            java.lang.String r8 = r8.getMessage()     // Catch:{ all -> 0x00e4 }
            r9.<init>(r8)     // Catch:{ all -> 0x00e4 }
            throw r9     // Catch:{ all -> 0x00e4 }
        L_0x00e4:
            r8 = move-exception
            r4 = r2
        L_0x00e6:
            r2 = r5
        L_0x00e7:
            if (r4 == 0) goto L_0x00ec
            r4.close()     // Catch:{ IOException -> 0x00f1 }
        L_0x00ec:
            if (r2 == 0) goto L_0x00f1
            r2.close()     // Catch:{ IOException -> 0x00f1 }
        L_0x00f1:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.effectmanager.common.p1730e.C43733e.m138598b(java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: type inference failed for: r7v2 */
    /* JADX WARNING: type inference failed for: r7v3, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r2v0, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r0v1 */
    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v3, types: [java.util.zip.ZipInputStream, java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r7v6, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r7v7 */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r7v8 */
    /* JADX WARNING: type inference failed for: r6v15, types: [java.io.BufferedOutputStream] */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: type inference failed for: r7v12 */
    /* JADX WARNING: type inference failed for: r7v14 */
    /* JADX WARNING: type inference failed for: r7v15 */
    /* JADX WARNING: type inference failed for: r7v16 */
    /* JADX WARNING: type inference failed for: r7v17 */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r7v18 */
    /* JADX WARNING: type inference failed for: r7v19 */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r7v20 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v3
      assigns: []
      uses: []
      mth insns count: 80
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
    /* JADX WARNING: Unknown variable types count: 10 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m138601c(java.lang.String r6, java.lang.String r7) throws com.p280ss.android.ugc.effectmanager.common.exception.UnzipException {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r7)
            boolean r7 = r0.exists()
            if (r7 == 0) goto L_0x000e
            m138594a(r0)
        L_0x000e:
            r7 = 0
            java.lang.String r1 = r0.getCanonicalPath()     // Catch:{ IOException -> 0x00ac, all -> 0x00a9 }
            java.util.zip.ZipInputStream r2 = new java.util.zip.ZipInputStream     // Catch:{ IOException -> 0x00ac, all -> 0x00a9 }
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x00ac, all -> 0x00a9 }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00ac, all -> 0x00a9 }
            r4.<init>(r6)     // Catch:{ IOException -> 0x00ac, all -> 0x00a9 }
            r3.<init>(r4)     // Catch:{ IOException -> 0x00ac, all -> 0x00a9 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x00ac, all -> 0x00a9 }
        L_0x0022:
            java.util.zip.ZipEntry r6 = r2.getNextEntry()     // Catch:{ IOException -> 0x00a5, all -> 0x00a3 }
            if (r6 == 0) goto L_0x009c
            java.lang.String r3 = r6.getName()     // Catch:{ IOException -> 0x00a5, all -> 0x00a3 }
            java.io.File r4 = new java.io.File     // Catch:{ IOException -> 0x00a5, all -> 0x00a3 }
            r4.<init>(r0, r3)     // Catch:{ IOException -> 0x00a5, all -> 0x00a3 }
            java.lang.String r3 = r4.getCanonicalPath()     // Catch:{ IOException -> 0x00a5, all -> 0x00a3 }
            boolean r3 = r3.startsWith(r1)     // Catch:{ IOException -> 0x00a5, all -> 0x00a3 }
            if (r3 == 0) goto L_0x0084
            boolean r6 = r6.isDirectory()     // Catch:{ IOException -> 0x00a5, all -> 0x00a3 }
            if (r6 == 0) goto L_0x0045
            r4.mkdirs()     // Catch:{ IOException -> 0x00a5, all -> 0x00a3 }
            goto L_0x0022
        L_0x0045:
            boolean r6 = r4.exists()     // Catch:{ IOException -> 0x00a5, all -> 0x00a3 }
            if (r6 == 0) goto L_0x004f
            r4.delete()     // Catch:{ IOException -> 0x00a5, all -> 0x00a3 }
            goto L_0x0056
        L_0x004f:
            java.io.File r6 = r4.getParentFile()     // Catch:{ IOException -> 0x00a5, all -> 0x00a3 }
            r6.mkdirs()     // Catch:{ IOException -> 0x00a5, all -> 0x00a3 }
        L_0x0056:
            r4.createNewFile()     // Catch:{ IOException -> 0x00a5, all -> 0x00a3 }
            java.io.BufferedOutputStream r6 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x00a5, all -> 0x00a3 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00a5, all -> 0x00a3 }
            r3.<init>(r4)     // Catch:{ IOException -> 0x00a5, all -> 0x00a3 }
            r6.<init>(r3)     // Catch:{ IOException -> 0x00a5, all -> 0x00a3 }
            r7 = 2048(0x800, float:2.87E-42)
            byte[] r7 = new byte[r7]     // Catch:{ IOException -> 0x0080, all -> 0x007b }
        L_0x0067:
            int r3 = r2.read(r7)     // Catch:{ IOException -> 0x0080, all -> 0x007b }
            r4 = -1
            if (r3 == r4) goto L_0x0073
            r4 = 0
            r6.write(r7, r4, r3)     // Catch:{ IOException -> 0x0080, all -> 0x007b }
            goto L_0x0067
        L_0x0073:
            r6.flush()     // Catch:{ IOException -> 0x0080, all -> 0x007b }
            r6.close()     // Catch:{ IOException -> 0x0080, all -> 0x007b }
            r7 = r6
            goto L_0x0022
        L_0x007b:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
            goto L_0x00bb
        L_0x0080:
            r7 = move-exception
            r0 = r6
            r6 = r7
            goto L_0x00a7
        L_0x0084:
            com.ss.android.ugc.effectmanager.common.exception.UnzipException r0 = new com.ss.android.ugc.effectmanager.common.exception.UnzipException     // Catch:{ IOException -> 0x00a5, all -> 0x00a3 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00a5, all -> 0x00a3 }
            java.lang.String r3 = "Entry is outside of the target dir: "
            r1.<init>(r3)     // Catch:{ IOException -> 0x00a5, all -> 0x00a3 }
            java.lang.String r6 = r6.getName()     // Catch:{ IOException -> 0x00a5, all -> 0x00a3 }
            r1.append(r6)     // Catch:{ IOException -> 0x00a5, all -> 0x00a3 }
            java.lang.String r6 = r1.toString()     // Catch:{ IOException -> 0x00a5, all -> 0x00a3 }
            r0.<init>(r6)     // Catch:{ IOException -> 0x00a5, all -> 0x00a3 }
            throw r0     // Catch:{ IOException -> 0x00a5, all -> 0x00a3 }
        L_0x009c:
            com.p280ss.android.ugc.effectmanager.common.p1730e.C43729a.m138574a(r2)
            com.p280ss.android.ugc.effectmanager.common.p1730e.C43729a.m138574a(r7)
            return
        L_0x00a3:
            r6 = move-exception
            goto L_0x00bb
        L_0x00a5:
            r6 = move-exception
            r0 = r7
        L_0x00a7:
            r7 = r2
            goto L_0x00ae
        L_0x00a9:
            r6 = move-exception
            r2 = r7
            goto L_0x00bb
        L_0x00ac:
            r6 = move-exception
            r0 = r7
        L_0x00ae:
            com.ss.android.ugc.effectmanager.common.exception.UnzipException r1 = new com.ss.android.ugc.effectmanager.common.exception.UnzipException     // Catch:{ all -> 0x00b8 }
            java.lang.String r6 = r6.getMessage()     // Catch:{ all -> 0x00b8 }
            r1.<init>(r6)     // Catch:{ all -> 0x00b8 }
            throw r1     // Catch:{ all -> 0x00b8 }
        L_0x00b8:
            r6 = move-exception
            r2 = r7
            r7 = r0
        L_0x00bb:
            com.p280ss.android.ugc.effectmanager.common.p1730e.C43729a.m138574a(r2)
            com.p280ss.android.ugc.effectmanager.common.p1730e.C43729a.m138574a(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.effectmanager.common.p1730e.C43733e.m138601c(java.lang.String, java.lang.String):void");
    }
}
