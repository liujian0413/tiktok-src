package com.p280ss.android.p817ad.p818a.p822c;

import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.ss.android.ad.a.c.c */
public final class C18935c {
    /* renamed from: a */
    private static String m61798a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[PreloadTask.BYTE_UNIT_NUMBER];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                inputStream.close();
                String byteArrayOutputStream2 = byteArrayOutputStream.toString();
                byteArrayOutputStream.close();
                return byteArrayOutputStream2;
            }
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00a5 */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b4  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p280ss.android.p817ad.p818a.p819a.p820a.C18913a m61797a(java.lang.String r6, java.util.HashMap<java.lang.String, java.lang.String> r7, java.lang.String r8, int r9) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.net.URL r0 = new java.net.URL     // Catch:{ SocketTimeoutException -> 0x00a4, IOException -> 0x009d, all -> 0x009a }
            r0.<init>(r6)     // Catch:{ SocketTimeoutException -> 0x00a4, IOException -> 0x009d, all -> 0x009a }
            java.net.URLConnection r6 = r0.openConnection()     // Catch:{ SocketTimeoutException -> 0x00a4, IOException -> 0x009d, all -> 0x009a }
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ SocketTimeoutException -> 0x00a4, IOException -> 0x009d, all -> 0x009a }
            java.lang.String r0 = "POST"
            r6.setRequestMethod(r0)     // Catch:{ SocketTimeoutException -> 0x00a5, IOException -> 0x009e }
            double r2 = (double) r9
            r4 = 4600877379321698714(0x3fd999999999999a, double:0.4)
            java.lang.Double.isNaN(r2)
            double r4 = r4 * r2
            long r4 = java.lang.Math.round(r4)     // Catch:{ SocketTimeoutException -> 0x00a5, IOException -> 0x009e }
            int r9 = (int) r4
            r4 = 4603579539098121011(0x3fe3333333333333, double:0.6)
            java.lang.Double.isNaN(r2)
            double r2 = r2 * r4
            long r2 = java.lang.Math.round(r2)     // Catch:{ SocketTimeoutException -> 0x00a5, IOException -> 0x009e }
            int r0 = (int) r2     // Catch:{ SocketTimeoutException -> 0x00a5, IOException -> 0x009e }
            r6.setReadTimeout(r9)     // Catch:{ SocketTimeoutException -> 0x00a5, IOException -> 0x009e }
            r6.setConnectTimeout(r0)     // Catch:{ SocketTimeoutException -> 0x00a5, IOException -> 0x009e }
            r9 = 1
            r6.setDoOutput(r9)     // Catch:{ SocketTimeoutException -> 0x00a5, IOException -> 0x009e }
            java.util.Set r7 = r7.entrySet()     // Catch:{ SocketTimeoutException -> 0x00a5, IOException -> 0x009e }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ SocketTimeoutException -> 0x00a5, IOException -> 0x009e }
        L_0x0049:
            boolean r9 = r7.hasNext()     // Catch:{ SocketTimeoutException -> 0x00a5, IOException -> 0x009e }
            if (r9 == 0) goto L_0x0065
            java.lang.Object r9 = r7.next()     // Catch:{ SocketTimeoutException -> 0x00a5, IOException -> 0x009e }
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9     // Catch:{ SocketTimeoutException -> 0x00a5, IOException -> 0x009e }
            java.lang.Object r0 = r9.getKey()     // Catch:{ SocketTimeoutException -> 0x00a5, IOException -> 0x009e }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ SocketTimeoutException -> 0x00a5, IOException -> 0x009e }
            java.lang.Object r9 = r9.getValue()     // Catch:{ SocketTimeoutException -> 0x00a5, IOException -> 0x009e }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ SocketTimeoutException -> 0x00a5, IOException -> 0x009e }
            com.p280ss.android.p817ad.p818a.p822c.C18936d.m61800a(r6, r0, r9)     // Catch:{ SocketTimeoutException -> 0x00a5, IOException -> 0x009e }
            goto L_0x0049
        L_0x0065:
            java.io.OutputStream r7 = r6.getOutputStream()     // Catch:{ SocketTimeoutException -> 0x00a5, IOException -> 0x009e }
            byte[] r8 = r8.getBytes()     // Catch:{ SocketTimeoutException -> 0x00a5, IOException -> 0x009e }
            r7.write(r8)     // Catch:{ SocketTimeoutException -> 0x00a5, IOException -> 0x009e }
            r7.flush()     // Catch:{ SocketTimeoutException -> 0x00a5, IOException -> 0x009e }
            r7.close()     // Catch:{ SocketTimeoutException -> 0x00a5, IOException -> 0x009e }
            int r7 = r6.getResponseCode()     // Catch:{ SocketTimeoutException -> 0x00a5, IOException -> 0x009e }
            int r8 = r6.getResponseCode()     // Catch:{ SocketTimeoutException -> 0x00a5, IOException -> 0x009e }
            r9 = 400(0x190, float:5.6E-43)
            if (r8 < r9) goto L_0x0087
            java.io.InputStream r8 = r6.getErrorStream()     // Catch:{ SocketTimeoutException -> 0x00a5, IOException -> 0x009e }
            goto L_0x008b
        L_0x0087:
            java.io.InputStream r8 = com.p280ss.android.p817ad.p818a.p822c.C18936d.m61799a(r6)     // Catch:{ SocketTimeoutException -> 0x00a5, IOException -> 0x009e }
        L_0x008b:
            java.lang.String r8 = m61798a(r8)     // Catch:{ SocketTimeoutException -> 0x00a5, IOException -> 0x009e }
            com.ss.android.ad.a.a.a.a r9 = new com.ss.android.ad.a.a.a.a     // Catch:{ SocketTimeoutException -> 0x00a5, IOException -> 0x009e }
            r9.<init>(r8, r7)     // Catch:{ SocketTimeoutException -> 0x00a5, IOException -> 0x009e }
            if (r6 == 0) goto L_0x0099
            r6.disconnect()
        L_0x0099:
            return r9
        L_0x009a:
            r7 = move-exception
            r6 = r1
            goto L_0x00b2
        L_0x009d:
            r6 = r1
        L_0x009e:
            if (r6 == 0) goto L_0x00a3
            r6.disconnect()
        L_0x00a3:
            return r1
        L_0x00a4:
            r6 = r1
        L_0x00a5:
            com.ss.android.ad.a.a.a.a r7 = new com.ss.android.ad.a.a.a.a     // Catch:{ all -> 0x00b1 }
            r8 = -1
            r7.<init>(r1, r8)     // Catch:{ all -> 0x00b1 }
            if (r6 == 0) goto L_0x00b0
            r6.disconnect()
        L_0x00b0:
            return r7
        L_0x00b1:
            r7 = move-exception
        L_0x00b2:
            if (r6 == 0) goto L_0x00b7
            r6.disconnect()
        L_0x00b7:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.p817ad.p818a.p822c.C18935c.m61797a(java.lang.String, java.util.HashMap, java.lang.String, int):com.ss.android.ad.a.a.a.a");
    }
}
