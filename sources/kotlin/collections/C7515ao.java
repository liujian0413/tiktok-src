package kotlin.collections;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.C7573i;

/* renamed from: kotlin.collections.ao */
public class C7515ao extends C7514an {
    /* renamed from: a */
    public static final <T> Set<T> m23408a() {
        return EmptySet.INSTANCE;
    }

    /* renamed from: a */
    public static final <T> Set<T> m23410a(T... tArr) {
        C7573i.m23587b(tArr, "elements");
        if (tArr.length > 0) {
            return C7519g.m23451f((Object[]) tArr);
        }
        return C7513am.m23408a();
    }

    /* renamed from: b */
    public static final <T> LinkedHashSet<T> m23411b(T... tArr) {
        C7573i.m23587b(tArr, "elements");
        return (LinkedHashSet) C7519g.m23437b((Object[]) tArr, (Collection) new LinkedHashSet(C7507ae.m23386a(tArr.length)));
    }

    /* renamed from: a */
    public static final <T> Set<T> m23409a(Set<? extends T> set) {
        C7573i.m23587b(set, "$this$optimizeReadOnlySet");
        switch (set.size()) {
            case 0:
                return C7513am.m23408a();
            case 1:
                return C7513am.m23407a(set.iterator().next());
            default:
                return set;
        }
    }
}
