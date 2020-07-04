package com.google.android.gms.internal.ads;

import java.util.Map.Entry;

final class ayg<K> implements Entry<K, Object> {

    /* renamed from: a */
    private Entry<K, aye> f41222a;

    private ayg(Entry<K, aye> entry) {
        this.f41222a = entry;
    }

    public final K getKey() {
        return this.f41222a.getKey();
    }

    public final Object getValue() {
        if (((aye) this.f41222a.getValue()) == null) {
            return null;
        }
        return aye.m47758a();
    }

    /* renamed from: a */
    public final aye mo40307a() {
        return (aye) this.f41222a.getValue();
    }

    public final Object setValue(Object obj) {
        if (obj instanceof aza) {
            return ((aye) this.f41222a.getValue()).mo40314a((aza) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
