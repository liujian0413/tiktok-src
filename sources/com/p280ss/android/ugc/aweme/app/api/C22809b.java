package com.p280ss.android.ugc.aweme.app.api;

import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.retrofit2.C12466b;
import com.bytedance.retrofit2.C12467c;
import com.bytedance.retrofit2.C12467c.C12468a;
import com.bytedance.retrofit2.C12516p;
import com.google.common.util.concurrent.C18245g;
import com.google.common.util.concurrent.C18246h;
import com.google.common.util.concurrent.C18253l;
import com.google.common.util.concurrent.C18254m;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.utils.C43010ce;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.concurrent.CancellationException;

/* renamed from: com.ss.android.ugc.aweme.app.api.b */
public final class C22809b extends C12468a {

    /* renamed from: com.ss.android.ugc.aweme.app.api.b$a */
    static class C22810a implements C12467c {

        /* renamed from: a */
        C12467c<?> f60528a;

        /* renamed from: a */
        public final Type mo30454a() {
            return this.f60528a.mo30454a();
        }

        C22810a(C12467c<?> cVar) {
            this.f60528a = cVar;
        }

        /* renamed from: a */
        public final Object mo30453a(final C12466b bVar) {
            return ((C1592h) this.f60528a.mo30453a(bVar)).mo6875a((C1591g<TResult, TContinuationResult>) new C1591g() {
                public final Object then(C1592h hVar) throws Exception {
                    if (hVar.mo6889d()) {
                        Exception f = hVar.mo6891f();
                        C43010ce.m136511a((Throwable) f, bVar.request().f33098b, "");
                        if (f instanceof ApiServerException) {
                            bVar.request();
                        }
                        throw f;
                    } else if (!hVar.mo6887c()) {
                        return hVar.mo6890e();
                    } else {
                        throw new CancellationException();
                    }
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.api.b$b */
    static class C22812b implements C12467c {

        /* renamed from: a */
        C12467c<?> f60531a;

        /* renamed from: a */
        public final Type mo30454a() {
            return this.f60531a.mo30454a();
        }

        C22812b(C12467c<?> cVar) {
            this.f60531a = cVar;
        }

        /* renamed from: a */
        public final Object mo30453a(final C12466b bVar) {
            C18253l lVar = (C18253l) this.f60531a.mo30453a(bVar);
            C18246h.m60214a(lVar, (C18245g<? super V>) new C18245g() {
                public final void onSuccess(Object obj) {
                }

                public final void onFailure(Throwable th) {
                    C43010ce.m136511a(th, bVar.request().f33098b, "");
                    if (th instanceof ApiServerException) {
                        bVar.request();
                    }
                }
            }, C18254m.m60217a());
            return lVar;
        }
    }

    /* renamed from: a */
    public static C22809b m75234a() {
        return new C22809b();
    }

    /* renamed from: a */
    public final C12467c<?> mo30455a(Type type, Annotation[] annotationArr, C12516p pVar) {
        Class<C1592h> a = m36282a(type);
        if (a != C18253l.class && a != C1592h.class) {
            return null;
        }
        C12467c a2 = pVar.mo30488a((C12468a) this, type, annotationArr);
        if (a == C18253l.class) {
            return new C22812b(a2);
        }
        if (a == C1592h.class) {
            return new C22810a(a2);
        }
        throw new AssertionError();
    }
}
