package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.SocketException;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocketFactory;

@C6505uv
final class akb implements bre {

    /* renamed from: a */
    private static final Pattern f40462a = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: b */
    private static final AtomicReference<byte[]> f40463b = new AtomicReference<>();

    /* renamed from: c */
    private SSLSocketFactory f40464c = new akd(this);

    /* renamed from: d */
    private final int f40465d;

    /* renamed from: e */
    private final int f40466e;

    /* renamed from: f */
    private final String f40467f;

    /* renamed from: g */
    private final brl f40468g;

    /* renamed from: h */
    private final brq<? super akb> f40469h;

    /* renamed from: i */
    private brg f40470i;

    /* renamed from: j */
    private HttpURLConnection f40471j;

    /* renamed from: k */
    private InputStream f40472k;

    /* renamed from: l */
    private boolean f40473l;

    /* renamed from: m */
    private long f40474m;

    /* renamed from: n */
    private long f40475n;

    /* renamed from: o */
    private long f40476o;

    /* renamed from: p */
    private long f40477p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public int f40478q;

    /* renamed from: r */
    private Set<Socket> f40479r = new HashSet();

    akb(String str, brq<? super akb> brq, int i, int i2, int i3) {
        this.f40467f = brr.m49870a(str);
        this.f40469h = brq;
        this.f40468g = new brl();
        this.f40465d = i;
        this.f40466e = i2;
        this.f40478q = i3;
    }

    /* renamed from: a */
    public final Uri mo39590a() {
        if (this.f40471j == null) {
            return null;
        }
        return Uri.parse(this.f40471j.getURL().toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:119:0x0120 A[EDGE_INSN: B:119:0x0120->B:47:0x0120 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0116 A[Catch:{ IOException -> 0x0243 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x017b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo39589a(com.google.android.gms.internal.ads.brg r26) throws com.google.android.gms.internal.ads.zzsa {
        /*
            r25 = this;
            r1 = r25
            r2 = r26
            r1.f40470i = r2
            r3 = 0
            r1.f40477p = r3
            r1.f40476o = r3
            r5 = 1
            java.net.URL r0 = new java.net.URL     // Catch:{ IOException -> 0x0243 }
            android.net.Uri r6 = r2.f43314a     // Catch:{ IOException -> 0x0243 }
            java.lang.String r6 = r6.toString()     // Catch:{ IOException -> 0x0243 }
            r0.<init>(r6)     // Catch:{ IOException -> 0x0243 }
            byte[] r6 = r2.f43315b     // Catch:{ IOException -> 0x0243 }
            long r7 = r2.f43317d     // Catch:{ IOException -> 0x0243 }
            long r9 = r2.f43318e     // Catch:{ IOException -> 0x0243 }
            boolean r11 = r2.mo41194a(r5)     // Catch:{ IOException -> 0x0243 }
            r13 = r6
            r6 = r0
            r0 = 0
        L_0x0025:
            int r14 = r0 + 1
            r15 = 20
            if (r0 > r15) goto L_0x022a
            java.net.URLConnection r0 = r6.openConnection()     // Catch:{ IOException -> 0x0243 }
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ IOException -> 0x0243 }
            boolean r5 = r0 instanceof javax.net.ssl.HttpsURLConnection     // Catch:{ IOException -> 0x0243 }
            if (r5 == 0) goto L_0x003d
            r5 = r0
            javax.net.ssl.HttpsURLConnection r5 = (javax.net.ssl.HttpsURLConnection) r5     // Catch:{ IOException -> 0x0243 }
            javax.net.ssl.SSLSocketFactory r12 = r1.f40464c     // Catch:{ IOException -> 0x0243 }
            r5.setSSLSocketFactory(r12)     // Catch:{ IOException -> 0x0243 }
        L_0x003d:
            int r5 = r1.f40465d     // Catch:{ IOException -> 0x0243 }
            r0.setConnectTimeout(r5)     // Catch:{ IOException -> 0x0243 }
            int r5 = r1.f40466e     // Catch:{ IOException -> 0x0243 }
            r0.setReadTimeout(r5)     // Catch:{ IOException -> 0x0243 }
            com.google.android.gms.internal.ads.brl r5 = r1.f40468g     // Catch:{ IOException -> 0x0243 }
            java.util.Map r5 = r5.mo41201a()     // Catch:{ IOException -> 0x0243 }
            java.util.Set r5 = r5.entrySet()     // Catch:{ IOException -> 0x0243 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ IOException -> 0x0243 }
        L_0x0055:
            boolean r12 = r5.hasNext()     // Catch:{ IOException -> 0x0243 }
            if (r12 == 0) goto L_0x0075
            java.lang.Object r12 = r5.next()     // Catch:{ IOException -> 0x0243 }
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12     // Catch:{ IOException -> 0x0243 }
            java.lang.Object r16 = r12.getKey()     // Catch:{ IOException -> 0x0243 }
            r15 = r16
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ IOException -> 0x0243 }
            java.lang.Object r12 = r12.getValue()     // Catch:{ IOException -> 0x0243 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ IOException -> 0x0243 }
            com.google.android.gms.internal.ads.akc.m46180a(r0, r15, r12)     // Catch:{ IOException -> 0x0243 }
            r15 = 20
            goto L_0x0055
        L_0x0075:
            r17 = -1
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x007f
            int r5 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r5 == 0) goto L_0x00c5
        L_0x007f:
            r5 = 27
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0243 }
            r12.<init>(r5)     // Catch:{ IOException -> 0x0243 }
            java.lang.String r5 = "bytes="
            r12.append(r5)     // Catch:{ IOException -> 0x0243 }
            r12.append(r7)     // Catch:{ IOException -> 0x0243 }
            java.lang.String r5 = "-"
            r12.append(r5)     // Catch:{ IOException -> 0x0243 }
            java.lang.String r5 = r12.toString()     // Catch:{ IOException -> 0x0243 }
            int r12 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r12 == 0) goto L_0x00c0
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ IOException -> 0x0243 }
            r12 = 0
            long r19 = r7 + r9
            r21 = 1
            long r3 = r19 - r21
            java.lang.String r12 = java.lang.String.valueOf(r5)     // Catch:{ IOException -> 0x0243 }
            int r12 = r12.length()     // Catch:{ IOException -> 0x0243 }
            r15 = 20
            int r12 = r12 + r15
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0243 }
            r15.<init>(r12)     // Catch:{ IOException -> 0x0243 }
            r15.append(r5)     // Catch:{ IOException -> 0x0243 }
            r15.append(r3)     // Catch:{ IOException -> 0x0243 }
            java.lang.String r5 = r15.toString()     // Catch:{ IOException -> 0x0243 }
        L_0x00c0:
            java.lang.String r3 = "Range"
            com.google.android.gms.internal.ads.akc.m46180a(r0, r3, r5)     // Catch:{ IOException -> 0x0243 }
        L_0x00c5:
            java.lang.String r3 = "User-Agent"
            java.lang.String r4 = r1.f40467f     // Catch:{ IOException -> 0x0243 }
            com.google.android.gms.internal.ads.akc.m46180a(r0, r3, r4)     // Catch:{ IOException -> 0x0243 }
            if (r11 != 0) goto L_0x00d5
            java.lang.String r3 = "Accept-Encoding"
            java.lang.String r4 = "identity"
            com.google.android.gms.internal.ads.akc.m46180a(r0, r3, r4)     // Catch:{ IOException -> 0x0243 }
        L_0x00d5:
            r3 = 0
            r0.setInstanceFollowRedirects(r3)     // Catch:{ IOException -> 0x0243 }
            if (r13 == 0) goto L_0x00dd
            r3 = 1
            goto L_0x00de
        L_0x00dd:
            r3 = 0
        L_0x00de:
            r0.setDoOutput(r3)     // Catch:{ IOException -> 0x0243 }
            if (r13 == 0) goto L_0x00fd
            java.lang.String r3 = "POST"
            r0.setRequestMethod(r3)     // Catch:{ IOException -> 0x0243 }
            int r3 = r13.length     // Catch:{ IOException -> 0x0243 }
            if (r3 == 0) goto L_0x00fd
            int r3 = r13.length     // Catch:{ IOException -> 0x0243 }
            r0.setFixedLengthStreamingMode(r3)     // Catch:{ IOException -> 0x0243 }
            r0.connect()     // Catch:{ IOException -> 0x0243 }
            java.io.OutputStream r3 = r0.getOutputStream()     // Catch:{ IOException -> 0x0243 }
            r3.write(r13)     // Catch:{ IOException -> 0x0243 }
            r3.close()     // Catch:{ IOException -> 0x0243 }
            goto L_0x0100
        L_0x00fd:
            r0.connect()     // Catch:{ IOException -> 0x0243 }
        L_0x0100:
            int r3 = r0.getResponseCode()     // Catch:{ IOException -> 0x0243 }
            r4 = 300(0x12c, float:4.2E-43)
            if (r3 == r4) goto L_0x01d3
            r4 = 301(0x12d, float:4.22E-43)
            if (r3 == r4) goto L_0x01d3
            r4 = 302(0x12e, float:4.23E-43)
            if (r3 == r4) goto L_0x01d3
            r4 = 303(0x12f, float:4.25E-43)
            if (r3 == r4) goto L_0x01d3
            if (r13 != 0) goto L_0x0120
            r4 = 307(0x133, float:4.3E-43)
            if (r3 == r4) goto L_0x01d3
            r4 = 308(0x134, float:4.32E-43)
            if (r3 != r4) goto L_0x0120
            goto L_0x01d3
        L_0x0120:
            r1.f40471j = r0     // Catch:{ IOException -> 0x0243 }
            java.net.HttpURLConnection r0 = r1.f40471j     // Catch:{ IOException -> 0x01aa }
            int r0 = r0.getResponseCode()     // Catch:{ IOException -> 0x01aa }
            r3 = 200(0xc8, float:2.8E-43)
            if (r0 < r3) goto L_0x018e
            r4 = 299(0x12b, float:4.19E-43)
            if (r0 <= r4) goto L_0x0131
            goto L_0x018e
        L_0x0131:
            if (r0 != r3) goto L_0x013e
            long r3 = r2.f43317d
            r12 = 0
            int r0 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x0140
            long r3 = r2.f43317d
            goto L_0x0141
        L_0x013e:
            r12 = 0
        L_0x0140:
            r3 = r12
        L_0x0141:
            r1.f40474m = r3
            r3 = 1
            boolean r0 = r2.mo41194a(r3)
            if (r0 != 0) goto L_0x0168
            long r3 = r2.f43318e
            int r0 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r0 == 0) goto L_0x0155
            long r3 = r2.f43318e
            r1.f40475n = r3
            goto L_0x016c
        L_0x0155:
            java.net.HttpURLConnection r0 = r1.f40471j
            long r3 = m46170a(r0)
            int r0 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r0 == 0) goto L_0x0163
            long r5 = r1.f40474m
            long r17 = r3 - r5
        L_0x0163:
            r3 = r17
            r1.f40475n = r3
            goto L_0x016c
        L_0x0168:
            long r3 = r2.f43318e
            r1.f40475n = r3
        L_0x016c:
            java.net.HttpURLConnection r0 = r1.f40471j     // Catch:{ IOException -> 0x0183 }
            java.io.InputStream r0 = com.google.android.gms.internal.ads.akc.m46179a(r0)     // Catch:{ IOException -> 0x0183 }
            r1.f40472k = r0     // Catch:{ IOException -> 0x0183 }
            r3 = 1
            r1.f40473l = r3
            com.google.android.gms.internal.ads.brq<? super com.google.android.gms.internal.ads.akb> r0 = r1.f40469h
            if (r0 == 0) goto L_0x0180
            com.google.android.gms.internal.ads.brq<? super com.google.android.gms.internal.ads.akb> r0 = r1.f40469h
            r0.mo39621a(r1, r2)
        L_0x0180:
            long r2 = r1.f40475n
            return r2
        L_0x0183:
            r0 = move-exception
            r25.m46173c()
            com.google.android.gms.internal.ads.zzsa r3 = new com.google.android.gms.internal.ads.zzsa
            r4 = 1
            r3.<init>(r0, r2, r4)
            throw r3
        L_0x018e:
            java.net.HttpURLConnection r3 = r1.f40471j
            java.util.Map r3 = r3.getHeaderFields()
            r25.m46173c()
            com.google.android.gms.internal.ads.zzsb r4 = new com.google.android.gms.internal.ads.zzsb
            r4.<init>(r0, r3, r2)
            r2 = 416(0x1a0, float:5.83E-43)
            if (r0 != r2) goto L_0x01a9
            com.google.android.gms.internal.ads.zzrw r0 = new com.google.android.gms.internal.ads.zzrw
            r3 = 0
            r0.<init>(r3)
            r4.initCause(r0)
        L_0x01a9:
            throw r4
        L_0x01aa:
            r0 = move-exception
            r25.m46173c()
            com.google.android.gms.internal.ads.zzsa r3 = new com.google.android.gms.internal.ads.zzsa
            java.lang.String r4 = "Unable to connect to "
            android.net.Uri r5 = r2.f43314a
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r6 = r5.length()
            if (r6 == 0) goto L_0x01c8
            java.lang.String r4 = r4.concat(r5)
        L_0x01c6:
            r5 = 1
            goto L_0x01cf
        L_0x01c8:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r4)
            r4 = r5
            goto L_0x01c6
        L_0x01cf:
            r3.<init>(r4, r0, r2, r5)
            throw r3
        L_0x01d3:
            r3 = 0
            r12 = 0
            r4 = 0
            java.lang.String r5 = "Location"
            java.lang.String r5 = r0.getHeaderField(r5)     // Catch:{ IOException -> 0x0243 }
            r0.disconnect()     // Catch:{ IOException -> 0x0243 }
            if (r5 == 0) goto L_0x0222
            java.net.URL r0 = new java.net.URL     // Catch:{ IOException -> 0x0243 }
            r0.<init>(r6, r5)     // Catch:{ IOException -> 0x0243 }
            java.lang.String r5 = r0.getProtocol()     // Catch:{ IOException -> 0x0243 }
            java.lang.String r6 = "https"
            boolean r6 = r6.equals(r5)     // Catch:{ IOException -> 0x0243 }
            if (r6 != 0) goto L_0x0218
            java.lang.String r6 = "http"
            boolean r6 = r6.equals(r5)     // Catch:{ IOException -> 0x0243 }
            if (r6 != 0) goto L_0x0218
            java.net.ProtocolException r0 = new java.net.ProtocolException     // Catch:{ IOException -> 0x0243 }
            java.lang.String r3 = "Unsupported protocol redirect: "
            java.lang.String r4 = java.lang.String.valueOf(r5)     // Catch:{ IOException -> 0x0243 }
            int r5 = r4.length()     // Catch:{ IOException -> 0x0243 }
            if (r5 == 0) goto L_0x020e
            java.lang.String r3 = r3.concat(r4)     // Catch:{ IOException -> 0x0243 }
            goto L_0x0214
        L_0x020e:
            java.lang.String r4 = new java.lang.String     // Catch:{ IOException -> 0x0243 }
            r4.<init>(r3)     // Catch:{ IOException -> 0x0243 }
            r3 = r4
        L_0x0214:
            r0.<init>(r3)     // Catch:{ IOException -> 0x0243 }
            throw r0     // Catch:{ IOException -> 0x0243 }
        L_0x0218:
            r6 = r0
            r0 = r14
            r5 = 1
            r23 = r12
            r13 = r4
            r3 = r23
            goto L_0x0025
        L_0x0222:
            java.net.ProtocolException r0 = new java.net.ProtocolException     // Catch:{ IOException -> 0x0243 }
            java.lang.String r3 = "Null location redirect"
            r0.<init>(r3)     // Catch:{ IOException -> 0x0243 }
            throw r0     // Catch:{ IOException -> 0x0243 }
        L_0x022a:
            java.net.NoRouteToHostException r0 = new java.net.NoRouteToHostException     // Catch:{ IOException -> 0x0243 }
            r3 = 31
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0243 }
            r4.<init>(r3)     // Catch:{ IOException -> 0x0243 }
            java.lang.String r3 = "Too many redirects: "
            r4.append(r3)     // Catch:{ IOException -> 0x0243 }
            r4.append(r14)     // Catch:{ IOException -> 0x0243 }
            java.lang.String r3 = r4.toString()     // Catch:{ IOException -> 0x0243 }
            r0.<init>(r3)     // Catch:{ IOException -> 0x0243 }
            throw r0     // Catch:{ IOException -> 0x0243 }
        L_0x0243:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzsa r3 = new com.google.android.gms.internal.ads.zzsa
            java.lang.String r4 = "Unable to connect to "
            android.net.Uri r5 = r2.f43314a
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r6 = r5.length()
            if (r6 == 0) goto L_0x025e
            java.lang.String r4 = r4.concat(r5)
        L_0x025c:
            r5 = 1
            goto L_0x0265
        L_0x025e:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r4)
            r4 = r5
            goto L_0x025c
        L_0x0265:
            r3.<init>(r4, r0, r2, r5)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.akb.mo39589a(com.google.android.gms.internal.ads.brg):long");
    }

    /* renamed from: a */
    public final int mo39588a(byte[] bArr, int i, int i2) throws zzsa {
        try {
            if (this.f40476o != this.f40474m) {
                byte[] bArr2 = (byte[]) f40463b.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (this.f40476o != this.f40474m) {
                    int read = this.f40472k.read(bArr2, 0, (int) Math.min(this.f40474m - this.f40476o, (long) bArr2.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    } else if (read != -1) {
                        this.f40476o += (long) read;
                        if (this.f40469h != null) {
                            this.f40469h.mo39620a(this, read);
                        }
                    } else {
                        throw new EOFException();
                    }
                }
                f40463b.set(bArr2);
            }
            if (i2 == 0) {
                return 0;
            }
            if (this.f40475n != -1) {
                long j = this.f40475n - this.f40477p;
                if (j == 0) {
                    return -1;
                }
                i2 = (int) Math.min((long) i2, j);
            }
            int read2 = this.f40472k.read(bArr, i, i2);
            if (read2 != -1) {
                this.f40477p += (long) read2;
                if (this.f40469h != null) {
                    this.f40469h.mo39620a(this, read2);
                }
                return read2;
            } else if (this.f40475n == -1) {
                return -1;
            } else {
                throw new EOFException();
            }
        } catch (IOException e) {
            throw new zzsa(e, this.f40470i, 2);
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
            java.io.InputStream r2 = r10.f40472k     // Catch:{ all -> 0x008d }
            if (r2 == 0) goto L_0x007c
            java.net.HttpURLConnection r2 = r10.f40471j     // Catch:{ all -> 0x008d }
            long r3 = r10.f40475n     // Catch:{ all -> 0x008d }
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0013
            long r3 = r10.f40475n     // Catch:{ all -> 0x008d }
            goto L_0x0019
        L_0x0013:
            long r3 = r10.f40475n     // Catch:{ all -> 0x008d }
            long r7 = r10.f40477p     // Catch:{ all -> 0x008d }
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
            java.io.InputStream r2 = com.google.android.gms.internal.ads.akc.m46179a(r2)     // Catch:{ Exception -> 0x006c }
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
            java.io.InputStream r2 = r10.f40472k     // Catch:{ IOException -> 0x0072 }
            r2.close()     // Catch:{ IOException -> 0x0072 }
            goto L_0x007c
        L_0x0072:
            r2 = move-exception
            com.google.android.gms.internal.ads.zzsa r3 = new com.google.android.gms.internal.ads.zzsa     // Catch:{ all -> 0x008d }
            com.google.android.gms.internal.ads.brg r4 = r10.f40470i     // Catch:{ all -> 0x008d }
            r5 = 3
            r3.<init>(r2, r4, r5)     // Catch:{ all -> 0x008d }
            throw r3     // Catch:{ all -> 0x008d }
        L_0x007c:
            r10.f40472k = r0
            r10.m46173c()
            boolean r0 = r10.f40473l
            if (r0 == 0) goto L_0x0087
            r10.f40473l = r1
        L_0x0087:
            java.util.Set<java.net.Socket> r0 = r10.f40479r
            r0.clear()
            return
        L_0x008d:
            r2 = move-exception
            r10.f40472k = r0
            r10.m46173c()
            boolean r0 = r10.f40473l
            if (r0 == 0) goto L_0x0099
            r10.f40473l = r1
        L_0x0099:
            java.util.Set<java.net.Socket> r0 = r10.f40479r
            r0.clear()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.akb.mo39592b():void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo39591a(int i) {
        this.f40478q = i;
        for (Socket socket : this.f40479r) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.f40478q);
                } catch (SocketException e) {
                    acd.m45780c("Failed to update receive buffer size.", e);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m46172a(Socket socket) {
        this.f40479r.add(socket);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0042  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long m46170a(java.net.HttpURLConnection r8) {
        /*
            java.lang.String r0 = "Content-Length"
            java.lang.String r0 = r8.getHeaderField(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0034
            long r1 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0011 }
            goto L_0x0036
        L_0x0011:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            int r1 = r1 + 28
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "Unexpected Content-Length ["
            r2.append(r1)
            r2.append(r0)
            java.lang.String r1 = "]"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.google.android.gms.internal.ads.acd.m45779c(r1)
        L_0x0034:
            r1 = -1
        L_0x0036:
            java.lang.String r3 = "Content-Range"
            java.lang.String r8 = r8.getHeaderField(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r8)
            if (r3 != 0) goto L_0x00ce
            java.util.regex.Pattern r3 = f40462a
            java.util.regex.Matcher r3 = r3.matcher(r8)
            boolean r4 = r3.find()
            if (r4 == 0) goto L_0x00ce
            r4 = 2
            java.lang.String r4 = r3.group(r4)     // Catch:{ NumberFormatException -> 0x00ab }
            long r4 = java.lang.Long.parseLong(r4)     // Catch:{ NumberFormatException -> 0x00ab }
            r6 = 1
            java.lang.String r3 = r3.group(r6)     // Catch:{ NumberFormatException -> 0x00ab }
            long r6 = java.lang.Long.parseLong(r3)     // Catch:{ NumberFormatException -> 0x00ab }
            r3 = 0
            long r4 = r4 - r6
            r6 = 1
            long r4 = r4 + r6
            r6 = 0
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 >= 0) goto L_0x006d
            r1 = r4
            goto L_0x00ce
        L_0x006d:
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x00ce
            java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch:{ NumberFormatException -> 0x00ab }
            int r3 = r3.length()     // Catch:{ NumberFormatException -> 0x00ab }
            int r3 = r3 + 26
            java.lang.String r6 = java.lang.String.valueOf(r8)     // Catch:{ NumberFormatException -> 0x00ab }
            int r6 = r6.length()     // Catch:{ NumberFormatException -> 0x00ab }
            int r3 = r3 + r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x00ab }
            r6.<init>(r3)     // Catch:{ NumberFormatException -> 0x00ab }
            java.lang.String r3 = "Inconsistent headers ["
            r6.append(r3)     // Catch:{ NumberFormatException -> 0x00ab }
            r6.append(r0)     // Catch:{ NumberFormatException -> 0x00ab }
            java.lang.String r0 = "] ["
            r6.append(r0)     // Catch:{ NumberFormatException -> 0x00ab }
            r6.append(r8)     // Catch:{ NumberFormatException -> 0x00ab }
            java.lang.String r0 = "]"
            r6.append(r0)     // Catch:{ NumberFormatException -> 0x00ab }
            java.lang.String r0 = r6.toString()     // Catch:{ NumberFormatException -> 0x00ab }
            com.google.android.gms.internal.ads.acd.m45783e(r0)     // Catch:{ NumberFormatException -> 0x00ab }
            long r3 = java.lang.Math.max(r1, r4)     // Catch:{ NumberFormatException -> 0x00ab }
            r1 = r3
            goto L_0x00ce
        L_0x00ab:
            java.lang.String r0 = java.lang.String.valueOf(r8)
            int r0 = r0.length()
            int r0 = r0 + 27
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            java.lang.String r0 = "Unexpected Content-Range ["
            r3.append(r0)
            r3.append(r8)
            java.lang.String r8 = "]"
            r3.append(r8)
            java.lang.String r8 = r3.toString()
            com.google.android.gms.internal.ads.acd.m45779c(r8)
        L_0x00ce:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.akb.m46170a(java.net.HttpURLConnection):long");
    }

    /* renamed from: c */
    private final void m46173c() {
        if (this.f40471j != null) {
            try {
                this.f40471j.disconnect();
            } catch (Exception e) {
                acd.m45778b("Unexpected error while disconnecting", e);
            }
            this.f40471j = null;
        }
    }
}
