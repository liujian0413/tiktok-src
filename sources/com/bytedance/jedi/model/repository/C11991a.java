package com.bytedance.jedi.model.repository;

import com.bytedance.jedi.model.p601c.C11785d;
import com.bytedance.jedi.model.p603e.C11801a;
import com.bytedance.jedi.model.p604f.C11821c;
import com.bytedance.jedi.model.p604f.C11823e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C48006q;

/* renamed from: com.bytedance.jedi.model.repository.a */
public interface C11991a {

    /* renamed from: com.bytedance.jedi.model.repository.a$a */
    public static final class C11992a {

        /* renamed from: com.bytedance.jedi.model.repository.a$a$a */
        static final class C11993a extends Lambda implements C48006q<K, V, V1, V1> {

            /* renamed from: a */
            public static final C11993a f31891a = new C11993a();

            C11993a() {
                super(3);
            }

            /* JADX WARNING: Incorrect type for immutable var: ssa=V, code=java.lang.Object, for r2v0, types: [V, java.lang.Object] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final V1 invoke(K r1, java.lang.Object r2, V1 r3) {
                /*
                    r0 = this;
                    boolean r1 = r2 instanceof java.lang.Object
                    if (r1 != 0) goto L_0x0005
                    r2 = 0
                L_0x0005:
                    if (r2 != 0) goto L_0x0008
                    r2 = r3
                L_0x0008:
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jedi.model.repository.C11991a.C11992a.C11993a.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }

        /* renamed from: a */
        public static <K, V, K1, V1> C11821c m35060a(C11991a aVar, C11785d<K, V> dVar, C11785d<K1, V1> dVar2, C11801a<K, V, K1, V1> aVar2) {
            C7573i.m23587b(dVar, "from");
            C7573i.m23587b(dVar2, "to");
            C7573i.m23587b(aVar2, "mergeStrategy");
            return new C11823e(dVar, dVar2, aVar2).mo29373a();
        }
    }

    /* renamed from: a */
    <K, V, K1, V1> C11821c mo29602a(C11785d<K, V> dVar, C11785d<K1, V1> dVar2, C11801a<K, V, K1, V1> aVar);
}
