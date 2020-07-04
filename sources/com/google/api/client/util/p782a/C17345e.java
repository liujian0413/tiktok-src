package com.google.api.client.util.p782a;

/* renamed from: com.google.api.client.util.a.e */
public abstract class C17345e extends C17341b {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo44810a(CharSequence charSequence, int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract char[] mo44811a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo44813a(String str, int i) {
        int i2;
        int i3;
        int length = str.length();
        char[] a = C17343d.m57763a();
        int i4 = 0;
        int i5 = 0;
        while (i < length) {
            int b = m57766b(str, i, length);
            if (b >= 0) {
                char[] a2 = mo44811a(b);
                if (Character.isSupplementaryCodePoint(b)) {
                    i3 = 2;
                } else {
                    i3 = 1;
                }
                int i6 = i3 + i;
                if (a2 != null) {
                    int i7 = i - i4;
                    int i8 = i5 + i7;
                    int length2 = a2.length + i8;
                    if (a.length < length2) {
                        a = m57765a(a, i5, ((length2 + length) - i) + 32);
                    }
                    if (i7 > 0) {
                        str.getChars(i4, i, a, i5);
                        i5 = i8;
                    }
                    if (a2.length > 0) {
                        System.arraycopy(a2, 0, a, i5, a2.length);
                        i5 += a2.length;
                    }
                    i4 = i6;
                }
                i = mo44810a((CharSequence) str, i6, length);
            } else {
                throw new IllegalArgumentException("Trailing high surrogate at end of input");
            }
        }
        int i9 = length - i4;
        if (i9 > 0) {
            i2 = i9 + i5;
            if (a.length < i2) {
                a = m57765a(a, i5, i2);
            }
            str.getChars(i4, length, a, i5);
        } else {
            i2 = i5;
        }
        return new String(a, 0, i2);
    }

    /* renamed from: a */
    private static char[] m57765a(char[] cArr, int i, int i2) {
        char[] cArr2 = new char[i2];
        if (i > 0) {
            System.arraycopy(cArr, 0, cArr2, 0, i);
        }
        return cArr2;
    }

    /* renamed from: b */
    private static int m57766b(CharSequence charSequence, int i, int i2) {
        if (i < i2) {
            int i3 = i + 1;
            char charAt = charSequence.charAt(i);
            if (charAt < 55296 || charAt > 57343) {
                return charAt;
            }
            if (charAt > 56319) {
                int i4 = i3 - 1;
                StringBuilder sb = new StringBuilder(82);
                sb.append("Unexpected low surrogate character '");
                sb.append(charAt);
                sb.append("' with value ");
                sb.append(charAt);
                sb.append(" at index ");
                sb.append(i4);
                throw new IllegalArgumentException(sb.toString());
            } else if (i3 == i2) {
                return -charAt;
            } else {
                char charAt2 = charSequence.charAt(i3);
                if (Character.isLowSurrogate(charAt2)) {
                    return Character.toCodePoint(charAt, charAt2);
                }
                StringBuilder sb2 = new StringBuilder(83);
                sb2.append("Expected low surrogate but got char '");
                sb2.append(charAt2);
                sb2.append("' with value ");
                sb2.append(charAt2);
                sb2.append(" at index ");
                sb2.append(i3);
                throw new IllegalArgumentException(sb2.toString());
            }
        } else {
            throw new IndexOutOfBoundsException("Index exceeds specified range");
        }
    }
}
