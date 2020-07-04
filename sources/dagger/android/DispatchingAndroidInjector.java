package dagger.android;

import com.C1642a;
import dagger.android.C7313b.C7315b;
import dagger.p1859a.C47370a;
import dagger.p1859a.C47375f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import javax.p1876a.C47883a;

public final class DispatchingAndroidInjector<T> implements C7313b<T> {

    /* renamed from: a */
    private final Map<String, C47883a<C7315b<?>>> f20392a;

    public static final class InvalidInjectorBindingException extends RuntimeException {
        InvalidInjectorBindingException(String str, ClassCastException classCastException) {
            super(str, classCastException);
        }
    }

    /* renamed from: a */
    public final void mo19116a(T t) {
        if (!m22907b(t)) {
            throw new IllegalArgumentException(m22908c(t));
        }
    }

    /* renamed from: b */
    private boolean m22907b(T t) {
        C47883a aVar = (C47883a) this.f20392a.get(t.getClass().getName());
        if (aVar == null) {
            return false;
        }
        C7315b bVar = (C7315b) aVar.get();
        try {
            ((C7313b) C47375f.m147941a(bVar.mo19118a(t), "%s.create(I) should not return null.", bVar.getClass())).mo19116a(t);
            return true;
        } catch (ClassCastException e) {
            throw new InvalidInjectorBindingException(C1642a.m8034a("%s does not implement AndroidInjector.Factory<%s>", new Object[]{bVar.getClass().getCanonicalName(), t.getClass().getCanonicalName()}), e);
        }
    }

    /* renamed from: c */
    private String m22908c(T t) {
        ArrayList arrayList = new ArrayList();
        for (Class cls = t.getClass(); cls != null; cls = cls.getSuperclass()) {
            if (this.f20392a.containsKey(cls.getCanonicalName())) {
                arrayList.add(cls.getCanonicalName());
            }
        }
        if (arrayList.isEmpty()) {
            return C1642a.m8034a("No injector factory bound for Class<%s>", new Object[]{t.getClass().getCanonicalName()});
        }
        return C1642a.m8034a("No injector factory bound for Class<%1$s>. Injector factories were bound for supertypes of %1$s: %2$s. Did you mean to bind an injector factory for the subtype?", new Object[]{t.getClass().getCanonicalName(), arrayList});
    }

    /* renamed from: b */
    private static <K, V> Map<K, V> m22906b(Map<K, V> map, Map<K, V> map2) {
        if (map.isEmpty()) {
            return map2;
        }
        if (map2.isEmpty()) {
            return map;
        }
        LinkedHashMap a = C47370a.m147933a(map.size() + map2.size());
        a.putAll(map);
        a.putAll(map2);
        return a;
    }

    /* renamed from: a */
    private static <C, V> Map<String, C47883a<C7315b<?>>> m22905a(Map<Class<? extends C>, V> map, Map<String, V> map2) {
        if (map.isEmpty()) {
            return map2;
        }
        LinkedHashMap a = C47370a.m147933a(map.size() + map2.size());
        a.putAll(map2);
        for (Entry entry : map.entrySet()) {
            a.put(((Class) entry.getKey()).getName(), entry.getValue());
        }
        return Collections.unmodifiableMap(a);
    }

    DispatchingAndroidInjector(Map<Class<?>, C47883a<C7315b<?>>> map, Map<String, C47883a<C7315b<?>>> map2, Map<Class<? extends T>, C47883a<C7315b<? extends T>>> map3, Map<String, C47883a<C7315b<? extends T>>> map4) {
        this.f20392a = m22906b(m22905a(map, map2), m22905a(map3, map4));
    }
}
