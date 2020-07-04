package android.support.p022v4.p026d;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* renamed from: android.support.v4.d.a */
public final class C0705a {

    /* renamed from: a */
    static final C0712d f2670a = C0713e.f2705c;

    /* renamed from: b */
    static final C0705a f2671b = new C0705a(false, 2, f2670a);

    /* renamed from: c */
    static final C0705a f2672c = new C0705a(true, 2, f2670a);

    /* renamed from: e */
    private static final String f2673e = Character.toString(8206);

    /* renamed from: f */
    private static final String f2674f = Character.toString(8207);

    /* renamed from: d */
    public final boolean f2675d;

    /* renamed from: g */
    private final int f2676g;

    /* renamed from: h */
    private final C0712d f2677h;

    /* renamed from: android.support.v4.d.a$a */
    public static final class C0706a {

        /* renamed from: a */
        private boolean f2678a;

        /* renamed from: b */
        private int f2679b;

        /* renamed from: c */
        private C0712d f2680c;

        public C0706a() {
            m3012a(C0705a.m3003a(Locale.getDefault()));
        }

        /* renamed from: a */
        public final C0705a mo2853a() {
            if (this.f2679b == 2 && this.f2680c == C0705a.f2670a) {
                return m3013b(this.f2678a);
            }
            return new C0705a(this.f2678a, this.f2679b, this.f2680c);
        }

        public C0706a(boolean z) {
            m3012a(z);
        }

        /* renamed from: b */
        private static C0705a m3013b(boolean z) {
            if (z) {
                return C0705a.f2672c;
            }
            return C0705a.f2671b;
        }

        /* renamed from: a */
        private void m3012a(boolean z) {
            this.f2678a = z;
            this.f2680c = C0705a.f2670a;
            this.f2679b = 2;
        }
    }

    /* renamed from: android.support.v4.d.a$b */
    static class C0707b {

        /* renamed from: a */
        private static final byte[] f2681a = new byte[1792];

        /* renamed from: b */
        private final CharSequence f2682b;

        /* renamed from: c */
        private final boolean f2683c = false;

        /* renamed from: d */
        private final int f2684d;

        /* renamed from: e */
        private int f2685e;

        /* renamed from: f */
        private char f2686f;

        static {
            for (int i = 0; i < 1792; i++) {
                f2681a[i] = Character.getDirectionality(i);
            }
        }

        /* renamed from: g */
        private byte m3020g() {
            while (this.f2685e < this.f2684d) {
                CharSequence charSequence = this.f2682b;
                int i = this.f2685e;
                this.f2685e = i + 1;
                char charAt = charSequence.charAt(i);
                this.f2686f = charAt;
                if (charAt == ';') {
                    break;
                }
            }
            return 12;
        }

        /* renamed from: h */
        private byte m3021h() {
            int i = this.f2685e;
            while (this.f2685e > 0) {
                CharSequence charSequence = this.f2682b;
                int i2 = this.f2685e - 1;
                this.f2685e = i2;
                this.f2686f = charSequence.charAt(i2);
                if (this.f2686f != '&') {
                    if (this.f2686f == ';') {
                        break;
                    }
                } else {
                    return 12;
                }
            }
            this.f2685e = i;
            this.f2686f = ';';
            return 13;
        }

        /* renamed from: c */
        private byte m3016c() {
            this.f2686f = this.f2682b.charAt(this.f2685e);
            if (Character.isHighSurrogate(this.f2686f)) {
                int codePointAt = Character.codePointAt(this.f2682b, this.f2685e);
                this.f2685e += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f2685e++;
            byte a = m3015a(this.f2686f);
            if (this.f2683c) {
                if (this.f2686f == '<') {
                    a = m3018e();
                } else if (this.f2686f == '&') {
                    a = m3020g();
                }
            }
            return a;
        }

        /* renamed from: d */
        private byte m3017d() {
            this.f2686f = this.f2682b.charAt(this.f2685e - 1);
            if (Character.isLowSurrogate(this.f2686f)) {
                int codePointBefore = Character.codePointBefore(this.f2682b, this.f2685e);
                this.f2685e -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f2685e--;
            byte a = m3015a(this.f2686f);
            if (this.f2683c) {
                if (this.f2686f == '>') {
                    a = m3019f();
                } else if (this.f2686f == ';') {
                    a = m3021h();
                }
            }
            return a;
        }

        /* renamed from: e */
        private byte m3018e() {
            int i = this.f2685e;
            while (this.f2685e < this.f2684d) {
                CharSequence charSequence = this.f2682b;
                int i2 = this.f2685e;
                this.f2685e = i2 + 1;
                this.f2686f = charSequence.charAt(i2);
                if (this.f2686f == '>') {
                    return 12;
                }
                if (this.f2686f == '\"' || this.f2686f == '\'') {
                    char c = this.f2686f;
                    while (this.f2685e < this.f2684d) {
                        CharSequence charSequence2 = this.f2682b;
                        int i3 = this.f2685e;
                        this.f2685e = i3 + 1;
                        char charAt = charSequence2.charAt(i3);
                        this.f2686f = charAt;
                        if (charAt == c) {
                            break;
                        }
                    }
                }
            }
            this.f2685e = i;
            this.f2686f = '<';
            return 13;
        }

        /* renamed from: f */
        private byte m3019f() {
            int i = this.f2685e;
            while (this.f2685e > 0) {
                CharSequence charSequence = this.f2682b;
                int i2 = this.f2685e - 1;
                this.f2685e = i2;
                this.f2686f = charSequence.charAt(i2);
                if (this.f2686f != '<') {
                    if (this.f2686f == '>') {
                        break;
                    } else if (this.f2686f == '\"' || this.f2686f == '\'') {
                        char c = this.f2686f;
                        while (this.f2685e > 0) {
                            CharSequence charSequence2 = this.f2682b;
                            int i3 = this.f2685e - 1;
                            this.f2685e = i3;
                            char charAt = charSequence2.charAt(i3);
                            this.f2686f = charAt;
                            if (charAt == c) {
                                break;
                            }
                        }
                    }
                } else {
                    return 12;
                }
            }
            this.f2685e = i;
            this.f2686f = '>';
            return 13;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final int mo2854a() {
            this.f2685e = 0;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (this.f2685e < this.f2684d && i == 0) {
                byte c = m3016c();
                if (c != 9) {
                    switch (c) {
                        case 0:
                            if (i3 == 0) {
                                return -1;
                            }
                            break;
                        case 1:
                        case 2:
                            if (i3 == 0) {
                                return 1;
                            }
                            break;
                        default:
                            switch (c) {
                                case 14:
                                case 15:
                                    i3++;
                                    i2 = -1;
                                    continue;
                                case 16:
                                case 17:
                                    i3++;
                                    i2 = 1;
                                    continue;
                                case 18:
                                    i3--;
                                    i2 = 0;
                                    continue;
                                    continue;
                            }
                    }
                    i = i3;
                }
            }
            if (i == 0) {
                return 0;
            }
            if (i2 != 0) {
                return i2;
            }
            while (this.f2685e > 0) {
                switch (m3017d()) {
                    case 14:
                    case 15:
                        if (i != i3) {
                            i3--;
                            break;
                        } else {
                            return -1;
                        }
                    case 16:
                    case 17:
                        if (i != i3) {
                            i3--;
                            break;
                        } else {
                            return 1;
                        }
                    case 18:
                        i3++;
                        break;
                }
            }
            return 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int mo2855b() {
            /*
                r6 = this;
                int r0 = r6.f2684d
                r6.f2685e = r0
                r0 = 0
                r1 = 0
                r2 = 0
            L_0x0007:
                int r3 = r6.f2685e
                if (r3 <= 0) goto L_0x003a
                byte r3 = r6.m3017d()
                r4 = 9
                if (r3 == r4) goto L_0x0007
                r4 = 1
                r5 = -1
                switch(r3) {
                    case 0: goto L_0x0033;
                    case 1: goto L_0x002d;
                    case 2: goto L_0x002d;
                    default: goto L_0x0018;
                }
            L_0x0018:
                switch(r3) {
                    case 14: goto L_0x0027;
                    case 15: goto L_0x0027;
                    case 16: goto L_0x0021;
                    case 17: goto L_0x0021;
                    case 18: goto L_0x001e;
                    default: goto L_0x001b;
                }
            L_0x001b:
                if (r1 != 0) goto L_0x0007
                goto L_0x0038
            L_0x001e:
                int r2 = r2 + 1
                goto L_0x0007
            L_0x0021:
                if (r1 != r2) goto L_0x0024
                return r4
            L_0x0024:
                int r2 = r2 + -1
                goto L_0x0007
            L_0x0027:
                if (r1 != r2) goto L_0x002a
                return r5
            L_0x002a:
                int r2 = r2 + -1
                goto L_0x0007
            L_0x002d:
                if (r2 != 0) goto L_0x0030
                return r4
            L_0x0030:
                if (r1 != 0) goto L_0x0007
                goto L_0x0038
            L_0x0033:
                if (r2 != 0) goto L_0x0036
                return r5
            L_0x0036:
                if (r1 != 0) goto L_0x0007
            L_0x0038:
                r1 = r2
                goto L_0x0007
            L_0x003a:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p022v4.p026d.C0705a.C0707b.mo2855b():int");
        }

        /* renamed from: a */
        private static byte m3015a(char c) {
            if (c < 1792) {
                return f2681a[c];
            }
            return Character.getDirectionality(c);
        }

        C0707b(CharSequence charSequence, boolean z) {
            this.f2682b = charSequence;
            this.f2684d = charSequence.length();
        }
    }

    /* renamed from: a */
    public static C0705a m2998a() {
        return new C0706a().mo2853a();
    }

    /* renamed from: b */
    private boolean m3005b() {
        if ((this.f2676g & 2) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final CharSequence mo2850a(CharSequence charSequence) {
        return m3000a(charSequence, this.f2677h, true);
    }

    /* renamed from: b */
    public final String mo2852b(String str) {
        return m3002a(str, this.f2677h, true);
    }

    /* renamed from: c */
    private static int m3007c(CharSequence charSequence) {
        return new C0707b(charSequence, false).mo2855b();
    }

    /* renamed from: d */
    private static int m3008d(CharSequence charSequence) {
        return new C0707b(charSequence, false).mo2854a();
    }

    /* renamed from: a */
    public static C0705a m2999a(boolean z) {
        return new C0706a(z).mo2853a();
    }

    /* renamed from: b */
    private boolean m3006b(CharSequence charSequence) {
        return this.f2677h.mo2875a(charSequence, 0, charSequence.length());
    }

    /* renamed from: a */
    static boolean m3003a(Locale locale) {
        if (C0720f.m3043a(locale) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo2851a(String str) {
        return m3006b((CharSequence) str);
    }

    /* renamed from: a */
    private String m3001a(CharSequence charSequence, C0712d dVar) {
        boolean a = dVar.mo2875a(charSequence, 0, charSequence.length());
        if (!this.f2675d && (a || m3007c(charSequence) == 1)) {
            return f2673e;
        }
        if (!this.f2675d || (a && m3007c(charSequence) != -1)) {
            return "";
        }
        return f2674f;
    }

    /* renamed from: b */
    private String m3004b(CharSequence charSequence, C0712d dVar) {
        boolean a = dVar.mo2875a(charSequence, 0, charSequence.length());
        if (!this.f2675d && (a || m3008d(charSequence) == 1)) {
            return f2673e;
        }
        if (!this.f2675d || (a && m3008d(charSequence) != -1)) {
            return "";
        }
        return f2674f;
    }

    C0705a(boolean z, int i, C0712d dVar) {
        this.f2675d = z;
        this.f2676g = i;
        this.f2677h = dVar;
    }

    /* renamed from: a */
    private CharSequence m3000a(CharSequence charSequence, C0712d dVar, boolean z) {
        C0712d dVar2;
        char c;
        C0712d dVar3;
        if (charSequence == null) {
            return null;
        }
        boolean a = dVar.mo2875a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (m3005b() && z) {
            if (a) {
                dVar3 = C0713e.f2704b;
            } else {
                dVar3 = C0713e.f2703a;
            }
            spannableStringBuilder.append(m3004b(charSequence, dVar3));
        }
        if (a != this.f2675d) {
            if (a) {
                c = 8235;
            } else {
                c = 8234;
            }
            spannableStringBuilder.append(c);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            if (a) {
                dVar2 = C0713e.f2704b;
            } else {
                dVar2 = C0713e.f2703a;
            }
            spannableStringBuilder.append(m3001a(charSequence, dVar2));
        }
        return spannableStringBuilder;
    }

    /* renamed from: a */
    private String m3002a(String str, C0712d dVar, boolean z) {
        if (str == null) {
            return null;
        }
        return m3000a((CharSequence) str, dVar, true).toString();
    }
}
