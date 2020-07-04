package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import retrofit2.C48476c.C48477a;

/* renamed from: retrofit2.f */
final class C48481f extends C48477a {

    /* renamed from: a */
    static final C48477a f123595a = new C48481f();

    C48481f() {
    }

    /* renamed from: a */
    public final C48476c<?, ?> mo80365a(Type type, Annotation[] annotationArr, C48517m mVar) {
        if (m150187a(type) != C48475b.class) {
            return null;
        }
        final Type e = C48522o.m150320e(type);
        return new C48476c<Object, C48475b<?>>() {
            /* renamed from: b */
            private static C48475b<Object> m150196b(C48475b<Object> bVar) {
                return bVar;
            }

            /* renamed from: a */
            public final Type mo80367a() {
                return e;
            }

            /* renamed from: a */
            public final /* synthetic */ Object mo80366a(C48475b bVar) {
                return m150196b(bVar);
            }
        };
    }
}
