package com.p280ss.android.p817ad.splash.p836g;

import android.os.AsyncTask;
import com.p280ss.android.p817ad.splash.core.C19025f;
import com.p280ss.android.p817ad.splash.p824b.C18949a;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.g.i */
public final class C19131i extends AsyncTask<Void, Void, Void> {

    /* renamed from: a */
    private String f51721a;

    /* renamed from: b */
    private boolean f51722b;

    /* renamed from: c */
    private long f51723c;

    /* renamed from: d */
    private MessageDigest f51724d;

    /* renamed from: e */
    private long f51725e = -1;

    /* renamed from: f */
    private int f51726f;

    /* access modifiers changed from: protected */
    public final void onCancelled() {
        super.onCancelled();
    }

    /* access modifiers changed from: protected */
    public final void onPreExecute() {
        super.onPreExecute();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a6, code lost:
        if (r5 != null) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r5.disconnect();
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00af, code lost:
        r8 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r5.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b6, code lost:
        r8 = -1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a5 A[ExcHandler: all (r0v13 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:20:0x006d] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b2 A[SYNTHETIC, Splitter:B:36:0x00b2] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00e8  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.Void m62731a() {
        /*
            r14 = this;
            long r0 = java.lang.System.currentTimeMillis()
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r4 = r14.f51721a
            boolean r5 = r14.f51722b
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            r7 = 0
            if (r6 == 0) goto L_0x001a
            return r7
        L_0x001a:
            java.lang.String r6 = ":"
            java.lang.String[] r6 = r4.split(r6)
            r8 = 2
            r9 = 1
            r10 = 0
            int r11 = r6.length     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0067 }
            if (r11 != r8) goto L_0x0066
            r11 = r6[r10]     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0067 }
            r6 = r6[r9]     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0067 }
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0067 }
            java.lang.String r12 = "server_addr"
            r2.putOpt(r12, r4)     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0067 }
            java.lang.String r4 = "client_addr"
            java.lang.String r12 = com.p280ss.android.p817ad.splash.p836g.C19128g.m62685a()     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0067 }
            r2.putOpt(r4, r12)     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0067 }
            java.lang.String r4 = "from_bg"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0067 }
            r3.putOpt(r4, r5)     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0067 }
            java.net.InetAddress r4 = java.net.InetAddress.getByName(r11)     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0067 }
            java.net.DatagramSocket r5 = new java.net.DatagramSocket     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0067 }
            r5.<init>()     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0067 }
            byte[] r11 = r14.m62735b()     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0064 }
            if (r11 != 0) goto L_0x0055
            return r7
        L_0x0055:
            java.net.DatagramPacket r12 = new java.net.DatagramPacket     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0064 }
            int r13 = r11.length     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0064 }
            r12.<init>(r11, r13, r4, r6)     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0064 }
            r4 = 1000(0x3e8, float:1.401E-42)
            r5.setSoTimeout(r4)     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0064 }
            r5.send(r12)     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0064 }
            goto L_0x0068
        L_0x0064:
            goto L_0x0068
        L_0x0066:
            return r7
        L_0x0067:
            r5 = r7
        L_0x0068:
            r4 = -1
            if (r5 == 0) goto L_0x00c1
            r6 = 255(0xff, float:3.57E-43)
            byte[] r11 = new byte[r6]     // Catch:{ IOException -> 0x00b6, Throwable -> 0x00af, all -> 0x00a5 }
            java.net.DatagramPacket r12 = new java.net.DatagramPacket     // Catch:{ IOException -> 0x00b6, Throwable -> 0x00af, all -> 0x00a5 }
            r12.<init>(r11, r6)     // Catch:{ IOException -> 0x00b6, Throwable -> 0x00af, all -> 0x00a5 }
            r5.receive(r12)     // Catch:{ IOException -> 0x00b6, Throwable -> 0x00af, all -> 0x00a5 }
            boolean r6 = r14.m62733a(r11)     // Catch:{ IOException -> 0x00b6, Throwable -> 0x00af, all -> 0x00a5 }
            if (r6 == 0) goto L_0x007e
            goto L_0x007f
        L_0x007e:
            r8 = 1
        L_0x007f:
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x00b7, Throwable -> 0x00b0, all -> 0x00a5 }
            r13 = 0
            long r11 = r11 - r0
            r14.f51725e = r11     // Catch:{ IOException -> 0x00b7, Throwable -> 0x00b0, all -> 0x00a5 }
            java.lang.String r0 = "result"
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)     // Catch:{ IOException -> 0x00b7, Throwable -> 0x00b0, all -> 0x00a5 }
            r2.putOpt(r0, r1)     // Catch:{ IOException -> 0x00b7, Throwable -> 0x00b0, all -> 0x00a5 }
            java.lang.String r0 = "duration"
            long r11 = r14.f51725e     // Catch:{ IOException -> 0x00b7, Throwable -> 0x00b0, all -> 0x00a5 }
            java.lang.Long r1 = java.lang.Long.valueOf(r11)     // Catch:{ IOException -> 0x00b7, Throwable -> 0x00b0, all -> 0x00a5 }
            r3.putOpt(r0, r1)     // Catch:{ IOException -> 0x00b7, Throwable -> 0x00b0, all -> 0x00a5 }
            com.ss.android.ad.splash.b.a r0 = com.p280ss.android.p817ad.splash.p824b.C18949a.m61865a()     // Catch:{ IOException -> 0x00b7, Throwable -> 0x00b0, all -> 0x00a5 }
            java.lang.String r1 = "service_ad_udp_control"
            r0.mo50365b(r1, r9, r3, r2)     // Catch:{ IOException -> 0x00b7, Throwable -> 0x00b0, all -> 0x00a5 }
            goto L_0x00c3
        L_0x00a5:
            r0 = move-exception
            if (r5 == 0) goto L_0x00ae
            r5.disconnect()     // Catch:{ Throwable -> 0x00ae }
            r5.close()     // Catch:{ Throwable -> 0x00ae }
        L_0x00ae:
            throw r0
        L_0x00af:
            r8 = -1
        L_0x00b0:
            if (r5 == 0) goto L_0x00bf
            r5.disconnect()     // Catch:{ Throwable -> 0x00bf }
            goto L_0x00bc
        L_0x00b6:
            r8 = -1
        L_0x00b7:
            if (r5 == 0) goto L_0x00bf
            r5.disconnect()     // Catch:{ Throwable -> 0x00bf }
        L_0x00bc:
            r5.close()     // Catch:{ Throwable -> 0x00bf }
        L_0x00bf:
            r9 = 0
            goto L_0x00cd
        L_0x00c1:
            r8 = -1
            r9 = 0
        L_0x00c3:
            if (r5 == 0) goto L_0x00cd
            r5.disconnect()     // Catch:{ Throwable -> 0x00cc }
            r5.close()     // Catch:{ Throwable -> 0x00cc }
            goto L_0x00cd
        L_0x00cc:
        L_0x00cd:
            com.ss.android.ad.splash.core.v r0 = com.p280ss.android.p817ad.splash.core.C19063v.m62414a()
            java.util.concurrent.atomic.AtomicInteger r0 = r0.f51511c
            com.ss.android.ad.splash.core.v r1 = com.p280ss.android.p817ad.splash.core.C19063v.m62414a()
            java.util.concurrent.atomic.AtomicInteger r1 = r1.f51512d
            r1.getAndIncrement()
            if (r9 != 0) goto L_0x00e8
            com.ss.android.ad.splash.b.a r0 = com.p280ss.android.p817ad.splash.p824b.C18949a.m61865a()
            java.lang.String r5 = "service_ad_udp_control"
            r0.mo50365b(r5, r10, r3, r2)
            goto L_0x0118
        L_0x00e8:
            r0.getAndIncrement()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r3 = "ip_addr"
            java.lang.String r5 = r14.f51721a
            r2.put(r3, r5)
            java.lang.String r3 = "duration"
            long r5 = r14.f51725e
            java.lang.String r5 = java.lang.Long.toString(r5)
            r2.put(r3, r5)
            java.lang.String r3 = "rank"
            int r0 = r0.get()
            java.lang.String r0 = java.lang.Integer.toString(r0)
            r2.put(r3, r0)
            com.ss.android.ad.splash.core.v r0 = com.p280ss.android.p817ad.splash.core.C19063v.m62414a()
            java.util.List<java.util.Map<java.lang.String, java.lang.String>> r0 = r0.f51514f
            r0.add(r2)
        L_0x0118:
            com.ss.android.ad.splash.core.v r0 = com.p280ss.android.p817ad.splash.core.C19063v.m62414a()
            r0.mo50645a(r1)
            if (r9 == 0) goto L_0x013d
            com.ss.android.ad.splash.core.v r0 = com.p280ss.android.p817ad.splash.core.C19063v.m62414a()
            int r0 = r0.f51510b
            if (r0 != r4) goto L_0x013d
            com.ss.android.ad.splash.core.v r0 = com.p280ss.android.p817ad.splash.core.C19063v.m62414a()
            r0.mo50643a(r8)
            com.ss.android.ad.splash.core.v r0 = com.p280ss.android.p817ad.splash.core.C19063v.m62414a()
            long r1 = r14.f51725e
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.mo50644a(r1)
        L_0x013d:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.p817ad.splash.p836g.C19131i.m62731a():java.lang.Void");
    }

    /* renamed from: b */
    private final byte[] m62735b() throws Exception {
        int i;
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        int i2 = 2;
        byte[] array = ByteBuffer.allocate(4).putInt(2).array();
        byte[] bArr = new byte[4];
        new Random().nextBytes(bArr);
        byte[] array2 = ByteBuffer.allocate(4).putInt(this.f51726f).array();
        byte[] array3 = ByteBuffer.allocate(8).putLong(Long.valueOf(System.currentTimeMillis()).longValue()).array();
        long a = m62730a(new SecureRandom(), 1000000000, 9999999999L);
        if (a == -1) {
            return null;
        }
        this.f51723c = a;
        new StringBuilder("random number :").append(a);
        if (new Random().nextInt(2) == 0) {
            this.f51724d = MessageDigest.getInstance("SHA-256");
            i = 0;
        } else {
            this.f51724d = MessageDigest.getInstance("SHA-512");
            i2 = 3;
            i = 1;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(array);
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(bArr);
        byteArrayOutputStream.write(i2);
        byteArrayOutputStream.write(array2);
        byteArrayOutputStream.write(array3);
        byteArrayOutputStream.write(C19133k.m62740a(a));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        StringBuilder sb = new StringBuilder("packetToDigest: ");
        sb.append(C19133k.m62739a(byteArray));
        sb.append(" length: ");
        sb.append(byteArray.length);
        JSONObject jSONObject = new JSONObject();
        long currentTimeMillis = System.currentTimeMillis();
        byte[] digest = this.f51724d.digest(byteArray);
        jSONObject.putOpt("digest_duration", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        byteArrayOutputStream.write(digest);
        jSONObject.putOpt("generate_duration", Long.valueOf(System.currentTimeMillis() - valueOf.longValue()));
        C18949a.m61865a().mo50365b("service_udp_send_packet_duration", i, jSONObject, null);
        return byteArrayOutputStream.toByteArray();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void onProgressUpdate(Void... voidArr) {
        super.onProgressUpdate(voidArr);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Void doInBackground(Void... voidArr) {
        return m62731a();
    }

    /* renamed from: a */
    private final boolean m62733a(byte[] bArr) throws Exception {
        int i;
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[10];
        byte[] bArr4 = new byte[240];
        byte[] bArr5 = new byte[15];
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < 255; i5++) {
            if (i5 < 4) {
                bArr2[i5] = bArr[i5];
                i = i2 + 1;
                bArr5[i2] = bArr[i5];
            } else if (i5 == 4) {
                i = i2 + 1;
                bArr5[i2] = bArr[i5];
            } else {
                if (i5 < 15) {
                    int i6 = i3 + 1;
                    bArr3[i3] = bArr[i5];
                    int i7 = i2 + 1;
                    bArr5[i2] = bArr[i5];
                    i2 = i7;
                    i3 = i6;
                } else {
                    int i8 = i4 + 1;
                    bArr4[i4] = bArr[i5];
                    i4 = i8;
                }
            }
            i2 = i;
        }
        byte[] digest = this.f51724d.digest(bArr5);
        if (!Arrays.equals(digest, Arrays.copyOfRange(digest, 0, digest.length))) {
            return true;
        }
        String valueOf = String.valueOf(this.f51723c);
        int i9 = 0;
        for (int i10 = 0; i10 < valueOf.length(); i10++) {
            int numericValue = Character.getNumericValue(valueOf.charAt(i10));
            if (numericValue > 10) {
                return true;
            }
            i9 += bArr3[numericValue] & 255;
        }
        new StringBuilder("sum: ").append(i9);
        if (i9 % 10 > 4) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static long m62730a(Random random, long j, long j2) {
        return C19133k.m62738a(random, 8999999999L) + 1000000000;
    }

    public C19131i(String str, boolean z, int i) {
        if (i > 0) {
            this.f51726f = i;
        } else if (C19025f.m62159f() != null) {
            this.f51726f = Integer.parseInt(C19025f.m62159f().mo50356a());
        }
        this.f51721a = str;
        this.f51722b = z;
    }
}
