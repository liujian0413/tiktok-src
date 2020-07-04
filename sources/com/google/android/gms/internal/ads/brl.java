package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class brl {

    /* renamed from: a */
    private final Map<String, String> f43350a = new HashMap();

    /* renamed from: b */
    private Map<String, String> f43351b;

    /* renamed from: a */
    public final synchronized Map<String, String> mo41201a() {
        if (this.f43351b == null) {
            this.f43351b = Collections.unmodifiableMap(new HashMap(this.f43350a));
        }
        return this.f43351b;
    }
}
