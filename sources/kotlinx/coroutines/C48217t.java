package kotlinx.coroutines;

import kotlin.jvm.internal.C7573i;

/* renamed from: kotlinx.coroutines.t */
public class C48217t {

    /* renamed from: a */
    public final Throwable f123124a;

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C48059ag.m149023b(this));
        sb.append('[');
        sb.append(this.f123124a);
        sb.append(']');
        return sb.toString();
    }

    public C48217t(Throwable th) {
        C7573i.m23587b(th, "cause");
        this.f123124a = th;
    }
}
