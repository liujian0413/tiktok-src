package kotlin.collections;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.p358a.C7565a;

/* renamed from: kotlin.collections.y */
final class C47912y implements Serializable, Map, C7565a {

    /* renamed from: a */
    public static final C47912y f122769a = new C47912y();
    private static final long serialVersionUID = 8246714829545688274L;

    private C47912y() {
    }

    /* renamed from: a */
    private static boolean m148855a(Void voidR) {
        C7573i.m23587b(voidR, "value");
        return false;
    }

    private final Object readResolve() {
        return f122769a;
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean containsKey(Object obj) {
        return false;
    }

    public final /* bridge */ Object get(Object obj) {
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    public final boolean isEmpty() {
        return true;
    }

    public final /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return 0;
    }

    public final String toString() {
        return "{}";
    }

    /* renamed from: a */
    private static Set<Entry> m148854a() {
        return EmptySet.INSTANCE;
    }

    /* renamed from: b */
    private static Set<Object> m148856b() {
        return EmptySet.INSTANCE;
    }

    /* renamed from: c */
    private static Collection m148857c() {
        return EmptyList.INSTANCE;
    }

    public final Set<Entry> entrySet() {
        return m148854a();
    }

    public final Set<Object> keySet() {
        return m148856b();
    }

    public final Collection values() {
        return m148857c();
    }

    public final boolean containsValue(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        return m148855a((Void) obj);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Map) || !((Map) obj).isEmpty()) {
            return false;
        }
        return true;
    }
}
