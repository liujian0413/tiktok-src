package com.google.android.play.core.internal;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.play.core.internal.am */
final class C6517am {

    /* renamed from: a */
    private final ConcurrentHashMap<C6516al, List<Throwable>> f18827a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b */
    private final ReferenceQueue<Throwable> f18828b = new ReferenceQueue<>();

    C6517am() {
    }

    /* renamed from: a */
    public final List<Throwable> mo15884a(Throwable th, boolean z) {
        while (true) {
            Reference poll = this.f18828b.poll();
            if (poll == null) {
                break;
            }
            this.f18827a.remove(poll);
        }
        List<Throwable> list = (List) this.f18827a.get(new C6516al(th, null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> list2 = (List) this.f18827a.putIfAbsent(new C6516al(th, this.f18828b), vector);
        return list2 == null ? vector : list2;
    }
}
