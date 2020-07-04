package com.kakao.util.helper;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class MediaUtils {
    private static final String[] IMAGE_FILE_COLUMNS = {"_data", "orientation"};

    public static void closeQuietly(InputStream inputStream) {
        closeQuietly((Closeable) inputStream);
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    private static int copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        long copyLarge = copyLarge(inputStream, outputStream);
        if (copyLarge > 2147483647L) {
            return -1;
        }
        return (int) copyLarge;
    }

    private static long copyLarge(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += (long) read;
        }
    }

    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r10v5, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r0v7, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r10v6 */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r0v9, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r10v8 */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r10v10 */
    /* JADX WARNING: type inference failed for: r10v13, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: type inference failed for: r3v4, types: [java.io.OutputStream, java.io.Closeable, java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r0v12 */
    /* JADX WARNING: type inference failed for: r0v14 */
    /* JADX WARNING: type inference failed for: r0v15 */
    /* JADX WARNING: type inference failed for: r0v16 */
    /* JADX WARNING: type inference failed for: r10v16 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r10v17 */
    /* JADX WARNING: type inference failed for: r10v18 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r10v6
      assigns: []
      uses: []
      mth insns count: 111
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
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00e1  */
    /* JADX WARNING: Unknown variable types count: 9 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getImageFilePathFromUri(android.net.Uri r9, android.content.Context r10) throws java.io.FileNotFoundException {
        /*
            if (r9 == 0) goto L_0x00ed
            if (r10 == 0) goto L_0x00e5
            java.lang.String r0 = "file"
            java.lang.String r1 = r9.getScheme()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0015
            java.lang.String r9 = r9.getPath()
            return r9
        L_0x0015:
            r0 = 0
            android.content.Context r1 = r10.getApplicationContext()     // Catch:{ Exception -> 0x004b, all -> 0x0047 }
            android.content.ContentResolver r2 = r1.getContentResolver()     // Catch:{ Exception -> 0x004b, all -> 0x0047 }
            java.lang.String[] r4 = IMAGE_FILE_COLUMNS     // Catch:{ Exception -> 0x004b, all -> 0x0047 }
            r5 = 0
            r6 = 0
            r7 = 0
            r3 = r9
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x004b, all -> 0x0047 }
            if (r1 == 0) goto L_0x0040
            boolean r2 = r1.moveToFirst()     // Catch:{ Exception -> 0x003e }
            if (r2 == 0) goto L_0x0040
            java.lang.String[] r2 = IMAGE_FILE_COLUMNS     // Catch:{ Exception -> 0x003e }
            r3 = 0
            r2 = r2[r3]     // Catch:{ Exception -> 0x003e }
            int r2 = r1.getColumnIndex(r2)     // Catch:{ Exception -> 0x003e }
            java.lang.String r2 = r1.getString(r2)     // Catch:{ Exception -> 0x003e }
            goto L_0x0041
        L_0x003e:
            r2 = move-exception
            goto L_0x004d
        L_0x0040:
            r2 = r0
        L_0x0041:
            if (r1 == 0) goto L_0x0056
            r1.close()
            goto L_0x0056
        L_0x0047:
            r9 = move-exception
            r1 = r0
            goto L_0x00df
        L_0x004b:
            r2 = move-exception
            r1 = r0
        L_0x004d:
            com.kakao.util.helper.log.Logger.m60958w(r2)     // Catch:{ all -> 0x00de }
            if (r1 == 0) goto L_0x0055
            r1.close()
        L_0x0055:
            r2 = r0
        L_0x0056:
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L_0x0070
            java.lang.String r1 = "content"
            java.lang.String r3 = r9.getScheme()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0070
            java.lang.String r1 = "http"
            boolean r1 = r2.startsWith(r1)
            if (r1 == 0) goto L_0x00b1
        L_0x0070:
            android.content.Context r10 = r10.getApplicationContext()     // Catch:{ Exception -> 0x00a4, all -> 0x00a1 }
            android.content.ContentResolver r10 = r10.getContentResolver()     // Catch:{ Exception -> 0x00a4, all -> 0x00a1 }
            java.io.InputStream r10 = r10.openInputStream(r9)     // Catch:{ Exception -> 0x00a4, all -> 0x00a1 }
            java.io.File r1 = com.kakao.util.helper.FileUtils.getExternalStorageTempFile()     // Catch:{ Exception -> 0x009c, all -> 0x009a }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x009c, all -> 0x009a }
            r3.<init>(r1)     // Catch:{ Exception -> 0x009c, all -> 0x009a }
            copy(r10, r3)     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
            java.lang.String r0 = r1.getAbsolutePath()     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
            closeQuietly(r10)
            closeQuietly(r3)
            goto L_0x00b2
        L_0x0093:
            r9 = move-exception
            goto L_0x00d6
        L_0x0095:
            r0 = move-exception
            r8 = r0
            r0 = r10
            r10 = r8
            goto L_0x00a6
        L_0x009a:
            r9 = move-exception
            goto L_0x00d7
        L_0x009c:
            r1 = move-exception
            r3 = r0
            r0 = r10
            r10 = r1
            goto L_0x00a6
        L_0x00a1:
            r9 = move-exception
            r10 = r0
            goto L_0x00d7
        L_0x00a4:
            r10 = move-exception
            r3 = r0
        L_0x00a6:
            java.lang.String r1 = "cannot make a file"
            com.kakao.util.helper.log.Logger.m60956w(r1, r10)     // Catch:{ all -> 0x00d4 }
            closeQuietly(r0)
            closeQuietly(r3)
        L_0x00b1:
            r0 = r2
        L_0x00b2:
            if (r0 != 0) goto L_0x00b8
            java.lang.String r0 = r9.getPath()
        L_0x00b8:
            if (r0 == 0) goto L_0x00cc
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = ">>> getImageFilePathFromUri - filePath : "
            r9.<init>(r10)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            com.kakao.util.helper.log.Logger.m60925d(r9)
            return r0
        L_0x00cc:
            java.io.FileNotFoundException r9 = new java.io.FileNotFoundException
            java.lang.String r10 = "filePath is null"
            r9.<init>(r10)
            throw r9
        L_0x00d4:
            r9 = move-exception
            r10 = r0
        L_0x00d6:
            r0 = r3
        L_0x00d7:
            closeQuietly(r10)
            closeQuietly(r0)
            throw r9
        L_0x00de:
            r9 = move-exception
        L_0x00df:
            if (r1 == 0) goto L_0x00e4
            r1.close()
        L_0x00e4:
            throw r9
        L_0x00e5:
            java.io.FileNotFoundException r9 = new java.io.FileNotFoundException
            java.lang.String r10 = "context is null."
            r9.<init>(r10)
            throw r9
        L_0x00ed:
            java.io.FileNotFoundException r9 = new java.io.FileNotFoundException
            java.lang.String r10 = "uri is null"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kakao.util.helper.MediaUtils.getImageFilePathFromUri(android.net.Uri, android.content.Context):java.lang.String");
    }
}
