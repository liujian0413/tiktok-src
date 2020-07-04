package com.google.api.client.util.p782a;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/* renamed from: com.google.api.client.util.a.a */
public final class C17340a {

    /* renamed from: a */
    private static final C17341b f48252a = new C17342c("-_.*", true);

    /* renamed from: b */
    private static final C17341b f48253b = new C17342c("-_.!~*'()@:$&,;=", false);

    /* renamed from: c */
    private static final C17341b f48254c = new C17342c("-_.!~*'()@:$&,;=+/?", false);

    /* renamed from: d */
    private static final C17341b f48255d = new C17342c("-_.!~*'():$&,;=", false);

    /* renamed from: e */
    private static final C17341b f48256e = new C17342c("-_.!~*'()@:$,;/?:", false);

    /* renamed from: a */
    public static String m57752a(String str) {
        return f48252a.mo44809a(str);
    }

    /* renamed from: c */
    public static String m57754c(String str) {
        return f48253b.mo44809a(str);
    }

    /* renamed from: d */
    public static String m57755d(String str) {
        return f48254c.mo44809a(str);
    }

    /* renamed from: e */
    public static String m57756e(String str) {
        return f48255d.mo44809a(str);
    }

    /* renamed from: f */
    public static String m57757f(String str) {
        return f48256e.mo44809a(str);
    }

    /* renamed from: b */
    public static String m57753b(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
