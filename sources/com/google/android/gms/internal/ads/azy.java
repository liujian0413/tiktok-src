package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map.Entry;

final class azy extends baf {

    /* renamed from: a */
    private final /* synthetic */ azv f41296a;

    private azy(azv azv) {
        this.f41296a = azv;
        super(azv, null);
    }

    public final Iterator<Entry<K, V>> iterator() {
        return new azx(this.f41296a, null);
    }

    /* synthetic */ azy(azv azv, azw azw) {
        this(azv);
    }
}
