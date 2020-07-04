package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

final class ayw implements ayv {
    ayw() {
    }

    /* renamed from: a */
    public final Map<?, ?> mo40334a(Object obj) {
        return (zzcer) obj;
    }

    /* renamed from: f */
    public final ayu<?, ?> mo40339f(Object obj) {
        throw new NoSuchMethodError();
    }

    /* renamed from: b */
    public final Map<?, ?> mo40335b(Object obj) {
        return (zzcer) obj;
    }

    /* renamed from: c */
    public final boolean mo40336c(Object obj) {
        return !((zzcer) obj).isMutable();
    }

    /* renamed from: d */
    public final Object mo40337d(Object obj) {
        ((zzcer) obj).zzara();
        return obj;
    }

    /* renamed from: e */
    public final Object mo40338e(Object obj) {
        return zzcer.zzauk().zzaul();
    }

    /* renamed from: a */
    public final Object mo40333a(Object obj, Object obj2) {
        zzcer zzcer = (zzcer) obj;
        zzcer zzcer2 = (zzcer) obj2;
        if (!zzcer2.isEmpty()) {
            if (!zzcer.isMutable()) {
                zzcer = zzcer.zzaul();
            }
            zzcer.zza(zzcer2);
        }
        return zzcer;
    }

    /* renamed from: a */
    public final int mo40332a(int i, Object obj, Object obj2) {
        zzcer zzcer = (zzcer) obj;
        if (zzcer.isEmpty()) {
            return 0;
        }
        Iterator it = zzcer.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Entry entry = (Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }
}
