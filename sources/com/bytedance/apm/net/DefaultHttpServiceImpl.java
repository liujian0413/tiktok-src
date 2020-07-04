package com.bytedance.apm.net;

import com.bytedance.services.apm.api.C6477b;
import com.bytedance.services.apm.api.IHttpService;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

public class DefaultHttpServiceImpl implements IHttpService {
    private static String METHOD_GET = "GET";
    private static String METHOD_POST = "POST";

    public static byte[] toByteArray(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[VideoCacheReadBuffersizeExperiment.DEFAULT];
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
        if (inputStream != null) {
            inputStream.close();
        }
        return byteArrayOutputStream.toByteArray();
    }

    public C6477b doGet(String str, Map<String, String> map) throws Exception {
        return doRequest(str, null, METHOD_GET, map);
    }

    public C6477b doPost(String str, byte[] bArr, Map<String, String> map) throws Exception {
        return doRequest(str, bArr, METHOD_POST, map);
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x00c8 A[SYNTHETIC, Splitter:B:61:0x00c8] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00cf A[SYNTHETIC, Splitter:B:65:0x00cf] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00d7 A[SYNTHETIC, Splitter:B:72:0x00d7] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00de A[SYNTHETIC, Splitter:B:76:0x00de] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.bytedance.services.apm.api.C6477b doRequest(java.lang.String r4, byte[] r5, java.lang.String r6, java.util.Map<java.lang.String, java.lang.String> r7) throws java.lang.Exception {
        /*
            r3 = this;
            if (r6 == 0) goto L_0x00e2
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch:{ Throwable -> 0x00d3, all -> 0x00c4 }
            r1.<init>(r4)     // Catch:{ Throwable -> 0x00d3, all -> 0x00c4 }
            java.net.URLConnection r4 = r1.openConnection()     // Catch:{ Throwable -> 0x00d3, all -> 0x00c4 }
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch:{ Throwable -> 0x00d3, all -> 0x00c4 }
            r1 = 5000(0x1388, float:7.006E-42)
            r4.setConnectTimeout(r1)     // Catch:{ Throwable -> 0x00c2, all -> 0x00c0 }
            r4.setReadTimeout(r1)     // Catch:{ Throwable -> 0x00c2, all -> 0x00c0 }
            if (r7 == 0) goto L_0x0044
            boolean r1 = r7.isEmpty()     // Catch:{ Throwable -> 0x00c2, all -> 0x00c0 }
            if (r1 != 0) goto L_0x0044
            java.util.Set r7 = r7.entrySet()     // Catch:{ Throwable -> 0x00c2, all -> 0x00c0 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ Throwable -> 0x00c2, all -> 0x00c0 }
        L_0x0026:
            boolean r1 = r7.hasNext()     // Catch:{ Throwable -> 0x00c2, all -> 0x00c0 }
            if (r1 == 0) goto L_0x0044
            java.lang.Object r1 = r7.next()     // Catch:{ Throwable -> 0x00c2, all -> 0x00c0 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ Throwable -> 0x00c2, all -> 0x00c0 }
            if (r1 == 0) goto L_0x0026
            java.lang.Object r2 = r1.getKey()     // Catch:{ Throwable -> 0x00c2, all -> 0x00c0 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Throwable -> 0x00c2, all -> 0x00c0 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ Throwable -> 0x00c2, all -> 0x00c0 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Throwable -> 0x00c2, all -> 0x00c0 }
            com.bytedance.apm.net.C6289a.m19515a(r4, r2, r1)     // Catch:{ Throwable -> 0x00c2, all -> 0x00c0 }
            goto L_0x0026
        L_0x0044:
            java.lang.String r7 = METHOD_POST     // Catch:{ Throwable -> 0x00c2, all -> 0x00c0 }
            boolean r7 = android.text.TextUtils.equals(r6, r7)     // Catch:{ Throwable -> 0x00c2, all -> 0x00c0 }
            if (r7 == 0) goto L_0x0051
            r7 = 1
            r4.setDoOutput(r7)     // Catch:{ Throwable -> 0x00c2, all -> 0x00c0 }
            goto L_0x0055
        L_0x0051:
            r7 = 0
            r4.setDoOutput(r7)     // Catch:{ Throwable -> 0x00c2, all -> 0x00c0 }
        L_0x0055:
            r4.setRequestMethod(r6)     // Catch:{ Throwable -> 0x00c2, all -> 0x00c0 }
            if (r5 == 0) goto L_0x006f
            int r6 = r5.length     // Catch:{ Throwable -> 0x00c2, all -> 0x00c0 }
            if (r6 <= 0) goto L_0x006f
            java.io.DataOutputStream r6 = new java.io.DataOutputStream     // Catch:{ Throwable -> 0x00c2, all -> 0x00c0 }
            java.io.OutputStream r7 = r4.getOutputStream()     // Catch:{ Throwable -> 0x00c2, all -> 0x00c0 }
            r6.<init>(r7)     // Catch:{ Throwable -> 0x00c2, all -> 0x00c0 }
            r6.write(r5)     // Catch:{ Throwable -> 0x00c2, all -> 0x00c0 }
            r6.flush()     // Catch:{ Throwable -> 0x00c2, all -> 0x00c0 }
            r6.close()     // Catch:{ Throwable -> 0x00c2, all -> 0x00c0 }
        L_0x006f:
            int r5 = r4.getResponseCode()     // Catch:{ Throwable -> 0x00c2, all -> 0x00c0 }
            r6 = 200(0xc8, float:2.8E-43)
            if (r5 != r6) goto L_0x00b5
            java.io.InputStream r6 = com.bytedance.apm.net.C6289a.m19514a(r4)     // Catch:{ Throwable -> 0x00c2, all -> 0x00c0 }
            java.lang.String r7 = r4.getContentEncoding()     // Catch:{ Throwable -> 0x00b3, all -> 0x00b0 }
            boolean r1 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Throwable -> 0x00b3, all -> 0x00b0 }
            if (r1 != 0) goto L_0x009a
            java.lang.String r1 = "gzip"
            boolean r7 = r7.equalsIgnoreCase(r1)     // Catch:{ Throwable -> 0x00b3, all -> 0x00b0 }
            if (r7 == 0) goto L_0x009a
            java.util.zip.GZIPInputStream r7 = new java.util.zip.GZIPInputStream     // Catch:{ Throwable -> 0x00b3, all -> 0x00b0 }
            r7.<init>(r6)     // Catch:{ Throwable -> 0x00b3, all -> 0x00b0 }
            byte[] r1 = toByteArray(r7)     // Catch:{ Throwable -> 0x00b3, all -> 0x00b0 }
            r7.close()     // Catch:{ Throwable -> 0x00b3, all -> 0x00b0 }
            goto L_0x009e
        L_0x009a:
            byte[] r1 = toByteArray(r6)     // Catch:{ Throwable -> 0x00b3, all -> 0x00b0 }
        L_0x009e:
            com.bytedance.services.apm.api.b r7 = new com.bytedance.services.apm.api.b     // Catch:{ Throwable -> 0x00b3, all -> 0x00b0 }
            r7.<init>(r5, r1)     // Catch:{ Throwable -> 0x00b3, all -> 0x00b0 }
            if (r6 == 0) goto L_0x00aa
            r6.close()     // Catch:{ Exception -> 0x00a9 }
            goto L_0x00aa
        L_0x00a9:
        L_0x00aa:
            if (r4 == 0) goto L_0x00af
            r4.disconnect()     // Catch:{ Exception -> 0x00af }
        L_0x00af:
            return r7
        L_0x00b0:
            r5 = move-exception
            r0 = r6
            goto L_0x00c6
        L_0x00b3:
            goto L_0x00d5
        L_0x00b5:
            com.bytedance.services.apm.api.b r6 = new com.bytedance.services.apm.api.b     // Catch:{ Throwable -> 0x00c2, all -> 0x00c0 }
            r6.<init>(r5, r0)     // Catch:{ Throwable -> 0x00c2, all -> 0x00c0 }
            if (r4 == 0) goto L_0x00bf
            r4.disconnect()     // Catch:{ Exception -> 0x00bf }
        L_0x00bf:
            return r6
        L_0x00c0:
            r5 = move-exception
            goto L_0x00c6
        L_0x00c2:
            r6 = r0
            goto L_0x00d5
        L_0x00c4:
            r5 = move-exception
            r4 = r0
        L_0x00c6:
            if (r0 == 0) goto L_0x00cd
            r0.close()     // Catch:{ Exception -> 0x00cc }
            goto L_0x00cd
        L_0x00cc:
        L_0x00cd:
            if (r4 == 0) goto L_0x00d2
            r4.disconnect()     // Catch:{ Exception -> 0x00d2 }
        L_0x00d2:
            throw r5
        L_0x00d3:
            r4 = r0
            r6 = r4
        L_0x00d5:
            if (r6 == 0) goto L_0x00dc
            r6.close()     // Catch:{ Exception -> 0x00db }
            goto L_0x00dc
        L_0x00db:
        L_0x00dc:
            if (r4 == 0) goto L_0x00e1
            r4.disconnect()     // Catch:{ Exception -> 0x00e1 }
        L_0x00e1:
            return r0
        L_0x00e2:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "request method is not null"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.net.DefaultHttpServiceImpl.doRequest(java.lang.String, byte[], java.lang.String, java.util.Map):com.bytedance.services.apm.api.b");
    }
}
