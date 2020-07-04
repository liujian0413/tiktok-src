package com.p280ss.android.p298ml;

import android.text.TextUtils;
import com.google.p268a.p269a.p270a.p271a.p272a.C6497a;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.ss.android.ml.h */
public final class C6830h {

    /* renamed from: a */
    private static char[] f19455a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public static void m21258a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static String m21256a(String str) {
        if (str == null) {
            return null;
        }
        return m21257a(str.getBytes());
    }

    /* renamed from: a */
    public static void m21259a(Throwable th) {
        C6820a a = C6824e.m21222a();
        if (a != null) {
            a.mo16661a(th, "ml-evaluator");
        }
    }

    /* renamed from: b */
    public static String m21263b(Throwable th) {
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        C6497a.m20180a(th, new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: a */
    private static String m21257a(byte[] bArr) {
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(bArr);
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(f19455a[(b & 240) >> 4]);
                sb.append(f19455a[b & 15]);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m21260a(File file) {
        try {
            try {
                new ObjectInputStream(new FileInputStream(file)).close();
            } catch (Exception unused) {
            }
            return true;
        } catch (Throwable unused2) {
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x003e A[SYNTHETIC, Splitter:B:23:0x003e] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0046 A[SYNTHETIC, Splitter:B:30:0x0046] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m21262b(java.io.File r6) {
        /*
            boolean r0 = r6.isFile()
            if (r0 != 0) goto L_0x0009
            java.lang.String r6 = ""
            return r6
        L_0x0009:
            r0 = 0
            r1 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r1]
            java.lang.String r3 = "MD5"
            java.security.MessageDigest r3 = java.security.MessageDigest.getInstance(r3)     // Catch:{ Exception -> 0x0042, all -> 0x003b }
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x0042, all -> 0x003b }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0042, all -> 0x003b }
            r5.<init>(r6)     // Catch:{ Exception -> 0x0042, all -> 0x003b }
            r4.<init>(r5)     // Catch:{ Exception -> 0x0042, all -> 0x003b }
        L_0x001e:
            r6 = 0
            int r0 = r4.read(r2, r6, r1)     // Catch:{ Exception -> 0x0039, all -> 0x0036 }
            r5 = -1
            if (r0 == r5) goto L_0x002a
            r3.update(r2, r6, r0)     // Catch:{ Exception -> 0x0039, all -> 0x0036 }
            goto L_0x001e
        L_0x002a:
            r4.close()     // Catch:{ IOException -> 0x002d }
        L_0x002d:
            byte[] r6 = r3.digest()
            java.lang.String r6 = m21264b(r6)
            return r6
        L_0x0036:
            r6 = move-exception
            r0 = r4
            goto L_0x003c
        L_0x0039:
            r0 = r4
            goto L_0x0042
        L_0x003b:
            r6 = move-exception
        L_0x003c:
            if (r0 == 0) goto L_0x0041
            r0.close()     // Catch:{ IOException -> 0x0041 }
        L_0x0041:
            throw r6
        L_0x0042:
            java.lang.String r6 = ""
            if (r0 == 0) goto L_0x0049
            r0.close()     // Catch:{ IOException -> 0x0049 }
        L_0x0049:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.p298ml.C6830h.m21262b(java.io.File):java.lang.String");
    }

    /* renamed from: b */
    private static String m21264b(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return "";
        }
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        char[] cArr2 = new char[(bArr.length * 2)];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            cArr2[i] = cArr[(b >>> 4) & 15];
            i = i2 + 1;
            cArr2[i2] = cArr[b & 15];
        }
        return new String(cArr2);
    }

    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.zip.ZipFile] */
    /* JADX WARNING: type inference failed for: r0v1 */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r1v4, types: [java.util.zip.ZipFile] */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r0v5, types: [java.io.BufferedOutputStream] */
    /* JADX WARNING: type inference failed for: r5v4, types: [java.io.BufferedOutputStream] */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: type inference failed for: r0v12 */
    /* JADX WARNING: type inference failed for: r0v13 */
    /* JADX WARNING: type inference failed for: r0v14 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v3
      assigns: []
      uses: []
      mth insns count: 81
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
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008d A[Catch:{ Exception -> 0x00a0, all -> 0x009e }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0092 A[Catch:{ Exception -> 0x00a0, all -> 0x009e }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ab A[Catch:{ all -> 0x00a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00af A[Catch:{ all -> 0x00a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00bc  */
    /* JADX WARNING: Unknown variable types count: 8 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m21255a(java.io.File r9, java.io.File r10) throws java.io.IOException {
        /*
            r0 = 0
            r10.mkdirs()     // Catch:{ Exception -> 0x00a6 }
            java.util.zip.ZipFile r1 = new java.util.zip.ZipFile     // Catch:{ Exception -> 0x00a6 }
            r1.<init>(r9)     // Catch:{ Exception -> 0x00a6 }
            r9 = 2048(0x800, float:2.87E-42)
            byte[] r2 = new byte[r9]     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
            java.util.Enumeration r3 = r1.entries()     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
            r4 = r0
        L_0x0012:
            boolean r5 = r3.hasMoreElements()     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
            if (r5 == 0) goto L_0x0096
            java.lang.Object r5 = r3.nextElement()     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
            java.util.zip.ZipEntry r5 = (java.util.zip.ZipEntry) r5     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
            java.io.File r6 = new java.io.File     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
            r7.<init>()     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
            java.lang.String r8 = r10.getPath()     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
            r7.append(r8)     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
            java.lang.String r8 = java.io.File.separator     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
            r7.append(r8)     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
            java.lang.String r8 = r5.getName()     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
            r7.append(r8)     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
            r6.<init>(r7)     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
            boolean r7 = r5.isDirectory()     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
            if (r7 == 0) goto L_0x0049
            r6.mkdirs()     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
            goto L_0x0012
        L_0x0049:
            java.io.File r7 = r6.getParentFile()     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
            boolean r8 = r7.exists()     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
            if (r8 != 0) goto L_0x0056
            r7.mkdirs()     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
        L_0x0056:
            r6.createNewFile()     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch:{ all -> 0x0089 }
            java.io.InputStream r5 = r1.getInputStream(r5)     // Catch:{ all -> 0x0089 }
            r7.<init>(r5)     // Catch:{ all -> 0x0089 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ all -> 0x0087 }
            r4.<init>(r6)     // Catch:{ all -> 0x0087 }
            java.io.BufferedOutputStream r5 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x0087 }
            r5.<init>(r4, r9)     // Catch:{ all -> 0x0087 }
        L_0x006c:
            r0 = 0
            int r4 = r7.read(r2, r0, r9)     // Catch:{ all -> 0x0084 }
            r6 = -1
            if (r4 == r6) goto L_0x0078
            r5.write(r2, r0, r4)     // Catch:{ all -> 0x0084 }
            goto L_0x006c
        L_0x0078:
            r5.flush()     // Catch:{ all -> 0x0084 }
            r5.close()     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
            r7.close()     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
            r0 = r5
            r4 = r7
            goto L_0x0012
        L_0x0084:
            r9 = move-exception
            r0 = r5
            goto L_0x008b
        L_0x0087:
            r9 = move-exception
            goto L_0x008b
        L_0x0089:
            r9 = move-exception
            r7 = r4
        L_0x008b:
            if (r0 == 0) goto L_0x0090
            r0.close()     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
        L_0x0090:
            if (r7 == 0) goto L_0x0095
            r7.close()     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
        L_0x0095:
            throw r9     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
        L_0x0096:
            r1.close()
            java.lang.String r9 = r10.getPath()
            return r9
        L_0x009e:
            r9 = move-exception
            goto L_0x00ba
        L_0x00a0:
            r9 = move-exception
            r0 = r1
            goto L_0x00a7
        L_0x00a3:
            r9 = move-exception
            r1 = r0
            goto L_0x00ba
        L_0x00a6:
            r9 = move-exception
        L_0x00a7:
            boolean r1 = r9 instanceof java.io.IOException     // Catch:{ all -> 0x00a3 }
            if (r1 == 0) goto L_0x00af
            r10.delete()     // Catch:{ all -> 0x00a3 }
            throw r9     // Catch:{ all -> 0x00a3 }
        L_0x00af:
            r10.delete()     // Catch:{ all -> 0x00a3 }
            java.io.IOException r10 = new java.io.IOException     // Catch:{ all -> 0x00a3 }
            java.lang.String r1 = "Error when decompressing zip file."
            r10.<init>(r1, r9)     // Catch:{ all -> 0x00a3 }
            throw r10     // Catch:{ all -> 0x00a3 }
        L_0x00ba:
            if (r1 == 0) goto L_0x00bf
            r1.close()
        L_0x00bf:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.p298ml.C6830h.m21255a(java.io.File, java.io.File):java.lang.String");
    }

    /* renamed from: a */
    public static boolean m21261a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        File file = new File(str);
        if (!file.exists() || file.length() == 0) {
            return false;
        }
        int indexOf = str2.indexOf("?");
        if (indexOf == -1) {
            return true;
        }
        String substring = str2.substring(indexOf + 1);
        if (TextUtils.isEmpty(substring) || !substring.equalsIgnoreCase(m21262b(file))) {
            return false;
        }
        return true;
    }
}
