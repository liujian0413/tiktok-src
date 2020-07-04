package com.snapchat.kit.sdk.core.security;

import android.util.Base64;

/* renamed from: com.snapchat.kit.sdk.core.security.d */
public final class C18695d implements EncryptDecryptAlgorithm {
    public final String decrypt(String str) {
        if (str == null) {
            return null;
        }
        return new String(Base64.decode(str, 0));
    }

    public final String encrypt(String str) {
        if (str == null) {
            return null;
        }
        return Base64.encodeToString(str.getBytes(), 0);
    }
}
