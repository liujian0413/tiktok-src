package kotlin.p1877a;

/* renamed from: kotlin.a.b */
public class C47887b {
    /* renamed from: a */
    public static final <T extends Comparable<?>> int m148819a(T t, T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return t.compareTo(t2);
    }
}
