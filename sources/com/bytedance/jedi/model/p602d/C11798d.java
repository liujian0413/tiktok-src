package com.bytedance.jedi.model.p602d;

import com.bytedance.jedi.model.p601c.C11783b;
import com.bytedance.jedi.model.p601c.C11785d;
import com.bytedance.jedi.model.p605g.C11849c;
import com.bytedance.jedi.model.p605g.C11851e;
import com.bytedance.jedi.model.p605g.C11851e.C11852a;
import java.util.LinkedHashSet;
import kotlin.C7579l;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.jedi.model.d.d */
public final class C11798d {

    /* renamed from: com.bytedance.jedi.model.d.d$a */
    static final class C11799a<T> implements C7326g<RESP> {

        /* renamed from: a */
        final /* synthetic */ C11790b f31591a;

        /* renamed from: b */
        final /* synthetic */ Object f31592b;

        C11799a(C11790b bVar, Object obj) {
            this.f31591a = bVar;
            this.f31592b = obj;
        }

        public final void accept(RESP resp) {
            Object a = this.f31591a.mo29351a(this.f31592b, resp);
            if (a != null) {
                C11785d a2 = C11783b.m34516a(this.f31591a);
                if (!(a2 instanceof C11849c)) {
                    a2 = null;
                }
                C11849c cVar = (C11849c) a2;
                if (cVar != null) {
                    cVar.mo29346b(C11852a.m34630a(C7579l.m23633a(this.f31591a.mo29352b(this.f31592b), a), new C11851e(C7579l.m23633a(this.f31591a.mo29352b(this.f31592b), a), new LinkedHashSet(), null)));
                }
            }
        }
    }

    /* renamed from: a */
    public static final <K, V, REQ, RESP> C7492s<RESP> m34549a(C11790b<K, V, REQ, RESP> bVar, REQ req, C7492s<RESP> sVar) {
        C7573i.m23587b(bVar, "$this$fire");
        C7573i.m23587b(sVar, "observable");
        C7492s<RESP> d = sVar.mo19316d((C7326g<? super T>) new C11799a<Object>(bVar, req));
        C7573i.m23582a((Object) d, "observable.doOnNext {\n  …q) to v))\n        }\n    }");
        return d;
    }
}
