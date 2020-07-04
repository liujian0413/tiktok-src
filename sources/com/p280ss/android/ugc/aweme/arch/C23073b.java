package com.p280ss.android.ugc.aweme.arch;

import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.arch.b */
public final class C23073b<K, V> {

    /* renamed from: a */
    private HashMap<K, V> f60900a = new HashMap<>();

    /* renamed from: a */
    public final <T> T mo60119a(K k) {
        T t = this.f60900a.get(k);
        if (t != null) {
            return t;
        }
        return null;
    }

    /* renamed from: a */
    public final C23073b<K, V> mo60118a(K k, V v) {
        this.f60900a.put(k, v);
        return this;
    }
}
