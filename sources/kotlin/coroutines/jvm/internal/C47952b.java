package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.C47919b;
import kotlin.coroutines.C47924e;

/* renamed from: kotlin.coroutines.jvm.internal.b */
public final class C47952b implements C47919b<Object> {

    /* renamed from: a */
    public static final C47952b f122786a = new C47952b();

    private C47952b() {
    }

    public final String toString() {
        return "This continuation is already complete";
    }

    public final C47924e getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public final void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }
}
