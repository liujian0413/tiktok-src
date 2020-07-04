package com.p280ss.android.p817ad.p818a.p822c;

import android.text.TextUtils;
import com.C1642a;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.ss.android.ad.a.c.b */
public final class C18934b {
    /* renamed from: a */
    public static String m61795a(String str) throws Exception {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String a = C1642a.m8034a("auth-v1/%s/%d/%d", new Object[]{"4b84eca04238efc6c4ffb4b797ad1494", Long.valueOf(System.currentTimeMillis() / 1000), Integer.valueOf(1800)});
        return C1642a.m8034a("%s/%s", new Object[]{a, m61796a(m61796a("d1b0973d6fec41e693c00611e45c19a9", a.getBytes()), str.getBytes())});
    }

    /* renamed from: a */
    private static String m61796a(String str, byte[] bArr) throws Exception {
        Mac instance = Mac.getInstance("HmacSHA256");
        instance.init(new SecretKeySpec(str.getBytes(), "HmacSHA256"));
        byte[] doFinal = instance.doFinal(bArr);
        byte[] bArr2 = new byte[(doFinal.length * 2)];
        for (int i = 0; i < doFinal.length; i++) {
            byte[] bytes = C1642a.m8034a("%02x", new Object[]{Integer.valueOf(doFinal[i] & 255)}).getBytes();
            int i2 = i * 2;
            bArr2[i2] = bytes[0];
            bArr2[i2 + 1] = bytes[1];
        }
        return new String(bArr2);
    }
}
