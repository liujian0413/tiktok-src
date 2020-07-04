package com.bytedance.ies.abmock;

/* renamed from: com.bytedance.ies.abmock.j */
public final class C10292j {

    /* renamed from: a */
    private static C10292j f27949a;

    /* renamed from: a */
    public static synchronized C10292j m30480a() {
        C10292j jVar;
        synchronized (C10292j.class) {
            if (f27949a == null) {
                f27949a = new C10292j();
            }
            jVar = f27949a;
        }
        return jVar;
    }

    /* renamed from: a */
    private static <T> T m30482a(String str) {
        if (C6384b.m19835a().mo15293b() && C6392k.f18684a.mo15320b()) {
            T a = C6392k.f18684a.mo15317a(str);
            if (a != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" 正在使用 mock 的数据!!");
                C6380a.m19832a(sb.toString());
                return a;
            }
        }
        return null;
    }

    /* renamed from: a */
    private <T> T m30481a(Class cls, String str, T t) {
        T a = m30482a(str);
        if (a != null) {
            return a;
        }
        return t;
    }

    /* renamed from: a */
    public final double mo25011a(Class cls, String str, Double d) {
        return ((Double) m30481a(cls, str, (T) d)).doubleValue();
    }

    /* renamed from: a */
    public final int mo25012a(Class cls, String str, Integer num) {
        return ((Integer) m30481a(cls, str, (T) num)).intValue();
    }

    /* renamed from: a */
    public final long mo25013a(Class cls, String str, Long l) {
        return ((Long) m30481a(cls, str, (T) l)).longValue();
    }

    /* renamed from: a */
    public final String mo25015a(Class cls, String str, String str2) {
        return (String) m30481a(cls, str, (T) str2);
    }

    /* renamed from: a */
    public final boolean mo25016a(Class cls, String str, Boolean bool) {
        return ((Boolean) m30481a(cls, str, (T) bool)).booleanValue();
    }

    /* JADX WARNING: type inference failed for: r3v12, types: [T, java.lang.String[]] */
    /* JADX WARNING: type inference failed for: r3v14, types: [long[], T] */
    /* JADX WARNING: type inference failed for: r3v16, types: [T, boolean[]] */
    /* JADX WARNING: type inference failed for: r3v18, types: [double[], T] */
    /* JADX WARNING: type inference failed for: r3v20, types: [T, float[]] */
    /* JADX WARNING: type inference failed for: r3v22, types: [int[], T] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=boolean[], code=null, for r3v16, types: [T, boolean[]] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v12, types: [T, java.lang.String[]]
      assigns: [java.lang.String[]]
      uses: [?[], T, ?[OBJECT, ARRAY][]]
      mth insns count: 90
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
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 6 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> T mo25014a(java.lang.Class r3, java.lang.String r4, java.lang.Object r5, java.lang.String r6, java.lang.Class r7) throws java.lang.Throwable {
        /*
            r2 = this;
            java.lang.Object r3 = m30482a(r4)
            if (r3 == 0) goto L_0x0007
            return r3
        L_0x0007:
            java.lang.Class<int[]> r3 = int[].class
            r4 = 0
            if (r7 != r3) goto L_0x0027
            java.util.List r5 = (java.util.List) r5
            int r3 = r5.size()
            int[] r3 = new int[r3]
            int r6 = r3.length
        L_0x0015:
            if (r4 >= r6) goto L_0x0026
            java.lang.Object r7 = r5.get(r4)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r3[r4] = r7
            int r4 = r4 + 1
            goto L_0x0015
        L_0x0026:
            return r3
        L_0x0027:
            java.lang.Class<float[]> r3 = float[].class
            if (r7 != r3) goto L_0x0046
            java.util.List r5 = (java.util.List) r5
            int r3 = r5.size()
            float[] r3 = new float[r3]
            int r6 = r3.length
        L_0x0034:
            if (r4 >= r6) goto L_0x0045
            java.lang.Object r7 = r5.get(r4)
            java.lang.Float r7 = (java.lang.Float) r7
            float r7 = r7.floatValue()
            r3[r4] = r7
            int r4 = r4 + 1
            goto L_0x0034
        L_0x0045:
            return r3
        L_0x0046:
            java.lang.Class<double[]> r3 = double[].class
            if (r7 != r3) goto L_0x0065
            java.util.List r5 = (java.util.List) r5
            int r3 = r5.size()
            double[] r3 = new double[r3]
            int r6 = r3.length
        L_0x0053:
            if (r4 >= r6) goto L_0x0064
            java.lang.Object r7 = r5.get(r4)
            java.lang.Double r7 = (java.lang.Double) r7
            double r0 = r7.doubleValue()
            r3[r4] = r0
            int r4 = r4 + 1
            goto L_0x0053
        L_0x0064:
            return r3
        L_0x0065:
            java.lang.Class<boolean[]> r3 = boolean[].class
            if (r7 != r3) goto L_0x0084
            java.util.List r5 = (java.util.List) r5
            int r3 = r5.size()
            boolean[] r3 = new boolean[r3]
            int r6 = r3.length
        L_0x0072:
            if (r4 >= r6) goto L_0x0083
            java.lang.Object r7 = r5.get(r4)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r3[r4] = r7
            int r4 = r4 + 1
            goto L_0x0072
        L_0x0083:
            return r3
        L_0x0084:
            java.lang.Class<long[]> r3 = long[].class
            if (r7 != r3) goto L_0x00a3
            java.util.List r5 = (java.util.List) r5
            int r3 = r5.size()
            long[] r3 = new long[r3]
            int r6 = r3.length
        L_0x0091:
            if (r4 >= r6) goto L_0x00a2
            java.lang.Object r7 = r5.get(r4)
            java.lang.Long r7 = (java.lang.Long) r7
            long r0 = r7.longValue()
            r3[r4] = r0
            int r4 = r4 + 1
            goto L_0x0091
        L_0x00a2:
            return r3
        L_0x00a3:
            java.lang.Class<java.lang.String[]> r3 = java.lang.String[].class
            if (r7 != r3) goto L_0x00be
            java.util.List r5 = (java.util.List) r5
            int r3 = r5.size()
            java.lang.String[] r3 = new java.lang.String[r3]
            int r6 = r3.length
        L_0x00b0:
            if (r4 >= r6) goto L_0x00bd
            java.lang.Object r7 = r5.get(r4)
            java.lang.String r7 = (java.lang.String) r7
            r3[r4] = r7
            int r4 = r4 + 1
            goto L_0x00b0
        L_0x00bd:
            return r3
        L_0x00be:
            com.google.gson.e r3 = com.bytedance.ies.abmock.C6389g.m19890a()
            java.lang.String r3 = r3.mo15979b(r5)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "正在使用 Gson 转换对象 : "
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            com.bytedance.ies.abmock.C6380a.m19832a(r4)
            java.lang.Object r3 = com.bytedance.ies.abmock.C10293l.m30489a(r3, r7)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.abmock.C10292j.mo25014a(java.lang.Class, java.lang.String, java.lang.Object, java.lang.String, java.lang.Class):java.lang.Object");
    }
}
