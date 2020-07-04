package com.p280ss.android.ugc.aweme.app.api;

import bolts.C1592h;
import bolts.C1606i;
import com.bytedance.retrofit2.C12466b;
import com.bytedance.retrofit2.C12467c;
import com.bytedance.retrofit2.C12467c.C12468a;
import com.bytedance.retrofit2.C12474e;
import com.bytedance.retrofit2.C12516p;
import com.bytedance.retrofit2.C12534t;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: com.ss.android.ugc.aweme.app.api.m */
public final class C22841m extends C12468a {

    /* renamed from: com.ss.android.ugc.aweme.app.api.m$a */
    static final class C22842a implements C12467c<C1592h> {

        /* renamed from: a */
        private final Type f60568a;

        /* renamed from: a */
        public final Type mo30454a() {
            return this.f60568a;
        }

        C22842a(Type type) {
            this.f60568a = type;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public <R> C1592h<R> mo30453a(C12466b<R> bVar) {
            final C1606i iVar = new C1606i();
            bVar.enqueue(new C12474e<R>() {
                /* renamed from: a */
                public final void mo26463a(C12466b<R> bVar, C12534t<R> tVar) {
                    if (tVar.mo30512c()) {
                        iVar.mo6903b(tVar.f33302b);
                    } else {
                        iVar.mo6902b((Exception) new RuntimeException("HttpException"));
                    }
                }

                /* renamed from: a */
                public final void mo26464a(C12466b<R> bVar, Throwable th) {
                    if (th instanceof Exception) {
                        iVar.mo6902b((Exception) th);
                    } else {
                        iVar.mo6902b((Exception) new RuntimeException(th));
                    }
                }
            });
            return iVar.f6010a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.api.m$b */
    static final class C22844b implements C12467c<C1592h<C12534t>> {

        /* renamed from: a */
        private final Type f60571a;

        /* renamed from: a */
        public final Type mo30454a() {
            return this.f60571a;
        }

        C22844b(Type type) {
            this.f60571a = type;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public <R> C1592h<C12534t> mo30453a(C12466b<R> bVar) {
            final C1606i iVar = new C1606i();
            bVar.enqueue(new C12474e<R>() {
                /* renamed from: a */
                public final void mo26463a(C12466b<R> bVar, C12534t<R> tVar) {
                    if (tVar.mo30512c()) {
                        iVar.mo6903b(tVar);
                    } else {
                        iVar.mo6902b((Exception) new RuntimeException("HttpException"));
                    }
                }

                /* renamed from: a */
                public final void mo26464a(C12466b<R> bVar, Throwable th) {
                    if (th instanceof Exception) {
                        iVar.mo6902b((Exception) th);
                    } else {
                        iVar.mo6902b((Exception) new RuntimeException(th));
                    }
                }
            });
            return iVar.f6010a;
        }
    }

    private C22841m() {
    }

    /* renamed from: a */
    public static C22841m m75282a() {
        return new C22841m();
    }

    /* renamed from: a */
    public final C12467c<?> mo30455a(Type type, Annotation[] annotationArr, C12516p pVar) {
        if (m36282a(type) != C1592h.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type a = m36283a(0, (ParameterizedType) type);
            if (m36282a(a) != C12534t.class) {
                return new C22842a(a);
            }
            if (a instanceof ParameterizedType) {
                return new C22844b(m36283a(0, (ParameterizedType) a));
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("Task return type must be parameterized as Task<Foo> or Task<? extends Foo>");
    }
}
