package shark;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;

/* renamed from: shark.d */
public final class C48731d {

    /* renamed from: a */
    private final Map<String, Object> f123861a = new LinkedHashMap();

    /* renamed from: a */
    public final <T> void mo123466a(String str, T t) {
        C7573i.m23587b(str, "key");
        Map<String, Object> map = this.f123861a;
        if (t != null) {
            map.put(str, t);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Any");
    }

    /* renamed from: a */
    public final <T> T mo123465a(String str, C7561a<? extends T> aVar) {
        C7573i.m23587b(str, "key");
        C7573i.m23587b(aVar, "defaultValue");
        Map<String, Object> map = this.f123861a;
        T t = map.get(str);
        if (t != null) {
            return t;
        }
        T invoke = aVar.invoke();
        if (invoke != null) {
            map.put(str, invoke);
            return invoke;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Any");
    }
}
