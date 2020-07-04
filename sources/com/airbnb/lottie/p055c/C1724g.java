package com.airbnb.lottie.p055c;

/* renamed from: com.airbnb.lottie.c.g */
final class C1724g {
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b1, code lost:
        if (r2.equals("gs") != false) goto L_0x00dd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0041 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.airbnb.lottie.model.content.C1806b m8278a(android.util.JsonReader r9, com.airbnb.lottie.C1757f r10) throws java.io.IOException {
        /*
            r9.beginObject()
            r0 = 2
            r1 = 2
        L_0x0005:
            boolean r2 = r9.hasNext()
            r3 = 0
            r4 = 1
            r5 = -1
            r6 = 0
            if (r2 == 0) goto L_0x0046
            java.lang.String r2 = r9.nextName()
            int r7 = r2.hashCode()
            r8 = 100
            if (r7 == r8) goto L_0x002a
            r8 = 3717(0xe85, float:5.209E-42)
            if (r7 == r8) goto L_0x0020
            goto L_0x0034
        L_0x0020:
            java.lang.String r7 = "ty"
            boolean r2 = r2.equals(r7)
            if (r2 == 0) goto L_0x0034
            r2 = 0
            goto L_0x0035
        L_0x002a:
            java.lang.String r7 = "d"
            boolean r2 = r2.equals(r7)
            if (r2 == 0) goto L_0x0034
            r2 = 1
            goto L_0x0035
        L_0x0034:
            r2 = -1
        L_0x0035:
            switch(r2) {
                case 0: goto L_0x0041;
                case 1: goto L_0x003c;
                default: goto L_0x0038;
            }
        L_0x0038:
            r9.skipValue()
            goto L_0x0005
        L_0x003c:
            int r1 = r9.nextInt()
            goto L_0x0005
        L_0x0041:
            java.lang.String r2 = r9.nextString()
            goto L_0x0047
        L_0x0046:
            r2 = r6
        L_0x0047:
            if (r2 != 0) goto L_0x004a
            return r6
        L_0x004a:
            int r7 = r2.hashCode()
            switch(r7) {
                case 3239: goto L_0x00d2;
                case 3270: goto L_0x00c8;
                case 3295: goto L_0x00be;
                case 3307: goto L_0x00b4;
                case 3308: goto L_0x00ab;
                case 3488: goto L_0x00a0;
                case 3633: goto L_0x0095;
                case 3646: goto L_0x008a;
                case 3669: goto L_0x0080;
                case 3679: goto L_0x0075;
                case 3681: goto L_0x006a;
                case 3705: goto L_0x005e;
                case 3710: goto L_0x0053;
                default: goto L_0x0051;
            }
        L_0x0051:
            goto L_0x00dc
        L_0x0053:
            java.lang.String r0 = "tr"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00dc
            r0 = 5
            goto L_0x00dd
        L_0x005e:
            java.lang.String r0 = "tm"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00dc
            r0 = 9
            goto L_0x00dd
        L_0x006a:
            java.lang.String r0 = "st"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00dc
            r0 = 1
            goto L_0x00dd
        L_0x0075:
            java.lang.String r0 = "sr"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00dc
            r0 = 10
            goto L_0x00dd
        L_0x0080:
            java.lang.String r0 = "sh"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00dc
            r0 = 6
            goto L_0x00dd
        L_0x008a:
            java.lang.String r0 = "rp"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00dc
            r0 = 12
            goto L_0x00dd
        L_0x0095:
            java.lang.String r0 = "rc"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00dc
            r0 = 8
            goto L_0x00dd
        L_0x00a0:
            java.lang.String r0 = "mm"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00dc
            r0 = 11
            goto L_0x00dd
        L_0x00ab:
            java.lang.String r3 = "gs"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x00dc
            goto L_0x00dd
        L_0x00b4:
            java.lang.String r0 = "gr"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00dc
            r0 = 0
            goto L_0x00dd
        L_0x00be:
            java.lang.String r0 = "gf"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00dc
            r0 = 4
            goto L_0x00dd
        L_0x00c8:
            java.lang.String r0 = "fl"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00dc
            r0 = 3
            goto L_0x00dd
        L_0x00d2:
            java.lang.String r0 = "el"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00dc
            r0 = 7
            goto L_0x00dd
        L_0x00dc:
            r0 = -1
        L_0x00dd:
            switch(r0) {
                case 0: goto L_0x0122;
                case 1: goto L_0x011d;
                case 2: goto L_0x0118;
                case 3: goto L_0x0113;
                case 4: goto L_0x010e;
                case 5: goto L_0x0109;
                case 6: goto L_0x0104;
                case 7: goto L_0x00ff;
                case 8: goto L_0x00fa;
                case 9: goto L_0x00f5;
                case 10: goto L_0x00f0;
                case 11: goto L_0x00e6;
                case 12: goto L_0x00e1;
                default: goto L_0x00e0;
            }
        L_0x00e0:
            goto L_0x0126
        L_0x00e1:
            com.airbnb.lottie.model.content.g r6 = com.airbnb.lottie.p055c.C1710ab.m8250a(r9, r10)
            goto L_0x0126
        L_0x00e6:
            com.airbnb.lottie.model.content.MergePaths r6 = com.airbnb.lottie.p055c.C1740v.m8316a(r9)
            java.lang.String r0 = "Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove()."
            r10.mo7211a(r0)
            goto L_0x0126
        L_0x00f0:
            com.airbnb.lottie.model.content.PolystarShape r6 = com.airbnb.lottie.p055c.C1744z.m8322a(r9, r10)
            goto L_0x0126
        L_0x00f5:
            com.airbnb.lottie.model.content.ShapeTrimPath r6 = com.airbnb.lottie.p055c.C1717ai.m8259a(r9, r10)
            goto L_0x0126
        L_0x00fa:
            com.airbnb.lottie.model.content.f r6 = com.airbnb.lottie.p055c.C1709aa.m8249a(r9, r10)
            goto L_0x0126
        L_0x00ff:
            com.airbnb.lottie.model.content.a r6 = com.airbnb.lottie.p055c.C1722e.m8275a(r9, r10, r1)
            goto L_0x0126
        L_0x0104:
            com.airbnb.lottie.model.content.k r6 = com.airbnb.lottie.p055c.C1715ag.m8257a(r9, r10)
            goto L_0x0126
        L_0x0109:
            com.airbnb.lottie.model.a.l r6 = com.airbnb.lottie.p055c.C1720c.m8263a(r9, r10)
            goto L_0x0126
        L_0x010e:
            com.airbnb.lottie.model.content.d r6 = com.airbnb.lottie.p055c.C1730m.m8289a(r9, r10)
            goto L_0x0126
        L_0x0113:
            com.airbnb.lottie.model.content.i r6 = com.airbnb.lottie.p055c.C1713ae.m8255a(r9, r10)
            goto L_0x0126
        L_0x0118:
            com.airbnb.lottie.model.content.e r6 = com.airbnb.lottie.p055c.C1731n.m8290a(r9, r10)
            goto L_0x0126
        L_0x011d:
            com.airbnb.lottie.model.content.ShapeStroke r6 = com.airbnb.lottie.p055c.C1716ah.m8258a(r9, r10)
            goto L_0x0126
        L_0x0122:
            com.airbnb.lottie.model.content.j r6 = com.airbnb.lottie.p055c.C1714af.m8256a(r9, r10)
        L_0x0126:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0130
            r9.skipValue()
            goto L_0x0126
        L_0x0130:
            r9.endObject()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p055c.C1724g.m8278a(android.util.JsonReader, com.airbnb.lottie.f):com.airbnb.lottie.model.content.b");
    }
}
