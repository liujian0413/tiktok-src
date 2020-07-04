package com.bytedance.widget.ext.list;

import android.arch.lifecycle.C0038f;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0065w.C0067b;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.widget.ext.list.b */
public final class C13039b {

    /* renamed from: a */
    public static final C13040a f34493a = new C13040a(null);

    /* renamed from: b */
    private final C0067b f34494b;

    /* renamed from: c */
    private final C0038f f34495c;

    /* renamed from: com.bytedance.widget.ext.list.b$a */
    public static final class C13040a {
        private C13040a() {
        }

        public /* synthetic */ C13040a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static C13039b m38054a(C0067b bVar, C0038f fVar) {
            C7573i.m23587b(bVar, "factory");
            C7573i.m23587b(fVar, "store");
            return new C13039b(bVar, fVar);
        }
    }

    public C13039b(C0067b bVar, C0038f fVar) {
        C7573i.m23587b(bVar, "factory");
        C7573i.m23587b(fVar, "store");
        this.f34494b = bVar;
        this.f34495c = fVar;
    }

    /* renamed from: a */
    public final <VM extends C0063u> VM mo31611a(String str, Class<VM> cls) {
        C7573i.m23587b(str, "key");
        C7573i.m23587b(cls, "clazz");
        VM a = this.f34495c.mo109a(str);
        if (!cls.isInstance(a)) {
            VM a2 = this.f34494b.mo149a(cls);
            C0038f fVar = this.f34495c;
            C7573i.m23582a((Object) a2, "it");
            fVar.mo111a(str, a2);
            C7573i.m23582a((Object) a2, "factory.create<VM>(clazz…re.put(key, it)\n        }");
            return a2;
        } else if (a != null) {
            return a;
        } else {
            throw new TypeCastException("null cannot be cast to non-null type VM");
        }
    }
}
