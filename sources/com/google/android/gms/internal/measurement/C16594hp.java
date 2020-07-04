package com.google.android.gms.internal.measurement;

import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.hp */
final class C16594hp<K> implements Entry<K, Object> {

    /* renamed from: a */
    private Entry<K, C16591hm> f46429a;

    private C16594hp(Entry<K, C16591hm> entry) {
        this.f46429a = entry;
    }

    public final K getKey() {
        return this.f46429a.getKey();
    }

    public final Object getValue() {
        if (((C16591hm) this.f46429a.getValue()) == null) {
            return null;
        }
        return C16591hm.m54196a();
    }

    /* renamed from: a */
    public final C16591hm mo42953a() {
        return (C16591hm) this.f46429a.getValue();
    }

    public final Object setValue(Object obj) {
        if (obj instanceof C16615ij) {
            return ((C16591hm) this.f46429a.getValue()).mo42960a((C16615ij) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
