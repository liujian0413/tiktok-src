package com.bytedance.apm.util;

import android.util.Base64;
import com.taobao.android.dexposed.ClassUtils;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.bytedance.apm.util.d */
public final class C9641d {
    /* renamed from: a */
    public static String m28529a(byte[] bArr) {
        byte[] bArr2;
        try {
            byte[] decode = Base64.decode(bArr, 0);
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec("yuNttCSojTyxZods".getBytes(), "AES");
                Cipher instance = Cipher.getInstance("AES/ECB/NoPadding");
                instance.init(2, secretKeySpec);
                bArr2 = instance.doFinal(decode);
            } catch (Exception unused) {
                bArr2 = new byte[0];
            }
            String str = new String(bArr2);
            int indexOf = str.indexOf(ClassUtils.INNER_CLASS_SEPARATOR);
            if (indexOf != -1) {
                str = str.substring(0, indexOf);
            }
            return str;
        } catch (Exception unused2) {
            return "";
        }
    }
}
