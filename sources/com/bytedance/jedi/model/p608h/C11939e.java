package com.bytedance.jedi.model.p608h;

import com.p049a.p050a.C1643a;
import com.p049a.p050a.C1645c;
import com.p049a.p050a.C1646d;

/* renamed from: com.bytedance.jedi.model.h.e */
public final class C11939e implements C1643a {

    /* renamed from: a */
    private final C1645c f31818a;

    /* renamed from: b */
    private final String f31819b;

    /* renamed from: com.bytedance.jedi.model.h.e$a */
    public static class C11941a {

        /* renamed from: a */
        C1645c f31820a;

        /* renamed from: b */
        String f31821b;

        private C11941a() {
            this.f31821b = "PRETTY_LOGGER";
        }

        /* renamed from: a */
        public final C11939e mo29551a() {
            if (this.f31820a == null) {
                this.f31820a = new C1646d();
            }
            return new C11939e(this);
        }

        /* renamed from: a */
        public final C11941a mo29550a(String str) {
            this.f31821b = str;
            return this;
        }
    }

    /* renamed from: a */
    public static C11941a m34983a() {
        return new C11941a();
    }

    private C11939e(C11941a aVar) {
        m34984a((T) aVar);
        this.f31818a = aVar.f31820a;
        this.f31819b = aVar.f31821b;
    }

    /* renamed from: a */
    private static <T> T m34984a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    private String m34985a(String str) {
        if (m34987a((CharSequence) str) || m34988a((CharSequence) this.f31819b, (CharSequence) str)) {
            return this.f31819b;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f31819b);
        sb.append("-");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    private static boolean m34987a(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private void m34989b(int i, String str) {
        m34991c(i, str, "└────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
    }

    /* renamed from: a */
    private void m34986a(int i, String str) {
        m34991c(i, str, "┌────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
    }

    /* renamed from: a */
    private static boolean m34988a(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == charSequence2) {
            return true;
        }
        if (!(charSequence == null || charSequence2 == null)) {
            int length = charSequence.length();
            if (length == charSequence2.length()) {
                if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
                    return charSequence.equals(charSequence2);
                }
                for (int i = 0; i < length; i++) {
                    if (charSequence.charAt(i) != charSequence2.charAt(i)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private void m34991c(int i, String str, String str2) {
        m34984a((T) str2);
        this.f31818a.mo7035a(i, str, str2);
    }

    /* renamed from: b */
    private void m34990b(int i, String str, String str2) {
        String[] split;
        m34984a((T) str2);
        for (String str3 : str2.split(System.getProperty("line.separator"))) {
            StringBuilder sb = new StringBuilder("│ ");
            sb.append(str3);
            m34991c(i, str, sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo7032a(int i, String str, String str2) {
        m34984a((T) str2);
        String a = m34985a(str);
        m34986a(i, a);
        byte[] bytes = str2.getBytes();
        int length = bytes.length;
        if (length <= 4000) {
            m34990b(i, a, str2);
            m34989b(i, a);
            return;
        }
        for (int i2 = 0; i2 < length; i2 += 4000) {
            m34990b(i, a, new String(bytes, i2, Math.min(length - i2, 4000)));
        }
        m34989b(i, a);
    }
}
