package com.bytedance.retrofit2.mime;

import java.io.UnsupportedEncodingException;

public class TypedString extends TypedByteArray {
    public String toString() {
        try {
            StringBuilder sb = new StringBuilder("TypedString[");
            sb.append(new String(getBytes(), "UTF-8"));
            sb.append("]");
            return sb.toString();
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError("Must be able to decode UTF-8");
        }
    }

    public TypedString(String str) {
        super("text/plain; charset=UTF-8", convertToBytes(str), new String[0]);
    }

    private static byte[] convertToBytes(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
