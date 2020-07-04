package kotlinx.coroutines.sync;

import kotlin.jvm.internal.C7573i;

/* renamed from: kotlinx.coroutines.sync.a */
final class C48214a {

    /* renamed from: a */
    public final Object f123115a;

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty[");
        sb.append(this.f123115a);
        sb.append(']');
        return sb.toString();
    }

    public C48214a(Object obj) {
        C7573i.m23587b(obj, "locked");
        this.f123115a = obj;
    }
}
