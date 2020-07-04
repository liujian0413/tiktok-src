package com.google.api.client.repackaged.org.apache.commons.codec.p781a;

import java.io.UnsupportedEncodingException;

/* renamed from: com.google.api.client.repackaged.org.apache.commons.codec.a.c */
public final class C17333c {
    /* renamed from: a */
    public static String m57729a(byte[] bArr) {
        return m57730a(bArr, "UTF-8");
    }

    /* renamed from: a */
    public static byte[] m57731a(String str) {
        return m57732a(str, "UTF-8");
    }

    /* renamed from: a */
    private static String m57730a(byte[] bArr, String str) {
        if (bArr == null) {
            return null;
        }
        try {
            return new String(bArr, str);
        } catch (UnsupportedEncodingException e) {
            throw m57728a(str, e);
        }
    }

    /* renamed from: a */
    private static IllegalStateException m57728a(String str, UnsupportedEncodingException unsupportedEncodingException) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(": ");
        sb.append(unsupportedEncodingException);
        return new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    private static byte[] m57732a(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            return str.getBytes(str2);
        } catch (UnsupportedEncodingException e) {
            throw m57728a(str2, e);
        }
    }
}
