package com.bytedance.android.p089a.p090a.p098h;

import android.text.TextUtils;
import com.C1642a;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.bytedance.android.a.a.h.e */
public final class C2234e {
    /* renamed from: b */
    public static String m9613b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (Throwable unused) {
            return str;
        }
    }

    /* renamed from: a */
    public static String m9612a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                byte b2 = b & 255;
                if (b2 < 16) {
                    sb.append(0);
                }
                sb.append(Integer.toString(b2, 16));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static String m9614c(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            StringBuilder sb = new StringBuilder();
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt > 31) {
                    if (charAt < 127) {
                        sb.append(charAt);
                    }
                }
                sb.append(C1642a.m8034a("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
            }
            return sb.toString();
        } catch (Throwable unused) {
            return str;
        }
    }
}
