package com.airbnb.lottie.p055c;

import android.util.JsonReader;
import com.airbnb.lottie.model.content.C1812h;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.c.ad */
public final class C1712ad implements C1718aj<C1812h> {

    /* renamed from: a */
    public static final C1712ad f6274a = new C1712ad();

    private C1712ad() {
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo7163a(JsonReader jsonReader, float f) throws IOException {
        return m8253b(jsonReader, f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0013 A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.airbnb.lottie.model.content.C1812h m8253b(android.util.JsonReader r12, float r13) throws java.io.IOException {
        /*
            android.util.JsonToken r0 = r12.peek()
            android.util.JsonToken r1 = android.util.JsonToken.BEGIN_ARRAY
            if (r0 != r1) goto L_0x000b
            r12.beginArray()
        L_0x000b:
            r12.beginObject()
            r0 = 0
            r1 = 0
            r2 = r0
            r3 = r2
            r4 = 0
        L_0x0013:
            boolean r5 = r12.hasNext()
            r6 = 1
            if (r5 == 0) goto L_0x0075
            java.lang.String r5 = r12.nextName()
            r7 = -1
            int r8 = r5.hashCode()
            r9 = 99
            if (r8 == r9) goto L_0x0052
            r9 = 105(0x69, float:1.47E-43)
            if (r8 == r9) goto L_0x0048
            r9 = 111(0x6f, float:1.56E-43)
            if (r8 == r9) goto L_0x003e
            r9 = 118(0x76, float:1.65E-43)
            if (r8 == r9) goto L_0x0034
            goto L_0x005c
        L_0x0034:
            java.lang.String r8 = "v"
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L_0x005c
            r5 = 1
            goto L_0x005d
        L_0x003e:
            java.lang.String r6 = "o"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x005c
            r5 = 3
            goto L_0x005d
        L_0x0048:
            java.lang.String r6 = "i"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x005c
            r5 = 2
            goto L_0x005d
        L_0x0052:
            java.lang.String r6 = "c"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x005c
            r5 = 0
            goto L_0x005d
        L_0x005c:
            r5 = -1
        L_0x005d:
            switch(r5) {
                case 0: goto L_0x0070;
                case 1: goto L_0x006b;
                case 2: goto L_0x0066;
                case 3: goto L_0x0061;
                default: goto L_0x0060;
            }
        L_0x0060:
            goto L_0x0013
        L_0x0061:
            java.util.List r3 = com.airbnb.lottie.p055c.C1733p.m8294a(r12, r13)
            goto L_0x0013
        L_0x0066:
            java.util.List r2 = com.airbnb.lottie.p055c.C1733p.m8294a(r12, r13)
            goto L_0x0013
        L_0x006b:
            java.util.List r0 = com.airbnb.lottie.p055c.C1733p.m8294a(r12, r13)
            goto L_0x0013
        L_0x0070:
            boolean r4 = r12.nextBoolean()
            goto L_0x0013
        L_0x0075:
            r12.endObject()
            android.util.JsonToken r13 = r12.peek()
            android.util.JsonToken r5 = android.util.JsonToken.END_ARRAY
            if (r13 != r5) goto L_0x0083
            r12.endArray()
        L_0x0083:
            if (r0 == 0) goto L_0x010e
            if (r2 == 0) goto L_0x010e
            if (r3 == 0) goto L_0x010e
            boolean r12 = r0.isEmpty()
            if (r12 == 0) goto L_0x009e
            com.airbnb.lottie.model.content.h r12 = new com.airbnb.lottie.model.content.h
            android.graphics.PointF r13 = new android.graphics.PointF
            r13.<init>()
            java.util.List r0 = java.util.Collections.emptyList()
            r12.<init>(r13, r1, r0)
            return r12
        L_0x009e:
            int r12 = r0.size()
            java.lang.Object r13 = r0.get(r1)
            android.graphics.PointF r13 = (android.graphics.PointF) r13
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r12)
            r7 = 1
        L_0x00ae:
            if (r7 >= r12) goto L_0x00dd
            java.lang.Object r8 = r0.get(r7)
            android.graphics.PointF r8 = (android.graphics.PointF) r8
            int r9 = r7 + -1
            java.lang.Object r10 = r0.get(r9)
            android.graphics.PointF r10 = (android.graphics.PointF) r10
            java.lang.Object r9 = r3.get(r9)
            android.graphics.PointF r9 = (android.graphics.PointF) r9
            java.lang.Object r11 = r2.get(r7)
            android.graphics.PointF r11 = (android.graphics.PointF) r11
            android.graphics.PointF r9 = com.airbnb.lottie.p056d.C1750e.m8361a(r10, r9)
            android.graphics.PointF r10 = com.airbnb.lottie.p056d.C1750e.m8361a(r8, r11)
            com.airbnb.lottie.model.a r11 = new com.airbnb.lottie.model.a
            r11.<init>(r9, r10, r8)
            r5.add(r11)
            int r7 = r7 + 1
            goto L_0x00ae
        L_0x00dd:
            if (r4 == 0) goto L_0x0108
            java.lang.Object r7 = r0.get(r1)
            android.graphics.PointF r7 = (android.graphics.PointF) r7
            int r12 = r12 - r6
            java.lang.Object r0 = r0.get(r12)
            android.graphics.PointF r0 = (android.graphics.PointF) r0
            java.lang.Object r12 = r3.get(r12)
            android.graphics.PointF r12 = (android.graphics.PointF) r12
            java.lang.Object r1 = r2.get(r1)
            android.graphics.PointF r1 = (android.graphics.PointF) r1
            android.graphics.PointF r12 = com.airbnb.lottie.p056d.C1750e.m8361a(r0, r12)
            android.graphics.PointF r0 = com.airbnb.lottie.p056d.C1750e.m8361a(r7, r1)
            com.airbnb.lottie.model.a r1 = new com.airbnb.lottie.model.a
            r1.<init>(r12, r0, r7)
            r5.add(r1)
        L_0x0108:
            com.airbnb.lottie.model.content.h r12 = new com.airbnb.lottie.model.content.h
            r12.<init>(r13, r4, r5)
            return r12
        L_0x010e:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "Shape data was missing information."
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p055c.C1712ad.m8253b(android.util.JsonReader, float):com.airbnb.lottie.model.content.h");
    }
}
