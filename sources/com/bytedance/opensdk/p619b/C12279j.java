package com.bytedance.opensdk.p619b;

import java.security.MessageDigest;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.opensdk.b.j */
public final class C12279j {

    /* renamed from: a */
    public static final C12279j f32619a = new C12279j();

    /* renamed from: b */
    private static final char[] f32620b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    private C12279j() {
    }

    /* renamed from: a */
    public static String m35692a(byte[] bArr) {
        C7573i.m23587b(bArr, "bytes");
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(bArr);
            byte[] digest = instance.digest();
            char[] cArr = new char[32];
            int i = 0;
            for (int i2 = 0; i2 <= 15; i2++) {
                byte b = digest[i2];
                int i3 = i + 1;
                cArr[i] = f32620b[15 & (b >>> 4)];
                i = i3 + 1;
                cArr[i3] = f32620b[b & 15];
            }
            return new String(cArr);
        } catch (Exception unused) {
            return null;
        }
    }
}
