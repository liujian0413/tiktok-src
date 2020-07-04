package shark;

import java.io.Serializable;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

public abstract class Leak implements Serializable {
    private Leak() {
    }

    /* access modifiers changed from: protected */
    public abstract String createGroupHash();

    public abstract String getClassName();

    public abstract LeakTrace getLeakTrace();

    public abstract Integer getRetainedHeapByteSize();

    public final String getGroupHash() {
        return createGroupHash();
    }

    public final String getClassSimpleName() {
        int b = C7634n.m23757b((CharSequence) getClassName(), '.', C7634n.m23780f(getClassName()), false);
        if (b == -1) {
            return getClassName();
        }
        String className = getClassName();
        int i = b + 1;
        if (className != null) {
            String substring = className.substring(i);
            C7573i.m23582a((Object) substring, "(this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    public /* synthetic */ Leak(C7571f fVar) {
        this();
    }
}
