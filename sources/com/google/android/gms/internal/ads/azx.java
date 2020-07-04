package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

final class azx implements Iterator<Entry<K, V>> {

    /* renamed from: a */
    private int f41293a;

    /* renamed from: b */
    private Iterator<Entry<K, V>> f41294b;

    /* renamed from: c */
    private final /* synthetic */ azv f41295c;

    private azx(azv azv) {
        this.f41295c = azv;
        this.f41293a = this.f41295c.f41288c.size();
    }

    public final boolean hasNext() {
        return (this.f41293a > 0 && this.f41293a <= this.f41295c.f41288c.size()) || m48051a().hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    private final Iterator<Entry<K, V>> m48051a() {
        if (this.f41294b == null) {
            this.f41294b = this.f41295c.f41291f.entrySet().iterator();
        }
        return this.f41294b;
    }

    public final /* synthetic */ Object next() {
        if (m48051a().hasNext()) {
            return (Entry) m48051a().next();
        }
        List b = this.f41295c.f41288c;
        int i = this.f41293a - 1;
        this.f41293a = i;
        return (Entry) b.get(i);
    }

    /* synthetic */ azx(azv azv, azw azw) {
        this(azv);
    }
}
