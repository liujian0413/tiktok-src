package com.bytedance.retrofit2;

import com.bytedance.retrofit2.C12467c.C12468a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* renamed from: com.bytedance.retrofit2.g */
final class C12477g extends C12468a {

    /* renamed from: a */
    static final C12468a f33130a = new C12477g();

    C12477g() {
    }

    /* renamed from: a */
    public final C12467c<?> mo30455a(Type type, Annotation[] annotationArr, C12516p pVar) {
        if (m36282a(type) != C12466b.class) {
            return null;
        }
        final Type e = C12536v.m36446e(type);
        return new C12467c<C12466b<?>>() {
            /* renamed from: b */
            private static <R> C12466b<R> m36307b(C12466b<R> bVar) {
                return bVar;
            }

            /* renamed from: a */
            public final Type mo30454a() {
                return e;
            }

            /* renamed from: a */
            public final /* synthetic */ Object mo30453a(C12466b bVar) {
                return m36307b(bVar);
            }
        };
    }
}
