package kotlinx.coroutines;

import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlinx.coroutines.internal.C48161h;
import kotlinx.coroutines.internal.C48163j;

/* renamed from: kotlinx.coroutines.bt */
public final class C48117bt extends C48161h implements C48095bd {
    /* renamed from: b */
    public final boolean mo120293b() {
        return true;
    }

    public final C48117bt cd_() {
        return this;
    }

    public final String toString() {
        return mo120354a("Active");
    }

    /* renamed from: a */
    public final String mo120354a(String str) {
        C7573i.m23587b(str, "state");
        StringBuilder sb = new StringBuilder();
        sb.append("List{");
        sb.append(str);
        sb.append("}[");
        Object e = mo120378e();
        if (e != null) {
            boolean z = true;
            for (C48163j jVar = (C48163j) e; !C7573i.m23585a((Object) jVar, (Object) this); jVar = jVar.mo120379f()) {
                if (jVar instanceof C48107bn) {
                    C48107bn bnVar = (C48107bn) jVar;
                    if (z) {
                        z = false;
                    } else {
                        sb.append(", ");
                    }
                    sb.append(bnVar);
                }
            }
            sb.append("]");
            String sb2 = sb.toString();
            C7573i.m23582a((Object) sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }
}
