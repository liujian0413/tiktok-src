package com.p280ss.android.ugc.aweme.app.api;

import com.bytedance.retrofit2.C12466b;
import com.bytedance.retrofit2.C12467c;
import com.bytedance.retrofit2.C12467c.C12468a;
import com.bytedance.retrofit2.C12474e;
import com.bytedance.retrofit2.C12516p;
import com.bytedance.retrofit2.C12534t;
import com.google.common.util.concurrent.C18225b;
import com.google.common.util.concurrent.C18253l;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: com.ss.android.ugc.aweme.app.api.n */
public final class C22846n extends C12468a {

    /* renamed from: com.ss.android.ugc.aweme.app.api.n$a */
    static final class C22847a implements C12467c<C18253l> {

        /* renamed from: a */
        private final Type f60574a;

        /* renamed from: a */
        public final Type mo30454a() {
            return this.f60574a;
        }

        C22847a(Type type) {
            this.f60574a = type;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public <R> C18253l<R> mo30453a(final C12466b<R> bVar) {
            return new C18225b<R>() {
                /* renamed from: c */
                public final void mo47089c() {
                    bVar.cancel();
                }

                {
                    bVar.enqueue(new C12474e<R>() {
                        /* renamed from: a */
                        public final void mo26464a(C12466b<R> bVar, Throwable th) {
                            C228481.this.mo47087a(th);
                        }

                        /* renamed from: a */
                        public final void mo26463a(C12466b<R> bVar, C12534t<R> tVar) {
                            if (tVar.mo30512c()) {
                                C228481.this.mo47088b(tVar.f33302b);
                            } else {
                                C228481.this.mo47087a((Throwable) new RuntimeException("HttpException"));
                            }
                        }
                    });
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.api.n$b */
    static final class C22850b implements C12467c<C18253l<C12534t>> {

        /* renamed from: a */
        private final Type f60578a;

        /* renamed from: a */
        public final Type mo30454a() {
            return this.f60578a;
        }

        C22850b(Type type) {
            this.f60578a = type;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public <R> C18253l<C12534t> mo30453a(final C12466b<R> bVar) {
            return new C18225b<C12534t>() {
                /* renamed from: c */
                public final void mo47089c() {
                    bVar.cancel();
                }

                {
                    bVar.enqueue(new C12474e<R>() {
                        /* renamed from: a */
                        public final void mo26463a(C12466b<R> bVar, C12534t<R> tVar) {
                            C228511.this.mo47088b(tVar);
                        }

                        /* renamed from: a */
                        public final void mo26464a(C12466b<R> bVar, Throwable th) {
                            C228511.this.mo47087a(th);
                        }
                    });
                }
            };
        }
    }

    private C22846n() {
    }

    /* renamed from: a */
    public static C22846n m75294a() {
        return new C22846n();
    }

    /* renamed from: a */
    public final C12467c<?> mo30455a(Type type, Annotation[] annotationArr, C12516p pVar) {
        if (m36282a(type) != C18253l.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type a = m36283a(0, (ParameterizedType) type);
            if (m36282a(a) != C12534t.class) {
                return new C22847a(a);
            }
            if (a instanceof ParameterizedType) {
                return new C22850b(m36283a(0, (ParameterizedType) a));
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("ListenableFuture return type must be parameterized as ListenableFuture<Foo> or ListenableFuture<? extends Foo>");
    }
}
