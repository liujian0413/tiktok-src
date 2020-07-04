package com.google.api.client.repackaged.com.google.common.base;

import java.util.Arrays;

/* renamed from: com.google.api.client.repackaged.com.google.common.base.c */
public abstract class C17303c {

    /* renamed from: a */
    public static final C17303c f48178a = new C17303c() {
        /* renamed from: b */
        public final boolean mo44751b(char c) {
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
            return "CharMatcher.BREAKING_WHITESPACE";
        }
    };

    /* renamed from: b */
    public static final C17303c f48179b = m57647a(0, 127, "CharMatcher.ASCII");

    /* renamed from: c */
    public static final C17303c f48180c = new C17317c("CharMatcher.DIGIT", "0٠۰߀०০੦૦୦௦౦೦൦๐໐༠၀႐០᠐᥆᧐᭐᮰᱀᱐꘠꣐꤀꩐０".toCharArray(), f48193q.toCharArray());

    /* renamed from: d */
    public static final C17303c f48181d = new C17303c("CharMatcher.JAVA_DIGIT") {
        /* renamed from: b */
        public final boolean mo44751b(char c) {
            return Character.isDigit(c);
        }
    };

    /* renamed from: e */
    public static final C17303c f48182e = new C17303c("CharMatcher.JAVA_LETTER") {
        /* renamed from: b */
        public final boolean mo44751b(char c) {
            return Character.isLetter(c);
        }
    };

    /* renamed from: f */
    public static final C17303c f48183f = new C17303c("CharMatcher.JAVA_LETTER_OR_DIGIT") {
        /* renamed from: b */
        public final boolean mo44751b(char c) {
            return Character.isLetterOrDigit(c);
        }
    };

    /* renamed from: g */
    public static final C17303c f48184g = new C17303c("CharMatcher.JAVA_UPPER_CASE") {
        /* renamed from: b */
        public final boolean mo44751b(char c) {
            return Character.isUpperCase(c);
        }
    };

    /* renamed from: h */
    public static final C17303c f48185h = new C17303c("CharMatcher.JAVA_LOWER_CASE") {
        /* renamed from: b */
        public final boolean mo44751b(char c) {
            return Character.isLowerCase(c);
        }
    };

    /* renamed from: i */
    public static final C17303c f48186i = m57646a(0, 31).mo44749a(m57646a(127, 159)).mo44750a("CharMatcher.JAVA_ISO_CONTROL");

    /* renamed from: j */
    public static final C17303c f48187j = new C17317c("CharMatcher.INVISIBLE", "\u0000­؀؜۝܏ ᠎   ⁦⁧⁨⁩⁪　?﻿￹￺".toCharArray(), "  ­؄؜۝܏ ᠎‏ ⁤⁦⁧⁨⁩⁯　﻿￹￻".toCharArray());

    /* renamed from: k */
    public static final C17303c f48188k = new C17317c("CharMatcher.SINGLE_WIDTH", "\u0000־א׳؀ݐ฀Ḁ℀ﭐﹰ｡".toCharArray(), "ӹ־ת״ۿݿ๿₯℺﷿﻿ￜ".toCharArray());

    /* renamed from: l */
    public static final C17303c f48189l = new C17315a("CharMatcher.ANY") {
        /* renamed from: b */
        public final boolean mo44751b(char c) {
            return true;
        }

        /* renamed from: a */
        public final C17303c mo44749a(C17303c cVar) {
            C17321g.m57682a(cVar);
            return this;
        }

        /* renamed from: a */
        public final int mo44748a(CharSequence charSequence, int i) {
            int length = charSequence.length();
            C17321g.m57680a(i, length);
            if (i == length) {
                return -1;
            }
            return i;
        }
    };

    /* renamed from: m */
    public static final C17303c f48190m = new C17315a("CharMatcher.NONE") {
        /* renamed from: b */
        public final boolean mo44751b(char c) {
            return false;
        }

        /* renamed from: a */
        public final C17303c mo44749a(C17303c cVar) {
            return (C17303c) C17321g.m57682a(cVar);
        }

        /* renamed from: a */
        public final int mo44748a(CharSequence charSequence, int i) {
            C17321g.m57680a(i, charSequence.length());
            return -1;
        }
    };

    /* renamed from: o */
    static final int f48191o = Integer.numberOfLeadingZeros(31);

    /* renamed from: p */
    public static final C17303c f48192p = new C17315a("WHITESPACE") {
        /* renamed from: b */
        public final boolean mo44751b(char c) {
            if (" 　\r   　 \u000b　   　 \t     \f 　 　　 \n 　".charAt((48906 * c) >>> f48191o) == c) {
                return true;
            }
            return false;
        }
    };

    /* renamed from: q */
    private static final String f48193q;

    /* renamed from: n */
    final String f48194n;

    /* renamed from: com.google.api.client.repackaged.com.google.common.base.c$a */
    static abstract class C17315a extends C17303c {
        C17315a(String str) {
            super(str);
        }
    }

    /* renamed from: com.google.api.client.repackaged.com.google.common.base.c$b */
    static class C17316b extends C17303c {

        /* renamed from: q */
        final C17303c f48198q;

        /* renamed from: r */
        final C17303c f48199r;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C17303c mo44750a(String str) {
            return new C17316b(this.f48198q, this.f48199r, str);
        }

        /* renamed from: b */
        public final boolean mo44751b(char c) {
            if (this.f48198q.mo44751b(c) || this.f48199r.mo44751b(c)) {
                return true;
            }
            return false;
        }

        C17316b(C17303c cVar, C17303c cVar2) {
            StringBuilder sb = new StringBuilder("CharMatcher.or(");
            sb.append(cVar);
            sb.append(", ");
            sb.append(cVar2);
            sb.append(")");
            this(cVar, cVar2, sb.toString());
        }

        private C17316b(C17303c cVar, C17303c cVar2, String str) {
            super(str);
            this.f48198q = (C17303c) C17321g.m57682a(cVar);
            this.f48199r = (C17303c) C17321g.m57682a(cVar2);
        }
    }

    /* renamed from: com.google.api.client.repackaged.com.google.common.base.c$c */
    static class C17317c extends C17303c {

        /* renamed from: q */
        private final char[] f48200q;

        /* renamed from: r */
        private final char[] f48201r;

        /* renamed from: b */
        public final boolean mo44751b(char c) {
            int binarySearch = Arrays.binarySearch(this.f48200q, c);
            if (binarySearch >= 0) {
                return true;
            }
            int i = (binarySearch ^ -1) - 1;
            if (i < 0 || c > this.f48201r[i]) {
                return false;
            }
            return true;
        }

        C17317c(String str, char[] cArr, char[] cArr2) {
            boolean z;
            boolean z2;
            boolean z3;
            super(str);
            this.f48200q = cArr;
            this.f48201r = cArr2;
            if (cArr.length == cArr2.length) {
                z = true;
            } else {
                z = false;
            }
            C17321g.m57686a(z);
            int i = 0;
            while (i < cArr.length) {
                if (cArr[i] <= cArr2[i]) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C17321g.m57686a(z2);
                int i2 = i + 1;
                if (i2 < cArr.length) {
                    if (cArr2[i] < cArr[i2]) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    C17321g.m57686a(z3);
                }
                i = i2;
            }
        }
    }

    /* renamed from: b */
    public abstract boolean mo44751b(char c);

    public String toString() {
        return this.f48194n;
    }

    protected C17303c() {
        this.f48194n = super.toString();
    }

    static {
        StringBuilder sb = new StringBuilder(31);
        for (int i = 0; i < 31; i++) {
            sb.append((char) ("0٠۰߀०০੦૦୦௦౦೦൦๐໐༠၀႐០᠐᥆᧐᭐᮰᱀᱐꘠꣐꤀꩐０".charAt(i) + 9));
        }
        f48193q = sb.toString();
    }

    C17303c(String str) {
        this.f48194n = str;
    }

    /* renamed from: a */
    public C17303c mo44749a(C17303c cVar) {
        return new C17316b(this, (C17303c) C17321g.m57682a(cVar));
    }

    /* renamed from: a */
    public static C17303c m57645a(final char c) {
        StringBuilder sb = new StringBuilder("CharMatcher.is('");
        sb.append(m57648c(c));
        sb.append("')");
        return new C17315a(sb.toString()) {
            /* renamed from: b */
            public final boolean mo44751b(char c) {
                if (c == c) {
                    return true;
                }
                return false;
            }

            /* renamed from: a */
            public final C17303c mo44749a(C17303c cVar) {
                if (cVar.mo44751b(c)) {
                    return cVar;
                }
                return super.mo44749a(cVar);
            }
        };
    }

    /* renamed from: c */
    private static String m57648c(char c) {
        String str = "0123456789ABCDEF";
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = str.charAt(c & 15);
            c = (char) (c >> 4);
        }
        return String.copyValueOf(cArr);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C17303c mo44750a(String str) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    private static C17303c m57646a(char c, char c2) {
        boolean z;
        if (c2 >= c) {
            z = true;
        } else {
            z = false;
        }
        C17321g.m57686a(z);
        StringBuilder sb = new StringBuilder("CharMatcher.inRange('");
        sb.append(m57648c(c));
        sb.append("', '");
        sb.append(m57648c(c2));
        sb.append("')");
        return m57647a(c, c2, sb.toString());
    }

    /* renamed from: a */
    public int mo44748a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        C17321g.m57680a(i, length);
        while (i < length) {
            if (mo44751b(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: a */
    private static C17303c m57647a(final char c, final char c2, String str) {
        return new C17315a(str) {
            /* renamed from: b */
            public final boolean mo44751b(char c) {
                if (c > c || c > c2) {
                    return false;
                }
                return true;
            }
        };
    }
}
