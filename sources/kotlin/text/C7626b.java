package kotlin.text;

import kotlin.p356e.C7549c;

/* renamed from: kotlin.text.b */
public class C7626b {
    /* renamed from: a */
    public static final boolean m23677a(char c) {
        if (Character.isWhitespace(c) || Character.isSpaceChar(c)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final int m23676a(int i) {
        if (2 <= i && 36 >= i) {
            return i;
        }
        StringBuilder sb = new StringBuilder("radix ");
        sb.append(i);
        sb.append(" was not in valid range ");
        sb.append(new C7549c(2, 36));
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public static final int m23675a(char c, int i) {
        return Character.digit(c, i);
    }
}
