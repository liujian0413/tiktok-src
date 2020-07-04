package com.twitter.sdk.android.core.models;

import java.util.Collections;
import java.util.Map;

/* renamed from: com.twitter.sdk.android.core.models.c */
public class C46946c {

    /* renamed from: a */
    private final Map<String, Object> f120381a;

    public C46946c() {
        this(Collections.EMPTY_MAP);
    }

    public C46946c(Map<String, Object> map) {
        this.f120381a = Collections.unmodifiableMap(map);
    }

    /* renamed from: a */
    public final <T> T mo118088a(String str) {
        try {
            return this.f120381a.get(str);
        } catch (ClassCastException unused) {
            return null;
        }
    }
}
