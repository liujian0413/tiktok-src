package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

public final class bri implements bre {

    /* renamed from: a */
    private static final Pattern f43329a = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: b */
    private static final AtomicReference<byte[]> f43330b = new AtomicReference<>();

    /* renamed from: c */
    private final boolean f43331c;

    /* renamed from: d */
    private final int f43332d;

    /* renamed from: e */
    private final int f43333e;

    /* renamed from: f */
    private final String f43334f;

    /* renamed from: g */
    private final bsc<String> f43335g = null;

    /* renamed from: h */
    private final brl f43336h;

    /* renamed from: i */
    private final brl f43337i;

    /* renamed from: j */
    private final brq<? super bri> f43338j;

    /* renamed from: k */
    private brg f43339k;

    /* renamed from: l */
    private HttpURLConnection f43340l;

    /* renamed from: m */
    private InputStream f43341m;

    /* renamed from: n */
    private boolean f43342n;

    /* renamed from: o */
    private long f43343o;

    /* renamed from: p */
    private long f43344p;

    /* renamed from: q */
    private long f43345q;

    /* renamed from: r */
    private long f43346r;

    public bri(String str, bsc<String> bsc, brq<? super bri> brq, int i, int i2, boolean z, brl brl) {
        this.f43334f = brr.m49870a(str);
        this.f43338j = brq;
        this.f43337i = new brl();
        this.f43332d = i;
        this.f43333e = i2;
        this.f43331c = true;
        this.f43336h = null;
    }

    /* renamed from: a */
    public final Uri mo39590a() {
        if (this.f43340l == null) {
            return null;
        }
        return Uri.parse(this.f43340l.getURL().toString());
    }

    /* renamed from: c */
    public final Map<String, List<String>> mo41199c() {
        if (this.f43340l == null) {
            return null;
        }
        return this.f43340l.getHeaderFields();
    }

    /* renamed from: a */
    public final long mo39589a(brg brg) throws zzsa {
        HttpURLConnection httpURLConnection;
        HttpURLConnection a;
        brg brg2 = brg;
        this.f43339k = brg2;
        long j = 0;
        this.f43346r = 0;
        this.f43345q = 0;
        try {
            URL url = new URL(brg2.f43314a.toString());
            byte[] bArr = brg2.f43315b;
            long j2 = brg2.f43317d;
            long j3 = brg2.f43318e;
            boolean a2 = brg2.mo41194a(1);
            if (!this.f43331c) {
                httpURLConnection = m49838a(url, bArr, j2, j3, a2, true);
            } else {
                URL url2 = url;
                byte[] bArr2 = bArr;
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    if (i <= 20) {
                        URL url3 = url2;
                        int i3 = i2;
                        long j4 = j3;
                        long j5 = j2;
                        a = m49838a(url2, bArr2, j2, j3, a2, false);
                        int responseCode = a.getResponseCode();
                        if (!(responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303)) {
                            if (bArr2 == null) {
                                if (responseCode != 307) {
                                    if (responseCode != 308) {
                                        break;
                                    }
                                }
                            } else {
                                break;
                            }
                        }
                        bArr2 = null;
                        String headerField = a.getHeaderField("Location");
                        a.disconnect();
                        if (headerField != null) {
                            url2 = new URL(url3, headerField);
                            String protocol = url2.getProtocol();
                            if (WebKitApi.SCHEME_HTTPS.equals(protocol) || WebKitApi.SCHEME_HTTP.equals(protocol)) {
                                i = i3;
                                j3 = j4;
                                j2 = j5;
                            } else {
                                String str = "Unsupported protocol redirect: ";
                                String valueOf = String.valueOf(protocol);
                                throw new ProtocolException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                            }
                        } else {
                            throw new ProtocolException("Null location redirect");
                        }
                    } else {
                        int i4 = i2;
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("Too many redirects: ");
                        sb.append(i4);
                        throw new NoRouteToHostException(sb.toString());
                    }
                }
                httpURLConnection = a;
            }
            this.f43340l = httpURLConnection;
            try {
                int responseCode2 = this.f43340l.getResponseCode();
                if (responseCode2 < 200 || responseCode2 > 299) {
                    Map headerFields = this.f43340l.getHeaderFields();
                    m49839d();
                    zzsb zzsb = new zzsb(responseCode2, headerFields, brg2);
                    if (responseCode2 == 416) {
                        zzsb.initCause(new zzrw(0));
                    }
                    throw zzsb;
                }
                this.f43340l.getContentType();
                if (responseCode2 == 200 && brg2.f43317d != 0) {
                    j = brg2.f43317d;
                }
                this.f43343o = j;
                if (!brg2.mo41194a(1)) {
                    long j6 = -1;
                    if (brg2.f43318e != -1) {
                        this.f43344p = brg2.f43318e;
                    } else {
                        long a3 = m49837a(this.f43340l);
                        if (a3 != -1) {
                            j6 = a3 - this.f43343o;
                        }
                        this.f43344p = j6;
                    }
                } else {
                    this.f43344p = brg2.f43318e;
                }
                try {
                    this.f43341m = brj.m49845a(this.f43340l);
                    this.f43342n = true;
                    if (this.f43338j != null) {
                        this.f43338j.mo39621a(this, brg2);
                    }
                    return this.f43344p;
                } catch (IOException e) {
                    m49839d();
                    throw new zzsa(e, brg2, 1);
                }
            } catch (IOException e2) {
                m49839d();
                String str2 = "Unable to connect to ";
                String valueOf2 = String.valueOf(brg2.f43314a.toString());
                throw new zzsa(valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2), e2, brg2, 1);
            }
        } catch (IOException e3) {
            String str3 = "Unable to connect to ";
            String valueOf3 = String.valueOf(brg2.f43314a.toString());
            throw new zzsa(valueOf3.length() != 0 ? str3.concat(valueOf3) : new String(str3), e3, brg2, 1);
        }
    }

    /* renamed from: a */
    public final int mo39588a(byte[] bArr, int i, int i2) throws zzsa {
        try {
            if (this.f43345q != this.f43343o) {
                byte[] bArr2 = (byte[]) f43330b.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (this.f43345q != this.f43343o) {
                    int read = this.f43341m.read(bArr2, 0, (int) Math.min(this.f43343o - this.f43345q, (long) bArr2.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    } else if (read != -1) {
                        this.f43345q += (long) read;
                        if (this.f43338j != null) {
                            this.f43338j.mo39620a(this, read);
                        }
                    } else {
                        throw new EOFException();
                    }
                }
                f43330b.set(bArr2);
            }
            if (i2 == 0) {
                return 0;
            }
            if (this.f43344p != -1) {
                long j = this.f43344p - this.f43346r;
                if (j == 0) {
                    return -1;
                }
                i2 = (int) Math.min((long) i2, j);
            }
            int read2 = this.f43341m.read(bArr, i, i2);
            if (read2 != -1) {
                this.f43346r += (long) read2;
                if (this.f43338j != null) {
                    this.f43338j.mo39620a(this, read2);
                }
                return read2;
            } else if (this.f43344p == -1) {
                return -1;
            } else {
                throw new EOFException();
            }
        } catch (IOException e) {
            throw new zzsa(e, this.f43339k, 2);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:4|(1:6)(1:7)|8|(5:13|14|(2:16|(1:18))(1:19)|21|(1:25))|26|27) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0039, code lost:
        if (r3 > 2048) goto L_0x003b;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x006c */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo39592b() throws com.google.android.gms.internal.ads.zzsa {
        /*
            r10 = this;
            r0 = 0
            r1 = 0
            java.io.InputStream r2 = r10.f43341m     // Catch:{ all -> 0x008d }
            if (r2 == 0) goto L_0x007c
            java.net.HttpURLConnection r2 = r10.f43340l     // Catch:{ all -> 0x008d }
            long r3 = r10.f43344p     // Catch:{ all -> 0x008d }
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0013
            long r3 = r10.f43344p     // Catch:{ all -> 0x008d }
            goto L_0x0019
        L_0x0013:
            long r3 = r10.f43344p     // Catch:{ all -> 0x008d }
            long r7 = r10.f43346r     // Catch:{ all -> 0x008d }
            r9 = 0
            long r3 = r3 - r7
        L_0x0019:
            int r7 = com.google.android.gms.internal.ads.bsf.f43399a     // Catch:{ all -> 0x008d }
            r8 = 19
            if (r7 == r8) goto L_0x0025
            int r7 = com.google.android.gms.internal.ads.bsf.f43399a     // Catch:{ all -> 0x008d }
            r8 = 20
            if (r7 != r8) goto L_0x006c
        L_0x0025:
            java.io.InputStream r2 = com.google.android.gms.internal.ads.brj.m49845a(r2)     // Catch:{ Exception -> 0x006c }
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0035
            int r3 = r2.read()     // Catch:{ Exception -> 0x006c }
            r4 = -1
            if (r3 != r4) goto L_0x003b
            goto L_0x006c
        L_0x0035:
            r5 = 2048(0x800, double:1.0118E-320)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x006c
        L_0x003b:
            java.lang.Class r3 = r2.getClass()     // Catch:{ Exception -> 0x006c }
            java.lang.String r3 = r3.getName()     // Catch:{ Exception -> 0x006c }
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream"
            boolean r4 = r3.equals(r4)     // Catch:{ Exception -> 0x006c }
            if (r4 != 0) goto L_0x0053
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream"
            boolean r3 = r3.equals(r4)     // Catch:{ Exception -> 0x006c }
            if (r3 == 0) goto L_0x006c
        L_0x0053:
            java.lang.Class r3 = r2.getClass()     // Catch:{ Exception -> 0x006c }
            java.lang.Class r3 = r3.getSuperclass()     // Catch:{ Exception -> 0x006c }
            java.lang.String r4 = "unexpectedEndOfInput"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x006c }
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch:{ Exception -> 0x006c }
            r4 = 1
            r3.setAccessible(r4)     // Catch:{ Exception -> 0x006c }
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x006c }
            r3.invoke(r2, r4)     // Catch:{ Exception -> 0x006c }
        L_0x006c:
            java.io.InputStream r2 = r10.f43341m     // Catch:{ IOException -> 0x0072 }
            r2.close()     // Catch:{ IOException -> 0x0072 }
            goto L_0x007c
        L_0x0072:
            r2 = move-exception
            com.google.android.gms.internal.ads.zzsa r3 = new com.google.android.gms.internal.ads.zzsa     // Catch:{ all -> 0x008d }
            com.google.android.gms.internal.ads.brg r4 = r10.f43339k     // Catch:{ all -> 0x008d }
            r5 = 3
            r3.<init>(r2, r4, r5)     // Catch:{ all -> 0x008d }
            throw r3     // Catch:{ all -> 0x008d }
        L_0x007c:
            r10.f43341m = r0
            r10.m49839d()
            boolean r0 = r10.f43342n
            if (r0 == 0) goto L_0x008c
            r10.f43342n = r1
            com.google.android.gms.internal.ads.brq<? super com.google.android.gms.internal.ads.bri> r0 = r10.f43338j
            if (r0 == 0) goto L_0x008c
            return
        L_0x008c:
            return
        L_0x008d:
            r2 = move-exception
            r10.f43341m = r0
            r10.m49839d()
            boolean r0 = r10.f43342n
            if (r0 == 0) goto L_0x0099
            r10.f43342n = r1
        L_0x0099:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bri.mo39592b():void");
    }

    /* renamed from: a */
    private final HttpURLConnection m49838a(URL url, byte[] bArr, long j, long j2, boolean z, boolean z2) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f43332d);
        httpURLConnection.setReadTimeout(this.f43333e);
        for (Entry entry : this.f43337i.mo41201a().entrySet()) {
            brj.m49846a(httpURLConnection, (String) entry.getKey(), (String) entry.getValue());
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
            brj.m49846a(httpURLConnection, "Range", sb2);
        }
        brj.m49846a(httpURLConnection, "User-Agent", this.f43334f);
        if (!z) {
            brj.m49846a(httpURLConnection, "Accept-Encoding", "identity");
        }
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        if (bArr != null) {
            httpURLConnection.setRequestMethod("POST");
            if (bArr.length != 0) {
                httpURLConnection.setFixedLengthStreamingMode(bArr.length);
                httpURLConnection.connect();
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(bArr);
                outputStream.close();
                return httpURLConnection;
            }
        }
        httpURLConnection.connect();
        return httpURLConnection;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long m49837a(java.net.HttpURLConnection r6) {
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
            java.util.regex.Pattern r2 = f43329a
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bri.m49837a(java.net.HttpURLConnection):long");
    }

    /* renamed from: d */
    private final void m49839d() {
        if (this.f43340l != null) {
            try {
                this.f43340l.disconnect();
            } catch (Exception unused) {
            }
            this.f43340l = null;
        }
    }
}
