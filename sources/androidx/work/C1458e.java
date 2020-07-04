package androidx.work;

import com.C1642a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: androidx.work.e */
public final class C1458e {

    /* renamed from: a */
    public static final C1458e f5672a = new C1459a().mo6696a();

    /* renamed from: b */
    Map<String, Object> f5673b;

    /* renamed from: androidx.work.e$a */
    public static final class C1459a {

        /* renamed from: a */
        private Map<String, Object> f5674a = new HashMap();

        /* renamed from: a */
        public final C1458e mo6696a() {
            return new C1458e(this.f5674a);
        }

        /* renamed from: a */
        public final C1459a mo6695a(Map<String, Object> map) {
            for (Entry entry : map.entrySet()) {
                m7325a((String) entry.getKey(), entry.getValue());
            }
            return this;
        }

        /* renamed from: a */
        private C1459a m7325a(String str, Object obj) {
            if (obj == null) {
                this.f5674a.put(str, null);
            } else {
                Class<double[]> cls = obj.getClass();
                if (cls == Boolean.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                    this.f5674a.put(str, obj);
                } else if (cls == boolean[].class) {
                    this.f5674a.put(str, C1458e.m7317a((boolean[]) obj));
                } else if (cls == int[].class) {
                    this.f5674a.put(str, C1458e.m7320a((int[]) obj));
                } else if (cls == long[].class) {
                    this.f5674a.put(str, C1458e.m7321a((long[]) obj));
                } else if (cls == float[].class) {
                    this.f5674a.put(str, C1458e.m7319a((float[]) obj));
                } else if (cls == double[].class) {
                    this.f5674a.put(str, C1458e.m7318a((double[]) obj));
                } else {
                    throw new IllegalArgumentException(C1642a.m8034a("Key %s has invalid type %s", new Object[]{str, cls}));
                }
            }
            return this;
        }
    }

    C1458e() {
    }

    /* renamed from: b */
    private int m7322b() {
        return this.f5673b.size();
    }

    /* renamed from: a */
    public final Map<String, Object> mo6692a() {
        return Collections.unmodifiableMap(this.f5673b);
    }

    public final int hashCode() {
        return this.f5673b.hashCode() * 31;
    }

    C1458e(Map<String, ?> map) {
        this.f5673b = new HashMap(map);
    }

    /* renamed from: a */
    public final String mo6691a(String str) {
        Object obj = this.f5673b.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    /* renamed from: a */
    static Boolean[] m7317a(boolean[] zArr) {
        Boolean[] boolArr = new Boolean[zArr.length];
        for (int i = 0; i < zArr.length; i++) {
            boolArr[i] = Boolean.valueOf(zArr[i]);
        }
        return boolArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f5673b.equals(((C1458e) obj).f5673b);
    }

    /* renamed from: a */
    static Double[] m7318a(double[] dArr) {
        Double[] dArr2 = new Double[dArr.length];
        for (int i = 0; i < dArr.length; i++) {
            dArr2[i] = Double.valueOf(dArr[i]);
        }
        return dArr2;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x002c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x003c */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0039 A[SYNTHETIC, Splitter:B:20:0x0039] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0042 A[SYNTHETIC, Splitter:B:28:0x0042] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.work.C1458e m7315a(byte[] r5) throws java.lang.IllegalStateException {
        /*
            int r0 = r5.length
            r1 = 10240(0x2800, float:1.4349E-41)
            if (r0 > r1) goto L_0x004c
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r5)
            r5 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch:{ IOException | ClassNotFoundException -> 0x0040, all -> 0x0034 }
            r2.<init>(r1)     // Catch:{ IOException | ClassNotFoundException -> 0x0040, all -> 0x0034 }
            int r5 = r2.readInt()     // Catch:{ IOException | ClassNotFoundException -> 0x0032, all -> 0x0030 }
        L_0x0019:
            if (r5 <= 0) goto L_0x0029
            java.lang.String r3 = r2.readUTF()     // Catch:{ IOException | ClassNotFoundException -> 0x0032, all -> 0x0030 }
            java.lang.Object r4 = r2.readObject()     // Catch:{ IOException | ClassNotFoundException -> 0x0032, all -> 0x0030 }
            r0.put(r3, r4)     // Catch:{ IOException | ClassNotFoundException -> 0x0032, all -> 0x0030 }
            int r5 = r5 + -1
            goto L_0x0019
        L_0x0029:
            r2.close()     // Catch:{ IOException -> 0x002c }
        L_0x002c:
            r1.close()     // Catch:{ IOException -> 0x0046 }
            goto L_0x0046
        L_0x0030:
            r5 = move-exception
            goto L_0x0037
        L_0x0032:
            r5 = r2
            goto L_0x0040
        L_0x0034:
            r0 = move-exception
            r2 = r5
            r5 = r0
        L_0x0037:
            if (r2 == 0) goto L_0x003c
            r2.close()     // Catch:{ IOException -> 0x003c }
        L_0x003c:
            r1.close()     // Catch:{ IOException -> 0x003f }
        L_0x003f:
            throw r5
        L_0x0040:
            if (r5 == 0) goto L_0x002c
            r5.close()     // Catch:{ IOException -> 0x002c }
            goto L_0x002c
        L_0x0046:
            androidx.work.e r5 = new androidx.work.e
            r5.<init>(r0)
            return r5
        L_0x004c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.C1458e.m7315a(byte[]):androidx.work.e");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:13|(0)|21|22|23) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x003c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004d */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a A[SYNTHETIC, Splitter:B:19:0x004a] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0053 A[SYNTHETIC, Splitter:B:27:0x0053] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0064  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m7316a(androidx.work.C1458e r4) throws java.lang.IllegalStateException {
        /*
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 0
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x0051, all -> 0x0046 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0051, all -> 0x0046 }
            int r1 = r4.m7322b()     // Catch:{ IOException -> 0x0044, all -> 0x0042 }
            r2.writeInt(r1)     // Catch:{ IOException -> 0x0044, all -> 0x0042 }
            java.util.Map<java.lang.String, java.lang.Object> r4 = r4.f5673b     // Catch:{ IOException -> 0x0044, all -> 0x0042 }
            java.util.Set r4 = r4.entrySet()     // Catch:{ IOException -> 0x0044, all -> 0x0042 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ IOException -> 0x0044, all -> 0x0042 }
        L_0x001c:
            boolean r1 = r4.hasNext()     // Catch:{ IOException -> 0x0044, all -> 0x0042 }
            if (r1 == 0) goto L_0x0039
            java.lang.Object r1 = r4.next()     // Catch:{ IOException -> 0x0044, all -> 0x0042 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ IOException -> 0x0044, all -> 0x0042 }
            java.lang.Object r3 = r1.getKey()     // Catch:{ IOException -> 0x0044, all -> 0x0042 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ IOException -> 0x0044, all -> 0x0042 }
            r2.writeUTF(r3)     // Catch:{ IOException -> 0x0044, all -> 0x0042 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ IOException -> 0x0044, all -> 0x0042 }
            r2.writeObject(r1)     // Catch:{ IOException -> 0x0044, all -> 0x0042 }
            goto L_0x001c
        L_0x0039:
            r2.close()     // Catch:{ IOException -> 0x003c }
        L_0x003c:
            r0.close()     // Catch:{ IOException -> 0x0040 }
            goto L_0x0057
        L_0x0040:
            goto L_0x0057
        L_0x0042:
            r4 = move-exception
            goto L_0x0048
        L_0x0044:
            r1 = r2
            goto L_0x0051
        L_0x0046:
            r4 = move-exception
            r2 = r1
        L_0x0048:
            if (r2 == 0) goto L_0x004d
            r2.close()     // Catch:{ IOException -> 0x004d }
        L_0x004d:
            r0.close()     // Catch:{ IOException -> 0x0050 }
        L_0x0050:
            throw r4
        L_0x0051:
            if (r1 == 0) goto L_0x003c
            r1.close()     // Catch:{ IOException -> 0x003c }
            goto L_0x003c
        L_0x0057:
            int r4 = r0.size()
            r1 = 10240(0x2800, float:1.4349E-41)
            if (r4 > r1) goto L_0x0064
            byte[] r4 = r0.toByteArray()
            return r4
        L_0x0064:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.C1458e.m7316a(androidx.work.e):byte[]");
    }

    /* renamed from: a */
    static Float[] m7319a(float[] fArr) {
        Float[] fArr2 = new Float[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            fArr2[i] = Float.valueOf(fArr[i]);
        }
        return fArr2;
    }

    /* renamed from: a */
    static Integer[] m7320a(int[] iArr) {
        Integer[] numArr = new Integer[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            numArr[i] = Integer.valueOf(iArr[i]);
        }
        return numArr;
    }

    /* renamed from: a */
    static Long[] m7321a(long[] jArr) {
        Long[] lArr = new Long[jArr.length];
        for (int i = 0; i < jArr.length; i++) {
            lArr[i] = Long.valueOf(jArr[i]);
        }
        return lArr;
    }
}
