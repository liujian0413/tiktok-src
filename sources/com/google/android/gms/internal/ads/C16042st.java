package com.google.android.gms.internal.ads;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.st */
public final class C16042st {
    /* JADX WARNING: type inference failed for: r7v0, types: [com.google.android.gms.internal.ads.adi, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v1, types: [com.google.android.gms.internal.ads.sw] */
    /* JADX WARNING: type inference failed for: r0v4, types: [com.google.android.gms.internal.ads.tc] */
    /* JADX WARNING: type inference failed for: r7v3, types: [com.google.android.gms.internal.ads.sv] */
    /* JADX WARNING: type inference failed for: r7v4, types: [com.google.android.gms.internal.ads.sy] */
    /* JADX WARNING: type inference failed for: r0v9, types: [com.google.android.gms.internal.ads.ta] */
    /* JADX WARNING: type inference failed for: r7v6 */
    /* JADX WARNING: type inference failed for: r0v10, types: [com.google.android.gms.internal.ads.tc] */
    /* JADX WARNING: type inference failed for: r7v7 */
    /* JADX WARNING: type inference failed for: r7v8 */
    /* JADX WARNING: type inference failed for: r0v11, types: [com.google.android.gms.internal.ads.ta] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r7v6
      assigns: [com.google.android.gms.internal.ads.tc, com.google.android.gms.internal.ads.ta]
      uses: [java.lang.Object, com.google.android.gms.internal.ads.adi, com.google.android.gms.internal.ads.tc, com.google.android.gms.internal.ads.ta]
      mth insns count: 54
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 6 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.adi m52127a(android.content.Context r8, com.google.android.gms.ads.internal.C14768a r9, com.google.android.gms.internal.ads.abk r10, com.google.android.gms.internal.ads.bdt r11, com.google.android.gms.internal.ads.ami r12, com.google.android.gms.internal.ads.C15931oq r13, com.google.android.gms.internal.ads.C16043su r14, com.google.android.gms.internal.ads.C15600ck r15) {
        /*
            com.google.android.gms.internal.ads.zzaxi r2 = r10.f39888b
            boolean r4 = r2.f45630g
            if (r4 == 0) goto L_0x0013
            com.google.android.gms.internal.ads.ta r7 = new com.google.android.gms.internal.ads.ta
            r0 = r7
            r1 = r8
            r2 = r10
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            goto L_0x005c
        L_0x0013:
            boolean r4 = r2.f45642s
            if (r4 != 0) goto L_0x0040
            boolean r4 = r9 instanceof com.google.android.gms.ads.internal.C14772ad
            if (r4 == 0) goto L_0x001c
            goto L_0x0040
        L_0x001c:
            boolean r0 = com.google.android.gms.common.util.C15333p.m44598e()
            if (r0 == 0) goto L_0x003a
            boolean r0 = com.google.android.gms.common.util.C15333p.m44600g()
            if (r0 != 0) goto L_0x003a
            if (r12 == 0) goto L_0x003a
            com.google.android.gms.internal.ads.anv r0 = r12.mo39759u()
            boolean r0 = r0.mo39849e()
            if (r0 == 0) goto L_0x003a
            com.google.android.gms.internal.ads.sy r7 = new com.google.android.gms.internal.ads.sy
            r7.<init>(r8, r10, r12, r14)
            goto L_0x005c
        L_0x003a:
            com.google.android.gms.internal.ads.sv r7 = new com.google.android.gms.internal.ads.sv
            r7.<init>(r8, r10, r12, r14)
            goto L_0x005c
        L_0x0040:
            boolean r2 = r2.f45642s
            if (r2 == 0) goto L_0x0057
            boolean r2 = r9 instanceof com.google.android.gms.ads.internal.C14772ad
            if (r2 == 0) goto L_0x0057
            com.google.android.gms.internal.ads.tc r7 = new com.google.android.gms.internal.ads.tc
            r2 = r9
            com.google.android.gms.ads.internal.ad r2 = (com.google.android.gms.ads.internal.C14772ad) r2
            r0 = r7
            r1 = r8
            r3 = r10
            r4 = r11
            r5 = r14
            r6 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6)
            goto L_0x005c
        L_0x0057:
            com.google.android.gms.internal.ads.sw r7 = new com.google.android.gms.internal.ads.sw
            r7.<init>(r10, r14)
        L_0x005c:
            java.lang.String r0 = "AdRenderer: "
            java.lang.Class r1 = r7.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r2 = r1.length()
            if (r2 == 0) goto L_0x0075
            java.lang.String r0 = r0.concat(r1)
            goto L_0x007b
        L_0x0075:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            r0 = r1
        L_0x007b:
            com.google.android.gms.internal.ads.acd.m45777b(r0)
            r7.mo39128c()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C16042st.m52127a(android.content.Context, com.google.android.gms.ads.internal.a, com.google.android.gms.internal.ads.abk, com.google.android.gms.internal.ads.bdt, com.google.android.gms.internal.ads.ami, com.google.android.gms.internal.ads.oq, com.google.android.gms.internal.ads.su, com.google.android.gms.internal.ads.ck):com.google.android.gms.internal.ads.adi");
    }
}
