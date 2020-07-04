package kotlin.text;

/* renamed from: kotlin.text.c */
class C7627c extends C7626b {
    /* renamed from: a */
    public static final boolean m23678a(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        if (Character.toUpperCase(c) == Character.toUpperCase(c2) || Character.toLowerCase(c) == Character.toLowerCase(c2)) {
            return true;
        }
        return false;
    }
}
