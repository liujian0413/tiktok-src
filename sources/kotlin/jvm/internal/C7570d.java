package kotlin.jvm.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.C7560a;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.reflect.C7584c;

/* renamed from: kotlin.jvm.internal.d */
public final class C7570d implements C7569c, C7584c<Object> {

    /* renamed from: a */
    private final Class<?> f20889a;

    /* renamed from: a */
    public final Class<?> mo19478a() {
        return this.f20889a;
    }

    /* renamed from: b */
    private static Void m23574b() {
        throw new KotlinReflectionNotSupportedError();
    }

    public final List<Annotation> getAnnotations() {
        m23574b();
        throw null;
    }

    public final int hashCode() {
        return C7560a.m23572b(this).hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo19478a().toString());
        sb.append(" (Kotlin reflection is not available)");
        return sb.toString();
    }

    public C7570d(Class<?> cls) {
        C7573i.m23587b(cls, "jClass");
        this.f20889a = cls;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7570d) || !C7573i.m23585a((Object) C7560a.m23572b(this), (Object) C7560a.m23572b((C7584c) obj))) {
            return false;
        }
        return true;
    }
}
