package com.bytedance.android.livesdk.utils.p425a;

import com.bytedance.android.live.core.p147c.C3166a;
import java.net.InetAddress;
import java.util.Arrays;

/* renamed from: com.bytedance.android.livesdk.utils.a.f */
final class C9028f {

    /* renamed from: a */
    public long f24692a;

    /* renamed from: b */
    public long f24693b;

    /* renamed from: c */
    public long f24694c;

    /* renamed from: com.bytedance.android.livesdk.utils.a.f$a */
    static class C9029a extends Exception {
        C9029a(String str) {
            super(str);
        }
    }

    C9028f() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo22228a(String str, int i) {
        try {
            return m26980a(InetAddress.getByName(str), 123, i);
        } catch (Exception e) {
            C3166a.m11966e("SntpClient", e.toString());
            return false;
        }
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r0v0, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r1v1, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r2v1, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r5v1, types: [byte] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long m26977a(byte[] r5, int r6) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.utils.p425a.C9028f.m26977a(byte[], int):long");
    }

    /* renamed from: b */
    private long m26981b(byte[] bArr, int i) {
        long a = m26977a(bArr, i);
        long a2 = m26977a(bArr, i + 4);
        if (a == 0 && a2 == 0) {
            return 0;
        }
        return ((a - 2208988800L) * 1000) + ((a2 * 1000) / 4294967296L);
    }

    /* renamed from: a */
    private static void m26979a(byte[] bArr, int i, long j) {
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

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0099  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m26980a(java.net.InetAddress r22, int r23, int r24) {
        /*
            r21 = this;
            r1 = r21
            r2 = 0
            r3 = 0
            java.net.DatagramSocket r4 = new java.net.DatagramSocket     // Catch:{ Exception -> 0x0086 }
            r4.<init>()     // Catch:{ Exception -> 0x0086 }
            r0 = r24
            r4.setSoTimeout(r0)     // Catch:{ Exception -> 0x0080, all -> 0x007e }
            r0 = 48
            byte[] r3 = new byte[r0]     // Catch:{ Exception -> 0x0080, all -> 0x007e }
            java.net.DatagramPacket r5 = new java.net.DatagramPacket     // Catch:{ Exception -> 0x0080, all -> 0x007e }
            r6 = 123(0x7b, float:1.72E-43)
            r7 = r22
            r5.<init>(r3, r0, r7, r6)     // Catch:{ Exception -> 0x0080, all -> 0x007e }
            r6 = 27
            r3[r2] = r6     // Catch:{ Exception -> 0x0080, all -> 0x007e }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0080, all -> 0x007e }
            long r8 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x0080, all -> 0x007e }
            r10 = 40
            m26979a(r3, r10, r6)     // Catch:{ Exception -> 0x0080, all -> 0x007e }
            r4.send(r5)     // Catch:{ Exception -> 0x0080, all -> 0x007e }
            java.net.DatagramPacket r5 = new java.net.DatagramPacket     // Catch:{ Exception -> 0x0080, all -> 0x007e }
            r5.<init>(r3, r0)     // Catch:{ Exception -> 0x0080, all -> 0x007e }
            r4.receive(r5)     // Catch:{ Exception -> 0x0080, all -> 0x007e }
            long r11 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x0080, all -> 0x007e }
            r0 = 0
            long r8 = r11 - r8
            long r6 = r6 + r8
            byte r0 = r3[r2]     // Catch:{ Exception -> 0x0080, all -> 0x007e }
            int r0 = r0 >> 6
            r0 = r0 & 3
            byte r0 = (byte) r0     // Catch:{ Exception -> 0x0080, all -> 0x007e }
            byte r5 = r3[r2]     // Catch:{ Exception -> 0x0080, all -> 0x007e }
            r5 = r5 & 7
            byte r5 = (byte) r5     // Catch:{ Exception -> 0x0080, all -> 0x007e }
            r13 = 1
            byte r14 = r3[r13]     // Catch:{ Exception -> 0x0080, all -> 0x007e }
            r14 = r14 & 255(0xff, float:3.57E-43)
            r15 = 24
            long r15 = r1.m26981b(r3, r15)     // Catch:{ Exception -> 0x0080, all -> 0x007e }
            r2 = 32
            long r17 = r1.m26981b(r3, r2)     // Catch:{ Exception -> 0x0080, all -> 0x007e }
            long r2 = r1.m26981b(r3, r10)     // Catch:{ Exception -> 0x0080, all -> 0x007e }
            m26978a(r0, r5, r14, r2)     // Catch:{ Exception -> 0x0080, all -> 0x007e }
            r0 = 0
            long r19 = r2 - r17
            long r8 = r8 - r19
            long r17 = r17 - r15
            long r2 = r2 - r6
            long r17 = r17 + r2
            r2 = 2
            long r17 = r17 / r2
            r0 = 0
            long r6 = r6 + r17
            r1.f24692a = r6     // Catch:{ Exception -> 0x0080, all -> 0x007e }
            r1.f24693b = r11     // Catch:{ Exception -> 0x0080, all -> 0x007e }
            r1.f24694c = r8     // Catch:{ Exception -> 0x0080, all -> 0x007e }
            r4.close()
            return r13
        L_0x007e:
            r0 = move-exception
            goto L_0x0097
        L_0x0080:
            r0 = move-exception
            r3 = r4
            goto L_0x0087
        L_0x0083:
            r0 = move-exception
            r4 = r3
            goto L_0x0097
        L_0x0086:
            r0 = move-exception
        L_0x0087:
            java.lang.String r2 = "SntpClient"
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0083 }
            com.bytedance.android.live.core.p147c.C3166a.m11966e(r2, r0)     // Catch:{ all -> 0x0083 }
            if (r3 == 0) goto L_0x0095
            r3.close()
        L_0x0095:
            r2 = 0
            return r2
        L_0x0097:
            if (r4 == 0) goto L_0x009c
            r4.close()
        L_0x009c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.utils.p425a.C9028f.m26980a(java.net.InetAddress, int, int):boolean");
    }

    /* renamed from: a */
    private static void m26978a(byte b, byte b2, int i, long j) throws C9029a {
        if (b == 3) {
            throw new C9029a("unsynchronized server");
        } else if (b2 != 4 && b2 != 5) {
            StringBuilder sb = new StringBuilder("untrusted mode: ");
            sb.append(b2);
            throw new C9029a(sb.toString());
        } else if (i == 0 || i > 15) {
            StringBuilder sb2 = new StringBuilder("untrusted stratum: ");
            sb2.append(i);
            throw new C9029a(sb2.toString());
        } else if (j == 0) {
            throw new C9029a("zero transmitTime");
        }
    }
}
