package com.bytedance.android.live.core.p145a;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

/* renamed from: com.bytedance.android.live.core.a.d */
final class C3148d<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: a */
    private final int f9702a;

    public C3148d(int i) {
        super(i, 0.75f, true);
        this.f9702a = i;
    }

    /* access modifiers changed from: protected */
    public final boolean removeEldestEntry(Entry entry) {
        if (size() > this.f9702a) {
            return true;
        }
        return false;
    }
}
