package com.google.android.gms.internal.p762d;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.d.d */
final class C16364d {

    /* renamed from: a */
    private final ConcurrentHashMap<C16365e, List<Throwable>> f45847a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b */
    private final ReferenceQueue<Throwable> f45848b = new ReferenceQueue<>();

    C16364d() {
    }

    /* renamed from: a */
    public final List<Throwable> mo42454a(Throwable th, boolean z) {
        Reference poll = this.f45848b.poll();
        while (poll != null) {
            this.f45847a.remove(poll);
            poll = this.f45848b.poll();
        }
        List<Throwable> list = (List) this.f45847a.get(new C16365e(th, null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> list2 = (List) this.f45847a.putIfAbsent(new C16365e(th, this.f45848b), vector);
        return list2 == null ? vector : list2;
    }
}
