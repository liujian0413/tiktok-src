package com.p280ss.android.ugc.aweme.utils;

import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.ss.android.ugc.aweme.utils.l */
public final class C43145l {
    /* renamed from: a */
    public static boolean m136849a() {
        return TextUtils.equals(m136850b(), "aea615ab910015038f73c47e45d21466");
    }

    /* renamed from: b */
    private static String m136850b() {
        try {
            return m136848a(AwemeApplication.m21341a().getPackageManager().getPackageInfo(AwemeApplication.m21341a().getPackageName(), 64).signatures[0].toByteArray());
        } catch (NameNotFoundException unused) {
            return "";
        }
    }

    /* renamed from: a */
    private static String m136848a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.reset();
            instance.update(bArr);
            byte[] digest = instance.digest();
            for (int i = 0; i < digest.length; i++) {
                if (Integer.toHexString(digest[i] & 255).length() == 1) {
                    stringBuffer.append("0");
                    stringBuffer.append(Integer.toHexString(digest[i] & 255));
                } else {
                    stringBuffer.append(Integer.toHexString(digest[i] & 255));
                }
            }
        } catch (NoSuchAlgorithmException unused) {
        }
        return stringBuffer.toString();
    }
}
