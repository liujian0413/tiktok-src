package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public final class bfx<T> {

    /* renamed from: a */
    private final Map<String, AtomicReference<T>> f41866a = new HashMap();

    /* renamed from: a */
    public final AtomicReference<T> mo40586a(String str) {
        synchronized (this) {
            if (!this.f41866a.containsKey(str)) {
                this.f41866a.put(str, new AtomicReference());
            }
        }
        return (AtomicReference) this.f41866a.get(str);
    }
}
