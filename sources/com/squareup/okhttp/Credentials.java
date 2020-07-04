package com.squareup.okhttp;

import java.io.UnsupportedEncodingException;
import okio.ByteString;

public final class Credentials {
    private Credentials() {
    }

    public static String basic(String str, String str2) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(":");
            sb.append(str2);
            String base64 = ByteString.m23795of(sb.toString().getBytes("ISO-8859-1")).base64();
            StringBuilder sb2 = new StringBuilder("Basic ");
            sb2.append(base64);
            return sb2.toString();
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError();
        }
    }
}
