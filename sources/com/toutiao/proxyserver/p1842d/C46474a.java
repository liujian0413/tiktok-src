package com.toutiao.proxyserver.p1842d;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.toutiao.proxyserver.d.a */
public class C46474a {

    /* renamed from: a */
    private static final MessageDigest f119753a = m146104a();

    /* renamed from: b */
    private static final char[] f119754b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    private C46474a() {
    }

    /* renamed from: a */
    private static MessageDigest m146104a() {
        try {
            return MessageDigest.getInstance("md5");
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m146102a(String str) {
        byte[] digest;
        MessageDigest messageDigest = f119753a;
        if (messageDigest == null) {
            return "";
        }
        byte[] bytes = str.getBytes(C46476c.f119755a);
        synchronized (C46474a.class) {
            digest = messageDigest.digest(bytes);
        }
        return m146103a(digest);
    }

    /* renamed from: a */
    private static String m146103a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        char[] cArr = new char[(bArr.length << 1)];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            cArr[i] = f119754b[(b & 240) >> 4];
            i = i2 + 1;
            cArr[i2] = f119754b[b & 15];
        }
        return new String(cArr);
    }
}
