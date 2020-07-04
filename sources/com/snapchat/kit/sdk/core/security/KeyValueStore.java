package com.snapchat.kit.sdk.core.security;

public interface KeyValueStore {
    void clearEntry(String str);

    <T> T get(String str, Class<T> cls);

    String getString(String str, String str2);

    void put(String str, Object obj);

    void putString(String str, String str2);
}
