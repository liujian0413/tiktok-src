package com.google.android.gms.common.server.response;

import com.google.android.gms.common.server.response.FastJsonResponse;
import java.math.BigDecimal;
import java.math.BigInteger;

public final class FastParser<T extends FastJsonResponse> {

    /* renamed from: a */
    private static final char[] f39517a = {'u', 'l', 'l'};

    /* renamed from: b */
    private static final char[] f39518b = {'r', 'u', 'e'};

    /* renamed from: c */
    private static final char[] f39519c = {'r', 'u', 'e', '\"'};

    /* renamed from: d */
    private static final char[] f39520d = {'a', 'l', 's', 'e'};

    /* renamed from: e */
    private static final char[] f39521e = {'a', 'l', 's', 'e', '\"'};

    /* renamed from: f */
    private static final char[] f39522f = {10};

    /* renamed from: g */
    private static final C15293a<Integer> f39523g = new C15294a();

    /* renamed from: h */
    private static final C15293a<Long> f39524h = new C15295b();

    /* renamed from: i */
    private static final C15293a<Float> f39525i = new C15296c();

    /* renamed from: j */
    private static final C15293a<Double> f39526j = new C15297d();

    /* renamed from: k */
    private static final C15293a<Boolean> f39527k = new C15298e();

    /* renamed from: l */
    private static final C15293a<String> f39528l = new C15299f();

    /* renamed from: m */
    private static final C15293a<BigInteger> f39529m = new C15300g();

    /* renamed from: n */
    private static final C15293a<BigDecimal> f39530n = new C15301h();

    public static class ParseException extends Exception {
        public ParseException(String str) {
            super(str);
        }

        public ParseException(String str, Throwable th) {
            super(str, th);
        }

        public ParseException(Throwable th) {
            super(th);
        }
    }

    /* renamed from: com.google.android.gms.common.server.response.FastParser$a */
    interface C15293a<O> {
    }
}
