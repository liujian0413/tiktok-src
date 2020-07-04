package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.jg */
final class C16639jg extends C16645jm {

    /* renamed from: a */
    private final /* synthetic */ C16636jd f46508a;

    private C16639jg(C16636jd jdVar) {
        this.f46508a = jdVar;
        super(jdVar, null);
    }

    public final Iterator<Entry<K, V>> iterator() {
        return new C16638jf(this.f46508a, null);
    }

    /* synthetic */ C16639jg(C16636jd jdVar, C16637je jeVar) {
        this(jdVar);
    }
}
