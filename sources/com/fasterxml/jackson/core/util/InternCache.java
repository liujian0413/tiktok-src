package com.fasterxml.jackson.core.util;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public final class InternCache extends LinkedHashMap<String, String> {
    public static final InternCache instance = new InternCache();

    private InternCache() {
        super(100, 0.8f, true);
    }

    /* access modifiers changed from: protected */
    public final boolean removeEldestEntry(Entry<String, String> entry) {
        if (size() > 100) {
            return true;
        }
        return false;
    }

    public final synchronized String intern(String str) {
        String str2;
        str2 = (String) get(str);
        if (str2 == null) {
            str2 = str.intern();
            put(str2, str2);
        }
        return str2;
    }
}
