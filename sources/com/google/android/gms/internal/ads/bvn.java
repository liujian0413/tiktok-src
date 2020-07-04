package com.google.android.gms.internal.ads;

@C6505uv
public final class bvn {

    /* renamed from: a */
    private final bvd f43710a;

    /* renamed from: b */
    private final int f43711b;

    /* renamed from: c */
    private String f43712c;

    /* renamed from: d */
    private String f43713d;

    /* renamed from: e */
    private final int f43714e;

    /* renamed from: f */
    private final int f43715f;

    public bvn(int i, int i2, int i3) {
        this.f43711b = i;
        if (i2 > 64 || i2 < 0) {
            this.f43714e = 64;
        } else {
            this.f43714e = i2;
        }
        if (i3 <= 0) {
            this.f43715f = 1;
        } else {
            this.f43715f = i3;
        }
        this.f43710a = new bvm(this.f43714e);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0103, code lost:
        if (r2.size() < r1.f43711b) goto L_0x0107;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0107 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo41393a(java.util.ArrayList<java.lang.String> r17, java.util.ArrayList<com.google.android.gms.internal.ads.bvc> r18) {
        /*
            r16 = this;
            r1 = r16
            r0 = r18
            com.google.android.gms.internal.ads.bvo r2 = new com.google.android.gms.internal.ads.bvo
            r2.<init>(r1)
            java.util.Collections.sort(r0, r2)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r4 = 0
        L_0x0012:
            int r5 = r18.size()
            if (r4 >= r5) goto L_0x0111
            java.lang.Object r5 = r0.get(r4)
            com.google.android.gms.internal.ads.bvc r5 = (com.google.android.gms.internal.ads.bvc) r5
            int r5 = r5.f43694e
            r6 = r17
            java.lang.Object r5 = r6.get(r5)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            java.text.Normalizer$Form r7 = java.text.Normalizer.Form.NFKC
            java.lang.String r5 = java.text.Normalizer.normalize(r5, r7)
            java.util.Locale r7 = java.util.Locale.US
            java.lang.String r5 = r5.toLowerCase(r7)
            java.lang.String r7 = "\n"
            java.lang.String[] r5 = r5.split(r7)
            int r7 = r5.length
            r8 = 1
            if (r7 == 0) goto L_0x010b
            r7 = 0
        L_0x003f:
            int r9 = r5.length
            if (r7 >= r9) goto L_0x010b
            r9 = r5[r7]
            java.lang.String r10 = "'"
            int r10 = r9.indexOf(r10)
            r11 = -1
            if (r10 == r11) goto L_0x00a4
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r9)
            r11 = 1
            r12 = 0
        L_0x0054:
            int r13 = r11 + 2
            int r14 = r10.length()
            if (r13 > r14) goto L_0x0097
            char r14 = r10.charAt(r11)
            r15 = 39
            if (r14 != r15) goto L_0x0095
            int r12 = r11 + -1
            char r12 = r10.charAt(r12)
            r14 = 32
            if (r12 == r14) goto L_0x0091
            int r12 = r11 + 1
            char r15 = r10.charAt(r12)
            r3 = 115(0x73, float:1.61E-43)
            if (r15 == r3) goto L_0x0080
            char r3 = r10.charAt(r12)
            r12 = 83
            if (r3 != r12) goto L_0x0091
        L_0x0080:
            int r3 = r10.length()
            if (r13 == r3) goto L_0x008c
            char r3 = r10.charAt(r13)
            if (r3 != r14) goto L_0x0091
        L_0x008c:
            r10.insert(r11, r14)
            r11 = r13
            goto L_0x0094
        L_0x0091:
            r10.setCharAt(r11, r14)
        L_0x0094:
            r12 = 1
        L_0x0095:
            int r11 = r11 + r8
            goto L_0x0054
        L_0x0097:
            if (r12 == 0) goto L_0x009e
            java.lang.String r3 = r10.toString()
            goto L_0x009f
        L_0x009e:
            r3 = 0
        L_0x009f:
            if (r3 == 0) goto L_0x00a4
            r1.f43713d = r3
            goto L_0x00a5
        L_0x00a4:
            r3 = r9
        L_0x00a5:
            java.lang.String[] r3 = com.google.android.gms.internal.ads.bvh.m50155a(r3, r8)
            int r9 = r3.length
            int r10 = r1.f43715f
            if (r9 < r10) goto L_0x0107
            r9 = 0
        L_0x00af:
            int r10 = r3.length
            if (r9 >= r10) goto L_0x00fd
            java.lang.String r10 = ""
            r11 = r10
            r10 = 0
        L_0x00b6:
            int r12 = r1.f43715f
            if (r10 >= r12) goto L_0x00eb
            int r12 = r9 + r10
            int r13 = r3.length
            if (r12 < r13) goto L_0x00c1
            r10 = 0
            goto L_0x00ec
        L_0x00c1:
            if (r10 <= 0) goto L_0x00cd
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.String r13 = " "
            java.lang.String r11 = r11.concat(r13)
        L_0x00cd:
            java.lang.String r11 = java.lang.String.valueOf(r11)
            r12 = r3[r12]
            java.lang.String r12 = java.lang.String.valueOf(r12)
            int r13 = r12.length()
            if (r13 == 0) goto L_0x00e2
            java.lang.String r11 = r11.concat(r12)
            goto L_0x00e8
        L_0x00e2:
            java.lang.String r12 = new java.lang.String
            r12.<init>(r11)
            r11 = r12
        L_0x00e8:
            int r10 = r10 + 1
            goto L_0x00b6
        L_0x00eb:
            r10 = 1
        L_0x00ec:
            if (r10 == 0) goto L_0x00fd
            r2.add(r11)
            int r10 = r2.size()
            int r11 = r1.f43711b
            if (r10 < r11) goto L_0x00fa
            goto L_0x0105
        L_0x00fa:
            int r9 = r9 + 1
            goto L_0x00af
        L_0x00fd:
            int r3 = r2.size()
            int r9 = r1.f43711b
            if (r3 < r9) goto L_0x0107
        L_0x0105:
            r8 = 0
            goto L_0x010b
        L_0x0107:
            int r7 = r7 + 1
            goto L_0x003f
        L_0x010b:
            if (r8 == 0) goto L_0x0111
            int r4 = r4 + 1
            goto L_0x0012
        L_0x0111:
            com.google.android.gms.internal.ads.bvg r3 = new com.google.android.gms.internal.ads.bvg
            r3.<init>()
            java.lang.String r0 = ""
            r1.f43712c = r0
            java.util.Iterator r0 = r2.iterator()
        L_0x011e:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x013a
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            com.google.android.gms.internal.ads.bvd r4 = r1.f43710a     // Catch:{ IOException -> 0x0134 }
            byte[] r2 = r4.mo41385a(r2)     // Catch:{ IOException -> 0x0134 }
            r3.mo41388a(r2)     // Catch:{ IOException -> 0x0134 }
            goto L_0x011e
        L_0x0134:
            r0 = move-exception
            java.lang.String r2 = "Error while writing hash to byteStream"
            com.google.android.gms.internal.ads.acd.m45778b(r2, r0)
        L_0x013a:
            java.lang.String r0 = r3.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bvn.mo41393a(java.util.ArrayList, java.util.ArrayList):java.lang.String");
    }
}
