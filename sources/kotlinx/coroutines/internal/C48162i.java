package kotlinx.coroutines.internal;

import kotlin.jvm.internal.C7573i;

/* renamed from: kotlinx.coroutines.internal.i */
public final class C48162i {

    /* renamed from: a */
    public static final Object f123010a = new C48178v("REMOVE_PREPARED");

    /* renamed from: b */
    private static final Object f123011b = new C48178v("CONDITION_FALSE");

    /* renamed from: c */
    private static final Object f123012c = new C48178v("ALREADY_REMOVED");

    /* renamed from: d */
    private static final Object f123013d = new C48178v("LIST_EMPTY");

    /* renamed from: a */
    public static final Object m149410a() {
        return f123011b;
    }

    /* renamed from: a */
    public static final C48163j m149411a(Object obj) {
        Object obj2;
        C7573i.m23587b(obj, "receiver$0");
        if (!(obj instanceof C48174r)) {
            obj2 = null;
        } else {
            obj2 = obj;
        }
        C48174r rVar = (C48174r) obj2;
        if (rVar != null) {
            C48163j jVar = rVar.f123033a;
            if (jVar != null) {
                return jVar;
            }
        }
        return (C48163j) obj;
    }
}
