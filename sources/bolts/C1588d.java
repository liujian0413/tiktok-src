package bolts;

import com.C1642a;
import java.util.Locale;

/* renamed from: bolts.d */
public final class C1588d {

    /* renamed from: a */
    private final C1590f f5946a;

    /* renamed from: a */
    public final boolean mo6864a() {
        return this.f5946a.mo6869a();
    }

    public final String toString() {
        return C1642a.m8035a(Locale.US, "%s@%s[cancellationRequested=%s]", new Object[]{getClass().getName(), Integer.toHexString(hashCode()), Boolean.toString(this.f5946a.mo6869a())});
    }

    C1588d(C1590f fVar) {
        this.f5946a = fVar;
    }
}
