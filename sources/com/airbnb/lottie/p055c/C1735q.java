package com.airbnb.lottie.p055c;

import android.support.p022v4.util.C0905l;
import android.util.JsonReader;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.airbnb.lottie.C1757f;
import com.airbnb.lottie.p057e.C1753a;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* renamed from: com.airbnb.lottie.c.q */
class C1735q {

    /* renamed from: a */
    private static final Interpolator f6281a = new LinearInterpolator();

    /* renamed from: b */
    private static C0905l<WeakReference<Interpolator>> f6282b;

    C1735q() {
    }

    /* renamed from: a */
    private static C0905l<WeakReference<Interpolator>> m8300a() {
        if (f6282b == null) {
            f6282b = new C0905l<>();
        }
        return f6282b;
    }

    /* renamed from: a */
    private static WeakReference<Interpolator> m8304a(int i) {
        WeakReference<Interpolator> weakReference;
        synchronized (C1735q.class) {
            weakReference = (WeakReference) m8300a().mo3433a(i);
        }
        return weakReference;
    }

    /* renamed from: a */
    private static void m8305a(int i, WeakReference<Interpolator> weakReference) {
        synchronized (C1735q.class) {
            f6282b.mo3437b(i, weakReference);
        }
    }

    /* renamed from: a */
    private static <T> C1753a<T> m8301a(JsonReader jsonReader, float f, C1718aj<T> ajVar) throws IOException {
        return new C1753a<>(ajVar.mo7163a(jsonReader, f));
    }

    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <T> com.airbnb.lottie.p057e.C1753a<T> m8303a(com.airbnb.lottie.C1757f r16, android.util.JsonReader r17, float r18, com.airbnb.lottie.p055c.C1718aj<T> r19) throws java.io.IOException {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            r17.beginObject()
            r4 = 0
            r5 = 0
            r6 = r4
            r7 = r6
            r8 = r7
            r9 = r8
            r13 = r9
            r14 = r13
            r5 = 0
            r11 = 0
        L_0x0013:
            boolean r10 = r17.hasNext()
            if (r10 == 0) goto L_0x00b2
            java.lang.String r10 = r17.nextName()
            r12 = -1
            int r15 = r10.hashCode()
            r3 = 1
            switch(r15) {
                case 101: goto L_0x006d;
                case 104: goto L_0x0063;
                case 105: goto L_0x0059;
                case 111: goto L_0x004f;
                case 115: goto L_0x0045;
                case 116: goto L_0x003b;
                case 3701: goto L_0x0031;
                case 3707: goto L_0x0027;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x0077
        L_0x0027:
            java.lang.String r15 = "to"
            boolean r10 = r10.equals(r15)
            if (r10 == 0) goto L_0x0077
            r10 = 6
            goto L_0x0078
        L_0x0031:
            java.lang.String r15 = "ti"
            boolean r10 = r10.equals(r15)
            if (r10 == 0) goto L_0x0077
            r10 = 7
            goto L_0x0078
        L_0x003b:
            java.lang.String r15 = "t"
            boolean r10 = r10.equals(r15)
            if (r10 == 0) goto L_0x0077
            r10 = 0
            goto L_0x0078
        L_0x0045:
            java.lang.String r15 = "s"
            boolean r10 = r10.equals(r15)
            if (r10 == 0) goto L_0x0077
            r10 = 1
            goto L_0x0078
        L_0x004f:
            java.lang.String r15 = "o"
            boolean r10 = r10.equals(r15)
            if (r10 == 0) goto L_0x0077
            r10 = 3
            goto L_0x0078
        L_0x0059:
            java.lang.String r15 = "i"
            boolean r10 = r10.equals(r15)
            if (r10 == 0) goto L_0x0077
            r10 = 4
            goto L_0x0078
        L_0x0063:
            java.lang.String r15 = "h"
            boolean r10 = r10.equals(r15)
            if (r10 == 0) goto L_0x0077
            r10 = 5
            goto L_0x0078
        L_0x006d:
            java.lang.String r15 = "e"
            boolean r10 = r10.equals(r15)
            if (r10 == 0) goto L_0x0077
            r10 = 2
            goto L_0x0078
        L_0x0077:
            r10 = -1
        L_0x0078:
            switch(r10) {
                case 0: goto L_0x00ab;
                case 1: goto L_0x00a5;
                case 2: goto L_0x009f;
                case 3: goto L_0x0099;
                case 4: goto L_0x0093;
                case 5: goto L_0x0089;
                case 6: goto L_0x0084;
                case 7: goto L_0x007f;
                default: goto L_0x007b;
            }
        L_0x007b:
            r17.skipValue()
            goto L_0x0013
        L_0x007f:
            android.graphics.PointF r14 = com.airbnb.lottie.p055c.C1733p.m8296b(r17, r18)
            goto L_0x0013
        L_0x0084:
            android.graphics.PointF r13 = com.airbnb.lottie.p055c.C1733p.m8296b(r17, r18)
            goto L_0x0013
        L_0x0089:
            int r5 = r17.nextInt()
            if (r5 != r3) goto L_0x0091
            r5 = 1
            goto L_0x0013
        L_0x0091:
            r5 = 0
            goto L_0x0013
        L_0x0093:
            android.graphics.PointF r7 = com.airbnb.lottie.p055c.C1733p.m8296b(r17, r18)
            goto L_0x0013
        L_0x0099:
            android.graphics.PointF r6 = com.airbnb.lottie.p055c.C1733p.m8296b(r17, r18)
            goto L_0x0013
        L_0x009f:
            java.lang.Object r9 = r2.mo7163a(r0, r1)
            goto L_0x0013
        L_0x00a5:
            java.lang.Object r8 = r2.mo7163a(r0, r1)
            goto L_0x0013
        L_0x00ab:
            double r10 = r17.nextDouble()
            float r11 = (float) r10
            goto L_0x0013
        L_0x00b2:
            r17.endObject()
            if (r5 == 0) goto L_0x00bc
            android.view.animation.Interpolator r0 = f6281a
            r10 = r0
            r9 = r8
            goto L_0x011f
        L_0x00bc:
            if (r6 == 0) goto L_0x011c
            if (r7 == 0) goto L_0x011c
            float r0 = r6.x
            float r2 = -r1
            float r0 = com.airbnb.lottie.p056d.C1750e.m8364b(r0, r2, r1)
            r6.x = r0
            float r0 = r6.y
            r3 = 1120403456(0x42c80000, float:100.0)
            r5 = -1027080192(0xffffffffc2c80000, float:-100.0)
            float r0 = com.airbnb.lottie.p056d.C1750e.m8364b(r0, r5, r3)
            r6.y = r0
            float r0 = r7.x
            float r0 = com.airbnb.lottie.p056d.C1750e.m8364b(r0, r2, r1)
            r7.x = r0
            float r0 = r7.y
            float r0 = com.airbnb.lottie.p056d.C1750e.m8364b(r0, r5, r3)
            r7.y = r0
            float r0 = r6.x
            float r2 = r6.y
            float r3 = r7.x
            float r5 = r7.y
            int r0 = com.airbnb.lottie.p056d.C1751f.m8369a(r0, r2, r3, r5)
            java.lang.ref.WeakReference r2 = m8304a(r0)
            if (r2 == 0) goto L_0x00fe
            java.lang.Object r3 = r2.get()
            r4 = r3
            android.view.animation.Interpolator r4 = (android.view.animation.Interpolator) r4
        L_0x00fe:
            if (r2 == 0) goto L_0x0102
            if (r4 != 0) goto L_0x011a
        L_0x0102:
            float r2 = r6.x
            float r2 = r2 / r1
            float r3 = r6.y
            float r3 = r3 / r1
            float r4 = r7.x
            float r4 = r4 / r1
            float r5 = r7.y
            float r5 = r5 / r1
            android.view.animation.Interpolator r4 = android.support.p022v4.view.animation.C0957c.m4073a(r2, r3, r4, r5)
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference     // Catch:{ ArrayIndexOutOfBoundsException -> 0x011a }
            r1.<init>(r4)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x011a }
            m8305a(r0, r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x011a }
        L_0x011a:
            r10 = r4
            goto L_0x011f
        L_0x011c:
            android.view.animation.Interpolator r0 = f6281a
            r10 = r0
        L_0x011f:
            com.airbnb.lottie.e.a r0 = new com.airbnb.lottie.e.a
            r12 = 0
            r6 = r0
            r7 = r16
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r0.f6316g = r13
            r0.f6317h = r14
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p055c.C1735q.m8303a(com.airbnb.lottie.f, android.util.JsonReader, float, com.airbnb.lottie.c.aj):com.airbnb.lottie.e.a");
    }

    /* renamed from: a */
    static <T> C1753a<T> m8302a(JsonReader jsonReader, C1757f fVar, float f, C1718aj<T> ajVar, boolean z) throws IOException {
        if (z) {
            return m8303a(fVar, jsonReader, f, ajVar);
        }
        return m8301a(jsonReader, f, ajVar);
    }
}
