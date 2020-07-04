package com.facebook.imagepipeline.memory;

import com.facebook.common.references.C13328b;
import java.util.LinkedList;

/* renamed from: com.facebook.imagepipeline.memory.z */
final class C13833z<V> extends C13808e<V> {

    /* renamed from: e */
    private LinkedList<C13328b<V>> f36684e = new LinkedList<>();

    /* renamed from: d */
    public final V mo33439d() {
        C13328b bVar = (C13328b) this.f36652c.poll();
        V a = bVar.mo32617a();
        bVar.mo32619b();
        this.f36684e.add(bVar);
        return a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo33437b(V v) {
        C13328b bVar = (C13328b) this.f36684e.poll();
        if (bVar == null) {
            bVar = new C13328b();
        }
        bVar.mo32618a(v);
        this.f36652c.add(bVar);
    }

    public C13833z(int i, int i2, int i3) {
        super(i, i2, 0, false);
    }
}
