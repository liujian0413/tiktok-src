package com.airbnb.lottie.p055c;

/* renamed from: com.airbnb.lottie.c.m */
final class C1730m {
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00ee  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.airbnb.lottie.model.content.C1808d m8289a(android.util.JsonReader r14, com.airbnb.lottie.C1757f r15) throws java.io.IOException {
        /*
            r0 = 0
            r2 = r0
            r3 = r2
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
        L_0x0008:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x00f4
            java.lang.String r0 = r14.nextName()
            int r1 = r0.hashCode()
            r9 = 101(0x65, float:1.42E-43)
            r10 = 0
            r11 = -1
            r12 = 1
            if (r1 == r9) goto L_0x0069
            r9 = 103(0x67, float:1.44E-43)
            if (r1 == r9) goto L_0x005f
            r9 = 111(0x6f, float:1.56E-43)
            if (r1 == r9) goto L_0x0055
            r9 = 3519(0xdbf, float:4.931E-42)
            if (r1 == r9) goto L_0x004b
            switch(r1) {
                case 114: goto L_0x0041;
                case 115: goto L_0x0037;
                case 116: goto L_0x002d;
                default: goto L_0x002c;
            }
        L_0x002c:
            goto L_0x0073
        L_0x002d:
            java.lang.String r1 = "t"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0073
            r0 = 3
            goto L_0x0074
        L_0x0037:
            java.lang.String r1 = "s"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0073
            r0 = 4
            goto L_0x0074
        L_0x0041:
            java.lang.String r1 = "r"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0073
            r0 = 6
            goto L_0x0074
        L_0x004b:
            java.lang.String r1 = "nm"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0073
            r0 = 0
            goto L_0x0074
        L_0x0055:
            java.lang.String r1 = "o"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0073
            r0 = 2
            goto L_0x0074
        L_0x005f:
            java.lang.String r1 = "g"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0073
            r0 = 1
            goto L_0x0074
        L_0x0069:
            java.lang.String r1 = "e"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0073
            r0 = 5
            goto L_0x0074
        L_0x0073:
            r0 = -1
        L_0x0074:
            switch(r0) {
                case 0: goto L_0x00ee;
                case 1: goto L_0x00a8;
                case 2: goto L_0x00a2;
                case 3: goto L_0x0094;
                case 4: goto L_0x008e;
                case 5: goto L_0x0088;
                case 6: goto L_0x007b;
                default: goto L_0x0077;
            }
        L_0x0077:
            r14.skipValue()
            goto L_0x0008
        L_0x007b:
            int r0 = r14.nextInt()
            if (r0 != r12) goto L_0x0085
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.WINDING
        L_0x0083:
            r4 = r0
            goto L_0x0008
        L_0x0085:
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.EVEN_ODD
            goto L_0x0083
        L_0x0088:
            com.airbnb.lottie.model.a.f r8 = com.airbnb.lottie.p055c.C1721d.m8270c(r14, r15)
            goto L_0x0008
        L_0x008e:
            com.airbnb.lottie.model.a.f r7 = com.airbnb.lottie.p055c.C1721d.m8270c(r14, r15)
            goto L_0x0008
        L_0x0094:
            int r0 = r14.nextInt()
            if (r0 != r12) goto L_0x009f
            com.airbnb.lottie.model.content.GradientType r0 = com.airbnb.lottie.model.content.GradientType.Linear
        L_0x009c:
            r3 = r0
            goto L_0x0008
        L_0x009f:
            com.airbnb.lottie.model.content.GradientType r0 = com.airbnb.lottie.model.content.GradientType.Radial
            goto L_0x009c
        L_0x00a2:
            com.airbnb.lottie.model.a.d r6 = com.airbnb.lottie.p055c.C1721d.m8269b(r14, r15)
            goto L_0x0008
        L_0x00a8:
            r14.beginObject()
            r0 = -1
        L_0x00ac:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L_0x00e9
            java.lang.String r1 = r14.nextName()
            int r9 = r1.hashCode()
            r13 = 107(0x6b, float:1.5E-43)
            if (r9 == r13) goto L_0x00cd
            r13 = 112(0x70, float:1.57E-43)
            if (r9 == r13) goto L_0x00c3
            goto L_0x00d7
        L_0x00c3:
            java.lang.String r9 = "p"
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x00d7
            r1 = 0
            goto L_0x00d8
        L_0x00cd:
            java.lang.String r9 = "k"
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x00d7
            r1 = 1
            goto L_0x00d8
        L_0x00d7:
            r1 = -1
        L_0x00d8:
            switch(r1) {
                case 0: goto L_0x00e4;
                case 1: goto L_0x00df;
                default: goto L_0x00db;
            }
        L_0x00db:
            r14.skipValue()
            goto L_0x00ac
        L_0x00df:
            com.airbnb.lottie.model.a.c r5 = com.airbnb.lottie.p055c.C1721d.m8266a(r14, r15, r0)
            goto L_0x00ac
        L_0x00e4:
            int r0 = r14.nextInt()
            goto L_0x00ac
        L_0x00e9:
            r14.endObject()
            goto L_0x0008
        L_0x00ee:
            java.lang.String r2 = r14.nextString()
            goto L_0x0008
        L_0x00f4:
            com.airbnb.lottie.model.content.d r14 = new com.airbnb.lottie.model.content.d
            r9 = 0
            r10 = 0
            r1 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p055c.C1730m.m8289a(android.util.JsonReader, com.airbnb.lottie.f):com.airbnb.lottie.model.content.d");
    }
}
