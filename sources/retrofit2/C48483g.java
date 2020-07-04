package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import retrofit2.C48476c.C48477a;

/* renamed from: retrofit2.g */
final class C48483g extends C48477a {

    /* renamed from: a */
    final Executor f123598a;

    /* renamed from: retrofit2.g$a */
    static final class C48485a<T> implements C48475b<T> {

        /* renamed from: a */
        final Executor f123601a;

        /* renamed from: b */
        final C48475b<T> f123602b;

        /* renamed from: a */
        public final C48516l<T> mo123282a() throws IOException {
            return this.f123602b.mo123282a();
        }

        /* renamed from: b */
        public final boolean mo123284b() {
            return this.f123602b.mo123284b();
        }

        /* renamed from: c */
        public final C48475b<T> clone() {
            return new C48485a(this.f123601a, this.f123602b.mo123285c());
        }

        /* renamed from: a */
        public final void mo123283a(final C48478d<T> dVar) {
            C48522o.m150306a(dVar, "callback == null");
            this.f123602b.mo123283a(new C48478d<T>() {
                /* renamed from: a */
                public final void mo48914a(C48475b<T> bVar, final Throwable th) {
                    C48485a.this.f123601a.execute(new Runnable() {
                        public final void run() {
                            dVar.mo48914a((C48475b<T>) C48485a.this, th);
                        }
                    });
                }

                /* renamed from: a */
                public final void mo48915a(C48475b<T> bVar, final C48516l<T> lVar) {
                    C48485a.this.f123601a.execute(new Runnable() {
                        public final void run() {
                            if (C48485a.this.f123602b.mo123284b()) {
                                dVar.mo48914a((C48475b<T>) C48485a.this, (Throwable) new IOException("Canceled"));
                            } else {
                                dVar.mo48915a((C48475b<T>) C48485a.this, lVar);
                            }
                        }
                    });
                }
            });
        }

        C48485a(Executor executor, C48475b<T> bVar) {
            this.f123601a = executor;
            this.f123602b = bVar;
        }
    }

    C48483g(Executor executor) {
        this.f123598a = executor;
    }

    /* renamed from: a */
    public final C48476c<?, ?> mo80365a(Type type, Annotation[] annotationArr, C48517m mVar) {
        if (m150187a(type) != C48475b.class) {
            return null;
        }
        final Type e = C48522o.m150320e(type);
        return new C48476c<Object, C48475b<?>>() {
            /* renamed from: a */
            public final Type mo80367a() {
                return e;
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public C48475b<Object> mo80366a(C48475b<Object> bVar) {
                return new C48485a(C48483g.this.f123598a, bVar);
            }
        };
    }
}
