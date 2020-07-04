package android.arch.persistence.p009a;

/* renamed from: android.arch.persistence.a.a */
public final class C0125a implements C0141e {

    /* renamed from: a */
    private final String f264a;

    /* renamed from: b */
    private final Object[] f265b;

    /* renamed from: a */
    public final String mo262a() {
        return this.f264a;
    }

    public C0125a(String str) {
        this(str, null);
    }

    /* renamed from: a */
    public final void mo263a(C0140d dVar) {
        m325a(dVar, this.f265b);
    }

    public C0125a(String str, Object[] objArr) {
        this.f264a = str;
        this.f265b = objArr;
    }

    /* renamed from: a */
    private static void m325a(C0140d dVar, Object[] objArr) {
        if (objArr != null) {
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                Object obj = objArr[i];
                i++;
                m324a(dVar, i, obj);
            }
        }
    }

    /* renamed from: a */
    private static void m324a(C0140d dVar, int i, Object obj) {
        long j;
        if (obj == null) {
            dVar.mo288a(i);
        } else if (obj instanceof byte[]) {
            dVar.mo292a(i, (byte[]) obj);
        } else if (obj instanceof Float) {
            dVar.mo289a(i, (double) ((Float) obj).floatValue());
        } else if (obj instanceof Double) {
            dVar.mo289a(i, ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            dVar.mo290a(i, ((Long) obj).longValue());
        } else if (obj instanceof Integer) {
            dVar.mo290a(i, (long) ((Integer) obj).intValue());
        } else if (obj instanceof Short) {
            dVar.mo290a(i, (long) ((Short) obj).shortValue());
        } else if (obj instanceof Byte) {
            dVar.mo290a(i, (long) ((Byte) obj).byteValue());
        } else if (obj instanceof String) {
            dVar.mo291a(i, (String) obj);
        } else if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                j = 1;
            } else {
                j = 0;
            }
            dVar.mo290a(i, j);
        } else {
            StringBuilder sb = new StringBuilder("Cannot bind ");
            sb.append(obj);
            sb.append(" at index ");
            sb.append(i);
            sb.append(" Supported types: null, byte[], float, double, long, int, short, byte, string");
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
