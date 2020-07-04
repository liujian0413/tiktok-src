package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

public final class bjs implements bkc {

    /* renamed from: a */
    private static final Pattern f42335a = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: b */
    private static final AtomicReference<byte[]> f42336b = new AtomicReference<>();

    /* renamed from: c */
    private final boolean f42337c;

    /* renamed from: d */
    private final int f42338d;

    /* renamed from: e */
    private final int f42339e;

    /* renamed from: f */
    private final String f42340f;

    /* renamed from: g */
    private final bkk<String> f42341g;

    /* renamed from: h */
    private final HashMap<String, String> f42342h;

    /* renamed from: i */
    private final bkb f42343i;

    /* renamed from: j */
    private bjq f42344j;

    /* renamed from: k */
    private HttpURLConnection f42345k;

    /* renamed from: l */
    private InputStream f42346l;

    /* renamed from: m */
    private boolean f42347m;

    /* renamed from: n */
    private long f42348n;

    /* renamed from: o */
    private long f42349o;

    /* renamed from: p */
    private long f42350p;

    /* renamed from: q */
    private long f42351q;

    public bjs(String str, bkk<String> bkk, bkb bkb, int i, int i2, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            this.f42340f = str;
            this.f42341g = null;
            this.f42343i = null;
            this.f42342h = new HashMap<>();
            this.f42338d = i;
            this.f42339e = i2;
            this.f42337c = z;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00bd  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo39543a(com.google.android.gms.internal.ads.bjq r19) throws com.google.android.gms.internal.ads.zzjw {
        /*
            r18 = this;
            r8 = r18
            r9 = r19
            r8.f42344j = r9
            r10 = 0
            r8.f42351q = r10
            r8.f42350p = r10
            java.net.URL r2 = new java.net.URL     // Catch:{ IOException -> 0x017e }
            android.net.Uri r0 = r9.f42325a     // Catch:{ IOException -> 0x017e }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x017e }
            r2.<init>(r0)     // Catch:{ IOException -> 0x017e }
            long r12 = r9.f42327c     // Catch:{ IOException -> 0x017e }
            long r14 = r9.f42328d     // Catch:{ IOException -> 0x017e }
            int r0 = r9.f42330f     // Catch:{ IOException -> 0x017e }
            r7 = 1
            r0 = r0 & r7
            r5 = 0
            if (r0 == 0) goto L_0x0024
            r0 = 1
            goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            boolean r1 = r8.f42337c     // Catch:{ IOException -> 0x017e }
            if (r1 != 0) goto L_0x0038
            r1 = r18
            r3 = r12
            r5 = r14
            r12 = 1
            r7 = r0
            java.net.HttpURLConnection r0 = r1.m49028a(r2, r3, r5, r7)     // Catch:{ IOException -> 0x017e }
            r0.connect()     // Catch:{ IOException -> 0x017e }
            r11 = 1
            goto L_0x0075
        L_0x0038:
            r6 = r2
            r1 = 0
        L_0x003a:
            int r3 = r1 + 1
            r2 = 20
            if (r1 > r2) goto L_0x0161
            r1 = r18
            r2 = r6
            r16 = r3
            r3 = r12
            r17 = r6
            r10 = 0
            r5 = r14
            r11 = 1
            r7 = r0
            java.net.HttpURLConnection r1 = r1.m49028a(r2, r3, r5, r7)     // Catch:{ IOException -> 0x017e }
            r1.setInstanceFollowRedirects(r10)     // Catch:{ IOException -> 0x017e }
            r1.connect()     // Catch:{ IOException -> 0x017e }
            int r2 = r1.getResponseCode()     // Catch:{ IOException -> 0x017e }
            r3 = 300(0x12c, float:4.2E-43)
            if (r2 == r3) goto L_0x010e
            r3 = 301(0x12d, float:4.22E-43)
            if (r2 == r3) goto L_0x010e
            r3 = 302(0x12e, float:4.23E-43)
            if (r2 == r3) goto L_0x010e
            r3 = 303(0x12f, float:4.25E-43)
            if (r2 == r3) goto L_0x010e
            r3 = 307(0x133, float:4.3E-43)
            if (r2 == r3) goto L_0x010e
            r3 = 308(0x134, float:4.32E-43)
            if (r2 != r3) goto L_0x0074
            goto L_0x010e
        L_0x0074:
            r0 = r1
        L_0x0075:
            r8.f42345k = r0     // Catch:{ IOException -> 0x017e }
            java.net.HttpURLConnection r0 = r8.f42345k     // Catch:{ IOException -> 0x00e7 }
            int r0 = r0.getResponseCode()     // Catch:{ IOException -> 0x00e7 }
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 < r1) goto L_0x00d8
            r2 = 299(0x12b, float:4.19E-43)
            if (r0 > r2) goto L_0x00d8
            java.net.HttpURLConnection r2 = r8.f42345k
            r2.getContentType()
            if (r0 != r1) goto L_0x0097
            long r0 = r9.f42327c
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0099
            long r0 = r9.f42327c
            goto L_0x009a
        L_0x0097:
            r2 = 0
        L_0x0099:
            r0 = r2
        L_0x009a:
            r8.f42348n = r0
            int r0 = r9.f42330f
            r0 = r0 & r11
            if (r0 != 0) goto L_0x00bd
            java.net.HttpURLConnection r0 = r8.f42345k
            long r0 = m49027a(r0)
            long r2 = r9.f42328d
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x00b2
            long r4 = r9.f42328d
            goto L_0x00ba
        L_0x00b2:
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x00ba
            long r2 = r8.f42348n
            long r4 = r0 - r2
        L_0x00ba:
            r8.f42349o = r4
            goto L_0x00c1
        L_0x00bd:
            long r0 = r9.f42328d
            r8.f42349o = r0
        L_0x00c1:
            java.net.HttpURLConnection r0 = r8.f42345k     // Catch:{ IOException -> 0x00ce }
            java.io.InputStream r0 = com.google.android.gms.internal.ads.bjt.m49033a(r0)     // Catch:{ IOException -> 0x00ce }
            r8.f42346l = r0     // Catch:{ IOException -> 0x00ce }
            r8.f42347m = r11
            long r0 = r8.f42349o
            return r0
        L_0x00ce:
            r0 = move-exception
            r18.m49029b()
            com.google.android.gms.internal.ads.zzjw r1 = new com.google.android.gms.internal.ads.zzjw
            r1.<init>(r0, r9)
            throw r1
        L_0x00d8:
            java.net.HttpURLConnection r1 = r8.f42345k
            java.util.Map r1 = r1.getHeaderFields()
            r18.m49029b()
            com.google.android.gms.internal.ads.zzjx r2 = new com.google.android.gms.internal.ads.zzjx
            r2.<init>(r0, r1, r9)
            throw r2
        L_0x00e7:
            r0 = move-exception
            r18.m49029b()
            com.google.android.gms.internal.ads.zzjw r1 = new com.google.android.gms.internal.ads.zzjw
            java.lang.String r2 = "Unable to connect to "
            android.net.Uri r3 = r9.f42325a
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r4 = r3.length()
            if (r4 == 0) goto L_0x0104
            java.lang.String r2 = r2.concat(r3)
            goto L_0x010a
        L_0x0104:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r2)
            r2 = r3
        L_0x010a:
            r1.<init>(r2, r0, r9)
            throw r1
        L_0x010e:
            r2 = 0
            java.lang.String r4 = "Location"
            java.lang.String r4 = r1.getHeaderField(r4)     // Catch:{ IOException -> 0x017e }
            r1.disconnect()     // Catch:{ IOException -> 0x017e }
            if (r4 == 0) goto L_0x0159
            java.net.URL r6 = new java.net.URL     // Catch:{ IOException -> 0x017e }
            r1 = r17
            r6.<init>(r1, r4)     // Catch:{ IOException -> 0x017e }
            java.lang.String r1 = r6.getProtocol()     // Catch:{ IOException -> 0x017e }
            java.lang.String r4 = "https"
            boolean r4 = r4.equals(r1)     // Catch:{ IOException -> 0x017e }
            if (r4 != 0) goto L_0x0152
            java.lang.String r4 = "http"
            boolean r4 = r4.equals(r1)     // Catch:{ IOException -> 0x017e }
            if (r4 != 0) goto L_0x0152
            java.net.ProtocolException r0 = new java.net.ProtocolException     // Catch:{ IOException -> 0x017e }
            java.lang.String r2 = "Unsupported protocol redirect: "
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x017e }
            int r3 = r1.length()     // Catch:{ IOException -> 0x017e }
            if (r3 == 0) goto L_0x0149
            java.lang.String r1 = r2.concat(r1)     // Catch:{ IOException -> 0x017e }
            goto L_0x014e
        L_0x0149:
            java.lang.String r1 = new java.lang.String     // Catch:{ IOException -> 0x017e }
            r1.<init>(r2)     // Catch:{ IOException -> 0x017e }
        L_0x014e:
            r0.<init>(r1)     // Catch:{ IOException -> 0x017e }
            throw r0     // Catch:{ IOException -> 0x017e }
        L_0x0152:
            r10 = r2
            r1 = r16
            r5 = 0
            r7 = 1
            goto L_0x003a
        L_0x0159:
            java.net.ProtocolException r0 = new java.net.ProtocolException     // Catch:{ IOException -> 0x017e }
            java.lang.String r1 = "Null location redirect"
            r0.<init>(r1)     // Catch:{ IOException -> 0x017e }
            throw r0     // Catch:{ IOException -> 0x017e }
        L_0x0161:
            r16 = r3
            java.net.NoRouteToHostException r0 = new java.net.NoRouteToHostException     // Catch:{ IOException -> 0x017e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x017e }
            r2 = 31
            r1.<init>(r2)     // Catch:{ IOException -> 0x017e }
            java.lang.String r2 = "Too many redirects: "
            r1.append(r2)     // Catch:{ IOException -> 0x017e }
            r2 = r16
            r1.append(r2)     // Catch:{ IOException -> 0x017e }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x017e }
            r0.<init>(r1)     // Catch:{ IOException -> 0x017e }
            throw r0     // Catch:{ IOException -> 0x017e }
        L_0x017e:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzjw r1 = new com.google.android.gms.internal.ads.zzjw
            java.lang.String r2 = "Unable to connect to "
            android.net.Uri r3 = r9.f42325a
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r4 = r3.length()
            if (r4 == 0) goto L_0x0198
            java.lang.String r2 = r2.concat(r3)
            goto L_0x019e
        L_0x0198:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r2)
            r2 = r3
        L_0x019e:
            r1.<init>(r2, r0, r9)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bjs.mo39543a(com.google.android.gms.internal.ads.bjq):long");
    }

    /* renamed from: a */
    public final int mo39542a(byte[] bArr, int i, int i2) throws zzjw {
        try {
            if (this.f42350p != this.f42348n) {
                byte[] bArr2 = (byte[]) f42336b.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (this.f42350p != this.f42348n) {
                    int read = this.f42346l.read(bArr2, 0, (int) Math.min(this.f42348n - this.f42350p, (long) bArr2.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    } else if (read != -1) {
                        this.f42350p += (long) read;
                    } else {
                        throw new EOFException();
                    }
                }
                f42336b.set(bArr2);
            }
            if (this.f42349o != -1) {
                i2 = (int) Math.min((long) i2, this.f42349o - this.f42351q);
            }
            if (i2 == 0) {
                return -1;
            }
            int read2 = this.f42346l.read(bArr, i, i2);
            if (read2 == -1) {
                if (this.f42349o != -1) {
                    if (this.f42349o != this.f42351q) {
                        throw new EOFException();
                    }
                }
                return -1;
            }
            this.f42351q += (long) read2;
            return read2;
        } catch (IOException e) {
            throw new zzjw(e, this.f42344j);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:4|(1:6)(1:7)|8|(5:13|14|(2:16|(1:18))(1:19)|21|(1:25))|26|27|28|29|30) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0038, code lost:
        if (r2 > 2048) goto L_0x003a;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x006b */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo39544a() throws com.google.android.gms.internal.ads.zzjw {
        /*
            r9 = this;
            r0 = 0
            java.io.InputStream r1 = r9.f42346l     // Catch:{ all -> 0x0088 }
            if (r1 == 0) goto L_0x007d
            java.net.HttpURLConnection r1 = r9.f42345k     // Catch:{ all -> 0x0088 }
            long r2 = r9.f42349o     // Catch:{ all -> 0x0088 }
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0012
            long r2 = r9.f42349o     // Catch:{ all -> 0x0088 }
            goto L_0x0018
        L_0x0012:
            long r2 = r9.f42349o     // Catch:{ all -> 0x0088 }
            long r6 = r9.f42351q     // Catch:{ all -> 0x0088 }
            r8 = 0
            long r2 = r2 - r6
        L_0x0018:
            int r6 = com.google.android.gms.internal.ads.bkn.f42386a     // Catch:{ all -> 0x0088 }
            r7 = 19
            if (r6 == r7) goto L_0x0024
            int r6 = com.google.android.gms.internal.ads.bkn.f42386a     // Catch:{ all -> 0x0088 }
            r7 = 20
            if (r6 != r7) goto L_0x006b
        L_0x0024:
            java.io.InputStream r1 = com.google.android.gms.internal.ads.bjt.m49033a(r1)     // Catch:{ IOException | Exception -> 0x006b }
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0034
            int r2 = r1.read()     // Catch:{ IOException | Exception -> 0x006b }
            r3 = -1
            if (r2 != r3) goto L_0x003a
            goto L_0x006b
        L_0x0034:
            r4 = 2048(0x800, double:1.0118E-320)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x006b
        L_0x003a:
            java.lang.Class r2 = r1.getClass()     // Catch:{ IOException | Exception -> 0x006b }
            java.lang.String r2 = r2.getName()     // Catch:{ IOException | Exception -> 0x006b }
            java.lang.String r3 = "com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream"
            boolean r3 = r2.equals(r3)     // Catch:{ IOException | Exception -> 0x006b }
            if (r3 != 0) goto L_0x0052
            java.lang.String r3 = "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream"
            boolean r2 = r2.equals(r3)     // Catch:{ IOException | Exception -> 0x006b }
            if (r2 == 0) goto L_0x006b
        L_0x0052:
            java.lang.Class r2 = r1.getClass()     // Catch:{ IOException | Exception -> 0x006b }
            java.lang.Class r2 = r2.getSuperclass()     // Catch:{ IOException | Exception -> 0x006b }
            java.lang.String r3 = "unexpectedEndOfInput"
            java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch:{ IOException | Exception -> 0x006b }
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r4)     // Catch:{ IOException | Exception -> 0x006b }
            r3 = 1
            r2.setAccessible(r3)     // Catch:{ IOException | Exception -> 0x006b }
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ IOException | Exception -> 0x006b }
            r2.invoke(r1, r3)     // Catch:{ IOException | Exception -> 0x006b }
        L_0x006b:
            java.io.InputStream r1 = r9.f42346l     // Catch:{ IOException -> 0x0074 }
            r1.close()     // Catch:{ IOException -> 0x0074 }
            r1 = 0
            r9.f42346l = r1     // Catch:{ all -> 0x0088 }
            goto L_0x007d
        L_0x0074:
            r1 = move-exception
            com.google.android.gms.internal.ads.zzjw r2 = new com.google.android.gms.internal.ads.zzjw     // Catch:{ all -> 0x0088 }
            com.google.android.gms.internal.ads.bjq r3 = r9.f42344j     // Catch:{ all -> 0x0088 }
            r2.<init>(r1, r3)     // Catch:{ all -> 0x0088 }
            throw r2     // Catch:{ all -> 0x0088 }
        L_0x007d:
            boolean r1 = r9.f42347m
            if (r1 == 0) goto L_0x0087
            r9.f42347m = r0
            r9.m49029b()
            return
        L_0x0087:
            return
        L_0x0088:
            r1 = move-exception
            boolean r2 = r9.f42347m
            if (r2 == 0) goto L_0x0092
            r9.f42347m = r0
            r9.m49029b()
        L_0x0092:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bjs.mo39544a():void");
    }

    /* renamed from: a */
    private final HttpURLConnection m49028a(URL url, long j, long j2, boolean z) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f42338d);
        httpURLConnection.setReadTimeout(this.f42339e);
        httpURLConnection.setDoOutput(false);
        synchronized (this.f42342h) {
            for (Entry entry : this.f42342h.entrySet()) {
                bjt.m49034a(httpURLConnection, (String) entry.getKey(), (String) entry.getValue());
            }
        }
        if (!(j == 0 && j2 == -1)) {
            StringBuilder sb = new StringBuilder(27);
            sb.append("bytes=");
            sb.append(j);
            sb.append("-");
            String sb2 = sb.toString();
            if (j2 != -1) {
                String valueOf = String.valueOf(sb2);
                long j3 = (j + j2) - 1;
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 20);
                sb3.append(valueOf);
                sb3.append(j3);
                sb2 = sb3.toString();
            }
            bjt.m49034a(httpURLConnection, "Range", sb2);
        }
        bjt.m49034a(httpURLConnection, "User-Agent", this.f42340f);
        if (!z) {
            bjt.m49034a(httpURLConnection, "Accept-Encoding", "identity");
        }
        return httpURLConnection;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long m49027a(java.net.HttpURLConnection r6) {
        /*
            java.lang.String r0 = "Content-Length"
            java.lang.String r0 = r6.getHeaderField(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0011
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0011 }
            goto L_0x0013
        L_0x0011:
            r0 = -1
        L_0x0013:
            java.lang.String r2 = "Content-Range"
            java.lang.String r6 = r6.getHeaderField(r2)
            boolean r2 = android.text.TextUtils.isEmpty(r6)
            if (r2 != 0) goto L_0x0053
            java.util.regex.Pattern r2 = f42335a
            java.util.regex.Matcher r6 = r2.matcher(r6)
            boolean r2 = r6.find()
            if (r2 == 0) goto L_0x0053
            r2 = 2
            java.lang.String r2 = r6.group(r2)     // Catch:{ NumberFormatException -> 0x0053 }
            long r2 = java.lang.Long.parseLong(r2)     // Catch:{ NumberFormatException -> 0x0053 }
            r4 = 1
            java.lang.String r6 = r6.group(r4)     // Catch:{ NumberFormatException -> 0x0053 }
            long r4 = java.lang.Long.parseLong(r6)     // Catch:{ NumberFormatException -> 0x0053 }
            r6 = 0
            long r2 = r2 - r4
            r4 = 1
            long r2 = r2 + r4
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x004a
        L_0x0048:
            r0 = r2
            goto L_0x0053
        L_0x004a:
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x0053
            long r2 = java.lang.Math.max(r0, r2)     // Catch:{ NumberFormatException -> 0x0053 }
            goto L_0x0048
        L_0x0053:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bjs.m49027a(java.net.HttpURLConnection):long");
    }

    /* renamed from: b */
    private final void m49029b() {
        if (this.f42345k != null) {
            this.f42345k.disconnect();
            this.f42345k = null;
        }
    }
}
