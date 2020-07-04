package com.bytedance.jedi.ext.adapter;

import android.arch.lifecycle.C0040g;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0065w.C0067b;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.jedi.ext.adapter.g */
public final class C11714g {

    /* renamed from: a */
    public static final C11715a f31470a = new C11715a(null);

    /* renamed from: b */
    private final C0067b f31471b;

    /* renamed from: c */
    private final C0040g f31472c;

    /* renamed from: com.bytedance.jedi.ext.adapter.g$a */
    public static final class C11715a {
        private C11715a() {
        }

        public /* synthetic */ C11715a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static C11714g m34329a(C0067b bVar, C0040g gVar) {
            C7573i.m23587b(bVar, "factory");
            C7573i.m23587b(gVar, "store");
            return new C11714g(bVar, gVar);
        }
    }

    public C11714g(C0067b bVar, C0040g gVar) {
        C7573i.m23587b(bVar, "factory");
        C7573i.m23587b(gVar, "store");
        this.f31471b = bVar;
        this.f31472c = gVar;
    }

    /* renamed from: a */
    public final <VM extends C0063u> VM mo29268a(String str, Class<VM> cls) {
        VM a;
        C7573i.m23587b(str, "key");
        C7573i.m23587b(cls, "clazz");
        VM a2 = this.f31472c.mo113a(str);
        if (!cls.isInstance(a2)) {
            synchronized (cls) {
                a = this.f31471b.mo149a(cls);
            }
            C0040g gVar = this.f31472c;
            C7573i.m23582a((Object) a, "it");
            gVar.mo115a(str, a);
            C7573i.m23582a((Object) a, "synchronized(clazz) {\n  …so { store.put(key, it) }");
            return a;
        } else if (a2 != null) {
            return a2;
        } else {
            throw new TypeCastException("null cannot be cast to non-null type VM");
        }
    }
}
