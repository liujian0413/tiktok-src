package com.snapchat.kit.sdk.core.security;

import android.content.SharedPreferences;
import com.google.gson.C6600e;
import com.google.gson.JsonParseException;

/* renamed from: com.snapchat.kit.sdk.core.security.h */
public final class C18701h implements KeyValueStore {

    /* renamed from: a */
    private final SharedPreferences f50502a;

    /* renamed from: b */
    private final EncryptDecryptAlgorithm f50503b;

    /* renamed from: c */
    private final C6600e f50504c;

    public final void clearEntry(String str) {
        this.f50502a.edit().remove(str).apply();
    }

    public final void put(String str, Object obj) {
        putString(str, this.f50504c.mo15979b(obj));
    }

    public final <T> T get(String str, Class<T> cls) {
        String string = getString(str, null);
        if (string == null) {
            return null;
        }
        try {
            return this.f50504c.mo15974a(string, cls);
        } catch (JsonParseException unused) {
            clearEntry(str);
            return null;
        }
    }

    public final String getString(String str, String str2) {
        String string = this.f50502a.getString(str, null);
        if (string == null) {
            return str2;
        }
        String decrypt = this.f50503b.decrypt(string);
        if (decrypt != null) {
            return decrypt;
        }
        clearEntry(str);
        return str2;
    }

    public final void putString(String str, String str2) {
        String str3;
        if (str2 == null) {
            str3 = null;
        } else {
            str3 = this.f50503b.encrypt(str2);
        }
        this.f50502a.edit().putString(str, str3).apply();
    }

    public C18701h(SharedPreferences sharedPreferences, EncryptDecryptAlgorithm encryptDecryptAlgorithm, C6600e eVar) {
        this.f50502a = sharedPreferences;
        this.f50503b = encryptDecryptAlgorithm;
        this.f50504c = eVar;
    }
}
