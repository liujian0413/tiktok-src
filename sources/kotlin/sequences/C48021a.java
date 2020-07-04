package kotlin.sequences;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C7573i;

/* renamed from: kotlin.sequences.a */
public final class C48021a<T> implements C7604g<T> {

    /* renamed from: a */
    private final AtomicReference<C7604g<T>> f122847a;

    /* renamed from: a */
    public final Iterator<T> mo19416a() {
        C7604g gVar = (C7604g) this.f122847a.getAndSet(null);
        if (gVar != null) {
            return gVar.mo19416a();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }

    public C48021a(C7604g<? extends T> gVar) {
        C7573i.m23587b(gVar, "sequence");
        this.f122847a = new AtomicReference<>(gVar);
    }
}
