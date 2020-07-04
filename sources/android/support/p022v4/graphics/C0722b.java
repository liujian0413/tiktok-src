package android.support.p022v4.graphics;

import android.graphics.Path;
import java.util.ArrayList;

/* renamed from: android.support.v4.graphics.b */
public final class C0722b {

    /* renamed from: android.support.v4.graphics.b$a */
    static class C0723a {

        /* renamed from: a */
        int f2725a;

        /* renamed from: b */
        boolean f2726b;

        C0723a() {
        }
    }

    /* renamed from: android.support.v4.graphics.b$b */
    public static class C0724b {

        /* renamed from: a */
        public char f2727a;

        /* renamed from: b */
        public float[] f2728b;

        C0724b(C0724b bVar) {
            this.f2727a = bVar.f2727a;
            this.f2728b = C0722b.m3074a(bVar.f2728b, 0, bVar.f2728b.length);
        }

        C0724b(char c, float[] fArr) {
            this.f2727a = c;
            this.f2728b = fArr;
        }

        /* renamed from: a */
        public static void m3082a(C0724b[] bVarArr, Path path) {
            float[] fArr = new float[6];
            char c = 'm';
            for (int i = 0; i < bVarArr.length; i++) {
                m3081a(path, fArr, c, bVarArr[i].f2727a, bVarArr[i].f2728b);
                c = bVarArr[i].f2727a;
            }
        }

        /* renamed from: a */
        public final void mo2883a(C0724b bVar, C0724b bVar2, float f) {
            for (int i = 0; i < bVar.f2728b.length; i++) {
                this.f2728b[i] = (bVar.f2728b[i] * (1.0f - f)) + (bVar2.f2728b[i] * f);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0056, code lost:
            r25 = r9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x014f, code lost:
            r2 = r0;
            r3 = r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x0232, code lost:
            r2 = r0;
            r3 = r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:0x02e6, code lost:
            r3 = r7;
            r2 = r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:89:0x02e8, code lost:
            r9 = r25 + r20;
            r0 = r30;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static void m3081a(android.graphics.Path r27, float[] r28, char r29, char r30, float[] r31) {
            /*
                r10 = r27
                r13 = r31
                r14 = 0
                r0 = r28[r14]
                r15 = 1
                r1 = r28[r15]
                r16 = 2
                r2 = r28[r16]
                r17 = 3
                r3 = r28[r17]
                r18 = 4
                r4 = r28[r18]
                r19 = 5
                r5 = r28[r19]
                switch(r30) {
                    case 65: goto L_0x0035;
                    case 67: goto L_0x0031;
                    case 72: goto L_0x002e;
                    case 76: goto L_0x001d;
                    case 77: goto L_0x001d;
                    case 81: goto L_0x002b;
                    case 83: goto L_0x002b;
                    case 84: goto L_0x001d;
                    case 86: goto L_0x002e;
                    case 90: goto L_0x0020;
                    case 97: goto L_0x0035;
                    case 99: goto L_0x0031;
                    case 104: goto L_0x002e;
                    case 108: goto L_0x001d;
                    case 109: goto L_0x001d;
                    case 113: goto L_0x002b;
                    case 115: goto L_0x002b;
                    case 116: goto L_0x001d;
                    case 118: goto L_0x002e;
                    case 122: goto L_0x0020;
                    default: goto L_0x001d;
                }
            L_0x001d:
                r20 = 2
                goto L_0x0038
            L_0x0020:
                r27.close()
                r10.moveTo(r4, r5)
                r0 = r4
                r2 = r0
                r1 = r5
                r3 = r1
                goto L_0x001d
            L_0x002b:
                r20 = 4
                goto L_0x0038
            L_0x002e:
                r20 = 1
                goto L_0x0038
            L_0x0031:
                r6 = 6
                r20 = 6
                goto L_0x0038
            L_0x0035:
                r6 = 7
                r20 = 7
            L_0x0038:
                r8 = r0
                r7 = r1
                r21 = r4
                r22 = r5
                r9 = 0
                r0 = r29
            L_0x0041:
                int r1 = r13.length
                if (r9 >= r1) goto L_0x02f0
                r1 = 81
                r5 = 116(0x74, float:1.63E-43)
                r6 = 115(0x73, float:1.61E-43)
                r15 = 113(0x71, float:1.58E-43)
                r14 = 99
                r23 = 1073741824(0x40000000, float:2.0)
                r4 = 0
                switch(r30) {
                    case 65: goto L_0x02a4;
                    case 67: goto L_0x0279;
                    case 72: goto L_0x026b;
                    case 76: goto L_0x0258;
                    case 77: goto L_0x0236;
                    case 81: goto L_0x0215;
                    case 83: goto L_0x01db;
                    case 84: goto L_0x01b2;
                    case 86: goto L_0x01a4;
                    case 97: goto L_0x0153;
                    case 99: goto L_0x0126;
                    case 104: goto L_0x011a;
                    case 108: goto L_0x0107;
                    case 109: goto L_0x00e5;
                    case 113: goto L_0x00c5;
                    case 115: goto L_0x008c;
                    case 116: goto L_0x0065;
                    case 118: goto L_0x005a;
                    default: goto L_0x0054;
                }
            L_0x0054:
                r12 = r7
                r11 = r8
            L_0x0056:
                r25 = r9
                goto L_0x02e8
            L_0x005a:
                int r0 = r9 + 0
                r1 = r13[r0]
                r10.rLineTo(r4, r1)
                r0 = r13[r0]
                float r7 = r7 + r0
                goto L_0x0056
            L_0x0065:
                if (r0 == r15) goto L_0x0072
                if (r0 == r5) goto L_0x0072
                if (r0 == r1) goto L_0x0072
                r1 = 84
                if (r0 != r1) goto L_0x0070
                goto L_0x0072
            L_0x0070:
                r0 = 0
                goto L_0x0076
            L_0x0072:
                float r4 = r8 - r2
                float r0 = r7 - r3
            L_0x0076:
                int r1 = r9 + 0
                r2 = r13[r1]
                int r3 = r9 + 1
                r5 = r13[r3]
                r10.rQuadTo(r4, r0, r2, r5)
                float r4 = r4 + r8
                float r0 = r0 + r7
                r1 = r13[r1]
                float r8 = r8 + r1
                r1 = r13[r3]
                float r7 = r7 + r1
                r3 = r0
                r2 = r4
                goto L_0x0056
            L_0x008c:
                if (r0 == r14) goto L_0x009c
                if (r0 == r6) goto L_0x009c
                r1 = 67
                if (r0 == r1) goto L_0x009c
                r1 = 83
                if (r0 != r1) goto L_0x0099
                goto L_0x009c
            L_0x0099:
                r1 = 0
                r2 = 0
                goto L_0x00a2
            L_0x009c:
                float r0 = r8 - r2
                float r1 = r7 - r3
                r2 = r1
                r1 = r0
            L_0x00a2:
                int r14 = r9 + 0
                r3 = r13[r14]
                int r15 = r9 + 1
                r4 = r13[r15]
                int r23 = r9 + 2
                r5 = r13[r23]
                int r24 = r9 + 3
                r6 = r13[r24]
                r0 = r27
                r0.rCubicTo(r1, r2, r3, r4, r5, r6)
                r0 = r13[r14]
                float r0 = r0 + r8
                r1 = r13[r15]
                float r1 = r1 + r7
                r2 = r13[r23]
                float r8 = r8 + r2
                r2 = r13[r24]
                float r7 = r7 + r2
                goto L_0x014f
            L_0x00c5:
                int r0 = r9 + 0
                r1 = r13[r0]
                int r2 = r9 + 1
                r3 = r13[r2]
                int r4 = r9 + 2
                r5 = r13[r4]
                int r6 = r9 + 3
                r14 = r13[r6]
                r10.rQuadTo(r1, r3, r5, r14)
                r0 = r13[r0]
                float r0 = r0 + r8
                r1 = r13[r2]
                float r1 = r1 + r7
                r2 = r13[r4]
                float r8 = r8 + r2
                r2 = r13[r6]
                float r7 = r7 + r2
                goto L_0x014f
            L_0x00e5:
                int r0 = r9 + 0
                r1 = r13[r0]
                float r8 = r8 + r1
                int r1 = r9 + 1
                r4 = r13[r1]
                float r7 = r7 + r4
                if (r9 <= 0) goto L_0x00fa
                r0 = r13[r0]
                r1 = r13[r1]
                r10.rLineTo(r0, r1)
                goto L_0x0056
            L_0x00fa:
                r0 = r13[r0]
                r1 = r13[r1]
                r10.rMoveTo(r0, r1)
                r22 = r7
                r21 = r8
                goto L_0x0056
            L_0x0107:
                int r0 = r9 + 0
                r1 = r13[r0]
                int r4 = r9 + 1
                r5 = r13[r4]
                r10.rLineTo(r1, r5)
                r0 = r13[r0]
                float r8 = r8 + r0
                r0 = r13[r4]
                float r7 = r7 + r0
                goto L_0x0056
            L_0x011a:
                int r0 = r9 + 0
                r1 = r13[r0]
                r10.rLineTo(r1, r4)
                r0 = r13[r0]
                float r8 = r8 + r0
                goto L_0x0056
            L_0x0126:
                int r0 = r9 + 0
                r1 = r13[r0]
                int r0 = r9 + 1
                r2 = r13[r0]
                int r14 = r9 + 2
                r3 = r13[r14]
                int r15 = r9 + 3
                r4 = r13[r15]
                int r23 = r9 + 4
                r5 = r13[r23]
                int r24 = r9 + 5
                r6 = r13[r24]
                r0 = r27
                r0.rCubicTo(r1, r2, r3, r4, r5, r6)
                r0 = r13[r14]
                float r0 = r0 + r8
                r1 = r13[r15]
                float r1 = r1 + r7
                r2 = r13[r23]
                float r8 = r8 + r2
                r2 = r13[r24]
                float r7 = r7 + r2
            L_0x014f:
                r2 = r0
                r3 = r1
                goto L_0x0056
            L_0x0153:
                int r14 = r9 + 5
                r0 = r13[r14]
                float r3 = r0 + r8
                int r15 = r9 + 6
                r0 = r13[r15]
                float r5 = r0 + r7
                int r0 = r9 + 0
                r6 = r13[r0]
                int r0 = r9 + 1
                r23 = r13[r0]
                int r0 = r9 + 2
                r24 = r13[r0]
                int r0 = r9 + 3
                r0 = r13[r0]
                int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r0 == 0) goto L_0x0176
                r25 = 1
                goto L_0x0178
            L_0x0176:
                r25 = 0
            L_0x0178:
                int r0 = r9 + 4
                r0 = r13[r0]
                int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r0 == 0) goto L_0x0183
                r26 = 1
                goto L_0x0185
            L_0x0183:
                r26 = 0
            L_0x0185:
                r0 = r27
                r1 = r8
                r2 = r7
                r4 = r5
                r5 = r6
                r6 = r23
                r12 = r7
                r7 = r24
                r11 = r8
                r8 = r25
                r25 = r9
                r9 = r26
                m3080a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
                r0 = r13[r14]
                float r8 = r11 + r0
                r0 = r13[r15]
                float r7 = r12 + r0
                goto L_0x02e6
            L_0x01a4:
                r11 = r8
                r25 = r9
                int r9 = r25 + 0
                r0 = r13[r9]
                r10.lineTo(r11, r0)
                r7 = r13[r9]
                goto L_0x02e8
            L_0x01b2:
                r12 = r7
                r11 = r8
                r25 = r9
                if (r0 == r15) goto L_0x01c0
                if (r0 == r5) goto L_0x01c0
                if (r0 == r1) goto L_0x01c0
                r1 = 84
                if (r0 != r1) goto L_0x01c8
            L_0x01c0:
                float r8 = r11 * r23
                float r8 = r8 - r2
                float r7 = r12 * r23
                float r7 = r7 - r3
                r12 = r7
                r11 = r8
            L_0x01c8:
                int r9 = r25 + 0
                r0 = r13[r9]
                int r1 = r25 + 1
                r2 = r13[r1]
                r10.quadTo(r11, r12, r0, r2)
                r8 = r13[r9]
                r7 = r13[r1]
                r2 = r11
                r3 = r12
                goto L_0x02e8
            L_0x01db:
                r12 = r7
                r11 = r8
                r25 = r9
                if (r0 == r14) goto L_0x01ef
                if (r0 == r6) goto L_0x01ef
                r1 = 67
                if (r0 == r1) goto L_0x01ef
                r1 = 83
                if (r0 != r1) goto L_0x01ec
                goto L_0x01ef
            L_0x01ec:
                r1 = r11
                r2 = r12
                goto L_0x01f7
            L_0x01ef:
                float r8 = r11 * r23
                float r8 = r8 - r2
                float r7 = r12 * r23
                float r7 = r7 - r3
                r2 = r7
                r1 = r8
            L_0x01f7:
                int r9 = r25 + 0
                r3 = r13[r9]
                int r7 = r25 + 1
                r4 = r13[r7]
                int r8 = r25 + 2
                r5 = r13[r8]
                int r11 = r25 + 3
                r6 = r13[r11]
                r0 = r27
                r0.cubicTo(r1, r2, r3, r4, r5, r6)
                r0 = r13[r9]
                r1 = r13[r7]
                r8 = r13[r8]
                r7 = r13[r11]
                goto L_0x0232
            L_0x0215:
                r25 = r9
                int r9 = r25 + 0
                r0 = r13[r9]
                int r1 = r25 + 1
                r2 = r13[r1]
                int r3 = r25 + 2
                r4 = r13[r3]
                int r5 = r25 + 3
                r6 = r13[r5]
                r10.quadTo(r0, r2, r4, r6)
                r0 = r13[r9]
                r1 = r13[r1]
                r8 = r13[r3]
                r7 = r13[r5]
            L_0x0232:
                r2 = r0
                r3 = r1
                goto L_0x02e8
            L_0x0236:
                r25 = r9
                int r9 = r25 + 0
                r8 = r13[r9]
                int r0 = r25 + 1
                r7 = r13[r0]
                if (r25 <= 0) goto L_0x024b
                r1 = r13[r9]
                r0 = r13[r0]
                r10.lineTo(r1, r0)
                goto L_0x02e8
            L_0x024b:
                r1 = r13[r9]
                r0 = r13[r0]
                r10.moveTo(r1, r0)
                r22 = r7
                r21 = r8
                goto L_0x02e8
            L_0x0258:
                r25 = r9
                int r9 = r25 + 0
                r0 = r13[r9]
                int r1 = r25 + 1
                r4 = r13[r1]
                r10.lineTo(r0, r4)
                r8 = r13[r9]
                r7 = r13[r1]
                goto L_0x02e8
            L_0x026b:
                r12 = r7
                r25 = r9
                int r9 = r25 + 0
                r0 = r13[r9]
                r10.lineTo(r0, r12)
                r8 = r13[r9]
                goto L_0x02e8
            L_0x0279:
                r25 = r9
                int r9 = r25 + 0
                r1 = r13[r9]
                int r9 = r25 + 1
                r2 = r13[r9]
                int r9 = r25 + 2
                r3 = r13[r9]
                int r7 = r25 + 3
                r4 = r13[r7]
                int r8 = r25 + 4
                r5 = r13[r8]
                int r11 = r25 + 5
                r6 = r13[r11]
                r0 = r27
                r0.cubicTo(r1, r2, r3, r4, r5, r6)
                r8 = r13[r8]
                r0 = r13[r11]
                r1 = r13[r9]
                r2 = r13[r7]
                r7 = r0
                r3 = r2
                r2 = r1
                goto L_0x02e8
            L_0x02a4:
                r12 = r7
                r11 = r8
                r25 = r9
                int r14 = r25 + 5
                r3 = r13[r14]
                int r15 = r25 + 6
                r5 = r13[r15]
                int r9 = r25 + 0
                r6 = r13[r9]
                int r9 = r25 + 1
                r7 = r13[r9]
                int r9 = r25 + 2
                r8 = r13[r9]
                int r9 = r25 + 3
                r0 = r13[r9]
                int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r0 == 0) goto L_0x02c6
                r9 = 1
                goto L_0x02c7
            L_0x02c6:
                r9 = 0
            L_0x02c7:
                int r0 = r25 + 4
                r0 = r13[r0]
                int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r0 == 0) goto L_0x02d2
                r23 = 1
                goto L_0x02d4
            L_0x02d2:
                r23 = 0
            L_0x02d4:
                r0 = r27
                r1 = r11
                r2 = r12
                r4 = r5
                r5 = r6
                r6 = r7
                r7 = r8
                r8 = r9
                r9 = r23
                m3080a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
                r8 = r13[r14]
                r7 = r13[r15]
            L_0x02e6:
                r3 = r7
                r2 = r8
            L_0x02e8:
                int r9 = r25 + r20
                r0 = r30
                r14 = 0
                r15 = 1
                goto L_0x0041
            L_0x02f0:
                r12 = r7
                r1 = 0
                r28[r1] = r8
                r1 = 1
                r28[r1] = r12
                r28[r16] = r2
                r28[r17] = r3
                r28[r18] = r21
                r28[r19] = r22
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p022v4.graphics.C0722b.C0724b.m3081a(android.graphics.Path, float[], char, char, float[]):void");
        }

        /* renamed from: a */
        private static void m3079a(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
            double d10 = d3;
            int ceil = (int) Math.ceil(Math.abs((d9 * 4.0d) / 3.141592653589793d));
            double cos = Math.cos(d7);
            double sin = Math.sin(d7);
            double cos2 = Math.cos(d8);
            double sin2 = Math.sin(d8);
            double d11 = -d10;
            double d12 = d11 * cos;
            double d13 = d4 * sin;
            double d14 = (d12 * sin2) - (d13 * cos2);
            double d15 = d11 * sin;
            double d16 = d4 * cos;
            double d17 = (sin2 * d15) + (cos2 * d16);
            double d18 = (double) ceil;
            Double.isNaN(d18);
            double d19 = d9 / d18;
            int i = 0;
            double d20 = d6;
            double d21 = d17;
            double d22 = d14;
            double d23 = d5;
            double d24 = d8;
            while (i < ceil) {
                double d25 = d24 + d19;
                double sin3 = Math.sin(d25);
                double cos3 = Math.cos(d25);
                double d26 = d19;
                double d27 = (d + ((d10 * cos) * cos3)) - (d13 * sin3);
                double d28 = d2 + (d10 * sin * cos3) + (d16 * sin3);
                double d29 = (d12 * sin3) - (d13 * cos3);
                double d30 = (sin3 * d15) + (cos3 * d16);
                double d31 = d25 - d24;
                double tan = Math.tan(d31 / 2.0d);
                double sin4 = (Math.sin(d31) * (Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d)) / 3.0d;
                double d32 = d16;
                double d33 = d23 + (d22 * sin4);
                double d34 = d15;
                double d35 = d20 + (d21 * sin4);
                int i2 = ceil;
                double d36 = cos;
                double d37 = d27 - (sin4 * d29);
                double d38 = d28 - (sin4 * d30);
                double d39 = sin;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) d33, (float) d35, (float) d37, (float) d38, (float) d27, (float) d28);
                i++;
                d20 = d28;
                d23 = d27;
                d24 = d25;
                d21 = d30;
                d22 = d29;
                d19 = d26;
                d16 = d32;
                d15 = d34;
                ceil = i2;
                cos = d36;
                sin = d39;
                d10 = d3;
            }
        }

        /* renamed from: a */
        private static void m3080a(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
            double d;
            double d2;
            boolean z3;
            float f8 = f;
            float f9 = f3;
            boolean z4 = z2;
            float f10 = f5;
            float f11 = f6;
            while (true) {
                double radians = Math.toRadians((double) f7);
                double cos = Math.cos(radians);
                double sin = Math.sin(radians);
                double d3 = (double) f8;
                Double.isNaN(d3);
                double d4 = d3 * cos;
                double d5 = d3;
                double d6 = (double) f2;
                Double.isNaN(d6);
                double d7 = d4 + (d6 * sin);
                double d8 = (double) f10;
                Double.isNaN(d8);
                double d9 = d7 / d8;
                double d10 = (double) (-f8);
                Double.isNaN(d10);
                double d11 = d10 * sin;
                Double.isNaN(d6);
                double d12 = d11 + (d6 * cos);
                double d13 = d6;
                double d14 = (double) f11;
                Double.isNaN(d14);
                double d15 = d12 / d14;
                float f12 = f10;
                float f13 = f11;
                double d16 = (double) f9;
                Double.isNaN(d16);
                double d17 = d16 * cos;
                double d18 = d15;
                double d19 = (double) f4;
                Double.isNaN(d19);
                double d20 = d17 + (d19 * sin);
                Double.isNaN(d8);
                double d21 = d20 / d8;
                double d22 = (double) (-f9);
                Double.isNaN(d22);
                double d23 = d22 * sin;
                Double.isNaN(d19);
                double d24 = d23 + (d19 * cos);
                Double.isNaN(d14);
                double d25 = d24 / d14;
                double d26 = d9 - d21;
                double d27 = d18 - d25;
                double d28 = (d9 + d21) / 2.0d;
                double d29 = (d18 + d25) / 2.0d;
                double d30 = (d26 * d26) + (d27 * d27);
                if (d30 != 0.0d) {
                    double d31 = (1.0d / d30) - 0.25d;
                    if (d31 < 0.0d) {
                        float sqrt = (float) (Math.sqrt(d30) / 1.99999d);
                        f10 = f12 * sqrt;
                        f11 = f13 * sqrt;
                        f8 = f;
                        f9 = f3;
                        boolean z5 = z2;
                    } else {
                        double sqrt2 = Math.sqrt(d31);
                        double d32 = d26 * sqrt2;
                        double d33 = sqrt2 * d27;
                        double d34 = d8;
                        boolean z6 = z2;
                        if (z == z6) {
                            d2 = d28 - d33;
                            d = d29 + d32;
                        } else {
                            d2 = d28 + d33;
                            d = d29 - d32;
                        }
                        double d35 = sin;
                        double atan2 = Math.atan2(d18 - d, d9 - d2);
                        double atan22 = Math.atan2(d25 - d, d21 - d2) - atan2;
                        if (atan22 >= 0.0d) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z6 != z3) {
                            if (atan22 > 0.0d) {
                                atan22 -= 6.283185307179586d;
                            } else {
                                atan22 += 6.283185307179586d;
                            }
                        }
                        Double.isNaN(d34);
                        double d36 = d2 * d34;
                        Double.isNaN(d14);
                        double d37 = d * d14;
                        m3079a(path, (d36 * cos) - (d37 * d35), (d36 * d35) + (d37 * cos), d34, d14, d5, d13, radians, atan2, atan22);
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public static Path m3070a(String str) {
        Path path = new Path();
        C0724b[] b = m3077b(str);
        if (b == null) {
            return null;
        }
        try {
            C0724b.m3082a(b, path);
            return path;
        } catch (RuntimeException e) {
            StringBuilder sb = new StringBuilder("Error in parsing ");
            sb.append(str);
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* renamed from: b */
    public static C0724b[] m3077b(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 0;
        while (i < str.length()) {
            int a = m3069a(str, i);
            String trim = str.substring(i2, a).trim();
            if (trim.length() > 0) {
                m3072a(arrayList, trim.charAt(0), m3078c(trim));
            }
            i2 = a;
            i = a + 1;
        }
        if (i - i2 == 1 && i2 < str.length()) {
            m3072a(arrayList, str.charAt(i2), new float[0]);
        }
        return (C0724b[]) arrayList.toArray(new C0724b[arrayList.size()]);
    }

    /* renamed from: c */
    private static float[] m3078c(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            C0723a aVar = new C0723a();
            int length = str.length();
            int i = 1;
            int i2 = 0;
            while (i < length) {
                m3071a(str, i, aVar);
                int i3 = aVar.f2725a;
                if (i < i3) {
                    int i4 = i2 + 1;
                    fArr[i2] = Float.parseFloat(str.substring(i, i3));
                    i2 = i4;
                }
                if (aVar.f2726b) {
                    i = i3;
                } else {
                    i = i3 + 1;
                }
            }
            return m3074a(fArr, 0, i2);
        } catch (NumberFormatException e) {
            StringBuilder sb = new StringBuilder("error in parsing \"");
            sb.append(str);
            sb.append("\"");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* renamed from: a */
    public static C0724b[] m3075a(C0724b[] bVarArr) {
        if (bVarArr == null) {
            return null;
        }
        C0724b[] bVarArr2 = new C0724b[bVarArr.length];
        for (int i = 0; i < bVarArr.length; i++) {
            bVarArr2[i] = new C0724b(bVarArr[i]);
        }
        return bVarArr2;
    }

    /* renamed from: a */
    private static int m3069a(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (((charAt - 'A') * (charAt - 'Z') <= 0 || (charAt - 'a') * (charAt - 'z') <= 0) && charAt != 'e' && charAt != 'E') {
                return i;
            }
            i++;
        }
        return i;
    }

    /* renamed from: b */
    public static void m3076b(C0724b[] bVarArr, C0724b[] bVarArr2) {
        for (int i = 0; i < bVarArr2.length; i++) {
            bVarArr[i].f2727a = bVarArr2[i].f2727a;
            for (int i2 = 0; i2 < bVarArr2[i].f2728b.length; i2++) {
                bVarArr[i].f2728b[i2] = bVarArr2[i].f2728b[i2];
            }
        }
    }

    /* renamed from: a */
    public static boolean m3073a(C0724b[] bVarArr, C0724b[] bVarArr2) {
        if (bVarArr == null || bVarArr2 == null || bVarArr.length != bVarArr2.length) {
            return false;
        }
        for (int i = 0; i < bVarArr.length; i++) {
            if (bVarArr[i].f2727a != bVarArr2[i].f2727a || bVarArr[i].f2728b.length != bVarArr2[i].f2728b.length) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static void m3072a(ArrayList<C0724b> arrayList, char c, float[] fArr) {
        arrayList.add(new C0724b(c, fArr));
    }

    /* renamed from: a */
    static float[] m3074a(float[] fArr, int i, int i2) {
        if (i2 >= 0) {
            int length = fArr.length;
            if (length >= 0) {
                int i3 = i2 - 0;
                int min = Math.min(i3, length - 0);
                float[] fArr2 = new float[i3];
                System.arraycopy(fArr, 0, fArr2, 0, min);
                return fArr2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        r2 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0039 A[LOOP:0: B:1:0x0007->B:20:0x0039, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x003c A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m3071a(java.lang.String r8, int r9, android.support.p022v4.graphics.C0722b.C0723a r10) {
        /*
            r0 = 0
            r10.f2726b = r0
            r1 = r9
            r2 = 0
            r3 = 0
            r4 = 0
        L_0x0007:
            int r5 = r8.length()
            if (r1 >= r5) goto L_0x003c
            char r5 = r8.charAt(r1)
            r6 = 32
            r7 = 1
            if (r5 == r6) goto L_0x0035
            r6 = 69
            if (r5 == r6) goto L_0x0033
            r6 = 101(0x65, float:1.42E-43)
            if (r5 == r6) goto L_0x0033
            switch(r5) {
                case 44: goto L_0x0035;
                case 45: goto L_0x002a;
                case 46: goto L_0x0022;
                default: goto L_0x0021;
            }
        L_0x0021:
            goto L_0x0031
        L_0x0022:
            if (r3 != 0) goto L_0x0027
            r2 = 0
            r3 = 1
            goto L_0x0037
        L_0x0027:
            r10.f2726b = r7
            goto L_0x0035
        L_0x002a:
            if (r1 == r9) goto L_0x0031
            if (r2 != 0) goto L_0x0031
            r10.f2726b = r7
            goto L_0x0035
        L_0x0031:
            r2 = 0
            goto L_0x0037
        L_0x0033:
            r2 = 1
            goto L_0x0037
        L_0x0035:
            r2 = 0
            r4 = 1
        L_0x0037:
            if (r4 != 0) goto L_0x003c
            int r1 = r1 + 1
            goto L_0x0007
        L_0x003c:
            r10.f2725a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p022v4.graphics.C0722b.m3071a(java.lang.String, int, android.support.v4.graphics.b$a):void");
    }
}
