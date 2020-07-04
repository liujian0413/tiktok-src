package kotlin.jvm.internal;

/* renamed from: kotlin.jvm.internal.k */
public final class C7574k implements C7569c {

    /* renamed from: a */
    private final Class<?> f20890a;

    /* renamed from: b */
    private final String f20891b;

    /* renamed from: a */
    public final Class<?> mo19478a() {
        return this.f20890a;
    }

    public final int hashCode() {
        return mo19478a().hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo19478a().toString());
        sb.append(" (Kotlin reflection is not available)");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7574k) || !C7573i.m23585a((Object) mo19478a(), (Object) ((C7574k) obj).mo19478a())) {
            return false;
        }
        return true;
    }

    public C7574k(Class<?> cls, String str) {
        C7573i.m23587b(cls, "jClass");
        C7573i.m23587b(str, "moduleName");
        this.f20890a = cls;
        this.f20891b = str;
    }
}
