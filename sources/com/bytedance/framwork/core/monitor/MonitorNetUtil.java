package com.bytedance.framwork.core.monitor;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.apm.util.C6294k;
import com.bytedance.frameworks.core.encrypt.TTEncryptUtils;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.zip.Deflater;
import java.util.zip.GZIPOutputStream;

public final class MonitorNetUtil {

    /* renamed from: a */
    private static C6376a f18672a;

    public enum CompressType {
        NONE(0),
        GZIP(1),
        DEFLATER(2);
        
        final int nativeInt;

        private CompressType(int i) {
            this.nativeInt = i;
        }
    }

    public enum NetworkType {
        NONE(0),
        MOBILE(1),
        MOBILE_2G(2),
        MOBILE_3G(3),
        WIFI(4),
        MOBILE_4G(5);
        
        final int nativeInt;

        public final int getValue() {
            return this.nativeInt;
        }

        private NetworkType(int i) {
            this.nativeInt = i;
        }
    }

    /* renamed from: com.bytedance.framwork.core.monitor.MonitorNetUtil$a */
    public interface C6376a {
        /* renamed from: a */
        String mo15283a(String str, byte[] bArr);
    }

    /* renamed from: b */
    public static boolean m19817b(Context context) {
        if (context == null) {
            return false;
        }
        return C6294k.m19530b(context);
    }

    /* renamed from: a */
    private static byte[] m19815a(InputStream inputStream) throws IOException {
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

    /* renamed from: a */
    public static NetworkType m19812a(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isAvailable()) {
                    int type = activeNetworkInfo.getType();
                    if (1 == type) {
                        return NetworkType.WIFI;
                    }
                    if (type != 0) {
                        return NetworkType.MOBILE;
                    }
                    switch (((TelephonyManager) context.getSystemService("phone")).getNetworkType()) {
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case 12:
                        case 14:
                        case 15:
                            return NetworkType.MOBILE_3G;
                        case 13:
                            return NetworkType.MOBILE_4G;
                        default:
                            return NetworkType.MOBILE;
                    }
                }
            }
            return NetworkType.NONE;
        } catch (Throwable unused) {
            return NetworkType.MOBILE;
        }
    }

    /* renamed from: a */
    public static String m19813a(String str, byte[] bArr) {
        if (f18672a != null) {
            return f18672a.mo15283a(str, bArr);
        }
        return str;
    }

    /* renamed from: a */
    public static byte[] m19814a(long j, String str, byte[] bArr, CompressType compressType, String str2, boolean z) throws Throwable {
        byte[] bArr2;
        String str3;
        String str4 = null;
        if (str == null) {
            return null;
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        int length = bArr.length;
        if (CompressType.GZIP == compressType && length > 128) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(VideoCacheReadBuffersizeExperiment.DEFAULT);
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.close();
                bArr = byteArrayOutputStream.toByteArray();
                str4 = "gzip";
            } catch (Throwable th) {
                gZIPOutputStream.close();
                throw th;
            }
        } else if (CompressType.DEFLATER == compressType && length > 128) {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(VideoCacheReadBuffersizeExperiment.DEFAULT);
            Deflater deflater = new Deflater();
            deflater.setInput(bArr);
            deflater.finish();
            byte[] bArr3 = new byte[VideoCacheReadBuffersizeExperiment.DEFAULT];
            while (!deflater.finished()) {
                byteArrayOutputStream2.write(bArr3, 0, deflater.deflate(bArr3));
            }
            deflater.end();
            bArr = byteArrayOutputStream2.toByteArray();
            str4 = "deflate";
        }
        String str5 = str4;
        byte[] a = TTEncryptUtils.m19789a(bArr, bArr.length);
        if (a != null) {
            if (TextUtils.isEmpty(new URL(str).getQuery())) {
                if (!str.endsWith("?")) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append("?");
                    str = sb.toString();
                }
            } else if (!str.endsWith("&")) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append("&");
                str = sb2.toString();
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append("tt_data=a");
            str2 = "application/octet-stream;tt-data=a";
            bArr2 = a;
            str3 = sb3.toString();
        } else {
            str3 = str;
            bArr2 = bArr;
        }
        return m19816a(str3, bArr2, str2, str5, "POST", true, true);
    }

    /* JADX WARNING: type inference failed for: r8v1 */
    /* JADX WARNING: type inference failed for: r8v2, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r8v3 */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r8v6 */
    /* JADX WARNING: type inference failed for: r8v7 */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: type inference failed for: r8v8 */
    /* JADX WARNING: type inference failed for: r8v9 */
    /* JADX WARNING: type inference failed for: r8v10 */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: type inference failed for: r3v16 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00ed A[SYNTHETIC, Splitter:B:69:0x00ed] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00f4 A[SYNTHETIC, Splitter:B:73:0x00f4] */
    /* JADX WARNING: Unknown variable types count: 6 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] m19816a(java.lang.String r3, byte[] r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, boolean r8, boolean r9) throws java.lang.Throwable {
        /*
            r8 = 0
            com.bytedance.framwork.core.monitor.MonitorNetUtil$a r0 = f18672a     // Catch:{ Throwable -> 0x00e3, all -> 0x00df }
            if (r0 == 0) goto L_0x000b
            com.bytedance.framwork.core.monitor.MonitorNetUtil$a r0 = f18672a     // Catch:{ Throwable -> 0x00e3, all -> 0x00df }
            java.lang.String r3 = r0.mo15283a(r3, r4)     // Catch:{ Throwable -> 0x00e3, all -> 0x00df }
        L_0x000b:
            java.util.LinkedList r0 = new java.util.LinkedList     // Catch:{ Throwable -> 0x00e3, all -> 0x00df }
            r0.<init>()     // Catch:{ Throwable -> 0x00e3, all -> 0x00df }
            if (r9 == 0) goto L_0x001c
            java.lang.String r3 = com.bytedance.frameworks.core.encrypt.C6367a.m19792a(r3, r0)     // Catch:{ Throwable -> 0x00e3, all -> 0x00df }
            java.net.URL r1 = new java.net.URL     // Catch:{ Throwable -> 0x00e3, all -> 0x00df }
            r1.<init>(r3)     // Catch:{ Throwable -> 0x00e3, all -> 0x00df }
            goto L_0x0021
        L_0x001c:
            java.net.URL r1 = new java.net.URL     // Catch:{ Throwable -> 0x00e3, all -> 0x00df }
            r1.<init>(r3)     // Catch:{ Throwable -> 0x00e3, all -> 0x00df }
        L_0x0021:
            java.net.URLConnection r3 = r1.openConnection()     // Catch:{ Throwable -> 0x00e3, all -> 0x00df }
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ Throwable -> 0x00e3, all -> 0x00df }
            if (r9 == 0) goto L_0x0056
            boolean r9 = r0.isEmpty()     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            if (r9 != 0) goto L_0x0056
            java.util.Iterator r9 = r0.iterator()     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
        L_0x0033:
            boolean r0 = r9.hasNext()     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            if (r0 == 0) goto L_0x0056
            java.lang.Object r0 = r9.next()     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            if (r0 == 0) goto L_0x0033
            java.lang.Object r1 = r0.first     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            java.lang.Object r0 = r0.second     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            com.bytedance.framwork.core.monitor.C6378b.m19821a(r3, r1, r0)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            goto L_0x0033
        L_0x004d:
            r4 = move-exception
            goto L_0x00eb
        L_0x0050:
            r4 = move-exception
            r2 = r8
            r8 = r3
            r3 = r2
            goto L_0x00e6
        L_0x0056:
            r9 = 1
            r3.setDoOutput(r9)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            if (r5 == 0) goto L_0x0061
            java.lang.String r9 = "Content-Type"
            com.bytedance.framwork.core.monitor.C6378b.m19821a(r3, r9, r5)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
        L_0x0061:
            if (r6 == 0) goto L_0x0068
            java.lang.String r5 = "Content-Encoding"
            com.bytedance.framwork.core.monitor.C6378b.m19821a(r3, r5, r6)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
        L_0x0068:
            java.lang.String r5 = "Accept-Encoding"
            java.lang.String r6 = "gzip"
            com.bytedance.framwork.core.monitor.C6378b.m19821a(r3, r5, r6)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            java.lang.String r5 = "Version-Code"
            java.lang.String r6 = "1"
            com.bytedance.framwork.core.monitor.C6378b.m19821a(r3, r5, r6)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            r3.setRequestMethod(r7)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            if (r4 == 0) goto L_0x0090
            int r5 = r4.length     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            if (r5 <= 0) goto L_0x0090
            java.io.DataOutputStream r5 = new java.io.DataOutputStream     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            java.io.OutputStream r6 = r3.getOutputStream()     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            r5.<init>(r6)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            r5.write(r4)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            r5.flush()     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            r5.close()     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
        L_0x0090:
            int r4 = r3.getResponseCode()     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            r5 = 200(0xc8, float:2.8E-43)
            if (r4 != r5) goto L_0x00d5
            java.io.InputStream r4 = com.bytedance.framwork.core.monitor.C6378b.m19820a(r3)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            java.lang.String r5 = r3.getContentEncoding()     // Catch:{ Throwable -> 0x00d0, all -> 0x00cc }
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Throwable -> 0x00d0, all -> 0x00cc }
            if (r6 != 0) goto L_0x00bb
            java.lang.String r6 = "gzip"
            boolean r5 = r5.equalsIgnoreCase(r6)     // Catch:{ Throwable -> 0x00d0, all -> 0x00cc }
            if (r5 == 0) goto L_0x00bb
            java.util.zip.GZIPInputStream r5 = new java.util.zip.GZIPInputStream     // Catch:{ Throwable -> 0x00d0, all -> 0x00cc }
            r5.<init>(r4)     // Catch:{ Throwable -> 0x00d0, all -> 0x00cc }
            byte[] r6 = m19815a(r5)     // Catch:{ Throwable -> 0x00d0, all -> 0x00cc }
            r5.close()     // Catch:{ Throwable -> 0x00d0, all -> 0x00cc }
            goto L_0x00bf
        L_0x00bb:
            byte[] r6 = m19815a(r4)     // Catch:{ Throwable -> 0x00d0, all -> 0x00cc }
        L_0x00bf:
            if (r4 == 0) goto L_0x00c6
            r4.close()     // Catch:{ Exception -> 0x00c5 }
            goto L_0x00c6
        L_0x00c5:
        L_0x00c6:
            if (r3 == 0) goto L_0x00cb
            r3.disconnect()     // Catch:{ Exception -> 0x00cb }
        L_0x00cb:
            return r6
        L_0x00cc:
            r5 = move-exception
            r8 = r4
            r4 = r5
            goto L_0x00eb
        L_0x00d0:
            r5 = move-exception
            r8 = r3
            r3 = r4
            r4 = r5
            goto L_0x00e6
        L_0x00d5:
            java.lang.String r5 = r3.getResponseMessage()     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            com.bytedance.apm.net.HttpResponseException r6 = new com.bytedance.apm.net.HttpResponseException     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            r6.<init>(r4, r5)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            throw r6     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
        L_0x00df:
            r3 = move-exception
            r4 = r3
            r3 = r8
            goto L_0x00eb
        L_0x00e3:
            r3 = move-exception
            r4 = r3
            r3 = r8
        L_0x00e6:
            throw r4     // Catch:{ all -> 0x00e7 }
        L_0x00e7:
            r4 = move-exception
            r2 = r8
            r8 = r3
            r3 = r2
        L_0x00eb:
            if (r8 == 0) goto L_0x00f2
            r8.close()     // Catch:{ Exception -> 0x00f1 }
            goto L_0x00f2
        L_0x00f1:
        L_0x00f2:
            if (r3 == 0) goto L_0x00f7
            r3.disconnect()     // Catch:{ Exception -> 0x00f7 }
        L_0x00f7:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.framwork.core.monitor.MonitorNetUtil.m19816a(java.lang.String, byte[], java.lang.String, java.lang.String, java.lang.String, boolean, boolean):byte[]");
    }
}
