package com.p280ss.android.ugc.aweme.flow.manager.impl;

import android.text.TextUtils;
import android.util.Base64;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.ss.android.ugc.aweme.flow.manager.impl.b */
public final class C21733b {

    /* renamed from: a */
    private final String f58215a = "UTF-8";

    /* renamed from: b */
    private final String f58216b = "DSA";

    /* renamed from: a */
    private static PublicKey m72663a(String str) throws Exception {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return KeyFactory.getInstance("DSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str.getBytes("UTF-8"), 0)));
    }

    /* renamed from: b */
    private static PrivateKey m72664b(String str) throws Exception {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return KeyFactory.getInstance("DSA").generatePrivate(new PKCS8EncodedKeySpec(Base64.decode(str.getBytes("UTF-8"), 0)));
    }

    /* renamed from: a */
    public static String m72662a(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Entry entry : map.entrySet()) {
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append((String) entry.getKey());
            sb.append("=");
            sb.append((String) entry.getValue());
        }
        return sb.toString();
    }

    /* renamed from: a */
    public final String mo58025a(String str, Map<String, String> map) throws Exception {
        if (TextUtils.isEmpty(str) || map == null || map.isEmpty()) {
            return "";
        }
        byte[] bytes = m72662a(map).getBytes("UTF-8");
        Signature instance = Signature.getInstance("DSA");
        instance.initSign(m72664b(str));
        instance.update(bytes);
        return new String(Base64.encode(instance.sign(), 0));
    }

    /* renamed from: a */
    public final boolean mo58026a(String str, String str2, Map<String, String> map) throws Exception {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || map == null || map.isEmpty()) {
            return false;
        }
        byte[] bytes = m72662a(map).getBytes("UTF-8");
        byte[] decode = Base64.decode(str.getBytes("UTF-8"), 0);
        Signature instance = Signature.getInstance("DSA");
        instance.initVerify(m72663a(str2));
        instance.update(bytes);
        return instance.verify(decode);
    }
}
