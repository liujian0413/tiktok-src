package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.if */
final class C16611if implements C16610ie {
    C16611if() {
    }

    /* renamed from: a */
    public final Map<?, ?> mo42981a(Object obj) {
        return (zzvp) obj;
    }

    /* renamed from: f */
    public final C16609id<?, ?> mo42986f(Object obj) {
        throw new NoSuchMethodError();
    }

    /* renamed from: b */
    public final Map<?, ?> mo42982b(Object obj) {
        return (zzvp) obj;
    }

    /* renamed from: c */
    public final boolean mo42983c(Object obj) {
        return !((zzvp) obj).isMutable();
    }

    /* renamed from: d */
    public final Object mo42984d(Object obj) {
        ((zzvp) obj).zzsw();
        return obj;
    }

    /* renamed from: e */
    public final Object mo42985e(Object obj) {
        return zzvp.zzxg().zzxh();
    }

    /* renamed from: a */
    public final Object mo42980a(Object obj, Object obj2) {
        zzvp zzvp = (zzvp) obj;
        zzvp zzvp2 = (zzvp) obj2;
        if (!zzvp2.isEmpty()) {
            if (!zzvp.isMutable()) {
                zzvp = zzvp.zzxh();
            }
            zzvp.zza(zzvp2);
        }
        return zzvp;
    }

    /* renamed from: a */
    public final int mo42979a(int i, Object obj, Object obj2) {
        zzvp zzvp = (zzvp) obj;
        if (zzvp.isEmpty()) {
            return 0;
        }
        Iterator it = zzvp.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Entry entry = (Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }
}
