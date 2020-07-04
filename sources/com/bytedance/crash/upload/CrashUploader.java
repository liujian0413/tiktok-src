package com.bytedance.crash.upload;

import android.text.TextUtils;
import com.bytedance.crash.C9912i;
import com.bytedance.crash.C9918j;
import com.bytedance.crash.p504l.C9984i;
import com.bytedance.frameworks.core.encrypt.TTEncryptUtils;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.zip.Deflater;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

public final class CrashUploader {

    /* renamed from: a */
    public static boolean f27277a;

    /* renamed from: b */
    private static C10023d f27278b;

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

    /* renamed from: a */
    private static byte[] m29755a(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(VideoCacheReadBuffersizeExperiment.DEFAULT);
        Deflater deflater = new Deflater();
        deflater.setInput(bArr);
        deflater.finish();
        byte[] bArr2 = new byte[VideoCacheReadBuffersizeExperiment.DEFAULT];
        while (!deflater.finished()) {
            byteArrayOutputStream.write(bArr2, 0, deflater.deflate(bArr2));
        }
        deflater.end();
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: a */
    private static boolean m29752a(String str) {
        return str.startsWith(WebKitApi.SCHEME_HTTPS);
    }

    /* renamed from: a */
    public static boolean m29753a(String str, String str2, String str3, String str4, List<String> list) {
        if (C9912i.m29324f()) {
            return false;
        }
        try {
            C10025f fVar = new C10025f(str, "UTF-8", false);
            fVar.mo24651a("aid", str2);
            fVar.mo24651a("device_id", str3);
            fVar.mo24651a("os", "Android");
            fVar.mo24651a("process_name", str4);
            for (String file : list) {
                File file2 = new File(file);
                if (file2.exists()) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("logtype", "alog");
                    hashMap.put("scene", "崩溃");
                    fVar.mo24650a(file2.getName(), file2, hashMap);
                }
            }
            try {
                if (new JSONObject(fVar.mo24648a()).optInt("errno", -1) == 200) {
                    return true;
                }
            } catch (JSONException unused) {
            }
            return false;
        } catch (IOException unused2) {
            return false;
        }
    }

    /* renamed from: a */
    private static byte[] m29754a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[VideoCacheReadBuffersizeExperiment.DEFAULT];
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 != read) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                inputStream.close();
                try {
                    return byteArrayOutputStream.toByteArray();
                } finally {
                    C9984i.m29565a((Closeable) byteArrayOutputStream);
                }
            }
        }
    }

    /* renamed from: a */
    public static String m29749a() {
        return C9918j.m29344i().f27119e;
    }

    /* renamed from: b */
    public static String m29759b() {
        return C9918j.m29344i().f27118d;
    }

    /* renamed from: b */
    private static String m29760b(String str) {
        StringBuilder sb = new StringBuilder(WebKitApi.SCHEME_HTTP);
        sb.append(str.substring(5));
        return sb.toString();
    }

    /* renamed from: a */
    public static C10029i m29744a(C10027h hVar) {
        if (hVar == null) {
            return new C10029i(201);
        }
        try {
            return m29743a(2097152, hVar.f27295a, hVar.f27299e, CompressType.GZIP, "application/json; charset=utf-8", hVar.f27298d);
        } catch (Throwable th) {
            return new C10029i(207, th);
        }
    }

    /* renamed from: b */
    public static String m29761b(Map map) {
        return m29750a(C9918j.m29344i().f27117c, map);
    }

    /* renamed from: c */
    private static C10029i m29763c(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return new C10029i(203);
        }
        String str = new String(bArr, Charset.forName("utf-8"));
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.length() > 0) {
                return new C10029i(0, jSONObject);
            }
            return new C10029i(204, str);
        } catch (JSONException unused) {
            return new C10029i(204, str);
        }
    }

    /* renamed from: b */
    private static byte[] m29762b(byte[] bArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(VideoCacheReadBuffersizeExperiment.DEFAULT);
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        try {
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            gZIPOutputStream.close();
            throw th;
        }
    }

    /* renamed from: a */
    public static String m29751a(Map map) {
        return m29750a(C9918j.m29344i().f27116b, map);
    }

    /* renamed from: a */
    public static C10029i m29745a(String str, String str2) {
        return m29747a(str, str2, true);
    }

    /* renamed from: b */
    public static C10029i m29756b(String str, String str2) {
        return m29747a(str, str2, true);
    }

    /* renamed from: c */
    private static String m29764c(String str, String str2) {
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    private static String m29750a(String str, Map map) {
        if (TextUtils.isDigitsOnly(str) || map == null || map.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        if (!str.contains("?")) {
            sb.append("?");
        }
        try {
            for (Entry entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    if (!sb.toString().endsWith("?")) {
                        sb.append("&");
                    }
                    sb.append(m29764c(entry.getKey().toString(), "UTF-8"));
                    sb.append("=");
                    sb.append(m29764c(entry.getValue().toString(), "UTF-8"));
                }
            }
            return sb.toString();
        } catch (Exception unused) {
            return str;
        }
    }

    /* renamed from: a */
    public static C10029i m29746a(String str, String str2, File file) {
        C10029i b = m29757b(str, str2, file);
        if (b.mo24657a()) {
            return b;
        }
        if (m29752a(str)) {
            return m29757b(m29760b(str), str2, file);
        }
        return m29757b(str, str2, file);
    }

    /* renamed from: a */
    public static C10029i m29747a(String str, String str2, boolean z) {
        try {
            if (!TextUtils.isEmpty(str2)) {
                if (!TextUtils.isEmpty(str)) {
                    return m29743a(2097152, str, str2.getBytes(), CompressType.GZIP, "application/json; charset=utf-8", z);
                }
            }
            return new C10029i(201);
        } catch (Throwable th) {
            return new C10029i(207, th);
        }
    }

    /* renamed from: b */
    private static C10029i m29757b(String str, String str2, File file) {
        if (C9912i.m29324f()) {
            return new C10029i(201);
        }
        try {
            C10025f fVar = new C10025f(str, "UTF-8", true);
            fVar.mo24651a("json", str2);
            fVar.mo24649a("file", file.getParentFile());
            try {
                return new C10029i(0, new JSONObject(fVar.mo24648a()));
            } catch (JSONException e) {
                return new C10029i(0, (Throwable) e);
            }
        } catch (IOException unused) {
            return new C10029i(207);
        }
    }

    /* renamed from: a */
    private static C10029i m29743a(long j, String str, byte[] bArr, CompressType compressType, String str2, boolean z) throws IOException {
        String str3;
        byte[] bArr2;
        String str4;
        if (C9912i.m29324f()) {
            return new C10029i(201);
        }
        if (str == null) {
            return new C10029i(201);
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        int length = bArr.length;
        String str5 = null;
        if (CompressType.GZIP == compressType && length > 128) {
            bArr = m29762b(bArr);
            str5 = "gzip";
        } else if (CompressType.DEFLATER == compressType && length > 128) {
            bArr = m29755a(bArr);
            str5 = "deflate";
        }
        byte[] bArr3 = bArr;
        String str6 = str5;
        if (bArr3 == null) {
            return new C10029i(202);
        }
        if (z) {
            byte[] a = TTEncryptUtils.m19789a(bArr3, bArr3.length);
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
                String sb4 = sb3.toString();
                bArr2 = a;
                str4 = sb4;
                str3 = "application/octet-stream;tt-data=a";
            } else {
                str4 = str;
                str3 = str2;
                bArr2 = bArr3;
            }
            return m29748a(str4, bArr2, str3, str6, "POST", true, true);
        }
        return m29748a(str, bArr3, str2, str6, "POST", true, false);
    }

    /* renamed from: a */
    private static C10029i m29748a(String str, byte[] bArr, String str2, String str3, String str4, boolean z, boolean z2) {
        C10029i b = m29758b(str, bArr, str2, str3, str4, true, z2);
        if (b.mo24657a()) {
            return b;
        }
        if (m29752a(str)) {
            return m29758b(m29760b(str), bArr, str2, str3, str4, true, z2);
        }
        return m29758b(str, bArr, str2, str3, str4, true, z2);
    }

    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r4v2, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r0v2, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r4v11 */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: type inference failed for: r0v6, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r6v11, types: [java.util.zip.GZIPInputStream, java.io.Closeable, java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: type inference failed for: r4v12 */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: type inference failed for: r0v12 */
    /* JADX WARNING: type inference failed for: r4v15 */
    /* JADX WARNING: type inference failed for: r4v16 */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0109, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x010a, code lost:
        r5 = r4;
        r4 = 0;
        r0 = r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x000c */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0126 A[SYNTHETIC, Splitter:B:107:0x0126] */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0013 A[Catch:{ Throwable -> 0x010d, all -> 0x0109 }] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001d A[Catch:{ Throwable -> 0x010d, all -> 0x0109 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002a A[SYNTHETIC, Splitter:B:14:0x002a] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0059 A[Catch:{ Throwable -> 0x0051, all -> 0x004e }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005e A[Catch:{ Throwable -> 0x0051, all -> 0x004e }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0064 A[Catch:{ Throwable -> 0x0051, all -> 0x004e }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006b A[Catch:{ Throwable -> 0x0051, all -> 0x004e }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0079 A[Catch:{ Throwable -> 0x0051, all -> 0x004e }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0101 A[SYNTHETIC, Splitter:B:89:0x0101] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0109 A[ExcHandler: all (r4v6 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x0001] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0119 A[SYNTHETIC, Splitter:B:99:0x0119] */
    /* JADX WARNING: Unknown variable types count: 8 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.bytedance.crash.upload.C10029i m29758b(java.lang.String r4, byte[] r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, boolean r9, boolean r10) {
        /*
            r0 = 0
            com.bytedance.crash.upload.d r1 = f27278b     // Catch:{ Throwable -> 0x010d, all -> 0x0109 }
            if (r1 == 0) goto L_0x000c
            com.bytedance.crash.upload.d r1 = f27278b     // Catch:{ Throwable -> 0x000c, all -> 0x0109 }
            java.lang.String r1 = r1.mo24646a(r4, r5)     // Catch:{ Throwable -> 0x000c, all -> 0x0109 }
            r4 = r1
        L_0x000c:
            java.util.LinkedList r1 = new java.util.LinkedList     // Catch:{ Throwable -> 0x010d, all -> 0x0109 }
            r1.<init>()     // Catch:{ Throwable -> 0x010d, all -> 0x0109 }
            if (r10 == 0) goto L_0x001d
            java.net.URL r2 = new java.net.URL     // Catch:{ Throwable -> 0x010d, all -> 0x0109 }
            java.lang.String r4 = com.bytedance.frameworks.core.encrypt.C6367a.m19792a(r4, r1)     // Catch:{ Throwable -> 0x010d, all -> 0x0109 }
            r2.<init>(r4)     // Catch:{ Throwable -> 0x010d, all -> 0x0109 }
            goto L_0x0022
        L_0x001d:
            java.net.URL r2 = new java.net.URL     // Catch:{ Throwable -> 0x010d, all -> 0x0109 }
            r2.<init>(r4)     // Catch:{ Throwable -> 0x010d, all -> 0x0109 }
        L_0x0022:
            java.net.URLConnection r4 = r2.openConnection()     // Catch:{ Throwable -> 0x010d, all -> 0x0109 }
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch:{ Throwable -> 0x010d, all -> 0x0109 }
            if (r10 == 0) goto L_0x0057
            boolean r10 = r1.isEmpty()     // Catch:{ Throwable -> 0x0051, all -> 0x004e }
            if (r10 != 0) goto L_0x0057
            java.util.Iterator r10 = r1.iterator()     // Catch:{ Throwable -> 0x0051, all -> 0x004e }
        L_0x0034:
            boolean r1 = r10.hasNext()     // Catch:{ Throwable -> 0x0051, all -> 0x004e }
            if (r1 == 0) goto L_0x0057
            java.lang.Object r1 = r10.next()     // Catch:{ Throwable -> 0x0051, all -> 0x004e }
            android.util.Pair r1 = (android.util.Pair) r1     // Catch:{ Throwable -> 0x0051, all -> 0x004e }
            if (r1 == 0) goto L_0x0034
            java.lang.Object r2 = r1.first     // Catch:{ Throwable -> 0x0051, all -> 0x004e }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Throwable -> 0x0051, all -> 0x004e }
            java.lang.Object r1 = r1.second     // Catch:{ Throwable -> 0x0051, all -> 0x004e }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Throwable -> 0x0051, all -> 0x004e }
            com.bytedance.crash.upload.C10017b.m29774a(r4, r2, r1)     // Catch:{ Throwable -> 0x0051, all -> 0x004e }
            goto L_0x0034
        L_0x004e:
            r5 = move-exception
            goto L_0x0124
        L_0x0051:
            r5 = move-exception
            r3 = r0
            r0 = r4
            r4 = r3
            goto L_0x0110
        L_0x0057:
            if (r9 == 0) goto L_0x005e
            r9 = 1
            r4.setDoOutput(r9)     // Catch:{ Throwable -> 0x0051, all -> 0x004e }
            goto L_0x0062
        L_0x005e:
            r9 = 0
            r4.setDoOutput(r9)     // Catch:{ Throwable -> 0x0051, all -> 0x004e }
        L_0x0062:
            if (r6 == 0) goto L_0x0069
            java.lang.String r9 = "Content-Type"
            com.bytedance.crash.upload.C10017b.m29774a(r4, r9, r6)     // Catch:{ Throwable -> 0x0051, all -> 0x004e }
        L_0x0069:
            if (r7 == 0) goto L_0x0070
            java.lang.String r6 = "Content-Encoding"
            com.bytedance.crash.upload.C10017b.m29774a(r4, r6, r7)     // Catch:{ Throwable -> 0x0051, all -> 0x004e }
        L_0x0070:
            java.lang.String r6 = "Accept-Encoding"
            java.lang.String r7 = "gzip"
            com.bytedance.crash.upload.C10017b.m29774a(r4, r6, r7)     // Catch:{ Throwable -> 0x0051, all -> 0x004e }
            if (r8 == 0) goto L_0x0101
            r4.setRequestMethod(r8)     // Catch:{ Throwable -> 0x0051, all -> 0x004e }
            if (r5 == 0) goto L_0x009c
            int r6 = r5.length     // Catch:{ Throwable -> 0x0051, all -> 0x004e }
            if (r6 <= 0) goto L_0x009c
            java.io.DataOutputStream r6 = new java.io.DataOutputStream     // Catch:{ all -> 0x0096 }
            java.io.OutputStream r7 = r4.getOutputStream()     // Catch:{ all -> 0x0096 }
            r6.<init>(r7)     // Catch:{ all -> 0x0096 }
            r6.write(r5)     // Catch:{ all -> 0x0094 }
            r6.flush()     // Catch:{ all -> 0x0094 }
            com.bytedance.crash.p504l.C9984i.m29565a(r6)     // Catch:{ Throwable -> 0x0051, all -> 0x004e }
            goto L_0x009c
        L_0x0094:
            r5 = move-exception
            goto L_0x0098
        L_0x0096:
            r5 = move-exception
            r6 = r0
        L_0x0098:
            com.bytedance.crash.p504l.C9984i.m29565a(r6)     // Catch:{ Throwable -> 0x0051, all -> 0x004e }
            throw r5     // Catch:{ Throwable -> 0x0051, all -> 0x004e }
        L_0x009c:
            int r5 = r4.getResponseCode()     // Catch:{ Throwable -> 0x0051, all -> 0x004e }
            r6 = 200(0xc8, float:2.8E-43)
            if (r5 != r6) goto L_0x00e3
            java.io.InputStream r5 = com.bytedance.crash.upload.C10017b.m29773a(r4)     // Catch:{ Throwable -> 0x0051, all -> 0x004e }
            java.lang.String r6 = r4.getContentEncoding()     // Catch:{ Throwable -> 0x00de, all -> 0x00da }
            java.lang.String r7 = "gzip"
            boolean r6 = r7.equalsIgnoreCase(r6)     // Catch:{ Throwable -> 0x00de, all -> 0x00da }
            if (r6 == 0) goto L_0x00c9
            java.util.zip.GZIPInputStream r6 = new java.util.zip.GZIPInputStream     // Catch:{ all -> 0x00c4 }
            r6.<init>(r5)     // Catch:{ all -> 0x00c4 }
            byte[] r7 = m29754a(r6)     // Catch:{ all -> 0x00c1 }
            com.bytedance.crash.p504l.C9984i.m29565a(r6)     // Catch:{ Throwable -> 0x00de, all -> 0x00da }
            goto L_0x00cd
        L_0x00c1:
            r7 = move-exception
            r0 = r6
            goto L_0x00c5
        L_0x00c4:
            r7 = move-exception
        L_0x00c5:
            com.bytedance.crash.p504l.C9984i.m29565a(r0)     // Catch:{ Throwable -> 0x00de, all -> 0x00da }
            throw r7     // Catch:{ Throwable -> 0x00de, all -> 0x00da }
        L_0x00c9:
            byte[] r7 = m29754a(r5)     // Catch:{ Throwable -> 0x00de, all -> 0x00da }
        L_0x00cd:
            com.bytedance.crash.upload.i r6 = m29763c(r7)     // Catch:{ Throwable -> 0x00de, all -> 0x00da }
            if (r4 == 0) goto L_0x00d6
            r4.disconnect()     // Catch:{ Exception -> 0x00d6 }
        L_0x00d6:
            com.bytedance.crash.p504l.C9984i.m29565a(r5)
            return r6
        L_0x00da:
            r6 = move-exception
            r0 = r5
            r5 = r6
            goto L_0x0124
        L_0x00de:
            r6 = move-exception
            r0 = r4
            r4 = r5
            r5 = r6
            goto L_0x0110
        L_0x00e3:
            com.bytedance.crash.upload.i r6 = new com.bytedance.crash.upload.i     // Catch:{ Throwable -> 0x0051, all -> 0x004e }
            r7 = 206(0xce, float:2.89E-43)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0051, all -> 0x004e }
            java.lang.String r9 = "http response code "
            r8.<init>(r9)     // Catch:{ Throwable -> 0x0051, all -> 0x004e }
            r8.append(r5)     // Catch:{ Throwable -> 0x0051, all -> 0x004e }
            java.lang.String r5 = r8.toString()     // Catch:{ Throwable -> 0x0051, all -> 0x004e }
            r6.<init>(r7, r5)     // Catch:{ Throwable -> 0x0051, all -> 0x004e }
            if (r4 == 0) goto L_0x00fd
            r4.disconnect()     // Catch:{ Exception -> 0x00fd }
        L_0x00fd:
            com.bytedance.crash.p504l.C9984i.m29565a(r0)
            return r6
        L_0x0101:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch:{ Throwable -> 0x0051, all -> 0x004e }
            java.lang.String r6 = "request method is not null"
            r5.<init>(r6)     // Catch:{ Throwable -> 0x0051, all -> 0x004e }
            throw r5     // Catch:{ Throwable -> 0x0051, all -> 0x004e }
        L_0x0109:
            r4 = move-exception
            r5 = r4
            r4 = r0
            goto L_0x0124
        L_0x010d:
            r4 = move-exception
            r5 = r4
            r4 = r0
        L_0x0110:
            com.bytedance.crash.upload.i r6 = new com.bytedance.crash.upload.i     // Catch:{ all -> 0x0120 }
            r7 = 207(0xcf, float:2.9E-43)
            r6.<init>(r7, r5)     // Catch:{ all -> 0x0120 }
            if (r0 == 0) goto L_0x011c
            r0.disconnect()     // Catch:{ Exception -> 0x011c }
        L_0x011c:
            com.bytedance.crash.p504l.C9984i.m29565a(r4)
            return r6
        L_0x0120:
            r5 = move-exception
            r3 = r0
            r0 = r4
            r4 = r3
        L_0x0124:
            if (r4 == 0) goto L_0x0129
            r4.disconnect()     // Catch:{ Exception -> 0x0129 }
        L_0x0129:
            com.bytedance.crash.p504l.C9984i.m29565a(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.upload.CrashUploader.m29758b(java.lang.String, byte[], java.lang.String, java.lang.String, java.lang.String, boolean, boolean):com.bytedance.crash.upload.i");
    }
}
