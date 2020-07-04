package com.google.android.gms.internal.ads;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

final class avx {

    /* renamed from: a */
    private final ConcurrentHashMap<avy, List<Throwable>> f41117a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b */
    private final ReferenceQueue<Throwable> f41118b = new ReferenceQueue<>();

    avx() {
    }

    /* renamed from: a */
    public final List<Throwable> mo40076a(Throwable th, boolean z) {
        Reference poll = this.f41118b.poll();
        while (poll != null) {
            this.f41117a.remove(poll);
            poll = this.f41118b.poll();
        }
        return (List) this.f41117a.get(new avy(th, null));
    }
}
