package android.arch.persistence.room.p012b;

/* renamed from: android.arch.persistence.room.b.a */
public final class C0149a {

    /* renamed from: a */
    public static final String[] f316a = new String[0];

    /* renamed from: a */
    public static StringBuilder m414a() {
        return new StringBuilder();
    }

    /* renamed from: a */
    public static void m415a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("?");
            if (i2 < i - 1) {
                sb.append(",");
            }
        }
    }
}
