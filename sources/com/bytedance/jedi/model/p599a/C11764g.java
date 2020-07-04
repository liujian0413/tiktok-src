package com.bytedance.jedi.model.p599a;

import com.bytedance.jedi.model.p605g.C11847a;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.jedi.model.a.g */
public final class C11764g {

    /* renamed from: a */
    public static final C11764g f31555a = new C11764g();

    /* renamed from: b */
    private static final WeakHashMap<C11847a<?>, AtomicBoolean> f31556b = new WeakHashMap<>();

    private C11764g() {
    }

    /* renamed from: b */
    public final void mo29348b(C11847a<?> aVar) {
        C7573i.m23587b(aVar, "$this$unlock");
        m34488c(aVar).set(false);
    }

    /* renamed from: c */
    private static AtomicBoolean m34488c(C11847a<?> aVar) {
        AtomicBoolean atomicBoolean = (AtomicBoolean) f31556b.get(aVar);
        if (atomicBoolean == null) {
            atomicBoolean = new AtomicBoolean(false);
            f31556b.put(aVar, atomicBoolean);
        }
        C7573i.m23582a((Object) atomicBoolean, "_map[this] ?: AtomicBool….also { _map[this] = it }");
        return atomicBoolean;
    }

    /* renamed from: a */
    public final void mo29347a(C11847a<?> aVar) {
        C7573i.m23587b(aVar, "$this$lock");
        do {
        } while (!m34488c(aVar).compareAndSet(false, true));
    }
}
