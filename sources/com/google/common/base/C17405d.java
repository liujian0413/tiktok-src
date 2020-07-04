package com.google.common.base;

import java.util.Arrays;

/* renamed from: com.google.common.base.d */
public abstract class C17405d implements C17440n<Character> {

    /* renamed from: a */
    public static final C17405d f48351a = m57894c();

    /* renamed from: b */
    public static final C17405d f48352b = m57896d();

    /* renamed from: c */
    public static final C17405d f48353c = m57897e();

    /* renamed from: d */
    public static final C17405d f48354d = m57898f();

    /* renamed from: e */
    public static final C17405d f48355e = m57899g();

    /* renamed from: f */
    public static final C17405d f48356f = m57900h();

    /* renamed from: g */
    public static final C17405d f48357g = m57901i();

    /* renamed from: h */
    public static final C17405d f48358h = m57902j();

    /* renamed from: i */
    public static final C17405d f48359i = m57903k();

    /* renamed from: j */
    public static final C17405d f48360j = m57904l();

    /* renamed from: k */
    public static final C17405d f48361k = m57905m();

    /* renamed from: l */
    public static final C17405d f48362l = m57906n();

    /* renamed from: m */
    public static final C17405d f48363m = m57890a();

    /* renamed from: n */
    public static final C17405d f48364n = m57893b();

    /* renamed from: com.google.common.base.d$a */
    static final class C17406a extends C17420o {

        /* renamed from: o */
        static final C17406a f48365o = new C17406a();

        /* renamed from: b */
        public final boolean mo44912b(char c) {
            return true;
        }

        private C17406a() {
            super("CharMatcher.any()");
        }

        /* renamed from: a */
        public final int mo44909a(CharSequence charSequence, int i) {
            int length = charSequence.length();
            C17439m.m57978b(i, length);
            if (i == length) {
                return -1;
            }
            return i;
        }
    }

    /* renamed from: com.google.common.base.d$b */
    static final class C17407b extends C17420o {

        /* renamed from: o */
        static final C17407b f48366o = new C17407b();

        /* renamed from: b */
        public final boolean mo44912b(char c) {
            return c <= 127;
        }

        C17407b() {
            super("CharMatcher.ascii()");
        }
    }

    /* renamed from: com.google.common.base.d$c */
    static final class C17408c extends C17405d {

        /* renamed from: o */
        static final C17405d f48367o = new C17408c();

        private C17408c() {
        }

        /* renamed from: b */
        public final boolean mo44912b(char c) {
            if (!(c == ' ' || c == 133 || c == 5760)) {
                if (c == 8199) {
                    return false;
                }
                if (!(c == 8287 || c == 12288)) {
                    switch (c) {
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                            break;
                        default:
                            switch (c) {
                                case 8232:
                                case 8233:
                                    break;
                                default:
                                    return c >= 8192 && c <= 8202;
                            }
                    }
                }
            }
            return true;
        }

        public final String toString() {
            return "CharMatcher.breakingWhitespace()";
        }

        public final /* synthetic */ boolean apply(Object obj) {
            return C17405d.super.apply((Character) obj);
        }
    }

    /* renamed from: com.google.common.base.d$d */
    static final class C17409d extends C17422q {

        /* renamed from: o */
        static final C17409d f48368o = new C17409d();

        /* renamed from: a */
        private static char[] m57914a() {
            return "0٠۰߀०০੦૦୦௦౦೦൦෦๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐꧰꩐꯰０".toCharArray();
        }

        private C17409d() {
            super("CharMatcher.digit()", m57914a(), m57915b());
        }

        /* renamed from: b */
        private static char[] m57915b() {
            char[] cArr = new char[37];
            for (int i = 0; i < 37; i++) {
                cArr[i] = (char) ("0٠۰߀०০੦૦୦௦౦೦൦෦๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐꧰꩐꯰０".charAt(i) + 9);
            }
            return cArr;
        }
    }

    /* renamed from: com.google.common.base.d$e */
    static abstract class C17410e extends C17405d {
        C17410e() {
        }

        public /* synthetic */ boolean apply(Object obj) {
            return C17405d.super.apply((Character) obj);
        }
    }

    /* renamed from: com.google.common.base.d$f */
    static final class C17411f extends C17410e {

        /* renamed from: o */
        private final char f48369o;

        /* renamed from: p */
        private final char f48370p;

        public final String toString() {
            StringBuilder sb = new StringBuilder("CharMatcher.inRange('");
            sb.append(C17405d.m57895c(this.f48369o));
            sb.append("', '");
            sb.append(C17405d.m57895c(this.f48370p));
            sb.append("')");
            return sb.toString();
        }

        /* renamed from: b */
        public final boolean mo44912b(char c) {
            if (this.f48369o > c || c > this.f48370p) {
                return false;
            }
            return true;
        }

        C17411f(char c, char c2) {
            boolean z;
            if (c2 >= c) {
                z = true;
            } else {
                z = false;
            }
            C17439m.m57968a(z);
            this.f48369o = c;
            this.f48370p = c2;
        }
    }

    /* renamed from: com.google.common.base.d$g */
    static final class C17412g extends C17422q {

        /* renamed from: o */
        static final C17412g f48371o = new C17412g();

        private C17412g() {
            super("CharMatcher.invisible()", "\u0000­؀؜۝܏࣢ ᠎   ⁦　?﻿￹".toCharArray(), "  ­؅؜۝܏࣢ ᠎‏ ⁤⁯　﻿￻".toCharArray());
        }
    }

    /* renamed from: com.google.common.base.d$h */
    static final class C17413h extends C17410e {

        /* renamed from: o */
        private final char f48372o;

        public final String toString() {
            StringBuilder sb = new StringBuilder("CharMatcher.is('");
            sb.append(C17405d.m57895c(this.f48372o));
            sb.append("')");
            return sb.toString();
        }

        C17413h(char c) {
            this.f48372o = c;
        }

        /* renamed from: b */
        public final boolean mo44912b(char c) {
            if (c == this.f48372o) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.google.common.base.d$i */
    static final class C17414i extends C17405d {

        /* renamed from: o */
        static final C17414i f48373o = new C17414i();

        private C17414i() {
        }

        public final String toString() {
            return "CharMatcher.javaDigit()";
        }

        public final /* synthetic */ boolean apply(Object obj) {
            return C17405d.super.apply((Character) obj);
        }

        /* renamed from: b */
        public final boolean mo44912b(char c) {
            return Character.isDigit(c);
        }
    }

    /* renamed from: com.google.common.base.d$j */
    static final class C17415j extends C17420o {

        /* renamed from: o */
        static final C17415j f48374o = new C17415j();

        /* renamed from: b */
        public final boolean mo44912b(char c) {
            return c <= 31 || (c >= 127 && c <= 159);
        }

        private C17415j() {
            super("CharMatcher.javaIsoControl()");
        }
    }

    /* renamed from: com.google.common.base.d$k */
    static final class C17416k extends C17405d {

        /* renamed from: o */
        static final C17416k f48375o = new C17416k();

        private C17416k() {
        }

        public final String toString() {
            return "CharMatcher.javaLetter()";
        }

        public final /* synthetic */ boolean apply(Object obj) {
            return C17405d.super.apply((Character) obj);
        }

        /* renamed from: b */
        public final boolean mo44912b(char c) {
            return Character.isLetter(c);
        }
    }

    /* renamed from: com.google.common.base.d$l */
    static final class C17417l extends C17405d {

        /* renamed from: o */
        static final C17417l f48376o = new C17417l();

        private C17417l() {
        }

        public final String toString() {
            return "CharMatcher.javaLetterOrDigit()";
        }

        public final /* synthetic */ boolean apply(Object obj) {
            return C17405d.super.apply((Character) obj);
        }

        /* renamed from: b */
        public final boolean mo44912b(char c) {
            return Character.isLetterOrDigit(c);
        }
    }

    /* renamed from: com.google.common.base.d$m */
    static final class C17418m extends C17405d {

        /* renamed from: o */
        static final C17418m f48377o = new C17418m();

        private C17418m() {
        }

        public final String toString() {
            return "CharMatcher.javaLowerCase()";
        }

        public final /* synthetic */ boolean apply(Object obj) {
            return C17405d.super.apply((Character) obj);
        }

        /* renamed from: b */
        public final boolean mo44912b(char c) {
            return Character.isLowerCase(c);
        }
    }

    /* renamed from: com.google.common.base.d$n */
    static final class C17419n extends C17405d {

        /* renamed from: o */
        static final C17419n f48378o = new C17419n();

        private C17419n() {
        }

        public final String toString() {
            return "CharMatcher.javaUpperCase()";
        }

        public final /* synthetic */ boolean apply(Object obj) {
            return C17405d.super.apply((Character) obj);
        }

        /* renamed from: b */
        public final boolean mo44912b(char c) {
            return Character.isUpperCase(c);
        }
    }

    /* renamed from: com.google.common.base.d$o */
    static abstract class C17420o extends C17410e {

        /* renamed from: o */
        private final String f48379o;

        public final String toString() {
            return this.f48379o;
        }

        C17420o(String str) {
            this.f48379o = (String) C17439m.m57962a(str);
        }
    }

    /* renamed from: com.google.common.base.d$p */
    static final class C17421p extends C17420o {

        /* renamed from: o */
        static final C17421p f48380o = new C17421p();

        /* renamed from: b */
        public final boolean mo44912b(char c) {
            return false;
        }

        private C17421p() {
            super("CharMatcher.none()");
        }

        /* renamed from: a */
        public final int mo44909a(CharSequence charSequence, int i) {
            C17439m.m57978b(i, charSequence.length());
            return -1;
        }
    }

    /* renamed from: com.google.common.base.d$q */
    static class C17422q extends C17405d {

        /* renamed from: o */
        private final String f48381o;

        /* renamed from: p */
        private final char[] f48382p;

        /* renamed from: q */
        private final char[] f48383q;

        public String toString() {
            return this.f48381o;
        }

        public /* synthetic */ boolean apply(Object obj) {
            return C17405d.super.apply((Character) obj);
        }

        /* renamed from: b */
        public final boolean mo44912b(char c) {
            int binarySearch = Arrays.binarySearch(this.f48382p, c);
            if (binarySearch >= 0) {
                return true;
            }
            int i = (binarySearch ^ -1) - 1;
            if (i < 0 || c > this.f48383q[i]) {
                return false;
            }
            return true;
        }

        C17422q(String str, char[] cArr, char[] cArr2) {
            boolean z;
            boolean z2;
            boolean z3;
            this.f48381o = str;
            this.f48382p = cArr;
            this.f48383q = cArr2;
            if (cArr.length == cArr2.length) {
                z = true;
            } else {
                z = false;
            }
            C17439m.m57968a(z);
            int i = 0;
            while (i < cArr.length) {
                if (cArr[i] <= cArr2[i]) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C17439m.m57968a(z2);
                int i2 = i + 1;
                if (i2 < cArr.length) {
                    if (cArr2[i] < cArr[i2]) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    C17439m.m57968a(z3);
                }
                i = i2;
            }
        }
    }

    /* renamed from: com.google.common.base.d$r */
    static final class C17423r extends C17422q {

        /* renamed from: o */
        static final C17423r f48384o = new C17423r();

        private C17423r() {
            super("CharMatcher.singleWidth()", "\u0000־א׳؀ݐ฀Ḁ℀ﭐﹰ｡".toCharArray(), "ӹ־ת״ۿݿ๿₯℺﷿﻿ￜ".toCharArray());
        }
    }

    /* renamed from: com.google.common.base.d$s */
    static final class C17424s extends C17420o {

        /* renamed from: o */
        static final int f48385o = Integer.numberOfLeadingZeros(31);

        /* renamed from: p */
        static final C17424s f48386p = new C17424s();

        C17424s() {
            super("CharMatcher.whitespace()");
        }

        /* renamed from: b */
        public final boolean mo44912b(char c) {
            if (" 　\r   　 \u000b　   　 \t     \f 　 　　 \n 　".charAt((48906 * c) >>> f48385o) == c) {
                return true;
            }
            return false;
        }
    }

    protected C17405d() {
    }

    /* renamed from: a */
    private static C17405d m57890a() {
        return C17406a.f48365o;
    }

    /* renamed from: b */
    private static C17405d m57893b() {
        return C17421p.f48380o;
    }

    /* renamed from: c */
    private static C17405d m57894c() {
        return C17424s.f48386p;
    }

    /* renamed from: d */
    private static C17405d m57896d() {
        return C17408c.f48367o;
    }

    /* renamed from: e */
    private static C17405d m57897e() {
        return C17407b.f48366o;
    }

    /* renamed from: f */
    private static C17405d m57898f() {
        return C17409d.f48368o;
    }

    /* renamed from: g */
    private static C17405d m57899g() {
        return C17414i.f48373o;
    }

    /* renamed from: h */
    private static C17405d m57900h() {
        return C17416k.f48375o;
    }

    /* renamed from: i */
    private static C17405d m57901i() {
        return C17417l.f48376o;
    }

    /* renamed from: j */
    private static C17405d m57902j() {
        return C17419n.f48378o;
    }

    /* renamed from: k */
    private static C17405d m57903k() {
        return C17418m.f48377o;
    }

    /* renamed from: l */
    private static C17405d m57904l() {
        return C17415j.f48374o;
    }

    /* renamed from: m */
    private static C17405d m57905m() {
        return C17412g.f48371o;
    }

    /* renamed from: n */
    private static C17405d m57906n() {
        return C17423r.f48384o;
    }

    /* renamed from: b */
    public abstract boolean mo44912b(char c);

    public String toString() {
        return super.toString();
    }

    /* renamed from: a */
    public static C17405d m57891a(char c) {
        return new C17413h(c);
    }

    /* renamed from: c */
    public static String m57895c(char c) {
        String str = "0123456789ABCDEF";
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = str.charAt(c & 15);
            c = (char) (c >> 4);
        }
        return String.copyValueOf(cArr);
    }

    /* renamed from: a */
    public final boolean apply(Character ch) {
        return mo44912b(ch.charValue());
    }

    /* renamed from: a */
    public static C17405d m57892a(char c, char c2) {
        return new C17411f('A', 'Z');
    }

    /* renamed from: a */
    public int mo44909a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        C17439m.m57978b(i, length);
        while (i < length) {
            if (mo44912b(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
