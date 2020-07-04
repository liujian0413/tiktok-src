package com.p280ss.android.ugc.aweme.app.api;

import com.bytedance.frameworks.baselib.network.http.C10104a;
import com.bytedance.retrofit2.C12466b;
import com.bytedance.retrofit2.C12467c;
import com.bytedance.retrofit2.C12467c.C12468a;
import com.bytedance.retrofit2.C12516p;
import com.bytedance.retrofit2.C12534t;
import com.bytedance.retrofit2.p637a.C12461b;
import com.bytedance.retrofit2.p637a.C12464d;
import com.google.common.util.concurrent.C18225b;
import com.google.common.util.concurrent.C18245g;
import com.google.common.util.concurrent.C18246h;
import com.google.common.util.concurrent.C18253l;
import com.google.gson.internal.C6623b;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.utils.C43016ck;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.app.api.f */
public final class C22828f extends C12468a {

    /* renamed from: a */
    C22846n f60547a = C22846n.m75294a();

    /* renamed from: com.ss.android.ugc.aweme.app.api.f$a */
    static class C22829a implements C12467c<C18253l> {

        /* renamed from: a */
        private final C12467c<C18253l<C12534t>> f60548a;

        /* renamed from: a */
        public final Type mo30454a() {
            return this.f60548a.mo30454a();
        }

        C22829a(C12467c<C18253l<C12534t>> cVar) {
            this.f60548a = cVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public <R> C18253l<R> mo30453a(C12466b<R> bVar) {
            final C18253l lVar = (C18253l) this.f60548a.mo30453a(bVar);
            return new C18225b<R>() {
                {
                    C18246h.m60213a(lVar, new C18245g<C12534t>() {
                        public final void onFailure(Throwable th) {
                            C228301.this.mo47087a(th);
                        }

                        /* access modifiers changed from: private */
                        /* renamed from: a */
                        public void onSuccess(C12534t tVar) {
                            if (tVar.mo30512c()) {
                                T t = tVar.f33302b;
                                if (t instanceof C6866d) {
                                    ((C6866d) t).setRequestId(C22829a.m75268a(tVar.mo30511b()));
                                }
                                if (t instanceof C22832g) {
                                    C12464d dVar = tVar.f33301a;
                                    if (dVar != null) {
                                        Object obj = dVar.f33123f;
                                        if (obj instanceof C10104a) {
                                            ((C22832g) t).setRequestInfo((C10104a) obj);
                                        }
                                    }
                                }
                                if (t instanceof BaseResponse) {
                                    BaseResponse baseResponse = (BaseResponse) t;
                                    if (tVar.f33301a != null) {
                                        C43016ck.m136524a(baseResponse.status_code, tVar.f33301a.f33118a, baseResponse.toString());
                                    }
                                }
                                C228301.this.mo47088b(t);
                                return;
                            }
                            C228301.this.mo47087a((Throwable) new RuntimeException("HttpException"));
                        }
                    });
                }
            };
        }

        /* renamed from: a */
        static String m75268a(List<C12461b> list) {
            if (list == null) {
                return null;
            }
            for (C12461b bVar : list) {
                if ("X-TT-LOGID".equalsIgnoreCase(bVar.f33095a)) {
                    return bVar.f33096b;
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    public static C22828f m75266a() {
        return new C22828f();
    }

    /* renamed from: a */
    public final C12467c<?> mo30455a(Type type, Annotation[] annotationArr, C12516p pVar) {
        if (m36282a(type) != C18253l.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type a = m36283a(0, (ParameterizedType) type);
            Class<C12534t> a2 = m36282a(a);
            if (C6866d.class.isAssignableFrom(a2)) {
                C12467c a3 = this.f60547a.mo30455a(C6623b.m20540a((Type) null, (Type) C18253l.class, C6623b.m20540a((Type) null, (Type) C12534t.class, a)), annotationArr, pVar);
                if (a3 != null) {
                    return new C22829a(a3);
                }
            }
            if (a2 != C12534t.class) {
                return this.f60547a.mo30455a(type, annotationArr, pVar);
            }
            throw new IllegalStateException("Response return type is not supported because TikTok can not resolve Response type.");
        }
        throw new IllegalStateException("ListenableFuture return type must be parameterized as ListenableFuture<Foo> or ListenableFuture<? extends Foo>");
    }
}
