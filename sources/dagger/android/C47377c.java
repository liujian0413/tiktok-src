package dagger.android;

import dagger.android.C7313b.C7315b;
import dagger.p1859a.C47373d;
import java.util.Map;
import javax.p1876a.C47883a;

/* renamed from: dagger.android.c */
public final class C47377c<T> implements C47373d<DispatchingAndroidInjector<T>> {

    /* renamed from: a */
    private final C47883a<Map<Class<?>, C47883a<C7315b<?>>>> f121589a;

    /* renamed from: b */
    private final C47883a<Map<String, C47883a<C7315b<?>>>> f121590b;

    /* renamed from: c */
    private final C47883a<Map<Class<? extends T>, C47883a<C7315b<? extends T>>>> f121591c;

    /* renamed from: d */
    private final C47883a<Map<String, C47883a<C7315b<? extends T>>>> f121592d;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public DispatchingAndroidInjector<T> get() {
        return m147945a(this.f121589a, this.f121590b, this.f121591c, this.f121592d);
    }

    /* renamed from: a */
    public static <T> DispatchingAndroidInjector<T> m147944a(Map<Class<?>, C47883a<C7315b<?>>> map, Map<String, C47883a<C7315b<?>>> map2, Map<Class<? extends T>, C47883a<C7315b<? extends T>>> map3, Map<String, C47883a<C7315b<? extends T>>> map4) {
        return new DispatchingAndroidInjector<>(map, map2, map3, map4);
    }

    /* renamed from: a */
    private static <T> DispatchingAndroidInjector<T> m147945a(C47883a<Map<Class<?>, C47883a<C7315b<?>>>> aVar, C47883a<Map<String, C47883a<C7315b<?>>>> aVar2, C47883a<Map<Class<? extends T>, C47883a<C7315b<? extends T>>>> aVar3, C47883a<Map<String, C47883a<C7315b<? extends T>>>> aVar4) {
        return new DispatchingAndroidInjector<>((Map) aVar.get(), (Map) aVar2.get(), (Map) aVar3.get(), (Map) aVar4.get());
    }
}
