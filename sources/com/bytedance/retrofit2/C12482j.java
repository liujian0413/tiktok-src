package com.bytedance.retrofit2;

import com.bytedance.retrofit2.C12467c.C12468a;
import com.bytedance.retrofit2.p637a.C12462c;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* renamed from: com.bytedance.retrofit2.j */
final class C12482j extends C12468a {

    /* renamed from: a */
    final Executor f33135a;

    /* renamed from: com.bytedance.retrofit2.j$a */
    static final class C12484a<T> implements C12466b<T>, C12489l {

        /* renamed from: a */
        final Executor f33138a;

        /* renamed from: b */
        final C12466b<T> f33139b;

        public final void cancel() {
            this.f33139b.cancel();
        }

        public final C12534t execute() throws Exception {
            return this.f33139b.execute();
        }

        public final boolean isCanceled() {
            return this.f33139b.isCanceled();
        }

        public final C12462c request() {
            return this.f33139b.request();
        }

        public final C12466b<T> clone() {
            return new C12484a(this.f33138a, this.f33139b.clone());
        }

        public final void doCollect() {
            if (this.f33139b instanceof C12489l) {
                ((C12489l) this.f33139b).doCollect();
            }
        }

        public final void enqueue(final C12474e<T> eVar) {
            if (eVar != null) {
                this.f33139b.enqueue(new C12488k<T>() {
                    /* renamed from: a */
                    public final void mo26463a(C12466b<T> bVar, final C12534t<T> tVar) {
                        C12484a.this.f33138a.execute(new Runnable() {
                            public final void run() {
                                if (C12484a.this.f33139b.isCanceled()) {
                                    eVar.mo26464a((C12466b<T>) C12484a.this, (Throwable) new IOException("Canceled"));
                                } else {
                                    eVar.mo26463a((C12466b<T>) C12484a.this, tVar);
                                }
                            }
                        });
                    }

                    /* renamed from: b */
                    public final void mo30461b(C12466b<T> bVar, C12534t<T> tVar) {
                        if (eVar instanceof C12488k) {
                            ((C12488k) eVar).mo30461b(bVar, tVar);
                        }
                    }

                    /* renamed from: a */
                    public final void mo26464a(C12466b<T> bVar, final Throwable th) {
                        C12484a.this.f33138a.execute(new Runnable() {
                            public final void run() {
                                eVar.mo26464a((C12466b<T>) C12484a.this, th);
                            }
                        });
                    }
                });
                return;
            }
            throw new NullPointerException("callback == null");
        }

        C12484a(Executor executor, C12466b<T> bVar) {
            this.f33138a = executor;
            this.f33139b = bVar;
        }
    }

    C12482j(Executor executor) {
        this.f33135a = executor;
    }

    /* renamed from: a */
    public final C12467c<C12466b<?>> mo30455a(Type type, Annotation[] annotationArr, C12516p pVar) {
        if (m36282a(type) != C12466b.class) {
            return null;
        }
        final Type e = C12536v.m36446e(type);
        return new C12467c<C12466b<?>>() {
            /* renamed from: a */
            public final Type mo30454a() {
                return e;
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public <R> C12466b<R> mo30453a(C12466b<R> bVar) {
                return new C12484a(C12482j.this.f33135a, bVar);
            }
        };
    }
}
