package com.snapchat.kit.sdk.core.security;

public interface EncryptDecryptAlgorithm {
    String decrypt(String str);

    String encrypt(String str);
}
