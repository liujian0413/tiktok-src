package com.p280ss.ttvideoengine.p1816i;

import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetProxyTimeoutExperiment;
import java.net.InetAddress;
import java.util.Arrays;

/* renamed from: com.ss.ttvideoengine.i.f */
public final class C46120f {

    /* renamed from: a */
    public long f118013a;

    /* renamed from: b */
    public long f118014b;

    /* renamed from: c */
    public long f118015c;

    /* renamed from: com.ss.ttvideoengine.i.f$a */
    static class C46121a extends Exception {
        public C46121a(String str) {
            super(str);
        }
    }

    /* renamed from: a */
    public final boolean mo112296a(String str, int i) {
        try {
            return m144521a(InetAddress.getByName(str), 123, (int) VideoCacheTTnetProxyTimeoutExperiment.DEFAULT);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r0v0, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r1v1, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r2v1, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r5v1, types: [byte] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long m144518a(byte[] r5, int r6) {
        /*
            byte r0 = r5[r6]
            int r1 = r6 + 1
            byte r1 = r5[r1]
            int r2 = r6 + 2
            byte r2 = r5[r2]
            int r6 = r6 + 3
            byte r5 = r5[r6]
            r6 = r0 & 128(0x80, float:1.794E-43)
            r3 = 128(0x80, float:1.794E-43)
            if (r6 != r3) goto L_0x0018
            r6 = r0 & 127(0x7f, float:1.78E-43)
            int r0 = r6 + 128
        L_0x0018:
            r6 = r1 & 128(0x80, float:1.794E-43)
            if (r6 != r3) goto L_0x0020
            r6 = r1 & 127(0x7f, float:1.78E-43)
            int r1 = r6 + 128
        L_0x0020:
            r6 = r2 & 128(0x80, float:1.794E-43)
            if (r6 != r3) goto L_0x0028
            r6 = r2 & 127(0x7f, float:1.78E-43)
            int r2 = r6 + 128
        L_0x0028:
            r6 = r5 & 128(0x80, float:1.794E-43)
            if (r6 != r3) goto L_0x002f
            r5 = r5 & 127(0x7f, float:1.78E-43)
            int r5 = r5 + r3
        L_0x002f:
            long r3 = (long) r0
            r6 = 24
            long r3 = r3 << r6
            long r0 = (long) r1
            r6 = 16
            long r0 = r0 << r6
            long r3 = r3 + r0
            long r0 = (long) r2
            r6 = 8
            long r0 = r0 << r6
            long r3 = r3 + r0
            long r5 = (long) r5
            long r3 = r3 + r5
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.ttvideoengine.p1816i.C46120f.m144518a(byte[], int):long");
    }

    /* renamed from: b */
    private long m144522b(byte[] bArr, int i) {
        long a = m144518a(bArr, i);
        long a2 = m144518a(bArr, i + 4);
        if (a == 0 && a2 == 0) {
            return 0;
        }
        return ((a - 2208988800L) * 1000) + ((a2 * 1000) / 4294967296L);
    }

    /* renamed from: a */
    private static void m144520a(byte[] bArr, int i, long j) {
        if (j == 0) {
            Arrays.fill(bArr, 40, 48, 0);
            return;
        }
        long j2 = j / 1000;
        long j3 = j - (j2 * 1000);
        long j4 = j2 + 2208988800L;
        bArr[40] = (byte) ((int) (j4 >> 24));
        bArr[41] = (byte) ((int) (j4 >> 16));
        bArr[42] = (byte) ((int) (j4 >> 8));
        bArr[43] = (byte) ((int) (j4 >> 0));
        long j5 = (j3 * 4294967296L) / 1000;
        bArr[44] = (byte) ((int) (j5 >> 24));
        bArr[45] = (byte) ((int) (j5 >> 16));
        bArr[46] = (byte) ((int) (j5 >> 8));
        bArr[47] = (byte) ((int) (Math.random() * 255.0d));
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b5  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m144521a(java.net.InetAddress r23, int r24, int r25) {
        /*
            r22 = this;
            r1 = r22
            r0 = 0
            r2 = 0
            java.net.DatagramSocket r3 = new java.net.DatagramSocket     // Catch:{ Exception -> 0x00b3, all -> 0x00aa }
            r3.<init>()     // Catch:{ Exception -> 0x00b3, all -> 0x00aa }
            r4 = r25
            r3.setSoTimeout(r4)     // Catch:{ Exception -> 0x00a5, all -> 0x00a1 }
            r2 = 48
            byte[] r4 = new byte[r2]     // Catch:{ Exception -> 0x00a5, all -> 0x00a1 }
            java.net.DatagramPacket r5 = new java.net.DatagramPacket     // Catch:{ Exception -> 0x00a5, all -> 0x00a1 }
            r6 = 123(0x7b, float:1.72E-43)
            r7 = r23
            r5.<init>(r4, r2, r7, r6)     // Catch:{ Exception -> 0x00a5, all -> 0x00a1 }
            r6 = 27
            r4[r0] = r6     // Catch:{ Exception -> 0x00a5, all -> 0x00a1 }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00a5, all -> 0x00a1 }
            long r8 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x00a5, all -> 0x00a1 }
            r10 = 40
            m144520a(r4, r10, r6)     // Catch:{ Exception -> 0x00a5, all -> 0x00a1 }
            r3.send(r5)     // Catch:{ Exception -> 0x00a5, all -> 0x00a1 }
            java.net.DatagramPacket r5 = new java.net.DatagramPacket     // Catch:{ Exception -> 0x00a5, all -> 0x00a1 }
            r5.<init>(r4, r2)     // Catch:{ Exception -> 0x00a5, all -> 0x00a1 }
            r3.receive(r5)     // Catch:{ Exception -> 0x00a5, all -> 0x00a1 }
            long r11 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x00a5, all -> 0x00a1 }
            r2 = 0
            long r8 = r11 - r8
            long r6 = r6 + r8
            byte r2 = r4[r0]     // Catch:{ Exception -> 0x00a5, all -> 0x00a1 }
            int r2 = r2 >> 6
            r2 = r2 & 3
            byte r2 = (byte) r2     // Catch:{ Exception -> 0x00a5, all -> 0x00a1 }
            byte r5 = r4[r0]     // Catch:{ Exception -> 0x00a5, all -> 0x00a1 }
            r5 = r5 & 7
            byte r5 = (byte) r5     // Catch:{ Exception -> 0x00a5, all -> 0x00a1 }
            r13 = 1
            byte r14 = r4[r13]     // Catch:{ Exception -> 0x00a5, all -> 0x00a1 }
            r14 = r14 & 255(0xff, float:3.57E-43)
            r15 = 24
            long r15 = r1.m144522b(r4, r15)     // Catch:{ Exception -> 0x00a5, all -> 0x00a1 }
            r0 = 32
            long r17 = r1.m144522b(r4, r0)     // Catch:{ Exception -> 0x00a5, all -> 0x00a1 }
            r19 = r3
            long r3 = r1.m144522b(r4, r10)     // Catch:{ Exception -> 0x00a7, all -> 0x009f }
            m144519a(r2, r5, r14, r3)     // Catch:{ Exception -> 0x00a7, all -> 0x009f }
            r0 = 0
            long r20 = r3 - r17
            long r8 = r8 - r20
            long r17 = r17 - r15
            long r3 = r3 - r6
            long r17 = r17 + r3
            r2 = 2
            long r2 = r17 / r2
            java.lang.String r0 = "SntpClient"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a7, all -> 0x009f }
            java.lang.String r5 = "requestTime round trip: "
            r4.<init>(r5)     // Catch:{ Exception -> 0x00a7, all -> 0x009f }
            r4.append(r8)     // Catch:{ Exception -> 0x00a7, all -> 0x009f }
            java.lang.String r5 = "ms, clock offset: "
            r4.append(r5)     // Catch:{ Exception -> 0x00a7, all -> 0x009f }
            r4.append(r2)     // Catch:{ Exception -> 0x00a7, all -> 0x009f }
            java.lang.String r5 = "ms"
            r4.append(r5)     // Catch:{ Exception -> 0x00a7, all -> 0x009f }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x00a7, all -> 0x009f }
            com.p280ss.ttvideoengine.p1816i.C46123h.m144545a(r0, r4)     // Catch:{ Exception -> 0x00a7, all -> 0x009f }
            r0 = 0
            long r6 = r6 + r2
            r1.f118013a = r6     // Catch:{ Exception -> 0x00a7, all -> 0x009f }
            r1.f118014b = r11     // Catch:{ Exception -> 0x00a7, all -> 0x009f }
            r1.f118015c = r8     // Catch:{ Exception -> 0x00a7, all -> 0x009f }
            r19.close()
            return r13
        L_0x009f:
            r0 = move-exception
            goto L_0x00ad
        L_0x00a1:
            r0 = move-exception
            r19 = r3
            goto L_0x00ad
        L_0x00a5:
            r19 = r3
        L_0x00a7:
            r2 = r19
            goto L_0x00b3
        L_0x00aa:
            r0 = move-exception
            r19 = r2
        L_0x00ad:
            if (r19 == 0) goto L_0x00b2
            r19.close()
        L_0x00b2:
            throw r0
        L_0x00b3:
            if (r2 == 0) goto L_0x00b8
            r2.close()
        L_0x00b8:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.ttvideoengine.p1816i.C46120f.m144521a(java.net.InetAddress, int, int):boolean");
    }

    /* renamed from: a */
    private static void m144519a(byte b, byte b2, int i, long j) throws C46121a {
        if (b == 3) {
            throw new C46121a("unsynchronized server");
        } else if (b2 != 4 && b2 != 5) {
            StringBuilder sb = new StringBuilder("untrusted mode: ");
            sb.append(b2);
            throw new C46121a(sb.toString());
        } else if (i == 0 || i > 15) {
            StringBuilder sb2 = new StringBuilder("untrusted stratum: ");
            sb2.append(i);
            throw new C46121a(sb2.toString());
        } else if (j == 0) {
            throw new C46121a("zero transmitTime");
        }
    }
}
