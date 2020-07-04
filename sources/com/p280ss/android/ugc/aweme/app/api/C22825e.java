package com.p280ss.android.ugc.aweme.app.api;

import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.frameworks.baselib.network.http.C10104a;
import com.bytedance.retrofit2.C12466b;
import com.bytedance.retrofit2.C12467c;
import com.bytedance.retrofit2.C12467c.C12468a;
import com.bytedance.retrofit2.C12516p;
import com.bytedance.retrofit2.C12534t;
import com.bytedance.retrofit2.p637a.C12461b;
import com.bytedance.retrofit2.p637a.C12464d;
import com.google.gson.internal.C6623b;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.utils.C43016ck;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.concurrent.CancellationException;

/* renamed from: com.ss.android.ugc.aweme.app.api.e */
public final class C22825e extends C12468a {

    /* renamed from: a */
    C22841m f60544a = C22841m.m75282a();

    /* renamed from: com.ss.android.ugc.aweme.app.api.e$a */
    static class C22826a implements C12467c<C1592h> {

        /* renamed from: a */
        private final C12467c<C1592h<C12534t>> f60545a;

        /* renamed from: a */
        public final Type mo30454a() {
            return this.f60545a.mo30454a();
        }

        C22826a(C12467c<C1592h<C12534t>> cVar) {
            this.f60545a = cVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public <R> C1592h<R> mo30453a(C12466b<R> bVar) {
            return ((C1592h) this.f60545a.mo30453a(bVar)).mo6875a((C1591g<TResult, TContinuationResult>) new C1591g<C12534t, R>() {
                public final R then(C1592h<C12534t> hVar) throws Exception {
                    if (hVar.mo6887c()) {
                        throw new CancellationException();
                    } else if (!hVar.mo6889d()) {
                        C12534t tVar = (C12534t) hVar.mo6890e();
                        C6866d dVar = ((C12534t) hVar.mo6890e()).f33302b;
                        if (dVar instanceof BaseResponse) {
                            BaseResponse baseResponse = (BaseResponse) dVar;
                            if (tVar.f33301a != null) {
                                C43016ck.m136524a(baseResponse.status_code, tVar.f33301a.f33118a, baseResponse.toString());
                            }
                        }
                        if (dVar instanceof C22832g) {
                            C12464d dVar2 = tVar.f33301a;
                            if (dVar2 != null) {
                                Object obj = dVar2.f33123f;
                                if (obj instanceof C10104a) {
                                    ((C22832g) dVar).setRequestInfo((C10104a) obj);
                                }
                            }
                        }
                        if (dVar instanceof C6866d) {
                            dVar.setRequestId(C22826a.m75262a(tVar.mo30511b()));
                        }
                        return dVar;
                    } else {
                        throw hVar.mo6891f();
                    }
                }
            });
        }

        /* renamed from: a */
        static String m75262a(List<C12461b> list) {
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
    public static C22825e m75260a() {
        return new C22825e();
    }

    /* renamed from: a */
    public final C12467c<?> mo30455a(Type type, Annotation[] annotationArr, C12516p pVar) {
        if (m36282a(type) != C1592h.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type a = m36283a(0, (ParameterizedType) type);
            Class<C12534t> a2 = m36282a(a);
            if (C6866d.class.isAssignableFrom(a2)) {
                C12467c a3 = this.f60544a.mo30455a(C6623b.m20540a((Type) null, (Type) C1592h.class, C6623b.m20540a((Type) null, (Type) C12534t.class, a)), annotationArr, pVar);
                if (a3 != null) {
                    return new C22826a(a3);
                }
            }
            if (a2 != C12534t.class) {
                return this.f60544a.mo30455a(type, annotationArr, pVar);
            }
            throw new IllegalStateException("Response return type is not supported because TikTok can not resolve Response type.");
        }
        StringBuilder sb = new StringBuilder("Task return type must be parameterized as Task<Foo> or Task<? extends Foo> but returnType is ");
        sb.append(type.getTypeName());
        throw new IllegalStateException(sb.toString());
    }
}
