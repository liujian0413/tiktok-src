package kotlinx.coroutines.internal;

import kotlin.jvm.internal.C7573i;

/* renamed from: kotlinx.coroutines.internal.r */
final class C48174r {

    /* renamed from: a */
    public final C48163j f123033a;

    public final String toString() {
        StringBuilder sb = new StringBuilder("Removed[");
        sb.append(this.f123033a);
        sb.append(']');
        return sb.toString();
    }

    public C48174r(C48163j jVar) {
        C7573i.m23587b(jVar, "ref");
        this.f123033a = jVar;
    }
}
