package com.airbnb.lottie;

import java.util.Map;

/* renamed from: com.airbnb.lottie.q */
public final class C1841q {

    /* renamed from: a */
    public boolean f6648a;

    /* renamed from: b */
    private final Map<String, String> f6649b;

    /* renamed from: b */
    private static String m8607b(String str) {
        return str;
    }

    /* renamed from: a */
    public final String mo7340a(String str) {
        if (this.f6648a && this.f6649b.containsKey(str)) {
            return (String) this.f6649b.get(str);
        }
        String b = m8607b(str);
        if (this.f6648a) {
            this.f6649b.put(str, b);
        }
        return b;
    }
}
