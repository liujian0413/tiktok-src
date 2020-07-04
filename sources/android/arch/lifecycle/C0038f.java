package android.arch.lifecycle;

import java.util.Collection;
import java.util.HashMap;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: android.arch.lifecycle.f */
public final class C0038f {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f70a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C0038f.class), "viewModels", "getViewModels()Ljava/util/HashMap;"))};

    /* renamed from: b */
    private final C7541d f71b = C7546e.m23569a(C0039a.f72a);

    /* renamed from: android.arch.lifecycle.f$a */
    static final class C0039a extends Lambda implements C7561a<HashMap<String, C0063u>> {

        /* renamed from: a */
        public static final C0039a f72a = new C0039a();

        C0039a() {
            super(0);
        }

        /* renamed from: a */
        private static HashMap<String, C0063u> m89a() {
            return new HashMap<>();
        }

        public final /* synthetic */ Object invoke() {
            return m89a();
        }
    }

    /* renamed from: b */
    private final HashMap<String, C0063u> m85b() {
        return (HashMap) this.f71b.getValue();
    }

    /* renamed from: a */
    public final void mo110a() {
        Collection<C0063u> values = m85b().values();
        C7573i.m23582a((Object) values, "viewModels.values");
        for (C0063u onCleared : values) {
            onCleared.onCleared();
        }
        m85b().clear();
    }

    /* renamed from: a */
    public final C0063u mo109a(String str) {
        C7573i.m23587b(str, "key");
        return (C0063u) m85b().get(str);
    }

    /* renamed from: a */
    public final void mo111a(String str, C0063u uVar) {
        C7573i.m23587b(str, "key");
        C7573i.m23587b(uVar, "viewModel");
        C0063u uVar2 = (C0063u) m85b().put(str, uVar);
        if (uVar2 != null) {
            uVar2.onCleared();
        }
    }
}
