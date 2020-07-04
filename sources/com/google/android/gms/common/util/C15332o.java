package com.google.android.gms.common.util;

/* renamed from: com.google.android.gms.common.util.o */
public final class C15332o {
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x007e, code lost:
        return r6 ^ (r6 >>> 16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0051, code lost:
        r9 = r9 | ((r6[r7 + 1] & 255) << 8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x005a, code lost:
        r6 = ((r6[r7] & 255) | r9) * -862048943;
        r1 = r1 ^ (((r6 >>> 17) | (r6 << 15)) * 461845907);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0069, code lost:
        r6 = r1 ^ r8;
        r6 = (r6 ^ (r6 >>> 16)) * -2048144789;
        r6 = (r6 ^ (r6 >>> 13)) * -1028477387;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m44593a(byte[] r6, int r7, int r8, int r9) {
        /*
            r7 = r8 & -4
            r9 = 0
            int r7 = r7 + r9
            r0 = 0
            r1 = 0
        L_0x0006:
            r2 = 461845907(0x1b873593, float:2.2368498E-22)
            r3 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            if (r0 >= r7) goto L_0x0043
            byte r4 = r6[r0]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r5 = r0 + 1
            byte r5 = r6[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 8
            r4 = r4 | r5
            int r5 = r0 + 2
            byte r5 = r6[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 16
            r4 = r4 | r5
            int r5 = r0 + 3
            byte r5 = r6[r5]
            int r5 = r5 << 24
            r4 = r4 | r5
            int r4 = r4 * r3
            int r3 = r4 << 15
            int r4 = r4 >>> 17
            r3 = r3 | r4
            int r3 = r3 * r2
            r1 = r1 ^ r3
            int r2 = r1 << 13
            int r1 = r1 >>> 19
            r1 = r1 | r2
            int r1 = r1 * 5
            r2 = -430675100(0xffffffffe6546b64, float:-2.5078068E23)
            int r1 = r1 + r2
            int r0 = r0 + 4
            goto L_0x0006
        L_0x0043:
            r0 = r8 & 3
            switch(r0) {
                case 1: goto L_0x005a;
                case 2: goto L_0x0051;
                case 3: goto L_0x0049;
                default: goto L_0x0048;
            }
        L_0x0048:
            goto L_0x0069
        L_0x0049:
            int r9 = r7 + 2
            byte r9 = r6[r9]
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r9 = r9 << 16
        L_0x0051:
            int r0 = r7 + 1
            byte r0 = r6[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 8
            r9 = r9 | r0
        L_0x005a:
            byte r6 = r6[r7]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r6 = r6 | r9
            int r6 = r6 * r3
            int r7 = r6 << 15
            int r6 = r6 >>> 17
            r6 = r6 | r7
            int r6 = r6 * r2
            r1 = r1 ^ r6
        L_0x0069:
            r6 = r1 ^ r8
            int r7 = r6 >>> 16
            r6 = r6 ^ r7
            r7 = -2048144789(0xffffffff85ebca6b, float:-2.217365E-35)
            int r6 = r6 * r7
            int r7 = r6 >>> 13
            r6 = r6 ^ r7
            r7 = -1028477387(0xffffffffc2b2ae35, float:-89.34025)
            int r6 = r6 * r7
            int r7 = r6 >>> 16
            r6 = r6 ^ r7
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.C15332o.m44593a(byte[], int, int, int):int");
    }
}
