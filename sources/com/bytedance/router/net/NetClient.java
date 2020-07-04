package com.bytedance.router.net;

import com.p280ss.android.ugc.aweme.lancet.network.C7116a;
import com.p280ss.android.ugc.aweme.lancet.network.C7118e;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class NetClient {

    class _lancet {
        private _lancet() {
        }

        /* renamed from: com_ss_android_ugc_aweme_lancet_network_UrlConnectionLancet_getInputStream */
        static InputStream m36448xff4d584d(HttpURLConnection httpURLConnection) throws IOException {
            URLConnection uRLConnection = httpURLConnection;
            if (C7118e.m22232a(uRLConnection)) {
                C7116a.m22226a(uRLConnection.getURL(), null, null, uRLConnection.getContentType());
            } else if (C7163a.m22363a()) {
                C7116a.m22230b(uRLConnection.getURL(), null, null, uRLConnection.getContentType());
            }
            return httpURLConnection.getInputStream();
        }

        /* renamed from: com_ss_android_ugc_aweme_lancet_network_UrlConnectionLancet_setRequestProperty */
        static void m36449x963129db(HttpURLConnection httpURLConnection, String str, String str2) {
            URLConnection uRLConnection = httpURLConnection;
            if (C7118e.m22232a(uRLConnection)) {
                C7116a.m22226a(uRLConnection.getURL(), str, str2, "");
            } else if (C7163a.m22363a()) {
                C7116a.m22230b(uRLConnection.getURL(), str, str2, "");
            }
            httpURLConnection.setRequestProperty(str, str2);
        }
    }

    private static HttpURLConnection createConnection(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        _lancet.m36449x963129db(httpURLConnection, "Content-Type", "application/json; charset=UTF-8");
        httpURLConnection.setUseCaches(false);
        return httpURLConnection;
    }

    private static byte[] getBytes(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(byteArrayOutputStream);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        byte[] bArr = new byte[VideoCacheReadBuffersizeExperiment.DEFAULT];
        while (true) {
            int read = bufferedInputStream.read(bArr);
            if (read != -1) {
                bufferedOutputStream.write(bArr, 0, read);
            } else {
                bufferedOutputStream.flush();
                bufferedInputStream.close();
                bufferedOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x003e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bytedance.router.net.NetResponse get(java.lang.String r11, java.util.Map<java.lang.String, java.lang.String> r12) {
        /*
            com.bytedance.router.net.NetResponse r0 = new com.bytedance.router.net.NetResponse
            r0.<init>()
            android.net.Uri r11 = android.net.Uri.parse(r11)
            android.net.Uri$Builder r11 = r11.buildUpon()
            if (r12 == 0) goto L_0x0039
            int r1 = r12.size()
            if (r1 <= 0) goto L_0x0039
            java.util.Set r12 = r12.entrySet()
            java.util.Iterator r12 = r12.iterator()
        L_0x001d:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x0039
            java.lang.Object r1 = r12.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r11.appendQueryParameter(r2, r1)
            goto L_0x001d
        L_0x0039:
            java.lang.String r11 = r11.toString()
            r12 = 0
        L_0x003e:
            r1 = 0
            r2 = 500(0x1f4, double:2.47E-321)
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            r6 = 6
            r7 = 200(0xc8, float:2.8E-43)
            java.net.HttpURLConnection r8 = createConnection(r11)     // Catch:{ Exception -> 0x00c0 }
            java.lang.String r1 = "GET"
            r8.setRequestMethod(r1)     // Catch:{ Exception -> 0x00bb, all -> 0x00b9 }
            r8.connect()     // Catch:{ Exception -> 0x00bb, all -> 0x00b9 }
            int r1 = r8.getResponseCode()     // Catch:{ Exception -> 0x00bb, all -> 0x00b9 }
            r0.errorCode = r1     // Catch:{ Exception -> 0x00bb, all -> 0x00b9 }
            int r1 = r8.getResponseCode()     // Catch:{ Exception -> 0x00bb, all -> 0x00b9 }
            if (r7 != r1) goto L_0x0099
            java.io.InputStream r1 = com.bytedance.router.net.NetClient._lancet.m36448xff4d584d(r8)     // Catch:{ Exception -> 0x00bb, all -> 0x00b9 }
            byte[] r1 = getBytes(r1)     // Catch:{ Exception -> 0x00bb, all -> 0x00b9 }
            java.lang.String r9 = new java.lang.String     // Catch:{ Exception -> 0x00bb, all -> 0x00b9 }
            java.lang.String r10 = "UTF-8"
            r9.<init>(r1, r10)     // Catch:{ Exception -> 0x00bb, all -> 0x00b9 }
            r0.content = r9     // Catch:{ Exception -> 0x00bb, all -> 0x00b9 }
            if (r8 == 0) goto L_0x0074
            r8.disconnect()
        L_0x0074:
            int r11 = r0.errorCode
            if (r11 == r7) goto L_0x0098
            if (r12 >= r6) goto L_0x00fa
            int r11 = r12 + 1
            double r6 = (double) r12
            double r4 = java.lang.Math.pow(r4, r6)     // Catch:{ InterruptedException -> 0x0087 }
            long r4 = (long) r4     // Catch:{ InterruptedException -> 0x0087 }
            long r4 = r4 * r2
            java.lang.Thread.sleep(r4)     // Catch:{ InterruptedException -> 0x0087 }
        L_0x0087:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r1 = "retry connect url: "
            r12.<init>(r1)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            com.bytedance.router.util.Logger.m36460w(r11)
        L_0x0098:
            return r0
        L_0x0099:
            if (r8 == 0) goto L_0x009e
            r8.disconnect()
        L_0x009e:
            int r1 = r0.errorCode
            if (r1 == r7) goto L_0x003e
            if (r12 >= r6) goto L_0x00fa
            int r1 = r12 + 1
            double r6 = (double) r12
            double r4 = java.lang.Math.pow(r4, r6)     // Catch:{ InterruptedException -> 0x00b1 }
            long r4 = (long) r4     // Catch:{ InterruptedException -> 0x00b1 }
            long r4 = r4 * r2
            java.lang.Thread.sleep(r4)     // Catch:{ InterruptedException -> 0x00b1 }
        L_0x00b1:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r2 = "retry connect url: "
            r12.<init>(r2)
            goto L_0x00e2
        L_0x00b9:
            r11 = move-exception
            goto L_0x00ef
        L_0x00bb:
            r1 = r8
            goto L_0x00c0
        L_0x00bd:
            r11 = move-exception
            r8 = r1
            goto L_0x00ef
        L_0x00c0:
            r8 = -1
            r0.errorCode = r8     // Catch:{ all -> 0x00bd }
            if (r1 == 0) goto L_0x00c8
            r1.disconnect()
        L_0x00c8:
            int r1 = r0.errorCode
            if (r1 == r7) goto L_0x003e
            if (r12 >= r6) goto L_0x00fa
            int r1 = r12 + 1
            double r6 = (double) r12
            double r4 = java.lang.Math.pow(r4, r6)     // Catch:{ InterruptedException -> 0x00db }
            long r4 = (long) r4     // Catch:{ InterruptedException -> 0x00db }
            long r4 = r4 * r2
            java.lang.Thread.sleep(r4)     // Catch:{ InterruptedException -> 0x00db }
        L_0x00db:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r2 = "retry connect url: "
            r12.<init>(r2)
        L_0x00e2:
            r12.append(r1)
            java.lang.String r12 = r12.toString()
            com.bytedance.router.util.Logger.m36460w(r12)
            r12 = r1
            goto L_0x003e
        L_0x00ef:
            if (r8 == 0) goto L_0x00f4
            r8.disconnect()
        L_0x00f4:
            int r1 = r0.errorCode
            if (r1 == r7) goto L_0x0119
            if (r12 < r6) goto L_0x00fb
        L_0x00fa:
            return r0
        L_0x00fb:
            int r0 = r12 + 1
            double r6 = (double) r12
            double r4 = java.lang.Math.pow(r4, r6)     // Catch:{ InterruptedException -> 0x0108 }
            long r4 = (long) r4     // Catch:{ InterruptedException -> 0x0108 }
            long r4 = r4 * r2
            java.lang.Thread.sleep(r4)     // Catch:{ InterruptedException -> 0x0108 }
        L_0x0108:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r1 = "retry connect url: "
            r12.<init>(r1)
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            com.bytedance.router.util.Logger.m36460w(r12)
        L_0x0119:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.router.net.NetClient.get(java.lang.String, java.util.Map):com.bytedance.router.net.NetResponse");
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x003e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bytedance.router.net.NetResponse post(java.lang.String r12, java.util.Map<java.lang.String, java.lang.String> r13, org.json.JSONObject r14) {
        /*
            com.bytedance.router.net.NetResponse r0 = new com.bytedance.router.net.NetResponse
            r0.<init>()
            android.net.Uri r1 = android.net.Uri.parse(r12)
            android.net.Uri$Builder r1 = r1.buildUpon()
            if (r13 == 0) goto L_0x0039
            int r2 = r13.size()
            if (r2 <= 0) goto L_0x0039
            java.util.Set r13 = r13.entrySet()
            java.util.Iterator r13 = r13.iterator()
        L_0x001d:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L_0x0039
            java.lang.Object r2 = r13.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            r1.appendQueryParameter(r3, r2)
            goto L_0x001d
        L_0x0039:
            java.lang.String r13 = r1.toString()
            r1 = 0
        L_0x003e:
            r2 = 0
            r3 = 500(0x1f4, double:2.47E-321)
            r5 = 4611686018427387904(0x4000000000000000, double:2.0)
            r7 = 6
            r8 = 200(0xc8, float:2.8E-43)
            java.net.HttpURLConnection r9 = createConnection(r13)     // Catch:{ Exception -> 0x00e1 }
            java.lang.String r2 = "POST"
            r9.setRequestMethod(r2)     // Catch:{ Exception -> 0x00dc, all -> 0x00da }
            r2 = 1
            r9.setDoOutput(r2)     // Catch:{ Exception -> 0x00dc, all -> 0x00da }
            if (r14 == 0) goto L_0x006b
            java.lang.String r2 = r14.toString()     // Catch:{ Exception -> 0x00dc, all -> 0x00da }
            java.io.DataOutputStream r10 = new java.io.DataOutputStream     // Catch:{ Exception -> 0x00dc, all -> 0x00da }
            java.io.OutputStream r11 = r9.getOutputStream()     // Catch:{ Exception -> 0x00dc, all -> 0x00da }
            r10.<init>(r11)     // Catch:{ Exception -> 0x00dc, all -> 0x00da }
            r10.writeBytes(r2)     // Catch:{ Exception -> 0x00dc, all -> 0x00da }
            r10.flush()     // Catch:{ Exception -> 0x00dc, all -> 0x00da }
            r10.close()     // Catch:{ Exception -> 0x00dc, all -> 0x00da }
        L_0x006b:
            int r2 = r9.getResponseCode()     // Catch:{ Exception -> 0x00dc, all -> 0x00da }
            r0.errorCode = r2     // Catch:{ Exception -> 0x00dc, all -> 0x00da }
            int r2 = r9.getResponseCode()     // Catch:{ Exception -> 0x00dc, all -> 0x00da }
            if (r8 != r2) goto L_0x00ba
            java.io.InputStream r2 = com.bytedance.router.net.NetClient._lancet.m36448xff4d584d(r9)     // Catch:{ Exception -> 0x00dc, all -> 0x00da }
            byte[] r2 = getBytes(r2)     // Catch:{ Exception -> 0x00dc, all -> 0x00da }
            java.lang.String r10 = new java.lang.String     // Catch:{ Exception -> 0x00dc, all -> 0x00da }
            java.lang.String r11 = "UTF-8"
            r10.<init>(r2, r11)     // Catch:{ Exception -> 0x00dc, all -> 0x00da }
            r0.content = r10     // Catch:{ Exception -> 0x00dc, all -> 0x00da }
            if (r9 == 0) goto L_0x008d
            r9.disconnect()
        L_0x008d:
            int r13 = r0.errorCode
            if (r13 == r8) goto L_0x00b9
            if (r1 >= r7) goto L_0x0123
            int r13 = r1 + 1
            double r1 = (double) r1
            double r1 = java.lang.Math.pow(r5, r1)     // Catch:{ InterruptedException -> 0x00a0 }
            long r1 = (long) r1     // Catch:{ InterruptedException -> 0x00a0 }
            long r1 = r1 * r3
            java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x00a0 }
        L_0x00a0:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r1 = "retry connect url: "
            r14.<init>(r1)
            r14.append(r13)
            java.lang.String r13 = ": "
            r14.append(r13)
            r14.append(r12)
            java.lang.String r12 = r14.toString()
            com.bytedance.router.util.Logger.m36460w(r12)
        L_0x00b9:
            return r0
        L_0x00ba:
            if (r9 == 0) goto L_0x00bf
            r9.disconnect()
        L_0x00bf:
            int r2 = r0.errorCode
            if (r2 == r8) goto L_0x003e
            if (r1 >= r7) goto L_0x0123
            int r2 = r1 + 1
            double r7 = (double) r1
            double r5 = java.lang.Math.pow(r5, r7)     // Catch:{ InterruptedException -> 0x00d2 }
            long r5 = (long) r5     // Catch:{ InterruptedException -> 0x00d2 }
            long r5 = r5 * r3
            java.lang.Thread.sleep(r5)     // Catch:{ InterruptedException -> 0x00d2 }
        L_0x00d2:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "retry connect url: "
            r1.<init>(r3)
            goto L_0x0103
        L_0x00da:
            r13 = move-exception
            goto L_0x0118
        L_0x00dc:
            r2 = r9
            goto L_0x00e1
        L_0x00de:
            r13 = move-exception
            r9 = r2
            goto L_0x0118
        L_0x00e1:
            r9 = -1
            r0.errorCode = r9     // Catch:{ all -> 0x00de }
            if (r2 == 0) goto L_0x00e9
            r2.disconnect()
        L_0x00e9:
            int r2 = r0.errorCode
            if (r2 == r8) goto L_0x003e
            if (r1 >= r7) goto L_0x0123
            int r2 = r1 + 1
            double r7 = (double) r1
            double r5 = java.lang.Math.pow(r5, r7)     // Catch:{ InterruptedException -> 0x00fc }
            long r5 = (long) r5     // Catch:{ InterruptedException -> 0x00fc }
            long r5 = r5 * r3
            java.lang.Thread.sleep(r5)     // Catch:{ InterruptedException -> 0x00fc }
        L_0x00fc:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "retry connect url: "
            r1.<init>(r3)
        L_0x0103:
            r1.append(r2)
            java.lang.String r3 = ": "
            r1.append(r3)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            com.bytedance.router.util.Logger.m36460w(r1)
            r1 = r2
            goto L_0x003e
        L_0x0118:
            if (r9 == 0) goto L_0x011d
            r9.disconnect()
        L_0x011d:
            int r14 = r0.errorCode
            if (r14 == r8) goto L_0x014a
            if (r1 < r7) goto L_0x0124
        L_0x0123:
            return r0
        L_0x0124:
            int r14 = r1 + 1
            double r0 = (double) r1
            double r0 = java.lang.Math.pow(r5, r0)     // Catch:{ InterruptedException -> 0x0131 }
            long r0 = (long) r0     // Catch:{ InterruptedException -> 0x0131 }
            long r0 = r0 * r3
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x0131 }
        L_0x0131:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "retry connect url: "
            r0.<init>(r1)
            r0.append(r14)
            java.lang.String r14 = ": "
            r0.append(r14)
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            com.bytedance.router.util.Logger.m36460w(r12)
        L_0x014a:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.router.net.NetClient.post(java.lang.String, java.util.Map, org.json.JSONObject):com.bytedance.router.net.NetResponse");
    }
}
