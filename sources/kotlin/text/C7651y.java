package kotlin.text;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.C7573i;
import kotlin.p356e.C7551d;

/* renamed from: kotlin.text.y */
public class C7651y extends C7650x {
    /* renamed from: i */
    public static final char m23788i(CharSequence charSequence) {
        boolean z;
        C7573i.m23587b(charSequence, "$this$first");
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return charSequence.charAt(0);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    /* renamed from: j */
    public static final CharSequence m23789j(CharSequence charSequence) {
        C7573i.m23587b(charSequence, "$this$reversed");
        StringBuilder reverse = new StringBuilder(charSequence).reverse();
        C7573i.m23582a((Object) reverse, "StringBuilder(this).reverse()");
        return reverse;
    }

    /* renamed from: c */
    public static final String m23787c(String str, int i) {
        boolean z;
        C7573i.m23587b(str, "$this$drop");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            String substring = str.substring(C7551d.m23567d(i, str.length()));
            C7573i.m23582a((Object) substring, "(this as java.lang.String).substring(startIndex)");
            return substring;
        }
        StringBuilder sb = new StringBuilder("Requested character count ");
        sb.append(i);
        sb.append(" is less than zero.");
        throw new IllegalArgumentException(sb.toString().toString());
    }
}
