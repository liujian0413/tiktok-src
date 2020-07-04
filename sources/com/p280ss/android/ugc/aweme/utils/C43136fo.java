package com.p280ss.android.ugc.aweme.utils;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* renamed from: com.ss.android.ugc.aweme.utils.fo */
public final class C43136fo {
    /* renamed from: a */
    private static void m136827a(File file) {
        file.delete();
    }

    /* renamed from: a */
    public static String m136826a(String str, List<String> list) {
        StringBuilder sb = new StringBuilder("ame-extract-frames");
        sb.append(System.currentTimeMillis());
        sb.append(".zip");
        return m136825a(str, sb.toString(), list);
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
      mth insns count: 82
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
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008e A[Catch:{ Exception -> 0x00a1, all -> 0x009f }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0093 A[Catch:{ Exception -> 0x00a1, all -> 0x009f }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ac A[Catch:{ all -> 0x00a4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00b0 A[Catch:{ all -> 0x00a4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00bd  */
    /* JADX WARNING: Unknown variable types count: 8 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m136824a(java.io.File r9, java.io.File r10) throws java.io.IOException {
        /*
            r0 = 0
            r10.mkdirs()     // Catch:{ Exception -> 0x00a7 }
            java.util.zip.ZipFile r1 = new java.util.zip.ZipFile     // Catch:{ Exception -> 0x00a7 }
            r1.<init>(r9)     // Catch:{ Exception -> 0x00a7 }
            r9 = 2048(0x800, float:2.87E-42)
            byte[] r2 = new byte[r9]     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
            java.util.Enumeration r3 = r1.entries()     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
            r4 = r0
        L_0x0012:
            boolean r5 = r3.hasMoreElements()     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
            if (r5 == 0) goto L_0x0097
            java.lang.Object r5 = r3.nextElement()     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
            java.util.zip.ZipEntry r5 = (java.util.zip.ZipEntry) r5     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
            java.io.File r6 = new java.io.File     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
            r7.<init>()     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
            java.lang.String r8 = r10.getPath()     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
            r7.append(r8)     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
            java.lang.String r8 = java.io.File.separator     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
            r7.append(r8)     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
            java.lang.String r8 = r5.getName()     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
            r7.append(r8)     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
            r6.<init>(r7)     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
            boolean r7 = r5.isDirectory()     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
            if (r7 == 0) goto L_0x0049
            r6.mkdirs()     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
            goto L_0x0012
        L_0x0049:
            java.io.File r7 = r6.getParentFile()     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
            boolean r8 = r7.exists()     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
            if (r8 != 0) goto L_0x0057
            r7.mkdirs()     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
            goto L_0x005a
        L_0x0057:
            r6.createNewFile()     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
        L_0x005a:
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch:{ all -> 0x008a }
            java.io.InputStream r5 = r1.getInputStream(r5)     // Catch:{ all -> 0x008a }
            r7.<init>(r5)     // Catch:{ all -> 0x008a }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ all -> 0x0088 }
            r4.<init>(r6)     // Catch:{ all -> 0x0088 }
            java.io.BufferedOutputStream r5 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x0088 }
            r5.<init>(r4, r9)     // Catch:{ all -> 0x0088 }
        L_0x006d:
            r0 = 0
            int r4 = r7.read(r2, r0, r9)     // Catch:{ all -> 0x0085 }
            r6 = -1
            if (r4 == r6) goto L_0x0079
            r5.write(r2, r0, r4)     // Catch:{ all -> 0x0085 }
            goto L_0x006d
        L_0x0079:
            r5.flush()     // Catch:{ all -> 0x0085 }
            r5.close()     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
            r7.close()     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
            r0 = r5
            r4 = r7
            goto L_0x0012
        L_0x0085:
            r9 = move-exception
            r0 = r5
            goto L_0x008c
        L_0x0088:
            r9 = move-exception
            goto L_0x008c
        L_0x008a:
            r9 = move-exception
            r7 = r4
        L_0x008c:
            if (r0 == 0) goto L_0x0091
            r0.close()     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
        L_0x0091:
            if (r7 == 0) goto L_0x0096
            r7.close()     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
        L_0x0096:
            throw r9     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
        L_0x0097:
            r1.close()
            java.lang.String r9 = r10.getPath()
            return r9
        L_0x009f:
            r9 = move-exception
            goto L_0x00bb
        L_0x00a1:
            r9 = move-exception
            r0 = r1
            goto L_0x00a8
        L_0x00a4:
            r9 = move-exception
            r1 = r0
            goto L_0x00bb
        L_0x00a7:
            r9 = move-exception
        L_0x00a8:
            boolean r1 = r9 instanceof java.io.IOException     // Catch:{ all -> 0x00a4 }
            if (r1 == 0) goto L_0x00b0
            m136827a(r10)     // Catch:{ all -> 0x00a4 }
            throw r9     // Catch:{ all -> 0x00a4 }
        L_0x00b0:
            m136827a(r10)     // Catch:{ all -> 0x00a4 }
            java.io.IOException r10 = new java.io.IOException     // Catch:{ all -> 0x00a4 }
            java.lang.String r1 = "Error when decompressing zip file."
            r10.<init>(r1, r9)     // Catch:{ all -> 0x00a4 }
            throw r10     // Catch:{ all -> 0x00a4 }
        L_0x00bb:
            if (r1 == 0) goto L_0x00c0
            r1.close()
        L_0x00c0:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.utils.C43136fo.m136824a(java.io.File, java.io.File):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x009d A[SYNTHETIC, Splitter:B:38:0x009d] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a2 A[Catch:{ IOException -> 0x00a5 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m136828a(java.io.InputStream r5, java.lang.String r6) throws java.io.IOException {
        /*
            r0 = 0
            java.util.zip.ZipInputStream r1 = new java.util.zip.ZipInputStream     // Catch:{ all -> 0x0099 }
            r1.<init>(r5)     // Catch:{ all -> 0x0099 }
        L_0x0006:
            java.util.zip.ZipEntry r5 = r1.getNextEntry()     // Catch:{ all -> 0x0097 }
            if (r5 == 0) goto L_0x008d
            java.lang.String r2 = r5.getName()     // Catch:{ all -> 0x0097 }
            boolean r5 = r5.isDirectory()     // Catch:{ all -> 0x0097 }
            if (r5 == 0) goto L_0x0033
            java.io.File r5 = new java.io.File     // Catch:{ all -> 0x0097 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0097 }
            r3.<init>()     // Catch:{ all -> 0x0097 }
            r3.append(r6)     // Catch:{ all -> 0x0097 }
            java.lang.String r4 = java.io.File.separator     // Catch:{ all -> 0x0097 }
            r3.append(r4)     // Catch:{ all -> 0x0097 }
            r3.append(r2)     // Catch:{ all -> 0x0097 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0097 }
            r5.<init>(r2)     // Catch:{ all -> 0x0097 }
            r5.mkdirs()     // Catch:{ all -> 0x0097 }
            goto L_0x0006
        L_0x0033:
            java.io.File r5 = new java.io.File     // Catch:{ all -> 0x0097 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0097 }
            r3.<init>()     // Catch:{ all -> 0x0097 }
            r3.append(r6)     // Catch:{ all -> 0x0097 }
            java.lang.String r4 = java.io.File.separator     // Catch:{ all -> 0x0097 }
            r3.append(r4)     // Catch:{ all -> 0x0097 }
            r3.append(r2)     // Catch:{ all -> 0x0097 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0097 }
            r5.<init>(r2)     // Catch:{ all -> 0x0097 }
            java.io.File r2 = r5.getParentFile()     // Catch:{ all -> 0x0097 }
            boolean r3 = r2.exists()     // Catch:{ all -> 0x0097 }
            if (r3 != 0) goto L_0x005a
            r2.mkdirs()     // Catch:{ all -> 0x0097 }
            goto L_0x0067
        L_0x005a:
            boolean r2 = r5.exists()     // Catch:{ all -> 0x0097 }
            if (r2 == 0) goto L_0x0064
            r5.delete()     // Catch:{ all -> 0x0097 }
            goto L_0x0067
        L_0x0064:
            r5.createNewFile()     // Catch:{ all -> 0x0097 }
        L_0x0067:
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x0097 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x0097 }
            r3.<init>(r5)     // Catch:{ all -> 0x0097 }
            r2.<init>(r3)     // Catch:{ all -> 0x0097 }
            r5 = 2048(0x800, float:2.87E-42)
            byte[] r5 = new byte[r5]     // Catch:{ all -> 0x008a }
        L_0x0075:
            int r0 = r1.read(r5)     // Catch:{ all -> 0x008a }
            r3 = -1
            if (r0 == r3) goto L_0x0081
            r3 = 0
            r2.write(r5, r3, r0)     // Catch:{ all -> 0x008a }
            goto L_0x0075
        L_0x0081:
            r2.flush()     // Catch:{ all -> 0x008a }
            r2.close()     // Catch:{ all -> 0x008a }
            r0 = r2
            goto L_0x0006
        L_0x008a:
            r5 = move-exception
            r0 = r2
            goto L_0x009b
        L_0x008d:
            r1.close()     // Catch:{ IOException -> 0x0096 }
            if (r0 == 0) goto L_0x0095
            r0.close()     // Catch:{ IOException -> 0x0096 }
        L_0x0095:
            return
        L_0x0096:
            return
        L_0x0097:
            r5 = move-exception
            goto L_0x009b
        L_0x0099:
            r5 = move-exception
            r1 = r0
        L_0x009b:
            if (r1 == 0) goto L_0x00a0
            r1.close()     // Catch:{ IOException -> 0x00a5 }
        L_0x00a0:
            if (r0 == 0) goto L_0x00a5
            r0.close()     // Catch:{ IOException -> 0x00a5 }
        L_0x00a5:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.utils.C43136fo.m136828a(java.io.InputStream, java.lang.String):void");
    }

    /* renamed from: a */
    private static void m136829a(ZipOutputStream zipOutputStream, File file, String str) throws Exception {
        File[] listFiles;
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                if (file2 != null) {
                    if (file2.isDirectory()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(file.getName());
                        sb.append(File.separator);
                        sb.append(file2.getName());
                        sb.append(File.separator);
                        str = sb.toString();
                    }
                    m136829a(zipOutputStream, file2, str);
                }
            }
            return;
        }
        byte[] bArr = new byte[2048];
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(file.getName());
        zipOutputStream.putNextEntry(new ZipEntry(sb2.toString()));
        while (true) {
            int read = bufferedInputStream.read(bArr);
            if (read != -1) {
                zipOutputStream.write(bArr, 0, read);
            } else {
                bufferedInputStream.close();
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0083, code lost:
        if (r4 != null) goto L_0x006e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007b A[SYNTHETIC, Splitter:B:23:0x007b] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m136825a(java.lang.String r3, java.lang.String r4, java.util.List<java.lang.String> r5) {
        /*
            boolean r0 = r5.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r3 = java.io.File.separator
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = r0.toString()
            java.util.zip.ZipOutputStream r4 = new java.util.zip.ZipOutputStream     // Catch:{ Exception -> 0x0082, all -> 0x0077 }
            java.io.BufferedOutputStream r0 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x0082, all -> 0x0077 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0082, all -> 0x0077 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0082, all -> 0x0077 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x0082, all -> 0x0077 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x0082, all -> 0x0077 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ Exception -> 0x0083, all -> 0x0075 }
        L_0x002f:
            boolean r0 = r5.hasNext()     // Catch:{ Exception -> 0x0083, all -> 0x0075 }
            if (r0 == 0) goto L_0x006b
            java.lang.Object r0 = r5.next()     // Catch:{ Exception -> 0x0083, all -> 0x0075 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0083, all -> 0x0075 }
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x0083, all -> 0x0075 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0083, all -> 0x0075 }
            boolean r0 = r1.exists()     // Catch:{ Exception -> 0x0083, all -> 0x0075 }
            if (r0 == 0) goto L_0x002f
            boolean r0 = r1.isDirectory()     // Catch:{ Exception -> 0x0083, all -> 0x0075 }
            if (r0 == 0) goto L_0x0065
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0083, all -> 0x0075 }
            r0.<init>()     // Catch:{ Exception -> 0x0083, all -> 0x0075 }
            java.lang.String r2 = r1.getName()     // Catch:{ Exception -> 0x0083, all -> 0x0075 }
            r0.append(r2)     // Catch:{ Exception -> 0x0083, all -> 0x0075 }
            java.lang.String r2 = java.io.File.separator     // Catch:{ Exception -> 0x0083, all -> 0x0075 }
            r0.append(r2)     // Catch:{ Exception -> 0x0083, all -> 0x0075 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0083, all -> 0x0075 }
            m136829a(r4, r1, r0)     // Catch:{ Exception -> 0x0083, all -> 0x0075 }
            goto L_0x002f
        L_0x0065:
            java.lang.String r0 = ""
            m136829a(r4, r1, r0)     // Catch:{ Exception -> 0x0083, all -> 0x0075 }
            goto L_0x002f
        L_0x006b:
            r4.flush()     // Catch:{ Exception -> 0x0083, all -> 0x0075 }
        L_0x006e:
            r4.closeEntry()     // Catch:{ IOException -> 0x0086 }
            r4.close()     // Catch:{ IOException -> 0x0086 }
            goto L_0x0086
        L_0x0075:
            r3 = move-exception
            goto L_0x0079
        L_0x0077:
            r3 = move-exception
            r4 = r1
        L_0x0079:
            if (r4 == 0) goto L_0x0081
            r4.closeEntry()     // Catch:{ IOException -> 0x0081 }
            r4.close()     // Catch:{ IOException -> 0x0081 }
        L_0x0081:
            throw r3
        L_0x0082:
            r4 = r1
        L_0x0083:
            if (r4 == 0) goto L_0x0086
            goto L_0x006e
        L_0x0086:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.utils.C43136fo.m136825a(java.lang.String, java.lang.String, java.util.List):java.lang.String");
    }
}
