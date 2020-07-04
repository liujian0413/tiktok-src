package com.p280ss.android.ugc.aweme.p313im.sdk.p1312b;

import bolts.C1592h;
import bolts.C1606i;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import retrofit2.C48475b;
import retrofit2.C48476c;
import retrofit2.C48476c.C48477a;
import retrofit2.C48478d;
import retrofit2.C48516l;
import retrofit2.C48517m;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.b.a */
public final class C30589a extends C48477a {

    /* renamed from: a */
    private Executor f80318a;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.b.a$a */
    static class C30590a<R> implements C48476c<R, C1592h<R>> {

        /* renamed from: a */
        private Executor f80319a;

        /* renamed from: b */
        private final Type f80320b;

        /* renamed from: a */
        public final Type mo80367a() {
            return this.f80320b;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C1592h<R> mo80366a(final C48475b<R> bVar) {
            final C1606i iVar = new C1606i();
            if (this.f80319a != null) {
                this.f80319a.execute(new Runnable() {
                    public final void run() {
                        try {
                            C30590a.m99909a(bVar.mo123282a(), iVar);
                        } catch (IOException e) {
                            iVar.mo6902b((Exception) e);
                        }
                    }
                });
            } else {
                bVar.mo123283a(new C48478d<R>() {
                    /* renamed from: a */
                    public final void mo48915a(C48475b<R> bVar, C48516l<R> lVar) {
                        C30590a.m99909a(lVar, iVar);
                    }

                    /* renamed from: a */
                    public final void mo48914a(C48475b<R> bVar, Throwable th) {
                        iVar.mo6902b(new Exception(th));
                    }
                });
            }
            return iVar.f6010a;
        }

        C30590a(Executor executor, Type type) {
            this.f80319a = executor;
            this.f80320b = type;
        }

        /* renamed from: a */
        public static void m99909a(C48516l<R> lVar, C1606i<R> iVar) {
            try {
                if (lVar.mo123310d()) {
                    iVar.mo6903b(lVar.f123664b);
                } else {
                    iVar.mo6902b((Exception) new IOException("HttpException"));
                }
            } catch (CancellationException unused) {
                iVar.mo6901b();
            } catch (Exception e) {
                iVar.mo6902b(e);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.b.a$b */
    static class C30593b<R> implements C48476c<R, C1592h<C48516l<R>>> {

        /* renamed from: a */
        private final Executor f80326a;

        /* renamed from: b */
        private final Type f80327b;

        /* renamed from: a */
        public final Type mo80367a() {
            return this.f80327b;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C1592h<C48516l<R>> mo80366a(final C48475b<R> bVar) {
            final C1606i iVar = new C1606i();
            if (this.f80326a != null) {
                this.f80326a.execute(new Runnable() {
                    public final void run() {
                        try {
                            C30593b.m99915a(bVar.mo123282a(), iVar);
                        } catch (IOException e) {
                            iVar.mo6902b((Exception) e);
                        }
                    }
                });
            } else {
                bVar.mo123283a(new C48478d<R>() {
                    /* renamed from: a */
                    public final void mo48915a(C48475b<R> bVar, C48516l<R> lVar) {
                        C30593b.m99915a(lVar, iVar);
                    }

                    /* renamed from: a */
                    public final void mo48914a(C48475b<R> bVar, Throwable th) {
                        iVar.mo6902b(new Exception(th));
                    }
                });
            }
            return iVar.f6010a;
        }

        C30593b(Executor executor, Type type) {
            this.f80326a = executor;
            this.f80327b = type;
        }

        /* renamed from: a */
        public static void m99915a(C48516l<R> lVar, C1606i<C48516l<R>> iVar) {
            try {
                iVar.mo6903b(lVar);
            } catch (CancellationException unused) {
                iVar.mo6901b();
            } catch (Exception e) {
                iVar.mo6902b(e);
            }
        }
    }

    private C30589a(Executor executor) {
        this.f80318a = executor;
    }

    /* renamed from: a */
    public static C30589a m99907a(Executor executor) {
        if (executor != null) {
            return new C30589a(executor);
        }
        throw new NullPointerException("executor == null");
    }

    /* renamed from: a */
    public final C48476c<?, ?> mo80365a(Type type, Annotation[] annotationArr, C48517m mVar) {
        if (m150187a(type) != C1592h.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type a = m150188a(0, (ParameterizedType) type);
            if (m150187a(a) != C48516l.class) {
                return new C30590a(this.f80318a, a);
            }
            if (a instanceof ParameterizedType) {
                return new C30593b(this.f80318a, m150188a(0, (ParameterizedType) a));
            }
            throw new IllegalArgumentException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalArgumentException("Task return type must be parameterized as Task<Foo> or Task<? extends Foo>");
    }
}
